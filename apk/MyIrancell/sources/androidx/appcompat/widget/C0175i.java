package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$drawable;
import androidx.core.content.C0237b;
import androidx.core.graphics.drawable.C0239a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C0442b;
import p000.C0500c0;
import p000.C2452f0;
import p000.C2493g0;
import p000.C2497g4;
import p000.C2795j0;
import p000.C2921m4;
import p000.C3147r0;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
public final class C0175i {

    /* renamed from: h */
    private static C0175i f1072h;

    /* renamed from: a */
    private WeakHashMap<Context, C2795j0<ColorStateList>> f1080a;

    /* renamed from: b */
    private C0500c0<String, d> f1081b;

    /* renamed from: c */
    private C2795j0<String> f1082c;

    /* renamed from: d */
    private final WeakHashMap<Context, C2452f0<WeakReference<Drawable.ConstantState>>> f1083d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1084e;

    /* renamed from: f */
    private boolean f1085f;

    /* renamed from: g */
    private static final PorterDuff.Mode f1071g = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static final c f1073i = new c(6);

    /* renamed from: j */
    private static final int[] f1074j = {R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: k */
    private static final int[] f1075k = {R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: l */
    private static final int[] f1076l = {R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl_dark, R$drawable.abc_text_select_handle_middle_mtrl_dark, R$drawable.abc_text_select_handle_right_mtrl_dark, R$drawable.abc_text_select_handle_left_mtrl_light, R$drawable.abc_text_select_handle_middle_mtrl_light, R$drawable.abc_text_select_handle_right_mtrl_light};

    /* renamed from: m */
    private static final int[] f1077m = {R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: n */
    private static final int[] f1078n = {R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};

    /* renamed from: o */
    private static final int[] f1079o = {R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.i$a */
    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.C0175i.d
        /* renamed from: a */
        public Drawable mo1044a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0442b.m3214b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i$b */
    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.C0175i.d
        /* renamed from: a */
        public Drawable mo1044a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2497g4.m11882a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i$c */
    /* loaded from: classes.dex */
    public static class c extends C2493g0<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m1045b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: a */
        PorterDuffColorFilter m1046a(int i, PorterDuff.Mode mode) {
            return m11861b(Integer.valueOf(m1045b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m1047a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m11858a((c) Integer.valueOf(m1045b(i, mode)), (Integer) porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        Drawable mo1044a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i$e */
    /* loaded from: classes.dex */
    public static class e implements d {
        e() {
        }

        @Override // androidx.appcompat.widget.C0175i.d
        /* renamed from: a */
        public Drawable mo1044a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2921m4.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m1014a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: a */
    static PorterDuff.Mode m1015a(int i) {
        if (i == R$drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1016a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1046a;
        synchronized (C0175i.class) {
            m1046a = f1073i.m1046a(i, mode);
            if (m1046a == null) {
                m1046a = new PorterDuffColorFilter(i, mode);
                f1073i.m1047a(i, mode, m1046a);
            }
        }
        return m1046a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1017a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1016a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m1018a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList m1043b = m1043b(context, i);
        if (m1043b != null) {
            if (C0162b0.m922a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m1495i = C0239a.m1495i(drawable);
            C0239a.m1480a(m1495i, m1043b);
            PorterDuff.Mode m1015a = m1015a(i);
            if (m1015a == null) {
                return m1495i;
            }
            C0239a.m1483a(m1495i, m1015a);
            return m1495i;
        }
        if (i == R$drawable.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m1022a(layerDrawable.findDrawableByLayerId(R.id.background), C0188o0.m1119b(context, R$attr.colorControlNormal), f1071g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i2 = R$attr.colorControlNormal;
        } else {
            if (i != R$drawable.abc_ratingbar_material && i != R$drawable.abc_ratingbar_indicator_material && i != R$drawable.abc_ratingbar_small_material) {
                if (m1026a(context, i, drawable) || !z) {
                    return drawable;
                }
                return null;
            }
            layerDrawable = (LayerDrawable) drawable;
            m1022a(layerDrawable.findDrawableByLayerId(R.id.background), C0188o0.m1116a(context, R$attr.colorControlNormal), f1071g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i2 = R$attr.colorControlActivated;
        }
        m1022a(findDrawableByLayerId, C0188o0.m1119b(context, i2), f1071g);
        m1022a(layerDrawable.findDrawableByLayerId(R.id.progress), C0188o0.m1119b(context, R$attr.colorControlActivated), f1071g);
        return drawable;
    }

    /* renamed from: a */
    private synchronized Drawable m1019a(Context context, long j) {
        C2452f0<WeakReference<Drawable.ConstantState>> c2452f0 = this.f1083d.get(context);
        if (c2452f0 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m11655c = c2452f0.m11655c(j);
        if (m11655c != null) {
            Drawable.ConstantState constantState = m11655c.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2452f0.m11653b(j);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C0175i m1020a() {
        C0175i c0175i;
        synchronized (C0175i.class) {
            if (f1072h == null) {
                C0175i c0175i2 = new C0175i();
                f1072h = c0175i2;
                m1024a(c0175i2);
            }
            c0175i = f1072h;
        }
        return c0175i;
    }

    /* renamed from: a */
    private void m1021a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1080a == null) {
            this.f1080a = new WeakHashMap<>();
        }
        C2795j0<ColorStateList> c2795j0 = this.f1080a.get(context);
        if (c2795j0 == null) {
            c2795j0 = new C2795j0<>();
            this.f1080a.put(context, c2795j0);
        }
        c2795j0.m13279a(i, colorStateList);
    }

    /* renamed from: a */
    private static void m1022a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0162b0.m922a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1071g;
        }
        drawable.setColorFilter(m1016a(i, mode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1023a(Drawable drawable, C0194r0 c0194r0, int[] iArr) {
        if (!C0162b0.m922a(drawable) || drawable.mutate() == drawable) {
            if (c0194r0.f1213d || c0194r0.f1212c) {
                drawable.setColorFilter(m1017a(c0194r0.f1213d ? c0194r0.f1210a : null, c0194r0.f1212c ? c0194r0.f1211b : f1071g, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: a */
    private static void m1024a(C0175i c0175i) {
        if (Build.VERSION.SDK_INT < 24) {
            c0175i.m1025a("vector", new e());
            c0175i.m1025a("animated-vector", new b());
            c0175i.m1025a("animated-selector", new a());
        }
    }

    /* renamed from: a */
    private void m1025a(String str, d dVar) {
        if (this.f1081b == null) {
            this.f1081b = new C0500c0<>();
        }
        this.f1081b.put(str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1026a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0175i.f1071g
            int[] r1 = androidx.appcompat.widget.C0175i.f1074j
            boolean r1 = m1029a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = androidx.appcompat.R$attr.colorControlNormal
        L12:
            r7 = -1
        L13:
            r1 = 1
            goto L42
        L15:
            int[] r1 = androidx.appcompat.widget.C0175i.f1076l
            boolean r1 = m1029a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = androidx.appcompat.R$attr.colorControlActivated
            goto L12
        L20:
            int[] r1 = androidx.appcompat.widget.C0175i.f1077m
            boolean r1 = m1029a(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = androidx.appcompat.R$drawable.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L13
        L3a:
            int r1 = androidx.appcompat.R$drawable.abc_dialog_material_background
            if (r7 != r1) goto L3f
            goto L12
        L3f:
            r7 = -1
            r1 = 0
            r2 = 0
        L42:
            if (r1 == 0) goto L5f
            boolean r1 = androidx.appcompat.widget.C0162b0.m922a(r8)
            if (r1 == 0) goto L4e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L4e:
            int r6 = androidx.appcompat.widget.C0188o0.m1119b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m1016a(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L5e
            r8.setAlpha(r7)
        L5e:
            return r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0175i.m1026a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private synchronized boolean m1027a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C2452f0<WeakReference<Drawable.ConstantState>> c2452f0 = this.f1083d.get(context);
            if (c2452f0 == null) {
                c2452f0 = new C2452f0<>();
                this.f1083d.put(context, c2452f0);
            }
            c2452f0.m11656c(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m1028a(Drawable drawable) {
        return (drawable instanceof C2921m4) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m1029a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1030b(Context context) {
        if (this.f1085f) {
            return;
        }
        this.f1085f = true;
        Drawable m1039a = m1039a(context, R$drawable.abc_vector_test);
        if (m1039a == null || !m1028a(m1039a)) {
            this.f1085f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: c */
    private ColorStateList m1031c(Context context) {
        return m1032c(context, 0);
    }

    /* renamed from: c */
    private ColorStateList m1032c(Context context, int i) {
        int m1119b = C0188o0.m1119b(context, R$attr.colorControlHighlight);
        return new ColorStateList(new int[][]{C0188o0.f1193b, C0188o0.f1195d, C0188o0.f1194c, C0188o0.f1197f}, new int[]{C0188o0.m1116a(context, R$attr.colorButtonNormal), C3147r0.m15162b(m1119b, i), C3147r0.m15162b(m1119b, i), i});
    }

    /* renamed from: d */
    private ColorStateList m1033d(Context context) {
        return m1032c(context, C0188o0.m1119b(context, R$attr.colorAccent));
    }

    /* renamed from: d */
    private Drawable m1034d(Context context, int i) {
        if (this.f1084e == null) {
            this.f1084e = new TypedValue();
        }
        TypedValue typedValue = this.f1084e;
        context.getResources().getValue(i, typedValue, true);
        long m1014a = m1014a(typedValue);
        Drawable m1019a = m1019a(context, m1014a);
        if (m1019a != null) {
            return m1019a;
        }
        if (i == R$drawable.abc_cab_background_top_material) {
            m1019a = new LayerDrawable(new Drawable[]{m1039a(context, R$drawable.abc_cab_background_internal_bg), m1039a(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (m1019a != null) {
            m1019a.setChangingConfigurations(typedValue.changingConfigurations);
            m1027a(context, m1014a, m1019a);
        }
        return m1019a;
    }

    /* renamed from: e */
    private ColorStateList m1035e(Context context) {
        return m1032c(context, C0188o0.m1119b(context, R$attr.colorButtonNormal));
    }

    /* renamed from: e */
    private ColorStateList m1036e(Context context, int i) {
        C2795j0<ColorStateList> c2795j0;
        WeakHashMap<Context, C2795j0<ColorStateList>> weakHashMap = this.f1080a;
        if (weakHashMap == null || (c2795j0 = weakHashMap.get(context)) == null) {
            return null;
        }
        return c2795j0.m13281b(i);
    }

    /* renamed from: f */
    private ColorStateList m1037f(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList m1120c = C0188o0.m1120c(context, R$attr.colorSwitchThumbNormal);
        if (m1120c == null || !m1120c.isStateful()) {
            iArr[0] = C0188o0.f1193b;
            iArr2[0] = C0188o0.m1116a(context, R$attr.colorSwitchThumbNormal);
            iArr[1] = C0188o0.f1196e;
            iArr2[1] = C0188o0.m1119b(context, R$attr.colorControlActivated);
            iArr[2] = C0188o0.f1197f;
            iArr2[2] = C0188o0.m1119b(context, R$attr.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0188o0.f1193b;
            iArr2[0] = m1120c.getColorForState(iArr[0], 0);
            iArr[1] = C0188o0.f1196e;
            iArr2[1] = C0188o0.m1119b(context, R$attr.colorControlActivated);
            iArr[2] = C0188o0.f1197f;
            iArr2[2] = m1120c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: f */
    private Drawable m1038f(Context context, int i) {
        int next;
        C0500c0<String, d> c0500c0 = this.f1081b;
        if (c0500c0 == null || c0500c0.isEmpty()) {
            return null;
        }
        C2795j0<String> c2795j0 = this.f1082c;
        if (c2795j0 != null) {
            String m13281b = c2795j0.m13281b(i);
            if ("appcompat_skip_skip".equals(m13281b) || (m13281b != null && this.f1081b.get(m13281b) == null)) {
                return null;
            }
        } else {
            this.f1082c = new C2795j0<>();
        }
        if (this.f1084e == null) {
            this.f1084e = new TypedValue();
        }
        TypedValue typedValue = this.f1084e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m1014a = m1014a(typedValue);
        Drawable m1019a = m1019a(context, m1014a);
        if (m1019a != null) {
            return m1019a;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1082c.m13279a(i, name);
                d dVar = this.f1081b.get(name);
                if (dVar != null) {
                    m1019a = dVar.mo1044a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m1019a != null) {
                    m1019a.setChangingConfigurations(typedValue.changingConfigurations);
                    m1027a(context, m1014a, m1019a);
                }
            } catch (Exception unused) {
            }
        }
        if (m1019a == null) {
            this.f1082c.m13279a(i, "appcompat_skip_skip");
        }
        return m1019a;
    }

    /* renamed from: a */
    public synchronized Drawable m1039a(Context context, int i) {
        return m1040a(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable m1040a(Context context, int i, boolean z) {
        Drawable m1038f;
        m1030b(context);
        m1038f = m1038f(context, i);
        if (m1038f == null) {
            m1038f = m1034d(context, i);
        }
        if (m1038f == null) {
            m1038f = C0237b.m1466c(context, i);
        }
        if (m1038f != null) {
            m1038f = m1018a(context, i, z, m1038f);
        }
        if (m1038f != null) {
            C0162b0.m923b(m1038f);
        }
        return m1038f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable m1041a(Context context, C0208y0 c0208y0, int i) {
        Drawable m1038f = m1038f(context, i);
        if (m1038f == null) {
            m1038f = c0208y0.m1242a(i);
        }
        if (m1038f == null) {
            return null;
        }
        return m1018a(context, i, false, m1038f);
    }

    /* renamed from: a */
    public synchronized void m1042a(Context context) {
        C2452f0<WeakReference<Drawable.ConstantState>> c2452f0 = this.f1083d.get(context);
        if (c2452f0 != null) {
            c2452f0.m11647a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:10:0x0078, B:12:0x0013, B:14:0x0017, B:15:0x001a, B:17:0x001e, B:18:0x0023, B:20:0x0027, B:21:0x002c, B:23:0x0030, B:24:0x0035, B:26:0x0039, B:27:0x003e, B:29:0x0042, B:32:0x0047, B:34:0x004f, B:35:0x0056, B:37:0x005e, B:38:0x0061, B:40:0x0069, B:41:0x006c, B:43:0x0070, B:44:0x0073), top: B:2:0x0001 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.content.res.ColorStateList m1043b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.m1036e(r3, r4)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7b
            int r1 = androidx.appcompat.R$drawable.abc_edit_text_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L13
            int r0 = androidx.appcompat.R$color.abc_tint_edittext     // Catch: java.lang.Throwable -> L7d
        Ld:
            android.content.res.ColorStateList r0 = p000.C0000a.m3b(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L13:
            int r1 = androidx.appcompat.R$drawable.abc_switch_track_mtrl_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L1a
            int r0 = androidx.appcompat.R$color.abc_tint_switch_track     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L1a:
            int r1 = androidx.appcompat.R$drawable.abc_switch_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L23
            android.content.res.ColorStateList r0 = r2.m1037f(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L23:
            int r1 = androidx.appcompat.R$drawable.abc_btn_default_mtrl_shape     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L2c
            android.content.res.ColorStateList r0 = r2.m1035e(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L2c:
            int r1 = androidx.appcompat.R$drawable.abc_btn_borderless_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L35
            android.content.res.ColorStateList r0 = r2.m1031c(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L35:
            int r1 = androidx.appcompat.R$drawable.abc_btn_colored_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L3e
            android.content.res.ColorStateList r0 = r2.m1033d(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L3e:
            int r1 = androidx.appcompat.R$drawable.abc_spinner_mtrl_am_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 == r1) goto L73
            int r1 = androidx.appcompat.R$drawable.abc_spinner_textfield_background_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L47
            goto L73
        L47:
            int[] r1 = androidx.appcompat.widget.C0175i.f1075k     // Catch: java.lang.Throwable -> L7d
            boolean r1 = m1029a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L56
            int r0 = androidx.appcompat.R$attr.colorControlNormal     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r0 = androidx.appcompat.widget.C0188o0.m1120c(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L56:
            int[] r1 = androidx.appcompat.widget.C0175i.f1078n     // Catch: java.lang.Throwable -> L7d
            boolean r1 = m1029a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L61
            int r0 = androidx.appcompat.R$color.abc_tint_default     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L61:
            int[] r1 = androidx.appcompat.widget.C0175i.f1079o     // Catch: java.lang.Throwable -> L7d
            boolean r1 = m1029a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6c
            int r0 = androidx.appcompat.R$color.abc_tint_btn_checkable     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L6c:
            int r1 = androidx.appcompat.R$drawable.abc_seekbar_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L76
            int r0 = androidx.appcompat.R$color.abc_tint_seek_thumb     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L73:
            int r0 = androidx.appcompat.R$color.abc_tint_spinner     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L76:
            if (r0 == 0) goto L7b
            r2.m1021a(r3, r4, r0)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r2)
            return r0
        L7d:
            r3 = move-exception
            monitor-exit(r2)
            goto L81
        L80:
            throw r3
        L81:
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0175i.m1043b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
