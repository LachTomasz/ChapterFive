public class BackwardsStr2 {
    public static void main(String[] args) {
        String text = "programming";
        String text1 = "";
        System.out.println("Before changing");
        System.out.println(text);
        System.out.println("*******************************");
        for (int i = text.length()-1 ; i >= 0; i--) {
            text1 = text1+text.charAt(i);
        }
        text = text1;
        System.out.println("After changed");
        System.out.println(text);
        System.out.println("*******************************");
    }
}
