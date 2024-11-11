package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class PageRootFrame extends FrameLayout {
    public PageRootFrame(Context context) {
        super(context);
    }

    public PageRootFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PageRootFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        setBackgroundColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
    }
}
