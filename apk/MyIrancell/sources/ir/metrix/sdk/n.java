package ir.metrix.sdk;

import android.location.Address;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* loaded from: classes.dex */
class n {

    @SerializedName("featureName")
    private String a;

    @SerializedName("addressLines")
    private HashMap<Integer, String> b;

    @SerializedName("maxAddressLineIndex ")
    private int c;

    @SerializedName("adminArea")
    private String d;

    @SerializedName("subAdminArea")
    private String e;

    @SerializedName("locality")
    private String f;

    @SerializedName("subLocality")
    private String g;

    @SerializedName("thoroughfare")
    private String h;

    @SerializedName("subThoroughfare")
    private String i;

    @SerializedName("premises")
    private String j;

    @SerializedName("postalCode")
    private String k;

    @SerializedName("countryCode")
    private String l;

    @SerializedName("countryName")
    private String m;

    @SerializedName("latitude")
    private double n;

    @SerializedName("longitude")
    private double o;

    @SerializedName("hasLatitude ")
    private boolean p;

    @SerializedName("hasLongitude ")
    private boolean q;

    @SerializedName("phone")
    private String r;

    @SerializedName("url")
    private String s;

    public n() {
        this.c = -1;
        this.p = false;
        this.q = false;
    }

    n(String str, HashMap<Integer, String> hashMap, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, double d, double d2, boolean z, boolean z2, String str12, String str13) {
        this.c = -1;
        this.p = false;
        this.q = false;
        this.a = str;
        this.b = hashMap;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = d;
        this.o = d2;
        this.p = z;
        this.q = z2;
        this.r = str12;
        this.s = str13;
    }

    public static n a(Address address) {
        HashMap hashMap = new HashMap();
        if (address == null) {
            return null;
        }
        for (int i = 0; i < address.getMaxAddressLineIndex(); i++) {
            hashMap.put(Integer.valueOf(i), address.getAddressLine(i));
        }
        return new n(address.getFeatureName(), hashMap, address.getMaxAddressLineIndex(), address.getAdminArea(), address.getSubAdminArea(), address.getLocality(), address.getSubLocality(), address.getThoroughfare(), address.getSubThoroughfare(), address.getPremises(), address.getPostalCode(), address.getCountryCode(), address.getCountryName(), address.getLatitude(), address.getLongitude(), address.hasLatitude(), address.hasLongitude(), address.getPhone(), address.getUrl());
    }
}
