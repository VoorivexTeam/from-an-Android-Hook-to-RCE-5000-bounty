package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public abstract class AbstractC0084d {

    /* renamed from: b */
    private static int f416b = -1;

    /* renamed from: a */
    public static AbstractC0084d m495a(Activity activity, InterfaceC0083c interfaceC0083c) {
        return new AppCompatDelegateImpl(activity, activity.getWindow(), interfaceC0083c);
    }

    /* renamed from: a */
    public static AbstractC0084d m496a(Dialog dialog, InterfaceC0083c interfaceC0083c) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), interfaceC0083c);
    }

    /* renamed from: j */
    public static int m497j() {
        return f416b;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo389a(int i);

    /* renamed from: a */
    public abstract void mo395a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo396a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo397a(View view);

    /* renamed from: a */
    public abstract void mo398a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo402a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo403a();

    /* renamed from: b */
    public abstract MenuInflater mo407b();

    /* renamed from: b */
    public abstract void mo409b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo410b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo412b(int i);

    /* renamed from: c */
    public abstract AbstractC0081a mo414c();

    /* renamed from: c */
    public abstract void mo415c(int i);

    /* renamed from: c */
    public abstract void mo416c(Bundle bundle);

    /* renamed from: d */
    public abstract void mo418d();

    /* renamed from: e */
    public abstract void mo420e();

    /* renamed from: f */
    public abstract void mo423f();

    /* renamed from: g */
    public abstract void mo424g();

    /* renamed from: h */
    public abstract void mo426h();

    /* renamed from: i */
    public abstract void mo429i();
}
