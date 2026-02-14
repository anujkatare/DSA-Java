public class demo {
    public static int partition(int[] array, int low, int high) {
        int pivot = array[low]; 
        int i = low;
        int j = high;

        while (i < j) {
           
            while (array[i] <= pivot && i <= high - 1) {
                i++;
            }

            
            while (array[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

       
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        return j;
    }

    public static void QuickSort(int[] array, int low, int high) {
      
        if (low < high) {
            int p = partition(array, low, high);

            
            QuickSort(array, low, p - 1);
            QuickSort(array, p + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 10, 8};
        
        QuickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}