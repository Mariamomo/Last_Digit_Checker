
public class LastDigitChecker {

	public static void main(String[] args) {
     System.out.println(hasSameLastDigit(41,22,71));
     System.out.println(hasSameLastDigit(23,32,42));
     System.out.println(hasSameLastDigit(9,99,999));
	}

    public static boolean isValid(int number) {
    	if(number>=10 && number<=1000) {
    		return true;
    	}
		return false;
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
    	if(isValid(number1)&& isValid(number2) && isValid(number3)) {
    		int num1 =0;
    		int num2=0;
    		int num3 = 0;
    		num1 = number1%10;
    		num2 = number2%10;
    		num3 = number3%10;
    		if(num1==num2 || num2==num3 || num1== num3) {
    			return true;
    		}
    		}return false;
    		
    }
}
    
