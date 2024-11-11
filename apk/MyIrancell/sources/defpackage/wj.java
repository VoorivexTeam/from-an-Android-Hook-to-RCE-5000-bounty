package defpackage;

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
import com.comviva.webaxn.ui.WebAxnActivity;
import com.comviva.webaxn.ui.a1;
import com.comviva.webaxn.ui.j0;
import com.comviva.webaxn.ui.k1;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.ui.o1;
import com.comviva.webaxn.ui.q0;
import com.comviva.webaxn.ui.r0;
import com.comviva.webaxn.ui.s0;
import com.comviva.webaxn.ui.t0;
import com.comviva.webaxn.ui.v;
import com.comviva.webaxn.ui.w;
import com.comviva.webaxn.utils.i1;
import com.comviva.webaxn.utils.j1;
import com.comviva.webaxn.utils.l1;
import com.comviva.webaxn.utils.o0;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.r1;
import com.comviva.webaxn.utils.x1;
import com.comviva.webaxn.utils.z1;
import com.mtni.myirancell.R;
import defpackage.yj;
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

/* loaded from: classes.dex */
public class wj {
    public static int Z = 0;
    public static boolean a0 = false;
    public static boolean b0 = false;
    private o1 M;
    private com.comviva.webaxn.ui.b O;
    private yj P;
    private boolean Q;
    private r0 R;
    private x1.r S;
    private x1.n T;
    private String W;
    private String X;
    private String Y;
    private qj a;
    private AlertDialog c;
    private HashMap<String, r1> d;
    public LayoutInflater e;
    private Context f;
    public com.comviva.webaxn.transport.a g;
    private com.comviva.webaxn.utils.b h;
    private boolean i;
    private boolean k;
    private long l;
    private com.comviva.webaxn.utils.e m;
    private HashMap<String, String> n;
    private Dialog o;
    private l1 p;
    private String q;
    private l1 r;
    private boolean s;
    private int t;
    private yj u;
    public qj b = null;
    private int j = -1;
    private boolean v = false;
    private String w = null;
    private String x = null;
    private String y = null;
    private String z = null;
    private String A = null;
    private String B = null;
    private String C = null;
    private String D = null;
    private int E = 0;
    private int F = 0;
    private int G = -1;
    private String H = null;
    private boolean I = false;
    private boolean J = false;
    private String K = null;
    private int L = 1;
    private Stack<o1> N = new Stack<>();
    public k U = null;
    public final x1.k V = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements x1.k {

        /* renamed from: wj$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class AsyncTaskC0085a extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public AsyncTaskC0085a(l1 l1Var) {
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                if (bArr != null) {
                    aj.a(wj.this.f).a(x1.i(this.a.j + com.comviva.webaxn.utils.b.a(wj.this.f).a().i()), "public", bArr);
                    l1 l1Var = this.a;
                    n1 n1Var = l1Var.L.a0;
                    if (n1Var != null && (n1Var instanceof q0)) {
                        ((q0) n1Var).a(l1Var.K, false);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
            }
        }

        /* loaded from: classes.dex */
        class b extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public b(l1 l1Var) {
                this.a = null;
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                lj ljVar = l1Var.x;
                if (ljVar != null) {
                    ljVar.d(l1Var);
                }
                if (bArr != null) {
                    wj.this.b(bArr);
                    lj ljVar2 = this.a.x;
                    if (ljVar2.e() <= 0 && ljVar2 != null && wj.this.a(ljVar2) != null) {
                        wj.this.a(ljVar2).a(ljVar2, wj.this.f, false);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b();
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d(), b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c extends AsyncTask<l, Void, l> {
            c() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l doInBackground(l... lVarArr) {
                ti tiVar;
                l lVar = lVarArr[0];
                if (wj.this.n == null) {
                    wj.this.n = new HashMap();
                }
                try {
                    tiVar = new ti();
                    tiVar.a(lVar.a);
                } catch (wi unused) {
                    tiVar = null;
                }
                if (tiVar != null) {
                    wj wjVar = wj.this;
                    new oi(wjVar, wjVar.f, lVar.g).a(tiVar);
                }
                return lVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(l lVar) {
                if (wj.this.n != null && wj.this.n.size() > 0) {
                    for (String str : wj.this.n.keySet()) {
                        j1.a(wj.this.f).a(str, (String) wj.this.n.get(str));
                    }
                    j1.a(wj.this.f).q(1);
                    wj.this.n.clear();
                    wj.this.n = null;
                }
                x1.k = false;
                x1.j = true;
                lj ljVar = lVar.e.x;
                if (TextUtils.isEmpty(x1.m)) {
                    return;
                }
                wj wjVar = wj.this;
                if (!wjVar.a(x1.m, false, null, null, wjVar.k(), ljVar)) {
                    xj a = x1.a(x1.m, wj.this.k().i());
                    if (a != null) {
                        wj.this.k().a(a);
                    }
                    if (wj.this.a(x1.m, false, false, null, false, false, null, ljVar) > 0) {
                        wj.this.E();
                    }
                }
                x1.m = null;
            }
        }

        /* loaded from: classes.dex */
        class d extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public d(l1 l1Var) {
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                l1Var.x.d(l1Var);
                mj k = wj.this.k();
                if (bArr != null) {
                    k.a(bArr);
                    wj.this.t().a(k, (String) null);
                    lj ljVar = this.a.x;
                    if (ljVar != null && ljVar.e() <= 0 && wj.this.a(ljVar) != null) {
                        wj.this.a(ljVar).a(ljVar, wj.this.f, false);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
            }
        }

        /* loaded from: classes.dex */
        class e extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public e(l1 l1Var) {
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                l1Var.x.d(l1Var);
                mj k = wj.this.k();
                if (bArr != null) {
                    k.b(bArr);
                    wj.this.t().a(k, (String) null);
                    lj ljVar = this.a.x;
                    if (ljVar != null && ljVar.e() <= 0 && wj.this.a(ljVar) != null) {
                        wj.this.a(ljVar).a(ljVar, wj.this.f, false);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
            }
        }

        /* loaded from: classes.dex */
        class f extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public f(l1 l1Var) {
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                l1Var.x.b(6, l1Var.j);
                l1 l1Var2 = this.a;
                l1Var2.x.d(l1Var2);
                mj k = wj.this.k();
                if (bArr != null) {
                    k.a().a(wj.this.f, bArr);
                    lj ljVar = this.a.x;
                    if (ljVar != null && ljVar.e() <= 0 && wj.this.a(ljVar) != null) {
                        wj.this.a(ljVar).a(ljVar, wj.this.f, true);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 2;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 2, b);
            }
        }

        /* loaded from: classes.dex */
        class g extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public g(l1 l1Var) {
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                lj ljVar = l1Var.x;
                if (ljVar != null) {
                    ljVar.d(l1Var);
                }
                if (bArr != null) {
                    wj.this.a(bArr);
                    lj ljVar2 = this.a.x;
                    if (ljVar2 != null && ljVar2.f() != null && !this.a.x.f().p) {
                        wj.this.t().a(this.a.x.f(), wj.this.e());
                    }
                    lj ljVar3 = this.a.x;
                    if (ljVar3 != null && ljVar3.e() <= 0 && wj.this.a(ljVar3) != null) {
                        wj.this.a(ljVar3).a(ljVar3, wj.this.f, false);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 2;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 2, b);
            }
        }

        /* loaded from: classes.dex */
        class h extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;
            yj b;

            public h(l1 l1Var, yj yjVar) {
                this.a = l1Var;
                this.b = yjVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                l1Var.x.c(l1Var);
                if (bArr != null) {
                    String a = this.a.a("Cache-Control");
                    if (a == null || a.equals("public")) {
                        wj.this.b(this.b.N, bArr);
                    } else if (a.equals("private")) {
                        wj.this.a(this.b.N, bArr);
                    }
                    yj yjVar = this.b;
                    yjVar.t0 = bArr;
                    n1 n1Var = yjVar.a0;
                    if (n1Var != null) {
                        n1Var.a(yjVar);
                    }
                    lj ljVar = this.a.x;
                    if (ljVar != null && ljVar.e() <= 0 && wj.this.a(ljVar) != null) {
                        wj.this.a(ljVar).a(ljVar, wj.this.f, false);
                    }
                }
                this.a = null;
                this.b = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
            }
        }

        /* loaded from: classes.dex */
        class i extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;
            yj b;

            public i(l1 l1Var, yj yjVar) {
                this.a = l1Var;
                this.b = yjVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
            
                if (r0 != null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
            
                r0.a(r4);
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
                throw new UnsupportedOperationException("Method not decompiled: wj.a.i.onPostExecute(byte[]):void");
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
            }
        }

        /* loaded from: classes.dex */
        class j extends AsyncTask<byte[], Integer, byte[]> {
            l1 a;

            public j(l1 l1Var) {
                this.a = l1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                l1Var.x.c(l1Var);
                if (bArr != null) {
                    String a = this.a.a("Cache-Control");
                    if (a == null || a.equals("public")) {
                        wj.this.b(this.a.b(), bArr);
                    } else {
                        wj.this.a(this.a.b(), bArr);
                    }
                    lj ljVar = this.a.x;
                    if (ljVar != null && ljVar.f() != null) {
                        this.a.x.f().a(bArr);
                        l1 l1Var2 = this.a;
                        l1Var2.x.c(l1Var2);
                        if (wj.this.t().a(this.a.x.f(), this.a.x.f().a())) {
                            this.a.x.f().p = true;
                        }
                    }
                    lj ljVar2 = this.a.x;
                    if (ljVar2 != null && ljVar2.e() <= 0 && wj.this.a(ljVar2) != null) {
                        wj.this.a(ljVar2).a(ljVar2, wj.this.f, false);
                    }
                }
                this.a = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
            }
        }

        /* loaded from: classes.dex */
        class k extends AsyncTask<byte[], Integer, byte[]> {
            public l1 a;
            public yj b;

            public k(l1 l1Var, yj yjVar) {
                this.a = l1Var;
                this.b = yjVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(byte[] bArr) {
                l1 l1Var = this.a;
                l1Var.x.c(l1Var);
                if (bArr != null) {
                    String a = this.a.a("Cache-Control");
                    if (a == null || a.equals("public")) {
                        wj.this.b(this.b.O, bArr);
                    } else {
                        wj.this.a(this.b.O, bArr);
                    }
                    yj yjVar = this.b;
                    yjVar.v0 = bArr;
                    n1 n1Var = yjVar.a0;
                    if (n1Var != null) {
                        n1Var.a(yjVar);
                    }
                    lj ljVar = this.a.x;
                    if (ljVar != null && ljVar.e() <= 0 && wj.this.a(ljVar) != null) {
                        wj.this.a(ljVar).a(ljVar, wj.this.f, false);
                    }
                }
                this.a = null;
                this.b = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public byte[] doInBackground(byte[]... bArr) {
                byte[] bArr2 = bArr[0];
                int b = com.comviva.webaxn.utils.b.a(wj.this.f).a().b() / 4;
                return com.comviva.webaxn.utils.d.a(wj.this.f, bArr2, com.comviva.webaxn.utils.b.a(wj.this.f).a().d() / 4, b);
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
        @Override // com.comviva.webaxn.utils.x1.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.comviva.webaxn.utils.l1 r17) {
            /*
                Method dump skipped, instructions count: 2450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wj.a.a(com.comviva.webaxn.utils.l1):void");
        }

        public void a(l1 l1Var, String str, h hVar) {
            l lVar = new l(wj.this);
            lVar.e = l1Var;
            lVar.a = l1Var.f();
            lVar.c = str;
            lVar.d = hVar;
            new c().execute(lVar);
        }

        @Override // com.comviva.webaxn.utils.x1.k
        public void a(lj ljVar) {
            if (wj.this.k() == null || ljVar == null || wj.this.a(ljVar) == null) {
                return;
            }
            wj.this.a(ljVar).a(ljVar, wj.this.f, false);
        }

        @Override // com.comviva.webaxn.utils.x1.k
        public void b(l1 l1Var) {
            if (l1Var == null || l1Var.c == 5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AsyncTask<l, Void, l> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l doInBackground(l... lVarArr) {
            ti tiVar;
            l lVar = lVarArr[0];
            try {
                tiVar = new ti();
                tiVar.a(lVar.a);
            } catch (wi unused) {
                tiVar = null;
            }
            if (tiVar != null) {
                mj mjVar = new mj(wj.this.f);
                wj wjVar = wj.this;
                oi oiVar = new oi(wjVar, wjVar.f, lVar.g);
                lVar.b = mjVar;
                oiVar.a(tiVar, mjVar);
            }
            return lVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(l lVar) {
            wj.this.a(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
        public wj.l doInBackground(wj.l... r12) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wj.c.doInBackground(wj$l[]):wj$l");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x0592, code lost:
        
            if (r1 == null) goto L267;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x05af, code lost:
        
            r23.a.a(r1, r4, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:270:0x05a5, code lost:
        
            r1 = r23.a.f.getString(com.mtni.myirancell.R.string.default_empty_messagecap_err);
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
        public void onPostExecute(wj.l r24) {
            /*
                Method dump skipped, instructions count: 1467
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wj.c.onPostExecute(wj$l):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            try {
                if (wj.this.t() != null) {
                    wj.this.t().d().setProgress(numArr[0].intValue());
                }
                if (WebAxnActivity.r != null) {
                    int intValue = WebAxnActivity.w + numArr[0].intValue();
                    WebAxnActivity.w = intValue;
                    if (intValue < 95) {
                        WebAxnActivity.r.setProgress(WebAxnActivity.w);
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
    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            wj.this.v();
            wj.this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnCancelListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            wj.this.v();
            wj.this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements DialogInterface.OnClickListener {
        final /* synthetic */ String b;
        final /* synthetic */ WebAxnActivity c;

        f(wj wjVar, String str, WebAxnActivity webAxnActivity) {
            this.b = str;
            this.c = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.b;
            if (str == null || str.equals("StartAppln_Req") || this.b.equals("StartAppln_ReqPage")) {
                x1.a((Activity) this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {
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
            try {
                a[yj.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum h {
        WBXML_BUFFER,
        XML_BUFFER
    }

    /* loaded from: classes.dex */
    public enum i {
        LR,
        RL,
        TB,
        BT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j {
        l1 a;
        String b;
        String c;
        boolean d;
        boolean e;

        j(wj wjVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends AsyncTask<j, Integer, j> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j doInBackground(j... jVarArr) {
            boolean z = false;
            wj.a0 = false;
            j jVar = jVarArr[0];
            String e = j1.a(wj.this.f).e("domainurl");
            zi.c = e;
            if (e == null) {
                zi.c = zi.a;
                j1.a(wj.this.f).a(zi.a, false);
            }
            String e2 = j1.a(wj.this.f).e("ipurl");
            zi.d = e2;
            if (e2 == null) {
                zi.d = zi.b;
                j1.a(wj.this.f).b(zi.b, false);
            }
            String str = zi.c;
            if (str == null) {
                str = zi.d;
                if (str != null) {
                    wj.b0 = true;
                } else {
                    str = null;
                }
            }
            if (str != null && true == wj.this.a(str, jVar)) {
                wj.a0 = true;
                z = wj.this.D();
            }
            jVar.e = z;
            return jVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(j jVar) {
            zj f;
            k1 k1Var;
            j1 a;
            String str;
            l1 l1Var = jVar.a;
            if (jVar.e) {
                if (l1Var == null) {
                    wj.this.b(jVar.b, jVar.d);
                    return;
                }
                if (true == l1Var.B) {
                    a = j1.a(wj.this.f);
                    str = "secureserverurl";
                } else {
                    a = j1.a(wj.this.f);
                    str = "serverurl";
                }
                l1Var.j = a.e(str);
                wj.this.g.a(l1Var);
                return;
            }
            if (x1.o) {
                wj.this.F();
                if (!wj.this.a("msg.sslerr", false)) {
                    wj.this.d(jVar.b, j1.a(wj.this.f).c("msg.sslerr"));
                }
                x1.o = false;
                return;
            }
            if (wj.this.k() != null && wj.this.t().d != null && (f = wj.this.t().d.f()) != null && (k1Var = f.c) != null) {
                k1Var.a(false, false, wj.this.t());
            }
            String str2 = null;
            if (l1Var != null) {
                str2 = l1Var.u;
                int i = l1Var.c;
                if (i == 5 || i == 4 || i == 15) {
                    wj.this.F();
                }
            }
            if (wj.this.a("msg.connProb", false)) {
                return;
            }
            String c = j1.a(wj.this.f).c("msg.connProb");
            if (TextUtils.isEmpty(c)) {
                c = wj.this.f.getString(R.string.default_connect_err);
                x1.i = true;
            }
            if (!TextUtils.isEmpty(jVar.c)) {
                c = c + "\nCause: " + jVar.c;
            }
            wj.this.a(c, str2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l {
        public byte[] a;
        public mj b;
        public String c;
        public h d;
        public l1 e;
        public o1 f;
        public boolean g = false;
        public boolean h = false;
        public boolean i = true;

        l(wj wjVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements DialogInterface.OnKeyListener {
        o1 b;
        mj c;
        lj d;

        m(wj wjVar, o1 o1Var, lj ljVar, mj mjVar, lj ljVar2) {
            this.b = o1Var;
            this.d = ljVar;
            this.c = mjVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (this.d.d().size() > 1 && this.d.d().get(1) != null) {
                    this.b.a(this.d.d().get(1).f, this.c, this.d);
                }
                dialogInterface.dismiss();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements DialogInterface.OnCancelListener {
        o1 b;
        mj c;
        lj d;

        n(wj wjVar, o1 o1Var, lj ljVar, mj mjVar, lj ljVar2) {
            this.b = o1Var;
            this.d = ljVar;
            this.c = mjVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.b.a(this.d.d().get(1).f, this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o implements DialogInterface.OnClickListener {
        o1 b;
        mj c;
        lj d;

        o(wj wjVar, o1 o1Var, lj ljVar, mj mjVar, lj ljVar2) {
            this.b = o1Var;
            this.d = ljVar;
            this.c = mjVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.b.a(this.d.d().get(1).f, this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class p implements DialogInterface.OnClickListener {
        o1 b;
        mj c;
        lj d;

        p(o1 o1Var, lj ljVar, mj mjVar, lj ljVar2) {
            this.b = o1Var;
            this.d = ljVar;
            this.c = mjVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Vector<yj> vector;
            com.comviva.webaxn.utils.e eVar = this.d.d().get(0);
            if (eVar != null) {
                if (!eVar.g.equalsIgnoreCase("refresh") || eVar.q != 0 || this.c == null) {
                    this.b.a(this.d.d().get(0).f, this.c, this.d);
                    return;
                }
                lj ljVar = this.d;
                if (ljVar == null || ljVar.f() == null) {
                    return;
                }
                zj f = ljVar.f();
                HashMap<String, String> k = aj.a(wj.this.f).k();
                if (k.size() > 0) {
                    for (Map.Entry<String, String> entry : k.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (f != null && (vector = f.e) != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= vector.size()) {
                                    break;
                                }
                                yj a = x1.a(vector.elementAt(i2), key);
                                if (a != null) {
                                    int i3 = a.e;
                                    if (i3 == 3) {
                                        n1 n1Var = a.a0;
                                        if (n1Var instanceof v) {
                                            ((v) n1Var).f(value);
                                        } else {
                                            ((w) n1Var).h(value);
                                        }
                                    } else if (value != null && i3 == 4) {
                                        int i4 = a.R;
                                        if (i4 == 4 || i4 == 3) {
                                            n1 n1Var2 = a.a0;
                                            if (n1Var2 instanceof s0) {
                                                ((s0) n1Var2).c(value);
                                            } else {
                                                ((t0) n1Var2).c(value);
                                            }
                                        } else if (i4 == 2) {
                                            n1 n1Var3 = a.a0;
                                            if (n1Var3 instanceof com.comviva.webaxn.ui.h) {
                                                ((com.comviva.webaxn.ui.h) n1Var3).a(value, "0");
                                            } else {
                                                ((com.comviva.webaxn.ui.i) n1Var3).a(value, "0");
                                            }
                                        } else if (i4 == 1) {
                                            n1 n1Var4 = a.a0;
                                            if (n1Var4 instanceof com.comviva.webaxn.ui.k) {
                                                ((com.comviva.webaxn.ui.k) n1Var4).c(value);
                                            } else {
                                                ((com.comviva.webaxn.ui.l) n1Var4).c(value);
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

    public wj(Context context, LayoutInflater layoutInflater, com.comviva.webaxn.ui.b bVar, x1.n nVar) {
        this.a = null;
        this.i = false;
        this.k = false;
        this.Q = false;
        this.f = context;
        this.e = layoutInflater;
        this.O = bVar;
        this.T = nVar;
        bVar.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.i = false;
        this.k = false;
        Context context2 = this.f;
        this.Q = zi.a(context2, context2.getPackageName());
        j1.a(this.f).g("2.3.0.11583");
        this.a = zi.a(this.f);
    }

    private int a(l1 l1Var, boolean z, int i2) {
        if (l1Var == null) {
            return 0;
        }
        String str = l1Var.u;
        if (l1Var.t != null) {
            str = str + l1Var.t;
        }
        return a(str, 2, i2, l1Var, x1.d);
    }

    private int a(String str, int i2, int i3, l1 l1Var, boolean z) {
        boolean z2;
        int i4;
        boolean z3;
        String str2;
        String c2;
        Context context;
        int i5;
        lj ljVar;
        zj f2;
        k1 k1Var;
        mj k2 = k();
        byte[] a2 = (i3 == 15 || i3 == 16 || i3 == 17 || i3 == 13 || l1Var.C) ? null : aj.a(this.f).a(x1.i(str), "cachedAcrossSession");
        if (a2 != null) {
            a(a2, null, h.WBXML_BUFFER, null, true, false, (str.equalsIgnoreCase("StartAppln_Req") && j1.a(this.f).f(str)) ? false : true);
            return 1;
        }
        if ((str.equalsIgnoreCase("StartAppln_ReqPage") || str.equalsIgnoreCase("StartAppln_Req")) && i3 != 20 && !TextUtils.isEmpty("StartAppln_Req")) {
            Context context2 = this.f;
            if (context2 instanceof WebAxnActivity) {
                try {
                    InputStream open = ((WebAxnActivity) context2).getAssets().open("StartAppln_Req".toLowerCase().trim() + ".wbxml");
                    byte[] bArr = new byte[open.available()];
                    open.read(bArr);
                    open.close();
                    z2 = true;
                    i4 = 16;
                    try {
                        a(bArr, null, h.WBXML_BUFFER, null, true, false, true);
                        return 1;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }
        z2 = true;
        i4 = 16;
        int r = com.comviva.webaxn.utils.k.r(this.f);
        if (r == 0) {
            if (l1Var.C) {
                if (i3 == 15 || i3 == i4) {
                    if (!TextUtils.isEmpty(l1Var.v)) {
                        l1 l1Var2 = new l1();
                        l1Var2.x = l1Var.x;
                        a(l1Var.v, l1Var2);
                    }
                    if (x1.C) {
                        a(k2, l1Var.x, false);
                        x1.C = false;
                    }
                }
                return -2;
            }
            String str3 = zi.g ? "msg.gprs_error" : "msg.noconn_error";
            w();
            if (a(str3, false)) {
                return -2;
            }
            c2 = j1.a(this.f).c(str3);
            if (c2 == null) {
                if (zi.g) {
                    context = this.f;
                    i5 = R.string.error_message_conn_gprs;
                } else {
                    context = this.f;
                    i5 = R.string.error_message_conn;
                }
                c2 = context.getString(i5);
            }
            str2 = c2;
            z3 = false;
        } else if (!zi.g || r != z2) {
            z3 = true;
            str2 = null;
        } else {
            if (u()) {
                return -2;
            }
            if (l1Var.C) {
                if (i3 == 15 || i3 == i4) {
                    if (!TextUtils.isEmpty(l1Var.v)) {
                        l1 l1Var3 = new l1();
                        l1Var3.x = l1Var.x;
                        a(l1Var.v, l1Var3);
                    }
                    if (x1.C) {
                        a(k2, l1Var.x, false);
                        x1.C = false;
                    }
                }
                return -2;
            }
            w();
            if (a("msg.wifi_error", false)) {
                return -2;
            }
            c2 = j1.a(this.f).c("msg.wifi_error");
            if (c2 == null) {
                context = this.f;
                i5 = R.string.error_wifi;
                c2 = context.getString(i5);
            }
            str2 = c2;
            z3 = false;
        }
        if (!z3) {
            String str4 = l1Var.v;
            if (str4 != null && (a(str4, k2, l1Var.x) || a(l1Var.v, false, null, null, k2, l1Var.x))) {
                return -2;
            }
            if (i3 != i4 && i3 != 13 && !l1Var.C && i3 != 20) {
                a(str2, str, z2);
            }
            if (k2 != null && (ljVar = l1Var.x) != null && (f2 = ljVar.f()) != null && (k1Var = f2.c) != null) {
                k1Var.a(false, false, t());
            }
            return -2;
        }
        String str5 = l1Var.u;
        if (str5 == null || !str5.startsWith("wgts:")) {
            z2 = z;
        }
        String a3 = a(z2);
        if (a3 == null) {
            return -1;
        }
        l1Var.g = 0L;
        l1Var.f = 0;
        l1Var.j = a3;
        l1Var.i = i2;
        l1Var.b = h();
        l1Var.q = this.V;
        l1Var.c = i3;
        l1Var.B = z2;
        if (x1.e && !TextUtils.isEmpty(j1.a(this.f).W())) {
            l1Var.J = l1Var.u;
            l1Var.u = "PreStartAppln_Req";
            l1Var.I = l1Var.c;
            l1Var.c = 21;
            l1Var.j = j1.a(this.f).W();
        }
        return a(l1Var);
    }

    private void a(a1 a1Var, zj zjVar, lj ljVar) {
        l1 l1Var = new l1();
        l1Var.g = 0L;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.j = a1Var.a;
        l1Var.c = 18;
        l1Var.A = a1Var;
        this.g.d(l1Var);
    }

    private void a(String str, int i2, lj ljVar) {
        l1 l1Var = new l1();
        l1Var.g = 0L;
        l1Var.j = str;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.c = i2;
        l1Var.x = ljVar;
        ljVar.a(l1Var);
        this.g.a(l1Var);
    }

    private void a(lj ljVar, yj yjVar) {
        String str;
        ij ijVar;
        fj fjVar;
        gj gjVar;
        String str2;
        int i2 = yjVar.e;
        if (i2 == 13 || i2 == 26 || yjVar.N != null || yjVar.O != null || ((i2 == 3 && (str2 = yjVar.v) != null && str2.length() > 0 && yjVar.k != null) || (((ijVar = yjVar.k1) != null && !TextUtils.isEmpty(ijVar.g())) || (((fjVar = yjVar.l1) != null && !TextUtils.isEmpty(fjVar.f())) || ((gjVar = yjVar.m1) != null && !TextUtils.isEmpty(gjVar.g())))))) {
            if (yjVar.e == 26 && (str = yjVar.O) != null) {
                yjVar.N = str;
                yjVar.O = null;
            }
            b(ljVar, yjVar);
        }
        if (yjVar.z0 != null) {
            for (int i3 = 0; i3 < yjVar.z0.size(); i3++) {
                a(ljVar, yjVar.z0.get(i3));
            }
        }
    }

    private void a(lj ljVar, yj yjVar, boolean z) {
        l1 l1Var = new l1();
        l1Var.g = 0L;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.j = yjVar.k;
        l1Var.c = 14;
        l1Var.x = ljVar;
        ljVar.a(l1Var, yjVar);
        this.g.a(l1Var);
        aj.a(this.f).d();
        b(yjVar.v, (String) null);
    }

    private void a(lj ljVar, yj yjVar, boolean z, boolean z2, yj.a aVar) {
        int i2;
        yj.a aVar2;
        l1 l1Var = new l1();
        l1Var.g = 0L;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.x = ljVar;
        if (z2) {
            int i3 = g.a[aVar.ordinal()];
            if (i3 == 1) {
                l1Var.j = yjVar.k1.g();
                l1Var.c = 11;
                aVar2 = yj.a.FOCUS;
            } else if (i3 == 2) {
                l1Var.j = yjVar.l1.f();
                l1Var.c = 11;
                aVar2 = yj.a.FILLED;
            } else if (i3 == 3) {
                l1Var.j = yjVar.m1.g();
                l1Var.c = 11;
                aVar2 = yj.a.ERROR;
            }
            l1Var.a(z2, aVar2.name());
        } else {
            if (yjVar.z0 != null) {
                l1Var.j = yjVar.O;
                i2 = 10;
            } else if (z) {
                l1Var.j = yjVar.N;
                i2 = 0;
            } else {
                l1Var.j = yjVar.O;
                l1Var.c = 11;
            }
            l1Var.c = i2;
        }
        ljVar.a(l1Var, yjVar);
        this.g.a(l1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mj mjVar, byte[] bArr, l1 l1Var, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        int g2 = mjVar.g();
        for (int i2 = 0; i2 < g2; i2++) {
            lj a2 = mjVar.a(i2);
            zj zjVar = a2.a;
            if (zjVar != null && (zjVar.q || mjVar.s())) {
                a2.a.q = false;
                String str = a2.f().g;
                if (str != null) {
                    stringBuffer.append(str + ";");
                }
            }
        }
        if (mjVar.s()) {
            mjVar.b(false);
        }
        if (stringBuffer.length() > 0) {
            aj.a(this.f).b(stringBuffer.toString(), bArr);
        }
        if (!mjVar.r() || l1Var == null) {
            return;
        }
        String k2 = mjVar.k() != null ? mjVar.k() : l1Var.u;
        if (k2.equals("StartAppln_ReqPage")) {
            k2 = "StartAppln_Req";
        }
        if (!z && k2.equals("StartAppln_Req")) {
            j1.a(this.f).c(k2, true);
        }
        String i3 = x1.i(k2);
        aj.a(this.f).a(i3, bArr);
        for (int i4 = 0; i4 < g2; i4++) {
            String str2 = mjVar.a(i4).f().g;
            if (str2 != null) {
                aj.a(this.f).e(str2, i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, String str) {
        boolean z;
        Cursor j2 = aj.a(this.f).j();
        if (j2 != null) {
            j2.moveToFirst();
            String string = j2.getString(j2.getColumnIndex("url"));
            z = string == null || str == null || !string.equals(str);
            j2.close();
            aj.a(this.f).close();
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
                aj.a(this.f).a(null, byteArrayOutputStream.toByteArray(), null, Integer.toString(i2), str);
                i2++;
            }
        }
    }

    private void a(byte[] bArr, yj yjVar, boolean z) {
        if (bArr != null) {
            if (z) {
                yjVar.t0 = bArr;
            } else {
                yjVar.v0 = bArr;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, j jVar) {
        String str2;
        try {
            HttpURLConnection a2 = com.comviva.webaxn.transport.a.a(str, j1.a(this.f).e0());
            a2.setRequestMethod("GET");
            if (j1.a(this.f).S() != 0) {
                a2.addRequestProperty("X-Cookie", String.valueOf(j1.a(this.f).S()));
            }
            a2.addRequestProperty("User-Agent", "2.3.0.11583/" + j1.a(this.f).V());
            String str3 = null;
            if (a2.getResponseCode() == 200) {
                try {
                    int headerFieldInt = a2.getHeaderFieldInt("Content-Length", -1);
                    if (headerFieldInt <= 0) {
                        headerFieldInt = 256;
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(a2.getInputStream());
                    String headerField = a2.getHeaderField("X-Cookie");
                    if (TextUtils.isEmpty(headerField)) {
                        str3 = x1.b(bufferedInputStream);
                    } else {
                        i1 i1Var = new i1(z1.a(this.f, headerField));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[headerFieldInt];
                        while (true) {
                            int read = bufferedInputStream.read(bArr, 0, headerFieldInt);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] a3 = i1Var.a(byteArrayOutputStream.toByteArray());
                        if (a3 != null) {
                            str3 = new String(a3);
                        }
                    }
                    bufferedInputStream.close();
                    a2.disconnect();
                } catch (Throwable th) {
                    a2.disconnect();
                    throw th;
                }
            }
            if (str3 != null && str3.length() > 0) {
                a0 = true;
                b(str3);
                return a0;
            }
            if (b0 || zi.d == null) {
                return false;
            }
            b0 = true;
            return a(zi.d, jVar);
        } catch (IllegalArgumentException unused) {
            return false;
        } catch (SSLException unused2) {
            x1.o = true;
            return false;
        } catch (Exception unused3) {
            if (b0 || (str2 = zi.d) == null) {
                return false;
            }
            b0 = true;
            return a(str2, jVar);
        }
    }

    private l1 b(lj ljVar, yj yjVar, boolean z) {
        int i2;
        l1 l1Var = new l1();
        l1Var.p = yjVar.J;
        l1Var.g = 0L;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.x = ljVar;
        if (yjVar.z0 != null) {
            l1Var.j = yjVar.O;
            i2 = 10;
        } else if (z) {
            l1Var.j = yjVar.N;
            i2 = 0;
        } else {
            l1Var.j = yjVar.O;
            i2 = 11;
        }
        l1Var.c = i2;
        ljVar.a(l1Var, yjVar);
        this.g.a(l1Var);
        return l1Var;
    }

    private void b(a1 a1Var, zj zjVar, lj ljVar) {
        l1 l1Var = new l1();
        l1Var.g = 0L;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.j = a1Var.a;
        l1Var.c = 19;
        l1Var.A = a1Var;
        this.g.d(l1Var);
    }

    private void b(lj ljVar, yj yjVar) {
        String str;
        if (yjVar.e == 3 && (str = yjVar.v) != null && str.length() > 0 && yjVar.k != null) {
            byte[] d2 = aj.a(this.f).d(yjVar.k, "public");
            if (d2 != null) {
                yjVar.u0 = d2;
                b(yjVar.v, yjVar.k);
                a(yjVar.u0, yjVar.k);
            } else {
                a(ljVar, yjVar, true);
            }
        }
        if (TextUtils.isEmpty(yjVar.V0) && yjVar.N != null && (yjVar.p0 == null || this.f.getResources().getIdentifier(yjVar.p0, "drawable", this.f.getPackageName()) <= 0)) {
            byte[] d3 = aj.a(this.f).d(yjVar.N, "public");
            if (d3 == null) {
                d3 = aj.a(this.f).d(yjVar.N, "private");
            }
            if (d3 == null || yjVar.j1) {
                a(ljVar, yjVar, true, false, (yj.a) null);
            } else {
                a(d3, yjVar, true);
                n1 n1Var = yjVar.a0;
                if (n1Var != null) {
                    n1Var.a(yjVar);
                }
            }
        }
        if (yjVar.O != null && (yjVar.r0 == null || this.f.getResources().getIdentifier(yjVar.r0, "drawable", this.f.getPackageName()) <= 0)) {
            byte[] d4 = aj.a(this.f).d(yjVar.O, "public");
            if (d4 == null) {
                d4 = aj.a(this.f).d(yjVar.O, "private");
            }
            if (d4 == null || yjVar.j1) {
                a(ljVar, yjVar, false, false, (yj.a) null);
            } else {
                a(d4, yjVar, false);
                n1 n1Var2 = yjVar.a0;
                if (n1Var2 != null) {
                    n1Var2.a(yjVar);
                }
            }
        }
        ij ijVar = yjVar.k1;
        if (ijVar != null && ijVar.g() != null && (yjVar.k1.f() == null || this.f.getResources().getIdentifier(yjVar.k1.f(), "drawable", this.f.getPackageName()) <= 0)) {
            byte[] d5 = aj.a(this.f).d(yjVar.k1.g(), "public");
            if (d5 != null) {
                yjVar.k1.a(d5);
            } else {
                a(ljVar, yjVar, false, true, yj.a.FOCUS);
            }
        }
        fj fjVar = yjVar.l1;
        if (fjVar != null && fjVar.f() != null && (yjVar.l1.e() == null || this.f.getResources().getIdentifier(yjVar.l1.e(), "drawable", this.f.getPackageName()) <= 0)) {
            byte[] d6 = aj.a(this.f).d(yjVar.l1.f(), "public");
            if (d6 != null) {
                yjVar.l1.a(d6);
            } else {
                a(ljVar, yjVar, false, true, yj.a.FILLED);
            }
        }
        gj gjVar = yjVar.m1;
        if (gjVar == null || gjVar.g() == null) {
            return;
        }
        if (yjVar.m1.f() == null || this.f.getResources().getIdentifier(yjVar.m1.f(), "drawable", this.f.getPackageName()) <= 0) {
            byte[] d7 = aj.a(this.f).d(yjVar.m1.g(), "public");
            if (d7 != null) {
                yjVar.m1.a(d7);
            } else {
                a(ljVar, yjVar, false, true, yj.a.ERROR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(mj mjVar, lj ljVar, boolean z) {
        yj yjVar;
        String str;
        Vector<yj> vector = ljVar.r;
        if (vector != null) {
            yj yjVar2 = null;
            yj yjVar3 = ljVar.s;
            if (yjVar3 != null) {
                int indexOf = vector.indexOf(yjVar3);
                if (ljVar.r.size() - 1 > indexOf) {
                    yjVar = ljVar.r.get(indexOf + 1);
                }
                if (yjVar2 != null || (str = yjVar2.i) == null) {
                }
                a(str, false, true, mjVar, true, false, yjVar2.j, ljVar);
                return;
            }
            yjVar = vector.get(0);
            yjVar2 = yjVar;
            ljVar.s = yjVar2;
            if (yjVar2 != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r1 c(String str, boolean z) {
        HashMap<String, r1> hashMap = this.d;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        String i2 = x1.i(str);
        r1 r1Var = this.d.get(i2);
        if (!z) {
            return r1Var;
        }
        this.d.remove(i2);
        return r1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(lj ljVar) {
        Vector<a1> vector;
        String str;
        long j2;
        zj f2 = ljVar.f();
        if (f2 == null || (vector = f2.d) == null) {
            return;
        }
        Iterator<a1> it = vector.iterator();
        while (it.hasNext()) {
            a1 next = it.next();
            if (next.a != null && (str = next.b) != null) {
                if (str.equalsIgnoreCase("screen")) {
                    if (!next.e) {
                        if (!aj.a(this.f).i(x1.i(next.a), "cachedAcrossSession")) {
                        }
                    }
                    a(next, ljVar);
                } else if (next.b.equalsIgnoreCase("image")) {
                    if (next.e || !aj.a(this.f).i(next.a, "public")) {
                        a(next, f2, ljVar);
                    }
                } else if (next.b.equalsIgnoreCase("media")) {
                    String str2 = next.d.size() > 0 ? next.d.get(0) : null;
                    if (TextUtils.isEmpty(str2)) {
                        if (!TextUtils.isEmpty(next.a)) {
                            String str3 = next.a;
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
                                j1.a(this.f).b(j2);
                            }
                        }
                        next.d.add(0, str4);
                        str2 = str4;
                    }
                    boolean j3 = x1.j(x1.a(this.f, 1, "webaxn_media") + str2);
                    if (next.e || !j3) {
                        b(next, f2, ljVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(l1 l1Var) {
        if (zi.A != 0) {
            r1 r1Var = new r1();
            r1Var.a(zi.A);
            r1Var.a("Start_App_Request", zi.B);
            l1Var.a(r1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(lj ljVar) {
        zj f2 = ljVar.f();
        if (f2 == null || f2.e == null) {
            return;
        }
        for (int i2 = 0; i2 < f2.e.size(); i2++) {
            a(ljVar, f2.e.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(lj ljVar) {
        if (ljVar != null) {
            HashMap<String, Integer> g2 = ljVar.g();
            for (String str : g2.keySet()) {
                byte[] d2 = aj.a(this.f).d(str, "public");
                if (d2 == null) {
                    d2 = aj.a(this.f).d(str, "private");
                }
                if (d2 == null) {
                    a(str, g2.get(str).intValue(), ljVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.comviva.webaxn.utils.l1 h(java.lang.String r3) {
        /*
            r2 = this;
            com.comviva.webaxn.utils.l1 r0 = new com.comviva.webaxn.utils.l1
            r0.<init>()
            if (r3 != 0) goto L1a
            java.lang.String r3 = "StartAppln_Req"
            r0.u = r3
            r3 = 1
            android.content.Context r1 = r2.f
            com.comviva.webaxn.utils.j1 r1 = com.comviva.webaxn.utils.j1.a(r1)
            int r1 = r1.R()
            if (r3 != r1) goto L1c
            java.lang.String r3 = "StartAppln_ReqPage"
        L1a:
            r0.u = r3
        L1c:
            android.content.Context r3 = r2.f
            com.comviva.webaxn.utils.j1 r3 = com.comviva.webaxn.utils.j1.a(r3)
            java.lang.String r3 = r3.s0()
            r0.a = r3
            android.content.Context r3 = r2.f
            com.comviva.webaxn.utils.j1 r3 = com.comviva.webaxn.utils.j1.a(r3)
            java.lang.String r1 = "iniversion"
            int r3 = r3.b(r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.E = r3
            java.lang.String r3 = r2.r()
            r0.D = r3
            r3 = 0
            r0.G = r3
            com.comviva.webaxn.utils.b r3 = r2.h
            if (r3 == 0) goto L4d
            com.comviva.webaxn.utils.j r3 = r3.a()
            r0.H = r3
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.h(java.lang.String):com.comviva.webaxn.utils.l1");
    }

    public o1 A() {
        return this.N.pop();
    }

    public void B() {
        this.p = null;
    }

    public void C() {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            zj i2 = this.N.get(size).i();
            if (i2 != null && i2.m.equalsIgnoreCase("popup")) {
                o1 pop = this.N.pop();
                pop.D();
                pop.C();
                pop.k().setOnClickListener(null);
                pop.k().setOnTouchListener(null);
                if (pop.i().c != null) {
                    pop.i().c.a();
                }
                this.O.removeView(pop.m());
            }
        }
    }

    public boolean D() {
        boolean z;
        if (TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.w)) {
            z = false;
        } else {
            b(true);
            z = true;
        }
        if (z) {
            if (!TextUtils.isEmpty(this.B)) {
                j1.a(this.f).a(this.B, true);
            }
            if (!TextUtils.isEmpty(this.C)) {
                j1.a(this.f).b(this.C, true);
            }
            if (!TextUtils.isEmpty(this.w)) {
                j1.a(this.f).F(this.w);
            }
            if (!TextUtils.isEmpty(this.y)) {
                j1.a(this.f).D(this.y);
            }
            if (!TextUtils.isEmpty(this.x)) {
                j1.a(this.f).E(this.x);
            }
            if (!TextUtils.isEmpty(this.z)) {
                j1.a(this.f).G(this.z);
            }
            j1.a(this.f).p(this.E);
            j1.a(this.f).o(this.F);
            if (!TextUtils.isEmpty(this.H)) {
                j1.a(this.f).v(this.H);
            }
            j1.a(this.f).d(this.I);
            j1.a(this.f).g(this.J);
            j1.a(this.f).y(this.D);
            j1.a(this.f).z(this.K);
            j1.a(this.f).r(this.L);
            j1.a(this.f).z(this.G);
        } else if (j1.a(this.f).g()) {
            j1.a(this.f).a(zi.a, false);
            j1.a(this.f).b(zi.b, false);
        }
        return z;
    }

    public void E() {
        if (this.b == null) {
            this.b = this.a;
        }
        qj qjVar = this.b;
        if (qjVar == null) {
            c();
        } else {
            b(qjVar);
        }
    }

    public void F() {
        if (t() != null) {
            t().d().setVisibility(8);
            Z = 0;
            t().d().setProgress(Z);
        }
        this.b = null;
        Dialog dialog = this.o;
        if (dialog != null) {
            dialog.dismiss();
            this.o = null;
        }
        w();
    }

    public int a(a1 a1Var, lj ljVar) {
        l1 l1Var = new l1();
        l1Var.u = a1Var.a;
        l1Var.a = j1.a(this.f).s0();
        l1Var.d = j1.a(this.f).g0();
        l1Var.E = String.valueOf(j1.a(this.f).b("iniversion"));
        l1Var.D = r();
        l1Var.G = false;
        l1Var.x = ljVar;
        l1Var.C = false;
        l1Var.A = a1Var;
        com.comviva.webaxn.utils.b bVar = this.h;
        if (bVar != null) {
            l1Var.H = bVar.a();
        }
        return a(l1Var, false, 17);
    }

    public int a(l1 l1Var) {
        lj ljVar;
        x1.d = x1.a(l1Var);
        int i2 = l1Var.c;
        if (i2 != 17 && i2 != 13 && j1.a(this.f).h0() == 0) {
            z1.a(this.f);
        }
        byte[] c2 = c(l1Var);
        if (c2 == null) {
            return 0;
        }
        l1Var.h = c2;
        if (l1Var == null) {
            return -1;
        }
        if (true == l1Var.C && (ljVar = l1Var.x) != null && ljVar.f() != null && l1Var.x.f().c != null) {
            l1Var.x.f().c.j = l1Var;
        }
        int i3 = l1Var.c;
        if (i3 == 17 || i3 == 20 || i3 == 13 || i3 == 16) {
            this.g.d(l1Var);
            return -1;
        }
        if (i3 == 4 || i3 == 5 || i3 == 15) {
            b(l1Var);
        }
        int a2 = this.g.a(l1Var);
        if (true == l1Var.C) {
            return -1;
        }
        return a2;
    }

    public int a(String str, boolean z, boolean z2) {
        if (t() != null) {
            x1.a(this.f, (yj) null, t().r().getApplicationWindowToken());
        }
        if (j1.a(this.f).e("serverurl") != null && !z) {
            return b(str, z2);
        }
        try {
            if (this.U != null) {
                this.U.cancel(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.U = a(str, (l1) null, z2);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r17, boolean r18, boolean r19, defpackage.mj r20, boolean r21, boolean r22, java.lang.String r23, defpackage.lj r24) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.a(java.lang.String, boolean, boolean, mj, boolean, boolean, java.lang.String, lj):int");
    }

    public o1 a(lj ljVar) {
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            if (this.N.elementAt(i2).e() != null && this.N.elementAt(i2).e().equals(ljVar)) {
                return this.N.elementAt(i2);
            }
        }
        return null;
    }

    public String a(boolean z) {
        String e2 = z ? j1.a(this.f).e("secureserverurl") : null;
        return e2 == null ? j1.a(this.f).e("serverurl") : e2;
    }

    public Vector<yj> a(zj zjVar, zj zjVar2, lj ljVar, lj ljVar2) {
        boolean z;
        int i2;
        Vector<yj> vector;
        Vector<yj> vector2;
        Vector<yj> vector3 = new Vector<>();
        Vector<yj> vector4 = zjVar2.e;
        if (zjVar2.r != null) {
            if (zjVar.r == null) {
                zjVar.r = new HashMap<>();
            }
            zjVar.r.putAll(zjVar2.r);
        }
        HashMap<String, Vector<kj>> hashMap = ljVar2.g;
        if (hashMap != null && hashMap.size() > 0) {
            ljVar.g.putAll(ljVar2.g);
        }
        HashMap<String, yj> hashMap2 = ljVar2.h;
        if (hashMap2 != null && hashMap2.size() > 0) {
            ljVar.h.putAll(ljVar2.h);
        }
        HashMap<String, Vector<kj>> hashMap3 = ljVar2.i;
        if (hashMap3 != null && hashMap3.size() > 0) {
            ljVar.i.putAll(ljVar2.i);
        }
        HashMap<String, Vector<kj>> hashMap4 = ljVar2.j;
        if (hashMap4 != null && hashMap4.size() > 0) {
            ljVar.j.putAll(ljVar2.j);
        }
        if (vector4 != null) {
            for (int i3 = 0; i3 < vector4.size(); i3++) {
                yj yjVar = vector4.get(i3);
                if (yjVar != null) {
                    String str = yjVar.V;
                    if (str != null && (vector = zjVar.e) != null) {
                        for (int i4 = 0; i4 < vector.size(); i4++) {
                            yj a2 = x1.a(vector.elementAt(i4), str);
                            if (a2 != null) {
                                yj yjVar2 = a2.A0;
                                if (yjVar2 == null) {
                                    zjVar.e.insertElementAt(yjVar, zjVar.e.indexOf(a2));
                                    vector2 = zjVar.e;
                                } else {
                                    yjVar.A0 = yjVar2;
                                    yjVar2.z0.insertElementAt(yjVar, yjVar2.z0.indexOf(a2));
                                    vector2 = yjVar2.z0;
                                }
                                vector2.remove(a2);
                                n1 n1Var = a2.a0;
                                if (n1Var != null) {
                                    n1Var.b();
                                    a2.a0 = null;
                                    for (int i5 = 0; i5 < a2.b0.size(); i5++) {
                                        try {
                                            j0 j0Var = a2.b0.get(i5);
                                            if (j0Var.l != null) {
                                                j0Var.l.o.remove(j0Var);
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                    a2.b0.clear();
                                }
                                vector3.add(yjVar);
                                z = true;
                                if (!z && (i2 = yjVar.e) != 23 && i2 != 24) {
                                    zjVar.e.add(yjVar);
                                    vector3.add(yjVar);
                                }
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        zjVar.e.add(yjVar);
                        vector3.add(yjVar);
                    }
                }
            }
        }
        return vector3;
    }

    public k a(String str, l1 l1Var, boolean z) {
        String str2;
        String str3;
        boolean z2;
        Context context;
        int i2;
        int r = com.comviva.webaxn.utils.k.r(this.f);
        if (r == 0) {
            str2 = zi.g ? "msg.gprs_error" : "msg.noconn_error";
            str3 = j1.a(this.f).c(str2);
            if (str3 == null) {
                if (zi.g) {
                    context = this.f;
                    i2 = R.string.error_message_conn_gprs;
                } else {
                    context = this.f;
                    i2 = R.string.error_message_conn;
                }
                str3 = context.getString(i2);
            }
            z2 = false;
        } else if (zi.g && r == 1) {
            str2 = "msg.wifi_error";
            str3 = j1.a(this.f).c("msg.wifi_error");
            if (str3 == null) {
                context = this.f;
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
            F();
            if (!a(str2, false)) {
                a(str3, (String) null, true);
            }
            return null;
        }
        j jVar = new j(this);
        jVar.b = str;
        jVar.a = l1Var;
        jVar.e = false;
        jVar.d = z;
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

    public void a() {
        try {
            if (this.U != null) {
                this.U.cancel(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(int i2) {
        this.k = true;
        this.j = i2;
    }

    public void a(int i2, View view) {
        Context context;
        int i3;
        if (i2 == 0) {
            view.setBackgroundResource(R.drawable.loader);
            context = this.f;
            i3 = R.anim.rotate;
        } else {
            if (i2 == 1) {
                view.setBackgroundResource(R.drawable.sequential_frame_animation);
                ((AnimationDrawable) view.getBackground()).start();
                return;
            }
            if (i2 == 2) {
                view.setBackgroundResource(R.drawable.loader);
                context = this.f;
                i3 = R.anim.blink;
            } else if (i2 == 3) {
                view.setBackgroundResource(R.drawable.loader);
                context = this.f;
                i3 = R.anim.bounce;
            } else if (i2 == 4) {
                view.setBackgroundResource(R.drawable.loader);
                context = this.f;
                i3 = R.anim.move_horizontal;
            } else {
                if (i2 != 5) {
                    return;
                }
                view.setBackgroundResource(R.drawable.loader);
                context = this.f;
                i3 = R.anim.move_vertical;
            }
        }
        view.startAnimation(AnimationUtils.loadAnimation(context, i3));
    }

    public void a(com.comviva.webaxn.transport.a aVar) {
        this.g = aVar;
    }

    public void a(o1 o1Var) {
        this.N.push(o1Var);
    }

    public void a(r0 r0Var) {
        this.R = r0Var;
    }

    public void a(com.comviva.webaxn.utils.b bVar) {
        this.h = bVar;
    }

    public void a(com.comviva.webaxn.utils.e eVar) {
        this.m = eVar;
    }

    public void a(x1.r rVar) {
        this.S = rVar;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            aj.a(this.f).a();
            aj.a(this.f).e();
            aj.a(this.f).g();
            aj.a(this.f).f();
            aj.a(this.f).b();
            return;
        }
        for (String str2 : str.split(",")) {
            try {
                String decode = URLDecoder.decode(str2, "UTF-8");
                aj.a(this.f).d(decode);
                String b2 = aj.a(this.f).b(decode, "cachedpagemap");
                if (TextUtils.isEmpty(b2)) {
                    decode = x1.i(decode);
                    aj.a(this.f).b(decode);
                } else {
                    aj.a(this.f).b(b2);
                }
                aj.a(this.f).c(decode);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(String str, l1 l1Var) {
        byte[] c2 = aj.a(this.f).c(str, "cached");
        if (c2 == null) {
            String b2 = aj.a(this.f).b(str, "cachedpagemap");
            if (TextUtils.isEmpty(b2)) {
                b2 = x1.i(str);
            }
            c2 = aj.a(this.f).a(b2, "cachedAcrossSession");
        }
        if (c2 == null || l1Var.x == null) {
            return;
        }
        a(c2, (String) null, h.WBXML_BUFFER, l1Var);
    }

    public void a(String str, r1 r1Var) {
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        if (r1Var != null) {
            this.d.put(x1.i(str), r1Var);
        }
    }

    public void a(String str, String str2) {
        this.u.B0 = null;
        if (str != null) {
            String replaceAll = str.replaceAll("[^\\d]", "");
            if (str2 != null) {
                this.u.B0 = str2 + " <" + replaceAll + ">";
            } else {
                this.u.B0 = " <" + replaceAll + ">";
            }
        }
        if (a(this.r, this.s, this.t) > 0) {
            E();
        }
    }

    public void a(String str, String str2, boolean z) {
        String c2 = j1.a(this.f).c("ttl.Alert");
        if (c2 == null) {
            c2 = this.f.getString(R.string.dialog_title);
        }
        if (str == null) {
            str = this.f.getString(R.string.default_connect_err);
        }
        if (str2 != null && !str2.equals("StartAppln_Req") && !str2.equals("StartAppln_ReqPage")) {
            x1.a(this.f, c2, str, z, true);
            return;
        }
        String c3 = j1.a(this.f).c("cmd.Exit");
        if (c3 == null) {
            c3 = this.f.getString(R.string.dialog_button_exit);
        }
        x1.a(this.f, str, c3, false);
    }

    public void a(String str, lj ljVar) {
        l1 l1Var = new l1();
        l1Var.g = 0L;
        l1Var.j = str;
        l1Var.i = 1;
        h();
        l1Var.q = this.V;
        l1Var.c = 2;
        l1Var.x = ljVar;
        ljVar.a(2, l1Var.j);
        this.g.a(l1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r14, defpackage.mj r15, defpackage.lj r16, defpackage.yj r17, com.comviva.webaxn.utils.e r18) {
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
            r13.d(r3, r8)
            goto L73
        L5c:
            java.lang.String r4 = "c3lshow:"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L68
            r13.c(r3, r8)
            goto L73
        L68:
            java.lang.String r4 = "c3lhide:"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L73
            r13.b(r3, r8)
        L73:
            int r1 = r1 + 1
            goto L47
        L76:
            com.comviva.webaxn.ui.o1 r0 = r13.a(r8)
            if (r0 == 0) goto L85
            com.comviva.webaxn.ui.o1 r0 = r13.a(r8)
            android.content.Context r1 = r9.f
            r0.a(r8, r1, r2)
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
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto Lc7
            if (r7 == 0) goto La1
            java.lang.String r0 = r7.j
        L9f:
            r7 = r0
            goto La7
        La1:
            if (r10 == 0) goto La6
            java.lang.String r0 = r10.j
            goto L9f
        La6:
            r7 = r11
        La7:
            java.util.Vector r0 = r15.i()
            xj r0 = com.comviva.webaxn.utils.x1.a(r12, r0)
            r4 = r15
            if (r0 == 0) goto Lb5
            r15.a(r0)
        Lb5:
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0 = r13
            r1 = r12
            r4 = r15
            r8 = r16
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 <= 0) goto Lc7
            r13.E()
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.a(java.lang.String, mj, lj, yj, com.comviva.webaxn.utils.e):void");
    }

    public void a(String str, yj yjVar, com.comviva.webaxn.utils.e eVar, boolean z) {
        String str2 = null;
        if (z && t() != null) {
            x1.a(this.f, (yj) null, t().r().getApplicationWindowToken());
        }
        if (this.N.size() == 1) {
            x1.a((Activity) this.f);
            return;
        }
        if (this.N.size() > 0) {
            k();
            o1 A = A();
            A.k().setOnClickListener(null);
            A.k().setOnTouchListener(null);
            A.D();
            A.C();
            lj ljVar = A.d;
            if (ljVar.f().c != null) {
                ljVar.f().c.a();
            }
            ljVar.o();
            ljVar.a(this.f);
            if (!A.a(true)) {
                this.O.removeView(A.m());
            }
            if (t() != null) {
                t().a();
                t().F();
                if (!TextUtils.isEmpty(str)) {
                    HashMap<String, String> f2 = x1.f(str);
                    if (f2.size() > 0) {
                        String str3 = f2.get("action");
                        if (!TextUtils.isEmpty(str3) && !a(str3, false, yjVar, eVar, k(), t().d)) {
                            if (yjVar != null) {
                                str2 = yjVar.j;
                            } else if (eVar != null) {
                                str2 = eVar.j;
                            }
                            String str4 = str2;
                            xj a2 = x1.a(str3, k().i());
                            if (a2 != null) {
                                k().a(a2);
                            }
                            if (a(str3, false, false, k(), false, false, str4, t().d) > 0) {
                                E();
                            }
                        }
                        f2.clear();
                    }
                }
                a(k(), t().d, true);
                if (t().n() != null) {
                    t().n().c();
                }
                if (t().d != null) {
                    t().d.n();
                }
            }
        }
    }

    public void a(String str, yj yjVar, mj mjVar) {
        String str2;
        String str3;
        if (yjVar != null && (((str2 = yjVar.l) != null && str2.equals("sms")) || (((str3 = yjVar.m) != null && str3.equals("sms")) || yjVar.e == 18))) {
            if (TextUtils.isEmpty(yjVar.s) || TextUtils.isEmpty(yjVar.t) || t() == null) {
                return;
            }
            t().a(yjVar.s, yjVar.t, (String) null, mjVar);
            return;
        }
        if (zi.j && str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
            p1.d(this.f, str);
            return;
        }
        if (str != null) {
            if (!TextUtils.isEmpty(str) && str.startsWith("file://")) {
                str = "file:///android_asset/map/" + str.substring(7);
            }
            p1.a(this.f, yjVar != null ? yjVar.j : null, str);
        }
    }

    public void a(String str, byte[] bArr) {
        if (aj.a(this.f).i("private") >= 10485760) {
            aj.a(this.f).a("private");
        }
        aj.a(this.f).a(str, "private", bArr);
    }

    public void a(mj mjVar, lj ljVar) {
        if (mjVar == null || ljVar == null) {
            return;
        }
        for (l1 l1Var : ljVar.i()) {
            if (l1Var != null) {
                if (l1Var.p) {
                    l1Var.o = true;
                } else {
                    this.g.c(l1Var);
                }
            }
        }
        ljVar.l();
    }

    public void a(mj mjVar, lj ljVar, boolean z) {
        if (mjVar == null || ljVar == null || ljVar.f().c == null) {
            return;
        }
        ljVar.f().c.a(false, z, t());
    }

    public void a(qj qjVar) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        if (t() != null) {
            t().d().setVisibility(8);
        }
        Dialog dialog = this.o;
        if (dialog == null || !dialog.isShowing()) {
            int d2 = com.comviva.webaxn.utils.b.a(this.f).a().d();
            int b2 = com.comviva.webaxn.utils.b.a(this.f).a().b();
            if (d2 >= b2) {
                d2 = b2;
            }
            Dialog dialog2 = new Dialog(this.f);
            this.o = dialog2;
            dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.o.requestWindowFeature(1);
            View inflate = ((Activity) this.f).getLayoutInflater().inflate(R.layout.custom_progressbar, (ViewGroup) null);
            if (qjVar != null && qjVar.h()) {
                inflate.setBackgroundColor(Color.argb(150, Color.red(qjVar.b()), Color.green(qjVar.b()), Color.blue(qjVar.b())));
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.progress_bar);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.loaderimage);
            linearLayout.setId(1);
            TextView textView = (TextView) inflate.findViewById(R.id.progress_text);
            textView.setId(2);
            double d3 = d2;
            Double.isNaN(d3);
            textView.setMaxWidth((int) (0.6d * d3));
            if (qjVar == null || TextUtils.isEmpty(qjVar.k())) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(qjVar.k());
                textView.setTextSize(qjVar.e());
                if (qjVar.i()) {
                    textView.setTextColor(n1.d(qjVar.c()));
                }
                textView.setTypeface(qjVar.g(), n1.e(qjVar.f()));
                if (Build.VERSION.SDK_INT >= 21) {
                    textView.setLetterSpacing(qjVar.d());
                }
                String a2 = qjVar.a();
                if (a2.equalsIgnoreCase("B")) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams3.addRule(3, 1);
                    layoutParams3.addRule(14);
                    textView.setLayoutParams(layoutParams3);
                    layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams.addRule(14);
                } else {
                    if (a2.equalsIgnoreCase("L")) {
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                        layoutParams4.addRule(1, 2);
                        layoutParams4.addRule(15);
                        linearLayout.setLayoutParams(layoutParams4);
                        layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams2.addRule(15);
                    } else if (a2.equalsIgnoreCase("T")) {
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
            Double.isNaN(d3);
            double d4 = d3 * 0.15d;
            double sqrt = Math.sqrt(2.0d) * d4;
            double abs = (int) Math.abs(sqrt - d4);
            Double.isNaN(abs);
            double d5 = sqrt + abs;
            int i2 = (int) d4;
            new LinearLayout.LayoutParams(i2, i2);
            imageView.getLayoutParams().width = i2;
            imageView.getLayoutParams().height = i2;
            int i3 = (int) d5;
            new RelativeLayout.LayoutParams(i3, i3);
            linearLayout.getLayoutParams().width = i3;
            linearLayout.getLayoutParams().height = i3;
            a(0, imageView);
            this.o.setContentView(inflate);
            this.o.show();
            this.o.setCancelable(true);
            this.o.setCanceledOnTouchOutside(false);
            this.o.setOnCancelListener(new e());
        }
    }

    public void a(l lVar) {
        lj ljVar;
        l1 l1Var = lVar.e;
        mj f2 = lVar.f.f();
        if (f2 == null) {
            return;
        }
        lj e2 = lVar.f.e();
        if (e2 == null && t() != null) {
            e2 = t().e();
        }
        lj ljVar2 = e2;
        if (ljVar2 != null) {
            zj f3 = ljVar2.f();
            if (l1Var != null && (ljVar = l1Var.x) != null && ljVar.f() != null && l1Var.x.f().equals(f3)) {
                zj zjVar = null;
                if (lVar.b != null) {
                    if (!lVar.g && x1.e) {
                        x1.e = false;
                    }
                    String str = lVar.b.w;
                    if (str != null) {
                        a(str);
                    }
                    if (lVar.b.x != null) {
                        d();
                    }
                    mj mjVar = lVar.b;
                    mjVar.x = null;
                    mjVar.w = null;
                    if (mjVar.a(0) != null) {
                        zj f4 = lVar.b.a(0).f();
                        if (f4 != null && (f4.m.equalsIgnoreCase("confirm") || f4.m.equalsIgnoreCase("error") || f4.m.equalsIgnoreCase("info") || f4.m.equalsIgnoreCase("toast") || f4.m.equalsIgnoreCase("popup") || f4.m.equalsIgnoreCase("drawer"))) {
                            a(lVar.a, null, h.WBXML_BUFFER, lVar.e, lVar.g, false, true);
                            return;
                        }
                        zjVar = f4;
                    }
                    f2.a(lVar.b.i());
                    for (int i2 = 1; i2 < lVar.b.h(); i2++) {
                        f2.a(lVar.b.a(i2));
                    }
                }
                if (f3 != null && zjVar != null) {
                    Vector<yj> a2 = a(f3, zjVar, ljVar2, lVar.b.a(0));
                    for (int i3 = 0; i3 < a2.size(); i3++) {
                        a(ljVar2, a2.get(i3));
                    }
                    lVar.f.a(ljVar2, this.f, false);
                    o1 o1Var = lVar.f;
                    o1.c(ljVar2, this.f, false);
                    HashMap<String, String> hashMap = zjVar.r;
                    if (hashMap != null && hashMap.size() > 0) {
                        String str2 = zjVar.r.get("schema");
                        if (!TextUtils.isEmpty(str2)) {
                            a(str2, false, null, null, f2, ljVar2);
                        }
                    }
                }
            }
        }
        b(f2, ljVar2, false);
    }

    public void a(yj yjVar) {
        if (yjVar != null) {
            if (yjVar.z0 == null) {
                b(yjVar);
                return;
            }
            for (int i2 = 0; i2 < yjVar.z0.size(); i2++) {
                a(yjVar.z0.elementAt(i2));
            }
        }
    }

    public void a(byte[] bArr) {
        aj.a(this.f).b(this.X, bArr, 7);
    }

    public void a(byte[] bArr, String str, String str2) {
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str = str2.substring(str2.lastIndexOf(47) + 1);
        }
        x1.a(bArr, x1.a(this.f, 1, "webaxn_media") + str);
    }

    public void a(byte[] bArr, String str, h hVar, l1 l1Var) {
        if (a(l1Var.x) == null) {
            return;
        }
        l lVar = new l(this);
        lVar.a = bArr;
        lVar.c = str;
        lVar.d = hVar;
        lVar.e = l1Var;
        lVar.f = a(l1Var.x);
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

    public void a(byte[] bArr, String str, h hVar, l1 l1Var, boolean z, boolean z2, boolean z3) {
        l lVar = new l(this);
        lVar.a = bArr;
        lVar.c = str;
        lVar.d = hVar;
        lVar.e = l1Var;
        lVar.g = z;
        lVar.h = z2;
        lVar.i = z3;
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
    public boolean a(
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

    public boolean a(String str, boolean z) {
        byte[] a2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b2 = aj.a(this.f).b(str, "cachedpagemap");
        if (TextUtils.isEmpty(b2)) {
            b2 = str;
        }
        if (TextUtils.isEmpty(b2) || (a2 = aj.a(this.f).a(b2, "cachedAcrossSession")) == null) {
            return false;
        }
        a(a2, str, h.XML_BUFFER, null, true, z, true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (a(r17, false, r18, r21, true, false, r7, r22) <= 0) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (a(r1, false, true, r21, true, false, r7, r22) <= 0) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c7b, code lost:
    
        if (r13.a(r1, r16, r21, r22, r19, r20, r12) != false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0ca6, code lost:
    
        if (r13.a(r1, r16, r21, r22, r19, r20, r12) != false) goto L525;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r17, boolean r18, defpackage.yj r19, com.comviva.webaxn.utils.e r20, defpackage.mj r21, defpackage.lj r22) {
        /*
            Method dump skipped, instructions count: 3875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.a(java.lang.String, boolean, yj, com.comviva.webaxn.utils.e, mj, lj):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af A[LOOP:4: B:141:0x02a9->B:143:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[LOOP:0: B:40:0x00f2->B:42:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(defpackage.lj r28, defpackage.mj r29, com.comviva.webaxn.ui.o1 r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.a(lj, mj, com.comviva.webaxn.ui.o1, boolean, boolean):boolean");
    }

    public int b(String str, boolean z) {
        l1 h2 = h(str);
        if (x1.e && TextUtils.isEmpty(j1.a(this.f).W())) {
            d(h2);
        }
        String str2 = h2.u;
        int i2 = z ? 20 : 4;
        if (str2.equals("StartAppln_ReqPage")) {
            str2 = "StartAppln_Req";
        }
        String str3 = str2;
        x1.e = true;
        if (h2 != null) {
            h2.E = String.valueOf(j1.a(this.f).b("iniversion"));
            x1.d = x1.a(h2);
        }
        int a2 = a(str3, 2, i2, h2, x1.d);
        if (-1 == a2 && !z) {
            w();
            if (!a("msg.connProb", false)) {
                String c2 = j1.a(this.f).c("msg.connProb");
                if (TextUtils.isEmpty(c2)) {
                    c2 = this.f.getString(R.string.default_connect_err);
                }
                if (str != null) {
                    a(c2, str, true);
                } else {
                    a(c2, str3, true);
                }
            }
        }
        return a2;
    }

    public void b() {
        l1 l2 = l();
        if (l2 != null) {
            this.g.c(l2);
            B();
        }
    }

    public void b(l1 l1Var) {
        l1 l2 = l();
        if (l2 != null) {
            this.g.c(l2);
            B();
        }
        this.p = l1Var;
    }

    public void b(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Cursor j2;
        if (str2 == null || (j2 = aj.a(this.f).j()) == null) {
            str3 = null;
        } else {
            j2.moveToFirst();
            try {
                str3 = j2.getString(j2.getColumnIndex("url"));
            } catch (Exception unused) {
                str3 = null;
            }
            j2.close();
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
                aj.a(this.f).a(str4, null, str5, str6, null);
            }
        }
    }

    public void b(String str, lj ljVar) {
        n1 n1Var;
        String[] split = str.substring(8, str.length()).split(";");
        zj f2 = ljVar.f();
        if (f2 != null) {
            HashMap<String, String> k2 = aj.a(this.f).k();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("$$")) {
                    str2 = str2.substring(2);
                    if (k2.size() > 0) {
                        str2 = k2.get(str2);
                    }
                }
                yj a2 = f2.a(str2, (Vector<yj>) null);
                if (a2 != null && (n1Var = a2.a0) != null) {
                    a2.f = false;
                    n1Var.h().setVisibility(8);
                }
            }
        }
    }

    public void b(String str, mj mjVar, lj ljVar) {
        if (mjVar == null) {
            mjVar = k();
        }
        l1 l1Var = new l1();
        l1Var.u = str;
        l1Var.a = j1.a(this.f).s0();
        l1Var.d = j1.a(this.f).g0();
        l1Var.E = String.valueOf(j1.a(this.f).b("iniversion"));
        l1Var.D = r();
        int i2 = 0;
        l1Var.G = false;
        l1Var.x = ljVar;
        Vector<xj> i3 = mjVar.i();
        xj xjVar = null;
        if (i3 != null) {
            while (true) {
                if (i2 >= i3.size()) {
                    break;
                }
                xj elementAt = i3.elementAt(i2);
                if (!TextUtils.isEmpty(elementAt.a) && elementAt.a.equals(str)) {
                    xjVar = elementAt;
                    break;
                }
                i2++;
            }
        }
        if (xjVar != null) {
            l1Var.F = xjVar.b;
        }
        com.comviva.webaxn.utils.b bVar = this.h;
        if (bVar != null) {
            l1Var.H = bVar.a();
        }
        String str2 = l1Var.u;
        if (l1Var.t != null) {
            str2 = str2 + l1Var.t;
        }
        a(str2, 2, 13, l1Var, x1.d);
    }

    public void b(String str, byte[] bArr) {
        if (aj.a(this.f).i("public") >= 10485760) {
            aj.a(this.f).a("public");
        }
        aj.a(this.f).a(str, "public", bArr);
    }

    public void b(lj ljVar) {
        zj f2;
        HashMap<String, hj> hashMap;
        if (ljVar == null || (f2 = ljVar.f()) == null || (hashMap = f2.P) == null || hashMap.get("onchange") == null || TextUtils.isEmpty(f2.P.get("onchange").d())) {
            return;
        }
        a(f2.P.get("onchange").d(), false, true, null, false, false, null, ljVar);
    }

    public void b(mj mjVar, lj ljVar) {
        zj f2 = ljVar.f();
        f2.d();
        if (!TextUtils.isEmpty(f2.I)) {
            a(f2.I, f2.c());
            if (a(f2.I, mjVar, ljVar) || TextUtils.isEmpty(f2.G) || f2.G.equals("Menulist") || a(f2.G, false, null, null, mjVar, ljVar)) {
                return;
            }
            a(f2.G, f2.c());
            if (a(f2.G, true, false, mjVar, false, false, f2.H, ljVar) <= 0) {
                return;
            }
        } else {
            if (TextUtils.isEmpty(f2.G) || a(f2.G, false, null, null, mjVar, ljVar)) {
                return;
            }
            a(f2.G, f2.c());
            if (a(f2.G, true, false, mjVar, false, false, f2.H, ljVar) <= 0) {
                return;
            }
        }
        E();
    }

    public void b(qj qjVar) {
        if (qjVar != null) {
            if (qjVar.l().equals("B")) {
                a(qjVar);
            } else {
                c(qjVar);
            }
        }
    }

    public void b(yj yjVar) {
        String m2;
        if (yjVar.X && yjVar.e == 3) {
            n1 n1Var = yjVar.a0;
            if (n1Var instanceof v) {
                m2 = ((v) n1Var).m();
            } else if (!(n1Var instanceof w)) {
                return;
            } else {
                m2 = ((w) n1Var).m();
            }
            aj.a(this.f).k(yjVar.V, m2);
        }
    }

    public void b(boolean z) {
        String s0 = 1 == j1.a(this.f).a("keepregistered") ? j1.a(this.f).s0() : null;
        String O = j1.a(this.f).O();
        String A = j1.a(this.f).A();
        String B = j1.a(this.f).B();
        boolean v0 = j1.a(this.f).v0();
        String r = j1.a(this.f).r();
        j1.a(this.f).k();
        aj.a(this.f).c();
        j1.a(this.f).k(A);
        j1.a(this.f).u(O);
        if (v0) {
            j1.a(this.f).l(B);
            j1.a(this.f).c(v0);
        }
        j1.a(this.f).K(s0);
        j1.a(this.f).g(r);
        j1.a(this.f).F((String) null);
        j1.a(this.f).D((String) null);
        j1.a(this.f).E((String) null);
        j1.a(this.f).G((String) null);
        j1.a(this.f).p(-1);
        j1.a(this.f).v((String) null);
        j1.a(this.f).d(false);
        j1.a(this.f).g(false);
        j1.a(this.f).y("android");
        j1.a(this.f).z((String) null);
        j1.a(this.f).r(0);
        if (z) {
            j1.a(this.f).a((String) null, false);
            j1.a(this.f).b((String) null, false);
        }
        j1.a(this.f).q(0);
    }

    public void b(byte[] bArr) {
        aj.a(this.f).a(x1.i(this.W), bArr, 1);
    }

    public boolean b(String str) {
        boolean z = true;
        this.v = true;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.B = null;
        this.C = null;
        this.A = null;
        boolean z2 = false;
        this.E = 0;
        this.H = null;
        this.I = false;
        this.K = null;
        this.J = zi.l;
        String c2 = c("DOMAIN_URL", str);
        this.B = c2;
        this.D = "android";
        this.L = 1;
        this.G = -1;
        if (c2 != null) {
            this.B = c2.trim();
        }
        String c3 = c("IP_URL", str);
        this.C = c3;
        if (c3 != null) {
            this.C = c3.trim();
        }
        String c4 = c("SERVER_URL", str);
        this.w = c4;
        if (c4 != null) {
            this.w = c4.trim();
            this.v = true;
        }
        if (this.v) {
            String c5 = c("IMAGE_URL", str);
            this.y = c5;
            if (c5 != null) {
                this.y = c5.trim();
            }
            String c6 = c("SECURE_SERVER_URL", str);
            this.x = c6;
            if (c6 != null) {
                this.x = c6.trim();
            }
            String c7 = c("SERVICE_USE_PROXY", str);
            this.A = c7;
            if (c7 != null) {
                String trim = c7.trim();
                this.A = trim;
                if (trim.length() > 0 && this.A.equalsIgnoreCase("1")) {
                    z2 = true;
                }
            }
            if (z2) {
                String c8 = c("SERVICE_PROXY_URL", str);
                this.z = c8;
                if (c8 != null) {
                    this.z = c8.trim();
                }
            }
            String c9 = c("INI_VERSION", str);
            if (c9 != null) {
                try {
                    this.E = Integer.parseInt(c9.trim());
                } catch (Exception unused) {
                }
            }
            String c10 = c("GROUP", str);
            this.H = c10;
            if (c10 != null) {
                this.H = c10.trim();
            }
            String c11 = c("GZIP_ENABLED", str);
            if (c11 != null) {
                String trim2 = c11.trim();
                if (trim2.length() > 0 && trim2.equals("1")) {
                    this.I = true;
                }
            }
            String c12 = c("SSL", str);
            if (!TextUtils.isEmpty(c12)) {
                try {
                    int parseInt = Integer.parseInt(c12.trim());
                    if (parseInt != 1) {
                        if (parseInt == 2) {
                            z = zi.l;
                        } else if (parseInt == 0) {
                            z = zi.l;
                        }
                    }
                    this.J = z;
                } catch (Exception unused2) {
                }
            }
            String c13 = c("USERAGENT", str);
            if (!TextUtils.isEmpty(c13)) {
                this.D = c13.trim();
            }
            String c14 = c("PRE_STARTUP_URL", str);
            if (!TextUtils.isEmpty(c14)) {
                this.K = c14.trim();
            }
            String c15 = c("COOKIE", str);
            if (!TextUtils.isEmpty(c15)) {
                try {
                    this.L = Integer.parseInt(c15.trim());
                } catch (NumberFormatException unused3) {
                }
            }
            String c16 = c("KEEP_REGISTERED", str);
            if (c16 != null) {
                try {
                    this.F = Integer.parseInt(c16.trim());
                } catch (Exception unused4) {
                }
            }
            String c17 = c("SOUND", str);
            if (!TextUtils.isEmpty(c17)) {
                try {
                    this.G = Integer.parseInt(c17.trim());
                } catch (Exception unused5) {
                }
            }
        }
        return this.v;
    }

    public String c(String str, String str2) {
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

    public void c() {
        if (t() != null) {
            t().d().setVisibility(8);
        }
        Dialog dialog = this.o;
        if (dialog == null || !dialog.isShowing()) {
            String b02 = j1.a(this.f).b0();
            int a02 = j1.a(this.f).a0();
            if (-1 >= a02) {
                a02 = 0;
            }
            String c2 = j1.a(this.f).c("lbl.defLabel");
            if (TextUtils.isEmpty(c2)) {
                c2 = this.f.getString(R.string.loading);
            }
            ProgressDialog show = ProgressDialog.show(this.f, "", c2, true);
            this.o = show;
            try {
                TextView textView = (TextView) show.findViewById(android.R.id.message);
                if (!TextUtils.isEmpty(b02)) {
                    textView.setTypeface(com.comviva.webaxn.utils.v.a(b02), n1.e(a02));
                }
            } catch (Exception unused) {
            }
            this.o.setCancelable(true);
            this.o.setCanceledOnTouchOutside(false);
            this.o.setOnCancelListener(new d());
        }
    }

    public void c(String str, lj ljVar) {
        n1 n1Var;
        String[] split = str.substring(8, str.length()).split(";");
        zj f2 = ljVar.f();
        if (f2 != null) {
            HashMap<String, String> k2 = aj.a(this.f).k();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("$$")) {
                    str2 = str2.substring(2);
                    if (k2.size() > 0) {
                        str2 = k2.get(str2);
                    }
                }
                yj a2 = f2.a(str2, (Vector<yj>) null);
                if (a2 != null && (n1Var = a2.a0) != null) {
                    a2.f = true;
                    n1Var.h().setVisibility(0);
                }
            }
        }
    }

    public void c(mj mjVar, lj ljVar) {
        if (mjVar == null || ljVar == null || ljVar.f().c == null) {
            return;
        }
        ljVar.f().c.a();
    }

    public void c(qj qjVar) {
        int i2;
        int i3;
        if (qjVar != null) {
            if (qjVar.i()) {
                n1.d(qjVar.c());
            }
            if (qjVar.h()) {
                n1.d(qjVar.b());
            }
            if (qjVar.j()) {
                qjVar.e();
            }
            i2 = -16777216;
            i3 = -16896;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (t() != null) {
            ProgressBar d2 = t().d();
            d2.setVisibility(0);
            d2.setBackgroundColor(i2);
            try {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                shapeDrawable.getPaint().setColor(i3);
                ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 3, 1);
                Rect bounds = d2.getProgressDrawable().getBounds();
                d2.setProgressDrawable(clipDrawable);
                d2.getProgressDrawable().setBounds(bounds);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            d2.setMax(100);
            d2.setIndeterminate(false);
            d2.getLayoutParams().height = 3;
            Z = 5;
            d2.setProgress(5);
        }
    }

    public boolean c(String str) {
        this.X = str;
        return aj.a(this.f).a(str, "startup_images", 7);
    }

    public byte[] c(l1 l1Var) {
        return new pi(l1Var, this, this.f).a(aj.a(this.f).k());
    }

    public void d() {
        aj.a(this.f).i();
        aj.a(this.f).h();
    }

    public void d(String str) {
        this.q = str;
    }

    public void d(String str, String str2) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) this.f;
        if (webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        String c2 = j1.a(webAxnActivity).c("ttl.Alert");
        if (c2 == null) {
            c2 = this.f.getString(R.string.title_security);
        }
        builder.setTitle(c2);
        if (str2 == null) {
            str2 = this.f.getString(R.string.sslcertificate_err_msg);
        }
        builder.setMessage(str2);
        builder.setCancelable(true);
        String c3 = j1.a(webAxnActivity).c("cmd.Ok");
        if (c3 == null) {
            c3 = webAxnActivity.getString(R.string.dialog_button_ok);
        }
        builder.setPositiveButton(c3, new f(this, str, webAxnActivity));
        builder.show();
    }

    public void d(String str, lj ljVar) {
        String[] split = str.substring(10, str.length()).split(";");
        zj f2 = ljVar.f();
        if (f2 != null) {
            HashMap<String, String> k2 = aj.a(this.f).k();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith("$$")) {
                    str2 = str2.substring(2);
                    if (k2.size() > 0) {
                        str2 = k2.get(str2);
                    }
                }
                yj a2 = f2.a(str2, (Vector<yj>) null);
                if (a2 != null && a2.a0 != null) {
                    boolean z = !a2.f;
                    a2.f = z;
                    a2.a0.h().setVisibility(z ? 0 : 8);
                }
            }
        }
    }

    public void e(String str) {
        this.Y = str;
    }

    public byte[] e() {
        return aj.a(this.f).d(this.X, "startup_images");
    }

    public String f() {
        return this.X;
    }

    public void f(String str) {
    }

    public com.comviva.webaxn.utils.e g() {
        return this.m;
    }

    public boolean g(String str) {
        this.W = str;
        return aj.a(this.f).a(str, "startup_images", 1);
    }

    public long h() {
        if (this.l == 0) {
            this.l = this.g.b();
        }
        return this.l;
    }

    public Context i() {
        return this.f;
    }

    public qj j() {
        return this.a;
    }

    public mj k() {
        if (t() != null) {
            return t().e;
        }
        return null;
    }

    public l1 l() {
        return this.p;
    }

    public HashMap<String, String> m() {
        return this.n;
    }

    public x1.n n() {
        return this.T;
    }

    public r0 o() {
        return this.R;
    }

    public String p() {
        return this.Y;
    }

    public int q() {
        return this.j;
    }

    public String r() {
        return "2.3.0.11583/" + j1.a(this.f).V();
    }

    public x1.r s() {
        return this.S;
    }

    public o1 t() {
        try {
            this.M = this.N.lastElement();
        } catch (NoSuchElementException unused) {
            this.M = null;
        }
        return this.M;
    }

    public boolean u() {
        StringBuilder sb;
        String str;
        if (!x1.j || TextUtils.isEmpty(x1.B)) {
            return false;
        }
        if (x1.B.startsWith("http") || x1.B.startsWith("https")) {
            sb = new StringBuilder();
            sb.append(x1.B);
            str = "?";
        } else {
            sb = new StringBuilder();
            sb.append(x1.B);
            str = "://";
        }
        sb.append(str);
        sb.append(Uri.encode(this.f.getString(R.string.payment_app_error_msg)));
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString()));
            data.setFlags(67108864);
            this.f.startActivity(data);
        } catch (Exception unused) {
            String c2 = j1.a(this.f).c("msg.AppNotFound");
            if (c2 == null) {
                c2 = this.f.getString(R.string.app_not_found_error);
            }
            Toast.makeText(this.f, c2, 0).show();
        }
        x1.j = false;
        x1.B = null;
        return true;
    }

    public void v() {
        k1 k1Var;
        if (k() != null && t().d != null) {
            lj ljVar = t().d;
            if (ljVar != null && ljVar.k && a(ljVar) != null) {
                a(ljVar).a(ljVar, this.f, false);
            }
            zj f2 = ljVar.f();
            if (f2 != null && (k1Var = f2.c) != null) {
                k1Var.a(false, false, t());
            }
        }
        if (o0.a(this.f).b()) {
            o0.a(this.f).c();
        }
        w();
        b();
    }

    public void w() {
        if (o() == null || !o().b()) {
            return;
        }
        o().setRefreshing(false);
        a((r0) null);
    }

    public boolean x() {
        return this.i;
    }

    public boolean y() {
        return this.k;
    }

    public boolean z() {
        return this.Q;
    }
}
