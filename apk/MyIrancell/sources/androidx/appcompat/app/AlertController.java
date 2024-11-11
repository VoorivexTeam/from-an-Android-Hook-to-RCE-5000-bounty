package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.C0170f0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f204A;

    /* renamed from: C */
    private Drawable f206C;

    /* renamed from: D */
    private ImageView f207D;

    /* renamed from: E */
    private TextView f208E;

    /* renamed from: F */
    private TextView f209F;

    /* renamed from: G */
    private View f210G;

    /* renamed from: H */
    ListAdapter f211H;

    /* renamed from: J */
    private int f213J;

    /* renamed from: K */
    private int f214K;

    /* renamed from: L */
    int f215L;

    /* renamed from: M */
    int f216M;

    /* renamed from: N */
    int f217N;

    /* renamed from: O */
    int f218O;

    /* renamed from: P */
    private boolean f219P;

    /* renamed from: R */
    Handler f221R;

    /* renamed from: a */
    private final Context f223a;

    /* renamed from: b */
    final DialogC0085e f224b;

    /* renamed from: c */
    private final Window f225c;

    /* renamed from: d */
    private final int f226d;

    /* renamed from: e */
    private CharSequence f227e;

    /* renamed from: f */
    private CharSequence f228f;

    /* renamed from: g */
    ListView f229g;

    /* renamed from: h */
    private View f230h;

    /* renamed from: i */
    private int f231i;

    /* renamed from: j */
    private int f232j;

    /* renamed from: k */
    private int f233k;

    /* renamed from: l */
    private int f234l;

    /* renamed from: m */
    private int f235m;

    /* renamed from: o */
    Button f237o;

    /* renamed from: p */
    private CharSequence f238p;

    /* renamed from: q */
    Message f239q;

    /* renamed from: r */
    private Drawable f240r;

    /* renamed from: s */
    Button f241s;

    /* renamed from: t */
    private CharSequence f242t;

    /* renamed from: u */
    Message f243u;

    /* renamed from: v */
    private Drawable f244v;

    /* renamed from: w */
    Button f245w;

    /* renamed from: x */
    private CharSequence f246x;

    /* renamed from: y */
    Message f247y;

    /* renamed from: z */
    private Drawable f248z;

    /* renamed from: n */
    private boolean f236n = false;

    /* renamed from: B */
    private int f205B = 0;

    /* renamed from: I */
    int f212I = -1;

    /* renamed from: Q */
    private int f220Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f222S = new ViewOnClickListenerC0058a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b */
        private final int f249b;

        /* renamed from: c */
        private final int f250c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
            this.f250c = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f249b = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m349a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f249b, getPaddingRight(), z2 ? getPaddingBottom() : this.f250c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0058a implements View.OnClickListener {
        ViewOnClickListenerC0058a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f237o
                if (r3 != r1) goto Lf
                android.os.Message r0 = r0.f239q
                if (r0 == 0) goto Lf
            La:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L2a
            Lf:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f241s
                if (r3 != r1) goto L1a
                android.os.Message r0 = r0.f243u
                if (r0 == 0) goto L1a
                goto La
            L1a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f245w
                if (r3 != r1) goto L29
                android.os.Message r3 = r0.f247y
                if (r3 == 0) goto L29
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L2a
            L29:
                r3 = 0
            L2a:
                if (r3 == 0) goto L2f
                r3.sendToTarget()
            L2f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f221R
                r1 = 1
                androidx.appcompat.app.e r3 = r3.f224b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.ViewOnClickListenerC0058a.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0059b implements NestedScrollView.InterfaceC0248b {

        /* renamed from: a */
        final /* synthetic */ View f252a;

        /* renamed from: b */
        final /* synthetic */ View f253b;

        C0059b(AlertController alertController, View view, View view2) {
            this.f252a = view;
            this.f253b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0248b
        /* renamed from: a */
        public void mo350a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m325a(nestedScrollView, this.f252a, this.f253b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0060c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f254b;

        /* renamed from: c */
        final /* synthetic */ View f255c;

        RunnableC0060c(View view, View view2) {
            this.f254b = view;
            this.f255c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m325a(AlertController.this.f204A, this.f254b, this.f255c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0061d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f257a;

        /* renamed from: b */
        final /* synthetic */ View f258b;

        C0061d(AlertController alertController, View view, View view2) {
            this.f257a = view;
            this.f258b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m325a(absListView, this.f257a, this.f258b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0062e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f259b;

        /* renamed from: c */
        final /* synthetic */ View f260c;

        RunnableC0062e(View view, View view2) {
            this.f259b = view;
            this.f260c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m325a(AlertController.this.f229g, this.f259b, this.f260c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0063f {

        /* renamed from: A */
        public int f262A;

        /* renamed from: B */
        public int f263B;

        /* renamed from: C */
        public int f264C;

        /* renamed from: D */
        public int f265D;

        /* renamed from: F */
        public boolean[] f267F;

        /* renamed from: G */
        public boolean f268G;

        /* renamed from: H */
        public boolean f269H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f271J;

        /* renamed from: K */
        public Cursor f272K;

        /* renamed from: L */
        public String f273L;

        /* renamed from: M */
        public String f274M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f275N;

        /* renamed from: O */
        public e f276O;

        /* renamed from: a */
        public final Context f277a;

        /* renamed from: b */
        public final LayoutInflater f278b;

        /* renamed from: d */
        public Drawable f280d;

        /* renamed from: f */
        public CharSequence f282f;

        /* renamed from: g */
        public View f283g;

        /* renamed from: h */
        public CharSequence f284h;

        /* renamed from: i */
        public CharSequence f285i;

        /* renamed from: j */
        public Drawable f286j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f287k;

        /* renamed from: l */
        public CharSequence f288l;

        /* renamed from: m */
        public Drawable f289m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f290n;

        /* renamed from: o */
        public CharSequence f291o;

        /* renamed from: p */
        public Drawable f292p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f293q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f295s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f296t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f297u;

        /* renamed from: v */
        public CharSequence[] f298v;

        /* renamed from: w */
        public ListAdapter f299w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f300x;

        /* renamed from: y */
        public int f301y;

        /* renamed from: z */
        public View f302z;

        /* renamed from: c */
        public int f279c = 0;

        /* renamed from: e */
        public int f281e = 0;

        /* renamed from: E */
        public boolean f266E = false;

        /* renamed from: I */
        public int f270I = -1;

        /* renamed from: r */
        public boolean f294r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f303b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f303b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0063f.this.f267F;
                if (zArr != null && zArr[i]) {
                    this.f303b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: b */
            private final int f305b;

            /* renamed from: c */
            private final int f306c;

            /* renamed from: d */
            final /* synthetic */ RecycleListView f307d;

            /* renamed from: e */
            final /* synthetic */ AlertController f308e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f307d = recycleListView;
                this.f308e = alertController;
                Cursor cursor2 = getCursor();
                this.f305b = cursor2.getColumnIndexOrThrow(C0063f.this.f273L);
                this.f306c = cursor2.getColumnIndexOrThrow(C0063f.this.f274M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f305b));
                this.f307d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f306c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0063f.this.f278b.inflate(this.f308e.f216M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ AlertController f310b;

            c(AlertController alertController) {
                this.f310b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0063f.this.f300x.onClick(this.f310b.f224b, i);
                if (C0063f.this.f269H) {
                    return;
                }
                this.f310b.f224b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f312b;

            /* renamed from: c */
            final /* synthetic */ AlertController f313c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f312b = recycleListView;
                this.f313c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0063f.this.f267F;
                if (zArr != null) {
                    zArr[i] = this.f312b.isItemChecked(i);
                }
                C0063f.this.f271J.onClick(this.f313c.f224b, i, this.f312b.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface e {
            /* renamed from: a */
            void m353a(ListView listView);
        }

        public C0063f(Context context) {
            this.f277a = context;
            this.f278b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m351b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f278b
                int r1 = r11.f215L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f268G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.f272K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f277a
                int r4 = r11.f216M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f298v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f277a
                android.database.Cursor r4 = r10.f272K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.f269H
                if (r1 == 0) goto L3c
                int r1 = r11.f217N
                goto L3e
            L3c:
                int r1 = r11.f218O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.f272K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f277a
                android.database.Cursor r5 = r10.f272K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f273L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f299w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f277a
                java.lang.CharSequence[] r3 = r10.f298v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f276O
                if (r1 == 0) goto L72
                r1.m353a(r0)
            L72:
                r11.f211H = r9
                int r1 = r10.f270I
                r11.f212I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f300x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f271J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f275N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.f269H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.f268G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f229g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0063f.m351b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void m352a(AlertController alertController) {
            View view = this.f283g;
            if (view != null) {
                alertController.m340a(view);
            } else {
                CharSequence charSequence = this.f282f;
                if (charSequence != null) {
                    alertController.m346b(charSequence);
                }
                Drawable drawable = this.f280d;
                if (drawable != null) {
                    alertController.m339a(drawable);
                }
                int i = this.f279c;
                if (i != 0) {
                    alertController.m344b(i);
                }
                int i2 = this.f281e;
                if (i2 != 0) {
                    alertController.m344b(alertController.m336a(i2));
                }
            }
            CharSequence charSequence2 = this.f284h;
            if (charSequence2 != null) {
                alertController.m342a(charSequence2);
            }
            if (this.f285i != null || this.f286j != null) {
                alertController.m338a(-1, this.f285i, this.f287k, (Message) null, this.f286j);
            }
            if (this.f288l != null || this.f289m != null) {
                alertController.m338a(-2, this.f288l, this.f290n, (Message) null, this.f289m);
            }
            if (this.f291o != null || this.f292p != null) {
                alertController.m338a(-3, this.f291o, this.f293q, (Message) null, this.f292p);
            }
            if (this.f298v != null || this.f272K != null || this.f299w != null) {
                m351b(alertController);
            }
            View view2 = this.f302z;
            if (view2 != null) {
                if (this.f266E) {
                    alertController.m341a(view2, this.f262A, this.f263B, this.f264C, this.f265D);
                    return;
                } else {
                    alertController.m345b(view2);
                    return;
                }
            }
            int i3 = this.f301y;
            if (i3 != 0) {
                alertController.m348c(i3);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0064g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f315a;

        public HandlerC0064g(DialogInterface dialogInterface) {
            this.f315a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f315a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0065h extends ArrayAdapter<CharSequence> {
        public C0065h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0085e dialogC0085e, Window window) {
        this.f223a = context;
        this.f224b = dialogC0085e;
        this.f225c = window;
        this.f221R = new HandlerC0064g(dialogC0085e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AlertDialog, R$attr.alertDialogStyle, 0);
        this.f213J = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
        this.f214K = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f215L = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        this.f216M = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f217N = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f218O = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.f219P = obtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
        this.f226d = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0085e.m500a(1);
    }

    /* renamed from: a */
    private ViewGroup m324a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m325a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: a */
    private void m326a(ViewGroup viewGroup) {
        int i;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f237o = button2;
        button2.setOnClickListener(this.f222S);
        if (TextUtils.isEmpty(this.f238p) && this.f240r == null) {
            this.f237o.setVisibility(8);
            i = 0;
        } else {
            this.f237o.setText(this.f238p);
            Drawable drawable = this.f240r;
            if (drawable != null) {
                int i2 = this.f226d;
                drawable.setBounds(0, 0, i2, i2);
                this.f237o.setCompoundDrawables(this.f240r, null, null, null);
            }
            this.f237o.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f241s = button3;
        button3.setOnClickListener(this.f222S);
        if (TextUtils.isEmpty(this.f242t) && this.f244v == null) {
            this.f241s.setVisibility(8);
        } else {
            this.f241s.setText(this.f242t);
            Drawable drawable2 = this.f244v;
            if (drawable2 != null) {
                int i3 = this.f226d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f241s.setCompoundDrawables(this.f244v, null, null, null);
            }
            this.f241s.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f245w = button4;
        button4.setOnClickListener(this.f222S);
        if (TextUtils.isEmpty(this.f246x) && this.f248z == null) {
            this.f245w.setVisibility(8);
        } else {
            this.f245w.setText(this.f246x);
            Drawable drawable3 = this.f240r;
            if (drawable3 != null) {
                int i4 = this.f226d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f237o.setCompoundDrawables(this.f240r, null, null, null);
            }
            this.f245w.setVisibility(0);
            i |= 4;
        }
        if (m329a(this.f223a)) {
            if (i == 1) {
                button = this.f237o;
            } else if (i == 2) {
                button = this.f241s;
            } else if (i == 4) {
                button = this.f245w;
            }
            m328a(button);
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m327a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f225c.findViewById(R$id.scrollIndicatorUp);
        View findViewById2 = this.f225c.findViewById(R$id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C3107q2.m14886a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f228f != null) {
                this.f204A.setOnScrollChangeListener(new C0059b(this, findViewById, findViewById2));
                this.f204A.post(new RunnableC0060c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f229g;
            if (listView != null) {
                listView.setOnScrollListener(new C0061d(this, findViewById, findViewById2));
                this.f229g.post(new RunnableC0062e(findViewById, findViewById2));
                return;
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: a */
    private void m328a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m329a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    private int m330b() {
        int i = this.f214K;
        return (i != 0 && this.f220Q == 1) ? i : this.f213J;
    }

    /* renamed from: b */
    private void m331b(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f225c.findViewById(R$id.scrollView);
        this.f204A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f204A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f209F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f228f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f204A.removeView(this.f209F);
        if (this.f229g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f204A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f204A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f229g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private void m332c() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f225c.findViewById(R$id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R$id.topPanel);
        View findViewById5 = findViewById3.findViewById(R$id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R$id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R$id.customPanel);
        m333c(viewGroup);
        View findViewById7 = viewGroup.findViewById(R$id.topPanel);
        View findViewById8 = viewGroup.findViewById(R$id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R$id.buttonPanel);
        ViewGroup m324a = m324a(findViewById7, findViewById4);
        ViewGroup m324a2 = m324a(findViewById8, findViewById5);
        ViewGroup m324a3 = m324a(findViewById9, findViewById6);
        m331b(m324a2);
        m326a(m324a3);
        m335d(m324a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (m324a == null || m324a.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (m324a3 == null || m324a3.getVisibility() == 8) ? false : true;
        if (!z3 && m324a2 != null && (findViewById2 = m324a2.findViewById(R$id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.f204A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f228f == null && this.f229g == null) ? null : m324a.findViewById(R$id.titleDividerNoCustom);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m324a2 != null && (findViewById = m324a2.findViewById(R$id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f229g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m349a(z2, z3);
        }
        if (!z) {
            View view = this.f229g;
            if (view == null) {
                view = this.f204A;
            }
            if (view != null) {
                m327a(m324a2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f229g;
        if (listView2 == null || (listAdapter = this.f211H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f212I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    /* renamed from: c */
    private void m333c(ViewGroup viewGroup) {
        View view = this.f230h;
        if (view == null) {
            view = this.f231i != 0 ? LayoutInflater.from(this.f223a).inflate(this.f231i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m334c(view)) {
            this.f225c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f225c.findViewById(R$id.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f236n) {
            frameLayout.setPadding(this.f232j, this.f233k, this.f234l, this.f235m);
        }
        if (this.f229g != null) {
            ((C0170f0.a) viewGroup.getLayoutParams()).f1020a = 0.0f;
        }
    }

    /* renamed from: c */
    static boolean m334c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m334c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m335d(ViewGroup viewGroup) {
        if (this.f210G != null) {
            viewGroup.addView(this.f210G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f225c.findViewById(R$id.title_template).setVisibility(8);
            return;
        }
        this.f207D = (ImageView) this.f225c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f227e)) || !this.f219P) {
            this.f225c.findViewById(R$id.title_template).setVisibility(8);
            this.f207D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f225c.findViewById(R$id.alertTitle);
        this.f208E = textView;
        textView.setText(this.f227e);
        int i = this.f205B;
        if (i != 0) {
            this.f207D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f206C;
        if (drawable != null) {
            this.f207D.setImageDrawable(drawable);
        } else {
            this.f208E.setPadding(this.f207D.getPaddingLeft(), this.f207D.getPaddingTop(), this.f207D.getPaddingRight(), this.f207D.getPaddingBottom());
            this.f207D.setVisibility(8);
        }
    }

    /* renamed from: a */
    public int m336a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f223a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public void m337a() {
        this.f224b.setContentView(m330b());
        m332c();
    }

    /* renamed from: a */
    public void m338a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f221R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f246x = charSequence;
            this.f247y = message;
            this.f248z = drawable;
        } else if (i == -2) {
            this.f242t = charSequence;
            this.f243u = message;
            this.f244v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f238p = charSequence;
            this.f239q = message;
            this.f240r = drawable;
        }
    }

    /* renamed from: a */
    public void m339a(Drawable drawable) {
        this.f206C = drawable;
        this.f205B = 0;
        ImageView imageView = this.f207D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f207D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: a */
    public void m340a(View view) {
        this.f210G = view;
    }

    /* renamed from: a */
    public void m341a(View view, int i, int i2, int i3, int i4) {
        this.f230h = view;
        this.f231i = 0;
        this.f236n = true;
        this.f232j = i;
        this.f233k = i2;
        this.f234l = i3;
        this.f235m = i4;
    }

    /* renamed from: a */
    public void m342a(CharSequence charSequence) {
        this.f228f = charSequence;
        TextView textView = this.f209F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean m343a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f204A;
        return nestedScrollView != null && nestedScrollView.m1530a(keyEvent);
    }

    /* renamed from: b */
    public void m344b(int i) {
        this.f206C = null;
        this.f205B = i;
        ImageView imageView = this.f207D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f207D.setImageResource(this.f205B);
            }
        }
    }

    /* renamed from: b */
    public void m345b(View view) {
        this.f230h = view;
        this.f231i = 0;
        this.f236n = false;
    }

    /* renamed from: b */
    public void m346b(CharSequence charSequence) {
        this.f227e = charSequence;
        TextView textView = this.f208E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean m347b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f204A;
        return nestedScrollView != null && nestedScrollView.m1530a(keyEvent);
    }

    /* renamed from: c */
    public void m348c(int i) {
        this.f230h = null;
        this.f231i = i;
        this.f236n = false;
    }
}
