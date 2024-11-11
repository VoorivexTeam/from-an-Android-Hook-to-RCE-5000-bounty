package com.neevar.neevarpaymentsdk;

import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.neevar.neevarpaymentsdk.u */
/* loaded from: classes.dex */
class C2313u {

    /* renamed from: a */
    private static C2313u f9306a = new C2313u();

    C2313u() {
    }

    /* renamed from: a */
    public static C2313u m11022a() {
        return f9306a;
    }

    /* renamed from: a */
    public String m11023a(String str, String str2, String str3, String str4) {
        byte[] bytes = (str3.replace("\"", "") + "," + str2).getBytes("UTF-8");
        if (str.equals("skc")) {
            str4 = "oMnPEUM+wJmzApS7Zh41MCbijU6JiGL5";
        }
        return "Basic " + C2297e.m10997a((str + "," + str2 + "," + C2297e.m10997a(C2298f.m10999a(new SecretKeySpec(C2297e.m10998a(str4), "DESede"), bytes)) + ",A1CD3709-1AFB-41E9-A953-FC606362767E").getBytes("UTF-8"));
    }
}
