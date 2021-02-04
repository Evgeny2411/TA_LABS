package Lab1;

public class CheckForMagic {
    public boolean isNumberMagic(String number){
        int newNumber = 0;
        int currentNumber;
        for(int i = 0; i < number.length(); i++){
            currentNumber = number.charAt(i) - '0';
            newNumber = newNumber + (currentNumber*currentNumber);
        }
        if(newNumber != 1){
            isNumberMagic(String.valueOf(newNumber));
        }else{
            return true;
        }
        return isNumberMagic(String.valueOf(newNumber));
    }
}
