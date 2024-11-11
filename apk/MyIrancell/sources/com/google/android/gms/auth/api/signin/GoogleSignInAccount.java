package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.util.C1102h;
import com.google.android.gms.common.util.InterfaceC1099e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0828c();

    /* renamed from: o */
    private static InterfaceC1099e f5580o = C1102h.m7385d();

    /* renamed from: b */
    private final int f5581b;

    /* renamed from: c */
    private String f5582c;

    /* renamed from: d */
    private String f5583d;

    /* renamed from: e */
    private String f5584e;

    /* renamed from: f */
    private String f5585f;

    /* renamed from: g */
    private Uri f5586g;

    /* renamed from: h */
    private String f5587h;

    /* renamed from: i */
    private long f5588i;

    /* renamed from: j */
    private String f5589j;

    /* renamed from: k */
    private List<Scope> f5590k;

    /* renamed from: l */
    private String f5591l;

    /* renamed from: m */
    private String f5592m;

    /* renamed from: n */
    private Set<Scope> f5593n = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f5581b = i;
        this.f5582c = str;
        this.f5583d = str2;
        this.f5584e = str3;
        this.f5585f = str4;
        this.f5586g = uri;
        this.f5587h = str5;
        this.f5588i = j;
        this.f5589j = str6;
        this.f5590k = list;
        this.f5591l = str7;
        this.f5592m = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m6389a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount m6390a = m6390a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m6390a.f5587h = jSONObject.optString("serverAuthCode", null);
        return m6390a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m6390a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f5580o.mo7375a() / 1000) : l).longValue();
        C1057u.m7296b(str7);
        C1057u.m7286a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    /* renamed from: u */
    private final JSONObject m6391u() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m6397n() != null) {
                jSONObject.put("id", m6397n());
            }
            if (m6398o() != null) {
                jSONObject.put("tokenId", m6398o());
            }
            if (m6394k() != null) {
                jSONObject.put("email", m6394k());
            }
            if (m6393j() != null) {
                jSONObject.put("displayName", m6393j());
            }
            if (m6396m() != null) {
                jSONObject.put("givenName", m6396m());
            }
            if (m6395l() != null) {
                jSONObject.put("familyName", m6395l());
            }
            if (m6399p() != null) {
                jSONObject.put("photoUrl", m6399p().toString());
            }
            if (m6401r() != null) {
                jSONObject.put("serverAuthCode", m6401r());
            }
            jSONObject.put("expirationTime", this.f5588i);
            jSONObject.put("obfuscatedIdentifier", this.f5589j);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f5590k.toArray(new Scope[this.f5590k.size()]);
            Arrays.sort(scopeArr, C0827b.f5623b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m6494j());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public Account m6392d() {
        if (this.f5584e == null) {
            return null;
        }
        return new Account(this.f5584e, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5589j.equals(this.f5589j) && googleSignInAccount.m6400q().equals(m6400q());
    }

    public int hashCode() {
        return ((this.f5589j.hashCode() + 527) * 31) + m6400q().hashCode();
    }

    /* renamed from: j */
    public String m6393j() {
        return this.f5585f;
    }

    /* renamed from: k */
    public String m6394k() {
        return this.f5584e;
    }

    /* renamed from: l */
    public String m6395l() {
        return this.f5592m;
    }

    /* renamed from: m */
    public String m6396m() {
        return this.f5591l;
    }

    /* renamed from: n */
    public String m6397n() {
        return this.f5582c;
    }

    /* renamed from: o */
    public String m6398o() {
        return this.f5583d;
    }

    /* renamed from: p */
    public Uri m6399p() {
        return this.f5586g;
    }

    /* renamed from: q */
    public Set<Scope> m6400q() {
        HashSet hashSet = new HashSet(this.f5590k);
        hashSet.addAll(this.f5593n);
        return hashSet;
    }

    /* renamed from: r */
    public String m6401r() {
        return this.f5587h;
    }

    /* renamed from: s */
    public final String m6402s() {
        return this.f5589j;
    }

    /* renamed from: t */
    public final String m6403t() {
        JSONObject m6391u = m6391u();
        m6391u.remove("serverAuthCode");
        return m6391u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5581b);
        C1053b.m7266a(parcel, 2, m6397n(), false);
        C1053b.m7266a(parcel, 3, m6398o(), false);
        C1053b.m7266a(parcel, 4, m6394k(), false);
        C1053b.m7266a(parcel, 5, m6393j(), false);
        C1053b.m7260a(parcel, 6, (Parcelable) m6399p(), i, false);
        C1053b.m7266a(parcel, 7, m6401r(), false);
        C1053b.m7256a(parcel, 8, this.f5588i);
        C1053b.m7266a(parcel, 9, this.f5589j, false);
        C1053b.m7279d(parcel, 10, this.f5590k, false);
        C1053b.m7266a(parcel, 11, m6396m(), false);
        C1053b.m7266a(parcel, 12, m6395l(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
