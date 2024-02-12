import java.util.*;
public class MealPayRunner {


    public static void main(String[] args){
        System.out.println("\nWelcome to the MealPay System!");
        MealSystem m = new MealSystem();

        System.out.println("\nAdding students to the system...");
        m.addAcc("Billy Joel");
        m.addAcc("Bugs Bunny");
        m.addAcc("Charlie Brown");
        m.addAcc("Hermione Granger");
        m.addAcc("Elizabeth Bennet");
        m.addAcc("Sherlock Holmes");
        m.addAcc("Percy Jackson");

        System.out.println("\nDisplaying all accounts...");
        System.out.println(m.displayAll());

        System.out.println("Making some deposits and purchases...");
        m.findByID(1).exchange(2, 10, 20);
        m.findByID(2).exchange(2, 10, 20);
        m.findByID(3).exchange(2, 10, 20);
        m.findByID(4).exchange(2, 11, 20);
        m.findByID(5).exchange(2, 11, 20);
        m.findByID(6).exchange(2, 11, 20);
        m.findByID(7).exchange(2, 11, 20);

        m.findByID(2).exchange(2, 12, -7);
        m.findByID(2).exchange(2, 13, -7);
        m.findByID(3).exchange(2, 14, -7);
        m.findByID(3).exchange(2, 15, -7);
        m.findByID(2).exchange(2, 15, -7);
        m.findByID(3).exchange(2, 16, -7);
        m.findByID(3).exchange(2, 16, -7);
        m.findByID(6).exchange(2, 17, -7);
        m.findByID(7).exchange(2, 17, -7);

        System.out.println(m.displayAll());

        System.out.println("\nDisplaying all negative accounts...");
        System.out.println(m.displayNeg());

        System.out.println("\nLooking up student with ID 6...");
        System.out.println(m.findByID(6).toString());

        System.out.println("\nDisplaying all transactions on 2/11...");
        System.out.println(m.displayDate(2, 11));



    }

        
    
}
