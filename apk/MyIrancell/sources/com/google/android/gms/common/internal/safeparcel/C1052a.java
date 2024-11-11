package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
/* loaded from: classes.dex */
public class C1052a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C1052a.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static int m7208A(Parcel parcel, int i) {
        m7219a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: B */
    public static Integer m7209B(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        if (m7213F == 0) {
            return null;
        }
        m7220a(parcel, i, m7213F, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: C */
    public static long m7210C(Parcel parcel, int i) {
        m7219a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: D */
    public static Long m7211D(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        if (m7213F == 0) {
            return null;
        }
        m7220a(parcel, i, m7213F, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: E */
    public static short m7212E(Parcel parcel, int i) {
        m7219a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: F */
    public static int m7213F(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: G */
    public static void m7214G(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m7213F(parcel, i));
    }

    /* renamed from: a */
    public static int m7215a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m7216a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m7217a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m7213F);
        return createFromParcel;
    }

    /* renamed from: a */
    public static BigDecimal m7218a(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m7213F);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: a */
    private static void m7219a(Parcel parcel, int i, int i2) {
        int m7213F = m7213F(parcel, i);
        if (m7213F == i2) {
            return;
        }
        String hexString = Integer.toHexString(m7213F);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(m7213F);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    /* renamed from: a */
    private static void m7220a(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    /* renamed from: a */
    public static void m7221a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + m7213F);
    }

    /* renamed from: b */
    public static int m7222b(Parcel parcel) {
        int m7216a = m7216a(parcel);
        int m7213F = m7213F(parcel, m7216a);
        int dataPosition = parcel.dataPosition();
        if (m7215a(m7216a) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m7216a));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = m7213F + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    /* renamed from: b */
    public static <T> T[] m7223b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m7213F);
        return tArr;
    }

    /* renamed from: b */
    public static BigDecimal[] m7224b(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m7213F);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m7225c(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return new BigInteger(createByteArray);
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m7226c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m7213F);
        return createTypedArrayList;
    }

    /* renamed from: d */
    public static BigInteger[] m7227d(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m7213F);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m7228e(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m7229f(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m7213F);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m7230g(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createByteArray;
    }

    /* renamed from: h */
    public static double[] m7231h(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createDoubleArray;
    }

    /* renamed from: i */
    public static float[] m7232i(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createFloatArray;
    }

    /* renamed from: j */
    public static int[] m7233j(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createIntArray;
    }

    /* renamed from: k */
    public static ArrayList<Integer> m7234k(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m7213F);
        return arrayList;
    }

    /* renamed from: l */
    public static long[] m7235l(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m7236m(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m7213F);
        parcel.setDataPosition(dataPosition + m7213F);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m7237n(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m7213F);
        return parcelArr;
    }

    /* renamed from: o */
    public static String m7238o(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m7213F);
        return readString;
    }

    /* renamed from: p */
    public static String[] m7239p(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m7213F);
        return createStringArray;
    }

    /* renamed from: q */
    public static ArrayList<String> m7240q(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m7213F);
        return createStringArrayList;
    }

    /* renamed from: r */
    public static void m7241r(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    /* renamed from: s */
    public static boolean m7242s(Parcel parcel, int i) {
        m7219a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: t */
    public static Boolean m7243t(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        if (m7213F == 0) {
            return null;
        }
        m7220a(parcel, i, m7213F, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: u */
    public static byte m7244u(Parcel parcel, int i) {
        m7219a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: v */
    public static double m7245v(Parcel parcel, int i) {
        m7219a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: w */
    public static Double m7246w(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        if (m7213F == 0) {
            return null;
        }
        m7220a(parcel, i, m7213F, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: x */
    public static float m7247x(Parcel parcel, int i) {
        m7219a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: y */
    public static Float m7248y(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        if (m7213F == 0) {
            return null;
        }
        m7220a(parcel, i, m7213F, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: z */
    public static IBinder m7249z(Parcel parcel, int i) {
        int m7213F = m7213F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m7213F == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m7213F);
        return readStrongBinder;
    }
}
