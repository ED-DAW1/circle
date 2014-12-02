import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class CircleTest {
    private Circle c;

    
    @Before
    public void setUp() {
        c = new Circle(2.6,"blue");
    }

    @Test
    public void testCircleConstructors() {
        assertTrue(new Circle() instanceof Circle);
        assertTrue(new Circle(1.6,"blue") instanceof Circle);
        assertTrue(new Circle(2.6) instanceof Circle);
        assertEquals(2.6,c.getRadius(),0.0001);
        assertEquals("blue",c.getColor());
    }
    
    @Test
    public void testCircleSettersAndGetters() {
        c.setRadius(4.9);
        c.setColor("green");
        assertTrue(c.getRadius() == 4.9);
        assertTrue("green".equals(c.getColor()));
    }
    
    @Test
    public void testPerimeter() {
        assertEquals(16.328,c.getPerimeter(),0.01);
    } 
    
    @Test
    public void testArea() {
        assertEquals(21.237216,c.getArea(),0.01);
    }
    
    @Test
    public void testToString() {
        assertEquals("C(radius:2.60,color:blue)",c.toString());
        
    }
    
    
    
}
