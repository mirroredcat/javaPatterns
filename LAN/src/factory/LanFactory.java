package factory;

import enums.ConnectionType;
import model.LanComponent;
import model.Node;
import model.PacketHandler;
import model.WorkStation;

import java.util.ArrayList;
import java.util.List;

public abstract class LanFactory {

    public static LanFactory createLanFactory(ConnectionType c){
        switch (c) {
            default:
            case BASIC:
                return SimpleLanFactory.getInstance();
            case ADVANCED:
                return ExtendedLanFactory.getInstance();
        }
    }

    public abstract List<Node> createLanComponents();

    public void connectLan(List<Node> lanList){
        for(int i=0; i < lanList.size(); i++){
            if (i == lanList.size()-1) {
                lanList.get(i).setNextComponent(lanList.get(0));
            } else {
                lanList.get(i).setNextComponent(lanList.get(i+1));
            }
        }
    }

    public LanComponent findWorkStation(List<Node> lanList, String address){
        for (Node n: lanList){
            if (n.getAddress().equals(address)) return n;
        }
        return null;
    }

    public void linkMessageListeners(List<Node> lanList){
        List<WorkStation> workstations = new ArrayList<>();
        for(Node n:lanList){
            if (n instanceof WorkStation) workstations.add((WorkStation) n);
        }

        for(WorkStation w:workstations){
            for (Node n:lanList) {
                if (n instanceof PacketHandler) ((PacketHandler) n).addMessageListener(w);
            }
        }
    }

}
