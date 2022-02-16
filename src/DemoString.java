public class DemoString {
    public static void main(String[] args) {
        String text = new String("Zadania z programowania / programming tasks.");
        System.out.println("Zadania z programowania / programming tasks.");
        System.out.println(text.charAt(0));
        System.out.println(text.length());
        System.out.println(text.charAt(24));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.indexOf('z'));
        System.out.println(text.indexOf("prog"));
        System.out.println(text.replace('.','?'));
        System.out.println(text.replace("adania","dania"));
        System.out.println(text.replaceAll("ania","anka"));
        System.out.println(text.replaceFirst("ania","anka"));
        System.out.println(text.substring(10));
        System.out.println(text.substring(10,17));
        System.out.println(text.concat("\b z podpowiedziami"));
        System.out.println(text+"\b"+" z odpowiedziami");
    }
}
