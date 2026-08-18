//o(2^n) Expinential Time Complexity
public class Exponential {
    static int findfibo(int n){
        if(n==0 || n==1){
            return n;
        }
            return findfibo(n-1)+findfibo(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findfibo(n));
    }
}
