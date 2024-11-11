package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0197t extends SeekBar {

    /* renamed from: b */
    private final C0199u f1216b;

    public C0197t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.seekBarStyle);
    }

    public C0197t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0199u c0199u = new C0199u(this);
        this.f1216b = c0199u;
        c0199u.mo1127a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1216b.m1156b();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1216b.m1157c();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1216b.m1154a(canvas);
    }
}
