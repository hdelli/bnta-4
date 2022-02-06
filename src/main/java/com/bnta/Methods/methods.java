package com.bnta.methods;
// in this example it is telling us how many characters the word has, it can take any argument

//method is only run when called upon
//can be reused again and again
//but it is separated


/*
the main function is to evoke the methods

String result = capitalize("michael"); <--- function

ADD STATIC private(access modifier) String-- *return type* do you want the method to return a string/data type then write the type of data --
use void-- to print something then add a name (inside here you can have 0 or more parameters e.g String input.txt, int input.txt,
String[] inputs etc){} :

static private String capitalize(String input.txt){} <------ a method that will return a String
{ for(int i=0; i<string.length; i++) {
capitals[i] = spring[i].toUpperclass();

NOTE: this is not a void method therefore NEED A RETURN "";
NOTE: you need to add static


static private String[] strings(Strings[] strings) {

return strings.toUppercase();

^^^ this is making an array and capitalise it but because it is an array you cant just make it uppercase
you need to use a for i loop an enhanced loop will only access the value of the stringArray
 */
public class methods {

    public static void main(String[] args) {
        String result = printLength(17);
        System.out.println(result);
    }

    static String printLength(int age) {
        if (age < 16) {
            return "still a child";
        } else {
            return "hooray adult :)";
        }

    }
}


/*
        printLength(name:"Alex");
        printLength(name:"Abdullah");
        printLength(name:"Yang");
    }

    static void printLength(String name) {
        int length = name.length();
        System.out.println(name + " -> " + length);*/









       /* static void printLength(String ) {
        String name = "HELLOOOOOOO";
        int length = name.length();
        System.out.println(name + " -> " + length);*/




        //add void in place after static; it wont return anything


//a method that adds two numbers:
/*public static void main(String[] args) {
    System.out.println(add(10,10));
    Scanner scanner = new Scanner(System.in);
    printQuestionOne();
    int number1 = scanner.nextInt();

}
static public int add(int num1, int num2) {
    int result = num1+num2;
    return result;
        }

        public static void printQuestionOne() {
            System.out.println("Enter first number:");
        */