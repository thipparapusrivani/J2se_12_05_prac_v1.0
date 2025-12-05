public class ReserveWord {

    public static String reverseString(String s)
    {
        StringBuilder ans = new StringBuilder();

        String temp = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                if(!temp.equals("")) {
                    ans.insert(0,temp+" ");
                }
                temp = "";
            } else
                temp += ch;
        }
        return ans.toString().substring(0,ans.length()-1);
    }
    public static void main(String[] args) {
        String str = "Java is super fun ";

        String result = reverseString(str);
        System.out.println("Reversed string is '" +result+ "'");


    }
}
