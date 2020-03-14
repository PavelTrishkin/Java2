package Lesson3;


import java.util.HashSet;


public class Person{
    String phoneNumber;
    String eMail;
    public HashSet<String> phoneNumbers;
    public HashSet<String> eMailList;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return eMail;
    }

    public Person(String phoneNumber, String eMail) {
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return " phoneNumber: " + phoneNumber + ", eMail: " + eMail;
    }

}
