package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.c;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends AsyncTask<Void, Void, a> {
    private final WeakReference<CropImageView> a;
    private final Uri b;
    private final Context c;
    private final int d;
    private final int e;

    /* loaded from: classes.dex */
    public static final class a {
        public final Uri a;
        public final Bitmap b;
        public final int c;
        public final int d;
        public final Exception e;

        a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.a = uri;
            this.b = bitmap;
            this.c = i;
            this.d = i2;
            this.e = null;
        }

        a(Uri uri, Exception exc) {
            this.a = uri;
            this.b = null;
            this.c = 0;
            this.d = 0;
            this.e = exc;
        }
    }

    public b(CropImageView cropImageView, Uri uri) {
        this.b = uri;
        this.a = new WeakReference<>(cropImageView);
        this.c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        double d = displayMetrics.density > 1.0f ? 1.0f / r6 : 1.0d;
        double d2 = displayMetrics.widthPixels;
        Double.isNaN(d2);
        this.d = (int) (d2 * d);
        double d3 = displayMetrics.heightPixels;
        Double.isNaN(d3);
        this.e = (int) (d3 * d);
    }

    public Uri a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            c.a a2 = c.a(this.c, this.b, this.d, this.e);
            if (isCancelled()) {
                return null;
            }
            c.b a3 = c.a(a2.a, this.c, this.b);
            return new a(this.b, a3.a, a2.b, a3.b);
        } catch (Exception e) {
            return new a(this.b, e);
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
            if (!isCancelled() && (cropImageView = this.a.get()) != null) {
                z = true;
                cropImageView.a(aVar);
            }
            if (z || (bitmap = aVar.b) == null) {
                return;
            }
            bitmap.recycle();
        }
    }
}
