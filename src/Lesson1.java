public class Lesson1 {
    public static void main (String args[]){
        //System.out.println("Hello World123123 -09_)_!@#(\\");
        //This is a comment for other coders to read
        int itemQuantity = 0;
        int numberSold = 9999;
        double moneyPaid = 4.99;
        char transactionCode = 'c';
        String hello = "Hello world";
        String dailyReport = "We have: " + itemQuantity + " on hand, we sold: " + numberSold + " the customer paid: " + moneyPaid + " each which comes to the total of: " + (numberSold*moneyPaid)
                + " And the transactionCode is " + transactionCode;
        // this is the same as the line below dailyReport = dailyReport + "and Damien was the cashier";
        dailyReport += " and Damien was the cashier\n";
        System.out.print(dailyReport);

        boolean truth = true;
        boolean lie = false;

        System.out.println(truth);
        System.out.println(lie);

    }
}
