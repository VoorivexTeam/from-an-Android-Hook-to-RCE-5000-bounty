package com.bumptech.glide;

import com.bumptech.glide.k;
import defpackage.vh;
import defpackage.xh;

/* loaded from: classes.dex */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private xh<? super TranscodeType> b = vh.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final xh<? super TranscodeType> a() {
        return this.b;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final CHILD m2clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
