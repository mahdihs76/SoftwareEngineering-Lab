import models.Rectangle;
import models.Square;

public class ShapeCalculator {

    public double computeArea(Rectangle rectangle){
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public double computeArea(Square square){
        return Math.pow(square.getWidth(), 2);
    }
}

