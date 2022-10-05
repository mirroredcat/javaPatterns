package model;

public class Packet implements PacketComponent {

    private String destinationAddress;
    private String contents;
    private String originAddress;

    public Packet(String destinationAddress, String contents) {
        this.destinationAddress = destinationAddress;
        this.contents = contents;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    @Override
    public void add(PacketComponent pc) {

    }

    @Override
    public void remove(PacketComponent pc) {

    }

    @Override
    public PacketComponent getChild(int i) {
        return null;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
