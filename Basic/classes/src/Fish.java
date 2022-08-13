public class Fish extends Animal implements Pet {
    private String name;

    public void walk() {
        System.out.println("Fish cannot walk as no legs");
    }

    public Fish() {

    }

    public void eat() {
        System.out.println("Fish eat");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Fish play");
    }
}
