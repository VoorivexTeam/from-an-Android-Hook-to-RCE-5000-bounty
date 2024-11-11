package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C1002g();

    /* renamed from: b */
    private final int f6058b;

    /* renamed from: c */
    private final String[] f6059c;

    /* renamed from: d */
    private Bundle f6060d;

    /* renamed from: e */
    private final CursorWindow[] f6061e;

    /* renamed from: f */
    private final int f6062f;

    /* renamed from: g */
    private final Bundle f6063g;

    /* renamed from: h */
    private int[] f6064h;

    /* renamed from: i */
    private int f6065i;

    /* renamed from: j */
    private boolean f6066j = false;

    /* renamed from: k */
    private boolean f6067k = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* loaded from: classes.dex */
    public static class C0995a {
        private C0995a(String[] strArr, String str) {
            C1057u.m7286a(strArr);
            new ArrayList();
            new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ C0995a(String[] strArr, String str, C1001f c1001f) {
            this(strArr, null);
        }
    }

    static {
        new C1001f(new String[0], null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f6058b = i;
        this.f6059c = strArr;
        this.f6061e = cursorWindowArr;
        this.f6062f = i2;
        this.f6063g = bundle;
    }

    /* renamed from: a */
    private final void m6980a(String str, int i) {
        Bundle bundle = this.f6060d;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        }
        if (m6985l()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f6065i) {
            throw new CursorIndexOutOfBoundsException(i, this.f6065i);
        }
    }

    /* renamed from: a */
    public final String m6981a(String str, int i, int i2) {
        m6980a(str, i);
        return this.f6061e[i2].getString(i, this.f6060d.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.f6066j) {
                this.f6066j = true;
                for (int i = 0; i < this.f6061e.length; i++) {
                    this.f6061e[i].close();
                }
            }
        }
    }

    /* renamed from: d */
    public final int m6982d(int i) {
        int i2 = 0;
        C1057u.m7297b(i >= 0 && i < this.f6065i);
        while (true) {
            int[] iArr = this.f6064h;
            if (i2 >= iArr.length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f6064h.length ? i2 - 1 : i2;
    }

    protected final void finalize() {
        try {
            if (this.f6067k && this.f6061e.length > 0 && !m6985l()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                sb.toString();
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        return this.f6065i;
    }

    /* renamed from: j */
    public final Bundle m6983j() {
        return this.f6063g;
    }

    /* renamed from: k */
    public final int m6984k() {
        return this.f6062f;
    }

    /* renamed from: l */
    public final boolean m6985l() {
        boolean z;
        synchronized (this) {
            z = this.f6066j;
        }
        return z;
    }

    /* renamed from: m */
    public final void m6986m() {
        this.f6060d = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f6059c;
            if (i2 >= strArr.length) {
                break;
            }
            this.f6060d.putInt(strArr[i2], i2);
            i2++;
        }
        this.f6064h = new int[this.f6061e.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f6061e;
            if (i >= cursorWindowArr.length) {
                this.f6065i = i3;
                return;
            }
            this.f6064h[i] = i3;
            i3 += this.f6061e[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7272a(parcel, 1, this.f6059c, false);
        C1053b.m7271a(parcel, 2, (Parcelable[]) this.f6061e, i, false);
        C1053b.m7255a(parcel, 3, m6984k());
        C1053b.m7257a(parcel, 4, m6983j(), false);
        C1053b.m7255a(parcel, 1000, this.f6058b);
        C1053b.m7251a(parcel, m7250a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
