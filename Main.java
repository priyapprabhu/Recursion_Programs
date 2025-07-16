//Print Hello my dear N times using Recursion .
public class Main{
    public static void printMessage(int n){
        if(n==0){ //base case
            return;
        }
            System.out.println("Hello my dear");
            printMessage(n-1); //recursive call itself
        }
    public static void main(String[] args){
        int n =5;
        printMessage(n);
        
    }
}


