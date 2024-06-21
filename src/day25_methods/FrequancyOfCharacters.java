package day25_methods;

public class FrequancyOfCharacters {
    public static void main(String[] args) {

        String word = "apple";
        char letter = 'p';
int num = frequancyOfCharacters(word,letter);
        System.out.println(frequancyOfCharacters("LOOpcamp", 'O'));

        System.out.println(frequancyOfCharacters("Wednesday", 'e'));
    }
public static int frequancyOfCharacters(String word, char letter){
        int count =0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(0)==letter ) {
                count++;
            }


        }
return count;
    }

}
