package CreoleModel;

public enum ReturnEnums {
    CLIENT_DOESNT_HAVE_PROTOCOL("CLIENT DOES NOT HAVE PROTOCOL"),
    MESSAGE_COULD_NOT_BE_SENT("Message could not be sent: "),
    UNKNOWN_PROTOCOL("UNKNOWN PROTOCOL");

    public final String message;

    private ReturnEnums(String message){
        this.message = message;
    }
}
