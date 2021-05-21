package CreoleModel.Protocols.Signal;

import CreoleModel.Message;
import CreoleModel.MessageProtocol;
import org.whispersystems.libsignal.IdentityKeyPair;
import org.whispersystems.libsignal.state.PreKeyRecord;
import org.whispersystems.libsignal.state.SignedPreKeyRecord;
import org.whispersystems.libsignal.util.KeyHelper;

import java.util.List;

// Represents the Signal account/client of the user
public class SignalProtocol extends MessageProtocol {

    private final String ACCOUNT_FILE_PATH = "~/src/main/resources/client.settings";

    public SignalProtocol(String userName, ProtocolType ProtocolType) {
        this.signalAccount = new SignalAccount(userName, ACCOUNT_FILE_PATH);
        this.IDKeyPair = KeyHelper.generateIdentityKeyPair();
    }

    // Store identityKeyPair somewhere durable and safe.
    // Store registrationId somewhere durable and safe.

    // Store preKeys in PreKeyStore.
    // Store signed prekey in SignedPreKeyStore.

    private String userName;
    private IdentityKeyPair IDKeyPair;
    private int registrationID;
    private List<PreKeyRecord> preKeys;
    private SignedPreKeyRecord signedPreKey;
    private SignalAccount signalAccount;


    public void InitAccount(){

    }

    public void TransferInAccount(){

    }

    @Override
    public String sendMessage(String userName, Message message) {
        return null;
    }

    @Override
    public List<Message> getMessages() {
        return null;
    }
}
