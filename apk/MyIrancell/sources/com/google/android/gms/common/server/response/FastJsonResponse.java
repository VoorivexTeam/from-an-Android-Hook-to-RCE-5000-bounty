package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.util.C1097c;
import com.google.android.gms.common.util.C1106l;
import com.google.android.gms.common.util.C1107m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* loaded from: classes.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C1083a CREATOR = new C1083a();

        /* renamed from: b */
        private final int f6303b;

        /* renamed from: c */
        protected final int f6304c;

        /* renamed from: d */
        protected final boolean f6305d;

        /* renamed from: e */
        protected final int f6306e;

        /* renamed from: f */
        protected final boolean f6307f;

        /* renamed from: g */
        protected final String f6308g;

        /* renamed from: h */
        protected final int f6309h;

        /* renamed from: i */
        protected final Class<? extends FastJsonResponse> f6310i;

        /* renamed from: j */
        private final String f6311j;

        /* renamed from: k */
        private zaj f6312k;

        /* renamed from: l */
        private InterfaceC1082a<I, O> f6313l;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zab zabVar) {
            this.f6303b = i;
            this.f6304c = i2;
            this.f6305d = z;
            this.f6306e = i3;
            this.f6307f = z2;
            this.f6308g = str;
            this.f6309h = i4;
            if (str2 == null) {
                this.f6310i = null;
                this.f6311j = null;
            } else {
                this.f6310i = SafeParcelResponse.class;
                this.f6311j = str2;
            }
            if (zabVar == null) {
                this.f6313l = null;
            } else {
                this.f6313l = (InterfaceC1082a<I, O>) zabVar.m7318j();
            }
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, InterfaceC1082a<I, O> interfaceC1082a) {
            this.f6303b = 1;
            this.f6304c = i;
            this.f6305d = z;
            this.f6306e = i2;
            this.f6307f = z2;
            this.f6308g = str;
            this.f6309h = i3;
            this.f6310i = cls;
            this.f6311j = cls == null ? null : cls.getCanonicalName();
            this.f6313l = interfaceC1082a;
        }

        /* renamed from: a */
        public static Field<byte[], byte[]> m7323a(String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m7324a(String str, int i, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        /* renamed from: b */
        public static Field<Integer, Integer> m7326b(String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m7327b(String str, int i, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        /* renamed from: c */
        public static Field<String, String> m7328c(String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        /* renamed from: d */
        public static Field<ArrayList<String>, ArrayList<String>> m7329d(String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        /* renamed from: m */
        private final String m7330m() {
            String str = this.f6311j;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: n */
        private final zab m7331n() {
            InterfaceC1082a<I, O> interfaceC1082a = this.f6313l;
            if (interfaceC1082a == null) {
                return null;
            }
            return zab.m7317a(interfaceC1082a);
        }

        /* renamed from: a */
        public final I m7332a(O o) {
            return this.f6313l.mo7316a(o);
        }

        /* renamed from: a */
        public final void m7333a(zaj zajVar) {
            this.f6312k = zajVar;
        }

        /* renamed from: j */
        public int m7334j() {
            return this.f6309h;
        }

        /* renamed from: k */
        public final boolean m7335k() {
            return this.f6313l != null;
        }

        /* renamed from: l */
        public final Map<String, Field<?, ?>> m7336l() {
            C1057u.m7286a(this.f6311j);
            C1057u.m7286a(this.f6312k);
            return this.f6312k.m7341a(this.f6311j);
        }

        public String toString() {
            C1050s.a m7204a = C1050s.m7204a(this);
            m7204a.m7206a("versionCode", Integer.valueOf(this.f6303b));
            m7204a.m7206a("typeIn", Integer.valueOf(this.f6304c));
            m7204a.m7206a("typeInArray", Boolean.valueOf(this.f6305d));
            m7204a.m7206a("typeOut", Integer.valueOf(this.f6306e));
            m7204a.m7206a("typeOutArray", Boolean.valueOf(this.f6307f));
            m7204a.m7206a("outputFieldName", this.f6308g);
            m7204a.m7206a("safeParcelFieldId", Integer.valueOf(this.f6309h));
            m7204a.m7206a("concreteTypeName", m7330m());
            Class<? extends FastJsonResponse> cls = this.f6310i;
            if (cls != null) {
                m7204a.m7206a("concreteType.class", cls.getCanonicalName());
            }
            InterfaceC1082a<I, O> interfaceC1082a = this.f6313l;
            if (interfaceC1082a != null) {
                m7204a.m7206a("converterName", interfaceC1082a.getClass().getCanonicalName());
            }
            return m7204a.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int m7250a = C1053b.m7250a(parcel);
            C1053b.m7255a(parcel, 1, this.f6303b);
            C1053b.m7255a(parcel, 2, this.f6304c);
            C1053b.m7269a(parcel, 3, this.f6305d);
            C1053b.m7255a(parcel, 4, this.f6306e);
            C1053b.m7269a(parcel, 5, this.f6307f);
            C1053b.m7266a(parcel, 6, this.f6308g, false);
            C1053b.m7255a(parcel, 7, m7334j());
            C1053b.m7266a(parcel, 8, m7330m(), false);
            C1053b.m7260a(parcel, 9, (Parcelable) m7331n(), i, false);
            C1053b.m7251a(parcel, m7250a);
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1082a<I, O> {
        /* renamed from: a */
        I mo7316a(O o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <O, I> I m7319a(Field<I, O> field, Object obj) {
        return ((Field) field).f6313l != null ? field.m7332a((Field<I, O>) obj) : obj;
    }

    /* renamed from: a */
    private static void m7320a(StringBuilder sb, Field field, Object obj) {
        String str;
        int i = field.f6304c;
        if (i == 11) {
            str = field.f6310i.cast(obj).toString();
        } else if (i != 7) {
            sb.append(obj);
            return;
        } else {
            str = "\"";
            sb.append("\"");
            sb.append(C1106l.m7393a((String) obj));
        }
        sb.append(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo6353a(Field field) {
        String str = field.f6308g;
        if (field.f6310i == null) {
            return mo7321a(str);
        }
        C1057u.m7299b(mo7321a(str) == null, "Concrete field shouldn't be value object: %s", field.f6308g);
        boolean z = field.f6307f;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected abstract Object mo7321a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo6354a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6355b(Field field) {
        if (field.f6306e != 11) {
            return mo7322b(field.f6308g);
        }
        boolean z = field.f6307f;
        String str = field.f6308g;
        if (z) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* renamed from: b */
    protected abstract boolean mo7322b(String str);

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x005b. Please report as an issue. */
    public String toString() {
        String str;
        String m7370a;
        Map<String, Field<?, ?>> mo6354a = mo6354a();
        StringBuilder sb = new StringBuilder(100);
        for (String str2 : mo6354a.keySet()) {
            Field<?, ?> field = mo6354a.get(str2);
            if (mo6355b(field)) {
                Object m7319a = m7319a(field, mo6353a(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str2);
                sb.append("\":");
                if (m7319a != null) {
                    switch (field.f6306e) {
                        case 8:
                            sb.append("\"");
                            m7370a = C1097c.m7370a((byte[]) m7319a);
                            sb.append(m7370a);
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            m7370a = C1097c.m7371b((byte[]) m7319a);
                            sb.append(m7370a);
                            sb.append("\"");
                            break;
                        case 10:
                            C1107m.m7394a(sb, (HashMap) m7319a);
                            break;
                        default:
                            if (field.f6305d) {
                                ArrayList arrayList = (ArrayList) m7319a;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m7320a(sb, field, obj);
                                    }
                                }
                                str = "]";
                                break;
                            } else {
                                m7320a(sb, field, m7319a);
                                break;
                            }
                    }
                } else {
                    str = "null";
                }
                sb.append(str);
            }
        }
        sb.append(sb.length() > 0 ? "}" : "{}");
        return sb.toString();
    }
}
