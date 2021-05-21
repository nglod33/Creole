package CreoleModel;

import java.util.ArrayList;
import java.util.HashMap;

public class Contact implements User {

    private HashMap<MessageProtocol.ProtocolType, String> Protocols;
    private ArrayList<Message> Messages;
    private String ContactName;

    public Contact(String contactName){
        this.ContactName = contactName;
    }

    public ArrayList<Message> getMessages() {
        return Messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.Messages = messages;
    }

    public void addMessage(Message message){
        // TODO: Insert message into sqlite data when it's added to a contact
        Messages.add(message);
    }

    public HashMap<MessageProtocol.ProtocolType, String> getUsernames() {
        return Protocols;
    }
    public void setUsernames(HashMap<MessageProtocol.ProtocolType, String> protocols) {
        Protocols = protocols;
    }

    // Adds a new Protocol to the client
    public void addUserName(String Username, MessageProtocol.ProtocolType protocolType){
        this.Protocols.put(protocolType, Username);
    }

    public String getUsername(MessageProtocol.ProtocolType protocolType){
        return this.getUsernames().get(protocolType);
    }

    public String getContactName(){
        return this.ContactName;
    }

    public void setContactName(String name){
        this.ContactName = name;
    }
}
