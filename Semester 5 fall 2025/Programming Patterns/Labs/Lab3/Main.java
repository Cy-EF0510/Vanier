import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<Task> taskList = new LinkedList<>(); 
        // ArrayList<Task> taskList = new ArrayList<>();
        Stack<Character> characterStack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        Task task1 = new Task("Laundry", 4);
        Task task2 = new Task("Assignment", 2);
        Task task3 = new Task("Work", 1);
        Task task4 = new Task("Cook", 3);
        Task task5 = new Task("Shower", 5);

        //Add Tasks
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);
        taskList.forEach(System.out::println);
        System.out.println();

        //Add a High-Priority Task
        Task importantTask = new Task("Emergency", 0);
        taskList.addFirst(importantTask);
        taskList.forEach(System.out::println);
        System.out.println();

        //Update a Task
        taskList.get(2).setTaskName("Read Book");
        taskList.forEach(System.out::println);
        System.out.println();

        //Remove a Task
        taskList.remove(1);
        taskList.forEach(System.out::println);
        System.out.println();

        //Iterate and Display
        for(Task t : taskList){
            System.out.println(t.toString());
        }
        System.out.println("\n");


        //Exercise 2: Reversing a String
        System.out.println("Exercise 2");
        String string = "hello";
        char[] stringToChar = string.toCharArray();
        for(char c : stringToChar){
            characterStack.push(c);
        }
        characterStack.forEach(System.out::print);

        while(!characterStack.empty()){
            sb.append(characterStack.peek());
            characterStack.pop();
        }
        System.out.println();
        System.out.println(sb.toString());
        System.out.println("\n");


        //Exercise 3: Simulating a Printer Queue

    }
}
