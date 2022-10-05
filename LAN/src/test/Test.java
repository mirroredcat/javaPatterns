package test;

import decorator.GraphicalRepresentationDecorator;
import decorator.Graphics;
import decorator.ShadedCircleDecorator;
import decorator.TextualRepresentationDecorator;
import enums.ConnectionType;
import facade.CreateLanFacade;
import factory.LanFactory;
import factory.PacketFactory;
import model.Node;
import model.PacketComponent;
import model.WorkStation;

import java.util.List;

public class Test {

    public static void main(String[] args) {


        PacketComponent p1 = PacketFactory.createFactory(ConnectionType.BASIC).createPacket("eee","It's a me, Mario");
        PacketComponent p2 = PacketFactory.createFactory(ConnectionType.BASIC).createPacket("nnn", "Oh hi it's Luigi");
        PacketComponent p3 = PacketFactory.createFactory(ConnectionType.BASIC).createPacket("ppp", "Message 3");

        PacketComponent p4 = PacketFactory.createFactory(ConnectionType.ADVANCED).createPacket("ppp", "Hello.My friends call me Mario. I like that.");

        /*
        factory.LanFactory simpleLan =  factory.LanFactory.createLanFactory(enums.ConnectionType.BASIC);

        facade.CreateLanFacade lanFacade = new facade.CreateLanFacade(simpleLan);
        List<model.Node> sl = lanFacade.constructLan();
        ((model.WorkStation)simpleLan.findWorkStation(sl, "aaa")).originate(p1);

         */

        LanFactory advancedLan = LanFactory.createLanFactory(ConnectionType.ADVANCED);

        CreateLanFacade advLanFacade = new CreateLanFacade(advancedLan);
        List<Node> al = advLanFacade.constructLan();

        ((WorkStation)advancedLan.findWorkStation(al, "fff")).originate(p4);

        Node node1 = al.get(2);

        Graphics circle = new ShadedCircleDecorator(node1);
        circle.draw();
        System.out.println("------");
        Graphics circle2 = new GraphicalRepresentationDecorator(node1);
        circle2.draw();
        System.out.println("------");
        Graphics circle3 = new ShadedCircleDecorator(new GraphicalRepresentationDecorator(node1));
        circle3.draw();
        System.out.println("------");
        Graphics circle4 = new ShadedCircleDecorator(new GraphicalRepresentationDecorator(new TextualRepresentationDecorator(node1)));
        circle4.draw();
        System.out.println("------");
        Graphics circle5 = new GraphicalRepresentationDecorator(new ShadedCircleDecorator(node1));
        circle5.draw();


    }
}
