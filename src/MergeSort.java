public class MergeSort {

    /* A utility function to print array of size n */
    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] originalArray = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(originalArray);

        sort(originalArray, 0, originalArray.length - 1);

        System.out.println("\nSorted array");
        printArray(originalArray);
    }

    private static void merge(int[] origArray, int l, int m, int r) {
        // Find sizes of two sub-arrays to be merged
        int leftSize = m - l + 1;
        int rightSize = r - m;

        /* Create temp arrays */
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        /*Copy data to temp arrays*/
        System.arraycopy(origArray, l, leftArray, 0, leftSize);
        for (int j = 0; j < rightSize; ++j)
            rightArray[j] = origArray[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = l;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                origArray[k] = leftArray[i];
                i++;
            } else {
                origArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftSize) {
            origArray[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightSize) {
            origArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    private static void sort(int[] origArray, int l, int r) {
        if (l < r) {
            // Find the middle point
            int middle = l + (r - l) / 2;

            // Sort first and second halves
            sort(origArray, l, middle);
            sort(origArray, middle + 1, r);

            // Merge the sorted halves
            merge(origArray, l, middle, r);
        }
    }
}
