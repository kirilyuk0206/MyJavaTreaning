package homework14;

public class ex3 {
    public static void main(String[] args) {
        String string1 = "\"This line that i want to cut, couse it is too long\"";
        String string2 = string1.substring(0,36) + ("\".");
        String string3 = string2.replace(" i "," don't ") + (" it is perfect\"");
        System.out.println(string2);
        System.out.println("String Lenght :" + string2.length());
        System.out.println(string3);
        System.out.println("String Lenght :" + string2.length());

    }
}
