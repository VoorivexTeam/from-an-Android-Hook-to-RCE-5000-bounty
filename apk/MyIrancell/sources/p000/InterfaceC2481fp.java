package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: fp */
/* loaded from: classes.dex */
public interface InterfaceC2481fp extends IInterface {

    /* renamed from: fp$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC2869kq implements InterfaceC2481fp {

        /* renamed from: fp$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C3566a extends C2906lq implements InterfaceC2481fp {
            C3566a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static InterfaceC2481fp m11796a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC2481fp ? (InterfaceC2481fp) queryLocalInterface : new C3566a(iBinder);
        }
    }
}
