package factory;

import model.Packet;
import model.PacketComponent;
import model.SuperPacket;

import java.util.ArrayList;
import java.util.List;

public class SuperPacketFactory extends PacketFactory {

    private static SuperPacketFactory instance;
    private SuperPacketFactory(){};

    public static SuperPacketFactory getInstance(){
        if(instance==null)instance=new SuperPacketFactory();
        return instance;
    }

    @Override
    public PacketComponent createPacket(String destinationAddress, String message) {
        List<String> messagePart = new ArrayList<>();
        PacketComponent pc = new SuperPacket(destinationAddress);
        messagePart = List.of(message.split("\\."));
        for(String sentence: messagePart){
            SuperPacket sp = new SuperPacket(destinationAddress);
            List<String> words = List.of(sentence.split("\\s"));
            for(String w: words){
                Packet p = new Packet(destinationAddress, w);
                sp.add(p);
            }
            pc.add(sp);
        }
        return pc;

    }
}
