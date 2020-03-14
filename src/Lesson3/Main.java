package Lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static String[] word = {
            "выпьем", "добрая", "подружка",
            "бедной", "юности", "моей",
            "выпьем", "с", "горя", "где", "же", "кружка",
            "сердцу", "будет", "веселей",
            "спой", "мне", "песню", "как", "синица",
            "тихо", "за", "морем", "жила",
            "спой", "мне", "песню", "как", "девица",
            "за", "водой", "поутру", "шла"
    };

    public static void wordList(String [] str) {
        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            words.add(str[i]);
        }
        System.out.println(words);
    }

    public static void sameWord(String [] str ){
        HashMap<String, Integer> word = new HashMap<>();
        for (int i = 0; i < str.length ; i++) {
            if (word.containsKey(str[i])){
                word.put(str[i], word.get(str[i]) + 1);
            }else
                word.put(str[i], 1);
        }
        System.out.println(word);
    }


    public static void main(String[] args) {
        wordList(word);
        sameWord(word);
//
//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.add("Ivanov", "54", "464@lmaskdm.ru");
//        phoneBook.add("Ivanov", "546", "464@lmaskdm.ru");
//        phoneBook.add("Ivanov", "5465", "464@lmaskdm.ru");
//
////        System.out.println(phoneBook.getDirectory("Ivanov"));
////        System.out.println(phoneBook.getDirectory("Petrov"));
//        phoneBook.numberList();
////        phoneBook.numberList();
    }
}