package TA_Lab;

public class BubbleTimeExecution implements Timer {
    @Override
    public String TimeExecution ( int[] arr){
        long startTime = System.nanoTime();
        new BubbleSort().Sort(arr);
        long endTime = System.nanoTime();
        return String.format("%.3f", (endTime - startTime) / Math.pow(10, 9));
    }
}
