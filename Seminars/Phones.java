package Seminars;

import java.util.HashMap;

public class Phones {
    private HashMap<String, String> phones = new HashMap<>();

    void add(String name, String phone) {
        phones.put(name, phone);
    }
    String find(String name) {
        return phones.get(name);
    }



}
