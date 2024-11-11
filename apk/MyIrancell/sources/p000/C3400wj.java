package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0613a1;
import com.comviva.webaxn.p002ui.C0614b;
import com.comviva.webaxn.p002ui.C0632h;
import com.comviva.webaxn.p002ui.C0635i;
import com.comviva.webaxn.p002ui.C0639j0;
import com.comviva.webaxn.p002ui.C0641k;
import com.comviva.webaxn.p002ui.C0643k1;
import com.comviva.webaxn.p002ui.C0644l;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.p002ui.C0659q0;
import com.comviva.webaxn.p002ui.C0661r0;
import com.comviva.webaxn.p002ui.C0663s0;
import com.comviva.webaxn.p002ui.C0665t0;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.comviva.webaxn.transport.C0579a;
import com.comviva.webaxn.utils.AsyncTaskC0693d;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0710i1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0714k;
import com.comviva.webaxn.utils.C0719l1;
import com.comviva.webaxn.utils.C0727o0;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0737r1;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.C0761z1;
import com.mtni.myirancell.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.Vector;
import javax.net.ssl.SSLException;
import p000.C3489yj;

/* renamed from: wj */
/* loaded from: classes.dex */
public class C3400wj {

    /* renamed from: Z */
    public static int f13839Z = 0;

    /* renamed from: a0 */
    public static boolean f13840a0 = false;

    /* renamed from: b0 */
    public static boolean f13841b0 = false;

    /* renamed from: M */
    private C0655o1 f13854M;

    /* renamed from: O */
    private C0614b f13856O;

    /* renamed from: P */
    private C3489yj f13857P;

    /* renamed from: Q */
    private boolean f13858Q;

    /* renamed from: R */
    private C0661r0 f13859R;

    /* renamed from: S */
    private C0755x1.r f13860S;

    /* renamed from: T */
    private C0755x1.n f13861T;

    /* renamed from: W */
    private String f13864W;

    /* renamed from: X */
    private String f13865X;

    /* renamed from: Y */
    private String f13866Y;

    /* renamed from: a */
    private C3129qj f13867a;

    /* renamed from: c */
    private AlertDialog f13869c;

    /* renamed from: d */
    private HashMap<String, C0737r1> f13870d;

    /* renamed from: e */
    public LayoutInflater f13871e;

    /* renamed from: f */
    private Context f13872f;

    /* renamed from: g */
    public C0579a f13873g;

    /* renamed from: h */
    private C0687b f13874h;

    /* renamed from: i */
    private boolean f13875i;

    /* renamed from: k */
    private boolean f13877k;

    /* renamed from: l */
    private long f13878l;

    /* renamed from: m */
    private C0696e f13879m;

    /* renamed from: n */
    private HashMap<String, String> f13880n;

    /* renamed from: o */
    private Dialog f13881o;

    /* renamed from: p */
    private C0719l1 f13882p;

    /* renamed from: q */
    private String f13883q;

    /* renamed from: r */
    private C0719l1 f13884r;

    /* renamed from: s */
    private boolean f13885s;

    /* renamed from: t */
    private int f13886t;

    /* renamed from: u */
    private C3489yj f13887u;

    /* renamed from: b */
    public C3129qj f13868b = null;

    /* renamed from: j */
    private int f13876j = -1;

    /* renamed from: v */
    private boolean f13888v = false;

    /* renamed from: w */
    private String f13889w = null;

    /* renamed from: x */
    private String f13890x = null;

    /* renamed from: y */
    private String f13891y = null;

    /* renamed from: z */
    private String f13892z = null;

    /* renamed from: A */
    private String f13842A = null;

    /* renamed from: B */
    private String f13843B = null;

    /* renamed from: C */
    private String f13844C = null;

    /* renamed from: D */
    private String f13845D = null;

    /* renamed from: E */
    private int f13846E = 0;

    /* renamed from: F */
    private int f13847F = 0;

    /* renamed from: G */
    private int f13848G = -1;

    /* renamed from: H */
    private String f13849H = null;

    /* renamed from: I */
    private boolean f13850I = false;

    /* renamed from: J */
    private boolean f13851J = false;

    /* renamed from: K */
    private String f13852K = null;

    /* renamed from: L */
    private int f13853L = 1;

    /* renamed from: N */
    private Stack<C0655o1> f13855N = new Stack<>();

    /* renamed from: U */
    public k f13862U = null;

    /* renamed from: V */
    public final C0755x1.k f13863V = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$a */
    /* loaded from: classes.dex */
    public class a implements C0755x1.k {

        /* renamed from: wj$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class AsyncTaskC3578a extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13894a;

            public AsyncTaskC3578a(C0719l1 c0719l1) {
                this.f13894a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                if (bArr != null) {
                    C0023aj.m160a(C3400wj.this.f13872f).m172a(C0755x1.m6192i(this.f13894a.f4957j + C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5557i()), "public", bArr);
                    C0719l1 c0719l1 = this.f13894a;
                    AbstractC0652n1 abstractC0652n1 = c0719l1.f4944L.f14197a0;
                    if (abstractC0652n1 != null && (abstractC0652n1 instanceof C0659q0)) {
                        ((C0659q0) abstractC0652n1).m4900a(c0719l1.f4943K, false);
                    }
                }
                this.f13894a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        /* renamed from: wj$a$b */
        /* loaded from: classes.dex */
        class b extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13896a;

            public b(C0719l1 c0719l1) {
                this.f13896a = null;
                this.f13896a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13896a;
                C2899lj c2899lj = c0719l1.f4971x;
                if (c2899lj != null) {
                    c2899lj.m13899d(c0719l1);
                }
                if (bArr != null) {
                    C3400wj.this.m16312b(bArr);
                    C2899lj c2899lj2 = this.f13896a.f4971x;
                    if (c2899lj2.m13900e() <= 0 && c2899lj2 != null && C3400wj.this.m16264a(c2899lj2) != null) {
                        C3400wj.this.m16264a(c2899lj2).m4783a(c2899lj2, C3400wj.this.f13872f, false);
                    }
                }
                this.f13896a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b();
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d(), m5547b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wj$a$c */
        /* loaded from: classes.dex */
        public class c extends AsyncTask<l, Void, l> {
            c() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l doInBackground(l... lVarArr) {
                C3263ti c3263ti;
                l lVar = lVarArr[0];
                if (C3400wj.this.f13880n == null) {
                    C3400wj.this.f13880n = new HashMap();
                }
                try {
                    c3263ti = new C3263ti();
                    c3263ti.m15650a(lVar.f13935a);
                } catch (C3399wi unused) {
                    c3263ti = null;
                }
                if (c3263ti != null) {
                    C3400wj c3400wj = C3400wj.this;
                    new C3036oi(c3400wj, c3400wj.f13872f, lVar.f13941g).m14592a(c3263ti);
                }
                return lVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(l lVar) {
                if (C3400wj.this.f13880n != null && C3400wj.this.f13880n.size() > 0) {
                    for (String str : C3400wj.this.f13880n.keySet()) {
                        C0713j1.m5563a(C3400wj.this.f13872f).m5628a(str, (String) C3400wj.this.f13880n.get(str));
                    }
                    C0713j1.m5563a(C3400wj.this.f13872f).m5715q(1);
                    C3400wj.this.f13880n.clear();
                    C3400wj.this.f13880n = null;
                }
                C0755x1.f5253k = false;
                C0755x1.f5252j = true;
                C2899lj c2899lj = lVar.f13939e.f4971x;
                if (TextUtils.isEmpty(C0755x1.f5255m)) {
                    return;
                }
                C3400wj c3400wj = C3400wj.this;
                if (!c3400wj.m16298a(C0755x1.f5255m, false, null, null, c3400wj.m16334k(), c2899lj)) {
                    C3440xj m6134a = C0755x1.m6134a(C0755x1.f5255m, C3400wj.this.m16334k().m14145i());
                    if (m6134a != null) {
                        C3400wj.this.m16334k().m14121a(m6134a);
                    }
                    if (C3400wj.this.m16263a(C0755x1.f5255m, false, false, null, false, false, null, c2899lj) > 0) {
                        C3400wj.this.m16258E();
                    }
                }
                C0755x1.f5255m = null;
            }
        }

        /* renamed from: wj$a$d */
        /* loaded from: classes.dex */
        class d extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13899a;

            public d(C0719l1 c0719l1) {
                this.f13899a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13899a;
                c0719l1.f4971x.m13899d(c0719l1);
                C2945mj m16334k = C3400wj.this.m16334k();
                if (bArr != null) {
                    m16334k.m14124a(bArr);
                    C3400wj.this.m16343t().m4785a(m16334k, (String) null);
                    C2899lj c2899lj = this.f13899a.f4971x;
                    if (c2899lj != null && c2899lj.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj) != null) {
                        C3400wj.this.m16264a(c2899lj).m4783a(c2899lj, C3400wj.this.f13872f, false);
                    }
                }
                this.f13899a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        /* renamed from: wj$a$e */
        /* loaded from: classes.dex */
        class e extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13901a;

            public e(C0719l1 c0719l1) {
                this.f13901a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13901a;
                c0719l1.f4971x.m13899d(c0719l1);
                C2945mj m16334k = C3400wj.this.m16334k();
                if (bArr != null) {
                    m16334k.m14130b(bArr);
                    C3400wj.this.m16343t().m4785a(m16334k, (String) null);
                    C2899lj c2899lj = this.f13901a.f4971x;
                    if (c2899lj != null && c2899lj.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj) != null) {
                        C3400wj.this.m16264a(c2899lj).m4783a(c2899lj, C3400wj.this.f13872f, false);
                    }
                }
                this.f13901a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        /* renamed from: wj$a$f */
        /* loaded from: classes.dex */
        class f extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13903a;

            public f(C0719l1 c0719l1) {
                this.f13903a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13903a;
                c0719l1.f4971x.m13890b(6, c0719l1.f4957j);
                C0719l1 c0719l12 = this.f13903a;
                c0719l12.f4971x.m13899d(c0719l12);
                C2945mj m16334k = C3400wj.this.m16334k();
                if (bArr != null) {
                    m16334k.m14113a().m3684a(C3400wj.this.f13872f, bArr);
                    C2899lj c2899lj = this.f13903a.f4971x;
                    if (c2899lj != null && c2899lj.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj) != null) {
                        C3400wj.this.m16264a(c2899lj).m4783a(c2899lj, C3400wj.this.f13872f, true);
                    }
                }
                this.f13903a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 2;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 2, m5547b);
            }
        }

        /* renamed from: wj$a$g */
        /* loaded from: classes.dex */
        class g extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13905a;

            public g(C0719l1 c0719l1) {
                this.f13905a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13905a;
                C2899lj c2899lj = c0719l1.f4971x;
                if (c2899lj != null) {
                    c2899lj.m13899d(c0719l1);
                }
                if (bArr != null) {
                    C3400wj.this.m16292a(bArr);
                    C2899lj c2899lj2 = this.f13905a.f4971x;
                    if (c2899lj2 != null && c2899lj2.m13901f() != null && !this.f13905a.f4971x.m13901f().f14517p) {
                        C3400wj.this.m16343t().m4798a(this.f13905a.f4971x.m13901f(), C3400wj.this.m16326e());
                    }
                    C2899lj c2899lj3 = this.f13905a.f4971x;
                    if (c2899lj3 != null && c2899lj3.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj3) != null) {
                        C3400wj.this.m16264a(c2899lj3).m4783a(c2899lj3, C3400wj.this.f13872f, false);
                    }
                }
                this.f13905a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 2;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 2, m5547b);
            }
        }

        /* renamed from: wj$a$h */
        /* loaded from: classes.dex */
        class h extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13907a;

            /* renamed from: b */
            C3489yj f13908b;

            public h(C0719l1 c0719l1, C3489yj c3489yj) {
                this.f13907a = c0719l1;
                this.f13908b = c3489yj;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13907a;
                c0719l1.f4971x.m13895c(c0719l1);
                if (bArr != null) {
                    String m5853a = this.f13907a.m5853a("Cache-Control");
                    if (m5853a == null || m5853a.equals("public")) {
                        C3400wj.this.m16306b(this.f13908b.f14170N, bArr);
                    } else if (m5853a.equals("private")) {
                        C3400wj.this.m16286a(this.f13908b.f14170N, bArr);
                    }
                    C3489yj c3489yj = this.f13908b;
                    c3489yj.f14254t0 = bArr;
                    AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
                    if (abstractC0652n1 != null) {
                        abstractC0652n1.mo4140a(c3489yj);
                    }
                    C2899lj c2899lj = this.f13907a.f4971x;
                    if (c2899lj != null && c2899lj.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj) != null) {
                        C3400wj.this.m16264a(c2899lj).m4783a(c2899lj, C3400wj.this.f13872f, false);
                    }
                }
                this.f13907a = null;
                this.f13908b = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        /* renamed from: wj$a$i */
        /* loaded from: classes.dex */
        class i extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13910a;

            /* renamed from: b */
            C3489yj f13911b;

            public i(C0719l1 c0719l1, C3489yj c3489yj) {
                this.f13910a = c0719l1;
                this.f13911b = c3489yj;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
            
                if (r0 != null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
            
                r0.mo4140a(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
            
                if (r0 != null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
            
                if (r0 != null) goto L21;
             */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onPostExecute(byte[] r4) {
                /*
                    Method dump skipped, instructions count: 297
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.a.i.onPostExecute(byte[]):void");
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        /* renamed from: wj$a$j */
        /* loaded from: classes.dex */
        class j extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            C0719l1 f13913a;

            public j(C0719l1 c0719l1) {
                this.f13913a = c0719l1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13913a;
                c0719l1.f4971x.m13895c(c0719l1);
                if (bArr != null) {
                    String m5853a = this.f13913a.m5853a("Cache-Control");
                    if (m5853a == null || m5853a.equals("public")) {
                        C3400wj.this.m16306b(this.f13913a.m5859b(), bArr);
                    } else {
                        C3400wj.this.m16286a(this.f13913a.m5859b(), bArr);
                    }
                    C2899lj c2899lj = this.f13913a.f4971x;
                    if (c2899lj != null && c2899lj.m13901f() != null) {
                        this.f13913a.f4971x.m13901f().m16934a(bArr);
                        C0719l1 c0719l12 = this.f13913a;
                        c0719l12.f4971x.m13895c(c0719l12);
                        if (C3400wj.this.m16343t().m4798a(this.f13913a.f4971x.m13901f(), this.f13913a.f4971x.m13901f().m16935a())) {
                            this.f13913a.f4971x.m13901f().f14517p = true;
                        }
                    }
                    C2899lj c2899lj2 = this.f13913a.f4971x;
                    if (c2899lj2 != null && c2899lj2.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj2) != null) {
                        C3400wj.this.m16264a(c2899lj2).m4783a(c2899lj2, C3400wj.this.f13872f, false);
                    }
                }
                this.f13913a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        /* renamed from: wj$a$k */
        /* loaded from: classes.dex */
        class k extends AsyncTask<byte[], Integer, byte[]> {

            /* renamed from: a */
            public C0719l1 f13915a;

            /* renamed from: b */
            public C3489yj f13916b;

            public k(C0719l1 c0719l1, C3489yj c3489yj) {
                this.f13915a = c0719l1;
                this.f13916b = c3489yj;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                C0719l1 c0719l1 = this.f13915a;
                c0719l1.f4971x.m13895c(c0719l1);
                if (bArr != null) {
                    String m5853a = this.f13915a.m5853a("Cache-Control");
                    if (m5853a == null || m5853a.equals("public")) {
                        C3400wj.this.m16306b(this.f13916b.f14172O, bArr);
                    } else {
                        C3400wj.this.m16286a(this.f13916b.f14172O, bArr);
                    }
                    C3489yj c3489yj = this.f13916b;
                    c3489yj.f14260v0 = bArr;
                    AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
                    if (abstractC0652n1 != null) {
                        abstractC0652n1.mo4140a(c3489yj);
                    }
                    C2899lj c2899lj = this.f13915a.f4971x;
                    if (c2899lj != null && c2899lj.m13900e() <= 0 && C3400wj.this.m16264a(c2899lj) != null) {
                        C3400wj.this.m16264a(c2899lj).m4783a(c2899lj, C3400wj.this.f13872f, false);
                    }
                }
                this.f13915a = null;
                this.f13916b = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int m5547b = C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5547b() / 4;
                return AsyncTaskC0693d.m5406a(C3400wj.this.f13872f, bArr2, C0687b.m5342a(C3400wj.this.f13872f).m5343a().m5552d() / 4, m5547b);
            }
        }

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:220:0x00da, code lost:
        
            if (r0 != null) goto L96;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0717  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0750  */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        @Override // com.comviva.webaxn.utils.C0755x1.k
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo6196a(com.comviva.webaxn.utils.C0719l1 r17) {
            /*
                Method dump skipped, instructions count: 2450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.a.mo6196a(com.comviva.webaxn.utils.l1):void");
        }

        /* renamed from: a */
        public void m16350a(C0719l1 c0719l1, String str, h hVar) {
            l lVar = new l(C3400wj.this);
            lVar.f13939e = c0719l1;
            lVar.f13935a = c0719l1.m5864f();
            lVar.f13937c = str;
            lVar.f13938d = hVar;
            new c().execute(lVar);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.k
        /* renamed from: a */
        public void mo6197a(C2899lj c2899lj) {
            if (C3400wj.this.m16334k() == null || c2899lj == null || C3400wj.this.m16264a(c2899lj) == null) {
                return;
            }
            C3400wj.this.m16264a(c2899lj).m4783a(c2899lj, C3400wj.this.f13872f, false);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.k
        /* renamed from: b */
        public void mo6198b(C0719l1 c0719l1) {
            if (c0719l1 == null || c0719l1.f4950c == 5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$b */
    /* loaded from: classes.dex */
    public class b extends AsyncTask<l, Void, l> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l doInBackground(l... lVarArr) {
            C3263ti c3263ti;
            l lVar = lVarArr[0];
            try {
                c3263ti = new C3263ti();
                c3263ti.m15650a(lVar.f13935a);
            } catch (C3399wi unused) {
                c3263ti = null;
            }
            if (c3263ti != null) {
                C2945mj c2945mj = new C2945mj(C3400wj.this.f13872f);
                C3400wj c3400wj = C3400wj.this;
                C3036oi c3036oi = new C3036oi(c3400wj, c3400wj.f13872f, lVar.f13941g);
                lVar.f13936b = c2945mj;
                c3036oi.m14593a(c3263ti, c2945mj);
            }
            return lVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(l lVar) {
            C3400wj.this.m16290a(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$c */
    /* loaded from: classes.dex */
    public class c extends AsyncTask<l, Integer, l> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
        
            if (r2 != null) goto L6;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p000.C3400wj.l doInBackground(p000.C3400wj.l... r12) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.c.doInBackground(wj$l[]):wj$l");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x0592, code lost:
        
            if (r1 == null) goto L267;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x05af, code lost:
        
            r23.f13919a.m16281a(r1, r4, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:270:0x05a5, code lost:
        
            r1 = r23.f13919a.f13872f.getString(com.mtni.myirancell.R.string.default_empty_messagecap_err);
         */
        /* JADX WARN: Code restructure failed: missing block: B:276:0x05a3, code lost:
        
            if (r1 == null) goto L267;
         */
        /* JADX WARN: Removed duplicated region for block: B:116:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0564  */
        /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0571  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x057c  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x0595  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x0574  */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(p000.C3400wj.l r24) {
            /*
                Method dump skipped, instructions count: 1467
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.c.onPostExecute(wj$l):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            try {
                if (C3400wj.this.m16343t() != null) {
                    C3400wj.this.m16343t().m4809d().setProgress(numArr[0].intValue());
                }
                if (WebAxnActivity.f3410r != null) {
                    int intValue = WebAxnActivity.f3415w + numArr[0].intValue();
                    WebAxnActivity.f3415w = intValue;
                    if (intValue < 95) {
                        WebAxnActivity.f3410r.setProgress(WebAxnActivity.f3415w);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$d */
    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C3400wj.this.m16345v();
            C3400wj.this.f13881o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$e */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnCancelListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C3400wj.this.m16345v();
            C3400wj.this.f13881o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$f */
    /* loaded from: classes.dex */
    public class f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f13922b;

        /* renamed from: c */
        final /* synthetic */ WebAxnActivity f13923c;

        f(C3400wj c3400wj, String str, WebAxnActivity webAxnActivity) {
            this.f13922b = str;
            this.f13923c = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f13922b;
            if (str == null || str.equals("StartAppln_Req") || this.f13922b.equals("StartAppln_ReqPage")) {
                C0755x1.m6138a((Activity) this.f13923c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$g */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f13924a;

        static {
            int[] iArr = new int[C3489yj.a.values().length];
            f13924a = iArr;
            try {
                iArr[C3489yj.a.FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13924a[C3489yj.a.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13924a[C3489yj.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: wj$h */
    /* loaded from: classes.dex */
    public enum h {
        WBXML_BUFFER,
        XML_BUFFER
    }

    /* renamed from: wj$i */
    /* loaded from: classes.dex */
    public enum i {
        LR,
        RL,
        TB,
        BT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$j */
    /* loaded from: classes.dex */
    public class j {

        /* renamed from: a */
        C0719l1 f13929a;

        /* renamed from: b */
        String f13930b;

        /* renamed from: c */
        String f13931c;

        /* renamed from: d */
        boolean f13932d;

        /* renamed from: e */
        boolean f13933e;

        j(C3400wj c3400wj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$k */
    /* loaded from: classes.dex */
    public class k extends AsyncTask<j, Integer, j> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j doInBackground(j... jVarArr) {
            boolean z = false;
            C3400wj.f13840a0 = false;
            j jVar = jVarArr[0];
            String m5654e = C0713j1.m5563a(C3400wj.this.f13872f).m5654e("domainurl");
            C3530zi.f14460c = m5654e;
            if (m5654e == null) {
                C3530zi.f14460c = C3530zi.f14458a;
                C0713j1.m5563a(C3400wj.this.f13872f).m5629a(C3530zi.f14458a, false);
            }
            String m5654e2 = C0713j1.m5563a(C3400wj.this.f13872f).m5654e("ipurl");
            C3530zi.f14461d = m5654e2;
            if (m5654e2 == null) {
                C3530zi.f14461d = C3530zi.f14459b;
                C0713j1.m5563a(C3400wj.this.f13872f).m5637b(C3530zi.f14459b, false);
            }
            String str = C3530zi.f14460c;
            if (str == null) {
                str = C3530zi.f14461d;
                if (str != null) {
                    C3400wj.f13841b0 = true;
                } else {
                    str = null;
                }
            }
            if (str != null && true == C3400wj.this.m16233a(str, jVar)) {
                C3400wj.f13840a0 = true;
                z = C3400wj.this.m16257D();
            }
            jVar.f13933e = z;
            return jVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(j jVar) {
            C3531zj m13901f;
            C0643k1 c0643k1;
            C0713j1 m5563a;
            String str;
            C0719l1 c0719l1 = jVar.f13929a;
            if (jVar.f13933e) {
                if (c0719l1 == null) {
                    C3400wj.this.m16300b(jVar.f13930b, jVar.f13932d);
                    return;
                }
                if (true == c0719l1.f4934B) {
                    m5563a = C0713j1.m5563a(C3400wj.this.f13872f);
                    str = "secureserverurl";
                } else {
                    m5563a = C0713j1.m5563a(C3400wj.this.f13872f);
                    str = "serverurl";
                }
                c0719l1.f4957j = m5563a.m5654e(str);
                C3400wj.this.f13873g.m3992a(c0719l1);
                return;
            }
            if (C0755x1.f5257o) {
                C3400wj.this.m16259F();
                if (!C3400wj.this.m16297a("msg.sslerr", false)) {
                    C3400wj.this.m16323d(jVar.f13930b, C0713j1.m5563a(C3400wj.this.f13872f).m5641c("msg.sslerr"));
                }
                C0755x1.f5257o = false;
                return;
            }
            if (C3400wj.this.m16334k() != null && C3400wj.this.m16343t().f4136d != null && (m13901f = C3400wj.this.m16343t().f4136d.m13901f()) != null && (c0643k1 = m13901f.f14504c) != null) {
                c0643k1.m4608a(false, false, C3400wj.this.m16343t());
            }
            String str2 = null;
            if (c0719l1 != null) {
                str2 = c0719l1.f4968u;
                int i = c0719l1.f4950c;
                if (i == 5 || i == 4 || i == 15) {
                    C3400wj.this.m16259F();
                }
            }
            if (C3400wj.this.m16297a("msg.connProb", false)) {
                return;
            }
            String m5641c = C0713j1.m5563a(C3400wj.this.f13872f).m5641c("msg.connProb");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = C3400wj.this.f13872f.getString(R.string.default_connect_err);
                C0755x1.f5251i = true;
            }
            if (!TextUtils.isEmpty(jVar.f13931c)) {
                m5641c = m5641c + "\nCause: " + jVar.f13931c;
            }
            C3400wj.this.m16281a(m5641c, str2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$l */
    /* loaded from: classes.dex */
    public class l {

        /* renamed from: a */
        public byte[] f13935a;

        /* renamed from: b */
        public C2945mj f13936b;

        /* renamed from: c */
        public String f13937c;

        /* renamed from: d */
        public h f13938d;

        /* renamed from: e */
        public C0719l1 f13939e;

        /* renamed from: f */
        public C0655o1 f13940f;

        /* renamed from: g */
        public boolean f13941g = false;

        /* renamed from: h */
        public boolean f13942h = false;

        /* renamed from: i */
        public boolean f13943i = true;

        l(C3400wj c3400wj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$m */
    /* loaded from: classes.dex */
    public class m implements DialogInterface.OnKeyListener {

        /* renamed from: b */
        C0655o1 f13944b;

        /* renamed from: c */
        C2945mj f13945c;

        /* renamed from: d */
        C2899lj f13946d;

        m(C3400wj c3400wj, C0655o1 c0655o1, C2899lj c2899lj, C2945mj c2945mj, C2899lj c2899lj2) {
            this.f13944b = c0655o1;
            this.f13946d = c2899lj;
            this.f13945c = c2945mj;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (this.f13946d.m13898d().size() > 1 && this.f13946d.m13898d().get(1) != null) {
                    this.f13944b.m4797a(this.f13946d.m13898d().get(1).f4714f, this.f13945c, this.f13946d);
                }
                dialogInterface.dismiss();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$n */
    /* loaded from: classes.dex */
    public class n implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        C0655o1 f13947b;

        /* renamed from: c */
        C2945mj f13948c;

        /* renamed from: d */
        C2899lj f13949d;

        n(C3400wj c3400wj, C0655o1 c0655o1, C2899lj c2899lj, C2945mj c2945mj, C2899lj c2899lj2) {
            this.f13947b = c0655o1;
            this.f13949d = c2899lj;
            this.f13948c = c2945mj;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f13947b.m4797a(this.f13949d.m13898d().get(1).f4714f, this.f13948c, this.f13949d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$o */
    /* loaded from: classes.dex */
    public class o implements DialogInterface.OnClickListener {

        /* renamed from: b */
        C0655o1 f13950b;

        /* renamed from: c */
        C2945mj f13951c;

        /* renamed from: d */
        C2899lj f13952d;

        o(C3400wj c3400wj, C0655o1 c0655o1, C2899lj c2899lj, C2945mj c2945mj, C2899lj c2899lj2) {
            this.f13950b = c0655o1;
            this.f13952d = c2899lj;
            this.f13951c = c2945mj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f13950b.m4797a(this.f13952d.m13898d().get(1).f4714f, this.f13951c, this.f13952d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wj$p */
    /* loaded from: classes.dex */
    public class p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        C0655o1 f13953b;

        /* renamed from: c */
        C2945mj f13954c;

        /* renamed from: d */
        C2899lj f13955d;

        p(C0655o1 c0655o1, C2899lj c2899lj, C2945mj c2945mj, C2899lj c2899lj2) {
            this.f13953b = c0655o1;
            this.f13955d = c2899lj;
            this.f13954c = c2945mj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Vector<C3489yj> vector;
            C0696e c0696e = this.f13955d.m13898d().get(0);
            if (c0696e != null) {
                if (!c0696e.f4715g.equalsIgnoreCase("refresh") || c0696e.f4725q != 0 || this.f13954c == null) {
                    this.f13953b.m4797a(this.f13955d.m13898d().get(0).f4714f, this.f13954c, this.f13955d);
                    return;
                }
                C2899lj c2899lj = this.f13955d;
                if (c2899lj == null || c2899lj.m13901f() == null) {
                    return;
                }
                C3531zj m13901f = c2899lj.m13901f();
                HashMap<String, String> m210k = C0023aj.m160a(C3400wj.this.f13872f).m210k();
                if (m210k.size() > 0) {
                    for (Map.Entry<String, String> entry : m210k.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (m13901f != null && (vector = m13901f.f14506e) != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= vector.size()) {
                                    break;
                                }
                                C3489yj m6136a = C0755x1.m6136a(vector.elementAt(i2), key);
                                if (m6136a != null) {
                                    int i3 = m6136a.f14208e;
                                    if (i3 == 3) {
                                        AbstractC0652n1 abstractC0652n1 = m6136a.f14197a0;
                                        if (abstractC0652n1 instanceof C0668v) {
                                            ((C0668v) abstractC0652n1).m5029f(value);
                                        } else {
                                            ((C0670w) abstractC0652n1).m5093h(value);
                                        }
                                    } else if (value != null && i3 == 4) {
                                        int i4 = m6136a.f14178R;
                                        if (i4 == 4 || i4 == 3) {
                                            AbstractC0652n1 abstractC0652n12 = m6136a.f14197a0;
                                            if (abstractC0652n12 instanceof C0663s0) {
                                                ((C0663s0) abstractC0652n12).m4957c(value);
                                            } else {
                                                ((C0665t0) abstractC0652n12).m4977c(value);
                                            }
                                        } else if (i4 == 2) {
                                            AbstractC0652n1 abstractC0652n13 = m6136a.f14197a0;
                                            if (abstractC0652n13 instanceof C0632h) {
                                                ((C0632h) abstractC0652n13).m4425a(value, "0");
                                            } else {
                                                ((C0635i) abstractC0652n13).m4467a(value, "0");
                                            }
                                        } else if (i4 == 1) {
                                            AbstractC0652n1 abstractC0652n14 = m6136a.f14197a0;
                                            if (abstractC0652n14 instanceof C0641k) {
                                                ((C0641k) abstractC0652n14).m4530c(value);
                                            } else {
                                                ((C0644l) abstractC0652n14).m4626c(value);
                                            }
                                        }
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C3400wj(Context context, LayoutInflater layoutInflater, C0614b c0614b, C0755x1.n nVar) {
        this.f13867a = null;
        this.f13875i = false;
        this.f13877k = false;
        this.f13858Q = false;
        this.f13872f = context;
        this.f13871e = layoutInflater;
        this.f13856O = c0614b;
        this.f13861T = nVar;
        c0614b.setFocusable(true);
        this.f13856O.setFocusableInTouchMode(true);
        this.f13875i = false;
        this.f13877k = false;
        Context context2 = this.f13872f;
        this.f13858Q = C3530zi.m16927a(context2, context2.getPackageName());
        C0713j1.m5563a(this.f13872f).m5667g("2.3.0.11583");
        this.f13867a = C3530zi.m16926a(this.f13872f);
    }

    /* renamed from: a */
    private int m16214a(C0719l1 c0719l1, boolean z, int i2) {
        if (c0719l1 == null) {
            return 0;
        }
        String str = c0719l1.f4968u;
        if (c0719l1.f4967t != null) {
            str = str + c0719l1.f4967t;
        }
        return m16215a(str, 2, i2, c0719l1, C0755x1.f5246d);
    }

    /* renamed from: a */
    private int m16215a(String str, int i2, int i3, C0719l1 c0719l1, boolean z) {
        boolean z2;
        int i4;
        boolean z3;
        String str2;
        String m5641c;
        Context context;
        int i5;
        C2899lj c2899lj;
        C3531zj m13901f;
        C0643k1 c0643k1;
        C2945mj m16334k = m16334k();
        byte[] m179a = (i3 == 15 || i3 == 16 || i3 == 17 || i3 == 13 || c0719l1.f4935C) ? null : C0023aj.m160a(this.f13872f).m179a(C0755x1.m6192i(str), "cachedAcrossSession");
        if (m179a != null) {
            m16295a(m179a, null, h.WBXML_BUFFER, null, true, false, (str.equalsIgnoreCase("StartAppln_Req") && C0713j1.m5563a(this.f13872f).m5663f(str)) ? false : true);
            return 1;
        }
        if ((str.equalsIgnoreCase("StartAppln_ReqPage") || str.equalsIgnoreCase("StartAppln_Req")) && i3 != 20 && !TextUtils.isEmpty("StartAppln_Req")) {
            Context context2 = this.f13872f;
            if (context2 instanceof WebAxnActivity) {
                try {
                    InputStream open = ((WebAxnActivity) context2).getAssets().open("StartAppln_Req".toLowerCase().trim() + ".wbxml");
                    byte[] bArr = new byte[open.available()];
                    open.read(bArr);
                    open.close();
                    z2 = true;
                    i4 = 16;
                    try {
                        m16295a(bArr, null, h.WBXML_BUFFER, null, true, false, true);
                        return 1;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }
        z2 = true;
        i4 = 16;
        int m5781r = C0714k.m5781r(this.f13872f);
        if (m5781r == 0) {
            if (c0719l1.f4935C) {
                if (i3 == 15 || i3 == i4) {
                    if (!TextUtils.isEmpty(c0719l1.f4969v)) {
                        C0719l1 c0719l12 = new C0719l1();
                        c0719l12.f4971x = c0719l1.f4971x;
                        m16278a(c0719l1.f4969v, c0719l12);
                    }
                    if (C0755x1.f5239C) {
                        m16288a(m16334k, c0719l1.f4971x, false);
                        C0755x1.f5239C = false;
                    }
                }
                return -2;
            }
            String str3 = C3530zi.f14464g ? "msg.gprs_error" : "msg.noconn_error";
            m16346w();
            if (m16297a(str3, false)) {
                return -2;
            }
            m5641c = C0713j1.m5563a(this.f13872f).m5641c(str3);
            if (m5641c == null) {
                if (C3530zi.f14464g) {
                    context = this.f13872f;
                    i5 = R.string.error_message_conn_gprs;
                } else {
                    context = this.f13872f;
                    i5 = R.string.error_message_conn;
                }
                m5641c = context.getString(i5);
            }
            str2 = m5641c;
            z3 = false;
        } else if (!C3530zi.f14464g || m5781r != z2) {
            z3 = true;
            str2 = null;
        } else {
            if (m16344u()) {
                return -2;
            }
            if (c0719l1.f4935C) {
                if (i3 == 15 || i3 == i4) {
                    if (!TextUtils.isEmpty(c0719l1.f4969v)) {
                        C0719l1 c0719l13 = new C0719l1();
                        c0719l13.f4971x = c0719l1.f4971x;
                        m16278a(c0719l1.f4969v, c0719l13);
                    }
                    if (C0755x1.f5239C) {
                        m16288a(m16334k, c0719l1.f4971x, false);
                        C0755x1.f5239C = false;
                    }
                }
                return -2;
            }
            m16346w();
            if (m16297a("msg.wifi_error", false)) {
                return -2;
            }
            m5641c = C0713j1.m5563a(this.f13872f).m5641c("msg.wifi_error");
            if (m5641c == null) {
                context = this.f13872f;
                i5 = R.string.error_wifi;
                m5641c = context.getString(i5);
            }
            str2 = m5641c;
            z3 = false;
        }
        if (!z3) {
            String str4 = c0719l1.f4969v;
            if (str4 != null && (m16296a(str4, m16334k, c0719l1.f4971x) || m16298a(c0719l1.f4969v, false, null, null, m16334k, c0719l1.f4971x))) {
                return -2;
            }
            if (i3 != i4 && i3 != 13 && !c0719l1.f4935C && i3 != 20) {
                m16281a(str2, str, z2);
            }
            if (m16334k != null && (c2899lj = c0719l1.f4971x) != null && (m13901f = c2899lj.m13901f()) != null && (c0643k1 = m13901f.f14504c) != null) {
                c0643k1.m4608a(false, false, m16343t());
            }
            return -2;
        }
        String str5 = c0719l1.f4968u;
        if (str5 == null || !str5.startsWith("wgts:")) {
            z2 = z;
        }
        String m16265a = m16265a(z2);
        if (m16265a == null) {
            return -1;
        }
        c0719l1.f4954g = 0L;
        c0719l1.f4953f = 0;
        c0719l1.f4957j = m16265a;
        c0719l1.f4956i = i2;
        c0719l1.f4949b = m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4950c = i3;
        c0719l1.f4934B = z2;
        if (C0755x1.f5247e && !TextUtils.isEmpty(C0713j1.m5563a(this.f13872f).m5618W())) {
            c0719l1.f4942J = c0719l1.f4968u;
            c0719l1.f4968u = "PreStartAppln_Req";
            c0719l1.f4941I = c0719l1.f4950c;
            c0719l1.f4950c = 21;
            c0719l1.f4957j = C0713j1.m5563a(this.f13872f).m5618W();
        }
        return m16261a(c0719l1);
    }

    /* renamed from: a */
    private void m16220a(C0613a1 c0613a1, C3531zj c3531zj, C2899lj c2899lj) {
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4954g = 0L;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4957j = c0613a1.f3520a;
        c0719l1.f4950c = 18;
        c0719l1.f4933A = c0613a1;
        this.f13873g.m3997d(c0719l1);
    }

    /* renamed from: a */
    private void m16221a(String str, int i2, C2899lj c2899lj) {
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4954g = 0L;
        c0719l1.f4957j = str;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4950c = i2;
        c0719l1.f4971x = c2899lj;
        c2899lj.m13882a(c0719l1);
        this.f13873g.m3992a(c0719l1);
    }

    /* renamed from: a */
    private void m16222a(C2899lj c2899lj, C3489yj c3489yj) {
        String str;
        C2597ij c2597ij;
        C2475fj c2475fj;
        C2515gj c2515gj;
        String str2;
        int i2 = c3489yj.f14208e;
        if (i2 == 13 || i2 == 26 || c3489yj.f14170N != null || c3489yj.f14172O != null || ((i2 == 3 && (str2 = c3489yj.f14259v) != null && str2.length() > 0 && c3489yj.f14226k != null) || (((c2597ij = c3489yj.f14228k1) != null && !TextUtils.isEmpty(c2597ij.m12475g())) || (((c2475fj = c3489yj.f14231l1) != null && !TextUtils.isEmpty(c2475fj.m11785f())) || ((c2515gj = c3489yj.f14234m1) != null && !TextUtils.isEmpty(c2515gj.m12026g())))))) {
            if (c3489yj.f14208e == 26 && (str = c3489yj.f14172O) != null) {
                c3489yj.f14170N = str;
                c3489yj.f14172O = null;
            }
            m16239b(c2899lj, c3489yj);
        }
        if (c3489yj.f14268z0 != null) {
            for (int i3 = 0; i3 < c3489yj.f14268z0.size(); i3++) {
                m16222a(c2899lj, c3489yj.f14268z0.get(i3));
            }
        }
    }

    /* renamed from: a */
    private void m16223a(C2899lj c2899lj, C3489yj c3489yj, boolean z) {
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4954g = 0L;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4957j = c3489yj.f14226k;
        c0719l1.f4950c = 14;
        c0719l1.f4971x = c2899lj;
        c2899lj.m13883a(c0719l1, c3489yj);
        this.f13873g.m3992a(c0719l1);
        C0023aj.m160a(this.f13872f).m188d();
        m16303b(c3489yj.f14259v, (String) null);
    }

    /* renamed from: a */
    private void m16224a(C2899lj c2899lj, C3489yj c3489yj, boolean z, boolean z2, C3489yj.a aVar) {
        int i2;
        C3489yj.a aVar2;
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4954g = 0L;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4971x = c2899lj;
        if (z2) {
            int i3 = g.f13924a[aVar.ordinal()];
            if (i3 == 1) {
                c0719l1.f4957j = c3489yj.f14228k1.m12475g();
                c0719l1.f4950c = 11;
                aVar2 = C3489yj.a.FOCUS;
            } else if (i3 == 2) {
                c0719l1.f4957j = c3489yj.f14231l1.m11785f();
                c0719l1.f4950c = 11;
                aVar2 = C3489yj.a.FILLED;
            } else if (i3 == 3) {
                c0719l1.f4957j = c3489yj.f14234m1.m12026g();
                c0719l1.f4950c = 11;
                aVar2 = C3489yj.a.ERROR;
            }
            c0719l1.m5857a(z2, aVar2.name());
        } else {
            if (c3489yj.f14268z0 != null) {
                c0719l1.f4957j = c3489yj.f14172O;
                i2 = 10;
            } else if (z) {
                c0719l1.f4957j = c3489yj.f14170N;
                i2 = 0;
            } else {
                c0719l1.f4957j = c3489yj.f14172O;
                c0719l1.f4950c = 11;
            }
            c0719l1.f4950c = i2;
        }
        c2899lj.m13883a(c0719l1, c3489yj);
        this.f13873g.m3992a(c0719l1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16225a(C2945mj c2945mj, byte[] bArr, C0719l1 c0719l1, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        int m14143g = c2945mj.m14143g();
        for (int i2 = 0; i2 < m14143g; i2++) {
            C2899lj m14114a = c2945mj.m14114a(i2);
            C3531zj c3531zj = m14114a.f11881a;
            if (c3531zj != null && (c3531zj.f14518q || c2945mj.m14155s())) {
                m14114a.f11881a.f14518q = false;
                String str = m14114a.m13901f().f14508g;
                if (str != null) {
                    stringBuffer.append(str + ";");
                }
            }
        }
        if (c2945mj.m14155s()) {
            c2945mj.m14129b(false);
        }
        if (stringBuffer.length() > 0) {
            C0023aj.m160a(this.f13872f).m183b(stringBuffer.toString(), bArr);
        }
        if (!c2945mj.m14154r() || c0719l1 == null) {
            return;
        }
        String m14147k = c2945mj.m14147k() != null ? c2945mj.m14147k() : c0719l1.f4968u;
        if (m14147k.equals("StartAppln_ReqPage")) {
            m14147k = "StartAppln_Req";
        }
        if (!z && m14147k.equals("StartAppln_Req")) {
            C0713j1.m5563a(this.f13872f).m5644c(m14147k, true);
        }
        String m6192i = C0755x1.m6192i(m14147k);
        C0023aj.m160a(this.f13872f).m173a(m6192i, bArr);
        for (int i3 = 0; i3 < m14143g; i3++) {
            String str2 = c2945mj.m14114a(i3).m13901f().f14508g;
            if (str2 != null) {
                C0023aj.m160a(this.f13872f).m193e(str2, m6192i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16231a(byte[] bArr, String str) {
        boolean z;
        Cursor m206j = C0023aj.m160a(this.f13872f).m206j();
        if (m206j != null) {
            m206j.moveToFirst();
            String string = m206j.getString(m206j.getColumnIndex("url"));
            z = string == null || str == null || !string.equals(str);
            m206j.close();
            C0023aj.m160a(this.f13872f).close();
        } else {
            z = true;
        }
        if (z) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            int i2 = 0;
            for (int i3 = 0; i3 < decodeByteArray.getWidth(); i3 += decodeByteArray.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, i3, 0, decodeByteArray.getHeight(), decodeByteArray.getHeight());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 10, byteArrayOutputStream);
                C0023aj.m160a(this.f13872f).m175a(null, byteArrayOutputStream.toByteArray(), null, Integer.toString(i2), str);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private void m16232a(byte[] bArr, C3489yj c3489yj, boolean z) {
        if (bArr != null) {
            if (z) {
                c3489yj.f14254t0 = bArr;
            } else {
                c3489yj.f14260v0 = bArr;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m16233a(String str, j jVar) {
        String str2;
        try {
            HttpURLConnection m3968a = C0579a.m3968a(str, C0713j1.m5563a(this.f13872f).m5658e0());
            m3968a.setRequestMethod("GET");
            if (C0713j1.m5563a(this.f13872f).m5614S() != 0) {
                m3968a.addRequestProperty("X-Cookie", String.valueOf(C0713j1.m5563a(this.f13872f).m5614S()));
            }
            m3968a.addRequestProperty("User-Agent", "2.3.0.11583/" + C0713j1.m5563a(this.f13872f).m5617V());
            String str3 = null;
            if (m3968a.getResponseCode() == 200) {
                try {
                    int headerFieldInt = m3968a.getHeaderFieldInt("Content-Length", -1);
                    if (headerFieldInt <= 0) {
                        headerFieldInt = 256;
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(m3968a.getInputStream());
                    String headerField = m3968a.getHeaderField("X-Cookie");
                    if (TextUtils.isEmpty(headerField)) {
                        str3 = C0755x1.m6167b(bufferedInputStream);
                    } else {
                        C0710i1 c0710i1 = new C0710i1(C0761z1.m6232a(this.f13872f, headerField));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[headerFieldInt];
                        while (true) {
                            int read = bufferedInputStream.read(bArr, 0, headerFieldInt);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] m5540a = c0710i1.m5540a(byteArrayOutputStream.toByteArray());
                        if (m5540a != null) {
                            str3 = new String(m5540a);
                        }
                    }
                    bufferedInputStream.close();
                    m3968a.disconnect();
                } catch (Throwable th) {
                    m3968a.disconnect();
                    throw th;
                }
            }
            if (str3 != null && str3.length() > 0) {
                f13840a0 = true;
                m16313b(str3);
                return f13840a0;
            }
            if (f13841b0 || C3530zi.f14461d == null) {
                return false;
            }
            f13841b0 = true;
            return m16233a(C3530zi.f14461d, jVar);
        } catch (IllegalArgumentException unused) {
            return false;
        } catch (SSLException unused2) {
            C0755x1.f5257o = true;
            return false;
        } catch (Exception unused3) {
            if (f13841b0 || (str2 = C3530zi.f14461d) == null) {
                return false;
            }
            f13841b0 = true;
            return m16233a(str2, jVar);
        }
    }

    /* renamed from: b */
    private C0719l1 m16237b(C2899lj c2899lj, C3489yj c3489yj, boolean z) {
        int i2;
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4963p = c3489yj.f14162J;
        c0719l1.f4954g = 0L;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4971x = c2899lj;
        if (c3489yj.f14268z0 != null) {
            c0719l1.f4957j = c3489yj.f14172O;
            i2 = 10;
        } else if (z) {
            c0719l1.f4957j = c3489yj.f14170N;
            i2 = 0;
        } else {
            c0719l1.f4957j = c3489yj.f14172O;
            i2 = 11;
        }
        c0719l1.f4950c = i2;
        c2899lj.m13883a(c0719l1, c3489yj);
        this.f13873g.m3992a(c0719l1);
        return c0719l1;
    }

    /* renamed from: b */
    private void m16238b(C0613a1 c0613a1, C3531zj c3531zj, C2899lj c2899lj) {
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4954g = 0L;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4957j = c0613a1.f3520a;
        c0719l1.f4950c = 19;
        c0719l1.f4933A = c0613a1;
        this.f13873g.m3997d(c0719l1);
    }

    /* renamed from: b */
    private void m16239b(C2899lj c2899lj, C3489yj c3489yj) {
        String str;
        if (c3489yj.f14208e == 3 && (str = c3489yj.f14259v) != null && str.length() > 0 && c3489yj.f14226k != null) {
            byte[] m190d = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14226k, "public");
            if (m190d != null) {
                c3489yj.f14257u0 = m190d;
                m16303b(c3489yj.f14259v, c3489yj.f14226k);
                m16231a(c3489yj.f14257u0, c3489yj.f14226k);
            } else {
                m16223a(c2899lj, c3489yj, true);
            }
        }
        if (TextUtils.isEmpty(c3489yj.f14187V0) && c3489yj.f14170N != null && (c3489yj.f14242p0 == null || this.f13872f.getResources().getIdentifier(c3489yj.f14242p0, "drawable", this.f13872f.getPackageName()) <= 0)) {
            byte[] m190d2 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14170N, "public");
            if (m190d2 == null) {
                m190d2 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14170N, "private");
            }
            if (m190d2 == null || c3489yj.f14225j1) {
                m16224a(c2899lj, c3489yj, true, false, (C3489yj.a) null);
            } else {
                m16232a(m190d2, c3489yj, true);
                AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
                if (abstractC0652n1 != null) {
                    abstractC0652n1.mo4140a(c3489yj);
                }
            }
        }
        if (c3489yj.f14172O != null && (c3489yj.f14248r0 == null || this.f13872f.getResources().getIdentifier(c3489yj.f14248r0, "drawable", this.f13872f.getPackageName()) <= 0)) {
            byte[] m190d3 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14172O, "public");
            if (m190d3 == null) {
                m190d3 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14172O, "private");
            }
            if (m190d3 == null || c3489yj.f14225j1) {
                m16224a(c2899lj, c3489yj, false, false, (C3489yj.a) null);
            } else {
                m16232a(m190d3, c3489yj, false);
                AbstractC0652n1 abstractC0652n12 = c3489yj.f14197a0;
                if (abstractC0652n12 != null) {
                    abstractC0652n12.mo4140a(c3489yj);
                }
            }
        }
        C2597ij c2597ij = c3489yj.f14228k1;
        if (c2597ij != null && c2597ij.m12475g() != null && (c3489yj.f14228k1.m12474f() == null || this.f13872f.getResources().getIdentifier(c3489yj.f14228k1.m12474f(), "drawable", this.f13872f.getPackageName()) <= 0)) {
            byte[] m190d4 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14228k1.m12475g(), "public");
            if (m190d4 != null) {
                c3489yj.f14228k1.m12462a(m190d4);
            } else {
                m16224a(c2899lj, c3489yj, false, true, C3489yj.a.FOCUS);
            }
        }
        C2475fj c2475fj = c3489yj.f14231l1;
        if (c2475fj != null && c2475fj.m11785f() != null && (c3489yj.f14231l1.m11783e() == null || this.f13872f.getResources().getIdentifier(c3489yj.f14231l1.m11783e(), "drawable", this.f13872f.getPackageName()) <= 0)) {
            byte[] m190d5 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14231l1.m11785f(), "public");
            if (m190d5 != null) {
                c3489yj.f14231l1.m11772a(m190d5);
            } else {
                m16224a(c2899lj, c3489yj, false, true, C3489yj.a.FILLED);
            }
        }
        C2515gj c2515gj = c3489yj.f14234m1;
        if (c2515gj == null || c2515gj.m12026g() == null) {
            return;
        }
        if (c3489yj.f14234m1.m12025f() == null || this.f13872f.getResources().getIdentifier(c3489yj.f14234m1.m12025f(), "drawable", this.f13872f.getPackageName()) <= 0) {
            byte[] m190d6 = C0023aj.m160a(this.f13872f).m190d(c3489yj.f14234m1.m12026g(), "public");
            if (m190d6 != null) {
                c3489yj.f14234m1.m12012a(m190d6);
            } else {
                m16224a(c2899lj, c3489yj, false, true, C3489yj.a.ERROR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m16240b(C2945mj c2945mj, C2899lj c2899lj, boolean z) {
        C3489yj c3489yj;
        String str;
        Vector<C3489yj> vector = c2899lj.f11898r;
        if (vector != null) {
            C3489yj c3489yj2 = null;
            C3489yj c3489yj3 = c2899lj.f11899s;
            if (c3489yj3 != null) {
                int indexOf = vector.indexOf(c3489yj3);
                if (c2899lj.f11898r.size() - 1 > indexOf) {
                    c3489yj = c2899lj.f11898r.get(indexOf + 1);
                }
                if (c3489yj2 != null || (str = c3489yj2.f14220i) == null) {
                }
                m16263a(str, false, true, c2945mj, true, false, c3489yj2.f14223j, c2899lj);
                return;
            }
            c3489yj = vector.get(0);
            c3489yj2 = c3489yj;
            c2899lj.f11899s = c3489yj2;
            if (c3489yj2 != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public C0737r1 m16244c(String str, boolean z) {
        HashMap<String, C0737r1> hashMap = this.f13870d;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        String m6192i = C0755x1.m6192i(str);
        C0737r1 c0737r1 = this.f13870d.get(m6192i);
        if (!z) {
            return c0737r1;
        }
        this.f13870d.remove(m6192i);
        return c0737r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m16245c(C2899lj c2899lj) {
        Vector<C0613a1> vector;
        String str;
        long j2;
        C3531zj m13901f = c2899lj.m13901f();
        if (m13901f == null || (vector = m13901f.f14505d) == null) {
            return;
        }
        Iterator<C0613a1> it = vector.iterator();
        while (it.hasNext()) {
            C0613a1 next = it.next();
            if (next.f3520a != null && (str = next.f3521b) != null) {
                if (str.equalsIgnoreCase("screen")) {
                    if (!next.f3524e) {
                        if (!C0023aj.m160a(this.f13872f).m205i(C0755x1.m6192i(next.f3520a), "cachedAcrossSession")) {
                        }
                    }
                    m16260a(next, c2899lj);
                } else if (next.f3521b.equalsIgnoreCase("image")) {
                    if (next.f3524e || !C0023aj.m160a(this.f13872f).m205i(next.f3520a, "public")) {
                        m16220a(next, m13901f, c2899lj);
                    }
                } else if (next.f3521b.equalsIgnoreCase("media")) {
                    String str2 = next.f3523d.size() > 0 ? next.f3523d.get(0) : null;
                    if (TextUtils.isEmpty(str2)) {
                        if (!TextUtils.isEmpty(next.f3520a)) {
                            String str3 = next.f3520a;
                            str2 = str3.substring(str3.lastIndexOf(47) + 1);
                        }
                    } else if (str2.startsWith("lottie_splash.json") && str2.contains(";")) {
                        String[] split = str2.split(";");
                        String str4 = split[0];
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                j2 = Long.parseLong(split[1]);
                            } catch (NumberFormatException unused) {
                                j2 = -1;
                            }
                            if (j2 != -1) {
                                C0713j1.m5563a(this.f13872f).m5636b(j2);
                            }
                        }
                        next.f3523d.add(0, str4);
                        str2 = str4;
                    }
                    boolean m6193j = C0755x1.m6193j(C0755x1.m6127a(this.f13872f, 1, "webaxn_media") + str2);
                    if (next.f3524e || !m6193j) {
                        m16238b(next, m13901f, c2899lj);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m16248d(C0719l1 c0719l1) {
        if (C3530zi.f14454A != 0) {
            C0737r1 c0737r1 = new C0737r1();
            c0737r1.m6011a(C3530zi.f14454A);
            c0737r1.m6013a("Start_App_Request", C3530zi.f14455B);
            c0719l1.m5855a(c0737r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m16249d(C2899lj c2899lj) {
        C3531zj m13901f = c2899lj.m13901f();
        if (m13901f == null || m13901f.f14506e == null) {
            return;
        }
        for (int i2 = 0; i2 < m13901f.f14506e.size(); i2++) {
            m16222a(c2899lj, m13901f.f14506e.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m16251e(C2899lj c2899lj) {
        if (c2899lj != null) {
            HashMap<String, Integer> m13902g = c2899lj.m13902g();
            for (String str : m13902g.keySet()) {
                byte[] m190d = C0023aj.m160a(this.f13872f).m190d(str, "public");
                if (m190d == null) {
                    m190d = C0023aj.m160a(this.f13872f).m190d(str, "private");
                }
                if (m190d == null) {
                    m16221a(str, m13902g.get(str).intValue(), c2899lj);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.comviva.webaxn.utils.C0719l1 m16253h(java.lang.String r3) {
        /*
            r2 = this;
            com.comviva.webaxn.utils.l1 r0 = new com.comviva.webaxn.utils.l1
            r0.<init>()
            if (r3 != 0) goto L1a
            java.lang.String r3 = "StartAppln_Req"
            r0.f4968u = r3
            r3 = 1
            android.content.Context r1 = r2.f13872f
            com.comviva.webaxn.utils.j1 r1 = com.comviva.webaxn.utils.C0713j1.m5563a(r1)
            int r1 = r1.m5613R()
            if (r3 != r1) goto L1c
            java.lang.String r3 = "StartAppln_ReqPage"
        L1a:
            r0.f4968u = r3
        L1c:
            android.content.Context r3 = r2.f13872f
            com.comviva.webaxn.utils.j1 r3 = com.comviva.webaxn.utils.C0713j1.m5563a(r3)
            java.lang.String r3 = r3.m5725s0()
            r0.f4948a = r3
            android.content.Context r3 = r2.f13872f
            com.comviva.webaxn.utils.j1 r3 = com.comviva.webaxn.utils.C0713j1.m5563a(r3)
            java.lang.String r1 = "iniversion"
            int r3 = r3.m5632b(r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.f4937E = r3
            java.lang.String r3 = r2.m16341r()
            r0.f4936D = r3
            r3 = 0
            r0.f4939G = r3
            com.comviva.webaxn.utils.b r3 = r2.f13874h
            if (r3 == 0) goto L4d
            com.comviva.webaxn.utils.j r3 = r3.m5343a()
            r0.f4940H = r3
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.m16253h(java.lang.String):com.comviva.webaxn.utils.l1");
    }

    /* renamed from: A */
    public C0655o1 m16254A() {
        return this.f13855N.pop();
    }

    /* renamed from: B */
    public void m16255B() {
        this.f13882p = null;
    }

    /* renamed from: C */
    public void m16256C() {
        for (int size = this.f13855N.size() - 1; size >= 0; size--) {
            C3531zj m4815i = this.f13855N.get(size).m4815i();
            if (m4815i != null && m4815i.f14514m.equalsIgnoreCase("popup")) {
                C0655o1 pop = this.f13855N.pop();
                pop.m4769D();
                pop.m4768C();
                pop.m4817k().setOnClickListener(null);
                pop.m4817k().setOnTouchListener(null);
                if (pop.m4815i().f14504c != null) {
                    pop.m4815i().f14504c.m4605a();
                }
                this.f13856O.removeView(pop.m4819m());
            }
        }
    }

    /* renamed from: D */
    public boolean m16257D() {
        boolean z;
        if (TextUtils.isEmpty(this.f13843B) && TextUtils.isEmpty(this.f13844C) && TextUtils.isEmpty(this.f13889w)) {
            z = false;
        } else {
            m16311b(true);
            z = true;
        }
        if (z) {
            if (!TextUtils.isEmpty(this.f13843B)) {
                C0713j1.m5563a(this.f13872f).m5629a(this.f13843B, true);
            }
            if (!TextUtils.isEmpty(this.f13844C)) {
                C0713j1.m5563a(this.f13872f).m5637b(this.f13844C, true);
            }
            if (!TextUtils.isEmpty(this.f13889w)) {
                C0713j1.m5563a(this.f13872f).m5588F(this.f13889w);
            }
            if (!TextUtils.isEmpty(this.f13891y)) {
                C0713j1.m5563a(this.f13872f).m5582D(this.f13891y);
            }
            if (!TextUtils.isEmpty(this.f13890x)) {
                C0713j1.m5563a(this.f13872f).m5585E(this.f13890x);
            }
            if (!TextUtils.isEmpty(this.f13892z)) {
                C0713j1.m5563a(this.f13872f).m5591G(this.f13892z);
            }
            C0713j1.m5563a(this.f13872f).m5711p(this.f13846E);
            C0713j1.m5563a(this.f13872f).m5707o(this.f13847F);
            if (!TextUtils.isEmpty(this.f13849H)) {
                C0713j1.m5563a(this.f13872f).m5736v(this.f13849H);
            }
            C0713j1.m5563a(this.f13872f).m5651d(this.f13850I);
            C0713j1.m5563a(this.f13872f).m5668g(this.f13851J);
            C0713j1.m5563a(this.f13872f).m5747y(this.f13845D);
            C0713j1.m5563a(this.f13872f).m5750z(this.f13852K);
            C0713j1.m5563a(this.f13872f).m5719r(this.f13853L);
            C0713j1.m5563a(this.f13872f).m5749z(this.f13848G);
        } else if (C0713j1.m5563a(this.f13872f).m5669g()) {
            C0713j1.m5563a(this.f13872f).m5629a(C3530zi.f14458a, false);
            C0713j1.m5563a(this.f13872f).m5637b(C3530zi.f14459b, false);
        }
        return z;
    }

    /* renamed from: E */
    public void m16258E() {
        if (this.f13868b == null) {
            this.f13868b = this.f13867a;
        }
        C3129qj c3129qj = this.f13868b;
        if (c3129qj == null) {
            m16315c();
        } else {
            m16309b(c3129qj);
        }
    }

    /* renamed from: F */
    public void m16259F() {
        if (m16343t() != null) {
            m16343t().m4809d().setVisibility(8);
            f13839Z = 0;
            m16343t().m4809d().setProgress(f13839Z);
        }
        this.f13868b = null;
        Dialog dialog = this.f13881o;
        if (dialog != null) {
            dialog.dismiss();
            this.f13881o = null;
        }
        m16346w();
    }

    /* renamed from: a */
    public int m16260a(C0613a1 c0613a1, C2899lj c2899lj) {
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4968u = c0613a1.f3520a;
        c0719l1.f4948a = C0713j1.m5563a(this.f13872f).m5725s0();
        c0719l1.f4951d = C0713j1.m5563a(this.f13872f).m5670g0();
        c0719l1.f4937E = String.valueOf(C0713j1.m5563a(this.f13872f).m5632b("iniversion"));
        c0719l1.f4936D = m16341r();
        c0719l1.f4939G = false;
        c0719l1.f4971x = c2899lj;
        c0719l1.f4935C = false;
        c0719l1.f4933A = c0613a1;
        C0687b c0687b = this.f13874h;
        if (c0687b != null) {
            c0719l1.f4940H = c0687b.m5343a();
        }
        return m16214a(c0719l1, false, 17);
    }

    /* renamed from: a */
    public int m16261a(C0719l1 c0719l1) {
        C2899lj c2899lj;
        C0755x1.f5246d = C0755x1.m6157a(c0719l1);
        int i2 = c0719l1.f4950c;
        if (i2 != 17 && i2 != 13 && C0713j1.m5563a(this.f13872f).m5675h0() == 0) {
            C0761z1.m6233a(this.f13872f);
        }
        byte[] m16320c = m16320c(c0719l1);
        if (m16320c == null) {
            return 0;
        }
        c0719l1.f4955h = m16320c;
        if (c0719l1 == null) {
            return -1;
        }
        if (true == c0719l1.f4935C && (c2899lj = c0719l1.f4971x) != null && c2899lj.m13901f() != null && c0719l1.f4971x.m13901f().f14504c != null) {
            c0719l1.f4971x.m13901f().f14504c.f3932j = c0719l1;
        }
        int i3 = c0719l1.f4950c;
        if (i3 == 17 || i3 == 20 || i3 == 13 || i3 == 16) {
            this.f13873g.m3997d(c0719l1);
            return -1;
        }
        if (i3 == 4 || i3 == 5 || i3 == 15) {
            m16302b(c0719l1);
        }
        int m3992a = this.f13873g.m3992a(c0719l1);
        if (true == c0719l1.f4935C) {
            return -1;
        }
        return m3992a;
    }

    /* renamed from: a */
    public int m16262a(String str, boolean z, boolean z2) {
        if (m16343t() != null) {
            C0755x1.m6151a(this.f13872f, (C3489yj) null, m16343t().m4824r().getApplicationWindowToken());
        }
        if (C0713j1.m5563a(this.f13872f).m5654e("serverurl") != null && !z) {
            return m16300b(str, z2);
        }
        try {
            if (this.f13862U != null) {
                this.f13862U.cancel(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f13862U = m16267a(str, (C0719l1) null, z2);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0375, code lost:
    
        if (r13 != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02cc, code lost:
    
        r3 = java.lang.Integer.valueOf(r8).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02e5, code lost:
    
        if (r3 != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0314, code lost:
    
        if (r3 != null) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x031e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m16263a(java.lang.String r17, boolean r18, boolean r19, p000.C2945mj r20, boolean r21, boolean r22, java.lang.String r23, p000.C2899lj r24) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.m16263a(java.lang.String, boolean, boolean, mj, boolean, boolean, java.lang.String, lj):int");
    }

    /* renamed from: a */
    public C0655o1 m16264a(C2899lj c2899lj) {
        for (int i2 = 0; i2 < this.f13855N.size(); i2++) {
            if (this.f13855N.elementAt(i2).m4811e() != null && this.f13855N.elementAt(i2).m4811e().equals(c2899lj)) {
                return this.f13855N.elementAt(i2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m16265a(boolean z) {
        String m5654e = z ? C0713j1.m5563a(this.f13872f).m5654e("secureserverurl") : null;
        return m5654e == null ? C0713j1.m5563a(this.f13872f).m5654e("serverurl") : m5654e;
    }

    /* renamed from: a */
    public Vector<C3489yj> m16266a(C3531zj c3531zj, C3531zj c3531zj2, C2899lj c2899lj, C2899lj c2899lj2) {
        boolean z;
        int i2;
        Vector<C3489yj> vector;
        Vector<C3489yj> vector2;
        Vector<C3489yj> vector3 = new Vector<>();
        Vector<C3489yj> vector4 = c3531zj2.f14506e;
        if (c3531zj2.f14519r != null) {
            if (c3531zj.f14519r == null) {
                c3531zj.f14519r = new HashMap<>();
            }
            c3531zj.f14519r.putAll(c3531zj2.f14519r);
        }
        HashMap<String, Vector<C2862kj>> hashMap = c2899lj2.f11887g;
        if (hashMap != null && hashMap.size() > 0) {
            c2899lj.f11887g.putAll(c2899lj2.f11887g);
        }
        HashMap<String, C3489yj> hashMap2 = c2899lj2.f11888h;
        if (hashMap2 != null && hashMap2.size() > 0) {
            c2899lj.f11888h.putAll(c2899lj2.f11888h);
        }
        HashMap<String, Vector<C2862kj>> hashMap3 = c2899lj2.f11889i;
        if (hashMap3 != null && hashMap3.size() > 0) {
            c2899lj.f11889i.putAll(c2899lj2.f11889i);
        }
        HashMap<String, Vector<C2862kj>> hashMap4 = c2899lj2.f11890j;
        if (hashMap4 != null && hashMap4.size() > 0) {
            c2899lj.f11890j.putAll(c2899lj2.f11890j);
        }
        if (vector4 != null) {
            for (int i3 = 0; i3 < vector4.size(); i3++) {
                C3489yj c3489yj = vector4.get(i3);
                if (c3489yj != null) {
                    String str = c3489yj.f14186V;
                    if (str != null && (vector = c3531zj.f14506e) != null) {
                        for (int i4 = 0; i4 < vector.size(); i4++) {
                            C3489yj m6136a = C0755x1.m6136a(vector.elementAt(i4), str);
                            if (m6136a != null) {
                                C3489yj c3489yj2 = m6136a.f14145A0;
                                if (c3489yj2 == null) {
                                    c3531zj.f14506e.insertElementAt(c3489yj, c3531zj.f14506e.indexOf(m6136a));
                                    vector2 = c3531zj.f14506e;
                                } else {
                                    c3489yj.f14145A0 = c3489yj2;
                                    c3489yj2.f14268z0.insertElementAt(c3489yj, c3489yj2.f14268z0.indexOf(m6136a));
                                    vector2 = c3489yj2.f14268z0;
                                }
                                vector2.remove(m6136a);
                                AbstractC0652n1 abstractC0652n1 = m6136a.f14197a0;
                                if (abstractC0652n1 != null) {
                                    abstractC0652n1.mo4142b();
                                    m6136a.f14197a0 = null;
                                    for (int i5 = 0; i5 < m6136a.f14200b0.size(); i5++) {
                                        try {
                                            C0639j0 c0639j0 = m6136a.f14200b0.get(i5);
                                            if (c0639j0.f3875l != null) {
                                                c0639j0.f3875l.f3878o.remove(c0639j0);
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                    m6136a.f14200b0.clear();
                                }
                                vector3.add(c3489yj);
                                z = true;
                                if (!z && (i2 = c3489yj.f14208e) != 23 && i2 != 24) {
                                    c3531zj.f14506e.add(c3489yj);
                                    vector3.add(c3489yj);
                                }
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        c3531zj.f14506e.add(c3489yj);
                        vector3.add(c3489yj);
                    }
                }
            }
        }
        return vector3;
    }

    /* renamed from: a */
    public k m16267a(String str, C0719l1 c0719l1, boolean z) {
        String str2;
        String str3;
        boolean z2;
        Context context;
        int i2;
        int m5781r = C0714k.m5781r(this.f13872f);
        if (m5781r == 0) {
            str2 = C3530zi.f14464g ? "msg.gprs_error" : "msg.noconn_error";
            str3 = C0713j1.m5563a(this.f13872f).m5641c(str2);
            if (str3 == null) {
                if (C3530zi.f14464g) {
                    context = this.f13872f;
                    i2 = R.string.error_message_conn_gprs;
                } else {
                    context = this.f13872f;
                    i2 = R.string.error_message_conn;
                }
                str3 = context.getString(i2);
            }
            z2 = false;
        } else if (C3530zi.f14464g && m5781r == 1) {
            str2 = "msg.wifi_error";
            str3 = C0713j1.m5563a(this.f13872f).m5641c("msg.wifi_error");
            if (str3 == null) {
                context = this.f13872f;
                i2 = R.string.error_wifi;
                str3 = context.getString(i2);
            }
            z2 = false;
        } else {
            str2 = null;
            str3 = null;
            z2 = true;
        }
        if (!z2) {
            m16259F();
            if (!m16297a(str2, false)) {
                m16281a(str3, (String) null, true);
            }
            return null;
        }
        j jVar = new j(this);
        jVar.f13930b = str;
        jVar.f13929a = c0719l1;
        jVar.f13933e = false;
        jVar.f13932d = z;
        k kVar = new k();
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                kVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, jVar);
            } else {
                kVar.execute(jVar);
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        return kVar;
    }

    /* renamed from: a */
    public void m16268a() {
        try {
            if (this.f13862U != null) {
                this.f13862U.cancel(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m16269a(int i2) {
        this.f13877k = true;
        this.f13876j = i2;
    }

    /* renamed from: a */
    public void m16270a(int i2, View view) {
        Context context;
        int i3;
        if (i2 == 0) {
            view.setBackgroundResource(R.drawable.loader);
            context = this.f13872f;
            i3 = R.anim.rotate;
        } else {
            if (i2 == 1) {
                view.setBackgroundResource(R.drawable.sequential_frame_animation);
                ((AnimationDrawable) view.getBackground()).start();
                return;
            }
            if (i2 == 2) {
                view.setBackgroundResource(R.drawable.loader);
                context = this.f13872f;
                i3 = R.anim.blink;
            } else if (i2 == 3) {
                view.setBackgroundResource(R.drawable.loader);
                context = this.f13872f;
                i3 = R.anim.bounce;
            } else if (i2 == 4) {
                view.setBackgroundResource(R.drawable.loader);
                context = this.f13872f;
                i3 = R.anim.move_horizontal;
            } else {
                if (i2 != 5) {
                    return;
                }
                view.setBackgroundResource(R.drawable.loader);
                context = this.f13872f;
                i3 = R.anim.move_vertical;
            }
        }
        view.startAnimation(AnimationUtils.loadAnimation(context, i3));
    }

    /* renamed from: a */
    public void m16271a(C0579a c0579a) {
        this.f13873g = c0579a;
    }

    /* renamed from: a */
    public void m16272a(C0655o1 c0655o1) {
        this.f13855N.push(c0655o1);
    }

    /* renamed from: a */
    public void m16273a(C0661r0 c0661r0) {
        this.f13859R = c0661r0;
    }

    /* renamed from: a */
    public void m16274a(C0687b c0687b) {
        this.f13874h = c0687b;
    }

    /* renamed from: a */
    public void m16275a(C0696e c0696e) {
        this.f13879m = c0696e;
    }

    /* renamed from: a */
    public void m16276a(C0755x1.r rVar) {
        this.f13860S = rVar;
    }

    /* renamed from: a */
    public void m16277a(String str) {
        if (TextUtils.isEmpty(str)) {
            C0023aj.m160a(this.f13872f).m169a();
            C0023aj.m160a(this.f13872f).m192e();
            C0023aj.m160a(this.f13872f).m198g();
            C0023aj.m160a(this.f13872f).m195f();
            C0023aj.m160a(this.f13872f).m181b();
            return;
        }
        for (String str2 : str.split(",")) {
            try {
                String decode = URLDecoder.decode(str2, "UTF-8");
                C0023aj.m160a(this.f13872f).m189d(decode);
                String m180b = C0023aj.m160a(this.f13872f).m180b(decode, "cachedpagemap");
                if (TextUtils.isEmpty(m180b)) {
                    decode = C0755x1.m6192i(decode);
                    C0023aj.m160a(this.f13872f).m182b(decode);
                } else {
                    C0023aj.m160a(this.f13872f).m182b(m180b);
                }
                C0023aj.m160a(this.f13872f).m186c(decode);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m16278a(String str, C0719l1 c0719l1) {
        byte[] m187c = C0023aj.m160a(this.f13872f).m187c(str, "cached");
        if (m187c == null) {
            String m180b = C0023aj.m160a(this.f13872f).m180b(str, "cachedpagemap");
            if (TextUtils.isEmpty(m180b)) {
                m180b = C0755x1.m6192i(str);
            }
            m187c = C0023aj.m160a(this.f13872f).m179a(m180b, "cachedAcrossSession");
        }
        if (m187c == null || c0719l1.f4971x == null) {
            return;
        }
        m16294a(m187c, (String) null, h.WBXML_BUFFER, c0719l1);
    }

    /* renamed from: a */
    public void m16279a(String str, C0737r1 c0737r1) {
        if (this.f13870d == null) {
            this.f13870d = new HashMap<>();
        }
        if (c0737r1 != null) {
            this.f13870d.put(C0755x1.m6192i(str), c0737r1);
        }
    }

    /* renamed from: a */
    public void m16280a(String str, String str2) {
        this.f13887u.f14147B0 = null;
        if (str != null) {
            String replaceAll = str.replaceAll("[^\\d]", "");
            if (str2 != null) {
                this.f13887u.f14147B0 = str2 + " <" + replaceAll + ">";
            } else {
                this.f13887u.f14147B0 = " <" + replaceAll + ">";
            }
        }
        if (m16214a(this.f13884r, this.f13885s, this.f13886t) > 0) {
            m16258E();
        }
    }

    /* renamed from: a */
    public void m16281a(String str, String str2, boolean z) {
        String m5641c = C0713j1.m5563a(this.f13872f).m5641c("ttl.Alert");
        if (m5641c == null) {
            m5641c = this.f13872f.getString(R.string.dialog_title);
        }
        if (str == null) {
            str = this.f13872f.getString(R.string.default_connect_err);
        }
        if (str2 != null && !str2.equals("StartAppln_Req") && !str2.equals("StartAppln_ReqPage")) {
            C0755x1.m6148a(this.f13872f, m5641c, str, z, true);
            return;
        }
        String m5641c2 = C0713j1.m5563a(this.f13872f).m5641c("cmd.Exit");
        if (m5641c2 == null) {
            m5641c2 = this.f13872f.getString(R.string.dialog_button_exit);
        }
        C0755x1.m6147a(this.f13872f, str, m5641c2, false);
    }

    /* renamed from: a */
    public void m16282a(String str, C2899lj c2899lj) {
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4954g = 0L;
        c0719l1.f4957j = str;
        c0719l1.f4956i = 1;
        m16331h();
        c0719l1.f4964q = this.f13863V;
        c0719l1.f4950c = 2;
        c0719l1.f4971x = c2899lj;
        c2899lj.m13879a(2, c0719l1.f4957j);
        this.f13873g.m3992a(c0719l1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m16283a(java.lang.String r14, p000.C2945mj r15, p000.C2899lj r16, p000.C3489yj r17, com.comviva.webaxn.utils.C0696e r18) {
        /*
            r13 = this;
            r9 = r13
            r0 = r14
            r8 = r16
            r7 = r17
            r10 = r18
            if (r8 == 0) goto Lc7
            java.lang.String r1 = "action"
            boolean r1 = r14.startsWith(r1)
            r11 = 0
            r2 = 0
            if (r1 == 0) goto L22
            r1 = 7
            int r3 = r14.length()
            java.lang.String r0 = r14.substring(r1, r3)
            java.lang.String r1 = ""
            r12 = r0
            r0 = r1
            goto L40
        L22:
            java.lang.String r1 = "&action="
            int r1 = r14.indexOf(r1)
            r3 = -1
            if (r1 == r3) goto L3f
            int r3 = r1 + 8
            int r4 = r14.length()
            java.lang.String r3 = r14.substring(r3, r4)
            java.lang.String r0 = r14.substring(r2, r1)
            java.lang.String r0 = r0.trim()
            r12 = r3
            goto L40
        L3f:
            r12 = r11
        L40:
            java.lang.String r1 = "&"
            java.lang.String[] r0 = r0.split(r1)
            r1 = 0
        L47:
            int r3 = r0.length
            if (r1 >= r3) goto L76
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "c3ltoggle:"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L5c
            r13.m16324d(r3, r8)
            goto L73
        L5c:
            java.lang.String r4 = "c3lshow:"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L68
            r13.m16316c(r3, r8)
            goto L73
        L68:
            java.lang.String r4 = "c3lhide:"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L73
            r13.m16304b(r3, r8)
        L73:
            int r1 = r1 + 1
            goto L47
        L76:
            com.comviva.webaxn.ui.o1 r0 = r13.m16264a(r8)
            if (r0 == 0) goto L85
            com.comviva.webaxn.ui.o1 r0 = r13.m16264a(r8)
            android.content.Context r1 = r9.f13872f
            r0.m4783a(r8, r1, r2)
        L85:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto Lc7
            r2 = 0
            r0 = r13
            r1 = r12
            r3 = r17
            r4 = r18
            r5 = r15
            r6 = r16
            boolean r0 = r0.m16298a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto Lc7
            if (r7 == 0) goto La1
            java.lang.String r0 = r7.f14223j
        L9f:
            r7 = r0
            goto La7
        La1:
            if (r10 == 0) goto La6
            java.lang.String r0 = r10.f4718j
            goto L9f
        La6:
            r7 = r11
        La7:
            java.util.Vector r0 = r15.m14145i()
            xj r0 = com.comviva.webaxn.utils.C0755x1.m6134a(r12, r0)
            r4 = r15
            if (r0 == 0) goto Lb5
            r15.m14121a(r0)
        Lb5:
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0 = r13
            r1 = r12
            r4 = r15
            r8 = r16
            int r0 = r0.m16263a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 <= 0) goto Lc7
            r13.m16258E()
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.m16283a(java.lang.String, mj, lj, yj, com.comviva.webaxn.utils.e):void");
    }

    /* renamed from: a */
    public void m16284a(String str, C3489yj c3489yj, C0696e c0696e, boolean z) {
        String str2 = null;
        if (z && m16343t() != null) {
            C0755x1.m6151a(this.f13872f, (C3489yj) null, m16343t().m4824r().getApplicationWindowToken());
        }
        if (this.f13855N.size() == 1) {
            C0755x1.m6138a((Activity) this.f13872f);
            return;
        }
        if (this.f13855N.size() > 0) {
            m16334k();
            C0655o1 m16254A = m16254A();
            m16254A.m4817k().setOnClickListener(null);
            m16254A.m4817k().setOnTouchListener(null);
            m16254A.m4769D();
            m16254A.m4768C();
            C2899lj c2899lj = m16254A.f4136d;
            if (c2899lj.m13901f().f14504c != null) {
                c2899lj.m13901f().f14504c.m4605a();
            }
            c2899lj.m13910o();
            c2899lj.m13880a(this.f13872f);
            if (!m16254A.m4799a(true)) {
                this.f13856O.removeView(m16254A.m4819m());
            }
            if (m16343t() != null) {
                m16343t().m4772a();
                m16343t().m4771F();
                if (!TextUtils.isEmpty(str)) {
                    HashMap<String, String> m6188f = C0755x1.m6188f(str);
                    if (m6188f.size() > 0) {
                        String str3 = m6188f.get("action");
                        if (!TextUtils.isEmpty(str3) && !m16298a(str3, false, c3489yj, c0696e, m16334k(), m16343t().f4136d)) {
                            if (c3489yj != null) {
                                str2 = c3489yj.f14223j;
                            } else if (c0696e != null) {
                                str2 = c0696e.f4718j;
                            }
                            String str4 = str2;
                            C3440xj m6134a = C0755x1.m6134a(str3, m16334k().m14145i());
                            if (m6134a != null) {
                                m16334k().m14121a(m6134a);
                            }
                            if (m16263a(str3, false, false, m16334k(), false, false, str4, m16343t().f4136d) > 0) {
                                m16258E();
                            }
                        }
                        m6188f.clear();
                    }
                }
                m16288a(m16334k(), m16343t().f4136d, true);
                if (m16343t().m4820n() != null) {
                    m16343t().m4820n().m5937c();
                }
                if (m16343t().f4136d != null) {
                    m16343t().f4136d.m13909n();
                }
            }
        }
    }

    /* renamed from: a */
    public void m16285a(String str, C3489yj c3489yj, C2945mj c2945mj) {
        String str2;
        String str3;
        if (c3489yj != null && (((str2 = c3489yj.f14229l) != null && str2.equals("sms")) || (((str3 = c3489yj.f14232m) != null && str3.equals("sms")) || c3489yj.f14208e == 18))) {
            if (TextUtils.isEmpty(c3489yj.f14250s) || TextUtils.isEmpty(c3489yj.f14253t) || m16343t() == null) {
                return;
            }
            m16343t().m4781a(c3489yj.f14250s, c3489yj.f14253t, (String) null, c2945mj);
            return;
        }
        if (C3530zi.f14467j && str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
            C0731p1.m5970d(this.f13872f, str);
            return;
        }
        if (str != null) {
            if (!TextUtils.isEmpty(str) && str.startsWith("file://")) {
                str = "file:///android_asset/map/" + str.substring(7);
            }
            C0731p1.m5955a(this.f13872f, c3489yj != null ? c3489yj.f14223j : null, str);
        }
    }

    /* renamed from: a */
    public void m16286a(String str, byte[] bArr) {
        if (C0023aj.m160a(this.f13872f).m203i("private") >= 10485760) {
            C0023aj.m160a(this.f13872f).m170a("private");
        }
        C0023aj.m160a(this.f13872f).m172a(str, "private", bArr);
    }

    /* renamed from: a */
    public void m16287a(C2945mj c2945mj, C2899lj c2899lj) {
        if (c2945mj == null || c2899lj == null) {
            return;
        }
        for (C0719l1 c0719l1 : c2899lj.m13904i()) {
            if (c0719l1 != null) {
                if (c0719l1.f4963p) {
                    c0719l1.f4962o = true;
                } else {
                    this.f13873g.m3996c(c0719l1);
                }
            }
        }
        c2899lj.m13907l();
    }

    /* renamed from: a */
    public void m16288a(C2945mj c2945mj, C2899lj c2899lj, boolean z) {
        if (c2945mj == null || c2899lj == null || c2899lj.m13901f().f14504c == null) {
            return;
        }
        c2899lj.m13901f().f14504c.m4608a(false, z, m16343t());
    }

    /* renamed from: a */
    public void m16289a(C3129qj c3129qj) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        if (m16343t() != null) {
            m16343t().m4809d().setVisibility(8);
        }
        Dialog dialog = this.f13881o;
        if (dialog == null || !dialog.isShowing()) {
            int m5552d = C0687b.m5342a(this.f13872f).m5343a().m5552d();
            int m5547b = C0687b.m5342a(this.f13872f).m5343a().m5547b();
            if (m5552d >= m5547b) {
                m5552d = m5547b;
            }
            Dialog dialog2 = new Dialog(this.f13872f);
            this.f13881o = dialog2;
            dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f13881o.requestWindowFeature(1);
            View inflate = ((Activity) this.f13872f).getLayoutInflater().inflate(R.layout.custom_progressbar, (ViewGroup) null);
            if (c3129qj != null && c3129qj.m15121h()) {
                inflate.setBackgroundColor(Color.argb(150, Color.red(c3129qj.m15108b()), Color.green(c3129qj.m15108b()), Color.blue(c3129qj.m15108b())));
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.progress_bar);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.loaderimage);
            linearLayout.setId(1);
            TextView textView = (TextView) inflate.findViewById(R.id.progress_text);
            textView.setId(2);
            double d2 = m5552d;
            Double.isNaN(d2);
            textView.setMaxWidth((int) (0.6d * d2));
            if (c3129qj == null || TextUtils.isEmpty(c3129qj.m15124k())) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(c3129qj.m15124k());
                textView.setTextSize(c3129qj.m15118e());
                if (c3129qj.m15122i()) {
                    textView.setTextColor(AbstractC0652n1.m4701d(c3129qj.m15112c()));
                }
                textView.setTypeface(c3129qj.m15120g(), AbstractC0652n1.m4702e(c3129qj.m15119f()));
                if (Build.VERSION.SDK_INT >= 21) {
                    textView.setLetterSpacing(c3129qj.m15115d());
                }
                String m15104a = c3129qj.m15104a();
                if (m15104a.equalsIgnoreCase("B")) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams3.addRule(3, 1);
                    layoutParams3.addRule(14);
                    textView.setLayoutParams(layoutParams3);
                    layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams.addRule(14);
                } else {
                    if (m15104a.equalsIgnoreCase("L")) {
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                        layoutParams4.addRule(1, 2);
                        layoutParams4.addRule(15);
                        linearLayout.setLayoutParams(layoutParams4);
                        layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams2.addRule(15);
                    } else if (m15104a.equalsIgnoreCase("T")) {
                        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                        layoutParams5.addRule(3, 2);
                        layoutParams5.addRule(14);
                        linearLayout.setLayoutParams(layoutParams5);
                        layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams2.addRule(14);
                    } else {
                        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams6.addRule(1, 1);
                        layoutParams6.addRule(15);
                        textView.setLayoutParams(layoutParams6);
                        layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                        layoutParams.addRule(15);
                    }
                    textView.setLayoutParams(layoutParams2);
                }
                linearLayout.setLayoutParams(layoutParams);
            }
            Double.isNaN(d2);
            double d3 = d2 * 0.15d;
            double sqrt = Math.sqrt(2.0d) * d3;
            double abs = (int) Math.abs(sqrt - d3);
            Double.isNaN(abs);
            double d4 = sqrt + abs;
            int i2 = (int) d3;
            new LinearLayout.LayoutParams(i2, i2);
            imageView.getLayoutParams().width = i2;
            imageView.getLayoutParams().height = i2;
            int i3 = (int) d4;
            new RelativeLayout.LayoutParams(i3, i3);
            linearLayout.getLayoutParams().width = i3;
            linearLayout.getLayoutParams().height = i3;
            m16270a(0, imageView);
            this.f13881o.setContentView(inflate);
            this.f13881o.show();
            this.f13881o.setCancelable(true);
            this.f13881o.setCanceledOnTouchOutside(false);
            this.f13881o.setOnCancelListener(new e());
        }
    }

    /* renamed from: a */
    public void m16290a(l lVar) {
        C2899lj c2899lj;
        C0719l1 c0719l1 = lVar.f13939e;
        C2945mj m4812f = lVar.f13940f.m4812f();
        if (m4812f == null) {
            return;
        }
        C2899lj m4811e = lVar.f13940f.m4811e();
        if (m4811e == null && m16343t() != null) {
            m4811e = m16343t().m4811e();
        }
        C2899lj c2899lj2 = m4811e;
        if (c2899lj2 != null) {
            C3531zj m13901f = c2899lj2.m13901f();
            if (c0719l1 != null && (c2899lj = c0719l1.f4971x) != null && c2899lj.m13901f() != null && c0719l1.f4971x.m13901f().equals(m13901f)) {
                C3531zj c3531zj = null;
                if (lVar.f13936b != null) {
                    if (!lVar.f13941g && C0755x1.f5247e) {
                        C0755x1.f5247e = false;
                    }
                    String str = lVar.f13936b.f12170w;
                    if (str != null) {
                        m16277a(str);
                    }
                    if (lVar.f13936b.f12171x != null) {
                        m16321d();
                    }
                    C2945mj c2945mj = lVar.f13936b;
                    c2945mj.f12171x = null;
                    c2945mj.f12170w = null;
                    if (c2945mj.m14114a(0) != null) {
                        C3531zj m13901f2 = lVar.f13936b.m14114a(0).m13901f();
                        if (m13901f2 != null && (m13901f2.f14514m.equalsIgnoreCase("confirm") || m13901f2.f14514m.equalsIgnoreCase("error") || m13901f2.f14514m.equalsIgnoreCase("info") || m13901f2.f14514m.equalsIgnoreCase("toast") || m13901f2.f14514m.equalsIgnoreCase("popup") || m13901f2.f14514m.equalsIgnoreCase("drawer"))) {
                            m16295a(lVar.f13935a, null, h.WBXML_BUFFER, lVar.f13939e, lVar.f13941g, false, true);
                            return;
                        }
                        c3531zj = m13901f2;
                    }
                    m4812f.m14119a(lVar.f13936b.m14145i());
                    for (int i2 = 1; i2 < lVar.f13936b.m14144h(); i2++) {
                        m4812f.m14120a(lVar.f13936b.m14114a(i2));
                    }
                }
                if (m13901f != null && c3531zj != null) {
                    Vector<C3489yj> m16266a = m16266a(m13901f, c3531zj, c2899lj2, lVar.f13936b.m14114a(0));
                    for (int i3 = 0; i3 < m16266a.size(); i3++) {
                        m16222a(c2899lj2, m16266a.get(i3));
                    }
                    lVar.f13940f.m4783a(c2899lj2, this.f13872f, false);
                    C0655o1 c0655o1 = lVar.f13940f;
                    C0655o1.m4742c(c2899lj2, this.f13872f, false);
                    HashMap<String, String> hashMap = c3531zj.f14519r;
                    if (hashMap != null && hashMap.size() > 0) {
                        String str2 = c3531zj.f14519r.get("schema");
                        if (!TextUtils.isEmpty(str2)) {
                            m16298a(str2, false, null, null, m4812f, c2899lj2);
                        }
                    }
                }
            }
        }
        m16240b(m4812f, c2899lj2, false);
    }

    /* renamed from: a */
    public void m16291a(C3489yj c3489yj) {
        if (c3489yj != null) {
            if (c3489yj.f14268z0 == null) {
                m16310b(c3489yj);
                return;
            }
            for (int i2 = 0; i2 < c3489yj.f14268z0.size(); i2++) {
                m16291a(c3489yj.f14268z0.elementAt(i2));
            }
        }
    }

    /* renamed from: a */
    public void m16292a(byte[] bArr) {
        C0023aj.m160a(this.f13872f).m184b(this.f13865X, bArr, 7);
    }

    /* renamed from: a */
    public void m16293a(byte[] bArr, String str, String str2) {
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str = str2.substring(str2.lastIndexOf(47) + 1);
        }
        C0755x1.m6159a(bArr, C0755x1.m6127a(this.f13872f, 1, "webaxn_media") + str);
    }

    /* renamed from: a */
    public void m16294a(byte[] bArr, String str, h hVar, C0719l1 c0719l1) {
        if (m16264a(c0719l1.f4971x) == null) {
            return;
        }
        l lVar = new l(this);
        lVar.f13935a = bArr;
        lVar.f13937c = str;
        lVar.f13938d = hVar;
        lVar.f13939e = c0719l1;
        lVar.f13940f = m16264a(c0719l1.f4971x);
        b bVar = new b();
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, lVar);
            } else {
                bVar.execute(lVar);
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m16295a(byte[] bArr, String str, h hVar, C0719l1 c0719l1, boolean z, boolean z2, boolean z3) {
        l lVar = new l(this);
        lVar.f13935a = bArr;
        lVar.f13937c = str;
        lVar.f13938d = hVar;
        lVar.f13939e = c0719l1;
        lVar.f13941g = z;
        lVar.f13942h = z2;
        lVar.f13943i = z3;
        c cVar = new c();
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, lVar);
            } else {
                cVar.execute(lVar);
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 ??, still in use, count: 2, list:
          (r6v2 ?? I:com.comviva.webaxn.ui.o1) from 0x00a0: INVOKE (r14v0 'this' ?? I:wj A[IMMUTABLE_TYPE, THIS]), (r6v2 ?? I:com.comviva.webaxn.ui.o1) VIRTUAL call: wj.a(com.comviva.webaxn.ui.o1):void A[MD:(com.comviva.webaxn.ui.o1):void (m)]
          (r6v2 ?? I:com.comviva.webaxn.ui.o1) from 0x00a3: INVOKE (r6v2 ?? I:com.comviva.webaxn.ui.o1) VIRTUAL call: com.comviva.webaxn.ui.o1.B():void A[MD:():void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    /* renamed from: a */
    public boolean m16296a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 ??, still in use, count: 2, list:
          (r6v2 ?? I:com.comviva.webaxn.ui.o1) from 0x00a0: INVOKE (r14v0 'this' ?? I:wj A[IMMUTABLE_TYPE, THIS]), (r6v2 ?? I:com.comviva.webaxn.ui.o1) VIRTUAL call: wj.a(com.comviva.webaxn.ui.o1):void A[MD:(com.comviva.webaxn.ui.o1):void (m)]
          (r6v2 ?? I:com.comviva.webaxn.ui.o1) from 0x00a3: INVOKE (r6v2 ?? I:com.comviva.webaxn.ui.o1) VIRTUAL call: com.comviva.webaxn.ui.o1.B():void A[MD:():void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* renamed from: a */
    public boolean m16297a(String str, boolean z) {
        byte[] m179a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m180b = C0023aj.m160a(this.f13872f).m180b(str, "cachedpagemap");
        if (TextUtils.isEmpty(m180b)) {
            m180b = str;
        }
        if (TextUtils.isEmpty(m180b) || (m179a = C0023aj.m160a(this.f13872f).m179a(m180b, "cachedAcrossSession")) == null) {
            return false;
        }
        m16295a(m179a, str, h.XML_BUFFER, null, true, z, true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (m16263a(r17, false, r18, r21, true, false, r7, r22) <= 0) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (m16263a(r1, false, true, r21, true, false, r7, r22) <= 0) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c7b, code lost:
    
        if (r13.m5883a(r1, r16, r21, r22, r19, r20, r12) != false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0ca6, code lost:
    
        if (r13.m5883a(r1, r16, r21, r22, r19, r20, r12) != false) goto L525;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m16298a(java.lang.String r17, boolean r18, p000.C3489yj r19, com.comviva.webaxn.utils.C0696e r20, p000.C2945mj r21, p000.C2899lj r22) {
        /*
            Method dump skipped, instructions count: 3875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.m16298a(java.lang.String, boolean, yj, com.comviva.webaxn.utils.e, mj, lj):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af A[LOOP:4: B:141:0x02a9->B:143:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[LOOP:0: B:40:0x00f2->B:42:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m16299a(p000.C2899lj r28, p000.C2945mj r29, com.comviva.webaxn.p002ui.C0655o1 r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3400wj.m16299a(lj, mj, com.comviva.webaxn.ui.o1, boolean, boolean):boolean");
    }

    /* renamed from: b */
    public int m16300b(String str, boolean z) {
        C0719l1 m16253h = m16253h(str);
        if (C0755x1.f5247e && TextUtils.isEmpty(C0713j1.m5563a(this.f13872f).m5618W())) {
            m16248d(m16253h);
        }
        String str2 = m16253h.f4968u;
        int i2 = z ? 20 : 4;
        if (str2.equals("StartAppln_ReqPage")) {
            str2 = "StartAppln_Req";
        }
        String str3 = str2;
        C0755x1.f5247e = true;
        if (m16253h != null) {
            m16253h.f4937E = String.valueOf(C0713j1.m5563a(this.f13872f).m5632b("iniversion"));
            C0755x1.f5246d = C0755x1.m6157a(m16253h);
        }
        int m16215a = m16215a(str3, 2, i2, m16253h, C0755x1.f5246d);
        if (-1 == m16215a && !z) {
            m16346w();
            if (!m16297a("msg.connProb", false)) {
                String m5641c = C0713j1.m5563a(this.f13872f).m5641c("msg.connProb");
                if (TextUtils.isEmpty(m5641c)) {
                    m5641c = this.f13872f.getString(R.string.default_connect_err);
                }
                if (str != null) {
                    m16281a(m5641c, str, true);
                } else {
                    m16281a(m5641c, str3, true);
                }
            }
        }
        return m16215a;
    }

    /* renamed from: b */
    public void m16301b() {
        C0719l1 m16335l = m16335l();
        if (m16335l != null) {
            this.f13873g.m3996c(m16335l);
            m16255B();
        }
    }

    /* renamed from: b */
    public void m16302b(C0719l1 c0719l1) {
        C0719l1 m16335l = m16335l();
        if (m16335l != null) {
            this.f13873g.m3996c(m16335l);
            m16255B();
        }
        this.f13882p = c0719l1;
    }

    /* renamed from: b */
    public void m16303b(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Cursor m206j;
        if (str2 == null || (m206j = C0023aj.m160a(this.f13872f).m206j()) == null) {
            str3 = null;
        } else {
            m206j.moveToFirst();
            try {
                str3 = m206j.getString(m206j.getColumnIndex("url"));
            } catch (Exception unused) {
                str3 = null;
            }
            m206j.close();
        }
        if (str3 == null || !str2.equals(str3)) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                int indexOf = str.indexOf("\\n", i2);
                if (indexOf > 0) {
                    String substring = str.substring(i2, indexOf);
                    int length2 = substring.length();
                    char c2 = 1;
                    int i3 = 0;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    while (i3 < length2) {
                        int indexOf2 = substring.indexOf("\\t", i3);
                        if (indexOf2 >= 0) {
                            if (c2 == 1) {
                                str4 = substring.substring(i3, indexOf2);
                                c2 = 2;
                            } else if (c2 == 2) {
                                str5 = substring.substring(i3, indexOf2);
                                c2 = 3;
                            }
                            i3 = indexOf2 + 2;
                        } else {
                            str6 = substring.substring(i3, length2);
                            i3 = length2;
                            c2 = 1;
                        }
                    }
                    i2 = indexOf + 2;
                } else {
                    String substring2 = str.substring(i2, length);
                    int length3 = substring2.length();
                    int i4 = 0;
                    char c3 = 1;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    while (i4 < length3) {
                        int indexOf3 = substring2.indexOf("\\t", i4);
                        if (indexOf3 >= 0) {
                            if (c3 == 1) {
                                str4 = substring2.substring(i4, indexOf3);
                                c3 = 2;
                            } else if (c3 == 2) {
                                str5 = substring2.substring(i4, indexOf3);
                                c3 = 3;
                            }
                            i4 = indexOf3 + 2;
                        } else {
                            str6 = substring2.substring(i4, length3);
                            i4 = length3;
                            c3 = 1;
                        }
                    }
                    i2 = length;
                }
                C0023aj.m160a(this.f13872f).m175a(str4, null, str5, str6, null);
            }
        }
    }

    /* renamed from: b */
    public void m16304b(String str, C2899lj c2899lj) {
        AbstractC0652n1 abstractC0652n1;
        String[] split = str.substring(8, str.length()).split(";");
        C3531zj m13901f = c2899lj.m13901f();
        if (m13901f != null) {
            HashMap<String, String> m210k = C0023aj.m160a(this.f13872f).m210k();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("$$")) {
                    str2 = str2.substring(2);
                    if (m210k.size() > 0) {
                        str2 = m210k.get(str2);
                    }
                }
                C3489yj m16930a = m13901f.m16930a(str2, (Vector<C3489yj>) null);
                if (m16930a != null && (abstractC0652n1 = m16930a.f14197a0) != null) {
                    m16930a.f14211f = false;
                    abstractC0652n1.mo4150h().setVisibility(8);
                }
            }
        }
    }

    /* renamed from: b */
    public void m16305b(String str, C2945mj c2945mj, C2899lj c2899lj) {
        if (c2945mj == null) {
            c2945mj = m16334k();
        }
        C0719l1 c0719l1 = new C0719l1();
        c0719l1.f4968u = str;
        c0719l1.f4948a = C0713j1.m5563a(this.f13872f).m5725s0();
        c0719l1.f4951d = C0713j1.m5563a(this.f13872f).m5670g0();
        c0719l1.f4937E = String.valueOf(C0713j1.m5563a(this.f13872f).m5632b("iniversion"));
        c0719l1.f4936D = m16341r();
        int i2 = 0;
        c0719l1.f4939G = false;
        c0719l1.f4971x = c2899lj;
        Vector<C3440xj> m14145i = c2945mj.m14145i();
        C3440xj c3440xj = null;
        if (m14145i != null) {
            while (true) {
                if (i2 >= m14145i.size()) {
                    break;
                }
                C3440xj elementAt = m14145i.elementAt(i2);
                if (!TextUtils.isEmpty(elementAt.f14055a) && elementAt.f14055a.equals(str)) {
                    c3440xj = elementAt;
                    break;
                }
                i2++;
            }
        }
        if (c3440xj != null) {
            c0719l1.f4938F = c3440xj.f14056b;
        }
        C0687b c0687b = this.f13874h;
        if (c0687b != null) {
            c0719l1.f4940H = c0687b.m5343a();
        }
        String str2 = c0719l1.f4968u;
        if (c0719l1.f4967t != null) {
            str2 = str2 + c0719l1.f4967t;
        }
        m16215a(str2, 2, 13, c0719l1, C0755x1.f5246d);
    }

    /* renamed from: b */
    public void m16306b(String str, byte[] bArr) {
        if (C0023aj.m160a(this.f13872f).m203i("public") >= 10485760) {
            C0023aj.m160a(this.f13872f).m170a("public");
        }
        C0023aj.m160a(this.f13872f).m172a(str, "public", bArr);
    }

    /* renamed from: b */
    public void m16307b(C2899lj c2899lj) {
        C3531zj m13901f;
        HashMap<String, C2555hj> hashMap;
        if (c2899lj == null || (m13901f = c2899lj.m13901f()) == null || (hashMap = m13901f.f14499P) == null || hashMap.get("onchange") == null || TextUtils.isEmpty(m13901f.f14499P.get("onchange").m12229d())) {
            return;
        }
        m16263a(m13901f.f14499P.get("onchange").m12229d(), false, true, null, false, false, null, c2899lj);
    }

    /* renamed from: b */
    public void m16308b(C2945mj c2945mj, C2899lj c2899lj) {
        C3531zj m13901f = c2899lj.m13901f();
        m13901f.m16944d();
        if (!TextUtils.isEmpty(m13901f.f14492I)) {
            m16279a(m13901f.f14492I, m13901f.m16941c());
            if (m16296a(m13901f.f14492I, c2945mj, c2899lj) || TextUtils.isEmpty(m13901f.f14490G) || m13901f.f14490G.equals("Menulist") || m16298a(m13901f.f14490G, false, null, null, c2945mj, c2899lj)) {
                return;
            }
            m16279a(m13901f.f14490G, m13901f.m16941c());
            if (m16263a(m13901f.f14490G, true, false, c2945mj, false, false, m13901f.f14491H, c2899lj) <= 0) {
                return;
            }
        } else {
            if (TextUtils.isEmpty(m13901f.f14490G) || m16298a(m13901f.f14490G, false, null, null, c2945mj, c2899lj)) {
                return;
            }
            m16279a(m13901f.f14490G, m13901f.m16941c());
            if (m16263a(m13901f.f14490G, true, false, c2945mj, false, false, m13901f.f14491H, c2899lj) <= 0) {
                return;
            }
        }
        m16258E();
    }

    /* renamed from: b */
    public void m16309b(C3129qj c3129qj) {
        if (c3129qj != null) {
            if (c3129qj.m15125l().equals("B")) {
                m16289a(c3129qj);
            } else {
                m16318c(c3129qj);
            }
        }
    }

    /* renamed from: b */
    public void m16310b(C3489yj c3489yj) {
        String m5097m;
        if (c3489yj.f14190X && c3489yj.f14208e == 3) {
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
            if (abstractC0652n1 instanceof C0668v) {
                m5097m = ((C0668v) abstractC0652n1).m5034m();
            } else if (!(abstractC0652n1 instanceof C0670w)) {
                return;
            } else {
                m5097m = ((C0670w) abstractC0652n1).m5097m();
            }
            C0023aj.m160a(this.f13872f).m209k(c3489yj.f14186V, m5097m);
        }
    }

    /* renamed from: b */
    public void m16311b(boolean z) {
        String m5725s0 = 1 == C0713j1.m5563a(this.f13872f).m5622a("keepregistered") ? C0713j1.m5563a(this.f13872f).m5725s0() : null;
        String m5610O = C0713j1.m5563a(this.f13872f).m5610O();
        String m5571A = C0713j1.m5563a(this.f13872f).m5571A();
        String m5574B = C0713j1.m5563a(this.f13872f).m5574B();
        boolean m5737v0 = C0713j1.m5563a(this.f13872f).m5737v0();
        String m5718r = C0713j1.m5563a(this.f13872f).m5718r();
        C0713j1.m5563a(this.f13872f).m5686k();
        C0023aj.m160a(this.f13872f).m185c();
        C0713j1.m5563a(this.f13872f).m5689k(m5571A);
        C0713j1.m5563a(this.f13872f).m5732u(m5610O);
        if (m5737v0) {
            C0713j1.m5563a(this.f13872f).m5694l(m5574B);
            C0713j1.m5563a(this.f13872f).m5645c(m5737v0);
        }
        C0713j1.m5563a(this.f13872f).m5603K(m5725s0);
        C0713j1.m5563a(this.f13872f).m5667g(m5718r);
        C0713j1.m5563a(this.f13872f).m5588F((String) null);
        C0713j1.m5563a(this.f13872f).m5582D((String) null);
        C0713j1.m5563a(this.f13872f).m5585E((String) null);
        C0713j1.m5563a(this.f13872f).m5591G((String) null);
        C0713j1.m5563a(this.f13872f).m5711p(-1);
        C0713j1.m5563a(this.f13872f).m5736v((String) null);
        C0713j1.m5563a(this.f13872f).m5651d(false);
        C0713j1.m5563a(this.f13872f).m5668g(false);
        C0713j1.m5563a(this.f13872f).m5747y("android");
        C0713j1.m5563a(this.f13872f).m5750z((String) null);
        C0713j1.m5563a(this.f13872f).m5719r(0);
        if (z) {
            C0713j1.m5563a(this.f13872f).m5629a((String) null, false);
            C0713j1.m5563a(this.f13872f).m5637b((String) null, false);
        }
        C0713j1.m5563a(this.f13872f).m5715q(0);
    }

    /* renamed from: b */
    public void m16312b(byte[] bArr) {
        C0023aj.m160a(this.f13872f).m174a(C0755x1.m6192i(this.f13864W), bArr, 1);
    }

    /* renamed from: b */
    public boolean m16313b(String str) {
        boolean z = true;
        this.f13888v = true;
        this.f13889w = null;
        this.f13890x = null;
        this.f13891y = null;
        this.f13892z = null;
        this.f13843B = null;
        this.f13844C = null;
        this.f13842A = null;
        boolean z2 = false;
        this.f13846E = 0;
        this.f13849H = null;
        this.f13850I = false;
        this.f13852K = null;
        this.f13851J = C3530zi.f14469l;
        String m16314c = m16314c("DOMAIN_URL", str);
        this.f13843B = m16314c;
        this.f13845D = "android";
        this.f13853L = 1;
        this.f13848G = -1;
        if (m16314c != null) {
            this.f13843B = m16314c.trim();
        }
        String m16314c2 = m16314c("IP_URL", str);
        this.f13844C = m16314c2;
        if (m16314c2 != null) {
            this.f13844C = m16314c2.trim();
        }
        String m16314c3 = m16314c("SERVER_URL", str);
        this.f13889w = m16314c3;
        if (m16314c3 != null) {
            this.f13889w = m16314c3.trim();
            this.f13888v = true;
        }
        if (this.f13888v) {
            String m16314c4 = m16314c("IMAGE_URL", str);
            this.f13891y = m16314c4;
            if (m16314c4 != null) {
                this.f13891y = m16314c4.trim();
            }
            String m16314c5 = m16314c("SECURE_SERVER_URL", str);
            this.f13890x = m16314c5;
            if (m16314c5 != null) {
                this.f13890x = m16314c5.trim();
            }
            String m16314c6 = m16314c("SERVICE_USE_PROXY", str);
            this.f13842A = m16314c6;
            if (m16314c6 != null) {
                String trim = m16314c6.trim();
                this.f13842A = trim;
                if (trim.length() > 0 && this.f13842A.equalsIgnoreCase("1")) {
                    z2 = true;
                }
            }
            if (z2) {
                String m16314c7 = m16314c("SERVICE_PROXY_URL", str);
                this.f13892z = m16314c7;
                if (m16314c7 != null) {
                    this.f13892z = m16314c7.trim();
                }
            }
            String m16314c8 = m16314c("INI_VERSION", str);
            if (m16314c8 != null) {
                try {
                    this.f13846E = Integer.parseInt(m16314c8.trim());
                } catch (Exception unused) {
                }
            }
            String m16314c9 = m16314c("GROUP", str);
            this.f13849H = m16314c9;
            if (m16314c9 != null) {
                this.f13849H = m16314c9.trim();
            }
            String m16314c10 = m16314c("GZIP_ENABLED", str);
            if (m16314c10 != null) {
                String trim2 = m16314c10.trim();
                if (trim2.length() > 0 && trim2.equals("1")) {
                    this.f13850I = true;
                }
            }
            String m16314c11 = m16314c("SSL", str);
            if (!TextUtils.isEmpty(m16314c11)) {
                try {
                    int parseInt = Integer.parseInt(m16314c11.trim());
                    if (parseInt != 1) {
                        if (parseInt == 2) {
                            z = C3530zi.f14469l;
                        } else if (parseInt == 0) {
                            z = C3530zi.f14469l;
                        }
                    }
                    this.f13851J = z;
                } catch (Exception unused2) {
                }
            }
            String m16314c12 = m16314c("USERAGENT", str);
            if (!TextUtils.isEmpty(m16314c12)) {
                this.f13845D = m16314c12.trim();
            }
            String m16314c13 = m16314c("PRE_STARTUP_URL", str);
            if (!TextUtils.isEmpty(m16314c13)) {
                this.f13852K = m16314c13.trim();
            }
            String m16314c14 = m16314c("COOKIE", str);
            if (!TextUtils.isEmpty(m16314c14)) {
                try {
                    this.f13853L = Integer.parseInt(m16314c14.trim());
                } catch (NumberFormatException unused3) {
                }
            }
            String m16314c15 = m16314c("KEEP_REGISTERED", str);
            if (m16314c15 != null) {
                try {
                    this.f13847F = Integer.parseInt(m16314c15.trim());
                } catch (Exception unused4) {
                }
            }
            String m16314c16 = m16314c("SOUND", str);
            if (!TextUtils.isEmpty(m16314c16)) {
                try {
                    this.f13848G = Integer.parseInt(m16314c16.trim());
                } catch (Exception unused5) {
                }
            }
        }
        return this.f13888v;
    }

    /* renamed from: c */
    public String m16314c(String str, String str2) {
        int i2;
        if (str2.contains(str)) {
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            int i5 = 0;
            while (!z && -1 != (i5 = str2.indexOf(str, i4))) {
                if (i5 != 0) {
                    int i6 = i5 - 1;
                    if ((str2.charAt(i6) != ' ' && str2.charAt(i6) != '\t' && str2.charAt(i6) != '\n') || (str2.charAt(str.length() + i5) != ' ' && str2.charAt(str.length() + i5) != '\t' && str2.charAt(str.length() + i5) != '=')) {
                        i4 = str.length() + i5;
                    }
                }
                z = true;
            }
            if (z) {
                int length = i5 + str.length();
                for (int i7 = length; i7 < str2.length() && str2.charAt(i7) != '\n'; i7++) {
                    i3++;
                }
                String substring = str2.substring(length, i3 + length);
                int indexOf = substring.indexOf(61);
                if (indexOf > -1 && (i2 = indexOf + 1) < substring.length()) {
                    return substring.substring(i2);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public void m16315c() {
        if (m16343t() != null) {
            m16343t().m4809d().setVisibility(8);
        }
        Dialog dialog = this.f13881o;
        if (dialog == null || !dialog.isShowing()) {
            String m5639b0 = C0713j1.m5563a(this.f13872f).m5639b0();
            int m5631a0 = C0713j1.m5563a(this.f13872f).m5631a0();
            if (-1 >= m5631a0) {
                m5631a0 = 0;
            }
            String m5641c = C0713j1.m5563a(this.f13872f).m5641c("lbl.defLabel");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = this.f13872f.getString(R.string.loading);
            }
            ProgressDialog show = ProgressDialog.show(this.f13872f, "", m5641c, true);
            this.f13881o = show;
            try {
                TextView textView = (TextView) show.findViewById(android.R.id.message);
                if (!TextUtils.isEmpty(m5639b0)) {
                    textView.setTypeface(C0747v.m6081a(m5639b0), AbstractC0652n1.m4702e(m5631a0));
                }
            } catch (Exception unused) {
            }
            this.f13881o.setCancelable(true);
            this.f13881o.setCanceledOnTouchOutside(false);
            this.f13881o.setOnCancelListener(new d());
        }
    }

    /* renamed from: c */
    public void m16316c(String str, C2899lj c2899lj) {
        AbstractC0652n1 abstractC0652n1;
        String[] split = str.substring(8, str.length()).split(";");
        C3531zj m13901f = c2899lj.m13901f();
        if (m13901f != null) {
            HashMap<String, String> m210k = C0023aj.m160a(this.f13872f).m210k();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("$$")) {
                    str2 = str2.substring(2);
                    if (m210k.size() > 0) {
                        str2 = m210k.get(str2);
                    }
                }
                C3489yj m16930a = m13901f.m16930a(str2, (Vector<C3489yj>) null);
                if (m16930a != null && (abstractC0652n1 = m16930a.f14197a0) != null) {
                    m16930a.f14211f = true;
                    abstractC0652n1.mo4150h().setVisibility(0);
                }
            }
        }
    }

    /* renamed from: c */
    public void m16317c(C2945mj c2945mj, C2899lj c2899lj) {
        if (c2945mj == null || c2899lj == null || c2899lj.m13901f().f14504c == null) {
            return;
        }
        c2899lj.m13901f().f14504c.m4605a();
    }

    /* renamed from: c */
    public void m16318c(C3129qj c3129qj) {
        int i2;
        int i3;
        if (c3129qj != null) {
            if (c3129qj.m15122i()) {
                AbstractC0652n1.m4701d(c3129qj.m15112c());
            }
            if (c3129qj.m15121h()) {
                AbstractC0652n1.m4701d(c3129qj.m15108b());
            }
            if (c3129qj.m15123j()) {
                c3129qj.m15118e();
            }
            i2 = -16777216;
            i3 = -16896;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (m16343t() != null) {
            ProgressBar m4809d = m16343t().m4809d();
            m4809d.setVisibility(0);
            m4809d.setBackgroundColor(i2);
            try {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                shapeDrawable.getPaint().setColor(i3);
                ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 3, 1);
                Rect bounds = m4809d.getProgressDrawable().getBounds();
                m4809d.setProgressDrawable(clipDrawable);
                m4809d.getProgressDrawable().setBounds(bounds);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            m4809d.setMax(100);
            m4809d.setIndeterminate(false);
            m4809d.getLayoutParams().height = 3;
            f13839Z = 5;
            m4809d.setProgress(5);
        }
    }

    /* renamed from: c */
    public boolean m16319c(String str) {
        this.f13865X = str;
        return C0023aj.m160a(this.f13872f).m176a(str, "startup_images", 7);
    }

    /* renamed from: c */
    public byte[] m16320c(C0719l1 c0719l1) {
        return new C3086pi(c0719l1, this, this.f13872f).m14774a(C0023aj.m160a(this.f13872f).m210k());
    }

    /* renamed from: d */
    public void m16321d() {
        C0023aj.m160a(this.f13872f).m204i();
        C0023aj.m160a(this.f13872f).m201h();
    }

    /* renamed from: d */
    public void m16322d(String str) {
        this.f13883q = str;
    }

    /* renamed from: d */
    public void m16323d(String str, String str2) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) this.f13872f;
        if (webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        String m5641c = C0713j1.m5563a(webAxnActivity).m5641c("ttl.Alert");
        if (m5641c == null) {
            m5641c = this.f13872f.getString(R.string.title_security);
        }
        builder.setTitle(m5641c);
        if (str2 == null) {
            str2 = this.f13872f.getString(R.string.sslcertificate_err_msg);
        }
        builder.setMessage(str2);
        builder.setCancelable(true);
        String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Ok");
        if (m5641c2 == null) {
            m5641c2 = webAxnActivity.getString(R.string.dialog_button_ok);
        }
        builder.setPositiveButton(m5641c2, new f(this, str, webAxnActivity));
        builder.show();
    }

    /* renamed from: d */
    public void m16324d(String str, C2899lj c2899lj) {
        String[] split = str.substring(10, str.length()).split(";");
        C3531zj m13901f = c2899lj.m13901f();
        if (m13901f != null) {
            HashMap<String, String> m210k = C0023aj.m160a(this.f13872f).m210k();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("$$")) {
                    str2 = str2.substring(2);
                    if (m210k.size() > 0) {
                        str2 = m210k.get(str2);
                    }
                }
                C3489yj m16930a = m13901f.m16930a(str2, (Vector<C3489yj>) null);
                if (m16930a != null && m16930a.f14197a0 != null) {
                    boolean z = !m16930a.f14211f;
                    m16930a.f14211f = z;
                    m16930a.f14197a0.mo4150h().setVisibility(z ? 0 : 8);
                }
            }
        }
    }

    /* renamed from: e */
    public void m16325e(String str) {
        this.f13866Y = str;
    }

    /* renamed from: e */
    public byte[] m16326e() {
        return C0023aj.m160a(this.f13872f).m190d(this.f13865X, "startup_images");
    }

    /* renamed from: f */
    public String m16327f() {
        return this.f13865X;
    }

    /* renamed from: f */
    public void m16328f(String str) {
    }

    /* renamed from: g */
    public C0696e m16329g() {
        return this.f13879m;
    }

    /* renamed from: g */
    public boolean m16330g(String str) {
        this.f13864W = str;
        return C0023aj.m160a(this.f13872f).m176a(str, "startup_images", 1);
    }

    /* renamed from: h */
    public long m16331h() {
        if (this.f13878l == 0) {
            this.f13878l = this.f13873g.m3994b();
        }
        return this.f13878l;
    }

    /* renamed from: i */
    public Context m16332i() {
        return this.f13872f;
    }

    /* renamed from: j */
    public C3129qj m16333j() {
        return this.f13867a;
    }

    /* renamed from: k */
    public C2945mj m16334k() {
        if (m16343t() != null) {
            return m16343t().f4137e;
        }
        return null;
    }

    /* renamed from: l */
    public C0719l1 m16335l() {
        return this.f13882p;
    }

    /* renamed from: m */
    public HashMap<String, String> m16336m() {
        return this.f13880n;
    }

    /* renamed from: n */
    public C0755x1.n m16337n() {
        return this.f13861T;
    }

    /* renamed from: o */
    public C0661r0 m16338o() {
        return this.f13859R;
    }

    /* renamed from: p */
    public String m16339p() {
        return this.f13866Y;
    }

    /* renamed from: q */
    public int m16340q() {
        return this.f13876j;
    }

    /* renamed from: r */
    public String m16341r() {
        return "2.3.0.11583/" + C0713j1.m5563a(this.f13872f).m5617V();
    }

    /* renamed from: s */
    public C0755x1.r m16342s() {
        return this.f13860S;
    }

    /* renamed from: t */
    public C0655o1 m16343t() {
        try {
            this.f13854M = this.f13855N.lastElement();
        } catch (NoSuchElementException unused) {
            this.f13854M = null;
        }
        return this.f13854M;
    }

    /* renamed from: u */
    public boolean m16344u() {
        StringBuilder sb;
        String str;
        if (!C0755x1.f5252j || TextUtils.isEmpty(C0755x1.f5238B)) {
            return false;
        }
        if (C0755x1.f5238B.startsWith("http") || C0755x1.f5238B.startsWith("https")) {
            sb = new StringBuilder();
            sb.append(C0755x1.f5238B);
            str = "?";
        } else {
            sb = new StringBuilder();
            sb.append(C0755x1.f5238B);
            str = "://";
        }
        sb.append(str);
        sb.append(Uri.encode(this.f13872f.getString(R.string.payment_app_error_msg)));
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString()));
            data.setFlags(67108864);
            this.f13872f.startActivity(data);
        } catch (Exception unused) {
            String m5641c = C0713j1.m5563a(this.f13872f).m5641c("msg.AppNotFound");
            if (m5641c == null) {
                m5641c = this.f13872f.getString(R.string.app_not_found_error);
            }
            Toast.makeText(this.f13872f, m5641c, 0).show();
        }
        C0755x1.f5252j = false;
        C0755x1.f5238B = null;
        return true;
    }

    /* renamed from: v */
    public void m16345v() {
        C0643k1 c0643k1;
        if (m16334k() != null && m16343t().f4136d != null) {
            C2899lj c2899lj = m16343t().f4136d;
            if (c2899lj != null && c2899lj.f11891k && m16264a(c2899lj) != null) {
                m16264a(c2899lj).m4783a(c2899lj, this.f13872f, false);
            }
            C3531zj m13901f = c2899lj.m13901f();
            if (m13901f != null && (c0643k1 = m13901f.f14504c) != null) {
                c0643k1.m4608a(false, false, m16343t());
            }
        }
        if (C0727o0.m5926a(this.f13872f).m5932b()) {
            C0727o0.m5926a(this.f13872f).m5933c();
        }
        m16346w();
        m16301b();
    }

    /* renamed from: w */
    public void m16346w() {
        if (m16338o() == null || !m16338o().m11272b()) {
            return;
        }
        m16338o().setRefreshing(false);
        m16273a((C0661r0) null);
    }

    /* renamed from: x */
    public boolean m16347x() {
        return this.f13875i;
    }

    /* renamed from: y */
    public boolean m16348y() {
        return this.f13877k;
    }

    /* renamed from: z */
    public boolean m16349z() {
        return this.f13858Q;
    }
}
