package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0282f {

    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract void m1816a(AbstractC0282f abstractC0282f, Fragment fragment);

        /* renamed from: a */
        public abstract void m1817a(AbstractC0282f abstractC0282f, Fragment fragment, Context context);

        /* renamed from: a */
        public abstract void m1818a(AbstractC0282f abstractC0282f, Fragment fragment, Bundle bundle);

        /* renamed from: a */
        public abstract void m1819a(AbstractC0282f abstractC0282f, Fragment fragment, View view, Bundle bundle);

        /* renamed from: b */
        public abstract void m1820b(AbstractC0282f abstractC0282f, Fragment fragment);

        /* renamed from: b */
        public abstract void m1821b(AbstractC0282f abstractC0282f, Fragment fragment, Context context);

        /* renamed from: b */
        public abstract void m1822b(AbstractC0282f abstractC0282f, Fragment fragment, Bundle bundle);

        /* renamed from: c */
        public abstract void m1823c(AbstractC0282f abstractC0282f, Fragment fragment);

        /* renamed from: c */
        public abstract void m1824c(AbstractC0282f abstractC0282f, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void m1825d(AbstractC0282f abstractC0282f, Fragment fragment);

        /* renamed from: d */
        public abstract void m1826d(AbstractC0282f abstractC0282f, Fragment fragment, Bundle bundle);

        /* renamed from: e */
        public abstract void m1827e(AbstractC0282f abstractC0282f, Fragment fragment);

        /* renamed from: f */
        public abstract void m1828f(AbstractC0282f abstractC0282f, Fragment fragment);

        /* renamed from: g */
        public abstract void m1829g(AbstractC0282f abstractC0282f, Fragment fragment);
    }

    /* renamed from: androidx.fragment.app.f$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m1830a();
    }

    /* renamed from: a */
    public abstract Fragment mo1808a(int i);

    /* renamed from: a */
    public abstract Fragment mo1809a(String str);

    /* renamed from: a */
    public abstract AbstractC0285i mo1810a();

    /* renamed from: a */
    public abstract void mo1811a(int i, int i2);

    /* renamed from: a */
    public abstract void mo1812a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract List<Fragment> mo1813b();

    /* renamed from: c */
    public abstract boolean mo1814c();

    /* renamed from: d */
    public abstract boolean mo1815d();
}
