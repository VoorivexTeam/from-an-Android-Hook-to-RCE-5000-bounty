package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.C2336c;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.theartofdev.edmodo.cropper.a */
/* loaded from: classes.dex */
public final class AsyncTaskC2334a extends AsyncTask<Void, Void, a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f9455a;

    /* renamed from: b */
    private final Bitmap f9456b;

    /* renamed from: c */
    private final Uri f9457c;

    /* renamed from: d */
    private final Context f9458d;

    /* renamed from: e */
    private final float[] f9459e;

    /* renamed from: f */
    private final int f9460f;

    /* renamed from: g */
    private final int f9461g;

    /* renamed from: h */
    private final int f9462h;

    /* renamed from: i */
    private final boolean f9463i;

    /* renamed from: j */
    private final int f9464j;

    /* renamed from: k */
    private final int f9465k;

    /* renamed from: l */
    private final int f9466l;

    /* renamed from: m */
    private final int f9467m;

    /* renamed from: n */
    private final boolean f9468n;

    /* renamed from: o */
    private final boolean f9469o;

    /* renamed from: p */
    private final CropImageView.EnumC2329j f9470p;

    /* renamed from: q */
    private final Uri f9471q;

    /* renamed from: r */
    private final Bitmap.CompressFormat f9472r;

    /* renamed from: s */
    private final int f9473s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Bitmap f9474a;

        /* renamed from: b */
        public final Uri f9475b;

        /* renamed from: c */
        final Exception f9476c;

        /* renamed from: d */
        final int f9477d;

        a(Bitmap bitmap, int i) {
            this.f9474a = bitmap;
            this.f9475b = null;
            this.f9476c = null;
            this.f9477d = i;
        }

        a(Uri uri, int i) {
            this.f9474a = null;
            this.f9475b = uri;
            this.f9476c = null;
            this.f9477d = i;
        }

        a(Exception exc, boolean z) {
            this.f9474a = null;
            this.f9475b = null;
            this.f9476c = exc;
            this.f9477d = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC2334a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, CropImageView.EnumC2329j enumC2329j, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        this.f9455a = new WeakReference<>(cropImageView);
        this.f9458d = cropImageView.getContext();
        this.f9456b = bitmap;
        this.f9459e = fArr;
        this.f9457c = null;
        this.f9460f = i;
        this.f9463i = z;
        this.f9464j = i2;
        this.f9465k = i3;
        this.f9466l = i4;
        this.f9467m = i5;
        this.f9468n = z2;
        this.f9469o = z3;
        this.f9470p = enumC2329j;
        this.f9471q = uri;
        this.f9472r = compressFormat;
        this.f9473s = i6;
        this.f9461g = 0;
        this.f9462h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC2334a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.EnumC2329j enumC2329j, Uri uri2, Bitmap.CompressFormat compressFormat, int i8) {
        this.f9455a = new WeakReference<>(cropImageView);
        this.f9458d = cropImageView.getContext();
        this.f9457c = uri;
        this.f9459e = fArr;
        this.f9460f = i;
        this.f9463i = z;
        this.f9464j = i4;
        this.f9465k = i5;
        this.f9461g = i2;
        this.f9462h = i3;
        this.f9466l = i6;
        this.f9467m = i7;
        this.f9468n = z2;
        this.f9469o = z3;
        this.f9470p = enumC2329j;
        this.f9471q = uri2;
        this.f9472r = compressFormat;
        this.f9473s = i8;
        this.f9456b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        C2336c.a m11137a;
        try {
            if (isCancelled()) {
                return null;
            }
            if (this.f9457c != null) {
                m11137a = C2336c.m11134a(this.f9458d, this.f9457c, this.f9459e, this.f9460f, this.f9461g, this.f9462h, this.f9463i, this.f9464j, this.f9465k, this.f9466l, this.f9467m, this.f9468n, this.f9469o);
            } else {
                if (this.f9456b == null) {
                    return new a((Bitmap) null, 1);
                }
                m11137a = C2336c.m11137a(this.f9456b, this.f9459e, this.f9460f, this.f9463i, this.f9464j, this.f9465k, this.f9468n, this.f9469o);
            }
            Bitmap m11125a = C2336c.m11125a(m11137a.f9495a, this.f9466l, this.f9467m, this.f9470p);
            if (this.f9471q == null) {
                return new a(m11125a, m11137a.f9496b);
            }
            C2336c.m11140a(this.f9458d, m11125a, this.f9471q, this.f9472r, this.f9473s);
            if (m11125a != null) {
                m11125a.recycle();
            }
            return new a(this.f9471q, m11137a.f9496b);
        } catch (Exception e) {
            return new a(e, this.f9471q != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        Bitmap bitmap;
        CropImageView cropImageView;
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f9455a.get()) != null) {
                z = true;
                cropImageView.m11078a(aVar);
            }
            if (z || (bitmap = aVar.f9474a) == null) {
                return;
            }
            bitmap.recycle();
        }
    }
}
