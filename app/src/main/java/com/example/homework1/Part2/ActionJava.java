package com.example.homework1.Part2;


import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"},
        d2 = {"Lcom/example/homework1/Part2/Action;", "", "()V", "Login", "Logout", "Registration", "Lcom/example/homework1/Part2/Action$Login;", "Lcom/example/homework1/Part2/Action$Logout;", "Lcom/example/homework1/Part2/Action$Registration;", "HomeWork1.app"}
)
public abstract class ActionJava {
    private ActionJava() {
    }

    // $FF: synthetic method
    public ActionJava(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"},
            d2 = {"Lcom/example/homework1/Part2/Action$Registration;", "Lcom/example/homework1/Part2/Action;", "()V", "HomeWork1.app"}
    )
    public static final class RegistrationJava extends ActionJava {
        public RegistrationJava() {
            super((DefaultConstructorMarker)null);
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"},
            d2 = {"Lcom/example/homework1/Part2/Action$Login;", "Lcom/example/homework1/Part2/Action;", "user", "Lcom/example/homework1/Part2/User;", "(Lcom/example/homework1/Part2/User;)V", "getUser", "()Lcom/example/homework1/Part2/User;", "HomeWork1.app"}
    )
    public static final class LoginJava extends ActionJava {
        @NotNull
        private final UserJava user;

        @NotNull
        public final UserJava getUser() {
            return this.user;
        }

        public LoginJava(@NotNull UserJava user) {
            super((DefaultConstructorMarker)null);
            Intrinsics.checkNotNullParameter(user, "user");
            this.user = user;
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"},
            d2 = {"Lcom/example/homework1/Part2/Action$Logout;", "Lcom/example/homework1/Part2/Action;", "()V", "HomeWork1.app"}
    )
    public static final class LogoutJava extends ActionJava {
        public LogoutJava() {
            super((DefaultConstructorMarker)null);
        }
    }
}

