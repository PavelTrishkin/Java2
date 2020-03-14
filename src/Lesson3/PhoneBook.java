package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, Person> directory = new HashMap<>();
    HashMap<String, Person> numbersList;
//    List<String> eMailList;

    public void add(String surName, String number, String eMail){
//        if (directory.containsKey(surName)) {
//            numbersList = directory.get(surName);

//
//        } else {
//            numbersList = new ArrayList<>();
//            numbersList.add(number.toString());
//            directory.put(surName, person);
//        }
        directory.put(surName, new Person(number,eMail));
    }

//    public void numberList(){
//        System.out.println(directory);
//    }

//    public List<String> get(String surname) {
//        for (String key : directory.keySet()) {
//
//        }
//    }
}
