package model;

public class FileServer extends PacketHandler {

    public FileServer(String address) {
        super(address);
    }

    @Override
    public void print(PacketComponent p) {
        System.out.println("This message ---" + p.getContents() + "--- was saved to the file server.");
    }
}
