import java.util.ArrayList;

public class MaxnumArray {
    //This class is created to retrieve the max element in the Array without sorting.

    public static void main(String[] args) {

        int[] arr = {45,67,21,43,56,19};
        int max = arr[0];
        for(int num:arr){
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Maxmium number: "+max);
    }
}
