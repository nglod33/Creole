package CreoleModel;

import CreoleModel.Protocols.Discord;
import CreoleModel.Protocols.Signal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Client implements User {

    //
    private ArrayList<Contact> Contacts = new ArrayList<>();
    private ArrayList<MessageProtocol> Protocols = new ArrayList<>();


    // Getter for Contacts
    public ArrayList<Contact> getContacts(){
        return this.Contacts;
    }

    // Setter for Contacts
    public void setContacts(ArrayList<Contact> Contacts){
        this.Contacts = Contacts;
    }

    // Getter for Protocols
    public ArrayList<MessageProtocol> getProtocols(){
        return this.Protocols;
    }

    // Setter for Protocols
    public void setProtocols(ArrayList<MessageProtocol> Protocols){
        this.Protocols = Protocols;
    }

    // TODO: Implement method for Contact class that chooses which protocol to send from

    // Sends a message to the specified contact using the specified protocol
    // This method should only be called if the person is sending a DM to a previously unknown contact
    // Otherwise, the same method should be called with a contact in place of the username
    public String sendMessage(String userName, Message message, MessageProtocol.ProtocolType protocol){

        MessageProtocol recipient;
        switch (protocol){
            case MessageProtocol.ProtocolType.DISCORD:
                recipient = new Discord(userName, MessageProtocol.ProtocolType.DISCORD);
            case MessageProtocol.ProtocolType.SIGNAL:
                recipient = new Signal(userName, MessageProtocol.ProtocolType.SIGNAL);
            default:
                return ReturnEnums.MESSAGE_COULD_NOT_BE_SENT.message + ReturnEnums.UNKNOWN_PROTOCOL.message;
        }

        // TODO: Create contact with the given username, add created protocol to that contact, send the message

        return "";
    }

    // Same as the above method, but sends it through a contact rather than creating a new one with a username
    public String sendMessage(Contact recipient, Message message, MessageProtocol.ProtocolType protocol){

    }

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
