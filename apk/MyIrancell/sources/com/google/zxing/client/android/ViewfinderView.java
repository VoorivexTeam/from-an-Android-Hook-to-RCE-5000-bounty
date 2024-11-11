package com.google.zxing.client.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p000.C2568hw;
import p000.C3142qw;

/* loaded from: classes.dex */
public final class ViewfinderView extends View {

    /* renamed from: l */
    private static final int[] f9066l = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b */
    private C3142qw f9067b;

    /* renamed from: c */
    private final Paint f9068c;

    /* renamed from: d */
    private Bitmap f9069d;

    /* renamed from: e */
    private final int f9070e;

    /* renamed from: f */
    private final int f9071f;

    /* renamed from: g */
    private final int f9072g;

    /* renamed from: h */
    private final int f9073h;

    /* renamed from: i */
    private int f9074i;

    /* renamed from: j */
    private List<C2568hw> f9075j;

    /* renamed from: k */
    private List<C2568hw> f9076k;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9068c = new Paint(1);
        Resources resources = getResources();
        this.f9070e = resources.getColor(R$color.viewfinder_mask);
        this.f9071f = resources.getColor(R$color.result_view);
        this.f9072g = resources.getColor(R$color.viewfinder_laser);
        this.f9073h = resources.getColor(R$color.possible_result_points);
        this.f9074i = 0;
        this.f9075j = new ArrayList(5);
        this.f9076k = null;
    }

    /* renamed from: a */
    public void m10837a() {
        Bitmap bitmap = this.f9069d;
        this.f9069d = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    /* renamed from: a */
    public void m10838a(Bitmap bitmap) {
        this.f9069d = bitmap;
        invalidate();
    }

    /* renamed from: a */
    public void m10839a(C2568hw c2568hw) {
        List<C2568hw> list = this.f9075j;
        synchronized (list) {
            list.add(c2568hw);
            int size = list.size();
            if (size > 20) {
                list.subList(0, size - 10).clear();
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        C3142qw c3142qw = this.f9067b;
        if (c3142qw == null) {
            return;
        }
        Rect m15143b = c3142qw.m15143b();
        Rect m15145c = this.f9067b.m15145c();
        if (m15143b == null || m15145c == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f9068c.setColor(this.f9069d != null ? this.f9071f : this.f9070e);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, m15143b.top, this.f9068c);
        canvas.drawRect(0.0f, m15143b.top, m15143b.left, m15143b.bottom + 1, this.f9068c);
        canvas.drawRect(m15143b.right + 1, m15143b.top, f, m15143b.bottom + 1, this.f9068c);
        canvas.drawRect(0.0f, m15143b.bottom + 1, f, height, this.f9068c);
        if (this.f9069d != null) {
            this.f9068c.setAlpha(160);
            canvas.drawBitmap(this.f9069d, (Rect) null, m15143b, this.f9068c);
            return;
        }
        this.f9068c.setColor(this.f9072g);
        this.f9068c.setAlpha(f9066l[this.f9074i]);
        this.f9074i = (this.f9074i + 1) % f9066l.length;
        int height2 = (m15143b.height() / 2) + m15143b.top;
        canvas.drawRect(m15143b.left + 2, height2 - 1, m15143b.right - 1, height2 + 2, this.f9068c);
        float width2 = m15143b.width() / m15145c.width();
        float height3 = m15143b.height() / m15145c.height();
        List<C2568hw> list = this.f9075j;
        List<C2568hw> list2 = this.f9076k;
        int i = m15143b.left;
        int i2 = m15143b.top;
        if (list.isEmpty()) {
            this.f9076k = null;
        } else {
            this.f9075j = new ArrayList(5);
            this.f9076k = list;
            this.f9068c.setAlpha(160);
            this.f9068c.setColor(this.f9073h);
            synchronized (list) {
                for (C2568hw c2568hw : list) {
                    canvas.drawCircle(((int) (c2568hw.m12248a() * width2)) + i, ((int) (c2568hw.m12249b() * height3)) + i2, 6.0f, this.f9068c);
                }
            }
        }
        if (list2 != null) {
            this.f9068c.setAlpha(80);
            this.f9068c.setColor(this.f9073h);
            synchronized (list2) {
                for (C2568hw c2568hw2 : list2) {
                    canvas.drawCircle(((int) (c2568hw2.m12248a() * width2)) + i, ((int) (c2568hw2.m12249b() * height3)) + i2, 3.0f, this.f9068c);
                }
            }
        }
        postInvalidateDelayed(80L, m15143b.left - 6, m15143b.top - 6, m15143b.right + 6, m15143b.bottom + 6);
    }

    public void setCameraManager(C3142qw c3142qw) {
        this.f9067b = c3142qw;
    }
}
