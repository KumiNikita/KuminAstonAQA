public class Task14 {
    public static void main(String[] args) {
        int len = 4;
        int initialValue = 5;
        int[] array = createArray(len, initialValue);
        System.out.println("Созданный массив:");
        printArray(array);
    }

    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
