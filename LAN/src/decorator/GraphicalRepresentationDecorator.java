package decorator;

import decorator.GraphicDecorator;
import decorator.Graphics;
import model.Node;

public class GraphicalRepresentationDecorator extends GraphicDecorator {
    public GraphicalRepresentationDecorator(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void draw(){
        super.draw();
        Graphics graphics = getGraphics();

        while(graphics instanceof GraphicDecorator){
            graphics = ((GraphicDecorator) graphics).getGraphics();
        }

        System.out.println("\nThere is a pictogram representing --" + ((Node)graphics).getClass().getSimpleName() + "--");
    }

    public String getNodeName(){
        String className = "";
        if (this.graphics instanceof Node) {
            className = this.graphics.getClass().getSimpleName();
        } else {
            getNodeName();
        }
        return className;
    }
}
