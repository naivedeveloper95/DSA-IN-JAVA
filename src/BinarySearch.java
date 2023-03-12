public class BinarySearch {
    public static void main(String[] args) {

        int[] array = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println("Target " + target + " not found!");
        } else {
            System.out.println("Target found at index " + index + ".");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = array[mid];

            System.out.println("Mid value is " + midValue);

            if (midValue < target) {
                low = mid + 1;
            } else if (midValue > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
