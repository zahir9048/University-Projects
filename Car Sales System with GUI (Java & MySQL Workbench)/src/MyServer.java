
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;

public class MyServer {
    public static void main(String[] args) {

        
        boolean run = true;
        while(run){ //runs forever (zahir's logic)
        try{
            
            String question="",answer="";
            System.out.println("Server Side Program");
            System.out.println("Establishing the connection with client...");
            ServerSocket server = new ServerSocket(4512);
            java.net.Socket client = server.accept();
            System.out.println("Connection Established.");
        
            DataInputStream din = new DataInputStream(client.getInputStream());  
            DataOutputStream dout = new DataOutputStream(client.getOutputStream());  
            
            question = din.readUTF();
            System.out.println(question);
        
        switch(question){
            case "Most sold car of 2021?":
                answer = "Toyota Yaris";
                System.out.println(answer);
                dout.writeUTF(answer); 
                dout.flush();
            break;
                
            case "Where is our company located?":
                answer = "Defence Block 6, Karachi";
                System.out.println(answer);
                dout.writeUTF(answer); 
                dout.flush();
            break;
            
            case "Work hours of our company?":
                answer = "Monday-Friday: 9 AM - 6 PM";
                System.out.println(answer);
                dout.writeUTF(answer); 
                dout.flush();
            break;
            
            case "How to contact our company?":
                answer = "Our Contact Numbers are: 0336-4855036,0331-3114993 ";
                System.out.println(answer);
                dout.writeUTF(answer); 
                dout.flush();
            break; 
            
            case "How to buy car through this software?":
                answer = "Register your account and click on login button,then buy car.";
                System.out.println(answer);
                dout.writeUTF(answer); 
                dout.flush();
            break;
            
            case "Is Insurance available for Toyota cars?":
                answer = "Yes,for some cars we offer complete insurance.";
                System.out.println(answer);
                dout.writeUTF(answer); 
                dout.flush();
            break;
        }
        server.close();
        client.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }   
}
