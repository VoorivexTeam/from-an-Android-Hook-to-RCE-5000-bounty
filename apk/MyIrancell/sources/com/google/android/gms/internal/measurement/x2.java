package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.w2;
import com.google.android.gms.internal.measurement.x2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x2<MessageType extends x2<MessageType, BuilderType>, BuilderType extends w2<MessageType, BuilderType>> implements x5 {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        r4.a(iterable);
        if (iterable instanceof h5) {
            List<?> a = ((h5) iterable).a();
            h5 h5Var = (h5) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    int size2 = h5Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = h5Var.size() - 1; size3 >= size; size3--) {
                        h5Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                }
                if (obj instanceof h3) {
                    h5Var.a((h3) obj);
                } else {
                    h5Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof j6) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Element at index ");
                sb3.append(size5);
                sb3.append(" is null.");
                String sb4 = sb3.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(sb4);
            }
            list.add(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public final byte[] e() {
        try {
            byte[] bArr = new byte[c()];
            v3 a = v3.a(bArr);
            a(a);
            a.b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final h3 h() {
        try {
            p3 c = h3.c(c());
            a(c.b());
            return c.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
