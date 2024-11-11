package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.s */
/* loaded from: classes.dex */
public final class C1050s {

    /* renamed from: com.google.android.gms.common.internal.s$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<String> f6262a;

        /* renamed from: b */
        private final Object f6263b;

        private a(Object obj) {
            C1057u.m7286a(obj);
            this.f6263b = obj;
            this.f6262a = new ArrayList();
        }

        /* renamed from: a */
        public final a m7206a(String str, Object obj) {
            List<String> list = this.f6262a;
            C1057u.m7286a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f6263b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f6262a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f6262a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m7203a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static a m7204a(Object obj) {
        return new a(obj);
    }

    /* renamed from: a */
    public static boolean m7205a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
