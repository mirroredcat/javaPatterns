package model;

import model.PacketComponent;
import model.PrintStrategy;

public class ThreeDPrinter implements PrintStrategy {

    @Override
    public void print(PacketComponent p) {
        System.out.println("Message ---" + p.getContents() + "---\n" +
                "This message was printed by " + this.getClass().getSimpleName());
    }
}
