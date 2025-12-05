public class ReserveWord {

    public static String reverseString(String s)
    {
        StringBuilder ans=new StringBuilder();

        String temp = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                //if we find white space add temp in the start
                if(!temp.equals(""))
                {
                    //adding in the front every time
                    ans.insert(0,temp+" ");
                }

                temp = "";
            }
            else
                temp += ch;
        }

        //just removing the extra space at the end of the ans
        return ans.toString().substring(0,ans.length()-1);

    }
    public static void main(String[] args) {
        String str = "Java fun";


    }
}
