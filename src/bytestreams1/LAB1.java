
package bytestreams1;


public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator circleredShapeDecorator = new RedShapeDecorator(circle);
        circleredShapeDecorator.draw();
        
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator rectangleredShapeDecorator = new RedShapeDecorator(rectangle);
        rectangleredShapeDecorator.draw();

    }
    


    
}
