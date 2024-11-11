package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1516w2;
import com.google.android.gms.internal.measurement.AbstractC1530x2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes.dex */
public abstract class AbstractC1530x2<MessageType extends AbstractC1530x2<MessageType, BuilderType>, BuilderType extends AbstractC1516w2<MessageType, BuilderType>> implements InterfaceC1533x5 {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static <T> void m8879a(Iterable<T> iterable, List<? super T> list) {
        C1448r4.m8290a(iterable);
        if (iterable instanceof InterfaceC1302h5) {
            List<?> mo7797a = ((InterfaceC1302h5) iterable).mo7797a();
            InterfaceC1302h5 interfaceC1302h5 = (InterfaceC1302h5) list;
            int size = list.size();
            for (Object obj : mo7797a) {
                if (obj == null) {
                    int size2 = interfaceC1302h5.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = interfaceC1302h5.size() - 1; size3 >= size; size3--) {
                        interfaceC1302h5.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                }
                if (obj instanceof AbstractC1300h3) {
                    interfaceC1302h5.mo7798a((AbstractC1300h3) obj);
                } else {
                    interfaceC1302h5.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC1333j6) {
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
    /* renamed from: a */
    public void mo8090a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final byte[] m8880e() {
        try {
            byte[] bArr = new byte[mo8094c()];
            AbstractC1503v3 m8533a = AbstractC1503v3.m8533a(bArr);
            mo8091a(m8533a);
            m8533a.m8599b();
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
    /* renamed from: f */
    public int mo8095f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533x5
    /* renamed from: h */
    public final AbstractC1300h3 mo8881h() {
        try {
            C1419p3 m7872c = AbstractC1300h3.m7872c(mo8094c());
            mo8091a(m7872c.m8174b());
            return m7872c.m8173a();
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
