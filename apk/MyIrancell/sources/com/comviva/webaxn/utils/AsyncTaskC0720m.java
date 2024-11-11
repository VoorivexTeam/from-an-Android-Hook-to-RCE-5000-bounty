package com.comviva.webaxn.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.mtni.myirancell.R;
import java.io.File;
import java.io.IOException;
import p000.C3400wj;
import p000.C3530zi;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.comviva.webaxn.utils.m */
/* loaded from: classes.dex */
public class AsyncTaskC0720m extends AsyncTask<String, String, String> {

    /* renamed from: v */
    public static ProgressDialog f4974v;

    /* renamed from: a */
    public AlertDialog.Builder f4975a;

    /* renamed from: b */
    public AlertDialog f4976b;

    /* renamed from: c */
    MediaPlayer f4977c;

    /* renamed from: d */
    final Context f4978d;

    /* renamed from: e */
    String f4979e;

    /* renamed from: f */
    String f4980f;

    /* renamed from: g */
    public SeekBar f4981g;

    /* renamed from: h */
    public ImageButton f4982h;

    /* renamed from: i */
    public TextView f4983i;

    /* renamed from: j */
    public TextView f4984j;

    /* renamed from: k */
    public TextView f4985k;

    /* renamed from: m */
    public boolean f4987m;

    /* renamed from: n */
    public boolean f4988n;

    /* renamed from: t */
    private C3400wj f4994t;

    /* renamed from: l */
    public boolean f4986l = false;

    /* renamed from: o */
    public String f4989o = null;

    /* renamed from: p */
    public String f4990p = null;

    /* renamed from: q */
    public boolean f4991q = false;

    /* renamed from: r */
    public boolean f4992r = false;

    /* renamed from: s */
    private final Handler f4993s = new Handler();

    /* renamed from: u */
    File f4995u = Environment.getExternalStorageDirectory();

    /* renamed from: com.comviva.webaxn.utils.m$a */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            AsyncTaskC0720m.f4974v = null;
            AsyncTaskC0720m.this.f4986l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m$b */
    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            AsyncTaskC0720m asyncTaskC0720m = AsyncTaskC0720m.this;
            asyncTaskC0720m.f4981g.setProgress(asyncTaskC0720m.f4977c.getDuration());
            AsyncTaskC0720m asyncTaskC0720m2 = AsyncTaskC0720m.this;
            asyncTaskC0720m2.f4984j.setText(asyncTaskC0720m2.m5869a(asyncTaskC0720m2.f4977c.getDuration(), true));
            AsyncTaskC0720m.this.f4992r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AsyncTaskC0720m.this.m5874a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m$d */
    /* loaded from: classes.dex */
    public class d implements SeekBar.OnSeekBarChangeListener {
        d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                AsyncTaskC0720m.this.f4977c.seekTo(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AsyncTaskC0720m.this.m5872e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m$f */
    /* loaded from: classes.dex */
    public class f extends PhoneStateListener {
        f() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            AsyncTaskC0720m asyncTaskC0720m = AsyncTaskC0720m.this;
            MediaPlayer mediaPlayer = asyncTaskC0720m.f4977c;
            if (mediaPlayer != null) {
                if (i == 0) {
                    if (asyncTaskC0720m.f4991q) {
                        mediaPlayer.start();
                        AsyncTaskC0720m asyncTaskC0720m2 = AsyncTaskC0720m.this;
                        asyncTaskC0720m2.f4992r = false;
                        asyncTaskC0720m2.m5878d();
                        AsyncTaskC0720m.this.f4991q = false;
                        return;
                    }
                    return;
                }
                if (i != 1) {
                    if (i != 2 || !mediaPlayer.isPlaying()) {
                        return;
                    }
                } else if (!mediaPlayer.isPlaying()) {
                    return;
                }
                AsyncTaskC0720m.this.f4977c.pause();
                AsyncTaskC0720m asyncTaskC0720m3 = AsyncTaskC0720m.this;
                asyncTaskC0720m3.f4992r = false;
                asyncTaskC0720m3.m5878d();
                AsyncTaskC0720m.this.f4991q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncTaskC0720m.this.m5878d();
        }
    }

    public AsyncTaskC0720m(Context context, AbstractC0652n1 abstractC0652n1, String str, String str2, boolean z, C3400wj c3400wj) {
        this.f4987m = false;
        this.f4988n = true;
        this.f4978d = (WebAxnActivity) context;
        this.f4979e = str;
        this.f4987m = false;
        this.f4988n = z;
        this.f4980f = str2;
        C0731p1.f5080i = null;
        this.f4994t = c3400wj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m5869a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            i2 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            int i5 = i / 1000;
            int i6 = i5 == 0 ? 0 : i5 / 60;
            i2 = i5 % 60;
            i3 = i6 / 60;
            i4 = i6 % 60;
        }
        return i3 == 0 ? z ? String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i2)) : String.format("-%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i2)) : z ? String.format("%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)) : String.format("-%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5872e() {
        if (this.f4982h.getId() != 1) {
            this.f4982h.setImageResource(R.drawable.ht_app_pause_icon);
            this.f4977c.pause();
            this.f4982h.setId(2);
            return;
        }
        this.f4982h.setImageResource(R.drawable.ht_app_pause_icon);
        this.f4982h.setId(2);
        try {
            this.f4977c.start();
            this.f4992r = false;
            m5878d();
        } catch (IllegalStateException unused) {
            this.f4977c.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01be, code lost:
    
        if (r7 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01df, code lost:
    
        r7.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dd, code lost:
    
        if (0 != 0) goto L89;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01e4: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:85:0x01e4 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a A[Catch: Exception -> 0x01c4, all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:6:0x0015, B:7:0x0024, B:9:0x002c, B:11:0x0047, B:16:0x0051, B:18:0x0056, B:20:0x005e, B:22:0x0070, B:24:0x0081, B:26:0x0088, B:27:0x0095, B:28:0x008d, B:30:0x009b, B:32:0x00a5, B:33:0x00af, B:35:0x00b3, B:37:0x00bf, B:38:0x00c8, B:40:0x00ce, B:42:0x00d8, B:44:0x00de, B:46:0x00e8, B:47:0x0104, B:49:0x0127, B:51:0x012d, B:52:0x016d, B:54:0x017a, B:56:0x0180, B:58:0x0185, B:61:0x019c, B:63:0x01a9, B:65:0x01ad, B:67:0x01b1, B:69:0x01b9, B:83:0x001b, B:90:0x01c4, B:92:0x01c8, B:94:0x01cc, B:96:0x01d4, B:97:0x01d9, B:80:0x0020), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.String... r19) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.AsyncTaskC0720m.doInBackground(java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public void m5874a() {
        MediaPlayer mediaPlayer = this.f4977c;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f4977c.stop();
            this.f4977c.release();
            this.f4977c = null;
        }
        this.f4976b.dismiss();
        this.f4975a = null;
        File file = C0731p1.f5080i;
        if (file == null || !file.exists()) {
            return;
        }
        C0731p1.f5080i.delete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        Context context;
        String m5641c;
        String str2;
        ProgressDialog progressDialog = f4974v;
        if (progressDialog != null && progressDialog.isShowing()) {
            f4974v.dismiss();
        }
        if (this.f4986l) {
            if (!this.f4987m || this.f4994t.m16297a("msg.downloadFail", false)) {
                return;
            }
            String m5641c2 = C0713j1.m5563a(this.f4978d).m5641c("msg.downloadFail");
            if (m5641c2 == null) {
                m5641c2 = this.f4978d.getString(R.string.medianotfound_err_msg);
            }
            String m5641c3 = C0713j1.m5563a(this.f4978d).m5641c("ttl.Alert");
            if (m5641c3 == null) {
                m5641c3 = this.f4978d.getString(R.string.dialog_title);
            }
            C0755x1.m6148a(this.f4978d, m5641c3, m5641c2, false, true);
            return;
        }
        if (this.f4988n) {
            context = this.f4978d;
            m5641c = C0713j1.m5563a(context).m5641c("msg.titleInf");
            str2 = "media saved in " + this.f4990p;
        } else {
            String str3 = this.f4980f;
            if (str3 != null) {
                if (str3.startsWith("audio/")) {
                    m5877c();
                    return;
                }
                try {
                    C0755x1.f5264v = true;
                    C0755x1.f5266x = true;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setDataAndType(FileProvider.m1448a(this.f4978d, this.f4978d.getString(R.string.authority), C0731p1.f5080i), this.f4989o);
                        intent.setFlags(1);
                    } else {
                        intent.setDataAndType(Uri.fromFile(C0731p1.f5080i), this.f4989o);
                    }
                    ((Activity) this.f4978d).startActivityForResult(intent, 1505);
                    return;
                } catch (Exception unused) {
                    File file = C0731p1.f5080i;
                    if (file != null && file.exists()) {
                        C0731p1.f5080i.delete();
                    }
                    Toast.makeText(this.f4978d, "No Application is to perform this operation.", 0).show();
                    return;
                }
            }
            context = this.f4978d;
            m5641c = C0713j1.m5563a(context).m5641c("ttl.Alert");
            str2 = "Unable to open.Media format is undefined";
        }
        C0755x1.m6148a(context, m5641c, str2, false, true);
    }

    /* renamed from: b */
    void m5876b() {
        this.f4977c = null;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f4977c = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.f4977c.setDataSource(C0731p1.f5080i.toString());
        this.f4977c.prepare();
        this.f4977c.start();
        this.f4977c.setOnCompletionListener(new b());
    }

    /* renamed from: c */
    public void m5877c() {
        TextView textView;
        String m5641c;
        this.f4975a = new AlertDialog.Builder(this.f4978d);
        View inflate = LayoutInflater.from(this.f4978d).inflate(R.layout.media, (ViewGroup) null);
        this.f4975a.setView(inflate);
        AlertDialog create = this.f4975a.create();
        this.f4976b = create;
        create.setCancelable(true);
        this.f4976b.setCanceledOnTouchOutside(false);
        this.f4976b.setOnCancelListener(new c());
        this.f4976b.show();
        try {
            m5876b();
            TextView textView2 = (TextView) inflate.findViewById(R.id.media_title);
            this.f4983i = textView2;
            textView2.setSingleLine(true);
            this.f4983i.setEllipsize(TextUtils.TruncateAt.END);
            this.f4984j = (TextView) inflate.findViewById(R.id.media_duration_start);
            TextView textView3 = (TextView) inflate.findViewById(R.id.media_duration_end);
            this.f4985k = textView3;
            textView3.setText(m5869a(this.f4977c.getDuration(), true));
            SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.SeekBar01);
            this.f4981g = seekBar;
            seekBar.setMax(this.f4977c.getDuration());
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.ButtonPlayStop);
            this.f4982h = imageButton;
            imageButton.setId(1);
            this.f4982h.setBackgroundColor(0);
            if (this.f4977c.isPlaying()) {
                this.f4984j.setText(m5869a(this.f4977c.getCurrentPosition(), true));
                this.f4982h.setImageResource(R.drawable.ht_app_pause_icon);
                this.f4982h.setId(2);
                if (this.f4979e != null) {
                    textView = this.f4983i;
                    m5641c = this.f4979e;
                } else {
                    textView = this.f4983i;
                    m5641c = C0713j1.m5563a(this.f4978d).m5641c("msg.audio");
                }
                textView.setText(m5641c);
                m5878d();
            }
            this.f4981g.setOnSeekBarChangeListener(new d());
            this.f4982h.setOnClickListener(new e());
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            m5874a();
            Toast.makeText(this.f4978d, "Sorry the player does not support this audio file", 1).show();
        }
        ((TelephonyManager) this.f4978d.getSystemService("phone")).listen(new f(), 32);
    }

    /* renamed from: d */
    public void m5878d() {
        MediaPlayer mediaPlayer = this.f4977c;
        if (mediaPlayer != null && !this.f4992r) {
            this.f4981g.setProgress(mediaPlayer.getCurrentPosition());
            this.f4984j.setText(m5869a(this.f4977c.getCurrentPosition(), true));
            if (this.f4977c.isPlaying()) {
                this.f4982h.setImageResource(R.drawable.ht_app_pause_icon);
                this.f4982h.setId(2);
                this.f4993s.postDelayed(new g(), 500L);
                return;
            }
        }
        this.f4982h.setImageResource(R.drawable.ht_app_play_icon);
        this.f4982h.setId(1);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        f4974v = new ProgressDialog(this.f4978d);
        if (C3530zi.f14471n) {
            f4974v.setMessage("Loading...");
            f4974v.setProgressStyle(0);
        } else {
            f4974v.setMessage("downloading...");
            f4974v.setProgressStyle(1);
        }
        f4974v.setCancelable(true);
        f4974v.setCanceledOnTouchOutside(false);
        f4974v.show();
        f4974v.setOnDismissListener(new a());
    }
}
