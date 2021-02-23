package Lab_4;

public class RandomArray implements CreateArray{
    @Override
    public int[] NewArray(long length) {
        return CreateMassive.getRandomMassive((int) length);
    }

}
