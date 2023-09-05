package documents;

public class GraphicsEditor implements GraphicsDocument {
    
    @Override
    public void open() {
        System.out.println("Opening graphics editor...");
    }

    @Override
    public void close() {
        System.out.println("Closing graphics editor...");
    }

    @Override
    public void resizeImage() {
        System.out.println("Resizing image...");
    }

}
