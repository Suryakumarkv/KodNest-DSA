public class OverRidinnng {

    public static void main(String[] args) {
        Animals aa = new cat();
        aa.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("Animal eat");
    }
}

class cat extends Animals {
    @Override
    void eat() {
        System.out.println("cat eat");
    }
}
