package exe03;

public class Sms {
    private String type;
    private String message;

    public Sms(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
