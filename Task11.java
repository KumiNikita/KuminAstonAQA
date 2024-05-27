public class Task11 {
    public static void main(String[] args) {
        int[] array = new int[100];
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i +1;
            System.out.print(array[i] );
        }
        System.out.println();
    }
}
