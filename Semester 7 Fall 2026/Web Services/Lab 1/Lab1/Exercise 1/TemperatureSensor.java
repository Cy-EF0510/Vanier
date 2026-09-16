import java.io.*;
import java.net.*;

public class TemperatureSensor {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8000;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            double min = 10.0;
            double max = 30.0;

            double random = min + Math.random() * (max - min);

            writer.println("Sensor-A1: " + random + "C");
            System.out.println("[SENSOR] Data transmitted successfully");
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
