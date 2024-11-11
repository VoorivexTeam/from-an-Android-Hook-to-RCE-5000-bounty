package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: mt */
/* loaded from: classes.dex */
public class C2955mt extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f12180a;

    public C2955mt() {
        super(Matrix.class, "imageMatrixProperty");
        this.f12180a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f12180a.set(imageView.getImageMatrix());
        return this.f12180a;
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
