package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1267f0;
import com.google.android.gms.internal.measurement.C1297h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.fa */
/* loaded from: classes.dex */
public final /* synthetic */ class C1731fa {

    /* renamed from: a */
    static final /* synthetic */ int[] f7556a;

    /* renamed from: b */
    static final /* synthetic */ int[] f7557b;

    static {
        int[] iArr = new int[C1267f0.b.values().length];
        f7557b = iArr;
        try {
            iArr[C1267f0.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7557b[C1267f0.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7557b[C1267f0.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7557b[C1267f0.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[C1297h0.a.values().length];
        f7556a = iArr2;
        try {
            iArr2[C1297h0.a.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7556a[C1297h0.a.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f7556a[C1297h0.a.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f7556a[C1297h0.a.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f7556a[C1297h0.a.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f7556a[C1297h0.a.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
