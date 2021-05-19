package CreoleModel;

import CreoleModel.Protocols.Discord;

// A single contact to be used to message one contact on one specific messaging service
public abstract class MessageProtocol {
    public enum ProtocolType {
        DISCORD,
        SIGNAL;
    }

    private String userName;
    private ProtocolType protocol;

    public MessageProtocol(String userName, ProtocolType ProtocolType){
        this.userName = userName;
        this.protocol = ProtocolType;
    }
}
