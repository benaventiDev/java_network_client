package main;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client application;
        if(args.length == 0){
            application = new Client("192.168.10.104");  // "127.0.0.1"
        }else{
            application = new Client(args[0]);
        }
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.runClient();
    }
}
