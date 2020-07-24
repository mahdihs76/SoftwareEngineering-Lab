import models.Rectangle;
import models.Shape;
import models.Square;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCalculatorTest {

    @Test
    public void computeRectangleAreaTest(){
        // arrange
        double expected = 25;
        Rectangle rectangle = new Rectangle(12.5, 2);
        ShapeCalculator shapeCalculatorUnderTest = new ShapeCalculator();

        // act
        double area = shapeCalculatorUnderTest.computeArea(rectangle);

        // assert
        Assert.assertEquals(expected, area, 10e-9);
    }

    @Test
    public void computeRectangleAreaTest_2(){
        // arrange
        double expected = 20;
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        ShapeCalculator shapeCalculatorUnderTest = new ShapeCalculator();

        //act
        double area = shapeCalculatorUnderTest.computeArea(rectangle);

        // assert
        Assert.assertEquals(expected, area, 10e-9);
    }

    @Test
    public void computeSquareAreaTest(){
        // arrange
        double expected = 100;
        Square square = new Square(10);
        ShapeCalculator shapeCalculatorUnderTest = new ShapeCalculator();

        // act
        double area = shapeCalculatorUnderTest.computeArea(square);

        // assert
        Assert.assertEquals(expected, area, 10e-9);
    }



}





