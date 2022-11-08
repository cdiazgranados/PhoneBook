package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this(new LinkedHashMap<String, List<String>>()); //why hash map?
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, new ArrayList<String>());
//        phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, new ArrayList<String>(List.of(phoneNumbers)));
//        phonebook.get(name).add(phoneNumber);
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        return null;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        Set<String> keys = getMap().keySet();
        List<String> result = new ArrayList<>(keys);
        return result;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
