package animals;

public class Dog extends Animal{
 
    private int wolfness;

    public Dog(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println("Woof");
    }

    public void getFerocity() {
        if(wolfness > 50) {
            System.out.println("Ferocious dog");
        } else {
            System.out.println("Normal dog"); 
        }
    }

    public int getWolfness() {
        return wolfness;
    }

    public void setWolfness(int wolfness) {
        this.wolfness = wolfness;
    }

}
