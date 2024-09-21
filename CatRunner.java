public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield", 4, 33.7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Tom", 12, 17.3);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
