package ex66;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Cat("Kitty");
        a1.greets(); // Meow

        Dog d1 = new Dog("Rex");
        d1.greets();          // Woof
        d1.greets(d1);        // Woooof

        BigDog b1 = new BigDog("Max");
        b1.greets();          // Wooow
        b1.greets(d1);        // Woooooo
        b1.greets(b1);        // Wooooooooow
    }
}

