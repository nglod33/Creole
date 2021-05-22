package CreoleModel.Protocols.Discord;

import CreoleModel.Message;
import CreoleModel.MessageProtocol;

public class Discord extends MessageProtocol {
    public Discord(String userName, ProtocolType ProtocolType) {
        super(userName, ProtocolType);
    }

    @Override
    public String sendMessage(String userName, Message message) {
        return null;
    }
}
