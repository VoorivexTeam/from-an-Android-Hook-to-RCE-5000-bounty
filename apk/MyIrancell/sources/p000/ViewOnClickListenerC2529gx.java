package p000;

import android.view.View;

/* renamed from: gx */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2529gx implements View.OnClickListener {

    /* renamed from: b */
    private final AbstractC2569hx f10343b;

    /* renamed from: c */
    private final int f10344c;

    public ViewOnClickListenerC2529gx(AbstractC2569hx abstractC2569hx, int i) {
        this.f10343b = abstractC2569hx;
        this.f10344c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f10343b.mo3198b(this.f10344c);
    }
}
