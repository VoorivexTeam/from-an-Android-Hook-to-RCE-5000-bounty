package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0722m1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C0023aj;
import p000.C0482bj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C2475fj;
import p000.C2515gj;
import p000.C2597ij;
import p000.C3264tj;
import p000.C3489yj;
import p000.C3530zi;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.v */
/* loaded from: classes.dex */
public class C0668v extends AbstractC0652n1 {

    /* renamed from: d0 */
    static int f4345d0 = 1001;

    /* renamed from: e0 */
    public static boolean f4346e0 = false;

    /* renamed from: A */
    private CustomEditText f4347A;

    /* renamed from: B */
    private TextView f4348B;

    /* renamed from: C */
    private LinearLayout f4349C;

    /* renamed from: D */
    private FrameLayout f4350D;

    /* renamed from: E */
    public C3531zj f4351E;

    /* renamed from: F */
    public C0655o1 f4352F;

    /* renamed from: G */
    private C3264tj f4353G;

    /* renamed from: H */
    private String f4354H;

    /* renamed from: I */
    private String f4355I;

    /* renamed from: J */
    private C3489yj f4356J;

    /* renamed from: K */
    private boolean f4357K;

    /* renamed from: L */
    private LinearLayout.LayoutParams f4358L;

    /* renamed from: M */
    private Dialog f4359M;

    /* renamed from: N */
    public boolean f4360N;

    /* renamed from: O */
    public int f4361O;

    /* renamed from: P */
    private Cursor f4362P;

    /* renamed from: Q */
    private CharSequence f4363Q;

    /* renamed from: R */
    private int f4364R;

    /* renamed from: S */
    private boolean f4365S;

    /* renamed from: T */
    private boolean f4366T;

    /* renamed from: U */
    private C0669v0 f4367U;

    /* renamed from: V */
    private int f4368V;

    /* renamed from: W */
    private int f4369W;

    /* renamed from: X */
    private boolean f4370X;

    /* renamed from: Y */
    private String f4371Y;

    /* renamed from: Z */
    private String f4372Z;

    /* renamed from: a0 */
    private int f4373a0;

    /* renamed from: b0 */
    private View.OnFocusChangeListener f4374b0;

    /* renamed from: c0 */
    private TextWatcher f4375c0;

    /* renamed from: x */
    private ImageView f4376x;

    /* renamed from: y */
    private ImageView f4377y;

    /* renamed from: z */
    private ImageView f4378z;

    /* renamed from: com.comviva.webaxn.ui.v$a */
    /* loaded from: classes.dex */
    class a implements View.OnFocusChangeListener {

        /* renamed from: com.comviva.webaxn.ui.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC3557a implements Runnable {
            RunnableC3557a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0668v.this.f4352F.m4825s().setRenderingInstance(C0668v.this.f4352F);
                if (C0668v.this.f4356J.f14202c) {
                    C0668v c0668v = C0668v.this;
                    C0755x1.m6152a(c0668v.f4045c, c0668v.f4356J, C0668v.this.f4347A);
                }
            }
        }

        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C0668v.this.f4365S = z;
            String m5034m = C0668v.this.m5034m();
            if (z && C0668v.this.f4356J.f14261w != null) {
                C0668v.this.f4356J.f14197a0.f4057o = true;
                C0668v.this.f4356J.f14197a0.f4056n = AbstractC0652n1.f4039s;
            }
            if (!z && C0668v.this.f4356J.f14263x != null) {
                C0668v.this.f4356J.f14197a0.f4057o = false;
                C0668v.this.f4356J.f14197a0.f4056n = AbstractC0652n1.f4040t;
            }
            C0668v c0668v = C0668v.this;
            c0668v.f4049g.mo4849b(c0668v);
            if (z) {
                if (C0668v.this.f4356J.f14165K0 == 8 && C0668v.this.f4356J.f14167L0 != null && !TextUtils.isEmpty(C0668v.this.f4356J.f14167L0.m3410e())) {
                    C0668v.this.f4347A.setBackgroundDrawable(C0668v.this.f4045c.getResources().getDrawable(C0668v.this.f4045c.getResources().getIdentifier(C0668v.this.f4356J.f14167L0.m3410e(), "drawable", C0668v.this.f4045c.getPackageName())));
                }
                if (C0668v.this.f4366T && !TextUtils.isEmpty(m5034m)) {
                    if (!TextUtils.isEmpty(C0668v.this.f4356J.f14183T0) && m5034m.contains(C0668v.this.f4356J.f14183T0)) {
                        m5034m = m5034m.substring(C0668v.this.f4356J.f14183T0.length(), m5034m.length());
                    }
                    if (!TextUtils.isEmpty(C0668v.this.f4356J.f14185U0) && m5034m.contains(C0668v.this.f4356J.f14185U0)) {
                        m5034m = m5034m.substring(0, m5034m.length() - C0668v.this.f4356J.f14185U0.length());
                    }
                    C0668v.this.f4366T = false;
                    C0668v.this.m5029f(m5034m);
                }
                if (!TextUtils.isEmpty(C0668v.this.m5034m()) || C0668v.this.f4356J.f14161I0 == null) {
                    C0668v.this.f4347A.setError(null, null);
                } else {
                    C0668v.this.f4347A.setError(C0668v.this.f4356J.f14161I0, null);
                }
                C0668v c0668v2 = C0668v.this;
                c0668v2.f4049g.mo4843a(c0668v2.f4356J);
            } else {
                if (C0668v.this.f4356J.f14165K0 == 8 && C0668v.this.f4356J.f14167L0 != null) {
                    C0668v.this.f4347A.setBackgroundDrawable(C0668v.this.f4047e);
                }
                C0668v.this.f4347A.setError(null, null);
                if (!TextUtils.isEmpty(m5034m)) {
                    C0668v.this.m5029f(m5034m);
                }
            }
            if (z) {
                C0668v.this.f4347A.post(new RunnableC3557a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.v$b */
    /* loaded from: classes.dex */
    public class b extends CursorAdapter {
        b(Context context, Cursor cursor) {
            super(context, cursor);
        }

        @Override // android.widget.CursorAdapter
        public void bindView(View view, Context context, Cursor cursor) {
            TextView textView = (TextView) view.findViewById(R.id.name);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setScaleType(C0668v.this.f4356J.f14204c1 == -1 ? ImageView.ScaleType.FIT_XY : C0755x1.m6165b(C0668v.this.f4356J.f14204c1));
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
    /* renamed from: com.comviva.webaxn.ui.v$c */
    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f4382b;

        c(WebAxnActivity webAxnActivity) {
            this.f4382b = webAxnActivity;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            String str2 = (String) view.getTag();
            String str3 = C0668v.this.m5034m().toString();
            int i2 = 0;
            if (str3 == null || str3.length() <= 0) {
                str = str2;
            } else {
                C0668v.this.f4347A.getSelectionStart();
                int selectionEnd = C0668v.this.f4347A.getSelectionEnd();
                String substring = str3.substring(selectionEnd, str3.length());
                str = str3.substring(0, selectionEnd) + str2 + substring;
                i2 = selectionEnd;
            }
            C0668v.this.f4363Q = str;
            C0668v.this.f4347A.setText(str);
            C0668v.this.f4347A.setSelection(i2 + str2.length());
            if (C0668v.this.f4359M != null) {
                C0668v.this.f4359M.dismiss();
            }
            C0668v.this.f4362P.close();
            C0023aj.m160a(this.f4382b).close();
            C0668v.this.f4362P = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.v$d */
    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f4384b;

        d(WebAxnActivity webAxnActivity) {
            this.f4384b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (C0668v.this.f4359M != null) {
                C0668v.this.f4359M.dismiss();
            }
            C0668v.this.f4362P.close();
            C0023aj.m160a(this.f4384b).close();
            C0668v.this.f4362P = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.v$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0668v.this.f4347A.requestFocus();
            C0668v.this.f4347A.setSelection(C0668v.this.f4347A.getText().length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.v$f */
    /* loaded from: classes.dex */
    public class f implements ActionMode.Callback {
        f(C0668v c0668v) {
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

    /* renamed from: com.comviva.webaxn.ui.v$g */
    /* loaded from: classes.dex */
    class g implements TextWatcher {
        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C0668v.this.f4372Z != null) {
                C0668v.this.f4347A.removeTextChangedListener(this);
                String m5023b = C0668v.this.m5023b(editable.toString());
                int selectionEnd = C0668v.this.f4347A.getSelectionEnd();
                C0668v.this.f4347A.setText(m5023b);
                int length = selectionEnd + (m5023b.length() - editable.length());
                if (length < 0) {
                    length = 0;
                }
                C0668v.this.f4347A.setSelection(length);
            }
            C0668v c0668v = C0668v.this;
            if (c0668v.f4360N) {
                if (C3530zi.f14470m) {
                    c0668v.m5014a(5, (Drawable) null);
                } else {
                    c0668v.m5016a(c0668v.f4047e);
                }
                C0668v.this.f4360N = false;
            }
            if (C0668v.f4346e0 || C0668v.this.f4364R == 0) {
                C0668v.f4346e0 = false;
                return;
            }
            if (C0668v.this.m5034m().length() >= C0668v.this.f4356J.f14180S) {
                C0668v.f4346e0 = true;
                if (C0668v.this.f4363Q != null) {
                    C0668v c0668v2 = C0668v.this;
                    c0668v2.m5029f(c0668v2.f4363Q.toString());
                    C0668v.this.f4347A.setSelection(C0668v.this.f4363Q.length());
                }
                if (C0668v.this.f4356J.f14165K0 == 4 && !TextUtils.isEmpty(C0668v.this.f4356J.f14167L0.m3410e())) {
                    C0668v.this.f4347A.setBackgroundDrawable(C0668v.this.f4045c.getResources().getDrawable(C0668v.this.f4045c.getResources().getIdentifier(C0668v.this.f4356J.f14167L0.m3410e(), "drawable", C0668v.this.f4045c.getPackageName())));
                }
                C0668v c0668v3 = C0668v.this;
                C0755x1.p pVar = c0668v3.f4049g;
                if (pVar != null) {
                    pVar.mo4848a(c0668v3.f4356J, C0668v.this.f4356J.f14265y, C0668v.this.f4356J.f14186V);
                }
            } else if (C0668v.this.f4356J.f14165K0 == 4 && !TextUtils.isEmpty(C0668v.this.f4356J.f14167L0.m3410e())) {
                C0668v.this.f4347A.setBackgroundDrawable(C0668v.this.f4047e);
            }
            if (C0668v.this.f4371Y.equals(C0668v.this.m5034m().toString())) {
                C0668v c0668v4 = C0668v.this;
                if (c0668v4.f4352F.m4795a(c0668v4.f4356J.f14213f1, C0668v.this.f4356J.f14186V)) {
                    C0668v c0668v5 = C0668v.this;
                    c0668v5.f4049g.mo4842a(c0668v5.f4356J.f14216g1, C0668v.this.f4356J);
                }
                C0668v.this.f4370X = false;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length;
            if (charSequence.length() == C0668v.this.f4356J.f14180S) {
                C0668v.this.f4363Q = charSequence.subSequence(0, charSequence.length());
            }
            if (!TextUtils.isEmpty(C0668v.this.f4356J.f14181S0)) {
                if (C0668v.this.f4356J.f14165K0 == 2) {
                    C0668v c0668v = C0668v.this;
                    c0668v.f4364R = c0668v.f4356J.f14180S - C0668v.this.m5034m().length();
                    if (C0668v.this.f4364R >= 0) {
                        length = C0668v.this.f4364R;
                        C0755x1.m6154a(String.valueOf(length), C0668v.this.f4356J.f14181S0, C0668v.this.f4351E);
                    }
                } else if (C0668v.this.f4356J.f14165K0 == 3 && C0668v.this.m5034m().length() < C0668v.this.f4356J.f14180S) {
                    length = C0668v.this.m5034m().length();
                    C0755x1.m6154a(String.valueOf(length), C0668v.this.f4356J.f14181S0, C0668v.this.f4351E);
                }
            }
            if (C0668v.this.f4370X || TextUtils.isEmpty(C0668v.this.f4356J.f14213f1)) {
                return;
            }
            C0668v c0668v2 = C0668v.this;
            if (c0668v2.f4352F.m4805b(c0668v2.f4356J.f14213f1, C0668v.this.f4356J.f14186V)) {
                C0668v c0668v3 = C0668v.this;
                c0668v3.f4049g.mo4842a(c0668v3.f4356J.f14213f1, C0668v.this.f4356J);
            }
            C0668v.this.f4370X = true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.v$h */
    /* loaded from: classes.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0668v c0668v = C0668v.this;
            c0668v.m5015a(c0668v.f4356J.f14178R, true);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.v$i */
    /* loaded from: classes.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0722m1.m5887a(C0668v.this.f4045c, new String[]{"android.permission.READ_CONTACTS"})) {
                C0668v c0668v = C0668v.this;
                C0731p1.m5949a(c0668v.f4045c, c0668v.f4347A.getId());
                return;
            }
            if (C0713j1.m5563a(C0668v.this.f4045c).m5647d("android.permission.READ_CONTACTS") == -1) {
                C0722m1.m5885a((Activity) C0668v.this.f4045c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            } else {
                if (!C0722m1.m5886a(C0668v.this.f4045c, "android.permission.READ_CONTACTS")) {
                    C0755x1.m6181d(C0668v.this.f4045c, "msg.rpCon");
                    return;
                }
                C0722m1.m5885a((Activity) C0668v.this.f4045c, new String[]{"android.permission.READ_CONTACTS"}, 3);
            }
            C0755x1.f5264v = true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.v$j */
    /* loaded from: classes.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0668v.this.f4359M != null && C0668v.this.f4359M.isShowing()) {
                C0668v.this.f4359M.dismiss();
                C0668v.this.f4359M = null;
            }
            C0668v.this.m5018a(view);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.v$k */
    /* loaded from: classes.dex */
    class k implements View.OnTouchListener {
        k(C0668v c0668v) {
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

    /* renamed from: com.comviva.webaxn.ui.v$l */
    /* loaded from: classes.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0668v.this.f4347A.addTextChangedListener(C0668v.this.f4375c0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.v$m */
    /* loaded from: classes.dex */
    class m implements TextView.OnEditorActionListener {
        m() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            C0668v c0668v;
            C0755x1.p pVar;
            if (i == 6 || i != 5 || (pVar = (c0668v = C0668v.this).f4049g) == null) {
                return false;
            }
            return pVar.mo4848a(c0668v.f4356J, C0668v.this.f4356J.f14265y, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.v$n */
    /* loaded from: classes.dex */
    public class n implements Runnable {

        /* renamed from: b */
        final /* synthetic */ byte[] f4393b;

        n(byte[] bArr) {
            this.f4393b = bArr;
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
            C0687b.m5342a(C0668v.this.f4045c).m5343a().m5544a();
            int identifier = !TextUtils.isEmpty(C0668v.this.f4356J.f14248r0) ? C0668v.this.f4045c.getResources().getIdentifier(C0668v.this.f4356J.f14248r0, "drawable", C0668v.this.f4045c.getPackageName()) : 0;
            try {
                if (identifier > 0) {
                    Bitmap m5429a = C0698e1.m5426b(C0668v.this.f4045c).m5429a(C0668v.this.f4356J.f14248r0);
                    if (m5429a == null && (m5429a = BitmapFactory.decodeResource(C0668v.this.f4045c.getResources(), identifier)) != null) {
                        C0698e1.m5426b(C0668v.this.f4045c).m5432a(C0668v.this.f4356J.f14248r0, m5429a);
                    }
                    if (NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk())) {
                        C0668v.this.f4047e = new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null);
                    } else {
                        C0668v.this.f4047e = new BitmapDrawable(m5429a);
                    }
                    C0668v.this.f4347A.setBackgroundDrawable(C0668v.this.f4047e);
                    if (C0668v.this.m5037p()) {
                        C0668v.this.m5036o();
                        return;
                    }
                    if (C0668v.this.f4356J.f14152E) {
                        customEditText2 = C0668v.this.f4347A;
                        i5 = C0668v.this.f4048f.f4218a;
                        i6 = C0668v.this.f4048f.f4219b;
                        i7 = C0668v.this.f4048f.f4220c;
                        i8 = C0668v.this.f4048f.f4221d;
                    } else {
                        customEditText2 = C0668v.this.f4347A;
                        i5 = C0668v.this.f4361O;
                        i6 = C0668v.this.f4361O;
                        i7 = C0668v.this.f4361O;
                        i8 = C0668v.this.f4361O;
                    }
                    customEditText2.setPadding(i5, i6, i7, i8);
                    return;
                }
                if (this.f4393b != null) {
                    Bitmap m5429a2 = C0698e1.m5426b(C0668v.this.f4045c).m5429a(C0668v.this.f4356J.f14172O);
                    if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(this.f4393b, 0, this.f4393b.length)) != null) {
                        C0698e1.m5426b(C0668v.this.f4045c).m5432a(C0668v.this.f4356J.f14172O, m5429a2);
                    }
                    if (NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk())) {
                        C0668v.this.f4047e = new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null);
                    } else {
                        C0668v.this.f4047e = new BitmapDrawable(m5429a2);
                    }
                    C0668v.this.f4347A.setBackgroundDrawable(C0668v.this.f4047e);
                    if (C0668v.this.m5037p()) {
                        C0668v.this.m5036o();
                        return;
                    }
                    if (C0668v.this.f4356J.f14152E) {
                        customEditText = C0668v.this.f4347A;
                        i = C0668v.this.f4048f.f4218a;
                        i2 = C0668v.this.f4048f.f4219b;
                        i3 = C0668v.this.f4048f.f4220c;
                        i4 = C0668v.this.f4048f.f4221d;
                    } else {
                        customEditText = C0668v.this.f4347A;
                        i = C0668v.this.f4361O;
                        i2 = C0668v.this.f4361O;
                        i3 = C0668v.this.f4361O;
                        i4 = C0668v.this.f4361O;
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
    public C0668v(android.content.Context r5, p000.C3489yj r6, com.comviva.webaxn.p002ui.C0669v0 r7, com.comviva.webaxn.p002ui.C0655o1 r8) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0668v.<init>(android.content.Context, yj, com.comviva.webaxn.ui.v0, com.comviva.webaxn.ui.o1):void");
    }

    /* renamed from: v */
    private void m5010v() {
        this.f4347A.setCustomSelectionActionModeCallback(new f(this));
        this.f4347A.setLongClickable(false);
        this.f4347A.setTextIsSelectable(false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001c. Please report as an issue. */
    /* renamed from: a */
    public int m5011a(int i2, boolean z, String str) {
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
            this.f4347A.setEnabled(false);
            this.f4347A.setFocusable(false);
            this.f4347A.setFocusableInTouchMode(false);
            i2 = i3;
        }
        PasswordTransformationMethod passwordTransformationMethod = null;
        switch (i2) {
            case 1:
                if (z) {
                    customEditText2 = this.f4347A;
                    i4 = 131073;
                    customEditText2.setInputType(i4);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                    customEditText3 = this.f4347A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                    break;
                } else {
                    customEditText = this.f4347A;
                    customEditText.setInputType(i7);
                    customEditText3 = this.f4347A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                }
            case 2:
                if (z) {
                    customEditText2 = this.f4347A;
                    i4 = 131074;
                    customEditText2.setInputType(i4);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                    customEditText3 = this.f4347A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                    break;
                } else {
                    customEditText = this.f4347A;
                    i7 = 2;
                    customEditText.setInputType(i7);
                    customEditText3 = this.f4347A;
                    customEditText3.setTransformationMethod(passwordTransformationMethod);
                }
            case 3:
                if (z) {
                    this.f4347A.setInputType(131201);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                } else {
                    this.f4347A.setInputType(129);
                }
                customEditText3 = this.f4347A;
                passwordTransformationMethod = new PasswordTransformationMethod();
                customEditText3.setTransformationMethod(passwordTransformationMethod);
                break;
            case 4:
                if (!z) {
                    customEditText4 = this.f4347A;
                    i5 = 8194;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.f4347A;
                    i6 = 139266;
                    customEditText5.setInputType(i6);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                    break;
                }
            case 6:
                if (z) {
                    this.f4347A.setInputType(131202);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                } else {
                    this.f4347A.setInputType(130);
                }
                customEditText3 = this.f4347A;
                passwordTransformationMethod = new PasswordTransformationMethod();
                customEditText3.setTransformationMethod(passwordTransformationMethod);
                break;
            case 7:
                if (!z) {
                    customEditText4 = this.f4347A;
                    i5 = 32;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.f4347A;
                    i6 = 131104;
                    customEditText5.setInputType(i6);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                    break;
                }
            case 8:
                if (!z) {
                    customEditText4 = this.f4347A;
                    i5 = 3;
                    customEditText4.setInputType(i5);
                    break;
                } else {
                    customEditText5 = this.f4347A;
                    i6 = 131075;
                    customEditText5.setInputType(i6);
                    this.f4347A.setVerticalScrollBarEnabled(true);
                    break;
                }
        }
        return i2;
    }

    /* renamed from: a */
    public int m5012a(C0669v0 c0669v0) {
        int m16637c = this.f4356J.m16637c(c0669v0.f4397c.height());
        int m16645k = this.f4356J.m16645k(c0669v0.f4397c.width());
        int i2 = -2;
        if (m16637c < 0) {
            m16637c = -2;
        }
        int m16638d = m16645k < 0 ? -1 : m16645k - (this.f4356J.m16638d(c0669v0.f4397c.width()) + this.f4356J.m16641g(c0669v0.f4397c.width()));
        C3489yj c3489yj = this.f4356J;
        if (c3489yj.f14164K) {
            this.f4347A.setLines(c3489yj.f14251s0);
        } else {
            i2 = m16637c;
        }
        this.f4347A.getLayoutParams().width = m16638d;
        this.f4347A.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4347A.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f4347A.getMeasuredHeight();
        ImageView imageView = this.f4376x;
        if (imageView != null) {
            imageView.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.f4376x.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.f4347A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        ImageView imageView2 = this.f4377y;
        if (imageView2 != null) {
            imageView2.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.f4377y.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.f4347A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        if (this.f4378z != null) {
            if (i2 <= 0) {
                i2 = measuredHeight;
            }
            this.f4368V = i2;
            this.f4378z.getLayoutParams().height = this.f4368V;
            this.f4378z.getLayoutParams().width = this.f4368V;
            m5036o();
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4349C.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.f4054l = this.f4349C.getMeasuredWidth();
        int measuredHeight2 = this.f4349C.getMeasuredHeight();
        this.f4053k = measuredHeight2;
        return measuredHeight2;
    }

    /* renamed from: a */
    public void m5013a(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4347A.setLetterSpacing(f2);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4314a(int i2) {
        super.mo4314a(i2);
        C3489yj c3489yj = this.f4356J;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(this.f4053k);
            Drawable m6122a = C0755x1.m6122a(this.f4356J.f14173O0, AbstractC0652n1.m4701d(i2));
            this.f4047e = m6122a;
            this.f4347A.setBackgroundDrawable(m6122a);
        } else if (c3489yj.f14241p.m6071j()) {
            this.f4347A.setBackgroundColor(AbstractC0652n1.m4701d(i2));
        }
        this.f4047e = this.f4347A.getBackground();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r2.f4055m != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2.f4347A.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r4, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r2.f4347A.setCompoundDrawablesWithIntrinsicBounds(r4, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
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
    public void m5014a(int r3, android.graphics.drawable.Drawable r4) {
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
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4347A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)
            goto L33
        L13:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4347A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r4)
            goto L33
        L19:
            boolean r3 = r2.f4055m
            if (r3 == 0) goto L28
            goto L2e
        L1e:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4347A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r4, r1, r1)
            goto L33
        L24:
            boolean r3 = r2.f4055m
            if (r3 == 0) goto L2e
        L28:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4347A
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r4, r1)
            goto L33
        L2e:
            com.comviva.webaxn.ui.CustomEditText r3 = r2.f4347A
            r3.setCompoundDrawablesWithIntrinsicBounds(r4, r1, r1, r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0668v.m5014a(int, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r8 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r7.f4369W = r0;
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5015a(int r8, boolean r9) {
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
            yj r8 = r7.f4356J
            r8.f14178R = r6
            if (r9 == 0) goto L55
            int r8 = r8.f14165K0
            if (r8 != r5) goto L25
            goto L4e
        L25:
            if (r8 != r4) goto L55
            goto L43
        L28:
            yj r8 = r7.f4356J
            r8.f14178R = r3
            if (r9 == 0) goto L55
            int r8 = r8.f14165K0
            if (r8 != r5) goto L33
            goto L4e
        L33:
            if (r8 != r4) goto L55
            goto L43
        L36:
            yj r8 = r7.f4356J
            r8.f14178R = r5
            if (r9 == 0) goto L55
            int r8 = r8.f14165K0
            if (r8 != r5) goto L41
            goto L4e
        L41:
            if (r8 != r4) goto L55
        L43:
            goto L53
        L44:
            yj r8 = r7.f4356J
            r8.f14178R = r2
            if (r9 == 0) goto L55
            int r8 = r8.f14165K0
            if (r8 != r5) goto L51
        L4e:
            r7.f4369W = r1
            goto L55
        L51:
            if (r8 != r4) goto L55
        L53:
            r7.f4369W = r0
        L55:
            if (r9 == 0) goto L60
            android.widget.ImageView r8 = r7.f4378z
            if (r8 == 0) goto L60
            int r9 = r7.f4369W
            r8.setImageResource(r9)
        L60:
            yj r8 = r7.f4356J
            int r9 = r8.f14178R
            boolean r0 = r8.f14164K
            java.lang.String r8 = r8.f14229l
            r7.m5011a(r9, r0, r8)
            java.lang.String r8 = r7.m5034m()
            int r8 = r8.length()
            r7.m5030g(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0668v.m5015a(int, boolean):void");
    }

    /* renamed from: a */
    public void m5016a(Drawable drawable) {
        this.f4347A.setBackgroundDrawable(drawable);
        if (m5037p()) {
            m5036o();
            return;
        }
        if (this.f4356J.f14152E) {
            CustomEditText customEditText = this.f4347A;
            C0657p0 c0657p0 = this.f4048f;
            customEditText.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        } else {
            CustomEditText customEditText2 = this.f4347A;
            int i2 = this.f4361O;
            customEditText2.setPadding(i2, i2, i2, i2);
        }
    }

    /* renamed from: a */
    public void m5017a(Spanned spanned) {
        this.f4347A.setText(spanned);
    }

    /* renamed from: a */
    public void m5018a(View view) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) this.f4045c;
        Cursor m206j = C0023aj.m160a(webAxnActivity).m206j();
        this.f4362P = m206j;
        if (m206j == null || webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setTitle("Insert smiley");
        ListView listView = new ListView(webAxnActivity);
        listView.setScrollingCacheEnabled(false);
        listView.setAdapter((ListAdapter) new b(webAxnActivity, this.f4362P));
        listView.setOnItemClickListener(new c(webAxnActivity));
        builder.setView(listView);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnCancelListener(new d(webAxnActivity));
        create.show();
        this.f4359M = create;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int length;
        int m16637c = this.f4356J.m16637c(c0669v0.f4397c.height());
        int m16645k = this.f4356J.m16645k(c0669v0.f4397c.width());
        int i2 = -2;
        if (m16637c < 0) {
            m16637c = -2;
        }
        int m16638d = m16645k < 0 ? -1 : m16645k - (this.f4356J.m16638d(c0669v0.f4397c.width()) + this.f4356J.m16641g(c0669v0.f4397c.width()));
        C3489yj c3489yj = this.f4356J;
        if (c3489yj.f14164K) {
            this.f4347A.setLines(c3489yj.f14251s0);
        } else {
            i2 = m16637c;
        }
        this.f4347A.getLayoutParams().width = m16638d;
        this.f4347A.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4347A.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f4347A.getMeasuredHeight();
        ImageView imageView = this.f4376x;
        if (imageView != null) {
            imageView.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.f4376x.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.f4347A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        ImageView imageView2 = this.f4377y;
        if (imageView2 != null) {
            imageView2.getLayoutParams().height = i2 > 0 ? i2 : measuredHeight;
            this.f4377y.getLayoutParams().width = i2 > 0 ? i2 : measuredHeight;
            this.f4347A.getLayoutParams().width -= i2 > 0 ? i2 : measuredHeight;
        }
        if (this.f4378z != null) {
            if (i2 > 0) {
                measuredHeight = i2;
            }
            this.f4368V = measuredHeight;
            this.f4378z.getLayoutParams().height = this.f4368V;
            this.f4378z.getLayoutParams().width = this.f4368V;
            m5036o();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m16638d, i2);
        C3489yj c3489yj2 = this.f4356J;
        layoutParams.gravity = C0755x1.m6116a(c3489yj2.f14214g, c3489yj2.f14217h, this.f4055m);
        layoutParams.setMargins(this.f4356J.m16638d(c0669v0.f4397c.width()), this.f4356J.m16643i(c0669v0.f4397c.width()), this.f4356J.m16641g(c0669v0.f4397c.width()), this.f4356J.m16632a(c0669v0.f4397c.width()));
        this.f4349C.setLayoutParams(layoutParams);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4349C.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.f4054l = this.f4349C.getMeasuredWidth();
        this.f4053k = this.f4349C.getMeasuredHeight();
        C3489yj c3489yj3 = this.f4356J;
        if (c3489yj3.f14181S0 != null) {
            int i3 = c3489yj3.f14165K0;
            if (i3 == 2) {
                length = c3489yj3.f14180S - m5034m().length();
                this.f4364R = length;
                if (length < 0) {
                    return;
                }
            } else if (i3 != 3 || m5034m().length() >= this.f4356J.f14180S) {
                return;
            } else {
                length = m5034m().length();
            }
            C0755x1.m6154a(String.valueOf(length), this.f4356J.f14181S0, this.f4351E);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4048f = c0657p0;
        if (this.f4356J.f14152E) {
            this.f4347A.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4595a(C0755x1.p pVar) {
        this.f4049g = pVar;
        this.f4347A.m4016a(pVar, this.f4356J, this.f4351E);
    }

    /* renamed from: a */
    public void m5019a(String str, String str2) {
        this.f4347A.setGravity(C0755x1.m6116a(str, str2, this.f4055m));
    }

    /* renamed from: a */
    public void m5020a(C3264tj c3264tj) {
        this.f4353G = c3264tj;
        if (c3264tj == null || TextUtils.isEmpty(c3264tj.f13319f)) {
            return;
        }
        this.f4354H = this.f4353G.f13319f;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        C2475fj c2475fj;
        C2515gj c2515gj;
        C2597ij c2597ij = c3489yj.f14228k1;
        if ((c2597ij == null || !c2597ij.m12477i()) && (((c2475fj = c3489yj.f14231l1) == null || !c2475fj.m11787h()) && ((c2515gj = c3489yj.f14234m1) == null || !c2515gj.m12028i()))) {
            m5022a(c3489yj.f14260v0);
            return;
        }
        C2597ij c2597ij2 = c3489yj.f14228k1;
        if (c2597ij2 != null && c2597ij2.m12477i()) {
            this.f4356J.f14228k1.m12462a(c3489yj.f14228k1.m12463a());
            c3489yj.f14228k1.m12467b(false);
            return;
        }
        C2475fj c2475fj2 = c3489yj.f14231l1;
        if (c2475fj2 != null && c2475fj2.m11787h()) {
            this.f4356J.f14231l1.m11772a(c3489yj.f14231l1.m11773a());
            c3489yj.f14231l1.m11777b(false);
            return;
        }
        C2515gj c2515gj2 = c3489yj.f14234m1;
        if (c2515gj2 == null || !c2515gj2.m12028i()) {
            return;
        }
        this.f4356J.f14234m1.m12012a(c3489yj.f14234m1.m12013a());
        c3489yj.f14234m1.m12017b(false);
    }

    /* renamed from: a */
    public void m5021a(boolean z) {
        this.f4347A.setCursorVisible(z);
    }

    /* renamed from: a */
    public void m5022a(byte[] bArr) {
        this.f4347A.post(new n(bArr));
    }

    /* renamed from: b */
    public String m5023b(String str) {
        if (this.f4372Z == null || this.f4373a0 <= 0 || TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        String replaceAll = str.replaceAll(this.f4372Z, "");
        if (this.f4356J.f14178R == 4 && replaceAll.contains(".")) {
            int indexOf = replaceAll.indexOf(".");
            str2 = replaceAll.substring(indexOf);
            replaceAll = replaceAll.substring(0, indexOf);
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(this.f4372Z);
        int i2 = 0;
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            if (i2 == this.f4373a0) {
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
        this.f4044b.removeView(this.f4349C);
    }

    /* renamed from: b */
    public void m5024b(float f2) {
        this.f4347A.setTextSize(f2);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i2) {
        super.mo4176b(i2);
        this.f4347A.setTextColor(AbstractC0652n1.m4701d(i2));
    }

    /* renamed from: b */
    public void m5025b(C3489yj c3489yj) {
        this.f4356J = c3489yj;
        this.f4357K = c3489yj.f14182T;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        if (this.f4347A.isEnabled()) {
            this.f4347A.setEnabled(false);
            this.f4347A.setFocusable(false);
            this.f4347A.setFocusableInTouchMode(false);
        }
        ImageView imageView = this.f4376x;
        if (imageView != null) {
            imageView.setEnabled(false);
            this.f4376x.setFocusable(false);
            this.f4376x.setFocusableInTouchMode(false);
        }
        ImageView imageView2 = this.f4377y;
        if (imageView2 != null) {
            imageView2.setEnabled(false);
            this.f4377y.setFocusable(false);
            this.f4377y.setFocusableInTouchMode(false);
        }
        C3489yj c3489yj = this.f4356J;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4349C, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m5026c(String str) {
        this.f4355I = str;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        if (!this.f4347A.isEnabled()) {
            this.f4347A.setEnabled(true);
            this.f4347A.setFocusable(true);
            this.f4347A.setFocusableInTouchMode(true);
        }
        ImageView imageView = this.f4376x;
        if (imageView != null) {
            imageView.setEnabled(true);
            this.f4376x.setFocusable(true);
            this.f4376x.setFocusableInTouchMode(true);
        }
        ImageView imageView2 = this.f4377y;
        if (imageView2 != null) {
            imageView2.setEnabled(true);
            this.f4377y.setFocusable(true);
            this.f4377y.setFocusableInTouchMode(true);
        }
        if (this.f4356J.f14210e1) {
            AbstractC0652n1.m4697a(this.f4349C, AbstractC0652n1.f4038r);
            this.f4356J.f14210e1 = false;
        }
    }

    /* renamed from: d */
    public void m5027d(String str) {
        this.f4347A.setHint(str);
    }

    /* renamed from: e */
    public void m5028e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4356J.f14267z = str;
        }
        this.f4347A.post(new e());
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4356J;
    }

    /* renamed from: f */
    public void m5029f(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i2 = this.f4356J.f14180S;
            if (length > i2) {
                str = str.substring(0, i2);
            }
        }
        this.f4363Q = str;
        if (!TextUtils.isEmpty(str) && !this.f4365S) {
            if (!TextUtils.isEmpty(this.f4356J.f14183T0)) {
                str = this.f4356J.f14183T0 + str;
                this.f4366T = true;
            }
            if (!TextUtils.isEmpty(this.f4356J.f14185U0)) {
                str = str + this.f4356J.f14185U0;
                this.f4366T = true;
            }
        }
        this.f4347A.setText(str);
    }

    /* renamed from: g */
    public void m5030g(int i2) {
        int i3 = this.f4356J.f14180S;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f4347A.setSelection(i2);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4349C;
    }

    /* renamed from: h */
    public void m5031h(int i2) {
        this.f4347A.setHintTextColor(AbstractC0652n1.m4701d(i2));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    /* renamed from: i */
    public void m5032i(int i2) {
        this.f4347A.setTypeface(this.f4356J.f14241p.m6069h(), AbstractC0652n1.m4702e(i2));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    /* renamed from: j */
    public void m5033j(int i2) {
        if (i2 == 1) {
            this.f4347A.setGravity(17);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        String str;
        AbstractC0652n1 abstractC0652n1;
        String m5034m = m5034m();
        int length = m5034m.length();
        boolean z = true;
        if (this.f4357K && (length == 0 || m5034m.trim().length() == 0)) {
            m5035n();
            if (C3530zi.f14470m) {
                C0755x1.m6185e(this.f4045c, "msg.empty");
            }
            return false;
        }
        C3264tj c3264tj = this.f4353G;
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
            int i2 = this.f4353G.f13318e;
            if (i2 <= 0 || length >= i2) {
                C3264tj c3264tj2 = this.f4353G;
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
            m5042u();
        }
        return z;
    }

    /* renamed from: m */
    public String m5034m() {
        if (!TextUtils.isEmpty(this.f4355I)) {
            return this.f4355I;
        }
        String obj = this.f4347A.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return obj;
        }
        if (!TextUtils.isEmpty(this.f4356J.f14183T0) && obj.contains(this.f4356J.f14183T0)) {
            obj = obj.substring(this.f4356J.f14183T0.length(), obj.length());
        }
        if (!TextUtils.isEmpty(this.f4356J.f14185U0) && obj.contains(this.f4356J.f14185U0)) {
            obj = obj.substring(0, obj.length() - this.f4356J.f14185U0.length());
        }
        String str = this.f4372Z;
        return str != null ? obj.replaceAll(str, "") : obj;
    }

    /* renamed from: n */
    public void m5035n() {
        if (C3530zi.f14470m) {
            m5014a(3, this.f4045c.getResources().getDrawable(R.drawable.empty));
        } else {
            m5016a(this.f4045c.getResources().getDrawable(R.drawable.empty_error));
        }
        this.f4360N = true;
    }

    /* renamed from: o */
    public void m5036o() {
        C0482bj c0482bj = this.f4356J.f14167L0;
        if (c0482bj != null) {
            if (c0482bj.m3411f().equalsIgnoreCase("C") || this.f4356J.f14167L0.m3411f().equalsIgnoreCase("Center")) {
                if (this.f4356J.f14152E) {
                    CustomEditText customEditText = this.f4347A;
                    int i2 = this.f4368V;
                    C0657p0 c0657p0 = this.f4048f;
                    customEditText.setPadding(i2, c0657p0.f4219b, i2, c0657p0.f4221d);
                    return;
                }
                CustomEditText customEditText2 = this.f4347A;
                int i3 = this.f4368V;
                int i4 = this.f4361O;
                customEditText2.setPadding(i3, i4, i3, i4);
                return;
            }
            if (this.f4356J.f14167L0.m3411f().equalsIgnoreCase("L") || this.f4356J.f14167L0.m3411f().equalsIgnoreCase("Left") || this.f4356J.f14167L0.m3411f().equalsIgnoreCase("R") || this.f4356J.f14167L0.m3411f().equalsIgnoreCase("Right")) {
                if (!this.f4055m) {
                    if (this.f4356J.f14152E) {
                        CustomEditText customEditText3 = this.f4347A;
                        C0657p0 c0657p02 = this.f4048f;
                        customEditText3.setPadding(c0657p02.f4218a, c0657p02.f4219b, this.f4368V, c0657p02.f4221d);
                        return;
                    } else {
                        CustomEditText customEditText4 = this.f4347A;
                        int i5 = this.f4361O;
                        customEditText4.setPadding(i5, i5, this.f4368V, i5);
                        return;
                    }
                }
                if (this.f4356J.f14152E) {
                    CustomEditText customEditText5 = this.f4347A;
                    int i6 = this.f4368V;
                    C0657p0 c0657p03 = this.f4048f;
                    customEditText5.setPadding(i6, c0657p03.f4219b, c0657p03.f4220c, c0657p03.f4221d);
                    return;
                }
                CustomEditText customEditText6 = this.f4347A;
                int i7 = this.f4368V;
                int i8 = this.f4361O;
                customEditText6.setPadding(i7, i8, i8, i8);
            }
        }
    }

    /* renamed from: p */
    public boolean m5037p() {
        int i2 = this.f4356J.f14165K0;
        return i2 == 6 || i2 == 7;
    }

    /* renamed from: q */
    public void m5038q() {
        C2391dj c2391dj = this.f4356J.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: r */
    public void m5039r() {
        this.f4347A.setOnFocusChangeListener(null);
    }

    /* renamed from: s */
    public void m5040s() {
        this.f4356J.f14202c = true;
        this.f4347A.requestFocus();
    }

    /* renamed from: t */
    public void m5041t() {
        int length;
        if (this.f4044b != null) {
            C3489yj c3489yj = this.f4356J;
            if (c3489yj.f14154F == null && c3489yj.f14156G == null && c3489yj.f14158H == null) {
                String str = c3489yj.f14160I;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
            this.f4358L = layoutParams;
            C3489yj c3489yj2 = this.f4356J;
            layoutParams.gravity = C0755x1.m6116a(c3489yj2.f14214g, c3489yj2.f14217h, this.f4055m);
            this.f4358L.setMargins(this.f4356J.m16638d(this.f4367U.f4397c.width()), this.f4356J.m16643i(this.f4367U.f4397c.width()), this.f4356J.m16641g(this.f4367U.f4397c.width()), this.f4356J.m16632a(this.f4367U.f4397c.width()));
            this.f4044b.addView(this.f4349C, this.f4358L);
            if (this.f4356J.f14202c) {
                m5028e((String) null);
            }
            C3489yj c3489yj3 = this.f4356J;
            if (c3489yj3.f14181S0 != null) {
                int i2 = c3489yj3.f14165K0;
                if (i2 == 2) {
                    length = c3489yj3.f14180S - m5034m().length();
                    this.f4364R = length;
                    if (length < 0) {
                        return;
                    }
                } else if (i2 != 3 || m5034m().length() >= this.f4356J.f14180S) {
                    return;
                } else {
                    length = m5034m().length();
                }
                C0755x1.m6154a(String.valueOf(length), this.f4356J.f14181S0, this.f4351E);
            }
        }
    }

    /* renamed from: u */
    public void m5042u() {
        this.f4347A.setError(this.f4354H);
    }
}
