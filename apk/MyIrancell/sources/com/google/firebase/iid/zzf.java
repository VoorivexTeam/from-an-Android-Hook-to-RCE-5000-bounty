package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class zzf implements Parcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C2102j0();

    /* renamed from: b */
    private Messenger f8994b;

    /* renamed from: c */
    private InterfaceC2120s0 f8995c;

    /* renamed from: com.google.firebase.iid.zzf$a */
    /* loaded from: classes.dex */
    public static final class C2135a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.m10600j();
            return zzf.class;
        }
    }

    public zzf(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8994b = new Messenger(iBinder);
        } else {
            this.f8995c = new C2126v0(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m10738a() {
        Messenger messenger = this.f8994b;
        return messenger != null ? messenger.getBinder() : this.f8995c.asBinder();
    }

    /* renamed from: a */
    public final void m10739a(Message message) {
        Messenger messenger = this.f8994b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f8995c.mo10689a(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m10738a().equals(((zzf) obj).m10738a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m10738a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f8994b;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f8995c.asBinder());
    }
}
