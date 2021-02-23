package TA_Lab;
import java.util.Arrays;

public class NaturalArray implements CreateArray{
    @Override
    public int[] NewArray(long length) {
        int[] array = CreateMassive.getNaturalMassive((int) length);
        return array;
    }
}
