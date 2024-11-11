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
import defpackage.g4;
import defpackage.m4;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class i {
    private static i h;
    private WeakHashMap<Context, defpackage.j0<ColorStateList>> a;
    private defpackage.c0<String, d> b;
    private defpackage.j0<String> c;
    private final WeakHashMap<Context, defpackage.f0<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    private static final c i = new c(6);
    private static final int[] j = {R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};
    private static final int[] k = {R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] l = {R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl_dark, R$drawable.abc_text_select_handle_middle_mtrl_dark, R$drawable.abc_text_select_handle_right_mtrl_dark, R$drawable.abc_text_select_handle_left_mtrl_light, R$drawable.abc_text_select_handle_middle_mtrl_light, R$drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] m = {R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] n = {R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};
    private static final int[] o = {R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.i.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return defpackage.b.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.i.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return g4.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends defpackage.g0<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return b(Integer.valueOf(b(i, mode)));
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return a((c) Integer.valueOf(b(i, mode)), (Integer) porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e implements d {
        e() {
        }

        @Override // androidx.appcompat.widget.i.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return m4.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static long a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    static PorterDuff.Mode a(int i2) {
        if (i2 == R$drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (i.class) {
            a2 = i.a(i2, mode);
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                i.a(i2, mode, a2);
            }
        }
        return a2;
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i3;
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i4 = androidx.core.graphics.drawable.a.i(drawable);
            androidx.core.graphics.drawable.a.a(i4, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 == null) {
                return i4;
            }
            androidx.core.graphics.drawable.a.a(i4, a2);
            return i4;
        }
        if (i2 == R$drawable.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(R.id.background), o0.b(context, R$attr.colorControlNormal), g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i3 = R$attr.colorControlNormal;
        } else {
            if (i2 != R$drawable.abc_ratingbar_material && i2 != R$drawable.abc_ratingbar_indicator_material && i2 != R$drawable.abc_ratingbar_small_material) {
                if (a(context, i2, drawable) || !z) {
                    return drawable;
                }
                return null;
            }
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(R.id.background), o0.a(context, R$attr.colorControlNormal), g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i3 = R$attr.colorControlActivated;
        }
        a(findDrawableByLayerId, o0.b(context, i3), g);
        a(layerDrawable.findDrawableByLayerId(R.id.progress), o0.b(context, R$attr.colorControlActivated), g);
        return drawable;
    }

    private synchronized Drawable a(Context context, long j2) {
        defpackage.f0<WeakReference<Drawable.ConstantState>> f0Var = this.d.get(context);
        if (f0Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> c2 = f0Var.c(j2);
        if (c2 != null) {
            Drawable.ConstantState constantState = c2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            f0Var.b(j2);
        }
        return null;
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (h == null) {
                i iVar2 = new i();
                h = iVar2;
                a(iVar2);
            }
            iVar = h;
        }
        return iVar;
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        defpackage.j0<ColorStateList> j0Var = this.a.get(context);
        if (j0Var == null) {
            j0Var = new defpackage.j0<>();
            this.a.put(context, j0Var);
        }
        j0Var.a(i2, colorStateList);
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (b0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = g;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Drawable drawable, r0 r0Var, int[] iArr) {
        if (!b0.a(drawable) || drawable.mutate() == drawable) {
            if (r0Var.d || r0Var.c) {
                drawable.setColorFilter(a(r0Var.d ? r0Var.a : null, r0Var.c ? r0Var.b : g, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    private static void a(i iVar) {
        if (Build.VERSION.SDK_INT < 24) {
            iVar.a("vector", new e());
            iVar.a("animated-vector", new b());
            iVar.a("animated-selector", new a());
        }
    }

    private void a(String str, d dVar) {
        if (this.b == null) {
            this.b = new defpackage.c0<>();
        }
        this.b.put(str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i.g
            int[] r1 = androidx.appcompat.widget.i.j
            boolean r1 = a(r1, r7)
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
            int[] r1 = androidx.appcompat.widget.i.l
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = androidx.appcompat.R$attr.colorControlActivated
            goto L12
        L20:
            int[] r1 = androidx.appcompat.widget.i.m
            boolean r1 = a(r1, r7)
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
            boolean r1 = androidx.appcompat.widget.b0.a(r8)
            if (r1 == 0) goto L4e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L4e:
            int r6 = androidx.appcompat.widget.o0.b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = a(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L5e
            r8.setAlpha(r7)
        L5e:
            return r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            defpackage.f0<WeakReference<Drawable.ConstantState>> f0Var = this.d.get(context);
            if (f0Var == null) {
                f0Var = new defpackage.f0<>();
                this.d.put(context, f0Var);
            }
            f0Var.c(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private static boolean a(Drawable drawable) {
        return (drawable instanceof m4) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void b(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable a2 = a(context, R$drawable.abc_vector_test);
        if (a2 == null || !a(a2)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private ColorStateList c(Context context) {
        return c(context, 0);
    }

    private ColorStateList c(Context context, int i2) {
        int b2 = o0.b(context, R$attr.colorControlHighlight);
        return new ColorStateList(new int[][]{o0.b, o0.d, o0.c, o0.f}, new int[]{o0.a(context, R$attr.colorButtonNormal), defpackage.r0.b(b2, i2), defpackage.r0.b(b2, i2), i2});
    }

    private ColorStateList d(Context context) {
        return c(context, o0.b(context, R$attr.colorAccent));
    }

    private Drawable d(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (i2 == R$drawable.abc_cab_background_top_material) {
            a3 = new LayerDrawable(new Drawable[]{a(context, R$drawable.abc_cab_background_internal_bg), a(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (a3 != null) {
            a3.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, a2, a3);
        }
        return a3;
    }

    private ColorStateList e(Context context) {
        return c(context, o0.b(context, R$attr.colorButtonNormal));
    }

    private ColorStateList e(Context context, int i2) {
        defpackage.j0<ColorStateList> j0Var;
        WeakHashMap<Context, defpackage.j0<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (j0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return j0Var.b(i2);
    }

    private ColorStateList f(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList c2 = o0.c(context, R$attr.colorSwitchThumbNormal);
        if (c2 == null || !c2.isStateful()) {
            iArr[0] = o0.b;
            iArr2[0] = o0.a(context, R$attr.colorSwitchThumbNormal);
            iArr[1] = o0.e;
            iArr2[1] = o0.b(context, R$attr.colorControlActivated);
            iArr[2] = o0.f;
            iArr2[2] = o0.b(context, R$attr.colorSwitchThumbNormal);
        } else {
            iArr[0] = o0.b;
            iArr2[0] = c2.getColorForState(iArr[0], 0);
            iArr[1] = o0.e;
            iArr2[1] = o0.b(context, R$attr.colorControlActivated);
            iArr[2] = o0.f;
            iArr2[2] = c2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private Drawable f(Context context, int i2) {
        int next;
        defpackage.c0<String, d> c0Var = this.b;
        if (c0Var == null || c0Var.isEmpty()) {
            return null;
        }
        defpackage.j0<String> j0Var = this.c;
        if (j0Var != null) {
            String b2 = j0Var.b(i2);
            if ("appcompat_skip_skip".equals(b2) || (b2 != null && this.b.get(b2) == null)) {
                return null;
            }
        } else {
            this.c = new defpackage.j0<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
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
                this.c.a(i2, name);
                d dVar = this.b.get(name);
                if (dVar != null) {
                    a3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a3 != null) {
                    a3.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, a2, a3);
                }
            } catch (Exception unused) {
            }
        }
        if (a3 == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return a3;
    }

    public synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable f;
        b(context);
        f = f(context, i2);
        if (f == null) {
            f = d(context, i2);
        }
        if (f == null) {
            f = androidx.core.content.b.c(context, i2);
        }
        if (f != null) {
            f = a(context, i2, z, f);
        }
        if (f != null) {
            b0.b(f);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, y0 y0Var, int i2) {
        Drawable f = f(context, i2);
        if (f == null) {
            f = y0Var.a(i2);
        }
        if (f == null) {
            return null;
        }
        return a(context, i2, false, f);
    }

    public synchronized void a(Context context) {
        defpackage.f0<WeakReference<Drawable.ConstantState>> f0Var = this.d.get(context);
        if (f0Var != null) {
            f0Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:10:0x0078, B:12:0x0013, B:14:0x0017, B:15:0x001a, B:17:0x001e, B:18:0x0023, B:20:0x0027, B:21:0x002c, B:23:0x0030, B:24:0x0035, B:26:0x0039, B:27:0x003e, B:29:0x0042, B:32:0x0047, B:34:0x004f, B:35:0x0056, B:37:0x005e, B:38:0x0061, B:40:0x0069, B:41:0x006c, B:43:0x0070, B:44:0x0073), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.content.res.ColorStateList b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.e(r3, r4)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7b
            int r1 = androidx.appcompat.R$drawable.abc_edit_text_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L13
            int r0 = androidx.appcompat.R$color.abc_tint_edittext     // Catch: java.lang.Throwable -> L7d
        Ld:
            android.content.res.ColorStateList r0 = defpackage.a.b(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L13:
            int r1 = androidx.appcompat.R$drawable.abc_switch_track_mtrl_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L1a
            int r0 = androidx.appcompat.R$color.abc_tint_switch_track     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L1a:
            int r1 = androidx.appcompat.R$drawable.abc_switch_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L23
            android.content.res.ColorStateList r0 = r2.f(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L23:
            int r1 = androidx.appcompat.R$drawable.abc_btn_default_mtrl_shape     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L2c
            android.content.res.ColorStateList r0 = r2.e(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L2c:
            int r1 = androidx.appcompat.R$drawable.abc_btn_borderless_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L35
            android.content.res.ColorStateList r0 = r2.c(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L35:
            int r1 = androidx.appcompat.R$drawable.abc_btn_colored_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L3e
            android.content.res.ColorStateList r0 = r2.d(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L3e:
            int r1 = androidx.appcompat.R$drawable.abc_spinner_mtrl_am_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 == r1) goto L73
            int r1 = androidx.appcompat.R$drawable.abc_spinner_textfield_background_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L47
            goto L73
        L47:
            int[] r1 = androidx.appcompat.widget.i.k     // Catch: java.lang.Throwable -> L7d
            boolean r1 = a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L56
            int r0 = androidx.appcompat.R$attr.colorControlNormal     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r0 = androidx.appcompat.widget.o0.c(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L56:
            int[] r1 = androidx.appcompat.widget.i.n     // Catch: java.lang.Throwable -> L7d
            boolean r1 = a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L61
            int r0 = androidx.appcompat.R$color.abc_tint_default     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L61:
            int[] r1 = androidx.appcompat.widget.i.o     // Catch: java.lang.Throwable -> L7d
            boolean r1 = a(r1, r4)     // Catch: java.lang.Throwable -> L7d
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
            r2.a(r3, r4, r0)     // Catch: java.lang.Throwable -> L7d
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
