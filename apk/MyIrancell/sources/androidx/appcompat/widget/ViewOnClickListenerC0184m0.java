package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.core.content.C0237b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC2576i3;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
class ViewOnClickListenerC0184m0 extends AbstractC2576i3 implements View.OnClickListener {

    /* renamed from: A */
    private int f1128A;

    /* renamed from: n */
    private final SearchView f1129n;

    /* renamed from: o */
    private final SearchableInfo f1130o;

    /* renamed from: p */
    private final Context f1131p;

    /* renamed from: q */
    private final WeakHashMap<String, Drawable.ConstantState> f1132q;

    /* renamed from: r */
    private final int f1133r;

    /* renamed from: s */
    private boolean f1134s;

    /* renamed from: t */
    private int f1135t;

    /* renamed from: u */
    private ColorStateList f1136u;

    /* renamed from: v */
    private int f1137v;

    /* renamed from: w */
    private int f1138w;

    /* renamed from: x */
    private int f1139x;

    /* renamed from: y */
    private int f1140y;

    /* renamed from: z */
    private int f1141z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1142a;

        /* renamed from: b */
        public final TextView f1143b;

        /* renamed from: c */
        public final ImageView f1144c;

        /* renamed from: d */
        public final ImageView f1145d;

        /* renamed from: e */
        public final ImageView f1146e;

        public a(View view) {
            this.f1142a = (TextView) view.findViewById(R.id.text1);
            this.f1143b = (TextView) view.findViewById(R.id.text2);
            this.f1144c = (ImageView) view.findViewById(R.id.icon1);
            this.f1145d = (ImageView) view.findViewById(R.id.icon2);
            this.f1146e = (ImageView) view.findViewById(R$id.edit_query);
        }
    }

    public ViewOnClickListenerC0184m0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1134s = false;
        this.f1135t = 1;
        this.f1137v = -1;
        this.f1138w = -1;
        this.f1139x = -1;
        this.f1140y = -1;
        this.f1141z = -1;
        this.f1128A = -1;
        this.f1129n = searchView;
        this.f1130o = searchableInfo;
        this.f1133r = searchView.getSuggestionCommitIconResId();
        this.f1131p = context;
        this.f1132q = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m1079a(ComponentName componentName) {
        PackageManager packageManager = this.f10192e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            String str = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: a */
    private Drawable m1080a(String str) {
        Drawable.ConstantState constantState = this.f1132q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private static String m1081a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m1082a(Cursor cursor, String str) {
        return m1081a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m1083a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m1084a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m1085a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1132q.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m1086b(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1132q.containsKey(flattenToShortString)) {
            Drawable m1079a = m1079a(componentName);
            this.f1132q.put(flattenToShortString, m1079a != null ? m1079a.getConstantState() : null);
            return m1079a;
        }
        Drawable.ConstantState constantState = this.f1132q.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1131p.getResources());
    }

    /* renamed from: b */
    private Drawable m1087b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1096a(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1131p.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                    String str = "Error closing icon stream for " + uri;
                }
            }
        } catch (FileNotFoundException e) {
            String str2 = "Icon not found: " + uri + ", " + e.getMessage();
            return null;
        }
        String str22 = "Icon not found: " + uri + ", " + e.getMessage();
        return null;
    }

    /* renamed from: b */
    private Drawable m1088b(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1131p.getPackageName() + "/" + parseInt;
            Drawable m1080a = m1080a(str2);
            if (m1080a != null) {
                return m1080a;
            }
            Drawable m1466c = C0237b.m1466c(this.f1131p, parseInt);
            m1085a(str2, m1466c);
            return m1466c;
        } catch (Resources.NotFoundException unused) {
            String str3 = "Icon resource not found: " + str;
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m1080a2 = m1080a(str);
            if (m1080a2 != null) {
                return m1080a2;
            }
            Drawable m1087b = m1087b(Uri.parse(str));
            m1085a(str, m1087b);
            return m1087b;
        }
    }

    /* renamed from: b */
    private CharSequence m1089b(CharSequence charSequence) {
        if (this.f1136u == null) {
            TypedValue typedValue = new TypedValue();
            this.f10192e.getTheme().resolveAttribute(R$attr.textColorSearchUrl, typedValue, true);
            this.f1136u = this.f10192e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1136u, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private Drawable m1090d(Cursor cursor) {
        Drawable m1086b = m1086b(this.f1130o.getSearchActivity());
        return m1086b != null ? m1086b : this.f10192e.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: e */
    private Drawable m1091e(Cursor cursor) {
        int i = this.f1140y;
        if (i == -1) {
            return null;
        }
        Drawable m1088b = m1088b(cursor.getString(i));
        return m1088b != null ? m1088b : m1090d(cursor);
    }

    /* renamed from: f */
    private Drawable m1092f(Cursor cursor) {
        int i = this.f1141z;
        if (i == -1) {
            return null;
        }
        return m1088b(cursor.getString(i));
    }

    /* renamed from: g */
    private void m1093g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    Cursor m1094a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f10192e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p000.AbstractC2496g3, p000.C2536h3.a
    /* renamed from: a */
    public Cursor mo1095a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1129n.getVisibility() == 0 && this.f1129n.getWindowVisibility() == 0) {
            try {
                Cursor m1094a = m1094a(this.f1130o, charSequence2, 50);
                if (m1094a != null) {
                    m1094a.getCount();
                    return m1094a;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    Drawable m1096a(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f10192e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a */
    public void m1097a(int i) {
        this.f1135t = i;
    }

    @Override // p000.AbstractC2496g3, p000.C2536h3.a
    /* renamed from: a */
    public void mo1098a(Cursor cursor) {
        if (this.f1134s) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1098a(cursor);
            if (cursor != null) {
                this.f1137v = cursor.getColumnIndex("suggest_text_1");
                this.f1138w = cursor.getColumnIndex("suggest_text_2");
                this.f1139x = cursor.getColumnIndex("suggest_text_2_url");
                this.f1140y = cursor.getColumnIndex("suggest_icon_1");
                this.f1141z = cursor.getColumnIndex("suggest_icon_2");
                this.f1128A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p000.AbstractC2496g3
    /* renamed from: a */
    public void mo1099a(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.f1128A;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1142a != null) {
            m1084a(aVar.f1142a, m1081a(cursor, this.f1137v));
        }
        if (aVar.f1143b != null) {
            String m1081a = m1081a(cursor, this.f1139x);
            CharSequence m1089b = m1081a != null ? m1089b((CharSequence) m1081a) : m1081a(cursor, this.f1138w);
            if (TextUtils.isEmpty(m1089b)) {
                TextView textView = aVar.f1142a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1142a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1142a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1142a.setMaxLines(1);
                }
            }
            m1084a(aVar.f1143b, m1089b);
        }
        ImageView imageView = aVar.f1144c;
        if (imageView != null) {
            m1083a(imageView, m1091e(cursor), 4);
        }
        ImageView imageView2 = aVar.f1145d;
        if (imageView2 != null) {
            m1083a(imageView2, m1092f(cursor), 8);
        }
        int i3 = this.f1135t;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            aVar.f1146e.setVisibility(8);
            return;
        }
        aVar.f1146e.setVisibility(0);
        aVar.f1146e.setTag(aVar.f1142a.getText());
        aVar.f1146e.setOnClickListener(this);
    }

    @Override // p000.AbstractC2576i3, p000.AbstractC2496g3
    /* renamed from: b */
    public View mo1100b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1100b = super.mo1100b(context, cursor, viewGroup);
        mo1100b.setTag(new a(mo1100b));
        ((ImageView) mo1100b.findViewById(R$id.edit_query)).setImageResource(this.f1133r);
        return mo1100b;
    }

    @Override // p000.AbstractC2496g3, p000.C2536h3.a
    /* renamed from: b */
    public CharSequence mo1101b(Cursor cursor) {
        String m1082a;
        String m1082a2;
        if (cursor == null) {
            return null;
        }
        String m1082a3 = m1082a(cursor, "suggest_intent_query");
        if (m1082a3 != null) {
            return m1082a3;
        }
        if (this.f1130o.shouldRewriteQueryFromData() && (m1082a2 = m1082a(cursor, "suggest_intent_data")) != null) {
            return m1082a2;
        }
        if (!this.f1130o.shouldRewriteQueryFromText() || (m1082a = m1082a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m1082a;
    }

    @Override // p000.AbstractC2496g3, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View mo11877a = mo11877a(this.f10192e, this.f10191d, viewGroup);
            if (mo11877a != null) {
                ((a) mo11877a.getTag()).f1142a.setText(e.toString());
            }
            return mo11877a;
        }
    }

    @Override // p000.AbstractC2496g3, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View mo1100b = mo1100b(this.f10192e, this.f10191d, viewGroup);
            if (mo1100b != null) {
                ((a) mo1100b.getTag()).f1142a.setText(e.toString());
            }
            return mo1100b;
        }
    }

    @Override // p000.AbstractC2496g3, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1093g(mo11876a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1093g(mo11876a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1129n.m827a((CharSequence) tag);
        }
    }
}
