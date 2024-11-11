package com.comviva.webaxn.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class a0 implements View.OnTouchListener {
    private GestureDetector b;
    private boolean c;
    private View d = null;

    /* loaded from: classes.dex */
    private final class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            a0 a0Var = a0.this;
            a0Var.b(a0Var.c);
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
                            a0.this.f(a0.this.c);
                        } else {
                            a0.this.e(a0.this.c);
                        }
                    }
                } else if (Math.abs(y) > 25.0f && Math.abs(f2) > 100.0f) {
                    if (y > 0.0f) {
                        a0.this.d(a0.this.c);
                    } else {
                        a0.this.g(a0.this.c);
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
            a0 a0Var = a0.this;
            a0Var.c(a0Var.c);
            super.onLongPress(motionEvent);
            a0.this.d.getParent().requestDisallowInterceptTouchEvent(false);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            a0.this.d.getParent().requestDisallowInterceptTouchEvent(false);
            super.onShowPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return super.onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            a0 a0Var = a0.this;
            a0Var.a(a0Var.c);
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a0(Context context, boolean z) {
        this.c = false;
        this.b = new GestureDetector(context, new b());
        this.c = z;
    }

    public void a(boolean z) {
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }

    public void e(boolean z) {
    }

    public void f(boolean z) {
    }

    public void g(boolean z) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.d = view;
        return this.b.onTouchEvent(motionEvent);
    }
}
