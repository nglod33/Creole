package CreoleModel;

import java.util.List;

// A single contact to be used to message one contact on one specific messaging service
public abstract class MessageProtocol {

    public enum ProtocolType {
        DISCORD,
        SIGNAL;
    }

    private ProtocolType protocolType;

    public ProtocolType getProtocolType() {
        return protocolType;
    }

    public abstract String sendMessage(String userName, Message message);

    public abstract List<Message> getMessages();
}
