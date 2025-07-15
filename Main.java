Print numbers from 1 to N.
public class 1toN{
    public static void NumRange(int n){
        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int n = 6;
        NumRange(n);
    }
    
}

