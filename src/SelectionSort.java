import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,6,9,1,63,44};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;

            for (int j = i + 1; j < arr.length; j++ ){
                if (arr[j] < arr[min]){
                    min = j;
                    //min_i = j;
                }
            }
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
        }
    }
}
