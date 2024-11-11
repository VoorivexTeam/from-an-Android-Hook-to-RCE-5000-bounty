package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0047a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0047a(java.lang.String r4, android.os.Parcel r5) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.a.C0047a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int A(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer B(Parcel parcel, int i) {
        int F = F(parcel, i);
        if (F == 0) {
            return null;
        }
        a(parcel, i, F, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long C(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long D(Parcel parcel, int i) {
        int F = F(parcel, i);
        if (F == 0) {
            return null;
        }
        a(parcel, i, F, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short E(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int F(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void G(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + F(parcel, i));
    }

    public static int a(int i) {
        return i & 65535;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + F);
        return createFromParcel;
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + F);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    private static void a(Parcel parcel, int i, int i2) {
        int F = F(parcel, i);
        if (F == i2) {
            return;
        }
        String hexString = Integer.toHexString(F);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(F);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new C0047a(sb.toString(), parcel);
    }

    private static void a(Parcel parcel, int i, int i2, int i3) {
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
        throw new C0047a(sb.toString(), parcel);
    }

    public static void a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + F);
    }

    public static int b(Parcel parcel) {
        int a = a(parcel);
        int F = F(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (a(a) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C0047a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = F + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C0047a(sb.toString(), parcel);
    }

    public static <T> T[] b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + F);
        return tArr;
    }

    public static BigDecimal[] b(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + F);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + F);
        return new BigInteger(createByteArray);
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + F);
        return createTypedArrayList;
    }

    public static BigInteger[] d(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + F);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + F);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + F);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + F);
        return createByteArray;
    }

    public static double[] h(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + F);
        return createDoubleArray;
    }

    public static float[] i(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + F);
        return createFloatArray;
    }

    public static int[] j(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + F);
        return createIntArray;
    }

    public static ArrayList<Integer> k(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + F);
        return arrayList;
    }

    public static long[] l(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + F);
        return createLongArray;
    }

    public static Parcel m(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, F);
        parcel.setDataPosition(dataPosition + F);
        return obtain;
    }

    public static Parcel[] n(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
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
        parcel.setDataPosition(dataPosition + F);
        return parcelArr;
    }

    public static String o(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + F);
        return readString;
    }

    public static String[] p(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + F);
        return createStringArray;
    }

    public static ArrayList<String> q(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + F);
        return createStringArrayList;
    }

    public static void r(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new C0047a(sb.toString(), parcel);
    }

    public static boolean s(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean t(Parcel parcel, int i) {
        int F = F(parcel, i);
        if (F == 0) {
            return null;
        }
        a(parcel, i, F, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte u(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double v(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double w(Parcel parcel, int i) {
        int F = F(parcel, i);
        if (F == 0) {
            return null;
        }
        a(parcel, i, F, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float x(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float y(Parcel parcel, int i) {
        int F = F(parcel, i);
        if (F == 0) {
            return null;
        }
        a(parcel, i, F, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder z(Parcel parcel, int i) {
        int F = F(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (F == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + F);
        return readStrongBinder;
    }
}
