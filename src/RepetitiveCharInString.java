import java.util.Arrays;

public class RepetitiveCharInString {

    public void stringDuplciates(String str) {

       char[] strArr = str.toCharArray();
       Arrays.sort(strArr);
       for(int i=0;i<strArr.length;){

           int count =1;
           while(i+count < strArr.length && strArr[i] == strArr[i+count]){
                count++;
           }
           if(count>1){
               System.out.println(strArr[i]+" is entered "+count+" times in word: "+str);
           }
           i +=count;
       }
    }

    public static void main(String[] args) {
        String input = "repetitive";
        RepetitiveCharInString obj = new RepetitiveCharInString();
        obj.stringDuplciates(input);

    }
}
