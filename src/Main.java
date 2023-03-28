import java.util.Scanner;
public class Main {   public static void main (String[] args){

    // intialising new scanner
    Scanner kb = new Scanner(System.in);

    // takings inputs from the user


    double CashRegBalance = kb.nextDouble();
    double AmountPaid = kb.nextDouble();
    double ItemCost = kb.nextDouble();
    String str = kb.next();



    // variable declaration

    double change;
    double AmountDue;

    // Calculations

    change = AmountPaid-ItemCost;
    AmountDue= ItemCost-AmountPaid;

    // Outputs


    if (str.equals("c")) {
        System.out.println("Transaction Cannot Be Completed Transaction was cancelled" );
        return;
    }


    if ( CashRegBalance>change&&AmountPaid>ItemCost) {
        System.out.println("Transaction is Complete");
        System.out.println("The amount paid is: "+" "+ AmountPaid+" "+"dollars");
        System.out.println("The item cost is:"+" "+ItemCost+" "+"dollars");
        System.out.printf("The amount of change to return is:"+" "+"%.2f",change);
        System.out.print(" "+ "dollars");}

    if(AmountPaid == ItemCost){
        System.out.printf("The amount of change to return is:"+" "+"%.2f",change);
        System.out.print(" "+ "dollars");
    }
    if(CashRegBalance>change&&ItemCost>AmountPaid)    {
        System.out.println("Transaction is Incomplete");
        System.out.println("The amount paid is: "+" "+ AmountPaid+" "+"dollars");
        System.out.println("The item cost is:"+" "+ItemCost+" "+"dollars");
        System.out.printf("The amount due is:"+" "+"%.2f",AmountDue);
        System.out.print(" "+"dollars");
    }
    if (change>CashRegBalance){

        System.out.println("Transaction Cannot Be Completed Insufficient amount in cash register");
    }















}
}

