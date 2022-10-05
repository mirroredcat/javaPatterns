package factory;

import enums.ConnectionType;
import model.PacketComponent;

public abstract class PacketFactory {

    public static PacketFactory createFactory(ConnectionType c){
        switch (c) {
            default:
            case BASIC:
                return SimplePacketFactory.getInstance();
            case ADVANCED:
                return SuperPacketFactory.getInstance();
        }
    }

    public abstract PacketComponent createPacket(String destinationAddress, String message);

}
