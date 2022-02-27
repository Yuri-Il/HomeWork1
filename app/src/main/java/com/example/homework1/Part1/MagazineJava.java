package com.example.homework1.Part1;

import org.jetbrains.annotations.NotNull;

 public final class MagazineJava implements PublicationJava {
    private final int price;
    private final int wordCount;

    @NotNull
    public String getType() {
        return "Magazine";
    }

    public int getPrice() {
        return this.price;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public MagazineJava(int price, int wordCount) {
        this.price = price;
        this.wordCount = wordCount;
    }

    public void getInfo() {
        DefaultImpls.getInfo(this);
    }
}
