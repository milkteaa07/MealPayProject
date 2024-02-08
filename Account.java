import java.util.*;
public class Account{

    private static String name;
    private float balance;
    private ArrayList<Transaction> transactions;
    private int previd;
    private static int id = 1;

    public Account(String a){
        name = a;
        balance = 0;
        previd = id;
        id++;
        transactions = new ArrayList<Transaction>();
    }

    public void pay(String date, float cost){
        transactions.add(date + ", -$" + cost);
        balance -= cost;
    }

    public void addFunds(String date, float cost){
        transactions.add(date + ", +$" + cost);
        balance -= cost;
    }




    //getter methods

    public String name(){
        return name;
    }
    public float balance(){
        return balance;
    }
    public ArrayList<String> transactions(){
        return transactions;
    }
}