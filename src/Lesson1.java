public class Lesson1 {
    public static void main (String args[]){
        //System.out.println("Hello World123123 -09_)_!@#(\\");
        //This is a comment for other coders to read

        //int stands for integer, these are numbers that don't have any decimal places that need representation
        int itemQuantity = 0;
        int numberSold = 9999;

        //double is a number that generally has a decimal place
        double moneyPaid = 4.99;

        //char is a single letter, enclosed in single quotes (apostrophes) 'c' for example
        char transactionCode = 'c';

        //A string is multiple characters, words, numbers, or symbols.  We cannot use \, " or ' by themselves
        String hello = "Hello world";

        //This is an example of a complex string with lots of stuff added to it.
        String dailyReport = "We have: " + itemQuantity + " on hand, we sold: " + numberSold + " the customer paid: " + moneyPaid + " each which comes to the total of: " + (numberSold*moneyPaid)
                + " And the transactionCode is " + transactionCode;

        // this is the same as the line below dailyReport = dailyReport + "and Damien was the cashier";
        dailyReport += " and Damien was the cashier\n";

        //output the big long thing above
        System.out.print(dailyReport);

        //boolean values are either true or false
        boolean truth = true;
        boolean lie = false;

        //Output truth / lie (true / false)
        System.out.println(truth);
        System.out.println(lie);

    }
}
