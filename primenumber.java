import java.util.Scanner;

public class primenumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        if(n == 2){
            System.out.println(n + " is a prime number");
        }
        
       
        else{
            boolean forPrime = true;
            for(i=2;i<=n-1;i++){
                if (n%i == 0) {
                    forPrime = false;
                }
            }
                if (forPrime == true) {
                    System.out.println(n + " is a prime number");
                }
                else{
                    System.out.println(n + " is not a prime number");
                }
            

        }
    }
    
}
