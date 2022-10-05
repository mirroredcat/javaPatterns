package decorator;

import decorator.GraphicDecorator;
import decorator.Graphics;

public class ShadedCircleDecorator extends GraphicDecorator {


    public ShadedCircleDecorator(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("\nThe circle is shaded.");
    }
}
