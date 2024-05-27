public class Task10 {
    public static void main(String[] args) {
        int[] array = {1,1,0,0,1,0,1,1,0,0};
        System.out.println("Our Array" );
        printArray(array);
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
        System.out.println("Modified array" );
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
