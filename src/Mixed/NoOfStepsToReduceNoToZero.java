package Mixed;

public class NoOfStepsToReduceNoToZero {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(noOfSteps(n));
    }

    static int noOfSteps(int n){
        int steps = 0;
        if (n == 0){
            return steps;
        }
        if(n%2 == 0){
            steps++;
            return steps + noOfSteps(n/2);
        }
        steps++;
        return steps + noOfSteps(n-1);

    }
}
