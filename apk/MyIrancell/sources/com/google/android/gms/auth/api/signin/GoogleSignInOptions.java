package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C0833a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C0859a.d.f, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l */
    public static final Scope f5594l = new Scope("profile");

    /* renamed from: m */
    public static final Scope f5595m;

    /* renamed from: n */
    public static final Scope f5596n;

    /* renamed from: o */
    public static final Scope f5597o;

    /* renamed from: p */
    public static final GoogleSignInOptions f5598p;

    /* renamed from: q */
    public static final GoogleSignInOptions f5599q;

    /* renamed from: r */
    private static Comparator<Scope> f5600r;

    /* renamed from: b */
    private final int f5601b;

    /* renamed from: c */
    private final ArrayList<Scope> f5602c;

    /* renamed from: d */
    private Account f5603d;

    /* renamed from: e */
    private boolean f5604e;

    /* renamed from: f */
    private final boolean f5605f;

    /* renamed from: g */
    private final boolean f5606g;

    /* renamed from: h */
    private String f5607h;

    /* renamed from: i */
    private String f5608i;

    /* renamed from: j */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f5609j;

    /* renamed from: k */
    private String f5610k;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes.dex */
    public static final class C0825a {

        /* renamed from: a */
        private Set<Scope> f5611a;

        /* renamed from: b */
        private boolean f5612b;

        /* renamed from: c */
        private boolean f5613c;

        /* renamed from: d */
        private boolean f5614d;

        /* renamed from: e */
        private String f5615e;

        /* renamed from: f */
        private Account f5616f;

        /* renamed from: g */
        private String f5617g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f5618h;

        /* renamed from: i */
        private String f5619i;

        public C0825a() {
            this.f5611a = new HashSet();
            this.f5618h = new HashMap();
        }

        public C0825a(GoogleSignInOptions googleSignInOptions) {
            this.f5611a = new HashSet();
            this.f5618h = new HashMap();
            C1057u.m7286a(googleSignInOptions);
            this.f5611a = new HashSet(googleSignInOptions.f5602c);
            this.f5612b = googleSignInOptions.f5605f;
            this.f5613c = googleSignInOptions.f5606g;
            this.f5614d = googleSignInOptions.f5604e;
            this.f5615e = googleSignInOptions.f5607h;
            this.f5616f = googleSignInOptions.f5603d;
            this.f5617g = googleSignInOptions.f5608i;
            this.f5618h = GoogleSignInOptions.m6406a(googleSignInOptions.f5609j);
            this.f5619i = googleSignInOptions.f5610k;
        }

        /* renamed from: a */
        public final C0825a m6426a(Scope scope, Scope... scopeArr) {
            this.f5611a.add(scope);
            this.f5611a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: a */
        public final GoogleSignInOptions m6427a() {
            if (this.f5611a.contains(GoogleSignInOptions.f5597o) && this.f5611a.contains(GoogleSignInOptions.f5596n)) {
                this.f5611a.remove(GoogleSignInOptions.f5596n);
            }
            if (this.f5614d && (this.f5616f == null || !this.f5611a.isEmpty())) {
                m6428b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f5611a), this.f5616f, this.f5614d, this.f5612b, this.f5613c, this.f5615e, this.f5617g, this.f5618h, this.f5619i, null);
        }

        /* renamed from: b */
        public final C0825a m6428b() {
            this.f5611a.add(GoogleSignInOptions.f5595m);
            return this;
        }

        /* renamed from: c */
        public final C0825a m6429c() {
            this.f5611a.add(GoogleSignInOptions.f5594l);
            return this;
        }
    }

    static {
        new Scope("email");
        f5595m = new Scope("openid");
        f5596n = new Scope("https://www.googleapis.com/auth/games_lite");
        f5597o = new Scope("https://www.googleapis.com/auth/games");
        C0825a c0825a = new C0825a();
        c0825a.m6428b();
        c0825a.m6429c();
        f5598p = c0825a.m6427a();
        C0825a c0825a2 = new C0825a();
        c0825a2.m6426a(f5596n, new Scope[0]);
        f5599q = c0825a2.m6427a();
        CREATOR = new C0830e();
        f5600r = new C0829d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m6406a(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f5601b = i;
        this.f5602c = arrayList;
        this.f5603d = account;
        this.f5604e = z;
        this.f5605f = z2;
        this.f5606g = z3;
        this.f5607h = str;
        this.f5608i = str2;
        this.f5609j = new ArrayList<>(map.values());
        this.f5610k = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C0829d c0829d) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    /* renamed from: a */
    public static GoogleSignInOptions m6404a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m6406a(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.m6432j()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* renamed from: r */
    private final JSONObject m6416r() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5602c, f5600r);
            ArrayList<Scope> arrayList = this.f5602c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.m6494j());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f5603d != null) {
                jSONObject.put("accountName", this.f5603d.name);
            }
            jSONObject.put("idTokenRequested", this.f5604e);
            jSONObject.put("forceCodeForRefreshToken", this.f5606g);
            jSONObject.put("serverAuthRequested", this.f5605f);
            if (!TextUtils.isEmpty(this.f5607h)) {
                jSONObject.put("serverClientId", this.f5607h);
            }
            if (!TextUtils.isEmpty(this.f5608i)) {
                jSONObject.put("hostedDomain", this.f5608i);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public Account m6417d() {
        return this.f5603d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        if (r3.f5607h.equals(r4.m6421m()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004a, code lost:
    
        if (r3.f5603d.equals(r4.m6417d()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L91
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f5609j     // Catch: java.lang.ClassCastException -> L91
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L91
            if (r1 > 0) goto L91
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f5609j     // Catch: java.lang.ClassCastException -> L91
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L91
            if (r1 <= 0) goto L18
            goto L91
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f5602c     // Catch: java.lang.ClassCastException -> L91
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L91
            java.util.ArrayList r2 = r4.m6420l()     // Catch: java.lang.ClassCastException -> L91
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L91
            if (r1 != r2) goto L91
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f5602c     // Catch: java.lang.ClassCastException -> L91
            java.util.ArrayList r2 = r4.m6420l()     // Catch: java.lang.ClassCastException -> L91
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L91
            if (r1 != 0) goto L35
            goto L91
        L35:
            android.accounts.Account r1 = r3.f5603d     // Catch: java.lang.ClassCastException -> L91
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m6417d()     // Catch: java.lang.ClassCastException -> L91
            if (r1 != 0) goto L91
            goto L4c
        L40:
            android.accounts.Account r1 = r3.f5603d     // Catch: java.lang.ClassCastException -> L91
            android.accounts.Account r2 = r4.m6417d()     // Catch: java.lang.ClassCastException -> L91
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L91
            if (r1 == 0) goto L91
        L4c:
            java.lang.String r1 = r3.f5607h     // Catch: java.lang.ClassCastException -> L91
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L91
            if (r1 == 0) goto L5f
            java.lang.String r1 = r4.m6421m()     // Catch: java.lang.ClassCastException -> L91
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L91
            if (r1 == 0) goto L91
            goto L6b
        L5f:
            java.lang.String r1 = r3.f5607h     // Catch: java.lang.ClassCastException -> L91
            java.lang.String r2 = r4.m6421m()     // Catch: java.lang.ClassCastException -> L91
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L91
            if (r1 == 0) goto L91
        L6b:
            boolean r1 = r3.f5606g     // Catch: java.lang.ClassCastException -> L91
            boolean r2 = r4.m6422n()     // Catch: java.lang.ClassCastException -> L91
            if (r1 != r2) goto L91
            boolean r1 = r3.f5604e     // Catch: java.lang.ClassCastException -> L91
            boolean r2 = r4.m6423o()     // Catch: java.lang.ClassCastException -> L91
            if (r1 != r2) goto L91
            boolean r1 = r3.f5605f     // Catch: java.lang.ClassCastException -> L91
            boolean r2 = r4.m6424p()     // Catch: java.lang.ClassCastException -> L91
            if (r1 != r2) goto L91
            java.lang.String r1 = r3.f5610k     // Catch: java.lang.ClassCastException -> L91
            java.lang.String r4 = r4.m6419k()     // Catch: java.lang.ClassCastException -> L91
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L91
            if (r4 == 0) goto L91
            r4 = 1
            return r4
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f5602c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.m6494j());
        }
        Collections.sort(arrayList);
        C0833a c0833a = new C0833a();
        c0833a.m6439a(arrayList);
        c0833a.m6439a(this.f5603d);
        c0833a.m6439a(this.f5607h);
        c0833a.m6440a(this.f5606g);
        c0833a.m6440a(this.f5604e);
        c0833a.m6440a(this.f5605f);
        c0833a.m6439a(this.f5610k);
        return c0833a.m6438a();
    }

    /* renamed from: j */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m6418j() {
        return this.f5609j;
    }

    /* renamed from: k */
    public String m6419k() {
        return this.f5610k;
    }

    /* renamed from: l */
    public ArrayList<Scope> m6420l() {
        return new ArrayList<>(this.f5602c);
    }

    /* renamed from: m */
    public String m6421m() {
        return this.f5607h;
    }

    /* renamed from: n */
    public boolean m6422n() {
        return this.f5606g;
    }

    /* renamed from: o */
    public boolean m6423o() {
        return this.f5604e;
    }

    /* renamed from: p */
    public boolean m6424p() {
        return this.f5605f;
    }

    /* renamed from: q */
    public final String m6425q() {
        return m6416r().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5601b);
        C1053b.m7279d(parcel, 2, m6420l(), false);
        C1053b.m7260a(parcel, 3, (Parcelable) m6417d(), i, false);
        C1053b.m7269a(parcel, 4, m6423o());
        C1053b.m7269a(parcel, 5, m6424p());
        C1053b.m7269a(parcel, 6, m6422n());
        C1053b.m7266a(parcel, 7, m6421m(), false);
        C1053b.m7266a(parcel, 8, this.f5608i, false);
        C1053b.m7279d(parcel, 9, m6418j(), false);
        C1053b.m7266a(parcel, 10, m6419k(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
