package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import p000.AbstractC2532h;
import p000.C0502c2;

/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class DialogC0085e extends Dialog implements InterfaceC0083c {

    /* renamed from: b */
    private AbstractC0084d f417b;

    /* renamed from: c */
    private final C0502c2.a f418c;

    /* renamed from: androidx.appcompat.app.e$a */
    /* loaded from: classes.dex */
    class a implements C0502c2.a {
        a() {
        }

        @Override // p000.C0502c2.a
        /* renamed from: a */
        public boolean mo502a(KeyEvent keyEvent) {
            return DialogC0085e.this.m501a(keyEvent);
        }
    }

    public DialogC0085e(Context context, int i) {
        super(context, m498a(context, i));
        this.f418c = new a();
        m499a().mo396a((Bundle) null);
        m499a().mo403a();
    }

    /* renamed from: a */
    private static int m498a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public AbstractC0084d m499a() {
        if (this.f417b == null) {
            this.f417b = AbstractC0084d.m496a(this, this);
        }
        return this.f417b;
    }

    @Override // androidx.appcompat.app.InterfaceC0083c
    /* renamed from: a */
    public AbstractC2532h mo355a(AbstractC2532h.a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.InterfaceC0083c
    /* renamed from: a */
    public void mo358a(AbstractC2532h abstractC2532h) {
    }

    /* renamed from: a */
    public boolean m500a(int i) {
        return m499a().mo412b(i);
    }

    /* renamed from: a */
    boolean m501a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m499a().mo398a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.InterfaceC0083c
    /* renamed from: b */
    public void mo360b(AbstractC2532h abstractC2532h) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0502c2.m3526a(this.f418c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m499a().mo389a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m499a().mo420e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m499a().mo418d();
        super.onCreate(bundle);
        m499a().mo396a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m499a().mo429i();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m499a().mo415c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m499a().mo397a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m499a().mo410b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m499a().mo402a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m499a().mo402a(charSequence);
    }
}
