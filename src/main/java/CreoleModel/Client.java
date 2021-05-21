package CreoleModel;

import java.util.HashMap;
import java.util.Scanner;

public class Client implements User {

    //
    private HashMap<String, Contact> Contacts;
    private HashMap<MessageProtocol.ProtocolType, MessageProtocol> ClientProtocols;


    // Getter for Contacts
    public HashMap<String, Contact> getContacts(){
        return this.Contacts;
    }

    // Setter for Contacts
    public void setContacts(HashMap<String, Contact> Contacts){
        this.Contacts = Contacts;
    }

    // TODO: Implement method for Contact class that chooses which protocol to send from

    // Sends a message to the specified contact using the specified protocol
    // This method should only be called if the person is sending a DM to a previously unknown contact
    // Otherwise, the same method should be called with a contact in place of the username
    public String sendMessage(String userName, Message message, MessageProtocol.ProtocolType protocol){

        Contact newContact = new Contact(userName);
        newContact.addUserName(userName, protocol);
        this.Contacts.put(userName, newContact);

        return sendMessage(this.Contacts.get(userName), message, protocol);
    }

    // Same as the above method, but sends it through a contact rather than creating a new one with a username
    public String sendMessage(Contact recipient, Message message, MessageProtocol.ProtocolType protocol){
         return this.ClientProtocols.get(protocol).sendMessage(recipient.getUsername(protocol), message);
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
