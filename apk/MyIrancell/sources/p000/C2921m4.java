package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.graphics.drawable.C0239a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C3186s0;

/* renamed from: m4 */
/* loaded from: classes.dex */
public class C2921m4 extends AbstractC2884l4 {

    /* renamed from: k */
    static final PorterDuff.Mode f12007k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private h f12008c;

    /* renamed from: d */
    private PorterDuffColorFilter f12009d;

    /* renamed from: e */
    private ColorFilter f12010e;

    /* renamed from: f */
    private boolean f12011f;

    /* renamed from: g */
    private boolean f12012g;

    /* renamed from: h */
    private final float[] f12013h;

    /* renamed from: i */
    private final Matrix f12014i;

    /* renamed from: j */
    private final Rect f12015j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$b */
    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m14016a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12043b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f12042a = C3186s0.m15308a(string2);
            }
        }

        /* renamed from: a */
        public void m14017a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C3105q0.m14865a(xmlPullParser, "pathData")) {
                TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9915d);
                m14016a(m14861a);
                m14861a.recycle();
            }
        }

        @Override // p000.C2921m4.f
        /* renamed from: b */
        public boolean mo14018b() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: d */
        private int[] f12016d;

        /* renamed from: e */
        C2880l0 f12017e;

        /* renamed from: f */
        float f12018f;

        /* renamed from: g */
        C2880l0 f12019g;

        /* renamed from: h */
        float f12020h;

        /* renamed from: i */
        int f12021i;

        /* renamed from: j */
        float f12022j;

        /* renamed from: k */
        float f12023k;

        /* renamed from: l */
        float f12024l;

        /* renamed from: m */
        float f12025m;

        /* renamed from: n */
        Paint.Cap f12026n;

        /* renamed from: o */
        Paint.Join f12027o;

        /* renamed from: p */
        float f12028p;

        public c() {
            this.f12018f = 0.0f;
            this.f12020h = 1.0f;
            this.f12021i = 0;
            this.f12022j = 1.0f;
            this.f12023k = 0.0f;
            this.f12024l = 1.0f;
            this.f12025m = 0.0f;
            this.f12026n = Paint.Cap.BUTT;
            this.f12027o = Paint.Join.MITER;
            this.f12028p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f12018f = 0.0f;
            this.f12020h = 1.0f;
            this.f12021i = 0;
            this.f12022j = 1.0f;
            this.f12023k = 0.0f;
            this.f12024l = 1.0f;
            this.f12025m = 0.0f;
            this.f12026n = Paint.Cap.BUTT;
            this.f12027o = Paint.Join.MITER;
            this.f12028p = 4.0f;
            this.f12016d = cVar.f12016d;
            this.f12017e = cVar.f12017e;
            this.f12018f = cVar.f12018f;
            this.f12020h = cVar.f12020h;
            this.f12019g = cVar.f12019g;
            this.f12021i = cVar.f12021i;
            this.f12022j = cVar.f12022j;
            this.f12023k = cVar.f12023k;
            this.f12024l = cVar.f12024l;
            this.f12025m = cVar.f12025m;
            this.f12026n = cVar.f12026n;
            this.f12027o = cVar.f12027o;
            this.f12028p = cVar.f12028p;
        }

        /* renamed from: a */
        private Paint.Cap m14019a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: a */
        private Paint.Join m14020a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: a */
        private void m14021a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f12016d = null;
            if (C3105q0.m14865a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f12043b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f12042a = C3186s0.m15308a(string2);
                }
                this.f12019g = C3105q0.m14863a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f12022j = C3105q0.m14859a(typedArray, xmlPullParser, "fillAlpha", 12, this.f12022j);
                this.f12026n = m14019a(C3105q0.m14866b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f12026n);
                this.f12027o = m14020a(C3105q0.m14866b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f12027o);
                this.f12028p = C3105q0.m14859a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f12028p);
                this.f12017e = C3105q0.m14863a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f12020h = C3105q0.m14859a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f12020h);
                this.f12018f = C3105q0.m14859a(typedArray, xmlPullParser, "strokeWidth", 4, this.f12018f);
                this.f12024l = C3105q0.m14859a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f12024l);
                this.f12025m = C3105q0.m14859a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f12025m);
                this.f12023k = C3105q0.m14859a(typedArray, xmlPullParser, "trimPathStart", 5, this.f12023k);
                this.f12021i = C3105q0.m14866b(typedArray, xmlPullParser, "fillType", 13, this.f12021i);
            }
        }

        /* renamed from: a */
        public void m14022a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9914c);
            m14021a(m14861a, xmlPullParser, theme);
            m14861a.recycle();
        }

        @Override // p000.C2921m4.e
        /* renamed from: a */
        public boolean mo14023a() {
            return this.f12019g.m13776d() || this.f12017e.m13776d();
        }

        @Override // p000.C2921m4.e
        /* renamed from: a */
        public boolean mo14024a(int[] iArr) {
            return this.f12017e.m13773a(iArr) | this.f12019g.m13773a(iArr);
        }

        float getFillAlpha() {
            return this.f12022j;
        }

        int getFillColor() {
            return this.f12019g.m13771a();
        }

        float getStrokeAlpha() {
            return this.f12020h;
        }

        int getStrokeColor() {
            return this.f12017e.m13771a();
        }

        float getStrokeWidth() {
            return this.f12018f;
        }

        float getTrimPathEnd() {
            return this.f12024l;
        }

        float getTrimPathOffset() {
            return this.f12025m;
        }

        float getTrimPathStart() {
            return this.f12023k;
        }

        void setFillAlpha(float f) {
            this.f12022j = f;
        }

        void setFillColor(int i) {
            this.f12019g.m13772a(i);
        }

        void setStrokeAlpha(float f) {
            this.f12020h = f;
        }

        void setStrokeColor(int i) {
            this.f12017e.m13772a(i);
        }

        void setStrokeWidth(float f) {
            this.f12018f = f;
        }

        void setTrimPathEnd(float f) {
            this.f12024l = f;
        }

        void setTrimPathOffset(float f) {
            this.f12025m = f;
        }

        void setTrimPathStart(float f) {
            this.f12023k = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f12029a;

        /* renamed from: b */
        final ArrayList<e> f12030b;

        /* renamed from: c */
        float f12031c;

        /* renamed from: d */
        private float f12032d;

        /* renamed from: e */
        private float f12033e;

        /* renamed from: f */
        private float f12034f;

        /* renamed from: g */
        private float f12035g;

        /* renamed from: h */
        private float f12036h;

        /* renamed from: i */
        private float f12037i;

        /* renamed from: j */
        final Matrix f12038j;

        /* renamed from: k */
        int f12039k;

        /* renamed from: l */
        private int[] f12040l;

        /* renamed from: m */
        private String f12041m;

        public d() {
            super();
            this.f12029a = new Matrix();
            this.f12030b = new ArrayList<>();
            this.f12031c = 0.0f;
            this.f12032d = 0.0f;
            this.f12033e = 0.0f;
            this.f12034f = 1.0f;
            this.f12035g = 1.0f;
            this.f12036h = 0.0f;
            this.f12037i = 0.0f;
            this.f12038j = new Matrix();
            this.f12041m = null;
        }

        public d(d dVar, C0500c0<String, Object> c0500c0) {
            super();
            f bVar;
            this.f12029a = new Matrix();
            this.f12030b = new ArrayList<>();
            this.f12031c = 0.0f;
            this.f12032d = 0.0f;
            this.f12033e = 0.0f;
            this.f12034f = 1.0f;
            this.f12035g = 1.0f;
            this.f12036h = 0.0f;
            this.f12037i = 0.0f;
            this.f12038j = new Matrix();
            this.f12041m = null;
            this.f12031c = dVar.f12031c;
            this.f12032d = dVar.f12032d;
            this.f12033e = dVar.f12033e;
            this.f12034f = dVar.f12034f;
            this.f12035g = dVar.f12035g;
            this.f12036h = dVar.f12036h;
            this.f12037i = dVar.f12037i;
            this.f12040l = dVar.f12040l;
            String str = dVar.f12041m;
            this.f12041m = str;
            this.f12039k = dVar.f12039k;
            if (str != null) {
                c0500c0.put(str, this);
            }
            this.f12038j.set(dVar.f12038j);
            ArrayList<e> arrayList = dVar.f12030b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f12030b.add(new d((d) eVar, c0500c0));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f12030b.add(bVar);
                    String str2 = bVar.f12043b;
                    if (str2 != null) {
                        c0500c0.put(str2, bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m14025a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12040l = null;
            this.f12031c = C3105q0.m14859a(typedArray, xmlPullParser, "rotation", 5, this.f12031c);
            this.f12032d = typedArray.getFloat(1, this.f12032d);
            this.f12033e = typedArray.getFloat(2, this.f12033e);
            this.f12034f = C3105q0.m14859a(typedArray, xmlPullParser, "scaleX", 3, this.f12034f);
            this.f12035g = C3105q0.m14859a(typedArray, xmlPullParser, "scaleY", 4, this.f12035g);
            this.f12036h = C3105q0.m14859a(typedArray, xmlPullParser, "translateX", 6, this.f12036h);
            this.f12037i = C3105q0.m14859a(typedArray, xmlPullParser, "translateY", 7, this.f12037i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12041m = string;
            }
            m14026b();
        }

        /* renamed from: b */
        private void m14026b() {
            this.f12038j.reset();
            this.f12038j.postTranslate(-this.f12032d, -this.f12033e);
            this.f12038j.postScale(this.f12034f, this.f12035g);
            this.f12038j.postRotate(this.f12031c, 0.0f, 0.0f);
            this.f12038j.postTranslate(this.f12036h + this.f12032d, this.f12037i + this.f12033e);
        }

        /* renamed from: a */
        public void m14027a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9913b);
            m14025a(m14861a, xmlPullParser);
            m14861a.recycle();
        }

        @Override // p000.C2921m4.e
        /* renamed from: a */
        public boolean mo14023a() {
            for (int i = 0; i < this.f12030b.size(); i++) {
                if (this.f12030b.get(i).mo14023a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.C2921m4.e
        /* renamed from: a */
        public boolean mo14024a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f12030b.size(); i++) {
                z |= this.f12030b.get(i).mo14024a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f12041m;
        }

        public Matrix getLocalMatrix() {
            return this.f12038j;
        }

        public float getPivotX() {
            return this.f12032d;
        }

        public float getPivotY() {
            return this.f12033e;
        }

        public float getRotation() {
            return this.f12031c;
        }

        public float getScaleX() {
            return this.f12034f;
        }

        public float getScaleY() {
            return this.f12035g;
        }

        public float getTranslateX() {
            return this.f12036h;
        }

        public float getTranslateY() {
            return this.f12037i;
        }

        public void setPivotX(float f) {
            if (f != this.f12032d) {
                this.f12032d = f;
                m14026b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f12033e) {
                this.f12033e = f;
                m14026b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f12031c) {
                this.f12031c = f;
                m14026b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f12034f) {
                this.f12034f = f;
                m14026b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f12035g) {
                this.f12035g = f;
                m14026b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f12036h) {
                this.f12036h = f;
                m14026b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f12037i) {
                this.f12037i = f;
                m14026b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        /* renamed from: a */
        public boolean mo14023a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo14024a(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$f */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        protected C3186s0.b[] f12042a;

        /* renamed from: b */
        String f12043b;

        /* renamed from: c */
        int f12044c;

        public f() {
            super();
            this.f12042a = null;
        }

        public f(f fVar) {
            super();
            this.f12042a = null;
            this.f12043b = fVar.f12043b;
            this.f12044c = fVar.f12044c;
            this.f12042a = C3186s0.m15309a(fVar.f12042a);
        }

        /* renamed from: a */
        public void m14028a(Path path) {
            path.reset();
            C3186s0.b[] bVarArr = this.f12042a;
            if (bVarArr != null) {
                C3186s0.b.m15316a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo14018b() {
            return false;
        }

        public C3186s0.b[] getPathData() {
            return this.f12042a;
        }

        public String getPathName() {
            return this.f12043b;
        }

        public void setPathData(C3186s0.b[] bVarArr) {
            if (C3186s0.m15306a(this.f12042a, bVarArr)) {
                C3186s0.m15311b(this.f12042a, bVarArr);
            } else {
                this.f12042a = C3186s0.m15309a(bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q */
        private static final Matrix f12045q = new Matrix();

        /* renamed from: a */
        private final Path f12046a;

        /* renamed from: b */
        private final Path f12047b;

        /* renamed from: c */
        private final Matrix f12048c;

        /* renamed from: d */
        Paint f12049d;

        /* renamed from: e */
        Paint f12050e;

        /* renamed from: f */
        private PathMeasure f12051f;

        /* renamed from: g */
        private int f12052g;

        /* renamed from: h */
        final d f12053h;

        /* renamed from: i */
        float f12054i;

        /* renamed from: j */
        float f12055j;

        /* renamed from: k */
        float f12056k;

        /* renamed from: l */
        float f12057l;

        /* renamed from: m */
        int f12058m;

        /* renamed from: n */
        String f12059n;

        /* renamed from: o */
        Boolean f12060o;

        /* renamed from: p */
        final C0500c0<String, Object> f12061p;

        public g() {
            this.f12048c = new Matrix();
            this.f12054i = 0.0f;
            this.f12055j = 0.0f;
            this.f12056k = 0.0f;
            this.f12057l = 0.0f;
            this.f12058m = 255;
            this.f12059n = null;
            this.f12060o = null;
            this.f12061p = new C0500c0<>();
            this.f12053h = new d();
            this.f12046a = new Path();
            this.f12047b = new Path();
        }

        public g(g gVar) {
            this.f12048c = new Matrix();
            this.f12054i = 0.0f;
            this.f12055j = 0.0f;
            this.f12056k = 0.0f;
            this.f12057l = 0.0f;
            this.f12058m = 255;
            this.f12059n = null;
            this.f12060o = null;
            C0500c0<String, Object> c0500c0 = new C0500c0<>();
            this.f12061p = c0500c0;
            this.f12053h = new d(gVar.f12053h, c0500c0);
            this.f12046a = new Path(gVar.f12046a);
            this.f12047b = new Path(gVar.f12047b);
            this.f12054i = gVar.f12054i;
            this.f12055j = gVar.f12055j;
            this.f12056k = gVar.f12056k;
            this.f12057l = gVar.f12057l;
            this.f12052g = gVar.f12052g;
            this.f12058m = gVar.f12058m;
            this.f12059n = gVar.f12059n;
            String str = gVar.f12059n;
            if (str != null) {
                this.f12061p.put(str, this);
            }
            this.f12060o = gVar.f12060o;
        }

        /* renamed from: a */
        private static float m14029a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m14030a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m14029a = m14029a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(m14029a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m14031a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f12029a.set(matrix);
            dVar.f12029a.preConcat(dVar.f12038j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f12030b.size(); i3++) {
                e eVar = dVar.f12030b.get(i3);
                if (eVar instanceof d) {
                    m14031a((d) eVar, dVar.f12029a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    m14032a(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m14032a(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f12056k;
            float f2 = i2 / this.f12057l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f12029a;
            this.f12048c.set(matrix);
            this.f12048c.postScale(f, f2);
            float m14030a = m14030a(matrix);
            if (m14030a == 0.0f) {
                return;
            }
            fVar.m14028a(this.f12046a);
            Path path = this.f12046a;
            this.f12047b.reset();
            if (fVar.mo14018b()) {
                this.f12047b.addPath(path, this.f12048c);
                canvas.clipPath(this.f12047b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.f12023k != 0.0f || cVar.f12024l != 1.0f) {
                float f3 = cVar.f12023k;
                float f4 = cVar.f12025m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.f12024l + f4) % 1.0f;
                if (this.f12051f == null) {
                    this.f12051f = new PathMeasure();
                }
                this.f12051f.setPath(this.f12046a, false);
                float length = this.f12051f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f12051f.getSegment(f7, length, path, true);
                    this.f12051f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f12051f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f12047b.addPath(path, this.f12048c);
            if (cVar.f12019g.m13777e()) {
                C2880l0 c2880l0 = cVar.f12019g;
                if (this.f12050e == null) {
                    Paint paint = new Paint(1);
                    this.f12050e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f12050e;
                if (c2880l0.m13775c()) {
                    Shader m13774b = c2880l0.m13774b();
                    m13774b.setLocalMatrix(this.f12048c);
                    paint2.setShader(m13774b);
                    paint2.setAlpha(Math.round(cVar.f12022j * 255.0f));
                } else {
                    paint2.setColor(C2921m4.m14007a(c2880l0.m13771a(), cVar.f12022j));
                }
                paint2.setColorFilter(colorFilter);
                this.f12047b.setFillType(cVar.f12021i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f12047b, paint2);
            }
            if (cVar.f12017e.m13777e()) {
                C2880l0 c2880l02 = cVar.f12017e;
                if (this.f12049d == null) {
                    Paint paint3 = new Paint(1);
                    this.f12049d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f12049d;
                Paint.Join join = cVar.f12027o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f12026n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f12028p);
                if (c2880l02.m13775c()) {
                    Shader m13774b2 = c2880l02.m13774b();
                    m13774b2.setLocalMatrix(this.f12048c);
                    paint4.setShader(m13774b2);
                    paint4.setAlpha(Math.round(cVar.f12020h * 255.0f));
                } else {
                    paint4.setColor(C2921m4.m14007a(c2880l02.m13771a(), cVar.f12020h));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f12018f * min * m14030a);
                canvas.drawPath(this.f12047b, paint4);
            }
        }

        /* renamed from: a */
        public void m14033a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m14031a(this.f12053h, f12045q, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean m14034a() {
            if (this.f12060o == null) {
                this.f12060o = Boolean.valueOf(this.f12053h.mo14023a());
            }
            return this.f12060o.booleanValue();
        }

        /* renamed from: a */
        public boolean m14035a(int[] iArr) {
            return this.f12053h.mo14024a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f12058m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f12058m = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4$h */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f12062a;

        /* renamed from: b */
        g f12063b;

        /* renamed from: c */
        ColorStateList f12064c;

        /* renamed from: d */
        PorterDuff.Mode f12065d;

        /* renamed from: e */
        boolean f12066e;

        /* renamed from: f */
        Bitmap f12067f;

        /* renamed from: g */
        ColorStateList f12068g;

        /* renamed from: h */
        PorterDuff.Mode f12069h;

        /* renamed from: i */
        int f12070i;

        /* renamed from: j */
        boolean f12071j;

        /* renamed from: k */
        boolean f12072k;

        /* renamed from: l */
        Paint f12073l;

        public h() {
            this.f12064c = null;
            this.f12065d = C2921m4.f12007k;
            this.f12063b = new g();
        }

        public h(h hVar) {
            this.f12064c = null;
            this.f12065d = C2921m4.f12007k;
            if (hVar != null) {
                this.f12062a = hVar.f12062a;
                g gVar = new g(hVar.f12063b);
                this.f12063b = gVar;
                if (hVar.f12063b.f12050e != null) {
                    gVar.f12050e = new Paint(hVar.f12063b.f12050e);
                }
                if (hVar.f12063b.f12049d != null) {
                    this.f12063b.f12049d = new Paint(hVar.f12063b.f12049d);
                }
                this.f12064c = hVar.f12064c;
                this.f12065d = hVar.f12065d;
                this.f12066e = hVar.f12066e;
            }
        }

        /* renamed from: a */
        public Paint m14036a(ColorFilter colorFilter) {
            if (!m14042b() && colorFilter == null) {
                return null;
            }
            if (this.f12073l == null) {
                Paint paint = new Paint();
                this.f12073l = paint;
                paint.setFilterBitmap(true);
            }
            this.f12073l.setAlpha(this.f12063b.getRootAlpha());
            this.f12073l.setColorFilter(colorFilter);
            return this.f12073l;
        }

        /* renamed from: a */
        public void m14037a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f12067f, (Rect) null, rect, m14036a(colorFilter));
        }

        /* renamed from: a */
        public boolean m14038a() {
            return !this.f12072k && this.f12068g == this.f12064c && this.f12069h == this.f12065d && this.f12071j == this.f12066e && this.f12070i == this.f12063b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean m14039a(int i, int i2) {
            return i == this.f12067f.getWidth() && i2 == this.f12067f.getHeight();
        }

        /* renamed from: a */
        public boolean m14040a(int[] iArr) {
            boolean m14035a = this.f12063b.m14035a(iArr);
            this.f12072k |= m14035a;
            return m14035a;
        }

        /* renamed from: b */
        public void m14041b(int i, int i2) {
            if (this.f12067f == null || !m14039a(i, i2)) {
                this.f12067f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f12072k = true;
            }
        }

        /* renamed from: b */
        public boolean m14042b() {
            return this.f12063b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void m14043c(int i, int i2) {
            this.f12067f.eraseColor(0);
            this.f12063b.m14033a(new Canvas(this.f12067f), i, i2, (ColorFilter) null);
        }

        /* renamed from: c */
        public boolean m14044c() {
            return this.f12063b.m14034a();
        }

        /* renamed from: d */
        public void m14045d() {
            this.f12068g = this.f12064c;
            this.f12069h = this.f12065d;
            this.f12070i = this.f12063b.getRootAlpha();
            this.f12071j = this.f12066e;
            this.f12072k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f12062a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2921m4(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2921m4(this);
        }
    }

    /* renamed from: m4$i */
    /* loaded from: classes.dex */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f12074a;

        public i(Drawable.ConstantState constantState) {
            this.f12074a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f12074a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f12074a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2921m4 c2921m4 = new C2921m4();
            c2921m4.f11804b = (VectorDrawable) this.f12074a.newDrawable();
            return c2921m4;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2921m4 c2921m4 = new C2921m4();
            c2921m4.f11804b = (VectorDrawable) this.f12074a.newDrawable(resources);
            return c2921m4;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2921m4 c2921m4 = new C2921m4();
            c2921m4.f11804b = (VectorDrawable) this.f12074a.newDrawable(resources, theme);
            return c2921m4;
        }
    }

    C2921m4() {
        this.f12012g = true;
        this.f12013h = new float[9];
        this.f12014i = new Matrix();
        this.f12015j = new Rect();
        this.f12008c = new h();
    }

    C2921m4(h hVar) {
        this.f12012g = true;
        this.f12013h = new float[9];
        this.f12014i = new Matrix();
        this.f12015j = new Rect();
        this.f12008c = hVar;
        this.f12009d = m14013a(this.f12009d, hVar.f12064c, hVar.f12065d);
    }

    /* renamed from: a */
    static int m14007a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m14008a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static C2921m4 m14009a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C2921m4 c2921m4 = new C2921m4();
            c2921m4.f11804b = C3066p0.m14677a(resources, i2, theme);
            new i(c2921m4.f11804b.getConstantState());
            return c2921m4;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m14010a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        h hVar = this.f12008c;
        g gVar = hVar.f12063b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f12053h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m14022a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12030b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f12061p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.m14017a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12030b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f12061p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m14027a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12030b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f12061p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = hVar.f12062a;
                    i3 = dVar2.f12039k;
                    hVar.f12062a = i3 | i2;
                }
                i2 = hVar.f12062a;
                i3 = bVar.f12044c;
                hVar.f12062a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    private void m14011a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        h hVar = this.f12008c;
        g gVar = hVar.f12063b;
        hVar.f12065d = m14008a(C3105q0.m14866b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            hVar.f12064c = colorStateList;
        }
        hVar.f12066e = C3105q0.m14864a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f12066e);
        gVar.f12056k = C3105q0.m14859a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f12056k);
        float m14859a = C3105q0.m14859a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f12057l);
        gVar.f12057l = m14859a;
        if (gVar.f12056k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (m14859a <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f12054i = typedArray.getDimension(3, gVar.f12054i);
        float dimension = typedArray.getDimension(2, gVar.f12055j);
        gVar.f12055j = dimension;
        if (gVar.f12054i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C3105q0.m14859a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f12059n = string;
            gVar.f12061p.put(string, gVar);
        }
    }

    /* renamed from: a */
    private boolean m14012a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0239a.m1491e(this) == 1;
    }

    public static C2921m4 createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2921m4 c2921m4 = new C2921m4();
        c2921m4.inflate(resources, xmlPullParser, attributeSet, theme);
        return c2921m4;
    }

    /* renamed from: a */
    PorterDuffColorFilter m14013a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Object m14014a(String str) {
        return this.f12008c.f12063b.f12061p.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14015a(boolean z) {
        this.f12012g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11804b;
        if (drawable == null) {
            return false;
        }
        C0239a.m1485a(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f12015j);
        if (this.f12015j.width() <= 0 || this.f12015j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f12010e;
        if (colorFilter == null) {
            colorFilter = this.f12009d;
        }
        canvas.getMatrix(this.f12014i);
        this.f12014i.getValues(this.f12013h);
        float abs = Math.abs(this.f12013h[0]);
        float abs2 = Math.abs(this.f12013h[4]);
        float abs3 = Math.abs(this.f12013h[1]);
        float abs4 = Math.abs(this.f12013h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f12015j.width() * abs));
        int min2 = Math.min(2048, (int) (this.f12015j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f12015j;
        canvas.translate(rect.left, rect.top);
        if (m14012a()) {
            canvas.translate(this.f12015j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f12015j.offsetTo(0, 0);
        this.f12008c.m14041b(min, min2);
        if (!this.f12012g) {
            this.f12008c.m14043c(min, min2);
        } else if (!this.f12008c.m14038a()) {
            this.f12008c.m14043c(min, min2);
            this.f12008c.m14045d();
        }
        this.f12008c.m14037a(canvas, colorFilter, this.f12015j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11804b;
        return drawable != null ? C0239a.m1489c(drawable) : this.f12008c.f12063b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f12008c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11804b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f11804b.getConstantState());
        }
        this.f12008c.f12062a = getChangingConfigurations();
        return this.f12008c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f12008c.f12063b.f12055j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f12008c.f12063b.f12054i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1482a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f12008c;
        hVar.f12063b = new g();
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, C2416e4.f9912a);
        m14011a(m14861a, xmlPullParser);
        m14861a.recycle();
        hVar.f12062a = getChangingConfigurations();
        hVar.f12072k = true;
        m14010a(resources, xmlPullParser, attributeSet, theme);
        this.f12009d = m14013a(this.f12009d, hVar.f12064c, hVar.f12065d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11804b;
        return drawable != null ? C0239a.m1492f(drawable) : this.f12008c.f12066e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f12008c) != null && (hVar.m14044c() || ((colorStateList = this.f12008c.f12064c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f12011f && super.mutate() == this) {
            this.f12008c = new h(this.f12008c);
            this.f12011f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f12008c;
        ColorStateList colorStateList = hVar.f12064c;
        if (colorStateList != null && (mode = hVar.f12065d) != null) {
            this.f12009d = m14013a(this.f12009d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.m14044c() || !hVar.m14040a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f12008c.f12063b.getRootAlpha() != i2) {
            this.f12008c.f12063b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1484a(drawable, z);
        } else {
            this.f12008c.f12066e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12010e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTint(int i2) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1488b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1480a(drawable, colorStateList);
            return;
        }
        h hVar = this.f12008c;
        if (hVar.f12064c != colorStateList) {
            hVar.f12064c = colorStateList;
            this.f12009d = m14013a(this.f12009d, colorStateList, hVar.f12065d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            C0239a.m1483a(drawable, mode);
            return;
        }
        h hVar = this.f12008c;
        if (hVar.f12065d != mode) {
            hVar.f12065d = mode;
            this.f12009d = m14013a(this.f12009d, hVar.f12064c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11804b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11804b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
