package com.comviva.webaxn.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.comviva.webaxn.utils.x1;
import defpackage.hj;
import defpackage.mj;
import defpackage.zj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m0 extends GestureDetector.SimpleOnGestureListener {
    zj b;
    mj c;
    x1.p d;

    public m0(zj zjVar, x1.p pVar, mj mjVar) {
        this.b = zjVar;
        this.d = pVar;
        this.c = mjVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        HashMap<String, hj> hashMap;
        if (motionEvent.getX() - motionEvent2.getX() > 50.0f && Math.abs(f) > 100.0f) {
            HashMap<String, hj> hashMap2 = this.b.P;
            if (hashMap2 != null && hashMap2.get("leftswipe") != null) {
                x1.p pVar = this.d;
                zj zjVar = this.b;
                pVar.a(zjVar, zjVar.P.get("leftswipe"), this.c);
            }
            return false;
        }
        if (motionEvent2.getX() - motionEvent.getX() > 50.0f && Math.abs(f) > 100.0f && (hashMap = this.b.P) != null && hashMap.get("rightswipe") != null) {
            x1.p pVar2 = this.d;
            zj zjVar2 = this.b;
            pVar2.a(zjVar2, zjVar2.P.get("rightswipe"), this.c);
        }
        return false;
    }
}
