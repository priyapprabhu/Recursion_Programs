//Sum of 1st N natural numbers.
public class SumOfNaturalNumbers{
    public static int SumOfNaturalNumbers(int n){
        if(n<=0){
            return 0;
        }
        return n + SumOfNaturalNumbers(n-1);
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("Sum of 1st "+n +" natural numbers is:"+SumOfNaturalNumbers(n));
    }
}
