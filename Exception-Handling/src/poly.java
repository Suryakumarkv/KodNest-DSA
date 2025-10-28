public class poly {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.add(5,6));
       System.out.println(a.add(5.66,6.78));
    }

}

class Animal {
    int add(int a, int b) {
        return a + b;
    }

    double  add(double a, double b) {
        return a + b;
    }

}
