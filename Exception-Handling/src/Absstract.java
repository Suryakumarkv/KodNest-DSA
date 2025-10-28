public class Absstract {

    public static void main(String[] args) {
        Animalssss an = new cats();
        an.eat();
        an.sound();
    }
}

interface Animalssss {
     void eat();

     default void sound() {
        System.out.println("I am an animal");
    }
}

class cats implements Animalssss {
    public void eat() {
        System.out.println("Cat is eating");
    }
}

class dogs implements Animalssss {
    public void eat() {
        System.out.println("Dog is eating");
    }
}



