package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
/* loaded from: classes.dex */
public class C1053b {
    /* renamed from: a */
    public static int m7250a(Parcel parcel) {
        return m7274b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m7251a(Parcel parcel, int i) {
        m7277c(parcel, i);
    }

    /* renamed from: a */
    public static void m7252a(Parcel parcel, int i, byte b) {
        m7275b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m7253a(Parcel parcel, int i, double d) {
        m7275b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m7254a(Parcel parcel, int i, float f) {
        m7275b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m7255a(Parcel parcel, int i, int i2) {
        m7275b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m7256a(Parcel parcel, int i, long j) {
        m7275b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m7257a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeBundle(bundle);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    public static void m7258a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    public static void m7259a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    public static void m7260a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    public static void m7261a(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m7275b(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m7275b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m7262a(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m7275b(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m7275b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m7263a(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m7275b(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m7275b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m7264a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m7275b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m7275b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m7265a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m7275b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m7275b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m7266a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeString(str);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    public static void m7267a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m7275b(parcel, i, 0);
                return;
            }
            return;
        }
        int m7274b = m7274b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        m7277c(parcel, m7274b);
    }

    /* renamed from: a */
    public static void m7268a(Parcel parcel, int i, short s) {
        m7275b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m7269a(Parcel parcel, int i, boolean z) {
        m7275b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m7270a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeByteArray(bArr);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m7271a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m7275b(parcel, i, 0);
                return;
            }
            return;
        }
        int m7274b = m7274b(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m7273a(parcel, t, i2);
            }
        }
        m7277c(parcel, m7274b);
    }

    /* renamed from: a */
    public static void m7272a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeStringArray(strArr);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m7273a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static int m7274b(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    private static void m7275b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
        } else {
            parcel.writeInt(i | (-65536));
            parcel.writeInt(i2);
        }
    }

    /* renamed from: b */
    public static void m7276b(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeList(list);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: c */
    private static void m7277c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static void m7278c(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m7275b(parcel, i, 0);
            }
        } else {
            int m7274b = m7274b(parcel, i);
            parcel.writeStringList(list);
            m7277c(parcel, m7274b);
        }
    }

    /* renamed from: d */
    public static <T extends Parcelable> void m7279d(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m7275b(parcel, i, 0);
                return;
            }
            return;
        }
        int m7274b = m7274b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m7273a(parcel, t, 0);
            }
        }
        m7277c(parcel, m7274b);
    }
}
