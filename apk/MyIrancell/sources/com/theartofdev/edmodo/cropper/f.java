package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
final class f {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final b e;
    private final PointF f = new PointF();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    static {
        new Matrix();
    }

    public f(b bVar, e eVar, float f, float f2) {
        this.e = bVar;
        this.a = eVar.d();
        this.b = eVar.c();
        this.c = eVar.b();
        this.d = eVar.a();
        a(eVar.e(), f, f2);
    }

    private static float a(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    private void a(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    private void a(RectF rectF, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        switch (a.a[this.e.ordinal()]) {
            case 1:
                f4 = rectF.left;
                f8 = f4 - f;
                f3 = rectF.top;
                f7 = f3 - f2;
                break;
            case 2:
                f4 = rectF.right;
                f8 = f4 - f;
                f3 = rectF.top;
                f7 = f3 - f2;
                break;
            case 3:
                f5 = rectF.left;
                f8 = f5 - f;
                f3 = rectF.bottom;
                f7 = f3 - f2;
                break;
            case 4:
                f5 = rectF.right;
                f8 = f5 - f;
                f3 = rectF.bottom;
                f7 = f3 - f2;
                break;
            case 5:
                f6 = rectF.left;
                f8 = f6 - f;
                f7 = 0.0f;
                break;
            case 6:
                f3 = rectF.top;
                f7 = f3 - f2;
                break;
            case 7:
                f6 = rectF.right;
                f8 = f6 - f;
                f7 = 0.0f;
                break;
            case 8:
                f3 = rectF.bottom;
                f7 = f3 - f2;
                break;
            case 9:
                f8 = rectF.centerX() - f;
                f3 = rectF.centerY();
                f7 = f3 - f2;
                break;
            default:
                f7 = 0.0f;
                break;
        }
        PointF pointF = this.f;
        pointF.x = f8;
        pointF.y = f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if ((r0 + r9) <= r10.bottom) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r1 + r8) <= r10.right) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.graphics.RectF r7, float r8, float r9, android.graphics.RectF r10, int r11, int r12, float r13) {
        /*
            r6 = this;
            float r0 = r7.centerX()
            float r8 = r8 - r0
            float r0 = r7.centerY()
            float r9 = r9 - r0
            float r0 = r7.left
            float r1 = r0 + r8
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1065772646(0x3f866666, float:1.05)
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L2f
            float r1 = r7.right
            float r5 = r1 + r8
            float r11 = (float) r11
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 > 0) goto L2f
            float r0 = r0 + r8
            float r11 = r10.left
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto L2f
            float r1 = r1 + r8
            float r11 = r10.right
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L39
        L2f:
            float r8 = r8 / r3
            android.graphics.PointF r11 = r6.f
            float r0 = r11.x
            float r1 = r8 / r2
            float r0 = r0 - r1
            r11.x = r0
        L39:
            float r11 = r7.top
            float r0 = r11 + r9
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L58
            float r0 = r7.bottom
            float r1 = r0 + r9
            float r12 = (float) r12
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 > 0) goto L58
            float r11 = r11 + r9
            float r12 = r10.top
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L58
            float r0 = r0 + r9
            float r11 = r10.bottom
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L62
        L58:
            float r9 = r9 / r3
            android.graphics.PointF r11 = r6.f
            float r12 = r11.y
            float r0 = r9 / r2
            float r12 = r12 - r0
            r11.y = r12
        L62:
            r7.offset(r8, r9)
            r6.c(r7, r10, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.f.a(android.graphics.RectF, float, float, android.graphics.RectF, int, int, float):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    private void a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        switch (a.a[this.e.ordinal()]) {
            case 1:
                if (a(f, f2, rectF.right, rectF.bottom) < f4) {
                    b(rectF, f2, rectF2, f3, f4, true, false);
                    b(rectF, f4);
                    return;
                } else {
                    a(rectF, f, rectF2, f3, f4, true, false);
                    d(rectF, f4);
                    return;
                }
            case 2:
                if (a(rectF.left, f2, f, rectF.bottom) < f4) {
                    b(rectF, f2, rectF2, f3, f4, false, true);
                    c(rectF, f4);
                    return;
                } else {
                    b(rectF, f, rectF2, i, f3, f4, true, false);
                    d(rectF, f4);
                    return;
                }
            case 3:
                if (a(f, rectF.top, rectF.right, f2) < f4) {
                    a(rectF, f2, rectF2, i2, f3, f4, true, false);
                    b(rectF, f4);
                    return;
                } else {
                    a(rectF, f, rectF2, f3, f4, false, true);
                    a(rectF, f4);
                    return;
                }
            case 4:
                if (a(rectF.left, rectF.top, f, f2) < f4) {
                    a(rectF, f2, rectF2, i2, f3, f4, false, true);
                    c(rectF, f4);
                    return;
                } else {
                    b(rectF, f, rectF2, i, f3, f4, false, true);
                    a(rectF, f4);
                    return;
                }
            case 5:
                a(rectF, f, rectF2, f3, f4, true, true);
                b(rectF, rectF2, f4);
                return;
            case 6:
                b(rectF, f2, rectF2, f3, f4, true, true);
                a(rectF, rectF2, f4);
                return;
            case 7:
                b(rectF, f, rectF2, i, f3, f4, true, true);
                b(rectF, rectF2, f4);
                return;
            case 8:
                a(rectF, f2, rectF2, i2, f3, f4, true, true);
                a(rectF, rectF2, f4);
                return;
            default:
                return;
        }
    }

    private void a(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        float max;
        if (f < 0.0f) {
            f /= 1.05f;
            this.f.x -= f / 1.1f;
        }
        float f4 = rectF2.left;
        if (f < f4) {
            this.f.x -= (f - f4) / 2.0f;
        }
        float f5 = rectF2.left;
        if (f - f5 < f2) {
            f = f5;
        }
        float f6 = rectF.right;
        float f7 = f6 - f;
        float f8 = this.a;
        if (f7 < f8) {
            f = f6 - f8;
        }
        float f9 = rectF.right;
        float f10 = f9 - f;
        float f11 = this.c;
        if (f10 > f11) {
            f = f9 - f11;
        }
        float f12 = rectF2.left;
        if (f - f12 < f2) {
            f = f12;
        }
        if (f3 > 0.0f) {
            float f13 = rectF.right;
            float f14 = (f13 - f) / f3;
            float f15 = this.b;
            if (f14 < f15) {
                f = Math.max(rectF2.left, f13 - (f15 * f3));
                f14 = (rectF.right - f) / f3;
            }
            float f16 = this.d;
            if (f14 > f16) {
                f = Math.max(rectF2.left, rectF.right - (f16 * f3));
                f14 = (rectF.right - f) / f3;
            }
            if (z && z2) {
                max = Math.max(rectF2.left, rectF.right - (rectF2.height() * f3));
            } else {
                if (z) {
                    float f17 = rectF.bottom;
                    float f18 = f17 - f14;
                    float f19 = rectF2.top;
                    if (f18 < f19) {
                        f = Math.max(rectF2.left, rectF.right - ((f17 - f19) * f3));
                        f14 = (rectF.right - f) / f3;
                    }
                }
                if (z2) {
                    float f20 = rectF.top;
                    float f21 = f14 + f20;
                    float f22 = rectF2.bottom;
                    if (f21 > f22) {
                        max = Math.max(rectF2.left, rectF.right - ((f22 - f20) * f3));
                    }
                }
            }
            f = Math.max(f, max);
        }
        rectF.left = f;
    }

    private void a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float min;
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f.y -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.bottom;
        if (f > f5) {
            this.f.y -= (f - f5) / 2.0f;
        }
        float f6 = rectF2.bottom;
        if (f6 - f < f2) {
            f = f6;
        }
        float f7 = rectF.top;
        float f8 = f - f7;
        float f9 = this.b;
        if (f8 < f9) {
            f = f7 + f9;
        }
        float f10 = rectF.top;
        float f11 = f - f10;
        float f12 = this.d;
        if (f11 > f12) {
            f = f10 + f12;
        }
        float f13 = rectF2.bottom;
        if (f13 - f < f2) {
            f = f13;
        }
        if (f3 > 0.0f) {
            float f14 = rectF.top;
            float f15 = (f - f14) * f3;
            float f16 = this.a;
            if (f15 < f16) {
                f = Math.min(rectF2.bottom, f14 + (f16 / f3));
                f15 = (f - rectF.top) * f3;
            }
            float f17 = this.c;
            if (f15 > f17) {
                f = Math.min(rectF2.bottom, rectF.top + (f17 / f3));
                f15 = (f - rectF.top) * f3;
            }
            if (z && z2) {
                min = Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3));
            } else {
                if (z) {
                    float f18 = rectF.right;
                    float f19 = f18 - f15;
                    float f20 = rectF2.left;
                    if (f19 < f20) {
                        f = Math.min(rectF2.bottom, rectF.top + ((f18 - f20) / f3));
                        f15 = (f - rectF.top) * f3;
                    }
                }
                if (z2) {
                    float f21 = rectF.left;
                    float f22 = f15 + f21;
                    float f23 = rectF2.right;
                    if (f22 > f23) {
                        min = Math.min(rectF2.bottom, rectF.top + ((f23 - f21) / f3));
                    }
                }
            }
            f = Math.min(f, min);
        }
        rectF.bottom = f;
    }

    private void a(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, 0.0f);
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 > f5) {
            rectF.offset(f5 - f4, 0.0f);
        }
    }

    private void b(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    private void b(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        float f4;
        boolean z;
        boolean z2;
        f fVar;
        RectF rectF3;
        RectF rectF4;
        float f5;
        float f6;
        boolean z3;
        f fVar2;
        RectF rectF5;
        RectF rectF6;
        float f7;
        boolean z4;
        float f8;
        float f9;
        int i3;
        switch (a.a[this.e.ordinal()]) {
            case 1:
                f4 = 0.0f;
                z = false;
                z2 = false;
                fVar = this;
                rectF3 = rectF;
                rectF4 = rectF2;
                f5 = f3;
                fVar.b(rectF3, f2, rectF4, f5, 0.0f, false, false);
                f6 = f;
                fVar.a(rectF3, f6, rectF4, f5, f4, z, z2);
                return;
            case 2:
                z3 = false;
                fVar2 = this;
                rectF5 = rectF;
                rectF6 = rectF2;
                fVar2.b(rectF5, f2, rectF6, f3, 0.0f, false, false);
                f7 = 0.0f;
                z4 = false;
                f8 = f;
                i3 = i;
                f9 = f3;
                fVar2.b(rectF5, f8, rectF6, i3, f9, f7, z3, z4);
                return;
            case 3:
                z2 = false;
                fVar = this;
                rectF3 = rectF;
                rectF4 = rectF2;
                fVar.a(rectF3, f2, rectF4, i2, f3, 0.0f, false, false);
                f4 = 0.0f;
                z = false;
                f6 = f;
                f5 = f3;
                fVar.a(rectF3, f6, rectF4, f5, f4, z, z2);
                return;
            case 4:
                f7 = 0.0f;
                z3 = false;
                z4 = false;
                fVar2 = this;
                rectF5 = rectF;
                rectF6 = rectF2;
                f9 = f3;
                fVar2.a(rectF5, f2, rectF6, i2, f9, 0.0f, false, false);
                f8 = f;
                i3 = i;
                fVar2.b(rectF5, f8, rectF6, i3, f9, f7, z3, z4);
                return;
            case 5:
                f4 = 0.0f;
                z = false;
                z2 = false;
                fVar = this;
                rectF3 = rectF;
                f6 = f;
                rectF4 = rectF2;
                f5 = f3;
                fVar.a(rectF3, f6, rectF4, f5, f4, z, z2);
                return;
            case 6:
                b(rectF, f2, rectF2, f3, 0.0f, false, false);
                return;
            case 7:
                f7 = 0.0f;
                z3 = false;
                z4 = false;
                fVar2 = this;
                rectF5 = rectF;
                f8 = f;
                rectF6 = rectF2;
                i3 = i;
                f9 = f3;
                fVar2.b(rectF5, f8, rectF6, i3, f9, f7, z3, z4);
                return;
            case 8:
                a(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                return;
            default:
                return;
        }
    }

    private void b(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        float max;
        if (f < 0.0f) {
            f /= 1.05f;
            this.f.y -= f / 1.1f;
        }
        float f4 = rectF2.top;
        if (f < f4) {
            this.f.y -= (f - f4) / 2.0f;
        }
        float f5 = rectF2.top;
        if (f - f5 < f2) {
            f = f5;
        }
        float f6 = rectF.bottom;
        float f7 = f6 - f;
        float f8 = this.b;
        if (f7 < f8) {
            f = f6 - f8;
        }
        float f9 = rectF.bottom;
        float f10 = f9 - f;
        float f11 = this.d;
        if (f10 > f11) {
            f = f9 - f11;
        }
        float f12 = rectF2.top;
        if (f - f12 < f2) {
            f = f12;
        }
        if (f3 > 0.0f) {
            float f13 = rectF.bottom;
            float f14 = (f13 - f) * f3;
            float f15 = this.a;
            if (f14 < f15) {
                f = Math.max(rectF2.top, f13 - (f15 / f3));
                f14 = (rectF.bottom - f) * f3;
            }
            float f16 = this.c;
            if (f14 > f16) {
                f = Math.max(rectF2.top, rectF.bottom - (f16 / f3));
                f14 = (rectF.bottom - f) * f3;
            }
            if (z && z2) {
                max = Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3));
            } else {
                if (z) {
                    float f17 = rectF.right;
                    float f18 = f17 - f14;
                    float f19 = rectF2.left;
                    if (f18 < f19) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f17 - f19) / f3));
                        f14 = (rectF.bottom - f) * f3;
                    }
                }
                if (z2) {
                    float f20 = rectF.left;
                    float f21 = f14 + f20;
                    float f22 = rectF2.right;
                    if (f21 > f22) {
                        max = Math.max(rectF2.top, rectF.bottom - ((f22 - f20) / f3));
                    }
                }
            }
            f = Math.max(f, max);
        }
        rectF.top = f;
    }

    private void b(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float min;
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f.x -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.right;
        if (f > f5) {
            this.f.x -= (f - f5) / 2.0f;
        }
        float f6 = rectF2.right;
        if (f6 - f < f2) {
            f = f6;
        }
        float f7 = rectF.left;
        float f8 = f - f7;
        float f9 = this.a;
        if (f8 < f9) {
            f = f7 + f9;
        }
        float f10 = rectF.left;
        float f11 = f - f10;
        float f12 = this.c;
        if (f11 > f12) {
            f = f10 + f12;
        }
        float f13 = rectF2.right;
        if (f13 - f < f2) {
            f = f13;
        }
        if (f3 > 0.0f) {
            float f14 = rectF.left;
            float f15 = (f - f14) / f3;
            float f16 = this.b;
            if (f15 < f16) {
                f = Math.min(rectF2.right, f14 + (f16 * f3));
                f15 = (f - rectF.left) / f3;
            }
            float f17 = this.d;
            if (f15 > f17) {
                f = Math.min(rectF2.right, rectF.left + (f17 * f3));
                f15 = (f - rectF.left) / f3;
            }
            if (z && z2) {
                min = Math.min(rectF2.right, rectF.left + (rectF2.height() * f3));
            } else {
                if (z) {
                    float f18 = rectF.bottom;
                    float f19 = f18 - f15;
                    float f20 = rectF2.top;
                    if (f19 < f20) {
                        f = Math.min(rectF2.right, rectF.left + ((f18 - f20) * f3));
                        f15 = (f - rectF.left) / f3;
                    }
                }
                if (z2) {
                    float f21 = rectF.top;
                    float f22 = f15 + f21;
                    float f23 = rectF2.bottom;
                    if (f22 > f23) {
                        min = Math.min(rectF2.right, rectF.left + ((f23 - f21) * f3));
                    }
                }
            }
            f = Math.min(f, min);
        }
        rectF.right = f;
    }

    private void b(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2.0f);
        float f2 = rectF.top;
        float f3 = rectF2.top;
        if (f2 < f3) {
            rectF.offset(0.0f, f3 - f2);
        }
        float f4 = rectF.bottom;
        float f5 = rectF2.bottom;
        if (f4 > f5) {
            rectF.offset(0.0f, f5 - f4);
        }
    }

    private void c(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    private void c(RectF rectF, RectF rectF2, float f) {
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3 + f) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.top;
        float f5 = rectF2.top;
        if (f4 < f5 + f) {
            rectF.offset(0.0f, f5 - f4);
        }
        float f6 = rectF.right;
        float f7 = rectF2.right;
        if (f6 > f7 - f) {
            rectF.offset(f7 - f6, 0.0f);
        }
        float f8 = rectF.bottom;
        float f9 = rectF2.bottom;
        if (f8 > f9 - f) {
            rectF.offset(0.0f, f9 - f8);
        }
    }

    private void d(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    public void a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        PointF pointF = this.f;
        float f5 = f + pointF.x;
        float f6 = f2 + pointF.y;
        if (this.e == b.CENTER) {
            a(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            a(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            b(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }
}
