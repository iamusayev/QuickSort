public class QuickSort {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 1, 4, 5, 432, 542, 4325, 432, 54325, -1};

        quickSort(array, 0, array.length - 1);
        for (int ar : array) System.out.println(ar);
    }

    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);
            
            quickSort(arr, divideIndex, to);

        }

    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int privot = arr[from];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < privot) {
                leftIndex++;
            }
            while (arr[rightIndex] > privot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }


    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;

    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
