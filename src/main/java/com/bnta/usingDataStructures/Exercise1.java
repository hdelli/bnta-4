package com.bnta.usingDataStructures;
//Exercise details:
//Given the follwing array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
//Find the element that has the most number of occurences
//Your method should return something like the 1 since it occurs 4 times
//Think about the datastructure that you should use
//Create a method. Think about the return type and parameters
//Write unit tests for your method



//method using just arrayList: <note this is less sufficient>
//Once you have arrayList (with number of occurance) > use Array.max
//returns String number + "because it occurs" occurance

//ArrayList Method
//1. create string array
//Method
//input = string of numbers
//returns = String --> number + "because it occurs" + " occurance + 'times"
//2. take in string array
//3. split comma and store in array
//4. loop through the strings and then convert to int
//ListValue = Position = increase
//List[1] = increase by
// List
//create a function to get max size

import java.util.Arrays;
import java.util.HashMap;

public class Exercise1 {

    public static void main(String[] args) {
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";


        countOccurrences(input); //called it but have not stored it
        //HashMap <Keytype, value type>


        HashMap<String, Integer> hashOccurrences = countOccurrences(input);

        // when we create a hashmap we create the keytype and a value type; once you have set it you cant change it

        System.out.println(hashOccurrences.keySet()); // returning the number of keys created for the string input


        for (String key: hashOccurrences.keySet()){
            //this displays it nicely

            System.out.println(key+ "=" + hashOccurrences.get(key)); // this will return each string value with its keynumber/value
            //we found the key number 1 4x therefore 1=4
            //this is because the for enhanced loop we have assigned each string input a key and each time the string input repeats itself we just +1 to the key value

        }

        getMaxOccurences(hashOccurrences);


        //set a new one
        //else if key exists
        //increment value by one

//Return the hashmap




    }

    private static void getMaxOccurences(HashMap<String, Integer> hashOccurrences) {

        //setting first value as max (initialise storage variables)
        String maxKey =null;
        int maxValue= 0; //hashOccurrences.get("1");
        for (String key: hashOccurrences.keySet()) {
            //loop through all keys
            if (maxKey ==null) {
                //first ever key found i.e 1 then set the value
                maxKey = key;
                maxValue = hashOccurrences.get(key); //corresponding value of that key
            } else if (hashOccurrences.get(key) > maxValue) { //if the corresponding key is higher than the maxvalue- override it
                // if the value for the key is larger than the max value
                //store both the key and the maxvalue

                maxKey =key;
                maxValue = hashOccurrences.get(key);

            }else if (hashOccurrences.get(key) == maxValue) { //if it finds a key that has the same number of value/occurerences then print and concatenated(bring together)
                //e.g 1 and 7 occur 4x
                maxKey = maxKey + " and " + key;
            }

            //get value


            //if maxKey is null - then initilise the values
            //get the value
            // if the valye is larger than maxValue
            //Store both the key and the maxValue
            //
        }

        System.out.println(maxKey + " occurs the most number of times ( " + maxValue + " times" );
    }

    private static HashMap<String, Integer> countOccurrences(String input) {
        //Split the input

        String [] strArr = input.split(",");
        System.out.println(Arrays.toString(strArr));


        //initialisw HashMpa to store count

        HashMap<String, Integer> countMap= new HashMap<>();

        //loop through the splitArray
        //.keyset gives you all the keys in the array

        for (String keynumber : strArr){
            //if key doesnt exist

            if (!countMap.containsKey(keynumber)){
                countMap.put(keynumber,1); //create a key and set it to one
            } else { //if it has a key already plus 1

                int updatedValue = countMap.get(keynumber) + 1;
                countMap.put(keynumber,updatedValue);
            }

        }
        return countMap;
    }


}

/*


    public static void main(String[] args) {

//        //Parenthesis Checker
//        // Take input String
//        String brackets = "[{{[(){}]}}[]{}{{(())}}]";
//        DataStructuresAndAlgorithms dataStructuresAndAlgorithms = new DataStructuresAndAlgorithms();
//        dataStructuresAndAlgorithms.isBalanced(brackets);


        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";

        // HashMap<Key, Value>
        // HashMap<KeyType, ValueType>
        HashMap<String, Integer> returnedCountMap = countOccurrences(input);



        System.out.println(returnedCountMap.keySet());


        for (String key: returnedCountMap.keySet()){
            System.out.println("Current Key is: " + key);
            System.out.println("Current Value is: " + returnedCountMap.get(key));
            System.out.println(key+ " = " + returnedCountMap.get(key));
        }

        // Now lets find max occurance
        // Loop through

        //Assume first value is
        String maxKey = "1";
        int maxValue = returnedCountMap.get("1");
        for (String key: returnedCountMap.keySet()){
//            System.out.println(key+ " = " + countMap.get(key));
            // Loop through all keys
            // get the value
            // if value is larger than maxValue
            // Store both the key and the maxvalue
            //Else if Value == maxValue
            // Contact the String to have both

        }






    }
    private static HashMap<String,Integer> countOccurrences(String input) {
        //Split the input
        String[] strArr = input.split(",");
        System.out.println(Arrays.toString(strArr));

        //Initialise HashMap to store count Key = NumberSting
        HashMap<String, Integer> countMap = new HashMap<>();
        System.out.println(countMap);
        // Loop through the splitArray
        for (String keyNumber : strArr) {

            if (!countMap.containsKey(keyNumber)) {
                // If key doesn't exist
                // Set to one
                countMap.put(keyNumber,1);
//                System.out.println("Creating a new key for: " +keyNumber);
//                System.out.println(countMap);
            } else {
                //Else If key Exists
                // Increment The Value by One
                int updatedValue = countMap.get(keyNumber) + 1;
                countMap.put(keyNumber, updatedValue);
//                System.out.println("Key already exists Updating value for: " +keyNumber);
//                System.out.println(countMap);
            }
        }

        System.out.println(countMap);

        //Return the hashmap
        return countMap;
    }


 */