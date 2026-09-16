import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.*;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 5000;

        // 1. Create ServerSocket in a try-with-resources block
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // 2. Wait for a client to connect (this blocks)
            Socket clientSocket = serverSocket.accept();
            System.out.println("New client connected!");

            // 3. Extract the input stream to read data from the client
            InputStream input = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // 4. Read the message sent by the client
            String message = reader.readLine();
            System.out.println("Message from client: " + message);

            // 5. Clean up
            clientSocket.close();
            System.out.println("Server shut down.");
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}