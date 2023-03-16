import java.util.*; 

public class increasing_order {


    public static void increasing(int n) {
       if(n>=1){
        increasing(n-1);
        System.out.println(n);
         
       }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. to print in increasing order : ");
        int n = sc.nextInt();

        increasing(n);
        
    }
}
