package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000.C2918m1;
import p000.C3419x1;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C0257i {

    /* renamed from: a */
    private static Field f1558a;

    /* renamed from: b */
    private static boolean f1559b;

    /* renamed from: c */
    private static Field f1560c;

    /* renamed from: d */
    private static boolean f1561d;

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    private static class a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f1562a;

        /* renamed from: b */
        private final TextView f1563b;

        /* renamed from: c */
        private Class f1564c;

        /* renamed from: d */
        private Method f1565d;

        /* renamed from: e */
        private boolean f1566e;

        /* renamed from: f */
        private boolean f1567f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f1562a = callback;
            this.f1563b = textView;
        }

        /* renamed from: a */
        private Intent m1606a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: a */
        private Intent m1607a(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m1606a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m1611a(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: a */
        private List<ResolveInfo> m1608a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m1606a(), 0)) {
                if (m1610a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m1609a(Menu menu) {
            Context context = this.f1563b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f1567f) {
                this.f1567f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1564c = cls;
                    this.f1565d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f1566e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1564c = null;
                    this.f1565d = null;
                    this.f1566e = false;
                }
            }
            try {
                Method declaredMethod = (this.f1566e && this.f1564c.isInstance(menu)) ? this.f1565d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m1608a = m1608a(context, packageManager);
                for (int i = 0; i < m1608a.size(); i++) {
                    ResolveInfo resolveInfo = m1608a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m1607a(resolveInfo, this.f1563b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: a */
        private boolean m1610a(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: a */
        private boolean m1611a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1562a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1562a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1562a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m1609a(menu);
            return this.f1562a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    private static int m1589a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: a */
    private static int m1590a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            String str = "Could not retrieve value of " + field.getName() + " field.";
            return -1;
        }
    }

    /* renamed from: a */
    public static ActionMode.Callback m1591a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof a)) ? callback : new a(callback, textView);
    }

    /* renamed from: a */
    private static Field m1592a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            String str2 = "Could not retrieve " + str + " field.";
            return field;
        }
    }

    /* renamed from: a */
    public static void m1593a(TextView textView, int i) {
        C3419x1.m16409a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m1594a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (i < 17) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable5 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
    }

    /* renamed from: a */
    public static void m1595a(TextView textView, C2918m1.a aVar) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m1589a(aVar.m13987c()));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            textView.getPaint().set(aVar.m13988d());
            textView.setBreakStrategy(aVar.m13985a());
            textView.setHyphenationFrequency(aVar.m13986b());
        } else {
            float textScaleX = aVar.m13988d().getTextScaleX();
            textView.getPaint().set(aVar.m13988d());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    /* renamed from: a */
    public static void m1596a(TextView textView, C2918m1 c2918m1) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 28) {
            precomputedText = c2918m1.m13984b();
        } else {
            boolean equals = m1605f(textView).equals(c2918m1.m13983a());
            precomputedText = c2918m1;
            if (!equals) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    /* renamed from: a */
    public static Drawable[] m1597a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static int m1598b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static void m1599b(TextView textView, int i) {
        C3419x1.m16409a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static int m1600c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    public static void m1601c(TextView textView, int i) {
        C3419x1.m16409a(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: d */
    public static int m1602d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f1561d) {
            f1560c = m1592a("mMaxMode");
            f1561d = true;
        }
        Field field = f1560c;
        if (field == null || m1590a(field, textView) != 1) {
            return -1;
        }
        if (!f1559b) {
            f1558a = m1592a("mMaximum");
            f1559b = true;
        }
        Field field2 = f1558a;
        if (field2 != null) {
            return m1590a(field2, textView);
        }
        return -1;
    }

    /* renamed from: d */
    public static void m1603d(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m1604e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: f */
    public static C2918m1.a m1605f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C2918m1.a(textView.getTextMetricsParams());
        }
        C2918m1.a.C3573a c3573a = new C2918m1.a.C3573a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            c3573a.m13989a(textView.getBreakStrategy());
            c3573a.m13992b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            c3573a.m13990a(m1604e(textView));
        }
        return c3573a.m13991a();
    }
}
