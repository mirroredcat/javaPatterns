package model;

public class LaserPrinter implements PrintStrategy {

    @Override
    public void print(PacketComponent p) {
        System.out.println("Message ---" + p.getContents() + "---\n" +
                "This message was printed by " + this.getClass().getSimpleName());
    }
}
