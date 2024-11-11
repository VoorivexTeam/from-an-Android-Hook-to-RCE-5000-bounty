package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: com.comviva.webaxn.ui.n */
/* loaded from: classes.dex */
public class C0650n extends ImageView {
    public C0650n(Context context) {
        super(context);
        int i = Build.VERSION.SDK_INT;
        if (i < 11 || i > 18) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), getWidth() / 2, getWidth() / 2, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
