import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ServiceLogger {
    private static ServiceLogger instance;
    private PrintWriter writer;

    private ServiceLogger() throws IOException{
        try {
            FileWriter fw = new FileWriter("E:\\Vanier\\Semester 5 fall 2025\\Programming Patterns\\Labs\\Lab7\\app_log.txt", true);
            //FileWriter fw = new FileWriter("app_log.txt", true); this also works
            
            this.writer = new PrintWriter(fw);
            System.out.println("--- LOGGER INTIALIZED ---");
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static synchronized ServiceLogger getInstance() throws IOException{
        if(instance == null){
            instance = new ServiceLogger();
        }

        return instance;
    }

    public void closeWriter(){
        writer.close();
    }
    
    public void log(String serviceName, String message){
        writer.println("[" + new java.util.Date() + "] [" + serviceName + "] " + message);
        writer.flush();
    }

    public static void main(String[] args) throws IOException {
        ServiceLogger userLogger = ServiceLogger.getInstance();
        userLogger.log("UserService", "User with userid:student1 logged in.");

        ServiceLogger productLogger = ServiceLogger.getInstance();
        productLogger.log("ProductService", "Product 'B-102' viewed.");

        System.out.println("Same logger instance: " + (userLogger == productLogger));
        userLogger.closeWriter();
    }


// 4. Observe the Results:
    // [Fri Oct 31 10:02:49 EDT 2025] [UserService] User with userid:student1 logged in.
    // [Fri Oct 31 10:02:49 EDT 2025] [ProductService] Product 'B-102' viewed.
}
