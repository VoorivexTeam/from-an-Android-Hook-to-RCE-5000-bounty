package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.C2336c;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.theartofdev.edmodo.cropper.b */
/* loaded from: classes.dex */
public final class AsyncTaskC2335b extends AsyncTask<Void, Void, a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f9478a;

    /* renamed from: b */
    private final Uri f9479b;

    /* renamed from: c */
    private final Context f9480c;

    /* renamed from: d */
    private final int f9481d;

    /* renamed from: e */
    private final int f9482e;

    /* renamed from: com.theartofdev.edmodo.cropper.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f9483a;

        /* renamed from: b */
        public final Bitmap f9484b;

        /* renamed from: c */
        public final int f9485c;

        /* renamed from: d */
        public final int f9486d;

        /* renamed from: e */
        public final Exception f9487e;

        a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f9483a = uri;
            this.f9484b = bitmap;
            this.f9485c = i;
            this.f9486d = i2;
            this.f9487e = null;
        }

        a(Uri uri, Exception exc) {
            this.f9483a = uri;
            this.f9484b = null;
            this.f9485c = 0;
            this.f9486d = 0;
            this.f9487e = exc;
        }
    }

    public AsyncTaskC2335b(CropImageView cropImageView, Uri uri) {
        this.f9479b = uri;
        this.f9478a = new WeakReference<>(cropImageView);
        this.f9480c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        double d = displayMetrics.density > 1.0f ? 1.0f / r6 : 1.0d;
        double d2 = displayMetrics.widthPixels;
        Double.isNaN(d2);
        this.f9481d = (int) (d2 * d);
        double d3 = displayMetrics.heightPixels;
        Double.isNaN(d3);
        this.f9482e = (int) (d3 * d);
    }

    /* renamed from: a */
    public Uri m11117a() {
        return this.f9479b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            C2336c.a m11132a = C2336c.m11132a(this.f9480c, this.f9479b, this.f9481d, this.f9482e);
            if (isCancelled()) {
                return null;
            }
            C2336c.b m11138a = C2336c.m11138a(m11132a.f9495a, this.f9480c, this.f9479b);
            return new a(this.f9479b, m11138a.f9497a, m11132a.f9496b, m11138a.f9498b);
        } catch (Exception e) {
            return new a(this.f9479b, e);
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
            if (!isCancelled() && (cropImageView = this.f9478a.get()) != null) {
                z = true;
                cropImageView.m11079a(aVar);
            }
            if (z || (bitmap = aVar.f9484b) == null) {
                return;
            }
            bitmap.recycle();
        }
    }
}
