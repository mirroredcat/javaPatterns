package model;

public class MQServer extends PacketHandler {

public MQServer(String address) {
        super(address);
    }

    @Override
    public void print(PacketComponent p) {
        System.out.println("This message ---" + p.getContents() + "--- is with the model.MQServer.");
    }

}
