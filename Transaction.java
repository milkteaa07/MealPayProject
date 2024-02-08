public class Transaction {
    private int month;
    private int day;
    private double amount;

    public Transaction(int m, int d, double a){
        month = m;
        day = d;
        amount = a;
    }

    public void setMonth(int m){
        month = m;
    }
    public void setDay(int d){
        day = d;
    }
    public void setAmount(int a){
        amount = a;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public double getAmount(){
        return amount;
    }

    public String toString(){
        return "("+month + "/" + day + ", $" + String.format("%.2f", amount)+")";
    }

    public static void main(String[] args){
        Transaction t = new Transaction(2, 4, 7);

        System.out.println(t.getAmount());
        System.out.println(t.toString());
    }
}
