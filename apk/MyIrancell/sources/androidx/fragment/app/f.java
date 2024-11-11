package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(f fVar, Fragment fragment);

        public abstract void a(f fVar, Fragment fragment, Context context);

        public abstract void a(f fVar, Fragment fragment, Bundle bundle);

        public abstract void a(f fVar, Fragment fragment, View view, Bundle bundle);

        public abstract void b(f fVar, Fragment fragment);

        public abstract void b(f fVar, Fragment fragment, Context context);

        public abstract void b(f fVar, Fragment fragment, Bundle bundle);

        public abstract void c(f fVar, Fragment fragment);

        public abstract void c(f fVar, Fragment fragment, Bundle bundle);

        public abstract void d(f fVar, Fragment fragment);

        public abstract void d(f fVar, Fragment fragment, Bundle bundle);

        public abstract void e(f fVar, Fragment fragment);

        public abstract void f(f fVar, Fragment fragment);

        public abstract void g(f fVar, Fragment fragment);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public abstract Fragment a(int i);

    public abstract Fragment a(String str);

    public abstract i a();

    public abstract void a(int i, int i2);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract List<Fragment> b();

    public abstract boolean c();

    public abstract boolean d();
}
