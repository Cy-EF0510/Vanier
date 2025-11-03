import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextEditorGUI {
    // Our backend logic from Exercise 2
    private final TextEditor editor = new TextEditor();
    private JFrame frame;
    private JTextArea textArea;
    private JTextField inputField;
    private JTextField versionNameField;

    public TextEditorGUI() {
        // Frame and Main Panel Setup
        frame = new JFrame(" Simple Text Editor ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Text Area (Top)
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Controls Panel (Bottom)
        JPanel controlsPanel = new JPanel(new GridLayout(3, 1, 5, 5));

        // Typing controls
        JPanel typePanel = new JPanel(new BorderLayout(5, 0));
        inputField = new JTextField();
        JButton typeButton = new JButton("Append Text");
        typePanel.add(new JLabel("Text to Append: "), BorderLayout.WEST);
        typePanel.add(inputField, BorderLayout.CENTER);
        typePanel.add(typeButton, BorderLayout.EAST);

        // Undo / Redo controls
        JPanel undoRedoPanel = new JPanel(new FlowLayout());
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");
        undoRedoPanel.add(undoButton);
        undoRedoPanel.add(redoButton);

        // Versioning controls
        JPanel versionPanel = new JPanel(new BorderLayout(5, 0));
        versionNameField = new JTextField();
        JButton saveButton = new JButton(" Save Version ");
        JButton loadButton = new JButton(" Load Version ");
        versionPanel.add(new JLabel("Version Name: "), BorderLayout.WEST);
        versionPanel.add(versionNameField, BorderLayout.CENTER);
        JPanel versionButtons = new JPanel(new GridLayout(1, 2));
        versionButtons.add(saveButton);
        versionButtons.add(loadButton);
        versionPanel.add(versionButtons, BorderLayout.EAST);
        controlsPanel.add(typePanel);
        controlsPanel.add(undoRedoPanel);
        controlsPanel.add(versionPanel);
        frame.add(controlsPanel, BorderLayout.SOUTH);

        // Action Listeners
        typeButton.addActionListener(e -> {
            // TODO : Get text from inputField and call the editor’s type method.
            editor.type(inputField.getText());
            updateTextArea();
            inputField.setText("");
        });
        undoButton.addActionListener(e -> {
            // TODO : Call the editor’s undo method.
            editor.undo();
            updateTextArea();
        });
        redoButton.addActionListener(e -> {
            // TODO : Call the editor’s redo method.
            editor.redo();
            updateTextArea();
        });
        saveButton.addActionListener(e -> {
            // TODO : Get version name and call the editor’s saveVersion method.
            String name = versionNameField.getText();
            editor.saveVersion(name);
        });
        loadButton.addActionListener(e -> {
            // TODO : Get version name and call the editor’s loadVersion method.
            String name = versionNameField.getText();
            editor.loadVersion(name);
            updateTextArea();
        });
        // Finalize
        updateTextArea(); // Initial state
        frame.setLocationRelativeTo(null); // Center thewindow
        frame.setVisible(true);
    }

    private void updateTextArea() {
        textArea.setText(editor.getText());
    }

    public static void main(String[] args) {
        // Ensure the GUI is created on the Event Dispatch Thread
        SwingUtilities.invokeLater(TextEditorGUI::new);
    }
}
