package CreoleModel.Protocols.Signal;

import java.io.File;

// The SignalAccount object should ultimately be able to be constructed from client.settings
public class SignalAccount {

    public SignalAccount(String userName, String filePath){
        this.userName = userName;
        this.filePath = filePath;
    }

    private String userName;
    public String filePath;

}
