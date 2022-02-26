public class numbers16 {
    public static void main(String[] args) {
        StringBuilder numbers16 = new StringBuilder();
        String numbersHEX;
        for (int i = 0; i < 16; i++){
           numbers16.append(Character.forDigit(i,16));
        }
        numbersHEX = numbers16.toString();
        numbersHEX = numbersHEX.toUpperCase();
        System.out.println(numbersHEX);
    }
}
