package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R$attr;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C0195s extends RatingBar {

    /* renamed from: b */
    private final C0191q f1214b;

    public C0195s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ratingBarStyle);
    }

    public C0195s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0191q c0191q = new C0191q(this);
        this.f1214b = c0191q;
        c0191q.mo1127a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m1126a = this.f1214b.m1126a();
        if (m1126a != null) {
            setMeasuredDimension(View.resolveSizeAndState(m1126a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
