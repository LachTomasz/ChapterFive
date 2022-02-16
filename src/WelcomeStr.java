public class WelcomeStr {
    public static void main(String[] args) {
        String text = new String("Dzien dobry / Hallo / Hello");
        //vertically, each character on a separate line
        System.out.println("**********************************************");
        System.out.println("vertically");
        System.out.println("**********************************************");
        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
        //horizontally - characters separated by additional spaces
        System.out.println("**********************************************");
        System.out.println("horizontally");
        System.out.println("**********************************************");
        System.out.println(text);
        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("**********************************************");
        //Big letters
        System.out.println(text.toUpperCase());
        System.out.println("**********************************************");
        //Small letters
        System.out.println(text.toLowerCase());
        System.out.println("**********************************************");
        System.out.println();
    }
}
