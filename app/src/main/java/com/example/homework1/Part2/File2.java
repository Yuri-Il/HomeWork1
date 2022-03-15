package com.example.homework1.Part2;

import com.example.homework1.Part2.Action.Login;
import com.example.homework1.Part2.Action.Logout;
import com.example.homework1.Part2.Action.Registration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 6, 0},
        k = 2,
        d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000\u001a\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f\u001a\u0006\u0010\r\u001a\u00020\u0005\u001a\u0006\u0010\u000e\u001a\u00020\u0005\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"},
        d2 = {"authCallback", "Lcom/example/homework1/Part2/AuthCallback;", "getAuthCallback", "()Lcom/example/homework1/Part2/AuthCallback;", "auth", "", "update", "Lkotlin/Function0;", "user", "Lcom/example/homework1/Part2/User;", "doAction", "action", "Lcom/example/homework1/Part2/Action;", "main", "updateCache", "validAge", "HomeWork1.app"}
)
public final class File2 {
    @NotNull
    private static final AuthCallback authCallback = (AuthCallback)(new AuthCallback() {
        public void authSuccess() {
            String var1 = "Authorization successed";
            System.out.println(var1);
        }

        public void authFailed() {
            String var1 = "Authorization failed";
            System.out.println(var1);
        }
    });

    public static final void validAge(@NotNull UserJava $this$validAge) throws Throwable {
        Intrinsics.checkNotNullParameter($this$validAge, "$this$validAge");
        if ($this$validAge.getAge() >= 18) {
            String var1 = $this$validAge.getName() + "'s age is valid";
            System.out.println(var1);
        } else {
            throw (Throwable)(new Exception("Age is not valid"));
        }
    }

    @NotNull
    public static final AuthCallback getAuthCallback() {
        return authCallback;
    }

    public static final void updateCache() {
        String var0 = "Cache updated";
        System.out.println(var0);
    }

    public static final void auth(@NotNull Function0 update, @NotNull UserJava user) throws Throwable {
        int $i$f$auth = 0;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(user, "user");

        try {
            validAge(user);
            getAuthCallback().authSuccess();
            update.invoke();
        } catch (Exception var4) {
            System.out.println(var4);
            getAuthCallback().authFailed();
        }

    }

    public static final void doAction(@NotNull ActionJava action) throws Throwable {
        Intrinsics.checkNotNullParameter(action, "action");
        String var6;
        if (action instanceof ActionJava.LoginJava) {
            UserJava user$iv = ((ActionJava.LoginJava)action).getUser();
            boolean var3 = false;

            try {
                validAge(user$iv);
                getAuthCallback().authSuccess();
                boolean var4 = false;
                updateCache();
            } catch (Exception var5) {
                System.out.println(var5);
                getAuthCallback().authFailed();
            }

            var6 = "You have logged in";
            System.out.println(var6);
        } else if (action instanceof ActionJava.LogoutJava) {
            var6 = "You have logged out";
            System.out.println(var6);
        } else if (action instanceof ActionJava.RegistrationJava) {
            var6 = "You have registered";
            System.out.println(var6);
        }

    }

    public static final void main() throws Throwable {
        UserJava myUser = new UserJava(1, "Tom", 18, TypeJava.FULL);
        String var1 = myUser.getStartTime();
        System.out.println(var1);
        Thread.sleep(1000L);
        var1 = myUser.getStartTime();
        System.out.println(var1);
        List users = CollectionsKt.mutableListOf(new UserJava[]{myUser});
        boolean $i$f$forEach = false;
        users.add(new UserJava(2, "Max", 16, TypeJava.FULL));
        users.add(new UserJava(3, "Bob", 20, TypeJava.DEMO));
        Iterable $this$forEach$iv = (Iterable)users;
        $i$f$forEach = false;
        Collection destination$iv$iv = (Collection)(new ArrayList());
        boolean $i$f$filterTo = false;
        Iterator var8 = $this$forEach$iv.iterator();

        while(var8.hasNext()) {
            Object element$iv$iv = var8.next();
            UserJava it = (UserJava)element$iv$iv;
            boolean var11 = false;
            if (it.getType() == TypeJava.FULL) {
                destination$iv$iv.add(element$iv$iv);
            }
        }

        List fullUsers = (List)destination$iv$iv;
        String var13 = "Full users: ";
        System.out.print(var13);
        $this$forEach$iv = (Iterable)fullUsers;
        $i$f$forEach = false;
        Iterator var5 = $this$forEach$iv.iterator();

        while(var5.hasNext()) {
            Object element$iv = var5.next();
            UserJava it = (UserJava)element$iv;
            boolean var22 = false;
            String var24 = it.getName() + ' ';
            System.out.print(var24);
        }

        System.out.println();
        List userNames = (List)(new ArrayList());
        $this$forEach$iv = (Iterable)users;
        $i$f$forEach = false;
        Iterator var19 = $this$forEach$iv.iterator();

        while(var19.hasNext()) {
            Object element$iv = var19.next();
            UserJava it = (UserJava)element$iv;
            boolean var25 = false;
            userNames.add(it.getName());
        }

        String var17 = "First user: " + (String)CollectionsKt.first(userNames);
        System.out.println(var17);
        var17 = "Last user: " + (String)CollectionsKt.last(userNames);
        System.out.println(var17);
        doAction((ActionJava) (new ActionJava.RegistrationJava()));
        doAction((ActionJava)(new ActionJava.LoginJava(myUser)));
        doAction((ActionJava)(new ActionJava.LogoutJava()));
    }

    // $FF: synthetic method
    public static void main(String[] var0) throws Throwable {
        main();
    }
}
