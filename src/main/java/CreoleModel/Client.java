package CreoleModel;

import java.io.IOException;
import java.util.Scanner;

public class Client implements User {

    public static void main(String[] args) {
        // TODO: Get settings from client.settings file, allow user to add accounts, get/send messages
        // TODO: Constructor for client should by default use the client.settings file
        Client userClient = new Client();

        try{
            Scanner in = new Scanner(System.in);
            String input;
            while(true){
                input = in.nextLine();
                switch (input){
                    case "exit":
                        System.out.println("Exiting program.");
                        System.exit(0);

                    case "get_messages":
                        // TODO: Retrieve message feed
                        System.out.println("Getting Messages!");

                    case "add_account":
                        // TODO: Add account to send/receive messages in
                        System.out.println("Adding account!");

                    case "modify_contact":
                        // TODO: Allow clients to add/remove/modify contacts
                        System.out.println("Modifying contact");

                    default:
                        System.out.println("Incorrect usage");
                }
            }
        } catch (Exception e){
            System.out.println("IO Exception!");
            System.out.println(e.toString());
            System.exit(1);
        }
    }
}
