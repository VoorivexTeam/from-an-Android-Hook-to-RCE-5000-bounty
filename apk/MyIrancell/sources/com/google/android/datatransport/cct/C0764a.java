package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p000.C2476fk;
import p000.InterfaceC2993nl;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C0764a implements InterfaceC2993nl {

    /* renamed from: c */
    static final String f5350c = C0768e.m6266a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    static final String f5351d = C0768e.m6266a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    private static final String f5352e = C0768e.m6266a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    private static final Set<C2476fk> f5353f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C2476fk.m11789a("proto"), C2476fk.m11789a("json"))));

    /* renamed from: g */
    public static final C0764a f5354g;

    /* renamed from: a */
    private final String f5355a;

    /* renamed from: b */
    private final String f5356b;

    static {
        new C0764a(f5350c, null);
        f5354g = new C0764a(f5351d, f5352e);
    }

    public C0764a(String str, String str2) {
        this.f5355a = str;
        this.f5356b = str2;
    }

    /* renamed from: a */
    public static C0764a m6249a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C0764a(str2, str3);
    }

    @Override // p000.InterfaceC2947ml
    /* renamed from: a */
    public String mo6250a() {
        return "cct";
    }

    @Override // p000.InterfaceC2993nl
    /* renamed from: b */
    public Set<C2476fk> mo6251b() {
        return f5353f;
    }

    @Override // p000.InterfaceC2947ml
    /* renamed from: c */
    public byte[] mo6252c() {
        return m6253d();
    }

    /* renamed from: d */
    public byte[] m6253d() {
        if (this.f5356b == null && this.f5355a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5355a;
        objArr[2] = "\\";
        String str = this.f5356b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String m6254e() {
        return this.f5356b;
    }

    /* renamed from: f */
    public String m6255f() {
        return this.f5355a;
    }
}
