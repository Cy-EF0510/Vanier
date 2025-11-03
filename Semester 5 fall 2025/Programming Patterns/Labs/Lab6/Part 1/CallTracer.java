import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CallTracer {
    private Deque<String> callStack;
    private Map<String, Integer> callCounts;
    
    public CallTracer() {
        callStack = new ArrayDeque<>();
        callCounts = new HashMap<>();
    }

    public void enter(String methodName){
        //if we cannot find the thing we found in the callCounts hasmap, create an element with the stirng as the key
        if(!callCounts.containsKey(methodName)){
            callCounts.put(methodName, 1);
        }
        else if(callCounts.containsKey(methodName)){
            callCounts.put(methodName, callCounts.get(methodName).intValue() + 1);
        }
        System.out.println("\t".repeat(callStack.size()) + "Entering: " + methodName);
        callStack.push(methodName);
    }

    public void exit(String methodName){
        if(callStack == null || callStack.peek() != methodName){
            System.out.println("Error");
        }
        else{
            callStack.pop();
        }
        System.out.println("\t".repeat(callStack.size()) + "Exiting: " + methodName);
    }

    public void printSummary(){
        System.out.println();
        System.out.println("Call Summary :");
        for(Map.Entry<String, Integer> set : callCounts.entrySet()){
            System.out.println(set.getKey() + " was called " + set.getValue() + " time(s)");
        }
    }
    
    public static void main(String[] args) {
        CallTracer tracer = new CallTracer();
        tracer.enter("main") ;
        tracer.enter("methodA") ;
        tracer.enter("methodB") ;
        tracer.exit("methodB") ;
        tracer.enter("methodC") ;
        tracer.exit("methodC") ;
        tracer.exit("methodA") ;
        tracer.enter("methodA") ; // Call methodA again
        tracer.enter("methodB") ;
        tracer.exit("methodB") ;
        tracer.exit("methodA") ;
        tracer.exit("main");
        tracer.printSummary();
    }
}
