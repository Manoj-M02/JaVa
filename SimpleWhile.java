public class SimpleWhile {
    public static void main(String[] args) {
        int num = 255 , n = 5, count = 0;
        while (num > n) {
            count++;
            num = num / n;
        }
        System.out.println("The number of times the loop executed: " + count);
    }
}
