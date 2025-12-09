public class ReserveStringUsingBuufer {

    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer("Ghjkahdiwu");
        sbuff.reverse();
        String str = sbuff.toString();
        System.out.println(str);

    }
}
