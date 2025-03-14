package solid.lsp.solution;

public class Rectangle implements Shape{

    private int width,height;

    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public int getArea() {
        return width*height;
    }


}
