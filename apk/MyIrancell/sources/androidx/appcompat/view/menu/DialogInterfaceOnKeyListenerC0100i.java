package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R$layout;
import androidx.appcompat.app.DialogInterfaceC0082b;
import androidx.appcompat.view.menu.InterfaceC0106o;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0100i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0106o.a {

    /* renamed from: b */
    private C0099h f623b;

    /* renamed from: c */
    private DialogInterfaceC0082b f624c;

    /* renamed from: d */
    C0097f f625d;

    /* renamed from: e */
    private InterfaceC0106o.a f626e;

    public DialogInterfaceOnKeyListenerC0100i(C0099h c0099h) {
        this.f623b = c0099h;
    }

    /* renamed from: a */
    public void m682a() {
        DialogInterfaceC0082b dialogInterfaceC0082b = this.f624c;
        if (dialogInterfaceC0082b != null) {
            dialogInterfaceC0082b.dismiss();
        }
    }

    /* renamed from: a */
    public void m683a(IBinder iBinder) {
        C0099h c0099h = this.f623b;
        DialogInterfaceC0082b.a aVar = new DialogInterfaceC0082b.a(c0099h.m666e());
        C0097f c0097f = new C0097f(aVar.m494b(), R$layout.abc_list_menu_item_layout);
        this.f625d = c0097f;
        c0097f.mo584a(this);
        this.f623b.m645a(this.f625d);
        aVar.m491a(this.f625d.m620a(), this);
        View m671i = c0099h.m671i();
        if (m671i != null) {
            aVar.m490a(m671i);
        } else {
            aVar.m489a(c0099h.m669g());
            aVar.m492a(c0099h.m670h());
        }
        aVar.m488a(this);
        DialogInterfaceC0082b m493a = aVar.m493a();
        this.f624c = m493a;
        m493a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f624c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f624c.show();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
    /* renamed from: a */
    public void mo450a(C0099h c0099h, boolean z) {
        if (z || c0099h == this.f623b) {
            m682a();
        }
        InterfaceC0106o.a aVar = this.f626e;
        if (aVar != null) {
            aVar.mo450a(c0099h, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
    /* renamed from: a */
    public boolean mo451a(C0099h c0099h) {
        InterfaceC0106o.a aVar = this.f626e;
        if (aVar != null) {
            return aVar.mo451a(c0099h);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f623b.m649a((C0101j) this.f625d.m620a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f625d.mo582a(this.f623b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f624c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f624c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f623b.m648a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f623b.performShortcut(i, keyEvent, 0);
    }
}
