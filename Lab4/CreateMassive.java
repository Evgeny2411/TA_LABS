package TA_Lab;

public class CreateMassive {
    public static int[] getRandomMassive(int length){
        int[] randomArray = new int[length];

        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int)(Math.random() * ((100) + 1));
        }
        return randomArray;
    }
    public static int[] getNaturalMassive(int length){
        int[] array = new int[length];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }
}
