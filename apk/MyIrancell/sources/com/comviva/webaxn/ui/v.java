package com.comviva.webaxn.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Editable;
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
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.bj;
import defpackage.dj;
import defpackage.ej;
import defpackage.fj;
import defpackage.gj;
import defpackage.ij;
import defpackage.tj;
import defpackage.yj;
import defpackage.zi;
import defpackage.zj;

/* loaded from: classes.dex */
public class v extends n1 {
    static int d0 = 1001;
    public static boolean e0 = false;
    private CustomEditText A;
    private TextView B;
    private LinearLayout C;
    private FrameLayout D;
    public zj E;
    public o1 F;
    private tj G;
    private String H;
    private String I;
    private yj J;
    private boolean K;
    private LinearLayout.LayoutParams L;
    private Dialog M;
    public boolean N;
    public int O;
    private Cursor P;
    private CharSequence Q;
    private int R;
    private boolean S;
    private boolean T;
    private v0 U;
    private int V;
    private int W;
    private boolean X;
    private String Y;
    private String Z;
    private int a0;
    private View.OnFocusChangeListener b0;
    private TextWatcher c0;
    private ImageView x;
    private ImageView y;
    private ImageView z;

    /* loaded from: classes.dex */
    class a implements View.OnFocusChangeListener {

        /* renamed from: com.comviva.webaxn.ui.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0034a implements Runnable {
            RunnableC0034a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F.s().setRenderingInstance(v.this.F);
                if (v.this.J.c) {
                    v vVar = v.this;
                    x1.a(vVar.c, vVar.J, v.this.A);
                }
            }
        }

        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            v.this.S = z;
            String m = v.this.m();
            if (z && v.this.J.w != null) {
                v.this.J.a0.o = true;
                v.this.J.a0.n = n1.s;
            }
            if (!z && v.this.J.x != null) {
                v.this.J.a0.o = false;
                v.this.J.a0.n = n1.t;
            }
            v vVar = v.this;
            vVar.g.b(vVar);
            if (z) {
                if (v.this.J.K0 == 8 && v.this.J.L0 != null && !TextUtils.isEmpty(v.this.J.L0.e())) {
                    v.this.A.setBackgroundDrawable(v.this.c.getResources().getDrawable(v.this.c.getResources().getIdentifier(v.this.J.L0.e(), "drawable", v.this.c.getPackageName())));
                }
                if (v.this.T && !TextUtils.isEmpty(m)) {
                    if (!TextUtils.isEmpty(v.this.J.T0) && m.contains(v.this.J.T0)) {
                        m = m.substring(v.this.J.T0.length(), m.length());
                    }
                    if (!TextUtils.isEmpty(v.this.J.U0) && m.contains(v.this.J.U0)) {
                        m = m.substring(0, m.length() - v.this.J.U0.length());
                    }
                    v.this.T = false;
                    v.this.f(m);
                }
                if (!TextUtils.isEmpty(v.this.m()) || v.this.J.I0 == null) {
                    v.this.A.setError(null, null);
                } else {
                    v.this.A.setError(v.this.J.I0, null);
                }
                v vVar2 = v.this;
                vVar2.g.a(vVar2.J);
            } else {
                if (v.this.J.K0 == 8 && v.this.J.L0 != null) {
                    v.this.A.setBackgroundDrawable(v.this.e);
                }
                v.this.A.setError(null, null);
                if (!TextUtils.isEmpty(m)) {
                    v.this.f(m);
                }
            }
            if (z) {
                v.this.A.post(new RunnableC0034a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends CursorAdapter {
        b(Context context, Cursor cursor) {
            super(context, cursor);
        }

        @Override // android.widget.CursorAdapter
        public void bindView(View view, Context context, Cursor cursor) {
            TextView textView = (TextView) view.findViewById(R.id.name);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setScaleType(v.this.J.c1 == -1 ? ImageView.ScaleType.FIT_XY : x1.b(v.this.J.c1));
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
    public class c implements AdapterView.OnItemClickListener {
        final /* synthetic */ WebAxnActivity b;

        c(WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            String str2 = (String) view.getTag();
            String str3 = v.this.m().toString();
            int i2 = 0;
            if (str3 == null || str3.length() <= 0) {
                str = str2;
            } else {
                v.this.A.getSelectionStart();
                int selectionEnd = v.this.A.getSelectionEnd();
                String substring = str3.substring(selectionEnd, str3.length());
                str = str3.substring(0, selectionEnd) + str2 + substring;
                i2 = selectionEnd;
            }
            v.this.Q = str;
            v.this.A.setText(str);
            v.this.A.setSelection(i2 + str2.length());
            if (v.this.M != null) {
                v.this.M.dismiss();
            }
            v.this.P.close();
            aj.a(this.b).close();
            v.this.P = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnCancelListener {
        final /* synthetic */ WebAxnActivity b;

        d(WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (v.this.M != null) {
                v.this.M.dismiss();
            }
            v.this.P.close();
            aj.a(this.b).close();
            v.this.P = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.A.requestFocus();
            v.this.A.setSelection(v.this.A.getText().length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements ActionMode.Callback {
        f(v vVar) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
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
    class g implements TextWatcher {
        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (v.this.Z != null) {
                v.this.A.removeTextChangedListener(this);
                String b = v.this.b(editable.toString());
                int selectionEnd = v.this.A.getSelectionEnd();
                v.this.A.setText(b);
                int length = selectionEnd + (b.length() - editable.length());
                if (length < 0) {
                    length = 0;
                }
                v.this.A.setSelection(length);
            }
            v vVar = v.this;
            if (vVar.N) {
                if (zi.m) {
                    vVar.a(5, (Drawable) null);
                } else {
                    vVar.a(vVar.e);
                }
                v.this.N = false;
            }
            if (v.e0 || v.this.R == 0) {
                v.e0 = false;
                return;
            }
            if (v.this.m().length() >= v.this.J.S) {
                v.e0 = true;
                if (v.this.Q != null) {
                    v vVar2 = v.this;
                    vVar2.f(vVar2.Q.toString());
                    v.this.A.setSelection(v.this.Q.length());
                }
                if (v.this.J.K0 == 4 && !TextUtils.isEmpty(v.this.J.L0.e())) {
                    v.this.A.setBackgroundDrawable(v.this.c.getResources().getDrawable(v.this.c.getResources().getIdentifier(v.this.J.L0.e(), "drawable", v.this.c.getPackageName())));
                }
                v vVar3 = v.this;
                x1.p pVar = vVar3.g;
                if (pVar != null) {
                    pVar.a(vVar3.J, v.this.J.y, v.this.J.V);
                }
            } else if (v.this.J.K0 == 4 && !TextUtils.isEmpty(v.this.J.L0.e())) {
                v.this.A.setBackgroundDrawable(v.this.e);
            }
            if (v.this.Y.equals(v.this.m().toString())) {
                v vVar4 = v.this;
                if (vVar4.F.a(vVar4.J.f1, v.this.J.V)) {
                    v vVar5 = v.this;
                    vVar5.g.a(vVar5.J.g1, v.this.J);
                }
                v.this.X = false;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length;
            if (charSequence.length() == v.this.J.S) {
                v.this.Q = charSequence.subSequence(0, charSequence.length());
            }
            if (!TextUtils.isEmpty(v.this.J.S0)) {
                if (v.this.J.K0 == 2) {
                    v vVar = v.this;
                    vVar.R = vVar.J.S - v.this.m().length();
                    if (v.this.R >= 0) {
                        length = v.this.R;
                        x1.a(String.valueOf(length), v.this.J.S0, v.this.E);
                    }
                } else if (v.this.J.K0 == 3 && v.this.m().length() < v.this.J.S) {
                    length = v.this.m().length();
                    x1.a(String.valueOf(length), v.this.J.S0, v.this.E);
                }
            }
            if (v.this.X || TextUtils.isEmpty(v.this.J.f1)) {
                return;
            }
            v vVar2 = v.this;
            if (vVar2.F.b(vVar2.J.f1, v.this.J.V)) {
                v vVar3 = v.this;
                vVar3.g.a(vVar3.J.f1, v.this.J);
            }
            v.this.X = true;
        }
    }

    /* loaded from: classes.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v vVar = v.this;
            vVar.a(vVar.J.R, true);
        }
    }

    /* loaded from: classes.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.comviva.webaxn.utils.m1.a(v.this.c, new String[]{"android.permission.READ_CONTACTS"})) {
                v vVar = v.this;
                p1.a(vVar.c, vVar.A.getId());
                return;
            }
            if (com.comviva.webaxn.utils.j1.a(v.this.c).d("android.permission.READ_CONTACTS") == -1) {
                com.comviva.webaxn.utils.m1.a((Activity) v.this.c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            } else {
                if (!com.comviva.webaxn.utils.m1.a(v.this.c, "android.permission.READ_CONTACTS")) {
                    x1.d(v.this.c, "msg.rpCon");
                    return;
                }
                com.comviva.webaxn.utils.m1.a((Activity) v.this.c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            }
            x1.v = true;
        }
    }

    /* loaded from: classes.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (v.this.M != null && v.this.M.isShowing()) {
                v.this.M.dismiss();
                v.this.M = null;
            }
            v.this.a(view);
        }
    }

    /* loaded from: classes.dex */
    class k implements View.OnTouchListener {
        k(v vVar) {
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
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.A.addTextChangedListener(v.this.c0);
        }
    }

    /* loaded from: classes.dex */
    class m implements TextView.OnEditorActionListener {
        m() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            v vVar;
            x1.p pVar;
            if (i == 6 || i != 5 || (pVar = (vVar = v.this).g) == null) {
                return false;
            }
            return pVar.a(vVar.J, v.this.J.y, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements Runnable {
        final /* synthetic */ byte[] b;

        n(byte[] bArr) {
            this.b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomEditText customEditText;
            int i;
            int i2;
            int i3;
            int i4;
            CustomEditText customEditText2;
            int i5;
            int i6;
            int i7;
            int i8;
            com.comviva.webaxn.utils.b.a(v.this.c).a().a();
            int identifier = !TextUtils.isEmpty(v.this.J.r0) ? v.this.c.getResources().getIdentifier(v.this.J.r0, "drawable", v.this.c.getPackageName()) : 0;
            try {
                if (identifier > 0) {
                    Bitmap a = com.comviva.webaxn.utils.e1.b(v.this.c).a(v.this.J.r0);
                    if (a == null && (a = BitmapFactory.decodeResource(v.this.c.getResources(), identifier)) != null) {
                        com.comviva.webaxn.utils.e1.b(v.this.c).a(v.this.J.r0, a);
                    }
                    if (NinePatch.isNinePatchChunk(a.getNinePatchChunk())) {
                        v.this.e = new NinePatchDrawable(a, a.getNinePatchChunk(), new Rect(), null);
                    } else {
                        v.this.e = new BitmapDrawable(a);
                    }
                    v.this.A.setBackgroundDrawable(v.this.e);
                    if (v.this.p()) {
                        v.this.o();
                        return;
                    }
                    if (v.this.J.E) {
                        customEditText2 = v.this.A;
                        i5 = v.this.f.a;
                        i6 = v.this.f.b;
                        i7 = v.this.f.c;
                        i8 = v.this.f.d;
                    } else {
                        customEditText2 = v.this.A;
                        i5 = v.this.O;
                        i6 = v.this.O;
                        i7 = v.this.O;
                        i8 = v.this.O;
                    }
                    customEditText2.setPadding(i5, i6, i7, i8);
                    return;
                }
                if (this.b != null) {
                    Bitmap a2 = com.comviva.webaxn.utils.e1.b(v.this.c).a(v.this.J.O);
                    if (a2 == null && (a2 = BitmapFactory.decodeByteArray(this.b, 0, this.b.length)) != null) {
                        com.comviva.webaxn.utils.e1.b(v.this.c).a(v.this.J.O, a2);
                    }
                    if (NinePatch.isNinePatchChunk(a2.getNinePatchChunk())) {
                        v.this.e = new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null);
                    } else {
                        v.this.e = new BitmapDrawable(a2);
                    }
                    v.this.A.setBackgroundDrawable(v.this.e);
                    if (v.this.p()) {
                        v.this.o();
                        return;
                    }
                    if (v.this.J.E) {
                        customEditText = v.this.A;
                        i = v.this.f.a;
                        i2 = v.this.f.b;
                        i3 = v.this.f.c;
                        i4 = v.this.f.d;
                    } else {
                        customEditText = v.this.A;
                        i = v.this.O;
                        i2 = v.this.O;
                        i3 = v.this.O;
                        i4 = v.this.O;
                    }
                    customEditText.setPadding(i, i2, i3, i4);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0197, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(android.content.Context r5, defpackage.yj r6, com.comviva.webaxn.ui.v0 r7, com.comviva.webaxn.ui.o1 r8) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.v.<init>(android.content.Context, yj, com.comviva.webaxn.ui.v0, com.comviva.webaxn.ui.o1):void");
    }

    private void v() {
        this.A.setCustomSelectionActionModeCallback(new f(this));
        this.A.setLongClickable(false);
        this.A.setTextIsSelectable(false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001c. Please report as an issue. */
    public int a(int i2, boolean z, String str) {
        int i3;
        CustomEditText customEditText;
        CustomEditText customEditText2;
        int i4;
        CustomEditText customEditText3;
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
        PasswordTransformationMethod passwordTransformationMethod = null;
        switch (i2) {
            case 1:
                if (z) {
                    customEditText2 = this.A;
                    i4 = 131073;
                    customEditText2.setInputType(i4);
                    this.A.setVerticalScrollBarEnabled(true);
                    customEditText3 = this.A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                    break;
                } else {
                    customEditText = this.A;
                    customEditText.setInputType(i7);
                    customEditText3 = this.A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                }
            case 2:
                if (z) {
                    customEditText2 = this.A;
                    i4 = 131074;
                    customEditText2.setInputType(i4);
                    this.A.setVerticalScrollBarEnabled(true);
                    customEditText3 = this.A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                    break;
                } else {
                    customEditText = this.A;
                    i7 = 2;
                    customEditText.setInputType(i7);
                    customEditText3 = this.A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
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
        return i2;
    }

    public int a(v0 v0Var) {
        int c2 = this.J.c(v0Var.c.height());
        int k2 = this.J.k(v0Var.c.width());
        int i2 = -2;
        if (c2 < 0) {
            c2 = -2;
        }
        int d2 = k2 < 0 ? -1 : k2 - (this.J.d(v0Var.c.width()) + this.J.g(v0Var.c.width()));
        yj yjVar = this.J;
        if (yjVar.K) {
            this.A.setLines(yjVar.s0);
        } else {
            i2 = c2;
        }
        this.A.getLayoutParams().width = d2;
        this.A.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.A.getMeasuredHeight();
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.x.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.y.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        if (this.z != null) {
            if (i2 <= 0) {
                i2 = measuredHeight;
            }
            this.V = i2;
            this.z.getLayoutParams().height = this.V;
            this.z.getLayoutParams().width = this.V;
            o();
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.C.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.l = this.C.getMeasuredWidth();
        int measuredHeight2 = this.C.getMeasuredHeight();
        this.k = measuredHeight2;
        return measuredHeight2;
    }

    public void a(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A.setLetterSpacing(f2);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(int i2) {
        super.a(i2);
        yj yjVar = this.J;
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            ejVar.a(this.k);
            Drawable a2 = x1.a(this.J.O0, n1.d(i2));
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.v.a(int, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r7.W = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r8 == 7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2131231393(0x7f0802a1, float:1.8078866E38)
            r1 = 2131231392(0x7f0802a0, float:1.8078864E38)
            r2 = 3
            r3 = 1
            r4 = 7
            r5 = 6
            if (r8 == r3) goto L44
            r6 = 2
            if (r8 == r6) goto L36
            r0 = 2131231395(0x7f0802a3, float:1.807887E38)
            r1 = 2131231394(0x7f0802a2, float:1.8078868E38)
            if (r8 == r2) goto L28
            if (r8 == r5) goto L1a
            goto L55
        L1a:
            yj r8 = r7.J
            r8.R = r6
            if (r9 == 0) goto L55
            int r8 = r8.K0
            if (r8 != r5) goto L25
            goto L4e
        L25:
            if (r8 != r4) goto L55
            goto L43
        L28:
            yj r8 = r7.J
            r8.R = r3
            if (r9 == 0) goto L55
            int r8 = r8.K0
            if (r8 != r5) goto L33
            goto L4e
        L33:
            if (r8 != r4) goto L55
            goto L43
        L36:
            yj r8 = r7.J
            r8.R = r5
            if (r9 == 0) goto L55
            int r8 = r8.K0
            if (r8 != r5) goto L41
            goto L4e
        L41:
            if (r8 != r4) goto L55
        L43:
            goto L53
        L44:
            yj r8 = r7.J
            r8.R = r2
            if (r9 == 0) goto L55
            int r8 = r8.K0
            if (r8 != r5) goto L51
        L4e:
            r7.W = r1
            goto L55
        L51:
            if (r8 != r4) goto L55
        L53:
            r7.W = r0
        L55:
            if (r9 == 0) goto L60
            android.widget.ImageView r8 = r7.z
            if (r8 == 0) goto L60
            int r9 = r7.W
            r8.setImageResource(r9)
        L60:
            yj r8 = r7.J
            int r9 = r8.R
            boolean r0 = r8.K
            java.lang.String r8 = r8.l
            r7.a(r9, r0, r8)
            java.lang.String r8 = r7.m()
            int r8 = r8.length()
            r7.g(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.v.a(int, boolean):void");
    }

    public void a(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
        if (p()) {
            o();
            return;
        }
        if (this.J.E) {
            CustomEditText customEditText = this.A;
            p0 p0Var = this.f;
            customEditText.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
        } else {
            CustomEditText customEditText2 = this.A;
            int i2 = this.O;
            customEditText2.setPadding(i2, i2, i2, i2);
        }
    }

    public void a(Spanned spanned) {
        this.A.setText(spanned);
    }

    public void a(View view) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) this.c;
        Cursor j2 = aj.a(webAxnActivity).j();
        this.P = j2;
        if (j2 == null || webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setTitle("Insert smiley");
        ListView listView = new ListView(webAxnActivity);
        listView.setScrollingCacheEnabled(false);
        listView.setAdapter((ListAdapter) new b(webAxnActivity, this.P));
        listView.setOnItemClickListener(new c(webAxnActivity));
        builder.setView(listView);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnCancelListener(new d(webAxnActivity));
        create.show();
        this.M = create;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int length;
        int c2 = this.J.c(v0Var.c.height());
        int k2 = this.J.k(v0Var.c.width());
        int i2 = -2;
        if (c2 < 0) {
            c2 = -2;
        }
        int d2 = k2 < 0 ? -1 : k2 - (this.J.d(v0Var.c.width()) + this.J.g(v0Var.c.width()));
        yj yjVar = this.J;
        if (yjVar.K) {
            this.A.setLines(yjVar.s0);
        } else {
            i2 = c2;
        }
        this.A.getLayoutParams().width = d2;
        this.A.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.A.getMeasuredHeight();
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.x.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.y.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        if (this.z != null) {
            if (i2 > 0) {
                measuredHeight = i2;
            }
            this.V = measuredHeight;
            this.z.getLayoutParams().height = this.V;
            this.z.getLayoutParams().width = this.V;
            o();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(d2, i2);
        yj yjVar2 = this.J;
        layoutParams.gravity = x1.a(yjVar2.g, yjVar2.h, this.m);
        layoutParams.setMargins(this.J.d(v0Var.c.width()), this.J.i(v0Var.c.width()), this.J.g(v0Var.c.width()), this.J.a(v0Var.c.width()));
        this.C.setLayoutParams(layoutParams);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.C.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.l = this.C.getMeasuredWidth();
        this.k = this.C.getMeasuredHeight();
        yj yjVar3 = this.J;
        if (yjVar3.S0 != null) {
            int i3 = yjVar3.K0;
            if (i3 == 2) {
                length = yjVar3.S - m().length();
                this.R = length;
                if (length < 0) {
                    return;
                }
            } else if (i3 != 3 || m().length() >= this.J.S) {
                return;
            } else {
                length = m().length();
            }
            x1.a(String.valueOf(length), this.J.S0, this.E);
        }
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

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        fj fjVar;
        gj gjVar;
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
        this.A.post(new n(bArr));
    }

    public String b(String str) {
        if (this.Z == null || this.a0 <= 0 || TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        String replaceAll = str.replaceAll(this.Z, "");
        if (this.J.R == 4 && replaceAll.contains(".")) {
            int indexOf = replaceAll.indexOf(".");
            str2 = replaceAll.substring(indexOf);
            replaceAll = replaceAll.substring(0, indexOf);
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(this.Z);
        int i2 = 0;
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            if (i2 == this.a0) {
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
        this.b.removeView(this.C);
    }

    public void b(float f2) {
        this.A.setTextSize(f2);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i2) {
        super.b(i2);
        this.A.setTextColor(n1.d(i2));
    }

    public void b(yj yjVar) {
        this.J = yjVar;
        this.K = yjVar.T;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
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
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.setEnabled(false);
            this.y.setFocusable(false);
            this.y.setFocusableInTouchMode(false);
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
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.setEnabled(true);
            this.y.setFocusable(true);
            this.y.setFocusableInTouchMode(true);
        }
        if (this.J.e1) {
            n1.a(this.C, n1.r);
            this.J.e1 = false;
        }
    }

    public void d(String str) {
        this.A.setHint(str);
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.J.z = str;
        }
        this.A.post(new e());
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.J;
    }

    public void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i2 = this.J.S;
            if (length > i2) {
                str = str.substring(0, i2);
            }
        }
        this.Q = str;
        if (!TextUtils.isEmpty(str) && !this.S) {
            if (!TextUtils.isEmpty(this.J.T0)) {
                str = this.J.T0 + str;
                this.T = true;
            }
            if (!TextUtils.isEmpty(this.J.U0)) {
                str = str + this.J.U0;
                this.T = true;
            }
        }
        this.A.setText(str);
    }

    public void g(int i2) {
        int i3 = this.J.S;
        if (i2 > i3) {
            i2 = i3;
        }
        this.A.setSelection(i2);
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.C;
    }

    public void h(int i2) {
        this.A.setHintTextColor(n1.d(i2));
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    public void i(int i2) {
        this.A.setTypeface(this.J.p.h(), n1.e(i2));
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public void j(int i2) {
        if (i2 == 1) {
            this.A.setGravity(17);
        }
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
            if (zi.m) {
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
            u();
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
        String str = this.Z;
        return str != null ? obj.replaceAll(str, "") : obj;
    }

    public void n() {
        if (zi.m) {
            a(3, this.c.getResources().getDrawable(R.drawable.empty));
        } else {
            a(this.c.getResources().getDrawable(R.drawable.empty_error));
        }
        this.N = true;
    }

    public void o() {
        bj bjVar = this.J.L0;
        if (bjVar != null) {
            if (bjVar.f().equalsIgnoreCase("C") || this.J.L0.f().equalsIgnoreCase("Center")) {
                if (this.J.E) {
                    CustomEditText customEditText = this.A;
                    int i2 = this.V;
                    p0 p0Var = this.f;
                    customEditText.setPadding(i2, p0Var.b, i2, p0Var.d);
                    return;
                }
                CustomEditText customEditText2 = this.A;
                int i3 = this.V;
                int i4 = this.O;
                customEditText2.setPadding(i3, i4, i3, i4);
                return;
            }
            if (this.J.L0.f().equalsIgnoreCase("L") || this.J.L0.f().equalsIgnoreCase("Left") || this.J.L0.f().equalsIgnoreCase("R") || this.J.L0.f().equalsIgnoreCase("Right")) {
                if (!this.m) {
                    if (this.J.E) {
                        CustomEditText customEditText3 = this.A;
                        p0 p0Var2 = this.f;
                        customEditText3.setPadding(p0Var2.a, p0Var2.b, this.V, p0Var2.d);
                        return;
                    } else {
                        CustomEditText customEditText4 = this.A;
                        int i5 = this.O;
                        customEditText4.setPadding(i5, i5, this.V, i5);
                        return;
                    }
                }
                if (this.J.E) {
                    CustomEditText customEditText5 = this.A;
                    int i6 = this.V;
                    p0 p0Var3 = this.f;
                    customEditText5.setPadding(i6, p0Var3.b, p0Var3.c, p0Var3.d);
                    return;
                }
                CustomEditText customEditText6 = this.A;
                int i7 = this.V;
                int i8 = this.O;
                customEditText6.setPadding(i7, i8, i8, i8);
            }
        }
    }

    public boolean p() {
        int i2 = this.J.K0;
        return i2 == 6 || i2 == 7;
    }

    public void q() {
        dj djVar = this.J.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void r() {
        this.A.setOnFocusChangeListener(null);
    }

    public void s() {
        this.J.c = true;
        this.A.requestFocus();
    }

    public void t() {
        int length;
        if (this.b != null) {
            yj yjVar = this.J;
            if (yjVar.F == null && yjVar.G == null && yjVar.H == null) {
                String str = yjVar.I;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.l, this.k);
            this.L = layoutParams;
            yj yjVar2 = this.J;
            layoutParams.gravity = x1.a(yjVar2.g, yjVar2.h, this.m);
            this.L.setMargins(this.J.d(this.U.c.width()), this.J.i(this.U.c.width()), this.J.g(this.U.c.width()), this.J.a(this.U.c.width()));
            this.b.addView(this.C, this.L);
            if (this.J.c) {
                e((String) null);
            }
            yj yjVar3 = this.J;
            if (yjVar3.S0 != null) {
                int i2 = yjVar3.K0;
                if (i2 == 2) {
                    length = yjVar3.S - m().length();
                    this.R = length;
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

    public void u() {
        this.A.setError(this.H);
    }
}
