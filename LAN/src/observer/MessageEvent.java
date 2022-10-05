package observer;

public class MessageEvent {

    private String address;

    public MessageEvent(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}
