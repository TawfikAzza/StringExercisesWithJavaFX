package com.tazza;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringExercises {
    public String exercise1(String input) {
        return "<"+input+">";
    }

    public String exercise2(String input) throws IOException {

        return String.valueOf(input.length());
    }
    public String exercise3(String input) throws IOException {
        //System.out.println("Exercise 3 placement of special character \'@\' between the letters :");
        //System.out.println("Enter a name/word :");
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String input = reader.readLine();

        String text="";
        for(int i=0;i<input.length()-1;i++){
            text += input.charAt(i)+"@";
        }
        text+=input.charAt(input.length()-1);
        return "Result : "+text;
    }
    public String exercise4(String input) throws IOException {
        /*System.out.println("Exercise 4 :");
        System.out.println("Enter a name/word you wish to inverse:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text="";
        for(int i = input.length()-1;i>=0;i--){
            text+=input.charAt(i);
        }
        return "Result : "+text;
    }

    public String exercise5(String input) throws IOException {
        List<CodeMorse> codeMorseList = new ArrayList<CodeMorse>();
        codeMorseList.add(new CodeMorse("a",".- "));
        codeMorseList.add(new CodeMorse("b","-... "));
        codeMorseList.add(new CodeMorse("c","-.-. "));
        codeMorseList.add(new CodeMorse("d","-.. "));
        codeMorseList.add(new CodeMorse("e",". "));
        codeMorseList.add(new CodeMorse("f","..-. "));
        codeMorseList.add(new CodeMorse("h",".... "));
        codeMorseList.add(new CodeMorse("i",".. "));
        codeMorseList.add(new CodeMorse("j",".--- "));
        codeMorseList.add(new CodeMorse("k","-.- "));
        codeMorseList.add(new CodeMorse("l",".-.. "));
        codeMorseList.add(new CodeMorse("m","-- "));
        codeMorseList.add(new CodeMorse("n","-. "));
        codeMorseList.add(new CodeMorse("o","--- "));
        codeMorseList.add(new CodeMorse("p",".--. "));
        codeMorseList.add(new CodeMorse("q","--.- "));
        codeMorseList.add(new CodeMorse("r",".-. "));
        codeMorseList.add(new CodeMorse("s","... "));
        codeMorseList.add(new CodeMorse("t","- "));
        codeMorseList.add(new CodeMorse("u","..- "));
        codeMorseList.add(new CodeMorse("v","...- "));
        codeMorseList.add(new CodeMorse("w",".-- "));
        codeMorseList.add(new CodeMorse("x","-..- "));
        codeMorseList.add(new CodeMorse("y","-.-- "));
        codeMorseList.add(new CodeMorse("z","-.-- "));
        codeMorseList.add(new CodeMorse(" ","/"));

       /* System.out.println("Exercise 5, Please provide a sentence you wish to translate in morse :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text="";

        int i;
        int j;

        for(i = 0; i<input.length(); i++){
            if(String.valueOf(input.charAt(i)).equals("\32")){
                text+="/";
            }
            for(j = 0; j<codeMorseList.size(); j++){
                if(codeMorseList.get(j).getLetter().equals(String.valueOf(input.charAt(i)))){
                    text+=codeMorseList.get(j).getCode();
                }
            }
        }

        return "Result : "+text;

    }

    public String exercise6(String input) throws IOException {
        /*System.out.println("Exercise 6 : Please enter a sentence with the words horse/saddle/spores to replace by ****");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        input = input
                .replaceAll("horse","*****")
                .replaceAll("saddle","******")
                .replaceAll("spores","******");

        return "Result :"+input;
    }

    public String exercise7(String input) throws IOException {
        /*System.out.println("Exercise 7 : Please enter the name or sentence that you want inverted and glued :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text = "";
        for(int i = input.length()-1;i>=0;i--){
            text+=input.charAt(i);
        }
        String finalText = input.toString()+text;
        return "Result :"+finalText;
    }
    public String exercise8(String input) throws IOException{
        /*System.out.println("Exercise 8 : Please enter the name or sentence that you want the case alternated :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text="";
        boolean stringUpped=false;
        for(int i=0;i<input.length();i++){
            if(String.valueOf(input.charAt(i)).equals(" ")){
                text+=" ";
            } else {
                if(stringUpped){
                    text+=input.toLowerCase().charAt(i);
                    stringUpped=false;
                } else {
                    text+= input.toUpperCase().charAt(i);
                    stringUpped=true;
                }
            }
        }
        return "Result :"+text;
    }

    public String exercise9(String input) throws IOException {
        List<CodeMorse> code1337List = new ArrayList<CodeMorse>();
        code1337List.add(new CodeMorse("A", "4"));
        code1337List.add(new CodeMorse("B", "|3"));
        code1337List.add(new CodeMorse("C", "("));
        code1337List.add(new CodeMorse("D", "|)"));
        code1337List.add(new CodeMorse("E", "3"));
        code1337List.add(new CodeMorse("F", "|="));
        code1337List.add(new CodeMorse("G", "6"));
        code1337List.add(new CodeMorse("H", "|-|"));
        code1337List.add(new CodeMorse("I", "|"));
        code1337List.add(new CodeMorse("J", "9"));
        code1337List.add(new CodeMorse("K", "|<"));
        code1337List.add(new CodeMorse("L", "1"));
        code1337List.add(new CodeMorse("M", "|v|"));
        code1337List.add(new CodeMorse("N", "|/|"));
        code1337List.add(new CodeMorse("O", "0"));
        code1337List.add(new CodeMorse("P", "|*"));
        code1337List.add(new CodeMorse("Q", "0,"));
        code1337List.add(new CodeMorse("R", "|2"));
        code1337List.add(new CodeMorse("S", "5"));
        code1337List.add(new CodeMorse("T", "7"));
        code1337List.add(new CodeMorse("U", "|_|"));
        code1337List.add(new CodeMorse("V", "|/"));
        code1337List.add(new CodeMorse("W", "|/|/"));
        code1337List.add(new CodeMorse("X", "><"));
        code1337List.add(new CodeMorse("Y", "`/"));
        code1337List.add(new CodeMorse("Z", "2"));

        /*System.out.println("Exercise 9 : Please enter the name or sentence that you want to 1337 :) :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text="";


        int i;
        int j;

        for(i = 0; i<input.length(); i++){
            if(String.valueOf(input.charAt(i)).equals(" ")){
                text+=" ";
            }
            for(j = 0; j<code1337List.size(); j++){
                if(code1337List.get(j).getLetter().equals(String.valueOf(input.toUpperCase().charAt(i)))){
                    text+=code1337List.get(j).getCode();
                }
            }
        }
        return "Result : "+text;
    }
    public String exercise10(String input, String inputAllowed) throws IOException {

        /*System.out.println("Exercise 10 : Please enter the name or sentence that you want to process :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/

        /*System.out.println("Please enter the characters that you allow to exist in the next realm (case sensitive):");
        BufferedReader readerAllowed = new BufferedReader(new InputStreamReader(System.in));
        String inputAllowed = readerAllowed.readLine();*/
        String text="";
        boolean changedChar;
        for(int i=0;i<input.length();i++){
            changedChar=false;
            if(String.valueOf(input.charAt(i)).equals(" ")){
                text+=" ";
            }
            for(int j=0;j<inputAllowed.length();j++){
                if(String.valueOf(input.charAt(i)).equals(String.valueOf(inputAllowed.charAt(j)))) {
                    text+=input.charAt(i);
                    changedChar=true;
                }
            }
            if(!changedChar){
                text+="x";
            }
        }
        return "Result :"+text;
    }

    public String exercise11(String input) throws IOException {
       /* System.out.println("Exercise 11 : Please enter the name or sentence that you want to process through a multiplier :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/

        String text="";
        boolean multiplier=false;
        for(int i=0;i<input.length();i++){
            if(!multiplier) {
                if (String.valueOf(input.charAt(i)).equals(" ")) {
                    text += " ";
                }

                if (String.valueOf(input.charAt(i)).equals("*")) {
                    multiplier = true;
                } else {
                    text += input.charAt(i);
                }
            }
            if(multiplier && !String.valueOf(input.charAt(i)).equals("*") && !String.valueOf(input.charAt(i)).equals(" ")){
                int repeat = Integer.parseInt(String.valueOf(input.charAt(i)));
                for(int k=0;k<repeat-1;k++) {
                    text+=text;
                }
                multiplier=false;
            }
        }
        return "Result :"+text;
    }

    public String exercise12(String input) throws IOException {
       /* System.out.println("Exercise 12 : Please enter the name or sentence that you want to process in order to find the value longest repeating character :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text="";
        String longestText="";
        int longestChain=0;
        int tmpLongestChain=1;
        char compareChar=':';
        int test=0;
        int i=0;
        compareChar=input.charAt(0);
        for(i=0;i<input.length();i++){
            if(compareChar==input.charAt(i)) {
                tmpLongestChain++;

                text+=input.charAt(i);
            } else {
                tmpLongestChain=1;
            }
            text="";
            compareChar=input.charAt(i);

            if(tmpLongestChain>longestChain) {
                longestChain = tmpLongestChain;
                longestText=text;
            }
        }

        return "Result the longest chain is "+longestChain+" long ";
    }

    public String exercise13(String input) throws IOException{
        List<WordInv> invWordList = new ArrayList<WordInv>();
        invWordList.add(new WordInv(" will "," won't "));
        invWordList.add(new WordInv(" should "," shouldn't "));
        invWordList.add(new WordInv(" can "," can't "));
        invWordList.add(new WordInv(" have "," haven't "));
        invWordList.add(new WordInv(" has "," hasn't "));
        invWordList.add(new WordInv(" did "," didn't "));
        invWordList.add(new WordInv(" do "," don't "));
        invWordList.add(new WordInv(" does "," doesn't "));
        invWordList.add(new WordInv(" must "," mustn't "));
        invWordList.add(new WordInv(" may "," may not "));
        invWordList.add(new WordInv(" am "," am not "));
        invWordList.add(new WordInv(" will "," won't "));
        invWordList.add(new WordInv(" is "," is not "));
        invWordList.add(new WordInv(" are "," are not "));
        invWordList.add(new WordInv(" like "," don't like "));
        // boolean hasChangedSentence=false;
        /*System.out.println("Exercise 13 : Please enter the sentence you wish to inverse the meaning of (test the range of words is limited):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();*/
        String text = input;
        for(int i=0;i<invWordList.size();i++){

            text=text.replaceFirst(invWordList.get(i).getWord(),invWordList.get(i).getInvWord());

        }
        //TODO : add more words in the dictionary

        return "Result :"+text;
    }

    public int exercise14(int x, int length) {
        return x+(length-1)>(length-1)?x=(x+length-1)%length:x;
    }
    //TODO, Not enough time man and JavaFX is f***ing waiting....
    public String exerciseTest(String input) throws IOException{
        ArrayList<NameMask> masks = new ArrayList();
        NameMask nm1= new NameMask("horse","*****");
        NameMask nm2= new NameMask("saddle","******");
        NameMask nm3= new NameMask("spores","******");

        masks.add(nm1);
        masks.add(nm2);
        masks.add(nm3);
        String text="";

        for (NameMask nm: masks) {
            input=input.replaceAll(nm.getName(),nm.getMask());

        }

        return input;
    }

}
