package model;

public interface PacketComponent {

    void add(PacketComponent pc);
    void remove(PacketComponent pc);
    PacketComponent getChild(int i);
    String getContents();
    String getOriginAddress();
    void setOriginAddress(String address);
    String getDestinationAddress();
    //void print();

}


