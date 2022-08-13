public class Cat extends Animal implements Pet {
    public String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {

    }

    public void walk() {
        System.out.println("Cat walk with " + legs + " legs");
    }

    public void eat() {
        System.out.println("Cat eat");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Cat play");
    }
}
