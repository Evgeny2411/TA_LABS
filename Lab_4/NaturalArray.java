package Lab_4;

public class NaturalArray implements CreateArray{
    @Override
    public int[] NewArray(long length) {
        return CreateMassive.getNaturalMassive((int) length);
    }
}
