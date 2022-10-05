package model;

import model.PacketComponent;
import model.PacketHandler;

public class TapeStreamerAdapter extends PacketHandler {

    private TapeStreamer tapeStreamer;
    private String address;

    public TapeStreamerAdapter(String address, TapeStreamer tapeStreamer) {
        super(address);
        this.tapeStreamer = tapeStreamer;
    }

    @Override
    public void print(PacketComponent p) {
        tapeStreamer.stream(p);
    }
}
