package com.tazza;

import java.io.IOException;

public class NameMask implements IwordModel{


    private String name;
    private String mask;

    public NameMask(String name, String mask)throws IOException {
        this.name=name;
        this.mask=mask;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }


    @Override
    public String processText(String text) {
        return null;
    }
}
