package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.Map;
import p000.C0500c0;
import p000.C2908ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.z */
/* loaded from: classes.dex */
public final class C2133z {

    /* renamed from: a */
    private int f8986a = 0;

    /* renamed from: b */
    private final Map<Integer, C2908ls<Void>> f8987b = new C0500c0();

    /* renamed from: c */
    private final C2125v f8988c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2133z(C2125v c2125v) {
        this.f8988c = c2125v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r3 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r6.m10614b(r7);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m10726a(com.google.firebase.iid.FirebaseInstanceId r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "!"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L88
            r0 = 0
            r2 = r7[r0]
            r7 = r7[r1]
            r3 = -1
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> L42
            r5 = 83
            if (r4 == r5) goto L28
            r5 = 85
            if (r4 == r5) goto L1e
            goto L31
        L1e:
            java.lang.String r4 = "U"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L42
            if (r2 == 0) goto L31
            r3 = 1
            goto L31
        L28:
            java.lang.String r4 = "S"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L42
            if (r2 == 0) goto L31
            r3 = 0
        L31:
            if (r3 == 0) goto L3e
            if (r3 == r1) goto L36
            goto L88
        L36:
            r6.m10614b(r7)     // Catch: java.io.IOException -> L42
        L39:
            boolean r6 = com.google.firebase.iid.FirebaseInstanceId.m10600j()     // Catch: java.io.IOException -> L42
            goto L88
        L3e:
            r6.m10610a(r7)     // Catch: java.io.IOException -> L42
            goto L39
        L42:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L64
            java.lang.String r7 = r6.getMessage()
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L5c
            goto L64
        L5c:
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto L63
            return r0
        L63:
            throw r6
        L64:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            java.lang.String r7 = "Topic operation failed: "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r1.append(r6)
            r1.toString()
            return r0
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2133z.m10726a(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
    }

    /* renamed from: a */
    private final synchronized boolean m10727a(String str) {
        synchronized (this.f8988c) {
            String m10711a = this.f8988c.m10711a();
            String valueOf = String.valueOf(str);
            if (!m10711a.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                return false;
            }
            String valueOf2 = String.valueOf(str);
            this.f8988c.m10712a(m10711a.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
            return true;
        }
    }

    /* renamed from: b */
    private final String m10728b() {
        String m10711a;
        synchronized (this.f8988c) {
            m10711a = this.f8988c.m10711a();
        }
        if (TextUtils.isEmpty(m10711a)) {
            return null;
        }
        String[] split = m10711a.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean m10729a() {
        return m10728b() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m10730a(FirebaseInstanceId firebaseInstanceId) {
        C2908ls<Void> remove;
        while (true) {
            synchronized (this) {
                String m10728b = m10728b();
                if (m10728b == null) {
                    FirebaseInstanceId.m10600j();
                    return true;
                }
                if (!m10726a(firebaseInstanceId, m10728b)) {
                    return false;
                }
                synchronized (this) {
                    remove = this.f8987b.remove(Integer.valueOf(this.f8986a));
                    m10727a(m10728b);
                    this.f8986a++;
                }
                if (remove != null) {
                    remove.m13926a((C2908ls<Void>) null);
                }
            }
        }
    }
}
