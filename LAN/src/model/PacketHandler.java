package model;

import model.Node;
import model.PacketComponent;
import observer.MessageEvent;
import observer.MessageListener;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public abstract class PacketHandler extends Node implements Subject {

    private List<MessageListener> listeners = new ArrayList<>();

    public PacketHandler(String address){
        super(address);
    }

    public void receive(PacketComponent p){
        if (p.getDestinationAddress().equals(this.getAddress())){
            this.print(p);
            notifyPacketHasBeenHandled(p);
        } else {
            this.send(p);
        }
    }

    public abstract void print(PacketComponent p);

    @Override
    public void addMessageListener(MessageListener ml) {
        listeners.add(ml);
    }

    @Override
    public void removeMessageListener(MessageListener ml) {
        listeners.remove(ml);
    }

    void notifyPacketHasBeenHandled(PacketComponent p){
        MessageEvent me = new MessageEvent(this.getAddress());
        for(MessageListener li:listeners) {
            if (li.getAddress().equals(p.getOriginAddress())){
                li.receiveConfirmation(me);
            }
        }
    }
}
