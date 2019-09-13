package Test0906;



public class Test {
    //插入排序
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int key = array[i + 1];
            int j;
            for (j = i; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    //希尔排序
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (true) {
            gap = gap / 3 + 1;
            insertSortWithGap(array, gap);
            if (gap == 1) {
                return;
            }
        }
    }

    private static void insertSortWithGap(int[] array, int gap) {
        for (int i = 0; i < array.length - 1; i++) {
            int key = array[i + gap];
            int j;
            for (j = i; j >= 0 && array[j] > key; j -= gap) {
                array[j + gap] = array[j];
            }
            array[j + gap] = key;
        }
    }

    //选择排序
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] >= array[max]) {
                    max = j;
                }
            }
            swap(array, max, array.length - i - 1);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int count = array[i];
        array[i] = array[j];
        array[j] = count;
    }

    //堆排序
    public static void heapSort(int[] array) {
        createHeap(array, array.length);
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, 0, array.length - i - 1);
            heapifyMax(array, array.length - i - 1, 0);
        }
    }

    private static void heapifyMax(int[] array, int size, int index) {
        while (true) {
            int left = 2 * index + 1;
            if (left >= size) {
                return;
            }
            int max = left;
            if (left + 1 < size && array[left + 1] > array[left]) {
                max = left + 1;
            }
            if (array[max] <= array[index]) {
                return;
            }
            swap(array, max, index);
            index = max;
        }
    }

    private static void createHeap(int[] array, int size) {
        int parent = (size - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapifyMax(array, array.length, i);
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean travel = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    travel = false;
                }
            }
            if (travel == true) {
                break;
            }
        }
    }












}
