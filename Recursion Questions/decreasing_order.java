 
public class decreasing_order {


    public static void decreasing(int n) {
        if(n>=1){
            System.out.println(n);
            decreasing(n-1);
        }
       
    }


    public static void main(String[] args) {
        int n =10;
         decreasing(n);
    }
}
