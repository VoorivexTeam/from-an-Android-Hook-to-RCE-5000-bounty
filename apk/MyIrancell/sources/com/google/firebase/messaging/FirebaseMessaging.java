package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.firebase.C2052c;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;
import p000.InterfaceC2863kk;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: a */
    @SuppressLint({"FirebaseUnknownNullness"})
    static InterfaceC2863kk f8996a;

    static {
        Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(C2052c c2052c, FirebaseInstanceId firebaseInstanceId, InterfaceC2863kk interfaceC2863kk) {
        c2052c.m10503a();
        f8996a = interfaceC2863kk;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C2052c c2052c) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c2052c.m10504a(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }
}
