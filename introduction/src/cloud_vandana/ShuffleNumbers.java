package cloud_vandana;

public class ShuffleNumbers {

    private static int customRandom(int min, int max, int seed) {
        seed = (seed * 1103515245 + 12345) & Integer.MAX_VALUE;
        return min + seed % (max - min + 1);
    }

    public static void customShuffle(int[] arr, int seed) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
           
            int j = customRandom(0, i, seed);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
    
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array with a custom seed (you can use any integer as a seed)
        customShuffle(myArray, 42);

  
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
