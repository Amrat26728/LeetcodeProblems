package Mixed;

public class CountOperationsToObtainZero {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        System.out.println(countOperations(n1, n2));
    }

    static int countOperations(int num1, int num2){
        int count = 0;
        while(num1 != 0 && num2 != 0){
            if(num1 < num2){
                num2 -= num1;
            }else{
                num1 -= num2;
            }
            count++;
        }
        return count;
    }
}
