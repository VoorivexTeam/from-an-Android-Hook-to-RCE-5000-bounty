package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.j */
/* loaded from: classes.dex */
public class C0638j extends ArrayAdapter<String> implements Filterable {

    /* renamed from: b */
    private int f3853b;

    /* renamed from: c */
    private int f3854c;

    /* renamed from: d */
    private C3489yj f3855d;

    /* renamed from: e */
    private Context f3856e;

    /* renamed from: f */
    private ArrayList<String> f3857f;

    /* renamed from: g */
    private List<String> f3858g;

    /* renamed from: h */
    private b f3859h;

    /* renamed from: i */
    private int f3860i;

    /* renamed from: j */
    private boolean f3861j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.j$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ CheckedTextView f3862b;

        a(C0638j c0638j, CheckedTextView checkedTextView) {
            this.f3862b = checkedTextView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3862b.setSingleLine(false);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.j$b */
    /* loaded from: classes.dex */
    private class b extends Filter {
        private b() {
        }

        /* synthetic */ b(C0638j c0638j, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            if (C0638j.this.f3858g == null) {
                C0638j.this.f3858g = new ArrayList(C0638j.this.f3857f);
            }
            if (charSequence == null || charSequence.length() == 0) {
                filterResults.values = C0638j.this.f3858g;
                filterResults.count = C0638j.this.f3858g.size();
            } else {
                String lowerCase = charSequence.toString().toLowerCase(Locale.ENGLISH);
                for (int i = 0; i < C0638j.this.f3858g.size(); i++) {
                    String str = (String) C0638j.this.f3858g.get(i);
                    if (str.toLowerCase(Locale.ENGLISH).contains(lowerCase)) {
                        arrayList.add(str);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C0638j.this.f3857f = (ArrayList) filterResults.values;
            C0638j.this.notifyDataSetChanged();
        }
    }

    public C0638j(Context context, C3489yj c3489yj, int i, ArrayList<String> arrayList, int i2, boolean z) {
        super(context, i, arrayList);
        this.f3853b = 45;
        this.f3854c = 8;
        this.f3861j = false;
        this.f3855d = c3489yj;
        float f = c3489yj.f14196a;
        this.f3853b = (int) (45 * f);
        this.f3854c = (int) (8 * f);
        this.f3856e = context;
        this.f3857f = arrayList;
        this.f3860i = i2;
        this.f3861j = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m4517a(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L14
            android.content.Context r5 = r3.f3856e
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.LayoutInflater r5 = (android.view.LayoutInflater) r5
            r0 = 2131492910(0x7f0c002e, float:1.8609285E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
        L14:
            r6 = r5
            android.widget.CheckedTextView r6 = (android.widget.CheckedTextView) r6
            java.util.ArrayList<java.lang.String> r0 = r3.f3857f
            int r0 = r0.size()
            if (r4 >= r0) goto L28
            java.util.ArrayList<java.lang.String> r0 = r3.f3857f
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L2e
            r6.setText(r4)
        L2e:
            int r4 = r3.f3853b
            r6.setMinHeight(r4)
            java.lang.String r4 = "Poppins-Bold.ttf"
            android.graphics.Typeface r4 = com.comviva.webaxn.utils.C0747v.m6081a(r4)
            yj r0 = r3.f3855d
            com.comviva.webaxn.utils.u r0 = r0.f14241p
            int r0 = r0.m6068g()
            int r0 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4702e(r0)
            r6.setTypeface(r4, r0)
            yj r4 = r3.f3855d
            com.comviva.webaxn.utils.u r4 = r4.f14241p
            boolean r4 = r4.m6071j()
            if (r4 == 0) goto L70
            yj r4 = r3.f3855d
            com.comviva.webaxn.utils.u r4 = r4.f14241p
            int r4 = r4.m6062c()
            int r4 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4701d(r4)
            r6.setTextColor(r4)
            yj r4 = r3.f3855d
            com.comviva.webaxn.utils.u r4 = r4.f14241p
            int r4 = r4.m6057b()
            int r4 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4701d(r4)
            r6.setBackgroundColor(r4)
        L70:
            yj r4 = r3.f3855d
            com.comviva.webaxn.utils.u r4 = r4.f14241p
            float r4 = r4.m6067f()
            r6.setTextSize(r4)
            int r4 = r6.getPaddingLeft()
            int r0 = r3.f3854c
            int r1 = r6.getPaddingRight()
            int r2 = r3.f3854c
            r6.setPadding(r4, r0, r1, r2)
            yj r4 = r3.f3855d
            int r4 = r4.f14165K0
            r0 = 2
            r1 = 21
            if (r4 != r0) goto L99
            r4 = 17
        L95:
            r6.setGravity(r4)
            goto La4
        L99:
            boolean r4 = r3.f3861j
            if (r4 == 0) goto La1
            r6.setGravity(r1)
            goto La4
        La1:
            r4 = 19
            goto L95
        La4:
            com.comviva.webaxn.ui.j$a r4 = new com.comviva.webaxn.ui.j$a
            r4.<init>(r3, r6)
            r6.post(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto Lbb
            yj r4 = r3.f3855d
            com.comviva.webaxn.utils.u r4 = r4.f14241p
            float r4 = r4.m6064d()
            r6.setLetterSpacing(r4)
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0638j.m4517a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m4518b(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r7 = r5.f3856e
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.LayoutInflater r7 = (android.view.LayoutInflater) r7
            r0 = 0
            r1 = 2131492908(0x7f0c002c, float:1.8609281E38)
            android.view.View r7 = r7.inflate(r1, r8, r0)
            r8 = 2131296363(0x7f09006b, float:1.821064E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.util.ArrayList<java.lang.String> r1 = r5.f3857f
            int r1 = r1.size()
            if (r6 >= r1) goto L2c
            java.util.ArrayList<java.lang.String> r1 = r5.f3857f
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            goto L2d
        L2c:
            r6 = 0
        L2d:
            if (r6 == 0) goto L32
            r8.setText(r6)
        L32:
            yj r6 = r5.f3855d
            com.comviva.webaxn.utils.u r6 = r6.f14241p
            android.graphics.Typeface r6 = r6.m6069h()
            yj r1 = r5.f3855d
            com.comviva.webaxn.utils.u r1 = r1.f14241p
            int r1 = r1.m6068g()
            int r1 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4702e(r1)
            r8.setTypeface(r6, r1)
            yj r6 = r5.f3855d
            com.comviva.webaxn.utils.u r6 = r6.f14241p
            int r6 = r6.m6062c()
            int r6 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4701d(r6)
            r8.setTextColor(r6)
            yj r6 = r5.f3855d
            com.comviva.webaxn.utils.u r6 = r6.f14241p
            float r6 = r6.m6067f()
            r8.setTextSize(r6)
            yj r6 = r5.f3855d
            int r1 = r5.f3860i
            int r6 = r6.m16639e(r1)
            yj r1 = r5.f3855d
            int r2 = r5.f3860i
            int r1 = r1.m16644j(r2)
            yj r2 = r5.f3855d
            int r3 = r5.f3860i
            int r2 = r2.m16642h(r3)
            yj r3 = r5.f3855d
            int r4 = r5.f3860i
            int r3 = r3.m16635b(r4)
            r8.setPadding(r6, r1, r2, r3)
            yj r6 = r5.f3855d
            int r6 = r6.f14165K0
            r1 = 2
            r2 = 21
            if (r6 != r1) goto L95
            r6 = 17
        L91:
            r8.setGravity(r6)
            goto La0
        L95:
            boolean r6 = r5.f3861j
            if (r6 == 0) goto L9d
            r8.setGravity(r2)
            goto La0
        L9d:
            r6 = 19
            goto L91
        La0:
            r8.setSingleLine(r0)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r2) goto Lb2
            yj r6 = r5.f3855d
            com.comviva.webaxn.utils.u r6 = r6.f14241p
            float r6 = r6.m6064d()
            r8.setLetterSpacing(r6)
        Lb2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0638j.m4518b(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f3857f.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m4517a(i, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        if (this.f3859h == null) {
            this.f3859h = new b(this, null);
        }
        return this.f3859h;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public String getItem(int i) {
        return this.f3857f.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m4518b(i, view, viewGroup);
    }
}
