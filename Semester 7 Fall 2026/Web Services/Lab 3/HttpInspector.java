import java.io.*;
import java.net.*;

public class HttpInspector {
    public static void main(String[] args) {
        String host = "google.com";
        int port = 443;

        try(Socket socket= new Socket(host, port)){
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.print("GET / HTTP/1.1\r\n"); // Single backslash!
            out.print("Host: " + host + "\r\n");
            out.print("Connection: close\r\n");
            out.print("\r\n");
            out.flush();

            String statusLine = in.readLine();
            System.out.println("STATUS: " + statusLine);

            System.out.println("--- HEADERS ---");
            String headerLine;
            while ((headerLine = in.readLine()) != null && !headerLine.isEmpty()) {
                System.out.println(headerLine);
            }

            System.out.println("--- BODY ---");
            String bodyLine;
            while((bodyLine = in.readLine()) != null) {
                System.out.println(bodyLine);
            }
    
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}