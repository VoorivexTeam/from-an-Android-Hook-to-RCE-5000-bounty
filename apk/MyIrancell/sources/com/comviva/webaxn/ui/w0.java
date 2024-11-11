package com.comviva.webaxn.ui;

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
import com.mtni.myirancell.R;
import defpackage.dh;
import defpackage.ih;
import defpackage.yj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class w0 extends RecyclerView.g<b> implements Filterable {
    private Context d;
    private List<ListItemData> e;
    private List<ListItemData> f;
    private c g;
    private yj h;
    private boolean i = false;
    private int j = -1;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            List arrayList;
            w0 w0Var;
            String lowerCase = charSequence.toString().toLowerCase();
            if (lowerCase.isEmpty()) {
                w0Var = w0.this;
                arrayList = w0Var.e;
            } else {
                arrayList = new ArrayList();
                for (ListItemData listItemData : w0.this.e) {
                    if ((!TextUtils.isEmpty(listItemData.c()) && listItemData.c().toLowerCase().contains(lowerCase)) || ((!TextUtils.isEmpty(listItemData.d()) && listItemData.d().toLowerCase().contains(lowerCase)) || (!TextUtils.isEmpty(listItemData.e()) && listItemData.e().toLowerCase().contains(lowerCase)))) {
                        arrayList.add(listItemData);
                    }
                }
                w0Var = w0.this;
            }
            w0Var.f = arrayList;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = w0.this.f;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            w0.this.f = (ArrayList) filterResults.values;
            w0.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.c0 {
        public TextView t;
        public TextView u;
        public TextView v;
        public ImageView w;

        /* loaded from: classes.dex */
        class a implements View.OnClickListener {
            a(w0 w0Var) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                w0.this.g.a((ListItemData) w0.this.f.get(b.this.f()));
            }
        }

        public b(View view) {
            super(view);
            this.t = (TextView) view.findViewById(R.id.text1);
            this.u = (TextView) view.findViewById(R.id.text2);
            this.v = (TextView) view.findViewById(R.id.text3);
            this.w = (ImageView) view.findViewById(R.id.thumbnail);
            view.setOnClickListener(new a(w0.this));
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(ListItemData listItemData);
    }

    public w0(Context context, yj yjVar, List<ListItemData> list, boolean z, c cVar) {
        this.k = false;
        this.d = context;
        this.g = cVar;
        this.e = list;
        this.f = list;
        this.h = yjVar;
        this.k = z;
    }

    private void a(ImageView imageView, String str) {
        imageView.setVisibility(0);
        com.bumptech.glide.c.e(this.d).a(str).a((dh<?>) ih.K()).a(imageView);
    }

    private void a(TextView textView, String str) {
        textView.setVisibility(0);
        textView.setText(str);
        textView.setTextColor(n1.d(this.h.p.c()));
        textView.setTextSize(this.h.p.f());
        textView.setTypeface(this.h.p.h(), n1.e(this.h.p.g()));
    }

    private void a(b bVar, ListItemData listItemData) {
        TextView textView;
        String c2;
        TextView textView2;
        String c3;
        int i = this.h.K0;
        if (i == 0) {
            textView = bVar.t;
            c2 = listItemData.c();
        } else if (i == 1) {
            a(bVar.t, listItemData.c());
            textView = bVar.u;
            c2 = listItemData.d();
        } else {
            if (i != 2) {
                if (i == 3) {
                    textView2 = bVar.t;
                    c3 = listItemData.c();
                } else if (i == 4) {
                    a(bVar.t, listItemData.c());
                    textView2 = bVar.u;
                    c3 = listItemData.d();
                } else {
                    if (i != 5) {
                        return;
                    }
                    a(bVar.t, listItemData.c());
                    a(bVar.u, listItemData.d());
                    textView2 = bVar.v;
                    c3 = listItemData.e();
                }
                a(textView2, c3);
                a(bVar.w, listItemData.a());
                return;
            }
            a(bVar.t, listItemData.c());
            a(bVar.u, listItemData.d());
            textView = bVar.v;
            c2 = listItemData.e();
        }
        a(textView, c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(b bVar, int i) {
        a(bVar, this.f.get(i));
        if (!this.i) {
            this.i = true;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            bVar.a.measure(makeMeasureSpec, makeMeasureSpec);
            this.j = bVar.a.getMeasuredHeight();
        }
        if (this.j != -1) {
            bVar.a.getLayoutParams().height = this.j;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        if (this.k) {
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
