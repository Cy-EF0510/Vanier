import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 9000)){
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            Scanner console = new Scanner(System.in);
            String userInput;
            System.out.println(in.readLine());
            do{
                System.out.println("Enter operation: ");
                userInput = console.nextLine();

                out.println(userInput);

                String response = in.readLine();
                System.out.println(response);
            } while(!userInput.equalsIgnoreCase("quit"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
