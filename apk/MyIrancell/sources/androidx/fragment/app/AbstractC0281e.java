package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.C3419x1;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC0281e<E> extends AbstractC0279c {

    /* renamed from: a */
    private final Activity f1730a;

    /* renamed from: b */
    private final Context f1731b;

    /* renamed from: c */
    private final Handler f1732c;

    /* renamed from: d */
    final LayoutInflaterFactory2C0283g f1733d;

    AbstractC0281e(Activity activity, Context context, Handler handler, int i) {
        this.f1733d = new LayoutInflaterFactory2C0283g();
        this.f1730a = activity;
        C3419x1.m16411a(context, "context == null");
        this.f1731b = context;
        C3419x1.m16411a(handler, "handler == null");
        this.f1732c = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0281e(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.f1660c, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo1742a(Fragment fragment);

    /* renamed from: a */
    public abstract void mo1743a(Fragment fragment, Intent intent, int i, Bundle bundle);

    /* renamed from: a */
    public abstract void mo1744a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Activity m1804b() {
        return this.f1730a;
    }

    /* renamed from: b */
    public abstract boolean mo1745b(Fragment fragment);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Context m1805c() {
        return this.f1731b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public LayoutInflaterFactory2C0283g m1806d() {
        return this.f1733d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Handler m1807e() {
        return this.f1732c;
    }

    /* renamed from: f */
    public abstract LayoutInflater mo1746f();

    /* renamed from: g */
    public abstract int mo1747g();

    /* renamed from: h */
    public abstract boolean mo1748h();

    /* renamed from: i */
    public abstract void mo1749i();
}
