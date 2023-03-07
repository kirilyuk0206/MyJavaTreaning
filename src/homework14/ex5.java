package homework14;

public class ex5 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the lenght method.";
        String[] words = string.toLowerCase().split("a");
        System.out.println(words.length-1);
    }
}
