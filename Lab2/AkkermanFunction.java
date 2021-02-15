package Lab2;

public class AkkermanFunction {
    public static long akkermanFunction(long m, long n){
        long result = 0L;
        if(m == 0){
            result = (n+1);
        }else {
            if((m > 0) & (n == 0)) {
                result = akkermanFunction(m - 1, 1);
            }else{
                if ((m > 0) & (n > 0)) {
                    result = akkermanFunction((m - 1), akkermanFunction(m, n - 1));
                }
            }
        }
        return result;
    }
}
