public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int size = 6;
        int SumExpected = size * (size+1) /2;
        int actSum = 0;
        for(int num : arr){
            actSum+=num;
        }
    int  missingNum = SumExpected-actSum;
        System.out.println("Missing number is "+missingNum);
    }
}
