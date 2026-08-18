//O(nlogn) Linearthmic Time Complexity
public class Linearthmic {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j=j*3) {
                System.out.println(i + " " +j);
            }
        }
    }
}
