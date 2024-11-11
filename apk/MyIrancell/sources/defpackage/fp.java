package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface fp extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends kq implements fp {

        /* renamed from: fp$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0058a extends lq implements fp {
            C0058a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static fp a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof fp ? (fp) queryLocalInterface : new C0058a(iBinder);
        }
    }
}
