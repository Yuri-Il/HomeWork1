package com.example.homework1.Part2;

import kotlin.Metadata;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"},
        d2 = {"Lcom/example/homework1/Part2/AuthCallback;", "", "authFailed", "", "authSuccess", "HomeWork1.app"}
)
public interface AuthCallbackJava {
    void authSuccess();

    void authFailed();
}
