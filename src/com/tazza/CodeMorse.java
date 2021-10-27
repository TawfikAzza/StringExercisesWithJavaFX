package com.tazza;

public class CodeMorse {
    private String letter;
    private String code;


    public CodeMorse(String letter, String code) {
        this.letter=letter;
        this.code=code;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
