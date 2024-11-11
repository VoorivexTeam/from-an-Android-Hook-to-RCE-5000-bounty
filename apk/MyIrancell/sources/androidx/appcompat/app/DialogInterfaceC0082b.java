package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogInterfaceC0082b extends DialogC0085e implements DialogInterface {

    /* renamed from: d */
    final AlertController f413d;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C0063f f414a;

        /* renamed from: b */
        private final int f415b;

        public a(Context context) {
            this(context, DialogInterfaceC0082b.m487a(context, 0));
        }

        public a(Context context, int i) {
            this.f414a = new AlertController.C0063f(new ContextThemeWrapper(context, DialogInterfaceC0082b.m487a(context, i)));
            this.f415b = i;
        }

        /* renamed from: a */
        public a m488a(DialogInterface.OnKeyListener onKeyListener) {
            this.f414a.f297u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public a m489a(Drawable drawable) {
            this.f414a.f280d = drawable;
            return this;
        }

        /* renamed from: a */
        public a m490a(View view) {
            this.f414a.f283g = view;
            return this;
        }

        /* renamed from: a */
        public a m491a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0063f c0063f = this.f414a;
            c0063f.f299w = listAdapter;
            c0063f.f300x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public a m492a(CharSequence charSequence) {
            this.f414a.f282f = charSequence;
            return this;
        }

        /* renamed from: a */
        public DialogInterfaceC0082b m493a() {
            DialogInterfaceC0082b dialogInterfaceC0082b = new DialogInterfaceC0082b(this.f414a.f277a, this.f415b);
            this.f414a.m352a(dialogInterfaceC0082b.f413d);
            dialogInterfaceC0082b.setCancelable(this.f414a.f294r);
            if (this.f414a.f294r) {
                dialogInterfaceC0082b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0082b.setOnCancelListener(this.f414a.f295s);
            dialogInterfaceC0082b.setOnDismissListener(this.f414a.f296t);
            DialogInterface.OnKeyListener onKeyListener = this.f414a.f297u;
            if (onKeyListener != null) {
                dialogInterfaceC0082b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0082b;
        }

        /* renamed from: b */
        public Context m494b() {
            return this.f414a.f277a;
        }
    }

    protected DialogInterfaceC0082b(Context context, int i) {
        super(context, m487a(context, i));
        this.f413d = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: a */
    static int m487a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0085e, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f413d.m337a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f413d.m343a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f413d.m347b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0085e, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f413d.m346b(charSequence);
    }
}
