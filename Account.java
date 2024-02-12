import java.util.*;
public class Account{

    private String name;
    private double balance;
    private ArrayList<Transaction> transactions;
    private int myID;
    private static int allID = 1;

    public Account(String a){
        name = a;
        balance = 0;
        myID = allID;
        allID++;
        transactions = new ArrayList<Transaction>();
    }

    public void exchange(int month, int day, double cost){
        transactions.add(new Transaction(month, day, cost));
        balance += cost;
    }


    public void setName(String n){
        name = n;
    }

    //getter methods

    public String name(){
        return name;
    }
    public double balance(){
        return balance;
    }
    public ArrayList<Transaction> transactions(){
        return transactions;
    }
    public int ID(){
        return myID;
    }

    public String toString(){
        String tranact = "";
        for (int i = 0;i < transactions.size(); i++){
            if (i>0){
                tranact += ", ";
            }
            tranact += transactions.get(i).toString();
        }
        return "Name: "+name+" ID: "+myID+ " Balance: $" + String.format("%.2f", balance) + " Transactions: " + tranact;
    }

    public static void main(String[] args){
        Account ava = new Account("Ava");
        Account chloe = new Account("Chloe");
        Account katie = new Account ("Katie");

        ava.exchange(4, 8, 5.50);
        chloe.exchange(4, 8, 8);
        katie.exchange(4, 8, 10.80);

        System.out.println(ava.toString());
        System.out.println(chloe.toString());
        System.out.println(katie.toString());

        ava.exchange(4, 9, -3);

        System.out.println(ava.toString());
        System.out.println(chloe.toString());
        System.out.println(katie.toString());
    }
}