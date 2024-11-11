package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import defpackage.x1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class e<E> extends c {
    private final Activity a;
    private final Context b;
    private final Handler c;
    final g d;

    e(Activity activity, Context context, Handler handler, int i) {
        this.d = new g();
        this.a = activity;
        x1.a(context, "context == null");
        this.b = context;
        x1.a(handler, "handler == null");
        this.c = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.c, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Fragment fragment);

    public abstract void a(Fragment fragment, Intent intent, int i, Bundle bundle);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity b() {
        return this.a;
    }

    public abstract boolean b(Fragment fragment);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler e() {
        return this.c;
    }

    public abstract LayoutInflater f();

    public abstract int g();

    public abstract boolean h();

    public abstract void i();
}
