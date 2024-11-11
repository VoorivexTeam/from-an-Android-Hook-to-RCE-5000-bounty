package com.neevar.neevarpaymentsdk;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;

/* loaded from: classes.dex */
class NonFocusingScrollView extends ScrollView {
    public NonFocusingScrollView(Context context) {
        super(context);
    }

    public NonFocusingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonFocusingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public ArrayList<View> getFocusables(int i) {
        return new ArrayList<>();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }
}
