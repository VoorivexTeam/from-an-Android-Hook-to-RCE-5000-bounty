package com.comviva.webaxn.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.yj;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class j extends ArrayAdapter<String> implements Filterable {
    private int b;
    private int c;
    private yj d;
    private Context e;
    private ArrayList<String> f;
    private List<String> g;
    private b h;
    private int i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ CheckedTextView b;

        a(j jVar, CheckedTextView checkedTextView) {
            this.b = checkedTextView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.setSingleLine(false);
        }
    }

    /* loaded from: classes.dex */
    private class b extends Filter {
        private b() {
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            if (j.this.g == null) {
                j.this.g = new ArrayList(j.this.f);
            }
            if (charSequence == null || charSequence.length() == 0) {
                filterResults.values = j.this.g;
                filterResults.count = j.this.g.size();
            } else {
                String lowerCase = charSequence.toString().toLowerCase(Locale.ENGLISH);
                for (int i = 0; i < j.this.g.size(); i++) {
                    String str = (String) j.this.g.get(i);
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
            j.this.f = (ArrayList) filterResults.values;
            j.this.notifyDataSetChanged();
        }
    }

    public j(Context context, yj yjVar, int i, ArrayList<String> arrayList, int i2, boolean z) {
        super(context, i, arrayList);
        this.b = 45;
        this.c = 8;
        this.j = false;
        this.d = yjVar;
        float f = yjVar.a;
        this.b = (int) (45 * f);
        this.c = (int) (8 * f);
        this.e = context;
        this.f = arrayList;
        this.i = i2;
        this.j = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L14
            android.content.Context r5 = r3.e
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.LayoutInflater r5 = (android.view.LayoutInflater) r5
            r0 = 2131492910(0x7f0c002e, float:1.8609285E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
        L14:
            r6 = r5
            android.widget.CheckedTextView r6 = (android.widget.CheckedTextView) r6
            java.util.ArrayList<java.lang.String> r0 = r3.f
            int r0 = r0.size()
            if (r4 >= r0) goto L28
            java.util.ArrayList<java.lang.String> r0 = r3.f
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L2e
            r6.setText(r4)
        L2e:
            int r4 = r3.b
            r6.setMinHeight(r4)
            java.lang.String r4 = "Poppins-Bold.ttf"
            android.graphics.Typeface r4 = com.comviva.webaxn.utils.v.a(r4)
            yj r0 = r3.d
            com.comviva.webaxn.utils.u r0 = r0.p
            int r0 = r0.g()
            int r0 = com.comviva.webaxn.ui.n1.e(r0)
            r6.setTypeface(r4, r0)
            yj r4 = r3.d
            com.comviva.webaxn.utils.u r4 = r4.p
            boolean r4 = r4.j()
            if (r4 == 0) goto L70
            yj r4 = r3.d
            com.comviva.webaxn.utils.u r4 = r4.p
            int r4 = r4.c()
            int r4 = com.comviva.webaxn.ui.n1.d(r4)
            r6.setTextColor(r4)
            yj r4 = r3.d
            com.comviva.webaxn.utils.u r4 = r4.p
            int r4 = r4.b()
            int r4 = com.comviva.webaxn.ui.n1.d(r4)
            r6.setBackgroundColor(r4)
        L70:
            yj r4 = r3.d
            com.comviva.webaxn.utils.u r4 = r4.p
            float r4 = r4.f()
            r6.setTextSize(r4)
            int r4 = r6.getPaddingLeft()
            int r0 = r3.c
            int r1 = r6.getPaddingRight()
            int r2 = r3.c
            r6.setPadding(r4, r0, r1, r2)
            yj r4 = r3.d
            int r4 = r4.K0
            r0 = 2
            r1 = 21
            if (r4 != r0) goto L99
            r4 = 17
        L95:
            r6.setGravity(r4)
            goto La4
        L99:
            boolean r4 = r3.j
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
            yj r4 = r3.d
            com.comviva.webaxn.utils.u r4 = r4.p
            float r4 = r4.d()
            r6.setLetterSpacing(r4)
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.j.a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r7 = r5.e
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.LayoutInflater r7 = (android.view.LayoutInflater) r7
            r0 = 0
            r1 = 2131492908(0x7f0c002c, float:1.8609281E38)
            android.view.View r7 = r7.inflate(r1, r8, r0)
            r8 = 2131296363(0x7f09006b, float:1.821064E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.util.ArrayList<java.lang.String> r1 = r5.f
            int r1 = r1.size()
            if (r6 >= r1) goto L2c
            java.util.ArrayList<java.lang.String> r1 = r5.f
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            goto L2d
        L2c:
            r6 = 0
        L2d:
            if (r6 == 0) goto L32
            r8.setText(r6)
        L32:
            yj r6 = r5.d
            com.comviva.webaxn.utils.u r6 = r6.p
            android.graphics.Typeface r6 = r6.h()
            yj r1 = r5.d
            com.comviva.webaxn.utils.u r1 = r1.p
            int r1 = r1.g()
            int r1 = com.comviva.webaxn.ui.n1.e(r1)
            r8.setTypeface(r6, r1)
            yj r6 = r5.d
            com.comviva.webaxn.utils.u r6 = r6.p
            int r6 = r6.c()
            int r6 = com.comviva.webaxn.ui.n1.d(r6)
            r8.setTextColor(r6)
            yj r6 = r5.d
            com.comviva.webaxn.utils.u r6 = r6.p
            float r6 = r6.f()
            r8.setTextSize(r6)
            yj r6 = r5.d
            int r1 = r5.i
            int r6 = r6.e(r1)
            yj r1 = r5.d
            int r2 = r5.i
            int r1 = r1.j(r2)
            yj r2 = r5.d
            int r3 = r5.i
            int r2 = r2.h(r3)
            yj r3 = r5.d
            int r4 = r5.i
            int r3 = r3.b(r4)
            r8.setPadding(r6, r1, r2, r3)
            yj r6 = r5.d
            int r6 = r6.K0
            r1 = 2
            r2 = 21
            if (r6 != r1) goto L95
            r6 = 17
        L91:
            r8.setGravity(r6)
            goto La0
        L95:
            boolean r6 = r5.j
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
            yj r6 = r5.d
            com.comviva.webaxn.utils.u r6 = r6.p
            float r6 = r6.d()
            r8.setLetterSpacing(r6)
        Lb2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.j.b(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new b(this, null);
        }
        return this.h;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public String getItem(int i) {
        return this.f.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return b(i, view, viewGroup);
    }
}
