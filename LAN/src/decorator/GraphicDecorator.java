package decorator;

import decorator.Graphics;

public abstract class GraphicDecorator implements Graphics {

    protected Graphics graphics;


    public GraphicDecorator(Graphics graphics){
        this.graphics = graphics;
    }

    @Override
    public void draw() {
        this.graphics.draw();
    }

    public Graphics getGraphics() {
        return graphics;
    }
}
