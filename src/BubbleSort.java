import javax.naming.PartialResultException;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] m = {5,6,9,7,3};
        System.out.println(Arrays.toString(m));
        BubbleSort.sort(m);
        System.out.println(Arrays.toString(m));

    }
        public static void sort(int[] array){
            for (int i=0; i<array.length-1; i++){
                for (int j = array.length-1; j>i; j--){
                    if (array[j-1]<array[j]){
                        int temp = array[j-1];
                        array[j-1]=array[j];
                        array[j]=temp;
                    }
                }
            }
        }


}
