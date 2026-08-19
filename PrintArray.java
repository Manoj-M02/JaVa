public class PrintArray {
    public static void main(String[] args) {
        //Type1 Using new keyword
        int size = 5;
        int[] arr = new int[size];
        //Initialize array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        //Print array elements
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
        //Type2 Using {}
        int marks[] = {97, 88, 77, 69, 58};
        int len = marks.length;//to find array length
        for(int i=0; i<len; i++){
            System.out.println(marks[i]);
        }
    }   
}
