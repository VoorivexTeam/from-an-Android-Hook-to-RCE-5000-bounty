package com.comviva.webaxn.p002ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import p000.C2555hj;
import p000.C2945mj;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.m0 */
/* loaded from: classes.dex */
public class C0648m0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    C3531zj f4012b;

    /* renamed from: c */
    C2945mj f4013c;

    /* renamed from: d */
    C0755x1.p f4014d;

    public C0648m0(C3531zj c3531zj, C0755x1.p pVar, C2945mj c2945mj) {
        this.f4012b = c3531zj;
        this.f4014d = pVar;
        this.f4013c = c2945mj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        HashMap<String, C2555hj> hashMap;
        if (motionEvent.getX() - motionEvent2.getX() > 50.0f && Math.abs(f) > 100.0f) {
            HashMap<String, C2555hj> hashMap2 = this.f4012b.f14499P;
            if (hashMap2 != null && hashMap2.get("leftswipe") != null) {
                C0755x1.p pVar = this.f4014d;
                C3531zj c3531zj = this.f4012b;
                pVar.mo4846a(c3531zj, c3531zj.f14499P.get("leftswipe"), this.f4013c);
            }
            return false;
        }
        if (motionEvent2.getX() - motionEvent.getX() > 50.0f && Math.abs(f) > 100.0f && (hashMap = this.f4012b.f14499P) != null && hashMap.get("rightswipe") != null) {
            C0755x1.p pVar2 = this.f4014d;
            C3531zj c3531zj2 = this.f4012b;
            pVar2.mo4846a(c3531zj2, c3531zj2.f14499P.get("rightswipe"), this.f4013c);
        }
        return false;
    }
}
