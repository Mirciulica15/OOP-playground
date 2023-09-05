package shapes;

public class ShapeFactory {
    
    private ShapeDrawer drawer;

    public ShapeFactory(Shape shape) {
        switch (shape) {
        case CIRCLE:
            this.drawer = new CircleDrawer();
            break;
        case SQUARE:
            this.drawer = new SquareDrawer();
            break;
    
        default:
            this.drawer = new CircleDrawer(); 
            break;
        }
    }

    public void draw() {
        this.drawer.draw();
    }

}
