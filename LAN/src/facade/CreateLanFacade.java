package facade;

import factory.LanFactory;
import model.Node;

import java.util.List;

public class CreateLanFacade {

    private final LanFactory lanFactory;

    public CreateLanFacade(LanFactory lanFactory) {
        this.lanFactory = lanFactory;
    }

    public List<Node> constructLan(){
        List<Node> l = lanFactory.createLanComponents();
        lanFactory.connectLan(l);
        return l;
    }

}
