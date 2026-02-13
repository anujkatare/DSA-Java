public class demo {

    public static void merge(int[] array, int low, int mid, int high) {

    int[] temp = new int[high - low + 1];

    int left = low;
    int right = mid + 1;
    int index = 0;

    while (left <= mid && right <= high) {
        if (array[left] <= array[right]) {
            temp[index] = array[left];
            left++;
        } else {
            temp[index] = array[right];
            right++;
        }
        index++;
    }

    while (left <= mid) {
        temp[index++] = array[left++];
    }

    while (right <= high) {
        temp[index++] = array[right++];
    }

    for (int i = 0; i < temp.length; i++) {
        array[low + i] = temp[i];
    }
}

    public static void mergeSort(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void main(String[] args) {

        int[] array = {2, 4, 9, 5, 3};

        mergeSort(array, 0, array.length - 1);

       
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
