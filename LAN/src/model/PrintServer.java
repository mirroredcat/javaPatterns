package model;

import model.PacketComponent;
import model.PacketHandler;

public class PrintServer extends PacketHandler {

    private PrintStrategy printWith;

    public PrintServer(String address, PrintStrategy printWith) {
        super(address);
        this.printWith = printWith;
    }


    public void print(PacketComponent p){
        printWith.print(p);
    }

    public PrintStrategy getPrintWith() {
        return printWith;
    }

    public void setPrintWith(PrintStrategy printWith) {
        this.printWith = printWith;
    }
}
