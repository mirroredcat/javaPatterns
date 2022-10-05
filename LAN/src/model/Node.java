package model;

import decorator.Graphics;
import model.LanComponent;

public class Node extends LanComponent implements Graphics {

    public Node(String address) {
        super(address);
    }

    @Override
    public void send(PacketComponent p) {
        getNextComponent().receive(p);
    }

    @Override
    public void receive(PacketComponent p) {
        this.send(p);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
