package model;

import model.Node;
import model.PacketComponent;
import observer.MessageEvent;
import observer.MessageListener;

public class WorkStation extends Node implements MessageListener {
    public WorkStation(String address) {
        super(address);
    }

    public void originate (PacketComponent p){

        p.setOriginAddress(this.getAddress());
        this.send(p);
    }

    @Override
    public void receiveConfirmation(MessageEvent m) {
        System.out.println("The packet sent by " + this.getAddress() + " arrived at " + m.getAddress());
    }
}
