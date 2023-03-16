public class Fabinocci {


    public static int fabinocci(int n) {
        if(n==0 || n==1){
            return n;
        }
        int f1 = fabinocci(n-1);
        int f2 = fabinocci(n-2);
        int ff = f1+f2;
        return ff;
    }

    public static void main(String[] args) {
        int n = 3;
       
        System.out.println( fabinocci(n));
    }
}
