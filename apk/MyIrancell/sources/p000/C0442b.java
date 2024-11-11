package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.R$styleable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C0499c;
import p000.C2408e;

/* renamed from: b */
/* loaded from: classes.dex */
public class C0442b extends C2408e {

    /* renamed from: p */
    private c f2664p;

    /* renamed from: q */
    private g f2665q;

    /* renamed from: r */
    private int f2666r;

    /* renamed from: s */
    private int f2667s;

    /* renamed from: t */
    private boolean f2668t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a */
        private final Animatable f2669a;

        b(Animatable animatable) {
            super();
            this.f2669a = animatable;
        }

        @Override // p000.C0442b.g
        /* renamed from: c */
        public void mo3223c() {
            this.f2669a.start();
        }

        @Override // p000.C0442b.g
        /* renamed from: d */
        public void mo3224d() {
            this.f2669a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b$c */
    /* loaded from: classes.dex */
    public static class c extends C2408e.a {

        /* renamed from: K */
        C2452f0<Long> f2670K;

        /* renamed from: L */
        C2795j0<Integer> f2671L;

        c(c cVar, C0442b c0442b, Resources resources) {
            super(cVar, c0442b, resources);
            C2795j0<Integer> c2795j0;
            if (cVar != null) {
                this.f2670K = cVar.f2670K;
                c2795j0 = cVar.f2671L;
            } else {
                this.f2670K = new C2452f0<>();
                c2795j0 = new C2795j0<>();
            }
            this.f2671L = c2795j0;
        }

        /* renamed from: f */
        private static long m3225f(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: a */
        int m3226a(int i, int i2, Drawable drawable, boolean z) {
            int m3483a = super.m3483a(drawable);
            long m3225f = m3225f(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = m3483a;
            this.f2670K.m11648a(m3225f, Long.valueOf(j2 | j));
            if (z) {
                this.f2670K.m11648a(m3225f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m3483a;
        }

        /* renamed from: a */
        int m3227a(int[] iArr, Drawable drawable, int i) {
            int m11498a = super.m11498a(iArr, drawable);
            this.f2671L.m13284c(m11498a, Integer.valueOf(i));
            return m11498a;
        }

        /* renamed from: b */
        int m3228b(int[] iArr) {
            int m11497a = super.m11497a(iArr);
            return m11497a >= 0 ? m11497a : super.m11497a(StateSet.WILD_CARD);
        }

        /* renamed from: c */
        int m3229c(int i, int i2) {
            return (int) this.f2670K.m11651b(m3225f(i, i2), -1L).longValue();
        }

        /* renamed from: d */
        int m3230d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f2671L.m13282b(i, 0).intValue();
        }

        /* renamed from: d */
        boolean m3231d(int i, int i2) {
            return (this.f2670K.m11651b(m3225f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: e */
        boolean m3232e(int i, int i2) {
            return (this.f2670K.m11651b(m3225f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p000.C2408e.a, p000.C0499c.c
        /* renamed from: m */
        void mo3233m() {
            this.f2670K = this.f2670K.m16982clone();
            this.f2671L = this.f2671L.m16986clone();
        }

        @Override // p000.C2408e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0442b(this, null);
        }

        @Override // p000.C2408e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0442b(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b$d */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a */
        private final C2497g4 f2672a;

        d(C2497g4 c2497g4) {
            super();
            this.f2672a = c2497g4;
        }

        @Override // p000.C0442b.g
        /* renamed from: c */
        public void mo3223c() {
            this.f2672a.start();
        }

        @Override // p000.C0442b.g
        /* renamed from: d */
        public void mo3224d() {
            this.f2672a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b$e */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f2673a;

        /* renamed from: b */
        private final boolean f2674b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.m3236a());
            ofInt.setInterpolator(fVar);
            this.f2674b = z2;
            this.f2673a = ofInt;
        }

        @Override // p000.C0442b.g
        /* renamed from: a */
        public boolean mo3234a() {
            return this.f2674b;
        }

        @Override // p000.C0442b.g
        /* renamed from: b */
        public void mo3235b() {
            this.f2673a.reverse();
        }

        @Override // p000.C0442b.g
        /* renamed from: c */
        public void mo3223c() {
            this.f2673a.start();
        }

        @Override // p000.C0442b.g
        /* renamed from: d */
        public void mo3224d() {
            this.f2673a.cancel();
        }
    }

    /* renamed from: b$f */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f2675a;

        /* renamed from: b */
        private int f2676b;

        /* renamed from: c */
        private int f2677c;

        f(AnimationDrawable animationDrawable, boolean z) {
            m3237a(animationDrawable, z);
        }

        /* renamed from: a */
        int m3236a() {
            return this.f2677c;
        }

        /* renamed from: a */
        int m3237a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2676b = numberOfFrames;
            int[] iArr = this.f2675a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2675a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2675a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2677c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f2677c) + 0.5f);
            int i2 = this.f2676b;
            int[] iArr = this.f2675a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f2677c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        /* renamed from: a */
        public boolean mo3234a() {
            return false;
        }

        /* renamed from: b */
        public void mo3235b() {
        }

        /* renamed from: c */
        public abstract void mo3223c();

        /* renamed from: d */
        public abstract void mo3224d();
    }

    public C0442b() {
        this(null, null);
    }

    C0442b(c cVar, Resources resources) {
        super(null);
        this.f2666r = -1;
        this.f2667s = -1;
        mo3222a(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    private void m3213a(TypedArray typedArray) {
        c cVar = this.f2664p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f2867d |= typedArray.getChangingConfigurations();
        }
        cVar.m3492b(typedArray.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f2872i));
        cVar.m3488a(typedArray.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_constantSize, cVar.f2875l));
        cVar.m3491b(typedArray.getInt(R$styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f2855A));
        cVar.m3495c(typedArray.getInt(R$styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f2856B));
        setDither(typedArray.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_dither, cVar.f2887x));
    }

    /* renamed from: b */
    public static C0442b m3214b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0442b c0442b = new C0442b();
            c0442b.m3221a(context, resources, xmlPullParser, attributeSet, theme);
            return c0442b;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: b */
    private boolean m3215b(int i) {
        int m3478b;
        int m3229c;
        g bVar;
        g gVar = this.f2665q;
        if (gVar == null) {
            m3478b = m3478b();
        } else {
            if (i == this.f2666r) {
                return true;
            }
            if (i == this.f2667s && gVar.mo3234a()) {
                gVar.mo3235b();
                this.f2666r = this.f2667s;
                this.f2667s = i;
                return true;
            }
            m3478b = this.f2666r;
            gVar.mo3224d();
        }
        this.f2665q = null;
        this.f2667s = -1;
        this.f2666r = -1;
        c cVar = this.f2664p;
        int m3230d = cVar.m3230d(m3478b);
        int m3230d2 = cVar.m3230d(i);
        if (m3230d2 == 0 || m3230d == 0 || (m3229c = cVar.m3229c(m3230d, m3230d2)) < 0) {
            return false;
        }
        boolean m3232e = cVar.m3232e(m3230d, m3230d2);
        m3477a(m3229c);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m3231d(m3230d, m3230d2), m3232e);
        } else {
            if (!(current instanceof C2497g4)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C2497g4) current);
        }
        bVar.mo3223c();
        this.f2665q = bVar;
        this.f2667s = m3478b;
        this.f2666r = i;
        return true;
    }

    /* renamed from: c */
    private void m3216c() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m3217c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m3218d(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m3219e(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r5 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r5 = p000.C2921m4.createFromXmlInner(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        return r4.f2664p.m3227a(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r5 != 4) goto L28;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m3218d(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            int[] r0 = androidx.appcompat.R$styleable.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = p000.C3105q0.m14861a(r6, r9, r8, r0)
            int r1 = androidx.appcompat.R$styleable.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = androidx.appcompat.R$styleable.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1b
            android.graphics.drawable.Drawable r5 = p000.C0000a.m4c(r5, r2)
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r0.recycle()
            int[] r0 = r4.m11496a(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L6c
        L27:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L2f
            goto L27
        L2f:
            r3 = 2
            if (r5 != r3) goto L53
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L43
            m4 r5 = p000.C2921m4.createFromXmlInner(r6, r7, r8, r9)
            goto L6c
        L43:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L4e
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L6c
        L4e:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L6c
        L53:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L6c:
            if (r5 == 0) goto L75
            b$c r6 = r4.f2664p
            int r5 = r6.m3227a(r0, r5, r1)
            return r5
        L75:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            goto L8f
        L8e:
            throw r5
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0442b.m3218d(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r4 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r4 = p000.C2497g4.m11882a(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r3 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        return r7.f2664p.m3226a(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r4 != 4) goto L32;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m3219e(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = androidx.appcompat.R$styleable.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = p000.C3105q0.m14861a(r9, r12, r11, r0)
            int r1 = androidx.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = androidx.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = androidx.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L20
            android.graphics.drawable.Drawable r4 = p000.C0000a.m4c(r8, r4)
            goto L21
        L20:
            r4 = 0
        L21:
            int r5 = androidx.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L74
        L2f:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L37
            goto L2f
        L37:
            r6 = 2
            if (r4 != r6) goto L5b
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4b
            g4 r4 = p000.C2497g4.m11882a(r8, r9, r10, r11, r12)
            goto L74
        L4b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L56
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L74
        L56:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L74
        L5b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L74:
            if (r4 == 0) goto L9c
            if (r1 == r2) goto L81
            if (r3 == r2) goto L81
            b$c r8 = r7.f2664p
            int r8 = r8.m3226a(r1, r3, r4, r5)
            return r8
        L81:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L9c:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            goto Lb6
        Lb5:
            throw r8
        Lb6:
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0442b.m3219e(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.C2408e, p000.C0499c
    /* renamed from: a */
    public c mo3220a() {
        return new c(this.f2664p, this, null);
    }

    /* renamed from: a */
    public void m3221a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, R$styleable.AnimatedStateListDrawableCompat);
        setVisible(m14861a.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        m3213a(m14861a);
        m3475a(resources);
        m14861a.recycle();
        m3217c(context, resources, xmlPullParser, attributeSet, theme);
        m3216c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C2408e, p000.C0499c
    /* renamed from: a */
    public void mo3222a(C0499c.c cVar) {
        super.mo3222a(cVar);
        if (cVar instanceof c) {
            this.f2664p = (c) cVar;
        }
    }

    @Override // p000.C2408e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000.C0499c, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f2665q;
        if (gVar != null) {
            gVar.mo3224d();
            this.f2665q = null;
            m3477a(this.f2666r);
            this.f2666r = -1;
            this.f2667s = -1;
        }
    }

    @Override // p000.C2408e, p000.C0499c, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2668t) {
            super.mutate();
            if (this == this) {
                this.f2664p.mo3233m();
                this.f2668t = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C2408e, p000.C0499c, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m3228b = this.f2664p.m3228b(iArr);
        boolean z = m3228b != m3478b() && (m3215b(m3228b) || m3477a(m3228b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p000.C0499c, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f2665q != null && (visible || z2)) {
            if (z) {
                this.f2665q.mo3223c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
