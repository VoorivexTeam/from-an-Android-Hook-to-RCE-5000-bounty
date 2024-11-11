package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0722m1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import com.google.android.material.textfield.TextInputLayout;
import com.mtni.myirancell.R;
import java.util.Vector;
import p000.C0023aj;
import p000.C0482bj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C2475fj;
import p000.C2515gj;
import p000.C2597ij;
import p000.C3264tj;
import p000.C3308uj;
import p000.C3489yj;
import p000.C3530zi;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.w */
/* loaded from: classes.dex */
public class C0670w extends AbstractC0652n1 {

    /* renamed from: f0 */
    static int f4409f0 = 1001;

    /* renamed from: A */
    private CustomEditText f4410A;

    /* renamed from: B */
    private TextInputLayout f4411B;

    /* renamed from: C */
    private LinearLayout f4412C;

    /* renamed from: D */
    private FrameLayout f4413D;

    /* renamed from: E */
    public C3531zj f4414E;

    /* renamed from: F */
    public C0655o1 f4415F;

    /* renamed from: G */
    private C3264tj f4416G;

    /* renamed from: H */
    private String f4417H;

    /* renamed from: I */
    private String f4418I;

    /* renamed from: J */
    private C3489yj f4419J;

    /* renamed from: K */
    private boolean f4420K;

    /* renamed from: L */
    private Dialog f4421L;

    /* renamed from: M */
    public boolean f4422M;

    /* renamed from: N */
    public int f4423N;

    /* renamed from: O */
    private Cursor f4424O;

    /* renamed from: P */
    private CharSequence f4425P;

    /* renamed from: Q */
    private int f4426Q;

    /* renamed from: R */
    private boolean f4427R;

    /* renamed from: S */
    private boolean f4428S;

    /* renamed from: T */
    private int f4429T;

    /* renamed from: U */
    private int f4430U;

    /* renamed from: V */
    private boolean f4431V;

    /* renamed from: W */
    private String f4432W;

    /* renamed from: X */
    private boolean f4433X;

    /* renamed from: Y */
    private boolean[] f4434Y;

    /* renamed from: Z */
    private Drawable f4435Z;

    /* renamed from: a0 */
    private boolean f4436a0;

    /* renamed from: b0 */
    private String f4437b0;

    /* renamed from: c0 */
    private int f4438c0;

    /* renamed from: d0 */
    private View.OnFocusChangeListener f4439d0;

    /* renamed from: e0 */
    private TextWatcher f4440e0;

    /* renamed from: x */
    private ImageView f4441x;

    /* renamed from: y */
    private ImageView f4442y;

    /* renamed from: z */
    private ImageView f4443z;

    /* renamed from: com.comviva.webaxn.ui.w$a */
    /* loaded from: classes.dex */
    class a implements View.OnFocusChangeListener {

        /* renamed from: com.comviva.webaxn.ui.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC3558a implements Runnable {
            RunnableC3558a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0670w.this.f4415F.m4825s().setRenderingInstance(C0670w.this.f4415F);
                if (C0670w.this.f4419J.f14202c) {
                    C0670w c0670w = C0670w.this;
                    C0755x1.m6152a(c0670w.f4045c, c0670w.f4419J, C0670w.this.f4410A);
                }
            }
        }

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        
            if (r2 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
        
            r9.f4444b.m5053b(r2);
            r9.f4444b.f4410A.setTextColor(r9.f4444b.f4419J.f14228k1.m12472e());
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            if (r2 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x021f, code lost:
        
            if (r9.f4444b.f4419J.f14231l1.m11788i() == false) goto L68;
         */
        @Override // android.view.View.OnFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFocusChange(android.view.View r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 693
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.a.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ byte[] f4446b;

        b(byte[] bArr) {
            this.f4446b = bArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f7 A[Catch: Exception -> 0x0121, OutOfMemoryError -> 0x0126, TryCatch #4 {Exception -> 0x0121, OutOfMemoryError -> 0x0126, blocks: (B:24:0x00b9, B:26:0x00cf, B:28:0x00da, B:29:0x00ed, B:31:0x00f7, B:32:0x0113, B:50:0x010a), top: B:23:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x010a A[Catch: Exception -> 0x0121, OutOfMemoryError -> 0x0126, TryCatch #4 {Exception -> 0x0121, OutOfMemoryError -> 0x0126, blocks: (B:24:0x00b9, B:26:0x00cf, B:28:0x00da, B:29:0x00ed, B:31:0x00f7, B:32:0x0113, B:50:0x010a), top: B:23:0x00b9 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.b.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w$c */
    /* loaded from: classes.dex */
    public class c extends CursorAdapter {
        c(Context context, Cursor cursor) {
            super(context, cursor);
        }

        @Override // android.widget.CursorAdapter
        public void bindView(View view, Context context, Cursor cursor) {
            TextView textView = (TextView) view.findViewById(R.id.name);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setScaleType(C0670w.this.f4419J.f14204c1 == -1 ? ImageView.ScaleType.FIT_XY : C0755x1.m6165b(C0670w.this.f4419J.f14204c1));
            TextView textView2 = (TextView) view.findViewById(R.id.notation);
            String string = cursor.getString(cursor.getColumnIndex("name"));
            if (string != null) {
                string = string.trim();
            }
            textView.setText(string);
            String string2 = cursor.getString(cursor.getColumnIndex("Notation"));
            if (string2 != null) {
                string2 = string2.trim();
            }
            view.setTag(string2);
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_data"));
            if (blob == null) {
                textView2.setText(string2);
                textView2.setVisibility(0);
                imageView.setVisibility(8);
            } else {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blob, 0, blob.length);
                imageView.setImageDrawable(NinePatch.isNinePatchChunk(decodeByteArray.getNinePatchChunk()) ? new NinePatchDrawable(decodeByteArray, decodeByteArray.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(decodeByteArray));
                imageView.setVisibility(0);
                textView2.setVisibility(8);
            }
        }

        @Override // android.widget.CursorAdapter
        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_row_item, viewGroup, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w$d */
    /* loaded from: classes.dex */
    public class d implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f4449b;

        d(WebAxnActivity webAxnActivity) {
            this.f4449b = webAxnActivity;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            String str2 = (String) view.getTag();
            String str3 = C0670w.this.m5097m().toString();
            int i2 = 0;
            if (str3 == null || str3.length() <= 0) {
                str = str2;
            } else {
                C0670w.this.f4410A.getSelectionStart();
                int selectionEnd = C0670w.this.f4410A.getSelectionEnd();
                String substring = str3.substring(selectionEnd, str3.length());
                str = str3.substring(0, selectionEnd) + str2 + substring;
                i2 = selectionEnd;
            }
            C0670w.this.f4425P = str;
            C0670w.this.f4410A.setText(C0670w.this.m5082b(str));
            C0670w.this.f4410A.setSelection(i2 + str2.length());
            if (C0670w.this.f4421L != null) {
                C0670w.this.f4421L.dismiss();
            }
            C0670w.this.f4424O.close();
            C0023aj.m160a(this.f4449b).close();
            C0670w.this.f4424O = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w$e */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f4451b;

        e(WebAxnActivity webAxnActivity) {
            this.f4451b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (C0670w.this.f4421L != null) {
                C0670w.this.f4421L.dismiss();
            }
            C0670w.this.f4424O.close();
            C0023aj.m160a(this.f4451b).close();
            C0670w.this.f4424O = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0670w.this.f4410A.requestFocus();
            C0670w.this.f4410A.setSelection(C0670w.this.f4410A.getText().length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.w$g */
    /* loaded from: classes.dex */
    public class g implements ActionMode.Callback {
        g(C0670w c0670w) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            menu.clear();
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$h */
    /* loaded from: classes.dex */
    static /* synthetic */ class h {

        /* renamed from: a */
        static final /* synthetic */ int[] f4454a;

        static {
            int[] iArr = new int[C3489yj.a.values().length];
            f4454a = iArr;
            try {
                iArr[C3489yj.a.FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4454a[C3489yj.a.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$i */
    /* loaded from: classes.dex */
    class i implements TextWatcher {
        i() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x0238, code lost:
        
            if (java.lang.Float.parseFloat(r7.f4455b.f4432W) == java.lang.Float.parseFloat(r7.f4455b.m5097m())) goto L68;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void afterTextChanged(android.text.Editable r8) {
            /*
                Method dump skipped, instructions count: 684
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.i.afterTextChanged(android.text.Editable):void");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length;
            if (C0670w.this.m5097m().length() == C0670w.this.f4419J.f14180S) {
                C0670w c0670w = C0670w.this;
                c0670w.f4425P = c0670w.m5097m();
            }
            if (TextUtils.isEmpty(C0670w.this.f4419J.f14181S0)) {
                return;
            }
            if (C0670w.this.f4419J.f14165K0 == 2) {
                C0670w c0670w2 = C0670w.this;
                c0670w2.f4426Q = c0670w2.f4419J.f14180S - C0670w.this.m5097m().length();
                if (C0670w.this.f4426Q < 0) {
                    return;
                } else {
                    length = C0670w.this.f4426Q;
                }
            } else if (C0670w.this.f4419J.f14165K0 != 3 || C0670w.this.m5097m().length() >= C0670w.this.f4419J.f14180S) {
                return;
            } else {
                length = C0670w.this.m5097m().length();
            }
            C0755x1.m6154a(String.valueOf(length), C0670w.this.f4419J.f14181S0, C0670w.this.f4414E);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$j */
    /* loaded from: classes.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0670w c0670w = C0670w.this;
            c0670w.m5073a(c0670w.f4419J.f14178R, true);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$k */
    /* loaded from: classes.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0722m1.m5887a(C0670w.this.f4045c, new String[]{"android.permission.READ_CONTACTS"})) {
                C0670w c0670w = C0670w.this;
                C0731p1.m5949a(c0670w.f4045c, c0670w.f4410A.getId());
                return;
            }
            if (C0713j1.m5563a(C0670w.this.f4045c).m5647d("android.permission.READ_CONTACTS") == -1) {
                C0722m1.m5885a((Activity) C0670w.this.f4045c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            } else {
                if (!C0722m1.m5886a(C0670w.this.f4045c, "android.permission.READ_CONTACTS")) {
                    C0755x1.m6181d(C0670w.this.f4045c, "msg.rpCon");
                    return;
                }
                C0722m1.m5885a((Activity) C0670w.this.f4045c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            }
            C0755x1.f5264v = true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$l */
    /* loaded from: classes.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0670w.this.f4421L != null && C0670w.this.f4421L.isShowing()) {
                C0670w.this.f4421L.dismiss();
                C0670w.this.f4421L = null;
            }
            C0670w.this.m5076a(view);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$m */
    /* loaded from: classes.dex */
    class m implements View.OnTouchListener {
        m(C0670w c0670w) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$n */
    /* loaded from: classes.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0670w.this.f4410A.addTextChangedListener(C0670w.this.f4440e0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$o */
    /* loaded from: classes.dex */
    class o implements TextView.OnEditorActionListener {
        o() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            C0670w c0670w;
            C0755x1.p pVar;
            AbstractC0652n1 abstractC0652n1;
            C0662s m4598m;
            String str;
            if (i != 6) {
                if (i != 5 || (pVar = (c0670w = C0670w.this).f4049g) == null) {
                    return false;
                }
                return pVar.mo4848a(c0670w.f4419J, C0670w.this.f4419J.f14265y, (String) null);
            }
            if (TextUtils.isEmpty(C0670w.this.f4419J.f14181S0) || C0670w.this.f4419J.f14165K0 != 8) {
                return false;
            }
            C0670w c0670w2 = C0670w.this;
            C3489yj m16930a = c0670w2.f4414E.m16930a(c0670w2.f4419J.f14181S0, (Vector<C3489yj>) null);
            if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null || !(abstractC0652n1 instanceof C0642k0)) {
                return false;
            }
            C0642k0 c0642k0 = (C0642k0) abstractC0652n1;
            if (c0642k0.m4598m() == null) {
                return false;
            }
            try {
                if (TextUtils.isEmpty(C0670w.this.m5097m())) {
                    m4598m = c0642k0.m4598m();
                    str = "";
                } else {
                    m4598m = c0642k0.m4598m();
                    str = C0670w.this.m5097m();
                }
                m4598m.m4946a(str);
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.w$p */
    /* loaded from: classes.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0670w c0670w = C0670w.this;
            c0670w.m5095i(c0670w.f4432W);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0200, code lost:
    
        if (r7 != null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0670w(android.content.Context r7, com.comviva.webaxn.p002ui.C0639j0 r8, com.comviva.webaxn.p002ui.C0655o1 r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.<init>(android.content.Context, com.comviva.webaxn.ui.j0, com.comviva.webaxn.ui.o1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5050a(String str, Drawable drawable) {
        TextInputLayout textInputLayout = this.f4411B;
        if (textInputLayout != null) {
            textInputLayout.setError(str);
        } else {
            this.f4410A.setError(str, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5053b(Drawable drawable) {
        if (this.f4411B == null && drawable != null) {
            this.f4410A.setBackgroundDrawable(drawable);
            if (m5101q()) {
                m5099o();
                return;
            }
            if (this.f4419J.f14152E) {
                CustomEditText customEditText = this.f4410A;
                C0657p0 c0657p0 = this.f4048f;
                customEditText.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
            } else {
                CustomEditText customEditText2 = this.f4410A;
                int i2 = this.f4423N;
                customEditText2.setPadding(i2, i2, i2, i2);
            }
        }
    }

    /* renamed from: x */
    private void m5068x() {
        this.f4410A.setCustomSelectionActionModeCallback(new g(this));
        this.f4410A.setLongClickable(false);
        this.f4410A.setTextIsSelectable(false);
    }

    /* renamed from: y */
    private void m5069y() {
        this.f4411B.setEnabled(true);
        int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
        int m16631a = this.f4419J.m16636b() ? this.f4419J.m16631a() : this.f4419J.f14241p.m6062c();
        int m6062c = this.f4419J.f14241p.m6062c();
        C2597ij c2597ij = this.f4419J.f14228k1;
        if (c2597ij != null && c2597ij.m12476h()) {
            m5664f0 = this.f4419J.f14228k1.m12468c();
        }
        C3489yj c3489yj = this.f4419J;
        int m12018c = (c3489yj.f14234m1 == null || !c3489yj.f14228k1.m12476h()) ? -65536 : this.f4419J.f14234m1.m12018c();
        this.f4411B.setHintAnimationEnabled(true);
        this.f4411B.setHintEnabled(true);
        this.f4411B.setDefaultHintTextColor(C0755x1.m6117a(android.R.attr.state_focused, m5664f0, -1, m16631a));
        this.f4411B.setBoxStrokeColor(m5664f0);
        this.f4411B.setErrorEnabled(true);
        this.f4411B.setErrorTextColor(ColorStateList.valueOf(m12018c));
        this.f4411B.setPasswordVisibilityToggleTintList(ColorStateList.valueOf(m6062c));
        this.f4411B.setPasswordVisibilityToggleEnabled(true);
        C0744u c0744u = this.f4419J.f14241p;
        if (c0744u != null) {
            this.f4411B.setTypeface(c0744u.m6069h());
        }
        C2434ej c2434ej = this.f4419J.f14173O0;
        if (c2434ej != null) {
            this.f4411B.m10397a(c2434ej.m11617b(), this.f4419J.f14173O0.m11621d(), this.f4419J.f14173O0.m11614a(), this.f4419J.f14173O0.m11619c());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001c. Please report as an issue. */
    /* renamed from: a */
    public int m5070a(int i2, boolean z, String str) {
        int i3;
        Vector<C3308uj> vector;
        CustomEditText customEditText;
        CustomEditText customEditText2;
        int i4;
        CustomEditText customEditText3;
        PasswordTransformationMethod passwordTransformationMethod;
        CustomEditText customEditText4;
        int i5;
        CustomEditText customEditText5;
        int i6;
        int i7 = 1;
        try {
            i3 = Integer.parseInt(str);
        } catch (Exception unused) {
            i3 = 1;
        }
        if (i2 == 5) {
            this.f4410A.setEnabled(false);
            this.f4410A.setFocusable(false);
            this.f4410A.setFocusableInTouchMode(false);
            i2 = i3;
        }
        switch (i2) {
            case 1:
                if (z) {
                    customEditText2 = this.f4410A;
                    i4 = 131073;
                    customEditText2.setInputType(i4);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                    this.f4410A.setTransformationMethod(null);
                    break;
                } else {
                    customEditText = this.f4410A;
                    customEditText.setInputType(i7);
                    this.f4410A.setTransformationMethod(null);
                }
            case 2:
                if (z) {
                    customEditText2 = this.f4410A;
                    i4 = 131074;
                    customEditText2.setInputType(i4);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                    this.f4410A.setTransformationMethod(null);
                    break;
                } else {
                    customEditText = this.f4410A;
                    i7 = 2;
                    customEditText.setInputType(i7);
                    this.f4410A.setTransformationMethod(null);
                }
            case 3:
                if (z) {
                    this.f4410A.setInputType(131201);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                } else {
                    this.f4410A.setInputType(129);
                }
                customEditText3 = this.f4410A;
                passwordTransformationMethod = new PasswordTransformationMethod();
                customEditText3.setTransformationMethod(passwordTransformationMethod);
                this.f4433X = true;
                break;
            case 4:
                if (!z) {
                    customEditText4 = this.f4410A;
                    i5 = 8194;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.f4410A;
                    i6 = 139266;
                    customEditText5.setInputType(i6);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                    break;
                }
            case 6:
                if (z) {
                    this.f4410A.setInputType(131202);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                } else {
                    this.f4410A.setInputType(130);
                }
                customEditText3 = this.f4410A;
                passwordTransformationMethod = new PasswordTransformationMethod();
                customEditText3.setTransformationMethod(passwordTransformationMethod);
                this.f4433X = true;
                break;
            case 7:
                if (!z) {
                    customEditText4 = this.f4410A;
                    i5 = 32;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.f4410A;
                    i6 = 131104;
                    customEditText5.setInputType(i6);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                    break;
                }
            case 8:
                if (!z) {
                    customEditText4 = this.f4410A;
                    i5 = 3;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.f4410A;
                    i6 = 131075;
                    customEditText5.setInputType(i6);
                    this.f4410A.setVerticalScrollBarEnabled(true);
                    break;
                }
        }
        if (this.f4433X && (vector = this.f4419J.f14237n1) != null) {
            this.f4434Y = new boolean[vector.size()];
        }
        return i2;
    }

    /* renamed from: a */
    public void m5071a(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4410A.setLetterSpacing(f2);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4314a(int i2) {
        if (this.f4411B != null) {
            return;
        }
        super.mo4314a(i2);
        C3489yj c3489yj = this.f4419J;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            Drawable m6122a = C0755x1.m6122a(c2434ej, AbstractC0652n1.m4701d(i2));
            this.f4047e = m6122a;
            this.f4410A.setBackgroundDrawable(m6122a);
        } else if (c3489yj.f14241p.m6071j()) {
            this.f4410A.setBackgroundColor(AbstractC0652n1.m4701d(i2));
        }
        this.f4047e = this.f4410A.getBackground();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r2.f4055m != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2.f4410A.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r4, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r2.f4410A.setCompoundDrawablesWithIntrinsicBounds(r4, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r2.f4055m != false) goto L18;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5072a(int r3, android.graphics.drawable.Drawable r4) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L24
            r0 = 2
            if (r3 == r0) goto L1e
            r0 = 3
            if (r3 == r0) goto L19
            r0 = 4
            if (r3 == r0) goto L13
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4410A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)
            goto L33
        L13:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4410A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r4)
            goto L33
        L19:
            boolean r3 = r2.f4055m
            if (r3 == 0) goto L28
            goto L2e
        L1e:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4410A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r4, r1, r1)
            goto L33
        L24:
            boolean r3 = r2.f4055m
            if (r3 == 0) goto L2e
        L28:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4410A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r4, r1)
            goto L33
        L2e:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4410A
            r3.setCompoundDrawablesWithIntrinsicBounds(r4, r1, r1, r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.m5072a(int, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r7.f4430U = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0033, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0041, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0051, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5073a(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.m5073a(int, boolean):void");
    }

    /* renamed from: a */
    public void m5074a(Drawable drawable) {
        this.f4410A.setBackgroundDrawable(drawable);
        if (m5101q()) {
            m5099o();
            return;
        }
        if (this.f4419J.f14152E) {
            CustomEditText customEditText = this.f4410A;
            C0657p0 c0657p0 = this.f4048f;
            customEditText.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        } else {
            CustomEditText customEditText2 = this.f4410A;
            int i2 = this.f4423N;
            customEditText2.setPadding(i2, i2, i2, i2);
        }
    }

    /* renamed from: a */
    public void m5075a(Spanned spanned) {
        this.f4410A.setText(spanned);
    }

    /* renamed from: a */
    public void m5076a(View view) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) this.f4045c;
        Cursor m206j = C0023aj.m160a(webAxnActivity).m206j();
        this.f4424O = m206j;
        if (m206j == null || webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setTitle("Insert smiley");
        ListView listView = new ListView(webAxnActivity);
        listView.setScrollingCacheEnabled(false);
        listView.setAdapter((ListAdapter) new c(webAxnActivity, this.f4424O));
        listView.setOnItemClickListener(new d(webAxnActivity));
        builder.setView(listView);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnCancelListener(new e(webAxnActivity));
        create.show();
        this.f4421L = create;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout = this.f4413D;
        if (frameLayout != null) {
            ((AbsoluteLayout.LayoutParams) frameLayout.getLayoutParams()).x = layoutParams.x;
            layoutParams2 = this.f4413D.getLayoutParams();
        } else {
            LinearLayout linearLayout = this.f4412C;
            if (linearLayout == null) {
                return;
            }
            ((AbsoluteLayout.LayoutParams) linearLayout.getLayoutParams()).x = layoutParams.x;
            layoutParams2 = this.f4412C.getLayoutParams();
        }
        ((AbsoluteLayout.LayoutParams) layoutParams2).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4048f = c0657p0;
        if (this.f4419J.f14152E) {
            this.f4410A.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4595a(C0755x1.p pVar) {
        this.f4049g = pVar;
        this.f4410A.m4016a(pVar, this.f4419J, this.f4414E);
    }

    /* renamed from: a */
    public void m5077a(String str, String str2) {
        this.f4410A.setGravity(C0755x1.m6116a(str, str2, this.f4055m));
    }

    /* renamed from: a */
    public void m5078a(C3264tj c3264tj) {
        this.f4416G = c3264tj;
        if (c3264tj == null || TextUtils.isEmpty(c3264tj.f13319f)) {
            return;
        }
        this.f4417H = this.f4416G.f13319f;
    }

    /* renamed from: a */
    public void m5079a(C3489yj.a aVar, String str) {
        Drawable drawable;
        if (this.f4411B != null) {
            return;
        }
        if (aVar != null) {
            drawable = C0755x1.m6121a(this.f4045c, this.f4419J, aVar);
            int i2 = h.f4454a[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && drawable != null) {
                    this.f4435Z = drawable;
                }
            }
            this.f4435Z = null;
        } else if (TextUtils.isEmpty(str)) {
            drawable = this.f4047e;
            C2475fj c2475fj = this.f4419J.f14231l1;
            if (c2475fj != null) {
                c2475fj.m11780c(false);
                this.f4435Z = null;
            }
        } else {
            drawable = C0755x1.m6163b(this.f4045c, str);
        }
        m5053b(drawable);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        C2475fj c2475fj;
        C2515gj c2515gj;
        if (this.f4411B != null) {
            return;
        }
        C2597ij c2597ij = c3489yj.f14228k1;
        if ((c2597ij == null || !c2597ij.m12477i()) && (((c2475fj = c3489yj.f14231l1) == null || !c2475fj.m11787h()) && ((c2515gj = c3489yj.f14234m1) == null || !c2515gj.m12028i()))) {
            m5081a(c3489yj.f14260v0);
            return;
        }
        C2597ij c2597ij2 = c3489yj.f14228k1;
        if (c2597ij2 != null && c2597ij2.m12477i()) {
            this.f4419J.f14228k1.m12462a(c3489yj.f14228k1.m12463a());
            c3489yj.f14228k1.m12467b(false);
            return;
        }
        C2475fj c2475fj2 = c3489yj.f14231l1;
        if (c2475fj2 != null && c2475fj2.m11787h()) {
            this.f4419J.f14231l1.m11772a(c3489yj.f14231l1.m11773a());
            c3489yj.f14231l1.m11777b(false);
            return;
        }
        C2515gj c2515gj2 = c3489yj.f14234m1;
        if (c2515gj2 == null || !c2515gj2.m12028i()) {
            return;
        }
        this.f4419J.f14234m1.m12012a(c3489yj.f14234m1.m12013a());
        c3489yj.f14234m1.m12017b(false);
    }

    /* renamed from: a */
    public void m5080a(boolean z) {
        this.f4410A.setCursorVisible(z);
    }

    /* renamed from: a */
    public void m5081a(byte[] bArr) {
        int i2 = this.f4419J.f14165K0;
        if (i2 != 10 && i2 != 11) {
            this.f4410A.post(new b(bArr));
        } else if (this.f4419J.f14202c) {
            m5091g((String) null);
        }
    }

    /* renamed from: b */
    public String m5082b(String str) {
        if (this.f4437b0 == null || this.f4438c0 <= 0 || TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        String replaceAll = str.replaceAll(this.f4437b0, "");
        if (this.f4419J.f14178R == 4 && replaceAll.contains(".")) {
            int indexOf = replaceAll.indexOf(".");
            str2 = replaceAll.substring(indexOf);
            replaceAll = replaceAll.substring(0, indexOf);
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(this.f4437b0);
        int i2 = 0;
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            if (i2 == this.f4438c0) {
                stringBuffer.append(stringBuffer2);
                i2 = 0;
            }
            stringBuffer.append(replaceAll.charAt(length));
            i2++;
        }
        return stringBuffer.reverse().toString() + str2;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        View view = this.f4412C;
        if (view == null && (view = this.f4413D) == null) {
            return;
        }
        this.f4044b.removeView(view);
    }

    /* renamed from: b */
    public void m5083b(float f2) {
        this.f4410A.setTextSize(f2);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i2) {
        super.mo4176b(i2);
        this.f4410A.setTextColor(AbstractC0652n1.m4701d(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r1 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r3.width = r4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008f, code lost:
    
        if (r1 > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156 A[ORIG_RETURN, RETURN] */
    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4143b(android.widget.AbsoluteLayout.LayoutParams r6) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.mo4143b(android.widget.AbsoluteLayout$LayoutParams):void");
    }

    /* renamed from: b */
    public void m5084b(C3489yj c3489yj) {
        this.f4419J = c3489yj;
        this.f4420K = c3489yj.f14182T;
        this.f4410A.post(new p());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r1 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r3.width = r4 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r1 > 0) goto L30;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m5085c(android.widget.AbsoluteLayout.LayoutParams r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0670w.m5085c(android.widget.AbsoluteLayout$LayoutParams):int");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        TextInputLayout textInputLayout = this.f4411B;
        if (textInputLayout != null) {
            textInputLayout.setEnabled(false);
            this.f4411B.setFocusable(false);
            this.f4411B.setFocusableInTouchMode(false);
        }
        if (this.f4410A.isEnabled()) {
            this.f4410A.setEnabled(false);
            this.f4410A.setFocusable(false);
            this.f4410A.setFocusableInTouchMode(false);
        }
        ImageView imageView = this.f4441x;
        if (imageView != null) {
            imageView.setEnabled(false);
            this.f4441x.setFocusable(false);
            this.f4441x.setFocusableInTouchMode(false);
        }
        ImageView imageView2 = this.f4443z;
        if (imageView2 != null) {
            imageView2.setEnabled(false);
            this.f4443z.setFocusable(false);
            this.f4443z.setFocusableInTouchMode(false);
        }
        C3489yj c3489yj = this.f4419J;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4412C, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m5086c(String str) {
        this.f4418I = str;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        TextInputLayout textInputLayout = this.f4411B;
        if (textInputLayout != null) {
            textInputLayout.setEnabled(true);
            this.f4411B.setFocusable(true);
            this.f4411B.setFocusableInTouchMode(true);
        }
        if (!this.f4410A.isEnabled()) {
            this.f4410A.setEnabled(true);
            this.f4410A.setFocusable(true);
            this.f4410A.setFocusableInTouchMode(true);
        }
        ImageView imageView = this.f4441x;
        if (imageView != null) {
            imageView.setEnabled(true);
            this.f4441x.setFocusable(true);
            this.f4441x.setFocusableInTouchMode(true);
        }
        ImageView imageView2 = this.f4443z;
        if (imageView2 != null) {
            imageView2.setEnabled(true);
            this.f4443z.setFocusable(true);
            this.f4443z.setFocusableInTouchMode(true);
        }
        if (this.f4419J.f14210e1) {
            AbstractC0652n1.m4697a(this.f4412C, AbstractC0652n1.f4038r);
            this.f4419J.f14210e1 = false;
        }
    }

    /* renamed from: d */
    public void m5087d(String str) {
        if (str != null) {
            this.f4432W = str;
        }
        m5093h(this.f4432W);
    }

    /* renamed from: e */
    public void m5088e(String str) {
        TextInputLayout textInputLayout = this.f4411B;
        if (textInputLayout != null) {
            textInputLayout.setHint(str);
        } else {
            this.f4410A.setHint(str);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4419J;
    }

    /* renamed from: f */
    public void m5089f(String str) {
        m5050a(str, (Drawable) null);
    }

    /* renamed from: g */
    public void m5090g(int i2) {
        int i3 = this.f4419J.f14180S;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f4410A.setSelection(i2);
    }

    /* renamed from: g */
    public void m5091g(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4419J.f14267z = str;
        }
        this.f4410A.post(new f());
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return m5101q() ? this.f4413D : this.f4412C;
    }

    /* renamed from: h */
    public void m5092h(int i2) {
        this.f4410A.setHintTextColor(AbstractC0652n1.m4701d(i2));
    }

    /* renamed from: h */
    public void m5093h(String str) {
        C3489yj m16930a;
        AbstractC0652n1 abstractC0652n1;
        if (!TextUtils.isEmpty(str)) {
            m5105u();
            int length = str.length();
            int i2 = this.f4419J.f14180S;
            if (length > i2) {
                str = str.substring(0, i2);
            }
        }
        this.f4425P = str;
        if (!TextUtils.isEmpty(str) && !this.f4427R) {
            if (!TextUtils.isEmpty(this.f4419J.f14183T0)) {
                str = this.f4419J.f14183T0 + str;
                this.f4428S = true;
            }
            if (!TextUtils.isEmpty(this.f4419J.f14185U0)) {
                str = str + this.f4419J.f14185U0;
                this.f4428S = true;
            }
        }
        this.f4410A.setText(m5082b(str));
        if (this.f4427R || TextUtils.isEmpty(this.f4419J.f14181S0)) {
            return;
        }
        C3489yj c3489yj = this.f4419J;
        if (c3489yj.f14165K0 != 8 || (m16930a = this.f4414E.m16930a(c3489yj.f14181S0, (Vector<C3489yj>) null)) == null || (abstractC0652n1 = m16930a.f14197a0) == null || !(abstractC0652n1 instanceof C0642k0)) {
            return;
        }
        C0642k0 c0642k0 = (C0642k0) abstractC0652n1;
        if (c0642k0.m4598m() != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (this.f4428S) {
                        if (!TextUtils.isEmpty(this.f4419J.f14183T0)) {
                            str = str.substring(this.f4419J.f14183T0.length(), str.length());
                        }
                        if (!TextUtils.isEmpty(this.f4419J.f14185U0)) {
                            str = str.substring(0, str.length() - this.f4419J.f14185U0.length());
                        }
                    }
                    if (!c0642k0.m4598m().m4947b()) {
                        c0642k0.m4598m().m4946a(str);
                        return;
                    } else if (!this.f4436a0) {
                        this.f4432W = str;
                        this.f4436a0 = true;
                    }
                } else if (!c0642k0.m4598m().m4947b()) {
                    c0642k0.m4598m().m4946a("");
                    return;
                }
                c0642k0.m4598m().m4948c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    /* renamed from: i */
    public void m5094i(int i2) {
        this.f4410A.setTypeface(this.f4419J.f14241p.m6069h(), AbstractC0652n1.m4702e(i2));
    }

    /* renamed from: i */
    public void m5095i(String str) {
        C3489yj c3489yj = this.f4419J;
        if (c3489yj.f14237n1 != null) {
            this.f4049g.mo4841a(str, str, c3489yj, false, this.f4433X, this.f4434Y);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    /* renamed from: j */
    public void m5096j(int i2) {
        if (i2 != 1 || C0755x1.m6174b(this.f4419J)) {
            return;
        }
        this.f4410A.setGravity(17);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        String str;
        AbstractC0652n1 abstractC0652n1;
        String m5097m = m5097m();
        int length = m5097m.length();
        boolean z = true;
        if (this.f4420K && (length == 0 || m5097m.trim().length() == 0)) {
            m5098n();
            if (C3530zi.f14470m && this.f4411B == null) {
                C0755x1.m6185e(this.f4045c, "msg.empty");
            }
            return false;
        }
        C3264tj c3264tj = this.f4416G;
        if (c3264tj != null) {
            String str2 = c3264tj.f13321h;
            C3489yj c3489yj = c3264tj.f13317d;
            C0670w c0670w = null;
            if (c3489yj == null || (abstractC0652n1 = c3489yj.f14197a0) == null || !(abstractC0652n1 instanceof C0670w)) {
                str = null;
            } else {
                c0670w = (C0670w) abstractC0652n1;
                str = c0670w.m5097m();
            }
            int i2 = this.f4416G.f13318e;
            if (i2 <= 0 || length >= i2) {
                C3264tj c3264tj2 = this.f4416G;
                int i3 = c3264tj2.f13314a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 9) {
                            int i4 = length - 1;
                            int i5 = c3264tj2.f13315b;
                            if (i4 >= i5) {
                                if (c0670w == null) {
                                }
                            }
                        }
                    } else if (c0670w == null) {
                    }
                } else if (c0670w == null) {
                }
            }
            z = false;
        }
        if (!z) {
            m5107w();
        }
        return z;
    }

    /* renamed from: m */
    public String m5097m() {
        if (!TextUtils.isEmpty(this.f4418I)) {
            return this.f4418I;
        }
        String obj = this.f4410A.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return obj;
        }
        if (!TextUtils.isEmpty(this.f4419J.f14183T0) && obj.contains(this.f4419J.f14183T0)) {
            obj = obj.substring(this.f4419J.f14183T0.length(), obj.length());
        }
        if (!TextUtils.isEmpty(this.f4419J.f14185U0) && obj.contains(this.f4419J.f14185U0)) {
            obj = obj.substring(0, obj.length() - this.f4419J.f14185U0.length());
        }
        String str = this.f4437b0;
        return str != null ? obj.replaceAll(str, "") : obj;
    }

    /* renamed from: n */
    public void m5098n() {
        this.f4422M = true;
        if (this.f4411B != null) {
            m5089f(C0713j1.m5563a(this.f4045c).m5641c("msg.empty"));
            if (!TextUtils.isEmpty(this.f4411B.getHint()) || !C3530zi.f14470m) {
                return;
            }
        } else {
            C3489yj c3489yj = this.f4419J;
            if (c3489yj.f14234m1 != null) {
                Drawable m6121a = C0755x1.m6121a(this.f4045c, c3489yj, C3489yj.a.ERROR);
                if (m6121a != null) {
                    m5074a(m6121a);
                    this.f4410A.setTextColor(this.f4419J.f14234m1.m12023e());
                    return;
                }
                return;
            }
            if (!C3530zi.f14470m) {
                m5074a(this.f4045c.getResources().getDrawable(R.drawable.empty_error));
                return;
            }
        }
        m5072a(3, this.f4045c.getResources().getDrawable(R.drawable.empty));
    }

    /* renamed from: o */
    public void m5099o() {
        C0482bj c0482bj = this.f4419J.f14167L0;
        if (c0482bj != null) {
            if (c0482bj.m3411f().equalsIgnoreCase("C") || this.f4419J.f14167L0.m3411f().equalsIgnoreCase("Center")) {
                if (this.f4419J.f14152E) {
                    CustomEditText customEditText = this.f4410A;
                    int i2 = this.f4429T;
                    C0657p0 c0657p0 = this.f4048f;
                    customEditText.setPadding(i2, c0657p0.f4219b, i2, c0657p0.f4221d);
                    return;
                }
                CustomEditText customEditText2 = this.f4410A;
                int i3 = this.f4429T;
                int i4 = this.f4423N;
                customEditText2.setPadding(i3, i4, i3, i4);
                return;
            }
            if (this.f4419J.f14167L0.m3411f().equalsIgnoreCase("L") || this.f4419J.f14167L0.m3411f().equalsIgnoreCase("Left") || this.f4419J.f14167L0.m3411f().equalsIgnoreCase("R") || this.f4419J.f14167L0.m3411f().equalsIgnoreCase("Right")) {
                if (!this.f4055m) {
                    if (this.f4419J.f14152E) {
                        CustomEditText customEditText3 = this.f4410A;
                        C0657p0 c0657p02 = this.f4048f;
                        customEditText3.setPadding(c0657p02.f4218a, c0657p02.f4219b, this.f4429T, c0657p02.f4221d);
                        return;
                    } else {
                        CustomEditText customEditText4 = this.f4410A;
                        int i5 = this.f4423N;
                        customEditText4.setPadding(i5, i5, this.f4429T, i5);
                        return;
                    }
                }
                if (this.f4419J.f14152E) {
                    CustomEditText customEditText5 = this.f4410A;
                    int i6 = this.f4429T;
                    C0657p0 c0657p03 = this.f4048f;
                    customEditText5.setPadding(i6, c0657p03.f4219b, c0657p03.f4220c, c0657p03.f4221d);
                    return;
                }
                CustomEditText customEditText6 = this.f4410A;
                int i7 = this.f4429T;
                int i8 = this.f4423N;
                customEditText6.setPadding(i7, i8, i8, i8);
            }
        }
    }

    /* renamed from: p */
    public boolean m5100p() {
        return this.f4433X;
    }

    /* renamed from: q */
    public boolean m5101q() {
        int i2 = this.f4419J.f14165K0;
        return i2 == 6 || i2 == 7;
    }

    /* renamed from: r */
    public void m5102r() {
        C2391dj c2391dj = this.f4419J.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: s */
    public void m5103s() {
        this.f4410A.setOnFocusChangeListener(null);
    }

    /* renamed from: t */
    public void m5104t() {
        this.f4419J.f14202c = true;
        this.f4410A.requestFocus();
    }

    /* renamed from: u */
    public void m5105u() {
        if (this.f4422M) {
            this.f4422M = false;
            if (this.f4411B != null) {
                m5050a((String) null, (Drawable) null);
                if (!C3530zi.f14470m) {
                    return;
                }
            } else if (!C3530zi.f14470m) {
                if (this.f4419J.f14228k1 != null && this.f4427R) {
                    return;
                }
                m5074a(this.f4047e);
                return;
            }
            m5072a(5, (Drawable) null);
        }
    }

    /* renamed from: v */
    public void m5106v() {
        int length;
        if (this.f4044b != null) {
            C3489yj c3489yj = this.f4419J;
            if (c3489yj.f14154F == null && c3489yj.f14156G == null && c3489yj.f14158H == null) {
                String str = c3489yj.f14160I;
            }
            View view = this.f4412C;
            if (view != null || (view = this.f4413D) != null) {
                this.f4044b.addView(view);
            }
            C3489yj c3489yj2 = this.f4419J;
            if (c3489yj2.f14181S0 != null) {
                int i2 = c3489yj2.f14165K0;
                if (i2 == 2) {
                    length = c3489yj2.f14180S - m5097m().length();
                    this.f4426Q = length;
                    if (length < 0) {
                        return;
                    }
                } else if (i2 != 3 || m5097m().length() >= this.f4419J.f14180S) {
                    return;
                } else {
                    length = m5097m().length();
                }
                C0755x1.m6154a(String.valueOf(length), this.f4419J.f14181S0, this.f4414E);
            }
        }
    }

    /* renamed from: w */
    public void m5107w() {
        m5050a(this.f4417H, (Drawable) null);
    }
}
