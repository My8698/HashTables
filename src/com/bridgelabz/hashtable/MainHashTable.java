package com.bridgelabz.hashtable;
public class MainHashTable {
    public static void main(String[] args) {
        givenASentence_WhenWordAreAddedToList_ShouldReturnParanoidFrequency();
    }
    /**
     * find frequency of word paranoid in given paragraph
     */
    private static void givenASentence_WhenWordAreAddedToList_ShouldReturnParanoidFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid "
                + "but because they keep putting themselves "
                + "deliberately into paranoid avoidable situations";
        MyHashTable<String, Integer> myHashMap = new MyHashTable<>();
        /**
         * split to spit given paragraph in array,each word of para store in seperate arrary index
         */
        String[] words = sentence. toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("paranoid");
        System.out.println(myHashMap);
        System.out.println("Frequency of give word 'paranoid' is " + frequency);
        /**
         * remove word avoidable
         */
        myHashMap.removeKey("avoidable");
        System.out.println("Hash Map after deleting avoidable");
        System.out.println(myHashMap);

    }

}
