package factory;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SimpleLanFactory extends LanFactory {

    private static SimpleLanFactory instance;
    private SimpleLanFactory(){};

    public static SimpleLanFactory getInstance(){
        if (instance==null)instance=new SimpleLanFactory();
        return instance;
    }

    @Override
    public List<Node> createLanComponents() {
        List<Node> lanList = new ArrayList<>();
        lanList.add(new WorkStation("aaa"));
        lanList.add(new Node("bbb"));
        lanList.add(new PrintServer("ccc", new InkjetPrinter()));
        lanList.add(new Node("ddd"));
        lanList.add(new PrintServer("eee", new LaserPrinter()));

        return lanList;
    }

}
