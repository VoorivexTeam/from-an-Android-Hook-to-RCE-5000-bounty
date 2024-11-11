package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.c;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends AsyncTask<Void, Void, C0056a> {
    private final WeakReference<CropImageView> a;
    private final Bitmap b;
    private final Uri c;
    private final Context d;
    private final float[] e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final CropImageView.j p;
    private final Uri q;
    private final Bitmap.CompressFormat r;
    private final int s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0056a {
        public final Bitmap a;
        public final Uri b;
        final Exception c;
        final int d;

        C0056a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = null;
            this.c = null;
            this.d = i;
        }

        C0056a(Uri uri, int i) {
            this.a = null;
            this.b = uri;
            this.c = null;
            this.d = i;
        }

        C0056a(Exception exc, boolean z) {
            this.a = null;
            this.b = null;
            this.c = exc;
            this.d = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, CropImageView.j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        this.a = new WeakReference<>(cropImageView);
        this.d = cropImageView.getContext();
        this.b = bitmap;
        this.e = fArr;
        this.c = null;
        this.f = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = z2;
        this.o = z3;
        this.p = jVar;
        this.q = uri;
        this.r = compressFormat;
        this.s = i6;
        this.g = 0;
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.j jVar, Uri uri2, Bitmap.CompressFormat compressFormat, int i8) {
        this.a = new WeakReference<>(cropImageView);
        this.d = cropImageView.getContext();
        this.c = uri;
        this.e = fArr;
        this.f = i;
        this.i = z;
        this.j = i4;
        this.k = i5;
        this.g = i2;
        this.h = i3;
        this.l = i6;
        this.m = i7;
        this.n = z2;
        this.o = z3;
        this.p = jVar;
        this.q = uri2;
        this.r = compressFormat;
        this.s = i8;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0056a doInBackground(Void... voidArr) {
        c.a a;
        try {
            if (isCancelled()) {
                return null;
            }
            if (this.c != null) {
                a = c.a(this.d, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
            } else {
                if (this.b == null) {
                    return new C0056a((Bitmap) null, 1);
                }
                a = c.a(this.b, this.e, this.f, this.i, this.j, this.k, this.n, this.o);
            }
            Bitmap a2 = c.a(a.a, this.l, this.m, this.p);
            if (this.q == null) {
                return new C0056a(a2, a.b);
            }
            c.a(this.d, a2, this.q, this.r, this.s);
            if (a2 != null) {
                a2.recycle();
            }
            return new C0056a(this.q, a.b);
        } catch (Exception e) {
            return new C0056a(e, this.q != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(C0056a c0056a) {
        Bitmap bitmap;
        CropImageView cropImageView;
        if (c0056a != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.a.get()) != null) {
                z = true;
                cropImageView.a(c0056a);
            }
            if (z || (bitmap = c0056a.a) == null) {
                return;
            }
            bitmap.recycle();
        }
    }
}
