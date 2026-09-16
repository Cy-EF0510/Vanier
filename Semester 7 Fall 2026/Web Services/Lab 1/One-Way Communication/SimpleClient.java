import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server IP (localhost means this computer)
        int port = 5000;
        // Must match the Server's port
        // 1. Connect to the server
        try (Socket socket = new Socket(hostname, port)) {
            // 2. Extract the output stream to send data to the server
            OutputStream output = socket.getOutputStream();
            // 'true' enables auto-flushing so data sends immediately
            PrintWriter writer = new PrintWriter(output, true);
            // 3. Send a message
            writer.println("Balls");
            System.out.println("Message sent to server.");
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}