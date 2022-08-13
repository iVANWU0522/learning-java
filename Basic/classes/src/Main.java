public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider();
        Cat cat = new Cat("Kitty");
        Fish fish = new Fish();
        fish.setName("Fisher");
        spider.eat();
        spider.walk();
        cat.eat();
        cat.walk();
        cat.play();
        fish.eat();
        fish.walk();
        fish.play();
    }
}
