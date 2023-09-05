package animals;

public class Cat extends Animal{
    
    private int mustacheWidth;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println("Meow");
    }

    public void fluffyCat() {
        if(mustacheWidth > 50) {
            System.out.println("Fluffy");
        } else {
            System.out.println("Not Fluffy");
        }
    }

    public int getMustacheWidth() {
        return mustacheWidth;
    }

    public void setMustacheWidth(int mustacheWidth) {
        this.mustacheWidth = mustacheWidth;
    }

}
