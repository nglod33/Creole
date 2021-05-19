package CreoleModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact implements User {

    private HashMap<MessageProtocol.ProtocolType, MessageProtocol> Protocols;
    private ArrayList<Message> messages;

    public String sendMessage(){

    }

    public List<Message> getMessages(){

    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message){
        messages.add(message);
    }

    public HashMap<MessageProtocol.ProtocolType, MessageProtocol> getProtocols() {
        return Protocols;
    }
    public void setProtocols(HashMap<MessageProtocol.ProtocolType, MessageProtocol> protocols) {
        Protocols = protocols;
    }

    // Adds a new Protocol to the client
    public void addProtocol(MessageProtocol.ProtocolType ProtocolType, MessageProtocol Protocol){
        this.Protocols.put(ProtocolType, Protocol);
    }
}
