package TA_Lab;



public class Main {
    public static void main(String[] args) {

        int[] randomK = new RandomArray().NewArray(1000);
        int[] randomKK = new RandomArray().NewArray(10000);
        int[] randomKKK = new RandomArray().NewArray(100000);

        int[] naturalK = new NaturalArray().NewArray(1000);
        int[] naturalKK = new NaturalArray().NewArray(10000);
        int[] naturalKKK = new NaturalArray().NewArray(100000);


        System.out.print("Time for BUBBLE sort for 1000 random elements: "
                + new BubbleTimeExecution().TimeExecution(randomK.clone()) + " s");
        System.out.print(" for sorted: " + new BubbleTimeExecution().TimeExecution(naturalK) + " s \n");

        System.out.print("Time for BUBBLE sort for 10000 random elements: "
                + new BubbleTimeExecution().TimeExecution(randomKK.clone()) + " s");
        System.out.print(" for sorted: " + new BubbleTimeExecution().TimeExecution(naturalKK) + " s\n");

        System.out.print("Time for BUBBLE sort for 100000 random elements: "
                + new BubbleTimeExecution().TimeExecution(randomKKK.clone()) + " s");
        System.out.print(" for sorted: " + new BubbleTimeExecution().TimeExecution(naturalKKK) + " s\n");

        System.out.print("Time for INSERTION sort for 1000 random elements: "
                + new InsertionTimeExecution().TimeExecution(randomK.clone()) + " s");
        System.out.print(" for sorted: " + new InsertionTimeExecution().TimeExecution(naturalK) + " s\n");

        System.out.print("Time for INSERTION sort for 10000 random elements: "
                + new InsertionTimeExecution().TimeExecution(randomKK.clone()) + " s");
        System.out.print(" for sorted: " + new InsertionTimeExecution().TimeExecution(naturalKK) + " s\n");

        System.out.print("Time for INSERTION sort for 100000 random elements: "
                + new InsertionTimeExecution().TimeExecution(randomKKK.clone()) + " s");
        System.out.print(" for sorted: " + new InsertionTimeExecution().TimeExecution(naturalKKK) + " s\n");

        System.out.print("Time for SELECTION sort for 1000 random elements: "
                + new SelectionTimeExecution().TimeExecution(randomK.clone()) + " s");
        System.out.print(" for sorted: " + new SelectionTimeExecution().TimeExecution(naturalK) + " s\n");

        System.out.print("Time for SELECTION sort for 10000 random elements: "
                + new SelectionTimeExecution().TimeExecution(randomKK.clone()) + " s");
        System.out.print(" for sorted: " + new SelectionTimeExecution().TimeExecution(naturalKK) + " s\n");

        System.out.print("Time for SELECTION sort for 100000 random elements: "
                + new SelectionTimeExecution().TimeExecution(randomKKK.clone()) + " s");
        System.out.print(" for sorted: " + new SelectionTimeExecution().TimeExecution(naturalKKK) + " s\n");
    }

}