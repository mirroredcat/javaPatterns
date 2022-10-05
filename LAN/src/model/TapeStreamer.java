package model;

import model.PacketComponent;

public class TapeStreamer{


    public TapeStreamer() {};

    public void stream(PacketComponent p){
        System.out.println("model.Packet with message ---" + p.getContents() + "--- was streamed to tape");
    }
}
