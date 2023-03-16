public class factorial {
    

    public static int Factorial(int n) {
        if(n==0){
            return 1;
        }
        int value = n * Factorial(n-1);
        return value;
    }

    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int value = n + sum(n-1);
        return value;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n)); 
        System.out.println(sum(n));
    }
}
