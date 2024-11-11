package p000;

import android.view.MotionEvent;

/* renamed from: g2 */
/* loaded from: classes.dex */
public final class C2495g2 {
    @Deprecated
    /* renamed from: a */
    public static int m11866a(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: a */
    public static int m11867a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m11868b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: c */
    public static float m11869c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static boolean m11870d(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
