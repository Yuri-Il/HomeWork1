package com.example.homework1.Part1;

import org.jetbrains.annotations.NotNull;

import java.text.NumberFormat;
import java.util.Currency;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

public interface PublicationJava {
    int getPrice();

    int getWordCount();

    @NotNull
    String getType();

    void getInfo();

    @Metadata(
            mv = {1, 6, 0},
            k = 3
    )
    public static final class DefaultImpls {
        public static void getInfo(@NotNull PublicationJava $this) {
            String var1 = "Type: " + $this.getType();
            System.out.println(var1);
            var1 = "WordCount: " + $this.getWordCount();
            System.out.println(var1);
            NumberFormat nF = NumberFormat.getCurrencyInstance();
            Intrinsics.checkNotNullExpressionValue(nF, "nF");
            nF.setCurrency(Currency.getInstance("EUR"));
            String var2 = "Price: " + nF.format($this.getPrice()) + '\n';
            System.out.println(var2);
        }
    }
}
