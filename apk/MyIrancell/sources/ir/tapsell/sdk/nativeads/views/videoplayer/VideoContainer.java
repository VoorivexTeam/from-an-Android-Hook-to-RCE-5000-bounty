package ir.tapsell.sdk.nativeads.views.videoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class VideoContainer extends FrameLayout implements NoProguard {
    private float aspectRatio;
    InterfaceC2724a listener;

    public VideoContainer(Context context) {
        super(context);
        this.aspectRatio = 0.5625f;
        initialize();
    }

    public VideoContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aspectRatio = 0.5625f;
        initialize();
    }

    public VideoContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aspectRatio = 0.5625f;
        initialize();
    }

    private void initialize() {
        setAspectRatio(0.5625f);
    }

    public InterfaceC2724a getListener() {
        return this.listener;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(this.aspectRatio * size), 1073741824));
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC2724a interfaceC2724a = this.listener;
        if (i == 0) {
            if (interfaceC2724a != null) {
                interfaceC2724a.mo12946b();
            }
        } else if (interfaceC2724a != null) {
            interfaceC2724a.mo12945a();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            InterfaceC2724a interfaceC2724a = this.listener;
            if (interfaceC2724a != null) {
                interfaceC2724a.mo12946b();
                return;
            }
            return;
        }
        InterfaceC2724a interfaceC2724a2 = this.listener;
        if (interfaceC2724a2 != null) {
            interfaceC2724a2.mo12945a();
        }
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
        requestLayout();
    }

    public void setListener(InterfaceC2724a interfaceC2724a) {
        this.listener = interfaceC2724a;
    }
}
