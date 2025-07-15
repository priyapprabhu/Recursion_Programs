//Print numbers from N to 1.
public class Nto1{
    public static void NumRange(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" " );
        NumRange(n-1); //recursive call itself
    }
    public static void main(String[] args){
        int n = 6;
        NumRange(n);
    }
    
}
