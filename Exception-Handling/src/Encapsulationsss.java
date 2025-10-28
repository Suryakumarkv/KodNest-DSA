public class Encapsulationsss {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       if(age > 0) {
           this.age = age;
       } else  {
           System.out.println("Invalid Age");
       }
    }


    public static void main(String[] args) {
        Encapsulationsss obj = new Encapsulationsss();
        obj.setName("Surya");
        obj.setAge(30);

        System.out.println(obj.getName() + " " + obj.getAge());
    }

}
