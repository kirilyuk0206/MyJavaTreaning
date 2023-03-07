package homework14;

public class ex4 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String word1 = "Testing";
        String word2 = "is";
        String word3 = "my";
        String word4 = "favourite";
        String word5 = "job";
        int lenght1 = word1.length();
        int lenght2 = word2.length();
        int lenght3 = word3.length();
        int lenght4 = word4.length();
        int lenght5 = word5.length();
        boolean result = (lenght1>lenght2)&&(lenght1>lenght3)&&(lenght1>lenght4)&&(lenght1>lenght5);
        System.out.println("Слово1 = "+ word1+ ", Длина этого слова = "+ lenght1);
        System.out.println("Слово2 = "+ word2+ ", Длина этого слова = "+ lenght2);
        System.out.println("Слово3 = "+ word3+ ", Длина этого слова = "+ lenght3);
        System.out.println("Слово4 = "+ word4+ ", Длина этого слова = "+ lenght4);
        System.out.println("Слово5 = "+ word5+ ", Длина этого слова = "+ lenght5);
        System.out.println(result);



    }
}
