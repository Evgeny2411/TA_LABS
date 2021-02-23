package TA_Lab;
import java.util.Arrays;

public class RandomArray implements CreateArray{
    @Override
    public int[] NewArray(long length) {
        int[] array = CreateMassive.getRandomMassive((int) length);
        return array;
    }

}
