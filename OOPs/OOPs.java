package OOPs;

public class OOPs {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("black");
        p.setTip(7);
        System.out.println(p.getColor());
        System.out.println(p.gettip());
        
        // BankAccount ba = new BankAccount();
        // ba.username = "Surya"; 
        // System.out.println(ba.username);
        // ba.setPassword(123456789);
    }
}
 class Pen {
    private String color = "blue";
    private int tip = 5;

    //Getters => To modify the value
    String getColor() {
       return this.color;
    }
    
    int gettip() {
        return this.tip;
     }
 

    void setColor(String newColor) {       //Setters
      this.color = newColor;
    } 
    void setTip(int newTip) {   // setters
        this.tip = newTip;
    }
    String nominee = "VK";  
}
