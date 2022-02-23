public class ProgrammingStr {
    public static void main(String[] args) {
        String text = "programming";
        System.out.println("************************************");
        System.out.println(text);
        System.out.println("************************************");
        System.out.println("First char big letter.");
        System.out.println(text.replace("p","P"));
        System.out.println(text.substring(0,1).toUpperCase() + text.substring(1));
        text = Character.toUpperCase(text.charAt(0)) + text.substring(1);
        System.out.println(text);
        System.out.println("************************************");
        System.out.println("All chars are big letters");
        System.out.println(text.toUpperCase());
        System.out.println("************************************");
    }
}
