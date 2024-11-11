package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0241c;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
class C0191q {

    /* renamed from: c */
    private static final int[] f1201c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    private final ProgressBar f1202a;

    /* renamed from: b */
    private Bitmap f1203b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0191q(ProgressBar progressBar) {
        this.f1202a = progressBar;
    }

    /* renamed from: a */
    private Drawable m1123a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable m1124a = m1124a(animationDrawable.getFrame(i), true);
            m1124a.setLevel(10000);
            animationDrawable2.addFrame(m1124a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private Drawable m1124a(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0241c) {
            InterfaceC0241c interfaceC0241c = (InterfaceC0241c) drawable;
            Drawable mo1496a = interfaceC0241c.mo1496a();
            if (mo1496a != null) {
                interfaceC0241c.mo1497a(m1124a(mo1496a, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m1124a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1203b == null) {
                    this.f1203b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1125b());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape m1125b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m1126a() {
        return this.f1203b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1127a(AttributeSet attributeSet, int i) {
        C0198t0 m1133a = C0198t0.m1133a(this.f1202a.getContext(), attributeSet, f1201c, i, 0);
        Drawable m1144c = m1133a.m1144c(0);
        if (m1144c != null) {
            this.f1202a.setIndeterminateDrawable(m1123a(m1144c));
        }
        Drawable m1144c2 = m1133a.m1144c(1);
        if (m1144c2 != null) {
            this.f1202a.setProgressDrawable(m1124a(m1144c2, false));
        }
        m1133a.m1138a();
    }
}
