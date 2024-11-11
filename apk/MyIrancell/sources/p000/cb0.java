package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
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
import p000.qa0;
import p000.ta0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class cb0 {

    /* renamed from: a */
    private static final cb0 f2990a = m3641d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cb0$a */
    /* loaded from: classes.dex */
    public static class C0515a extends cb0 {

        /* renamed from: cb0$a$a */
        /* loaded from: classes.dex */
        static class a implements Executor {

            /* renamed from: a */
            private final Handler f2991a = new Handler(Looper.getMainLooper());

            a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f2991a.post(runnable);
            }
        }

        C0515a() {
        }

        @Override // p000.cb0
        /* renamed from: a */
        List<? extends qa0.AbstractC3120a> mo3644a(@Nullable Executor executor) {
            if (executor == null) {
                throw new AssertionError();
            }
            va0 va0Var = new va0(executor);
            return Build.VERSION.SDK_INT >= 24 ? Arrays.asList(sa0.f13067a, va0Var) : Collections.singletonList(va0Var);
        }

        @Override // p000.cb0
        /* renamed from: a */
        public Executor mo3645a() {
            return new a();
        }

        @Override // p000.cb0
        @IgnoreJRERequirement
        /* renamed from: a */
        boolean mo3646a(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }

        @Override // p000.cb0
        /* renamed from: b */
        List<? extends ta0.AbstractC3255a> mo3647b() {
            return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(ab0.f95a) : Collections.emptyList();
        }

        @Override // p000.cb0
        /* renamed from: c */
        int mo3648c() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @IgnoreJRERequirement
    /* renamed from: cb0$b */
    /* loaded from: classes.dex */
    public static class C0516b extends cb0 {
        C0516b() {
        }

        @Override // p000.cb0
        /* renamed from: a */
        Object mo3643a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // p000.cb0
        /* renamed from: a */
        List<? extends qa0.AbstractC3120a> mo3644a(@Nullable Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(sa0.f13067a);
            if (executor != null) {
                arrayList.add(new va0(executor));
            } else {
                arrayList.add(ua0.f13455a);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // p000.cb0
        /* renamed from: a */
        boolean mo3646a(Method method) {
            return method.isDefault();
        }

        @Override // p000.cb0
        /* renamed from: b */
        List<? extends ta0.AbstractC3255a> mo3647b() {
            return Collections.singletonList(ab0.f95a);
        }

        @Override // p000.cb0
        /* renamed from: c */
        int mo3648c() {
            return 1;
        }
    }

    cb0() {
    }

    /* renamed from: d */
    private static cb0 m3641d() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C0515a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C0516b();
        } catch (ClassNotFoundException unused2) {
            return new cb0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static cb0 m3642e() {
        return f2990a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public Object mo3643a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends qa0.AbstractC3120a> mo3644a(@Nullable Executor executor) {
        return executor != null ? Collections.singletonList(new va0(executor)) : Collections.singletonList(ua0.f13455a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public Executor mo3645a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3646a(Method method) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List<? extends ta0.AbstractC3255a> mo3647b() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3648c() {
        return 0;
    }
}
