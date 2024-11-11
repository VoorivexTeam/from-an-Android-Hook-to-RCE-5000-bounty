package com.neevar.neevarpaymentsdk;

import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
class u {
    private static u a = new u();

    u() {
    }

    public static u a() {
        return a;
    }

    public String a(String str, String str2, String str3, String str4) {
        byte[] bytes = (str3.replace("\"", "") + "," + str2).getBytes("UTF-8");
        if (str.equals("skc")) {
            str4 = "oMnPEUM+wJmzApS7Zh41MCbijU6JiGL5";
        }
        return "Basic " + e.a((str + "," + str2 + "," + e.a(f.a(new SecretKeySpec(e.a(str4), "DESede"), bytes)) + ",A1CD3709-1AFB-41E9-A953-FC606362767E").getBytes("UTF-8"));
    }
}
