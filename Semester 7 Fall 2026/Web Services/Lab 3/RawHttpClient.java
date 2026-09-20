import java.io.*;
import java.net.*;

public class RawHttpClient {
    public static void main(String[] args) {
        String host = "example.com";
        int port = 80;

        try(Socket socket= new Socket(host, port)){
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            out.print("GET / HTTP/1.1\r\n");
            out.print("Host: " + host + "\r\n");
            out.print("Connection: close\r\n");
            out.print("\r\n");
            out.flush();
            
            String line;
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
