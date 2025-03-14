package solid.lsp.problem;

// ne respecte pas le principe de LSP
public class Square extends Rectangle{

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // modifier la hauteur
    }


    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // modifier la largeur
    }


}
