package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.qa0;
import defpackage.ta0;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class cb0 {
    private static final cb0 a = d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends cb0 {

        /* renamed from: cb0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class ExecutorC0024a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            ExecutorC0024a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        @Override // defpackage.cb0
        List<? extends qa0.a> a(@Nullable Executor executor) {
            if (executor == null) {
                throw new AssertionError();
            }
            va0 va0Var = new va0(executor);
            return Build.VERSION.SDK_INT >= 24 ? Arrays.asList(sa0.a, va0Var) : Collections.singletonList(va0Var);
        }

        @Override // defpackage.cb0
        public Executor a() {
            return new ExecutorC0024a();
        }

        @Override // defpackage.cb0
        @IgnoreJRERequirement
        boolean a(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }

        @Override // defpackage.cb0
        List<? extends ta0.a> b() {
            return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(ab0.a) : Collections.emptyList();
        }

        @Override // defpackage.cb0
        int c() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static class b extends cb0 {
        b() {
        }

        @Override // defpackage.cb0
        Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // defpackage.cb0
        List<? extends qa0.a> a(@Nullable Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(sa0.a);
            if (executor != null) {
                arrayList.add(new va0(executor));
            } else {
                arrayList.add(ua0.a);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // defpackage.cb0
        boolean a(Method method) {
            return method.isDefault();
        }

        @Override // defpackage.cb0
        List<? extends ta0.a> b() {
            return Collections.singletonList(ab0.a);
        }

        @Override // defpackage.cb0
        int c() {
            return 1;
        }
    }

    cb0() {
    }

    private static cb0 d() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new cb0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cb0 e() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends qa0.a> a(@Nullable Executor executor) {
        return executor != null ? Collections.singletonList(new va0(executor)) : Collections.singletonList(ua0.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Executor a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Method method) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends ta0.a> b() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return 0;
    }
}
