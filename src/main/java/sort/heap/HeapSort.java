package sort.heap;

public class HeapSort {
    private HeapSort() {
        // Private constructor to prevent instantiation
    }

    public static void sort(int[] array) {
        buildMaxHeap(array);
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private static void printArray(int[] array) {
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;i < array.length;++i) {
            if (i == array.length - 1){
                sb.append(array[i]).append("]");
            } else {
                sb.append(array[i]).append(", ");
            }
        }
        System.out.println(sb.toString());
    }

    private static void heapify(int[] array, int rightMargin, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < rightMargin && array[left] > array[largest]) {
            largest = left;
        }

        if (right < rightMargin && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, rightMargin, largest);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = (n/2-1); i >= 0;i--) {
            heapify(array, n, i);
        }
    }
}
