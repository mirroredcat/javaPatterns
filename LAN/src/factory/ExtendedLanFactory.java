package factory;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ExtendedLanFactory extends LanFactory {

    private static ExtendedLanFactory instance;
    private ExtendedLanFactory(){};

    public static ExtendedLanFactory getInstance(){
        if(instance==null)instance=new ExtendedLanFactory();
        return instance;
    }


    @Override
    public List<Node> createLanComponents() {
        List<Node> lanList = new ArrayList<>();
        TapeStreamer ts = new TapeStreamer();

        lanList.add(new WorkStation("fff"));
        lanList.add(new Node("ggg"));
        lanList.add(new PrintServer("hhh", new InkjetPrinter()));
        lanList.add(new Node("iii"));
        lanList.add(new Node("jjj"));
        lanList.add(new FileServer("kkk"));
        lanList.add(new Node("lll"));
        lanList.add(new Node("mmm"));
        lanList.add(new MQServer("nnn"));
        lanList.add(new TapeStreamerAdapter("ppp", ts));
        lanList.add(new PrintServer("ooo", new LaserPrinter()));

        return lanList;
    }
}
