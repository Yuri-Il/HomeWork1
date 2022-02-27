package com.example.homework1.Part1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 2,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"},
        d2 = {"buy", "", "publication", "Lcom/example/homework1/Part1/Publication;", "main", "HomeWork1.app"}
)
public final class File1 {
    public static final void buy(@Nullable PublicationJava publication) {
        String var1 = "The purchase is complete. The purchase amount was " + (publication != null ? publication.getPrice() : null);
        System.out.println(var1);
    }

    public static final void main() {
        BookJava myBook = new BookJava(10, 500);
        BookJava myFavouriteBook = new BookJava(500, 8000);
        MagazineJava myMagazine = new MagazineJava(5, 400);
        myBook.getInfo();
        myFavouriteBook.getInfo();
        myMagazine.getInfo();
        String var3 = "Сравнение по ссылке: " + (myBook == myFavouriteBook);
        System.out.println(var3);
        var3 = "Сравнение методом equals: " + myBook.equals(myFavouriteBook);
        System.out.println(var3);
        BookJava notNullBook = new BookJava(1, 1);
        BookJava nullBook = (BookJava)null;
        buy((PublicationJava)notNullBook);
        buy((PublicationJava)nullBook);

        //?
        Function2 sum = (Function2)null.INSTANCE;
        sum.invoke(5, 4);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}
