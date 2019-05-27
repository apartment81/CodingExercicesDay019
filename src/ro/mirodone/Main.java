package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        RomanNumber romanNumber = new RomanNumber();
        String string = "M";
        int result = romanNumber.RomanNumber(string);

      System.out.println("\nRoman Number: "+string);
        System.out.println("Equivalent Integer: "+result+"\n");

    }
}
