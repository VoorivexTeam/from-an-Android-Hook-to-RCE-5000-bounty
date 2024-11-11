package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C1096b;
import com.google.android.gms.common.util.C1097c;
import com.google.android.gms.common.util.C1106l;
import com.google.android.gms.common.util.C1107m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C1087e();

    /* renamed from: b */
    private final int f6314b;

    /* renamed from: c */
    private final Parcel f6315c;

    /* renamed from: d */
    private final int f6316d;

    /* renamed from: e */
    private final zaj f6317e;

    /* renamed from: f */
    private final String f6318f;

    /* renamed from: g */
    private int f6319g;

    /* renamed from: h */
    private int f6320h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SafeParcelResponse(int i, Parcel parcel, zaj zajVar) {
        this.f6314b = i;
        C1057u.m7286a(parcel);
        this.f6315c = parcel;
        this.f6316d = 2;
        this.f6317e = zajVar;
        this.f6318f = zajVar == null ? null : zajVar.m7343k();
        this.f6319g = 2;
    }

    /* renamed from: a */
    private static void m7337a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C1106l.m7393a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C1097c.m7370a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C1097c.m7371b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C1107m.m7394a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private final void m7338a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.f6305d) {
            m7337a(sb, field.f6304c, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            m7337a(sb, field.f6304c, arrayList.get(i));
        }
        sb.append("]");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0192. Please report as an issue. */
    /* renamed from: a */
    private final void m7339a(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        Object m7225c;
        String m7393a;
        String str;
        Object valueOf;
        Object m7319a;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().m7334j(), entry);
        }
        sb.append('{');
        int m7222b = C1052a.m7222b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(C1052a.m7215a(m7216a));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str2 = (String) entry2.getKey();
                FastJsonResponse.Field<?, ?> field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str2);
                sb.append("\":");
                if (field.m7335k()) {
                    switch (field.f6306e) {
                        case 0:
                            valueOf = Integer.valueOf(C1052a.m7208A(parcel, m7216a));
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 1:
                            valueOf = C1052a.m7225c(parcel, m7216a);
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 2:
                            valueOf = Long.valueOf(C1052a.m7210C(parcel, m7216a));
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 3:
                            valueOf = Float.valueOf(C1052a.m7247x(parcel, m7216a));
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 4:
                            valueOf = Double.valueOf(C1052a.m7245v(parcel, m7216a));
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 5:
                            valueOf = C1052a.m7218a(parcel, m7216a);
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(C1052a.m7242s(parcel, m7216a));
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 7:
                            valueOf = C1052a.m7238o(parcel, m7216a);
                            m7319a = FastJsonResponse.m7319a(field, valueOf);
                            m7338a(sb, field, m7319a);
                            break;
                        case 8:
                        case 9:
                            m7319a = FastJsonResponse.m7319a(field, C1052a.m7230g(parcel, m7216a));
                            m7338a(sb, field, m7319a);
                            break;
                        case 10:
                            Bundle m7229f = C1052a.m7229f(parcel, m7216a);
                            HashMap hashMap = new HashMap();
                            for (String str3 : m7229f.keySet()) {
                                hashMap.put(str3, m7229f.getString(str3));
                            }
                            m7319a = FastJsonResponse.m7319a(field, hashMap);
                            m7338a(sb, field, m7319a);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f6306e;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    if (field.f6307f) {
                        sb.append("[");
                        switch (field.f6306e) {
                            case 0:
                                C1096b.m7363a(sb, C1052a.m7233j(parcel, m7216a));
                                break;
                            case 1:
                                C1096b.m7365a(sb, C1052a.m7227d(parcel, m7216a));
                                break;
                            case 2:
                                C1096b.m7364a(sb, C1052a.m7235l(parcel, m7216a));
                                break;
                            case 3:
                                C1096b.m7362a(sb, C1052a.m7232i(parcel, m7216a));
                                break;
                            case 4:
                                C1096b.m7361a(sb, C1052a.m7231h(parcel, m7216a));
                                break;
                            case 5:
                                C1096b.m7365a(sb, C1052a.m7224b(parcel, m7216a));
                                break;
                            case 6:
                                C1096b.m7367a(sb, C1052a.m7228e(parcel, m7216a));
                                break;
                            case 7:
                                C1096b.m7366a(sb, C1052a.m7239p(parcel, m7216a));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] m7237n = C1052a.m7237n(parcel, m7216a);
                                int length = m7237n.length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    m7237n[i2].setDataPosition(0);
                                    m7339a(sb, field.m7336l(), m7237n[i2]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (field.f6306e) {
                            case 0:
                                sb.append(C1052a.m7208A(parcel, m7216a));
                                break;
                            case 1:
                                m7225c = C1052a.m7225c(parcel, m7216a);
                                sb.append(m7225c);
                                break;
                            case 2:
                                sb.append(C1052a.m7210C(parcel, m7216a));
                                break;
                            case 3:
                                sb.append(C1052a.m7247x(parcel, m7216a));
                                break;
                            case 4:
                                sb.append(C1052a.m7245v(parcel, m7216a));
                                break;
                            case 5:
                                m7225c = C1052a.m7218a(parcel, m7216a);
                                sb.append(m7225c);
                                break;
                            case 6:
                                sb.append(C1052a.m7242s(parcel, m7216a));
                                break;
                            case 7:
                                String m7238o = C1052a.m7238o(parcel, m7216a);
                                sb.append("\"");
                                m7393a = C1106l.m7393a(m7238o);
                                sb.append(m7393a);
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] m7230g = C1052a.m7230g(parcel, m7216a);
                                sb.append("\"");
                                m7393a = C1097c.m7370a(m7230g);
                                sb.append(m7393a);
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] m7230g2 = C1052a.m7230g(parcel, m7216a);
                                sb.append("\"");
                                m7393a = C1097c.m7371b(m7230g2);
                                sb.append(m7393a);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle m7229f2 = C1052a.m7229f(parcel, m7216a);
                                Set<String> keySet = m7229f2.keySet();
                                keySet.size();
                                sb.append("{");
                                boolean z2 = true;
                                for (String str4 : keySet) {
                                    if (!z2) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\"");
                                    sb.append(":");
                                    sb.append("\"");
                                    sb.append(C1106l.m7393a(m7229f2.getString(str4)));
                                    sb.append("\"");
                                    z2 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel m7236m = C1052a.m7236m(parcel, m7216a);
                                m7236m.setDataPosition(0);
                                m7339a(sb, field.m7336l(), m7236m);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb.append(str);
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == m7222b) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(m7222b);
        throw new C1052a.a(sb3.toString(), parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r0 != 1) goto L9;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Parcel m7340b() {
        /*
            r2 = this;
            int r0 = r2.f6319g
            if (r0 == 0) goto L8
            r1 = 1
            if (r0 == r1) goto L10
            goto L1a
        L8:
            android.os.Parcel r0 = r2.f6315c
            int r0 = com.google.android.gms.common.internal.safeparcel.C1053b.m7250a(r0)
            r2.f6320h = r0
        L10:
            android.os.Parcel r0 = r2.f6315c
            int r1 = r2.f6320h
            com.google.android.gms.common.internal.safeparcel.C1053b.m7251a(r0, r1)
            r0 = 2
            r2.f6319g = r0
        L1a:
            android.os.Parcel r0 = r2.f6315c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m7340b():android.os.Parcel");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo7321a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo6354a() {
        zaj zajVar = this.f6317e;
        if (zajVar == null) {
            return null;
        }
        return zajVar.m7341a(this.f6318f);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo7322b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        C1057u.m7287a(this.f6317e, "Cannot convert to JSON on client side.");
        Parcel m7340b = m7340b();
        m7340b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m7339a(sb, this.f6317e.m7341a(this.f6318f), m7340b);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zaj zajVar;
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6314b);
        C1053b.m7259a(parcel, 2, m7340b(), false);
        int i2 = this.f6316d;
        if (i2 == 0) {
            zajVar = null;
        } else {
            if (i2 != 1 && i2 != 2) {
                int i3 = this.f6316d;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
            zajVar = this.f6317e;
        }
        C1053b.m7260a(parcel, 3, (Parcelable) zajVar, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
