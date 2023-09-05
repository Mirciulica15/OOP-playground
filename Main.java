import animals.Cat;
import companies.Company;
import companies.CompanyType;
import shapes.Shape;
import shapes.ShapeFactory;
import documents.TextDocument;
import documents.TextEditor;

public class Main {
    
    public static void main(String[] args) {
        
        Cat myCat = new Cat("John", 13);
        myCat.play();

        Company company = new Company("Mircea PFA", 1000, CompanyType.SRL);
        System.out.println(company.calculateTax());

        ShapeFactory shapeFactory = new ShapeFactory(Shape.SQUARE);
        shapeFactory.draw();

        TextDocument textDocument = new TextEditor();
        textDocument.setFileInformations("./Main.java");
        textDocument.open();
    }

}
