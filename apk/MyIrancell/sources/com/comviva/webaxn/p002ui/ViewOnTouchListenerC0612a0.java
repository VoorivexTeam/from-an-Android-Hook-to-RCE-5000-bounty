package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.comviva.webaxn.ui.a0 */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC0612a0 implements View.OnTouchListener {

    /* renamed from: b */
    private GestureDetector f3516b;

    /* renamed from: c */
    private boolean f3517c;

    /* renamed from: d */
    private View f3518d = null;

    /* renamed from: com.comviva.webaxn.ui.a0$b */
    /* loaded from: classes.dex */
    private final class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            ViewOnTouchListenerC0612a0 viewOnTouchListenerC0612a0 = ViewOnTouchListenerC0612a0.this;
            viewOnTouchListenerC0612a0.mo4161b(viewOnTouchListenerC0612a0.f3517c);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return super.onDoubleTapEvent(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            try {
                float y = motionEvent2.getY() - motionEvent.getY();
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > Math.abs(y)) {
                    if (Math.abs(x) > 25.0f && Math.abs(f) > 100.0f) {
                        if (x > 0.0f) {
                            ViewOnTouchListenerC0612a0.this.mo4165f(ViewOnTouchListenerC0612a0.this.f3517c);
                        } else {
                            ViewOnTouchListenerC0612a0.this.mo4164e(ViewOnTouchListenerC0612a0.this.f3517c);
                        }
                    }
                } else if (Math.abs(y) > 25.0f && Math.abs(f2) > 100.0f) {
                    if (y > 0.0f) {
                        ViewOnTouchListenerC0612a0.this.mo4163d(ViewOnTouchListenerC0612a0.this.f3517c);
                    } else {
                        ViewOnTouchListenerC0612a0.this.mo4166g(ViewOnTouchListenerC0612a0.this.f3517c);
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            ViewOnTouchListenerC0612a0 viewOnTouchListenerC0612a0 = ViewOnTouchListenerC0612a0.this;
            viewOnTouchListenerC0612a0.mo4162c(viewOnTouchListenerC0612a0.f3517c);
            super.onLongPress(motionEvent);
            ViewOnTouchListenerC0612a0.this.f3518d.getParent().requestDisallowInterceptTouchEvent(false);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            ViewOnTouchListenerC0612a0.this.f3518d.getParent().requestDisallowInterceptTouchEvent(false);
            super.onShowPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return super.onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ViewOnTouchListenerC0612a0 viewOnTouchListenerC0612a0 = ViewOnTouchListenerC0612a0.this;
            viewOnTouchListenerC0612a0.mo4160a(viewOnTouchListenerC0612a0.f3517c);
            return super.onSingleTapUp(motionEvent);
        }
    }

    public ViewOnTouchListenerC0612a0(Context context, boolean z) {
        this.f3517c = false;
        this.f3516b = new GestureDetector(context, new b());
        this.f3517c = z;
    }

    /* renamed from: a */
    public void mo4160a(boolean z) {
    }

    /* renamed from: b */
    public void mo4161b(boolean z) {
    }

    /* renamed from: c */
    public void mo4162c(boolean z) {
    }

    /* renamed from: d */
    public void mo4163d(boolean z) {
    }

    /* renamed from: e */
    public void mo4164e(boolean z) {
    }

    /* renamed from: f */
    public void mo4165f(boolean z) {
    }

    /* renamed from: g */
    public void mo4166g(boolean z) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3518d = view;
        return this.f3516b.onTouchEvent(motionEvent);
    }
}
