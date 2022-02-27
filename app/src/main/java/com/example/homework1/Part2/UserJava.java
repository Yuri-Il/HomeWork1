package com.example.homework1.Part2;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0005R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"},
        d2 = {"Lcom/example/homework1/Part2/User;", "", "id", "", "name", "", "age", "type", "Lcom/example/homework1/Part2/Type;", "(ILjava/lang/String;ILcom/example/homework1/Part2/Type;)V", "getAge", "()I", "getId", "getName", "()Ljava/lang/String;", "startTime", "getStartTime", "startTime$delegate", "Lkotlin/Lazy;", "getType", "()Lcom/example/homework1/Part2/Type;", "getstartTime", "HomeWork1.app"}
)
public final class UserJava {
    @NotNull
    private final Lazy startTime$delegate;
    private final int id;
    @NotNull
    private final String name;
    private final int age;
    @NotNull
    private final TypeJava type;

    @NotNull
    public final String getStartTime() {
        Lazy var1 = this.startTime$delegate;
        Object var3 = null;
        return (String)var1.getValue();
    }

    @NotNull
    public final String getstartTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String currentTime = sdf.format(new Date());
        Intrinsics.checkNotNullExpressionValue(currentTime, "currentTime");
        return currentTime;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final TypeJava getType() {
        return this.type;
    }

    public UserJava(int id, @NotNull String name, int age, @NotNull TypeJava type) {
        super();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");

        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.startTime$delegate = LazyKt.lazy((Function0)(new Function0() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object invoke() {
                return this.invoke();
            }

            @NotNull
            public final String invoke() {
                return UserJava.this.getstartTime();
            }
        }));
    }
}
