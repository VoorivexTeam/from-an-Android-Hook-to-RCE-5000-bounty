package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.mtni.myirancell.R;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2389dh;
import p000.C2595ih;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.w0 */
/* loaded from: classes.dex */
public class C0671w0 extends RecyclerView.AbstractC0334g<b> implements Filterable {

    /* renamed from: d */
    private Context f4462d;

    /* renamed from: e */
    private List<ListItemData> f4463e;

    /* renamed from: f */
    private List<ListItemData> f4464f;

    /* renamed from: g */
    private c f4465g;

    /* renamed from: h */
    private C3489yj f4466h;

    /* renamed from: i */
    private boolean f4467i = false;

    /* renamed from: j */
    private int f4468j = -1;

    /* renamed from: k */
    private boolean f4469k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w0$a */
    /* loaded from: classes.dex */
    public class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            List arrayList;
            C0671w0 c0671w0;
            String lowerCase = charSequence.toString().toLowerCase();
            if (lowerCase.isEmpty()) {
                c0671w0 = C0671w0.this;
                arrayList = c0671w0.f4463e;
            } else {
                arrayList = new ArrayList();
                for (ListItemData listItemData : C0671w0.this.f4463e) {
                    if ((!TextUtils.isEmpty(listItemData.m4023c()) && listItemData.m4023c().toLowerCase().contains(lowerCase)) || ((!TextUtils.isEmpty(listItemData.m4024d()) && listItemData.m4024d().toLowerCase().contains(lowerCase)) || (!TextUtils.isEmpty(listItemData.m4025e()) && listItemData.m4025e().toLowerCase().contains(lowerCase)))) {
                        arrayList.add(listItemData);
                    }
                }
                c0671w0 = C0671w0.this;
            }
            c0671w0.f4464f = arrayList;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = C0671w0.this.f4464f;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C0671w0.this.f4464f = (ArrayList) filterResults.values;
            C0671w0.this.m2412c();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.AbstractC0330c0 {

        /* renamed from: t */
        public TextView f4471t;

        /* renamed from: u */
        public TextView f4472u;

        /* renamed from: v */
        public TextView f4473v;

        /* renamed from: w */
        public ImageView f4474w;

        /* renamed from: com.comviva.webaxn.ui.w0$b$a */
        /* loaded from: classes.dex */
        class a implements View.OnClickListener {
            a(C0671w0 c0671w0) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0671w0.this.f4465g.mo5116a((ListItemData) C0671w0.this.f4464f.get(b.this.m2352f()));
            }
        }

        public b(View view) {
            super(view);
            this.f4471t = (TextView) view.findViewById(R.id.text1);
            this.f4472u = (TextView) view.findViewById(R.id.text2);
            this.f4473v = (TextView) view.findViewById(R.id.text3);
            this.f4474w = (ImageView) view.findViewById(R.id.thumbnail);
            view.setOnClickListener(new a(C0671w0.this));
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo5116a(ListItemData listItemData);
    }

    public C0671w0(Context context, C3489yj c3489yj, List<ListItemData> list, boolean z, c cVar) {
        this.f4469k = false;
        this.f4462d = context;
        this.f4465g = cVar;
        this.f4463e = list;
        this.f4464f = list;
        this.f4466h = c3489yj;
        this.f4469k = z;
    }

    /* renamed from: a */
    private void m5110a(ImageView imageView, String str) {
        imageView.setVisibility(0);
        ComponentCallbacks2C0558c.m3869e(this.f4462d).m3930a(str).mo3921a((AbstractC2389dh<?>) C2595ih.m12454K()).m3927a(imageView);
    }

    /* renamed from: a */
    private void m5111a(TextView textView, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        textView.setTextColor(AbstractC0652n1.m4701d(this.f4466h.f14241p.m6062c()));
        textView.setTextSize(this.f4466h.f14241p.m6067f());
        textView.setTypeface(this.f4466h.f14241p.m6069h(), AbstractC0652n1.m4702e(this.f4466h.f14241p.m6068g()));
    }

    /* renamed from: a */
    private void m5112a(b bVar, ListItemData listItemData) {
        TextView textView;
        String m4023c;
        TextView textView2;
        String m4023c2;
        int i = this.f4466h.f14165K0;
        if (i == 0) {
            textView = bVar.f4471t;
            m4023c = listItemData.m4023c();
        } else if (i == 1) {
            m5111a(bVar.f4471t, listItemData.m4023c());
            textView = bVar.f4472u;
            m4023c = listItemData.m4024d();
        } else {
            if (i != 2) {
                if (i == 3) {
                    textView2 = bVar.f4471t;
                    m4023c2 = listItemData.m4023c();
                } else if (i == 4) {
                    m5111a(bVar.f4471t, listItemData.m4023c());
                    textView2 = bVar.f4472u;
                    m4023c2 = listItemData.m4024d();
                } else {
                    if (i != 5) {
                        return;
                    }
                    m5111a(bVar.f4471t, listItemData.m4023c());
                    m5111a(bVar.f4472u, listItemData.m4024d());
                    textView2 = bVar.f4473v;
                    m4023c2 = listItemData.m4025e();
                }
                m5111a(textView2, m4023c2);
                m5110a(bVar.f4474w, listItemData.m4021a());
                return;
            }
            m5111a(bVar.f4471t, listItemData.m4023c());
            m5111a(bVar.f4472u, listItemData.m4024d());
            textView = bVar.f4473v;
            m4023c = listItemData.m4025e();
        }
        m5111a(textView, m4023c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0334g
    /* renamed from: a */
    public int mo2397a() {
        return this.f4464f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0334g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo2408b(b bVar, int i) {
        m5112a(bVar, this.f4464f.get(i));
        if (!this.f4467i) {
            this.f4467i = true;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            bVar.f2076a.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4468j = bVar.f2076a.getMeasuredHeight();
        }
        if (this.f4468j != -1) {
            bVar.f2076a.getLayoutParams().height = this.f4468j;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0334g
    /* renamed from: b, reason: avoid collision after fix types in other method */
    public b mo2406b(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        if (this.f4469k) {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.list_item_template_rtl;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.list_item_template;
        }
        return new b(from.inflate(i2, viewGroup, false));
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new a();
    }
}
