package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: b */
    long f1483b;

    /* renamed from: c */
    boolean f1484c;

    /* renamed from: d */
    boolean f1485d;

    /* renamed from: e */
    boolean f1486e;

    /* renamed from: f */
    private final Runnable f1487f;

    /* renamed from: g */
    private final Runnable f1488g;

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$a */
    /* loaded from: classes.dex */
    class RunnableC0244a implements Runnable {
        RunnableC0244a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f1484c = false;
            contentLoadingProgressBar.f1483b = -1L;
            contentLoadingProgressBar.setVisibility(8);
        }
    }

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$b */
    /* loaded from: classes.dex */
    class RunnableC0245b implements Runnable {
        RunnableC0245b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f1485d = false;
            if (contentLoadingProgressBar.f1486e) {
                return;
            }
            contentLoadingProgressBar.f1483b = System.currentTimeMillis();
            ContentLoadingProgressBar.this.setVisibility(0);
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1486e = false;
        this.f1487f = new RunnableC0244a();
        this.f1488g = new RunnableC0245b();
    }

    /* renamed from: a */
    private void m1504a() {
        removeCallbacks(this.f1487f);
        removeCallbacks(this.f1488g);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1504a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1504a();
    }
}
