import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
    public static void main(String[] args) {
        int port = 9000;
        try(ServerSocket serverSocket = new ServerSocket(port)){
            while(true){
                Socket socket = serverSocket.accept();

                CalcClientHandler handler = new CalcClientHandler(socket);
                new Thread(handler).start();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
