package Lab_4;

public class SelectionTimeExecution implements Timer {
    @Override
    public String TimeExecution ( int[] arr){
        long startTime = System.nanoTime();
        new SelectionSort().Sort(arr);
        long endTime = System.nanoTime();
        return String.format("%.3f", (endTime - startTime) / Math.pow(10, 9));
    }

}
