import java.util.*;
public class MealSystem {

    ArrayList<Account> system;

    public MealSystem(){
        system = new ArrayList<Account>();
    }

    // add account
    public void addAcc(String name){
        system.add(new Account(name));
    }

    // find by ID
    public Account findByID(int id){
        for (Account a: system){
            if (a.ID() == id){
                return a;
            }
        }
        throw new IllegalArgumentException("Invalid ID number. ");
    }

    //display all
    public String displayAll(){
        String result = "";
        for (Account a: system){
            result += a.toString() + "\n";
        }
        if (result.equals("")){
            result = "No accounts in Meal System. ";
        }
        return result;
    }

    //display students with negative balance
    public String displayNeg(){
        String result = "";
        for (Account a: system){
            if(a.balance()<0){
                result += a.toString() +"\n";
            }
        }
        if (result.equals("")){
            result = "No accounts with negative balances. ";
        }
        return result;
    }

    //find transactions from a certain date
    public String displayDate(int m, int d){
        String result = "";
        for(Account a: system){
            for (Transaction t: a.transactions()){
                if (t.getMonth() == m && t.getDay() == d){
                    result += t.toString() + " by "+ a.name() + " ID: " + a.ID() + "\n";
                }
            }
        }
        if (result.equals("")){
            result = "No transactions on this date";
        }
        return result;
    }


    public static void main(String[] args){
        MealSystem m = new MealSystem();
        m.addAcc("Ava");
        m.addAcc("Chloe");
        m.addAcc("Katie");
    }
}
