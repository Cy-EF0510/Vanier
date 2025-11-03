import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class TextEditor {
    private StringBuilder text;
    private Deque<String> undoStack;
    private Deque<String> redoStack;
    private Map<String, String> versions;

    public TextEditor(){
        text = new StringBuilder();
        undoStack = new ArrayDeque<>();
        redoStack = new ArrayDeque<>();
        versions = new HashMap<>();
    }

    public void type(String newText){
        //Push the current state (text.toString()) onto the undoStack
        undoStack.push(text.toString());
        //Append newText to the StringBuilder
        text.append(newText);
        //Clear the redoStack
        redoStack.clear();
    }

    public void undo(){
        //Undoing an action moves a state from the undoStack to the redoStack
        redoStack.push(text.toString()); //not sure if this is how its supposed to implemented
        text = new StringBuilder();
        text.append(undoStack.pop());
        
    }

    public void redo(){
        //Redoing an action moves a state moves back from the redoStack to the undoStack
        undoStack.push(text.toString());
        text = new StringBuilder();
        text.append(redoStack.pop());        
        
    }

    public void saveVersion(String name){
        //Puts the current text (text.toString()) into the versions map with name as the key
        versions.put(name, text.toString());
    }

    public void loadVersion(String name){
        //Find the saved text in the versions map
        //If it exists, push the current text state onto the undoStack before making a change
        if(versions.containsKey(name)){
            undoStack.push(text.toString());
            //Replace the current text with the loaded version
            text = new StringBuilder();
            text.append(versions.get(name));
            //Clear the redoStack, as loading a version starts a new history branch
            redoStack.clear();
        }
        else{
            System.err.println("Error");
        }
    }

    public String getText(){
        //Getter that returns text.toString()
        return text.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello ");
        editor.type("World"); 
        System.out.println(editor.getText());
        editor.saveVersion("v1");
        editor.type(" from Java!"); System.out.println(editor.getText());
        editor.undo(); System.out.println(editor.getText());
        editor.loadVersion("v1"); System.out.println(editor.getText());
        editor.undo(); System.out.println(editor.getText());
    }
}
