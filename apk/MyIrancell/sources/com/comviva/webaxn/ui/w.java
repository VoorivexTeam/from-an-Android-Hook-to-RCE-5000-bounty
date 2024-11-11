package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import com.google.android.material.textfield.TextInputLayout;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.bj;
import defpackage.dj;
import defpackage.ej;
import defpackage.fj;
import defpackage.gj;
import defpackage.ij;
import defpackage.tj;
import defpackage.uj;
import defpackage.yj;
import defpackage.zi;
import defpackage.zj;
import java.util.Vector;

/* loaded from: classes.dex */
public class w extends n1 {
    static int f0 = 1001;
    private CustomEditText A;
    private TextInputLayout B;
    private LinearLayout C;
    private FrameLayout D;
    public zj E;
    public o1 F;
    private tj G;
    private String H;
    private String I;
    private yj J;
    private boolean K;
    private Dialog L;
    public boolean M;
    public int N;
    private Cursor O;
    private CharSequence P;
    private int Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private boolean V;
    private String W;
    private boolean X;
    private boolean[] Y;
    private Drawable Z;
    private boolean a0;
    private String b0;
    private int c0;
    private View.OnFocusChangeListener d0;
    private TextWatcher e0;
    private ImageView x;
    private ImageView y;
    private ImageView z;

    /* loaded from: classes.dex */
    class a implements View.OnFocusChangeListener {

        /* renamed from: com.comviva.webaxn.ui.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0035a implements Runnable {
            RunnableC0035a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.F.s().setRenderingInstance(w.this.F);
                if (w.this.J.c) {
                    w wVar = w.this;
                    x1.a(wVar.c, wVar.J, w.this.A);
                }
            }
        }

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        
            if (r2 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
        
            r9.b.b(r2);
            r9.b.A.setTextColor(r9.b.J.k1.e());
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            if (r2 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x021f, code lost:
        
            if (r9.b.J.l1.i() == false) goto L68;
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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.a.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ byte[] b;

        b(byte[] bArr) {
            this.b = bArr;
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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.b.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends CursorAdapter {
        c(Context context, Cursor cursor) {
            super(context, cursor);
        }

        @Override // android.widget.CursorAdapter
        public void bindView(View view, Context context, Cursor cursor) {
            TextView textView = (TextView) view.findViewById(R.id.name);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setScaleType(w.this.J.c1 == -1 ? ImageView.ScaleType.FIT_XY : x1.b(w.this.J.c1));
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
    /* loaded from: classes.dex */
    public class d implements AdapterView.OnItemClickListener {
        final /* synthetic */ WebAxnActivity b;

        d(WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            String str2 = (String) view.getTag();
            String str3 = w.this.m().toString();
            int i2 = 0;
            if (str3 == null || str3.length() <= 0) {
                str = str2;
            } else {
                w.this.A.getSelectionStart();
                int selectionEnd = w.this.A.getSelectionEnd();
                String substring = str3.substring(selectionEnd, str3.length());
                str = str3.substring(0, selectionEnd) + str2 + substring;
                i2 = selectionEnd;
            }
            w.this.P = str;
            w.this.A.setText(w.this.b(str));
            w.this.A.setSelection(i2 + str2.length());
            if (w.this.L != null) {
                w.this.L.dismiss();
            }
            w.this.O.close();
            aj.a(this.b).close();
            w.this.O = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnCancelListener {
        final /* synthetic */ WebAxnActivity b;

        e(WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (w.this.L != null) {
                w.this.L.dismiss();
            }
            w.this.O.close();
            aj.a(this.b).close();
            w.this.O = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.A.requestFocus();
            w.this.A.setSelection(w.this.A.getText().length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements ActionMode.Callback {
        g(w wVar) {
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

    /* loaded from: classes.dex */
    static /* synthetic */ class h {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[yj.a.values().length];
            a = iArr;
            try {
                iArr[yj.a.FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[yj.a.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    class i implements TextWatcher {
        i() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x0238, code lost:
        
            if (java.lang.Float.parseFloat(r7.b.W) == java.lang.Float.parseFloat(r7.b.m())) goto L68;
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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.i.afterTextChanged(android.text.Editable):void");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length;
            if (w.this.m().length() == w.this.J.S) {
                w wVar = w.this;
                wVar.P = wVar.m();
            }
            if (TextUtils.isEmpty(w.this.J.S0)) {
                return;
            }
            if (w.this.J.K0 == 2) {
                w wVar2 = w.this;
                wVar2.Q = wVar2.J.S - w.this.m().length();
                if (w.this.Q < 0) {
                    return;
                } else {
                    length = w.this.Q;
                }
            } else if (w.this.J.K0 != 3 || w.this.m().length() >= w.this.J.S) {
                return;
            } else {
                length = w.this.m().length();
            }
            x1.a(String.valueOf(length), w.this.J.S0, w.this.E);
        }
    }

    /* loaded from: classes.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w wVar = w.this;
            wVar.a(wVar.J.R, true);
        }
    }

    /* loaded from: classes.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.comviva.webaxn.utils.m1.a(w.this.c, new String[]{"android.permission.READ_CONTACTS"})) {
                w wVar = w.this;
                p1.a(wVar.c, wVar.A.getId());
                return;
            }
            if (com.comviva.webaxn.utils.j1.a(w.this.c).d("android.permission.READ_CONTACTS") == -1) {
                com.comviva.webaxn.utils.m1.a((Activity) w.this.c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            } else {
                if (!com.comviva.webaxn.utils.m1.a(w.this.c, "android.permission.READ_CONTACTS")) {
                    x1.d(w.this.c, "msg.rpCon");
                    return;
                }
                com.comviva.webaxn.utils.m1.a((Activity) w.this.c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            }
            x1.v = true;
        }
    }

    /* loaded from: classes.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (w.this.L != null && w.this.L.isShowing()) {
                w.this.L.dismiss();
                w.this.L = null;
            }
            w.this.a(view);
        }
    }

    /* loaded from: classes.dex */
    class m implements View.OnTouchListener {
        m(w wVar) {
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

    /* loaded from: classes.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.A.addTextChangedListener(w.this.e0);
        }
    }

    /* loaded from: classes.dex */
    class o implements TextView.OnEditorActionListener {
        o() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            w wVar;
            x1.p pVar;
            n1 n1Var;
            s m;
            String str;
            if (i != 6) {
                if (i != 5 || (pVar = (wVar = w.this).g) == null) {
                    return false;
                }
                return pVar.a(wVar.J, w.this.J.y, (String) null);
            }
            if (TextUtils.isEmpty(w.this.J.S0) || w.this.J.K0 != 8) {
                return false;
            }
            w wVar2 = w.this;
            yj a = wVar2.E.a(wVar2.J.S0, (Vector<yj>) null);
            if (a == null || (n1Var = a.a0) == null || !(n1Var instanceof k0)) {
                return false;
            }
            k0 k0Var = (k0) n1Var;
            if (k0Var.m() == null) {
                return false;
            }
            try {
                if (TextUtils.isEmpty(w.this.m())) {
                    m = k0Var.m();
                    str = "";
                } else {
                    m = k0Var.m();
                    str = w.this.m();
                }
                m.a(str);
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = w.this;
            wVar.i(wVar.W);
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
    public w(android.content.Context r7, com.comviva.webaxn.ui.j0 r8, com.comviva.webaxn.ui.o1 r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.<init>(android.content.Context, com.comviva.webaxn.ui.j0, com.comviva.webaxn.ui.o1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Drawable drawable) {
        TextInputLayout textInputLayout = this.B;
        if (textInputLayout != null) {
            textInputLayout.setError(str);
        } else {
            this.A.setError(str, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Drawable drawable) {
        if (this.B == null && drawable != null) {
            this.A.setBackgroundDrawable(drawable);
            if (q()) {
                o();
                return;
            }
            if (this.J.E) {
                CustomEditText customEditText = this.A;
                p0 p0Var = this.f;
                customEditText.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
            } else {
                CustomEditText customEditText2 = this.A;
                int i2 = this.N;
                customEditText2.setPadding(i2, i2, i2, i2);
            }
        }
    }

    private void x() {
        this.A.setCustomSelectionActionModeCallback(new g(this));
        this.A.setLongClickable(false);
        this.A.setTextIsSelectable(false);
    }

    private void y() {
        this.B.setEnabled(true);
        int f02 = com.comviva.webaxn.utils.j1.a(this.c).f0();
        int a2 = this.J.b() ? this.J.a() : this.J.p.c();
        int c2 = this.J.p.c();
        ij ijVar = this.J.k1;
        if (ijVar != null && ijVar.h()) {
            f02 = this.J.k1.c();
        }
        yj yjVar = this.J;
        int c3 = (yjVar.m1 == null || !yjVar.k1.h()) ? -65536 : this.J.m1.c();
        this.B.setHintAnimationEnabled(true);
        this.B.setHintEnabled(true);
        this.B.setDefaultHintTextColor(x1.a(android.R.attr.state_focused, f02, -1, a2));
        this.B.setBoxStrokeColor(f02);
        this.B.setErrorEnabled(true);
        this.B.setErrorTextColor(ColorStateList.valueOf(c3));
        this.B.setPasswordVisibilityToggleTintList(ColorStateList.valueOf(c2));
        this.B.setPasswordVisibilityToggleEnabled(true);
        com.comviva.webaxn.utils.u uVar = this.J.p;
        if (uVar != null) {
            this.B.setTypeface(uVar.h());
        }
        ej ejVar = this.J.O0;
        if (ejVar != null) {
            this.B.a(ejVar.b(), this.J.O0.d(), this.J.O0.a(), this.J.O0.c());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001c. Please report as an issue. */
    public int a(int i2, boolean z, String str) {
        int i3;
        Vector<uj> vector;
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
            this.A.setEnabled(false);
            this.A.setFocusable(false);
            this.A.setFocusableInTouchMode(false);
            i2 = i3;
        }
        switch (i2) {
            case 1:
                if (z) {
                    customEditText2 = this.A;
                    i4 = 131073;
                    customEditText2.setInputType(i4);
                    this.A.setVerticalScrollBarEnabled(true);
                    this.A.setTransformationMethod(null);
                    break;
                } else {
                    customEditText = this.A;
                    customEditText.setInputType(i7);
                    this.A.setTransformationMethod(null);
                }
            case 2:
                if (z) {
                    customEditText2 = this.A;
                    i4 = 131074;
                    customEditText2.setInputType(i4);
                    this.A.setVerticalScrollBarEnabled(true);
                    this.A.setTransformationMethod(null);
                    break;
                } else {
                    customEditText = this.A;
                    i7 = 2;
                    customEditText.setInputType(i7);
                    this.A.setTransformationMethod(null);
                }
            case 3:
                if (z) {
                    this.A.setInputType(131201);
                    this.A.setVerticalScrollBarEnabled(true);
                } else {
                    this.A.setInputType(129);
                }
                customEditText3 = this.A;
                passwordTransformationMethod = new PasswordTransformationMethod();
                customEditText3.setTransformationMethod(passwordTransformationMethod);
                this.X = true;
                break;
            case 4:
                if (!z) {
                    customEditText4 = this.A;
                    i5 = 8194;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.A;
                    i6 = 139266;
                    customEditText5.setInputType(i6);
                    this.A.setVerticalScrollBarEnabled(true);
                    break;
                }
            case 6:
                if (z) {
                    this.A.setInputType(131202);
                    this.A.setVerticalScrollBarEnabled(true);
                } else {
                    this.A.setInputType(130);
                }
                customEditText3 = this.A;
                passwordTransformationMethod = new PasswordTransformationMethod();
                customEditText3.setTransformationMethod(passwordTransformationMethod);
                this.X = true;
                break;
            case 7:
                if (!z) {
                    customEditText4 = this.A;
                    i5 = 32;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.A;
                    i6 = 131104;
                    customEditText5.setInputType(i6);
                    this.A.setVerticalScrollBarEnabled(true);
                    break;
                }
            case 8:
                if (!z) {
                    customEditText4 = this.A;
                    i5 = 3;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.A;
                    i6 = 131075;
                    customEditText5.setInputType(i6);
                    this.A.setVerticalScrollBarEnabled(true);
                    break;
                }
        }
        if (this.X && (vector = this.J.n1) != null) {
            this.Y = new boolean[vector.size()];
        }
        return i2;
    }

    public void a(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A.setLetterSpacing(f2);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(int i2) {
        if (this.B != null) {
            return;
        }
        super.a(i2);
        yj yjVar = this.J;
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            Drawable a2 = x1.a(ejVar, n1.d(i2));
            this.e = a2;
            this.A.setBackgroundDrawable(a2);
        } else if (yjVar.p.j()) {
            this.A.setBackgroundColor(n1.d(i2));
        }
        this.e = this.A.getBackground();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r2.m != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2.A.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r4, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r2.A.setCompoundDrawablesWithIntrinsicBounds(r4, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r2.m != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r3, android.graphics.drawable.Drawable r4) {
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
            com.comviva.webaxn.ui.CustomEditText r3 = r2.A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)
            goto L33
        L13:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r4)
            goto L33
        L19:
            boolean r3 = r2.m
            if (r3 == 0) goto L28
            goto L2e
        L1e:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r4, r1, r1)
            goto L33
        L24:
            boolean r3 = r2.m
            if (r3 == 0) goto L2e
        L28:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r4, r1)
            goto L33
        L2e:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.A
            r3.setCompoundDrawablesWithIntrinsicBounds(r4, r1, r1, r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.a(int, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r7.U = r0;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.a(int, boolean):void");
    }

    public void a(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
        if (q()) {
            o();
            return;
        }
        if (this.J.E) {
            CustomEditText customEditText = this.A;
            p0 p0Var = this.f;
            customEditText.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
        } else {
            CustomEditText customEditText2 = this.A;
            int i2 = this.N;
            customEditText2.setPadding(i2, i2, i2, i2);
        }
    }

    public void a(Spanned spanned) {
        this.A.setText(spanned);
    }

    public void a(View view) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) this.c;
        Cursor j2 = aj.a(webAxnActivity).j();
        this.O = j2;
        if (j2 == null || webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setTitle("Insert smiley");
        ListView listView = new ListView(webAxnActivity);
        listView.setScrollingCacheEnabled(false);
        listView.setAdapter((ListAdapter) new c(webAxnActivity, this.O));
        listView.setOnItemClickListener(new d(webAxnActivity));
        builder.setView(listView);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnCancelListener(new e(webAxnActivity));
        create.show();
        this.L = create;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout = this.D;
        if (frameLayout != null) {
            ((AbsoluteLayout.LayoutParams) frameLayout.getLayoutParams()).x = layoutParams.x;
            layoutParams2 = this.D.getLayoutParams();
        } else {
            LinearLayout linearLayout = this.C;
            if (linearLayout == null) {
                return;
            }
            ((AbsoluteLayout.LayoutParams) linearLayout.getLayoutParams()).x = layoutParams.x;
            layoutParams2 = this.C.getLayoutParams();
        }
        ((AbsoluteLayout.LayoutParams) layoutParams2).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.f = p0Var;
        if (this.J.E) {
            this.A.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(x1.p pVar) {
        this.g = pVar;
        this.A.a(pVar, this.J, this.E);
    }

    public void a(String str, String str2) {
        this.A.setGravity(x1.a(str, str2, this.m));
    }

    public void a(tj tjVar) {
        this.G = tjVar;
        if (tjVar == null || TextUtils.isEmpty(tjVar.f)) {
            return;
        }
        this.H = this.G.f;
    }

    public void a(yj.a aVar, String str) {
        Drawable drawable;
        if (this.B != null) {
            return;
        }
        if (aVar != null) {
            drawable = x1.a(this.c, this.J, aVar);
            int i2 = h.a[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && drawable != null) {
                    this.Z = drawable;
                }
            }
            this.Z = null;
        } else if (TextUtils.isEmpty(str)) {
            drawable = this.e;
            fj fjVar = this.J.l1;
            if (fjVar != null) {
                fjVar.c(false);
                this.Z = null;
            }
        } else {
            drawable = x1.b(this.c, str);
        }
        b(drawable);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        fj fjVar;
        gj gjVar;
        if (this.B != null) {
            return;
        }
        ij ijVar = yjVar.k1;
        if ((ijVar == null || !ijVar.i()) && (((fjVar = yjVar.l1) == null || !fjVar.h()) && ((gjVar = yjVar.m1) == null || !gjVar.i()))) {
            a(yjVar.v0);
            return;
        }
        ij ijVar2 = yjVar.k1;
        if (ijVar2 != null && ijVar2.i()) {
            this.J.k1.a(yjVar.k1.a());
            yjVar.k1.b(false);
            return;
        }
        fj fjVar2 = yjVar.l1;
        if (fjVar2 != null && fjVar2.h()) {
            this.J.l1.a(yjVar.l1.a());
            yjVar.l1.b(false);
            return;
        }
        gj gjVar2 = yjVar.m1;
        if (gjVar2 == null || !gjVar2.i()) {
            return;
        }
        this.J.m1.a(yjVar.m1.a());
        yjVar.m1.b(false);
    }

    public void a(boolean z) {
        this.A.setCursorVisible(z);
    }

    public void a(byte[] bArr) {
        int i2 = this.J.K0;
        if (i2 != 10 && i2 != 11) {
            this.A.post(new b(bArr));
        } else if (this.J.c) {
            g((String) null);
        }
    }

    public String b(String str) {
        if (this.b0 == null || this.c0 <= 0 || TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        String replaceAll = str.replaceAll(this.b0, "");
        if (this.J.R == 4 && replaceAll.contains(".")) {
            int indexOf = replaceAll.indexOf(".");
            str2 = replaceAll.substring(indexOf);
            replaceAll = replaceAll.substring(0, indexOf);
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(this.b0);
        int i2 = 0;
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            if (i2 == this.c0) {
                stringBuffer.append(stringBuffer2);
                i2 = 0;
            }
            stringBuffer.append(replaceAll.charAt(length));
            i2++;
        }
        return stringBuffer.reverse().toString() + str2;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        View view = this.C;
        if (view == null && (view = this.D) == null) {
            return;
        }
        this.b.removeView(view);
    }

    public void b(float f2) {
        this.A.setTextSize(f2);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i2) {
        super.b(i2);
        this.A.setTextColor(n1.d(i2));
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
    @Override // com.comviva.webaxn.ui.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.widget.AbsoluteLayout.LayoutParams r6) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.b(android.widget.AbsoluteLayout$LayoutParams):void");
    }

    public void b(yj yjVar) {
        this.J = yjVar;
        this.K = yjVar.T;
        this.A.post(new p());
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.widget.AbsoluteLayout.LayoutParams r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.w.c(android.widget.AbsoluteLayout$LayoutParams):int");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        TextInputLayout textInputLayout = this.B;
        if (textInputLayout != null) {
            textInputLayout.setEnabled(false);
            this.B.setFocusable(false);
            this.B.setFocusableInTouchMode(false);
        }
        if (this.A.isEnabled()) {
            this.A.setEnabled(false);
            this.A.setFocusable(false);
            this.A.setFocusableInTouchMode(false);
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setEnabled(false);
            this.x.setFocusable(false);
            this.x.setFocusableInTouchMode(false);
        }
        ImageView imageView2 = this.z;
        if (imageView2 != null) {
            imageView2.setEnabled(false);
            this.z.setFocusable(false);
            this.z.setFocusableInTouchMode(false);
        }
        yj yjVar = this.J;
        if (yjVar.e1) {
            n1.a(this.C, yjVar.d1);
        }
    }

    public void c(String str) {
        this.I = str;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        TextInputLayout textInputLayout = this.B;
        if (textInputLayout != null) {
            textInputLayout.setEnabled(true);
            this.B.setFocusable(true);
            this.B.setFocusableInTouchMode(true);
        }
        if (!this.A.isEnabled()) {
            this.A.setEnabled(true);
            this.A.setFocusable(true);
            this.A.setFocusableInTouchMode(true);
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setEnabled(true);
            this.x.setFocusable(true);
            this.x.setFocusableInTouchMode(true);
        }
        ImageView imageView2 = this.z;
        if (imageView2 != null) {
            imageView2.setEnabled(true);
            this.z.setFocusable(true);
            this.z.setFocusableInTouchMode(true);
        }
        if (this.J.e1) {
            n1.a(this.C, n1.r);
            this.J.e1 = false;
        }
    }

    public void d(String str) {
        if (str != null) {
            this.W = str;
        }
        h(this.W);
    }

    public void e(String str) {
        TextInputLayout textInputLayout = this.B;
        if (textInputLayout != null) {
            textInputLayout.setHint(str);
        } else {
            this.A.setHint(str);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.J;
    }

    public void f(String str) {
        a(str, (Drawable) null);
    }

    public void g(int i2) {
        int i3 = this.J.S;
        if (i2 > i3) {
            i2 = i3;
        }
        this.A.setSelection(i2);
    }

    public void g(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.J.z = str;
        }
        this.A.post(new f());
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return q() ? this.D : this.C;
    }

    public void h(int i2) {
        this.A.setHintTextColor(n1.d(i2));
    }

    public void h(String str) {
        yj a2;
        n1 n1Var;
        if (!TextUtils.isEmpty(str)) {
            u();
            int length = str.length();
            int i2 = this.J.S;
            if (length > i2) {
                str = str.substring(0, i2);
            }
        }
        this.P = str;
        if (!TextUtils.isEmpty(str) && !this.R) {
            if (!TextUtils.isEmpty(this.J.T0)) {
                str = this.J.T0 + str;
                this.S = true;
            }
            if (!TextUtils.isEmpty(this.J.U0)) {
                str = str + this.J.U0;
                this.S = true;
            }
        }
        this.A.setText(b(str));
        if (this.R || TextUtils.isEmpty(this.J.S0)) {
            return;
        }
        yj yjVar = this.J;
        if (yjVar.K0 != 8 || (a2 = this.E.a(yjVar.S0, (Vector<yj>) null)) == null || (n1Var = a2.a0) == null || !(n1Var instanceof k0)) {
            return;
        }
        k0 k0Var = (k0) n1Var;
        if (k0Var.m() != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (this.S) {
                        if (!TextUtils.isEmpty(this.J.T0)) {
                            str = str.substring(this.J.T0.length(), str.length());
                        }
                        if (!TextUtils.isEmpty(this.J.U0)) {
                            str = str.substring(0, str.length() - this.J.U0.length());
                        }
                    }
                    if (!k0Var.m().b()) {
                        k0Var.m().a(str);
                        return;
                    } else if (!this.a0) {
                        this.W = str;
                        this.a0 = true;
                    }
                } else if (!k0Var.m().b()) {
                    k0Var.m().a("");
                    return;
                }
                k0Var.m().c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    public void i(int i2) {
        this.A.setTypeface(this.J.p.h(), n1.e(i2));
    }

    public void i(String str) {
        yj yjVar = this.J;
        if (yjVar.n1 != null) {
            this.g.a(str, str, yjVar, false, this.X, this.Y);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public void j(int i2) {
        if (i2 != 1 || x1.b(this.J)) {
            return;
        }
        this.A.setGravity(17);
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        String str;
        n1 n1Var;
        String m2 = m();
        int length = m2.length();
        boolean z = true;
        if (this.K && (length == 0 || m2.trim().length() == 0)) {
            n();
            if (zi.m && this.B == null) {
                x1.e(this.c, "msg.empty");
            }
            return false;
        }
        tj tjVar = this.G;
        if (tjVar != null) {
            String str2 = tjVar.h;
            yj yjVar = tjVar.d;
            w wVar = null;
            if (yjVar == null || (n1Var = yjVar.a0) == null || !(n1Var instanceof w)) {
                str = null;
            } else {
                wVar = (w) n1Var;
                str = wVar.m();
            }
            int i2 = this.G.e;
            if (i2 <= 0 || length >= i2) {
                tj tjVar2 = this.G;
                int i3 = tjVar2.a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 9) {
                            int i4 = length - 1;
                            int i5 = tjVar2.b;
                            if (i4 >= i5) {
                                if (wVar == null) {
                                }
                            }
                        }
                    } else if (wVar == null) {
                    }
                } else if (wVar == null) {
                }
            }
            z = false;
        }
        if (!z) {
            w();
        }
        return z;
    }

    public String m() {
        if (!TextUtils.isEmpty(this.I)) {
            return this.I;
        }
        String obj = this.A.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return obj;
        }
        if (!TextUtils.isEmpty(this.J.T0) && obj.contains(this.J.T0)) {
            obj = obj.substring(this.J.T0.length(), obj.length());
        }
        if (!TextUtils.isEmpty(this.J.U0) && obj.contains(this.J.U0)) {
            obj = obj.substring(0, obj.length() - this.J.U0.length());
        }
        String str = this.b0;
        return str != null ? obj.replaceAll(str, "") : obj;
    }

    public void n() {
        this.M = true;
        if (this.B != null) {
            f(com.comviva.webaxn.utils.j1.a(this.c).c("msg.empty"));
            if (!TextUtils.isEmpty(this.B.getHint()) || !zi.m) {
                return;
            }
        } else {
            yj yjVar = this.J;
            if (yjVar.m1 != null) {
                Drawable a2 = x1.a(this.c, yjVar, yj.a.ERROR);
                if (a2 != null) {
                    a(a2);
                    this.A.setTextColor(this.J.m1.e());
                    return;
                }
                return;
            }
            if (!zi.m) {
                a(this.c.getResources().getDrawable(R.drawable.empty_error));
                return;
            }
        }
        a(3, this.c.getResources().getDrawable(R.drawable.empty));
    }

    public void o() {
        bj bjVar = this.J.L0;
        if (bjVar != null) {
            if (bjVar.f().equalsIgnoreCase("C") || this.J.L0.f().equalsIgnoreCase("Center")) {
                if (this.J.E) {
                    CustomEditText customEditText = this.A;
                    int i2 = this.T;
                    p0 p0Var = this.f;
                    customEditText.setPadding(i2, p0Var.b, i2, p0Var.d);
                    return;
                }
                CustomEditText customEditText2 = this.A;
                int i3 = this.T;
                int i4 = this.N;
                customEditText2.setPadding(i3, i4, i3, i4);
                return;
            }
            if (this.J.L0.f().equalsIgnoreCase("L") || this.J.L0.f().equalsIgnoreCase("Left") || this.J.L0.f().equalsIgnoreCase("R") || this.J.L0.f().equalsIgnoreCase("Right")) {
                if (!this.m) {
                    if (this.J.E) {
                        CustomEditText customEditText3 = this.A;
                        p0 p0Var2 = this.f;
                        customEditText3.setPadding(p0Var2.a, p0Var2.b, this.T, p0Var2.d);
                        return;
                    } else {
                        CustomEditText customEditText4 = this.A;
                        int i5 = this.N;
                        customEditText4.setPadding(i5, i5, this.T, i5);
                        return;
                    }
                }
                if (this.J.E) {
                    CustomEditText customEditText5 = this.A;
                    int i6 = this.T;
                    p0 p0Var3 = this.f;
                    customEditText5.setPadding(i6, p0Var3.b, p0Var3.c, p0Var3.d);
                    return;
                }
                CustomEditText customEditText6 = this.A;
                int i7 = this.T;
                int i8 = this.N;
                customEditText6.setPadding(i7, i8, i8, i8);
            }
        }
    }

    public boolean p() {
        return this.X;
    }

    public boolean q() {
        int i2 = this.J.K0;
        return i2 == 6 || i2 == 7;
    }

    public void r() {
        dj djVar = this.J.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void s() {
        this.A.setOnFocusChangeListener(null);
    }

    public void t() {
        this.J.c = true;
        this.A.requestFocus();
    }

    public void u() {
        if (this.M) {
            this.M = false;
            if (this.B != null) {
                a((String) null, (Drawable) null);
                if (!zi.m) {
                    return;
                }
            } else if (!zi.m) {
                if (this.J.k1 != null && this.R) {
                    return;
                }
                a(this.e);
                return;
            }
            a(5, (Drawable) null);
        }
    }

    public void v() {
        int length;
        if (this.b != null) {
            yj yjVar = this.J;
            if (yjVar.F == null && yjVar.G == null && yjVar.H == null) {
                String str = yjVar.I;
            }
            View view = this.C;
            if (view != null || (view = this.D) != null) {
                this.b.addView(view);
            }
            yj yjVar2 = this.J;
            if (yjVar2.S0 != null) {
                int i2 = yjVar2.K0;
                if (i2 == 2) {
                    length = yjVar2.S - m().length();
                    this.Q = length;
                    if (length < 0) {
                        return;
                    }
                } else if (i2 != 3 || m().length() >= this.J.S) {
                    return;
                } else {
                    length = m().length();
                }
                x1.a(String.valueOf(length), this.J.S0, this.E);
            }
        }
    }

    public void w() {
        a(this.H, (Drawable) null);
    }
}
