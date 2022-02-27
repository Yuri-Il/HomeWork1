package com.example.homework1.Part1;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public final class BookJava implements PublicationJava {
    private final int price;
    private final int wordCount;

    @NotNull
    public String getType() {
        return this.getWordCount() <= 1000 ? "Flash Fiction" : (this.getWordCount() <= 7500 ? "Short Story" : "Novel");
    }

    public boolean equals(@Nullable Object other) {
        if ((BookJava)this == other) {
            return true;
        } else if (other != null && !(Intrinsics.areEqual(other.getClass(), this.getClass()) ^ true)) {
            return other instanceof BookJava && this.getPrice() == ((BookJava)other).getPrice() && this.getWordCount() == ((BookJava)other).getWordCount() && Intrinsics.areEqual(this.getType(), ((BookJava)other).getType());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.getPrice();
        result = 31 * result + this.getWordCount();
        return result;
    }

    public int getPrice() { return this.price;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public BookJava(int price, int wordCount) {
        this.price = price;
        this.wordCount = wordCount;
    }

    public void getInfo() {
        DefaultImpls.getInfo(this);
    }
}

