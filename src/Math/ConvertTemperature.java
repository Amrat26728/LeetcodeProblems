package Math;

import java.util.Arrays;

public class ConvertTemperature {
    public static void main(String[] args) {
        double celsius = 1000;

        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }

    static double[] convertTemperature(double celsius){
        double[] convertedTemp = new double[2];
        convertedTemp[0] = celsius + 273.15;
        convertedTemp[1] = celsius * 1.80 + 32.0;
        return convertedTemp;
    }
}
