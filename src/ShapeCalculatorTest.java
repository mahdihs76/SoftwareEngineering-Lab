import models.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCalculatorTest {

    @Test
    public void computeAreaTest(){
        // arrange
        double expected = 25;
        Rectangle rectangle = new Rectangle(12.5, 2);
        ShapeCalculator shapeCalculatorUnderTest = new ShapeCalculator();

        // act
        double area = shapeCalculatorUnderTest.computeArea(rectangle);

        // assert
        Assert.assertEquals(expected, area, 10e-9);
    }
}





