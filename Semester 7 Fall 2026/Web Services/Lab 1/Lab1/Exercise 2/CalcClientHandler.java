import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CalcClientHandler implements Runnable{

    private Socket socket;
    public CalcClientHandler(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Welcome to the Math Server! Type 'quit' to exit");
            String text;
            while((text = in.readLine()) != null){
                if(text.equalsIgnoreCase("quit")){
                    System.out.println("Client disconnected.");
                    out.println("Disconnected from server");
                    socket.close();
                }
                else{
                    try {
                        String[] parts = text.split(" ");
                        double num1 = Double.parseDouble(parts[0]);
                        double num2 = Double.parseDouble(parts[2]);
                        String operator = parts[1];

                        double result;
                        switch (operator) {
                            case "+":
                                result = num1 + num2;
                                out.println(result);
                                break;
                            case "-":
                                result = num1 - num2;
                                out.println(result);
                                break;
                            case "*":
                                result = num1 * num2;
                                out.println(result);
                                break;
                            case "/":
                                result = num1 / num2;
                                out.println(result);
                                break;
                            case "%":
                                result = num1 % num2;
                                out.println(result);
                                break;
                            case "quit":
                                
                                break;
                            default:
                                out.println("Invalid ");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Format: " + e.getMessage());
                    }
                    
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
