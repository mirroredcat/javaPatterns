package factory;

import model.Packet;
import model.PacketComponent;

public class SimplePacketFactory extends PacketFactory {

    private static SimplePacketFactory instance;
    private SimplePacketFactory(){};

    public static SimplePacketFactory getInstance(){
        if (instance==null){instance=new SimplePacketFactory();}
        return instance;
    }

    public PacketComponent createPacket(String destinationAddress, String message){
        return new Packet(destinationAddress,message);
    }


}
