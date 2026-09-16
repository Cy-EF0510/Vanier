import java.io.*;
import java.net.*;

public class TemperatureServer {
    public static void main(String[] args) {
        int port = 8000;

        // ServerSocket
        try(ServerSocket serverSocket = new ServerSocket(port)){
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("[SERVER] Sensor");

                InputStream input = clientSocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                String message = reader.readLine();
                System.out.println("[SERVER] Received data: " + message);

                clientSocket.close();
            }
        } catch (IOException ex){
            System.out.println("Server exception" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
