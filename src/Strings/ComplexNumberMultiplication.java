package Strings;

// problem
// https://leetcode.com/problems/complex-number-multiplication/

public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        String num1 = "1+-1i";
        String num2 = "0+0i";
        System.out.println(complexNumberMultiplication(num1, num2));
    }

    public static String complexNumberMultiplication(String num1, String num2){
        int[] n1 = separateRealAndImaginaryParts(num1);
        int[] n2 = separateRealAndImaginaryParts(num2);
        int realNum1 = n1[0];
        int realNum2 = n2[0];
        int imaginaryNum1 = n1[1];
        int imaginaryNum2 = n2[1];

        System.out.println(realNum1);
        System.out.println(realNum2);
        System.out.println(imaginaryNum1);
        System.out.println(imaginaryNum2);

        int realAns = realNum1 * realNum2 + (imaginaryNum1 * imaginaryNum2) * -1;
        int imaginaryAns = realNum1 * imaginaryNum2 + imaginaryNum1 * realNum2;
        return Integer.toString(realAns).concat("+").concat(Integer.toString(imaginaryAns)).concat("i");
    }

    private static int[] separateRealAndImaginaryParts(String num){
        StringBuilder real = new StringBuilder();
        StringBuilder imaginary = new StringBuilder();
        int index = 0;
        while(num.charAt(index) != '+'){
            real.append(num.charAt(index));
            index++;
        }
        index++;
        while (index < num.length()-1){
            imaginary.append(num.charAt(index));
            index++;
        }
        return new int[]{Integer.parseInt(real.toString()), Integer.parseInt(imaginary.toString())};
    }

}
