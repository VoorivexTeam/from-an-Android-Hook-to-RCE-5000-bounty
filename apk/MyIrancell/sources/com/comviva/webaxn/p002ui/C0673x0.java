package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.p002ui.C0671w0;
import com.comviva.webaxn.transport.C0579a;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mtni.myirancell.R;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.x0 */
/* loaded from: classes.dex */
public class C0673x0 extends AbstractC0652n1 implements C0671w0.c {

    /* renamed from: G */
    private static int f4494G = 240;

    /* renamed from: H */
    private static int f4495H = 240;

    /* renamed from: A */
    private ProgressBar f4496A;

    /* renamed from: B */
    private EditText f4497B;

    /* renamed from: C */
    private C3489yj f4498C;

    /* renamed from: D */
    private Context f4499D;

    /* renamed from: E */
    private ArrayList<ListItemData> f4500E;

    /* renamed from: F */
    private ListItemData f4501F;

    /* renamed from: x */
    private RelativeLayout f4502x;

    /* renamed from: y */
    private RecyclerView f4503y;

    /* renamed from: z */
    private C0671w0 f4504z;

    /* renamed from: com.comviva.webaxn.ui.x0$a */
    /* loaded from: classes.dex */
    class a implements View.OnFocusChangeListener {

        /* renamed from: b */
        final /* synthetic */ C0655o1 f4505b;

        /* renamed from: com.comviva.webaxn.ui.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC3559a implements Runnable {
            RunnableC3559a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f4505b.m4825s().setRenderingInstance(a.this.f4505b);
                if (C0673x0.this.f4498C.f14202c) {
                    C0755x1.m6152a(C0673x0.this.f4499D, C0673x0.this.f4498C, C0673x0.this.f4497B);
                }
            }
        }

        a(C0655o1 c0655o1) {
            this.f4505b = c0655o1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                C0673x0 c0673x0 = C0673x0.this;
                c0673x0.f4049g.mo4843a(c0673x0.f4498C);
                C0673x0.this.f4497B.post(new RunnableC3559a());
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.x0$b */
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
            C0673x0.this.f4504z.getFilter().filter(charSequence);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.x0$c */
    /* loaded from: classes.dex */
    class c implements View.OnTouchListener {
        c(C0673x0 c0673x0) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.x0$d */
    /* loaded from: classes.dex */
    private class d extends AsyncTask<String, Void, ArrayList<ListItemData>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.comviva.webaxn.ui.x0$d$a */
        /* loaded from: classes.dex */
        public class a extends TypeToken<List<ListItemData>> {
            a(d dVar) {
            }
        }

        private d() {
        }

        /* synthetic */ d(C0673x0 c0673x0, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<ListItemData> doInBackground(String... strArr) {
            try {
                HttpURLConnection m3968a = C0579a.m3968a(strArr[0], C0713j1.m5563a(C0673x0.this.f4499D).m5658e0());
                m3968a.setRequestMethod("GET");
                m3968a.addRequestProperty("User-Agent", "2.3.0.11583/" + C0713j1.m5563a(C0673x0.this.f4499D).m5617V());
                if (m3968a.getResponseCode() == 200) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(m3968a.getInputStream());
                        String m6130a = C0755x1.m6130a(bufferedInputStream);
                        bufferedInputStream.close();
                        if (!TextUtils.isEmpty(m6130a)) {
                            List list = (List) new Gson().fromJson(new JSONObject(m6130a).getJSONArray("list").toString(), new a(this).getType());
                            C0673x0.this.f4500E.clear();
                            C0673x0.this.f4500E.addAll(list);
                        }
                        m3968a.disconnect();
                    } catch (Throwable th) {
                        m3968a.disconnect();
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C0673x0.this.f4500E;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<ListItemData> arrayList) {
            if (C0673x0.this.f4496A != null) {
                C0673x0.this.f4496A.setVisibility(8);
            }
            C0673x0.this.f4504z.m2412c();
        }
    }

    public C0673x0(Context context, C3489yj c3489yj, C0639j0 c0639j0, C0655o1 c0655o1) {
        super(context);
        this.f4500E = new ArrayList<>();
        a aVar = null;
        this.f4501F = null;
        this.f4499D = context;
        this.f4498C = c3489yj;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        if (!TextUtils.isEmpty(this.f4498C.f14226k)) {
            new d(this, aVar).execute(this.f4498C.f14226k);
        }
        this.f4502x = (RelativeLayout) ((LayoutInflater) this.f4499D.getSystemService("layout_inflater")).inflate(R.layout.main_list, (ViewGroup) null);
        if (!TextUtils.isEmpty(this.f4498C.f14249r1)) {
            this.f4502x.setContentDescription(this.f4498C.f14249r1);
        }
        C3361vj c3361vj = this.f4498C.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f4502x, c3361vj.m16034a());
        }
        this.f4503y = (RecyclerView) this.f4502x.findViewById(R.id.recycler_view);
        this.f4497B = (EditText) this.f4502x.findViewById(R.id.inputSearch);
        this.f4496A = (ProgressBar) this.f4502x.findViewById(R.id.listprogress);
        this.f4504z = new C0671w0(this.f4499D, this.f4498C, this.f4500E, this.f4055m, this);
        this.f4503y.setLayoutManager(new LinearLayoutManager(this.f4499D));
        this.f4503y.setAdapter(this.f4504z);
        this.f4497B.setOnFocusChangeListener(new a(c0655o1));
        this.f4497B.addTextChangedListener(new b());
        this.f4503y.setOnTouchListener(new c(this));
        this.f4497B.setGravity(C0755x1.m6116a("L", "M", this.f4055m));
        m5144b(C0687b.m5342a(this.f4499D).m5343a().m5557i());
        m5151o();
    }

    /* renamed from: a */
    public int m5140a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        this.f4053k = f4494G;
        this.f4054l = f4495H;
        int i = layoutParams.width;
        if (i > 0) {
            this.f4054l = i;
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.f4053k = i2;
        }
        this.f4502x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        return this.f4053k;
    }

    /* renamed from: a */
    public void m5141a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4497B.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4502x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4502x.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4502x.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4502x.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.C0671w0.c
    /* renamed from: a */
    public void mo5116a(ListItemData listItemData) {
        this.f4501F = listItemData;
        if (!TextUtils.isEmpty(this.f4498C.f14258u1)) {
            m4707a(this.f4498C.f14258u1);
        }
        this.f4049g.mo4849b(this);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m5142a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m5142a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f4498C.f14248r0) ? this.f4499D.getResources().getIdentifier(this.f4498C.f14248r0, "drawable", this.f4499D.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4499D).m5429a(this.f4498C.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4499D.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4499D).m5432a(this.f4498C.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f4502x.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4499D).m5429a(this.f4498C.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4499D).m5432a(this.f4498C.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f4502x.setBackgroundDrawable(this.f4047e);
                return;
            }
            int m4701d = AbstractC0652n1.m4701d(this.f4498C.f14241p.m6057b());
            this.f4046d = m4701d;
            C3489yj c3489yj = this.f4498C;
            C2434ej c2434ej = c3489yj.f14173O0;
            if (c2434ej != null) {
                Drawable m6122a = C0755x1.m6122a(c2434ej, m4701d);
                this.f4047e = m6122a;
                this.f4502x.setBackgroundDrawable(m6122a);
            } else if (c3489yj.f14241p.m6071j()) {
                this.f4502x.setBackgroundColor(this.f4046d);
            } else {
                this.f4047e = this.f4502x.getBackground();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f4502x);
    }

    /* renamed from: b */
    public void m5143b(float f) {
        this.f4497B.setTextSize(f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = f4494G;
        }
        this.f4054l = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = f4495H;
        }
        this.f4053k = i2;
        this.f4502x.getLayoutParams().width = this.f4054l;
        this.f4502x.getLayoutParams().height = this.f4053k;
    }

    /* renamed from: b */
    public void m5144b(String str) {
        EditText editText;
        int i;
        if (str.equals("en")) {
            editText = this.f4497B;
            i = R.string.search_en;
        } else if (str.equals("fa")) {
            editText = this.f4497B;
            i = R.string.search_fa;
        } else {
            if (!str.equals("fr")) {
                return;
            }
            editText = this.f4497B;
            i = R.string.search_fr;
        }
        editText.setHint(i);
    }

    /* renamed from: b */
    public void m5145b(C3489yj c3489yj) {
        this.f4498C = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4498C;
    }

    /* renamed from: g */
    public void m5146g(int i) {
        this.f4497B.setTextColor(AbstractC0652n1.m4701d(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4502x;
    }

    /* renamed from: h */
    public void m5147h(int i) {
        this.f4497B.setTypeface(this.f4498C.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    /* renamed from: i */
    public void m5148i(int i) {
        this.f4497B.setHintTextColor(AbstractC0652n1.m4701d(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    /* renamed from: m */
    public String m5149m() {
        ListItemData listItemData = this.f4501F;
        return listItemData != null ? listItemData.m4022b() : "";
    }

    /* renamed from: n */
    public void m5150n() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f4502x);
            this.f4044b.invalidate();
        }
    }

    /* renamed from: o */
    public void m5151o() {
        EditText editText;
        Drawable drawable;
        EditText editText2;
        Drawable drawable2;
        if (this.f4055m) {
            if (Build.VERSION.SDK_INT >= 21) {
                editText2 = this.f4497B;
                drawable2 = this.f4499D.getDrawable(R.drawable.search);
            } else {
                editText2 = this.f4497B;
                drawable2 = this.f4499D.getResources().getDrawable(R.drawable.search);
            }
            editText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            editText = this.f4497B;
            drawable = this.f4499D.getDrawable(R.drawable.search);
        } else {
            editText = this.f4497B;
            drawable = this.f4499D.getResources().getDrawable(R.drawable.search);
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
