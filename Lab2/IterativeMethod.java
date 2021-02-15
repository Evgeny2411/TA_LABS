package Lab2;

public class IterativeMethod {

    public static void iterativeMethod(){
        double x1 = 1;
        double x;
        for(int i  = 1;; i++){
            x = new Formula().formula(x1, i);
            x1 = x;
            System.out.print(x + " ");
            if(x == 0.0){
                break;
            }
        }
        System.out.println(" ");
    }
}
