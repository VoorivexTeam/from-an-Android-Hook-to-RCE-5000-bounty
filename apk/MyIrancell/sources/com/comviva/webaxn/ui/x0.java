package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.comviva.webaxn.ui.w0;
import com.comviva.webaxn.utils.x1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mtni.myirancell.R;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x0 extends n1 implements w0.c {
    private static int G = 240;
    private static int H = 240;
    private ProgressBar A;
    private EditText B;
    private yj C;
    private Context D;
    private ArrayList<ListItemData> E;
    private ListItemData F;
    private RelativeLayout x;
    private RecyclerView y;
    private w0 z;

    /* loaded from: classes.dex */
    class a implements View.OnFocusChangeListener {
        final /* synthetic */ o1 b;

        /* renamed from: com.comviva.webaxn.ui.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0036a implements Runnable {
            RunnableC0036a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.s().setRenderingInstance(a.this.b);
                if (x0.this.C.c) {
                    x1.a(x0.this.D, x0.this.C, x0.this.B);
                }
            }
        }

        a(o1 o1Var) {
            this.b = o1Var;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                x0 x0Var = x0.this;
                x0Var.g.a(x0Var.C);
                x0.this.B.post(new RunnableC0036a());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            x0.this.z.getFilter().filter(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnTouchListener {
        c(x0 x0Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class d extends AsyncTask<String, Void, ArrayList<ListItemData>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends TypeToken<List<ListItemData>> {
            a(d dVar) {
            }
        }

        private d() {
        }

        /* synthetic */ d(x0 x0Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<ListItemData> doInBackground(String... strArr) {
            try {
                HttpURLConnection a2 = com.comviva.webaxn.transport.a.a(strArr[0], com.comviva.webaxn.utils.j1.a(x0.this.D).e0());
                a2.setRequestMethod("GET");
                a2.addRequestProperty("User-Agent", "2.3.0.11583/" + com.comviva.webaxn.utils.j1.a(x0.this.D).V());
                if (a2.getResponseCode() == 200) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(a2.getInputStream());
                        String a3 = x1.a(bufferedInputStream);
                        bufferedInputStream.close();
                        if (!TextUtils.isEmpty(a3)) {
                            List list = (List) new Gson().fromJson(new JSONObject(a3).getJSONArray("list").toString(), new a(this).getType());
                            x0.this.E.clear();
                            x0.this.E.addAll(list);
                        }
                        a2.disconnect();
                    } catch (Throwable th) {
                        a2.disconnect();
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return x0.this.E;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<ListItemData> arrayList) {
            if (x0.this.A != null) {
                x0.this.A.setVisibility(8);
            }
            x0.this.z.c();
        }
    }

    public x0(Context context, yj yjVar, j0 j0Var, o1 o1Var) {
        super(context);
        this.E = new ArrayList<>();
        a aVar = null;
        this.F = null;
        this.D = context;
        this.C = yjVar;
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        if (!TextUtils.isEmpty(this.C.k)) {
            new d(this, aVar).execute(this.C.k);
        }
        this.x = (RelativeLayout) ((LayoutInflater) this.D.getSystemService("layout_inflater")).inflate(R.layout.main_list, (ViewGroup) null);
        if (!TextUtils.isEmpty(this.C.r1)) {
            this.x.setContentDescription(this.C.r1);
        }
        vj vjVar = this.C.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        this.y = (RecyclerView) this.x.findViewById(R.id.recycler_view);
        this.B = (EditText) this.x.findViewById(R.id.inputSearch);
        this.A = (ProgressBar) this.x.findViewById(R.id.listprogress);
        this.z = new w0(this.D, this.C, this.E, this.m, this);
        this.y.setLayoutManager(new LinearLayoutManager(this.D));
        this.y.setAdapter(this.z);
        this.B.setOnFocusChangeListener(new a(o1Var));
        this.B.addTextChangedListener(new b());
        this.y.setOnTouchListener(new c(this));
        this.B.setGravity(x1.a("L", "M", this.m));
        b(com.comviva.webaxn.utils.b.a(this.D).a().i());
        o();
    }

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        this.k = G;
        this.l = H;
        int i = layoutParams.width;
        if (i > 0) {
            this.l = i;
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.k = i2;
        }
        this.x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        return this.k;
    }

    public void a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.B.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.w0.c
    public void a(ListItemData listItemData) {
        this.F = listItemData;
        if (!TextUtils.isEmpty(this.C.u1)) {
            a(this.C.u1);
        }
        this.g.b(this);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.C.r0) ? this.D.getResources().getIdentifier(this.C.r0, "drawable", this.D.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.D).a(this.C.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.D.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.D).a(this.C.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.x.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.D).a(this.C.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.D).a(this.C.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.x.setBackgroundDrawable(this.e);
                return;
            }
            int d2 = n1.d(this.C.p.b());
            this.d = d2;
            yj yjVar = this.C;
            ej ejVar = yjVar.O0;
            if (ejVar != null) {
                Drawable a4 = x1.a(ejVar, d2);
                this.e = a4;
                this.x.setBackgroundDrawable(a4);
            } else if (yjVar.p.j()) {
                this.x.setBackgroundColor(this.d);
            } else {
                this.e = this.x.getBackground();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.x);
    }

    public void b(float f) {
        this.B.setTextSize(f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = G;
        }
        this.l = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = H;
        }
        this.k = i2;
        this.x.getLayoutParams().width = this.l;
        this.x.getLayoutParams().height = this.k;
    }

    public void b(String str) {
        EditText editText;
        int i;
        if (str.equals("en")) {
            editText = this.B;
            i = R.string.search_en;
        } else if (str.equals("fa")) {
            editText = this.B;
            i = R.string.search_fa;
        } else {
            if (!str.equals("fr")) {
                return;
            }
            editText = this.B;
            i = R.string.search_fr;
        }
        editText.setHint(i);
    }

    public void b(yj yjVar) {
        this.C = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.C;
    }

    public void g(int i) {
        this.B.setTextColor(n1.d(i));
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.x;
    }

    public void h(int i) {
        this.B.setTypeface(this.C.p.h(), n1.e(i));
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    public void i(int i) {
        this.B.setHintTextColor(n1.d(i));
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public String m() {
        ListItemData listItemData = this.F;
        return listItemData != null ? listItemData.b() : "";
    }

    public void n() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.x);
            this.b.invalidate();
        }
    }

    public void o() {
        EditText editText;
        Drawable drawable;
        EditText editText2;
        Drawable drawable2;
        if (this.m) {
            if (Build.VERSION.SDK_INT >= 21) {
                editText2 = this.B;
                drawable2 = this.D.getDrawable(R.drawable.search);
            } else {
                editText2 = this.B;
                drawable2 = this.D.getResources().getDrawable(R.drawable.search);
            }
            editText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            editText = this.B;
            drawable = this.D.getDrawable(R.drawable.search);
        } else {
            editText = this.B;
            drawable = this.D.getResources().getDrawable(R.drawable.search);
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
