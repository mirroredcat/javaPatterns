package decorator;

import decorator.GraphicDecorator;
import decorator.Graphics;

public class TextualRepresentationDecorator extends GraphicDecorator {
    public TextualRepresentationDecorator(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("\nThere is text saying --" + this.graphics.getClass().getSimpleName() + "-- in the circle.");
    }
}
