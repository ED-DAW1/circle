/**
 * Circle class definition
 * @author carlos
 */
public class Circle {   
   // Public constants
   public static final double DEFAULT_RADIUS = 8.8;
   public static final String DEFAULT_COLOR  = "red";
   
   // Private variables
   private double radius;
   private String color;
   
   /**
    * Default constructor
    */
   public Circle() {                   
      radius = DEFAULT_RADIUS;
      color  = DEFAULT_COLOR;
   }
   
   /**
    * Constructor
    * @param radius 
    */
   public Circle(double radius) {      
      this.radius = radius;
      color = DEFAULT_COLOR;
   }
   
   /**
    * Constructor
    * @param radius
    * @param color 
    */
   public Circle(double radius, String color) {
      this(radius);
      this.color = color;
   }
   
   /**
    * Get circle radius
    * @return radius
    */
   public double getRadius() {
      return radius;
   }
   
   /**
    * Set circle radius
    * @param radius 
    */
   public void setRadius(double radius) {
      this.radius = radius;
   }
   
   /**
    * 
    * @return 
    */
   public String getColor() {
      return color;
   }
   
   /**
    * 
    * @param color 
    */
   public void setColor(String color) {
      this.color = color;
   }
 
   /**
    * 
    * @return 
    */
   @Override
   public String toString() {
      return String.format("C(radius:%.2f,color:%s)",radius,color);
   }
 
   /**
    * 
    * @return 
    */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   /**
    * 
    * @return 
    */
   public double getPerimeter() {
       return 2*radius*Math.PI;
   }
}
