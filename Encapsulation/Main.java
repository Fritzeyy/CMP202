package Encapsulation;

public class Main {
    
    public static void main(String[] args) {

        Person student = new Person("Bingham","Brown","April","bhu/22/04/05/0035", 0);
        Person staff = new Person("Bingham","Brown","April","bhu/22/04/05/0035", 0);
        
        // person.setName("F");
        // person.setPassword("April");
        System.out.println(staff);

        Physics calvelocity = new Physics();
        System.out.println(calvelocity.calculateVelocity(50,10));
        System.out.println(calvelocity.calculateVelocity(50,20,10));



    }
}
