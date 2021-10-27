package com.tazza;

public class WordInv {

    private String word;
    private String invWord;

    public WordInv(String word, String invWord) {
        this.word= word;
        this.invWord=invWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getInvWord() {
        return invWord;
    }

    public void setInvWord(String invWord) {
        this.invWord = invWord;
    }

}
