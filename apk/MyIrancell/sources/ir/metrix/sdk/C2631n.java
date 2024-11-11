package ir.metrix.sdk;

import android.location.Address;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* renamed from: ir.metrix.sdk.n */
/* loaded from: classes.dex */
class C2631n {

    /* renamed from: a */
    @SerializedName("featureName")
    private String f10775a;

    /* renamed from: b */
    @SerializedName("addressLines")
    private HashMap<Integer, String> f10776b;

    /* renamed from: c */
    @SerializedName("maxAddressLineIndex ")
    private int f10777c;

    /* renamed from: d */
    @SerializedName("adminArea")
    private String f10778d;

    /* renamed from: e */
    @SerializedName("subAdminArea")
    private String f10779e;

    /* renamed from: f */
    @SerializedName("locality")
    private String f10780f;

    /* renamed from: g */
    @SerializedName("subLocality")
    private String f10781g;

    /* renamed from: h */
    @SerializedName("thoroughfare")
    private String f10782h;

    /* renamed from: i */
    @SerializedName("subThoroughfare")
    private String f10783i;

    /* renamed from: j */
    @SerializedName("premises")
    private String f10784j;

    /* renamed from: k */
    @SerializedName("postalCode")
    private String f10785k;

    /* renamed from: l */
    @SerializedName("countryCode")
    private String f10786l;

    /* renamed from: m */
    @SerializedName("countryName")
    private String f10787m;

    /* renamed from: n */
    @SerializedName("latitude")
    private double f10788n;

    /* renamed from: o */
    @SerializedName("longitude")
    private double f10789o;

    /* renamed from: p */
    @SerializedName("hasLatitude ")
    private boolean f10790p;

    /* renamed from: q */
    @SerializedName("hasLongitude ")
    private boolean f10791q;

    /* renamed from: r */
    @SerializedName("phone")
    private String f10792r;

    /* renamed from: s */
    @SerializedName("url")
    private String f10793s;

    public C2631n() {
        this.f10777c = -1;
        this.f10790p = false;
        this.f10791q = false;
    }

    C2631n(String str, HashMap<Integer, String> hashMap, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, double d, double d2, boolean z, boolean z2, String str12, String str13) {
        this.f10777c = -1;
        this.f10790p = false;
        this.f10791q = false;
        this.f10775a = str;
        this.f10776b = hashMap;
        this.f10777c = i;
        this.f10778d = str2;
        this.f10779e = str3;
        this.f10780f = str4;
        this.f10781g = str5;
        this.f10782h = str6;
        this.f10783i = str7;
        this.f10784j = str8;
        this.f10785k = str9;
        this.f10786l = str10;
        this.f10787m = str11;
        this.f10788n = d;
        this.f10789o = d2;
        this.f10790p = z;
        this.f10791q = z2;
        this.f10792r = str12;
        this.f10793s = str13;
    }

    /* renamed from: a */
    public static C2631n m12654a(Address address) {
        HashMap hashMap = new HashMap();
        if (address == null) {
            return null;
        }
        for (int i = 0; i < address.getMaxAddressLineIndex(); i++) {
            hashMap.put(Integer.valueOf(i), address.getAddressLine(i));
        }
        return new C2631n(address.getFeatureName(), hashMap, address.getMaxAddressLineIndex(), address.getAdminArea(), address.getSubAdminArea(), address.getLocality(), address.getSubLocality(), address.getThoroughfare(), address.getSubThoroughfare(), address.getPremises(), address.getPostalCode(), address.getCountryCode(), address.getCountryName(), address.getLatitude(), address.getLongitude(), address.hasLatitude(), address.hasLongitude(), address.getPhone(), address.getUrl());
    }
}
