package model;

import java.util.ArrayList;
import java.util.List;

public class SuperPacket implements PacketComponent {

    private String destinationAddress;
    private String contents;
    private String originAddress;
    private List<PacketComponent> packetComponents =  new ArrayList<>();

    public SuperPacket(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }


    @Override
    public void add(PacketComponent pc) {
        packetComponents.add(pc);
    }

    @Override
    public void remove(PacketComponent pc) {
        packetComponents.remove(pc);
    }

    @Override
    public PacketComponent getChild(int i) {
        return packetComponents.get(i);
    }

    @Override
    public String getContents() {
        String message = "";
        for (PacketComponent pc: packetComponents) {
            if (pc instanceof SuperPacket) {
                message += pc.getContents();
                if (!((SuperPacket)pc).hasSuperPackets()) message = message.trim() + ". ";
            } else {
                message += pc.getContents() + " ";
            }
        }
        return message;
    }

    private Boolean hasSuperPackets(){
        for (PacketComponent pc:packetComponents){
            if (pc instanceof SuperPacket) return true;
        }
        return false;
    }

    @Override
    public String getOriginAddress() {
        return originAddress;
    }

    @Override
    public String getDestinationAddress() {
        return destinationAddress;
    }
}
