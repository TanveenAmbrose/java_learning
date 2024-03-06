import java.util.*;

public class switchtest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1 :
            System.out.println("Number One");
            break;
            case 2 :
            System.out.println("Number Two");
            break;
            case 3 :
            System.out.println("Number Three");
            break;
            default :
            System.out.println("Number Not Found");
        }
    }
}
