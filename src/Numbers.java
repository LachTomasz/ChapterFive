public class Numbers {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        for(int i=48; i <58;i++){
            numbers.append((char) i);
        }
        System.out.println(numbers);
    }
}
