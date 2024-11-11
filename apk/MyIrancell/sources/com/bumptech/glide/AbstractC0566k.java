package com.bumptech.glide;

import com.bumptech.glide.AbstractC0566k;
import p000.C3359vh;
import p000.InterfaceC3438xh;

/* renamed from: com.bumptech.glide.k */
/* loaded from: classes.dex */
public abstract class AbstractC0566k<CHILD extends AbstractC0566k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    private InterfaceC3438xh<? super TranscodeType> f3277b = C3359vh.m16017a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final InterfaceC3438xh<? super TranscodeType> m3946a() {
        return this.f3277b;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final CHILD m16980clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
