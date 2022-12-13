package com.bridgelabz.hashtable;
public class MainHashTable {
    public static void main(String[] args) {
        /**
         * static method call
         */
        givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency();
    }
    private static void givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashTable<String, Integer> myHashMap = new MyHashTable<>();
        String[] words = sentence. toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        System.out.println("Frequency of give word 'to' is " + frequency);
    }
}