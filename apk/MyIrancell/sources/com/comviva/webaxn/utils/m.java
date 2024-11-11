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
import com.comviva.webaxn.ui.WebAxnActivity;
import com.mtni.myirancell.R;
import defpackage.wj;
import defpackage.zi;
import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends AsyncTask<String, String, String> {
    public static ProgressDialog v;
    public AlertDialog.Builder a;
    public AlertDialog b;
    MediaPlayer c;
    final Context d;
    String e;
    String f;
    public SeekBar g;
    public ImageButton h;
    public TextView i;
    public TextView j;
    public TextView k;
    public boolean m;
    public boolean n;
    private wj t;
    public boolean l = false;
    public String o = null;
    public String p = null;
    public boolean q = false;
    public boolean r = false;
    private final Handler s = new Handler();
    File u = Environment.getExternalStorageDirectory();

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            m.v = null;
            m.this.l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            m mVar = m.this;
            mVar.g.setProgress(mVar.c.getDuration());
            m mVar2 = m.this;
            mVar2.j.setText(mVar2.a(mVar2.c.getDuration(), true));
            m.this.r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            m.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements SeekBar.OnSeekBarChangeListener {
        d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                m.this.c.seekTo(i);
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
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends PhoneStateListener {
        f() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            m mVar = m.this;
            MediaPlayer mediaPlayer = mVar.c;
            if (mediaPlayer != null) {
                if (i == 0) {
                    if (mVar.q) {
                        mediaPlayer.start();
                        m mVar2 = m.this;
                        mVar2.r = false;
                        mVar2.d();
                        m.this.q = false;
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
                m.this.c.pause();
                m mVar3 = m.this;
                mVar3.r = false;
                mVar3.d();
                m.this.q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.d();
        }
    }

    public m(Context context, com.comviva.webaxn.ui.n1 n1Var, String str, String str2, boolean z, wj wjVar) {
        this.m = false;
        this.n = true;
        this.d = (WebAxnActivity) context;
        this.e = str;
        this.m = false;
        this.n = z;
        this.f = str2;
        p1.i = null;
        this.t = wjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, boolean z) {
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
    public void e() {
        if (this.h.getId() != 1) {
            this.h.setImageResource(R.drawable.ht_app_pause_icon);
            this.c.pause();
            this.h.setId(2);
            return;
        }
        this.h.setImageResource(R.drawable.ht_app_pause_icon);
        this.h.setId(2);
        try {
            this.c.start();
            this.r = false;
            d();
        } catch (IllegalStateException unused) {
            this.c.pause();
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.m.doInBackground(java.lang.String[]):java.lang.String");
    }

    public void a() {
        MediaPlayer mediaPlayer = this.c;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.c.stop();
            this.c.release();
            this.c = null;
        }
        this.b.dismiss();
        this.a = null;
        File file = p1.i;
        if (file == null || !file.exists()) {
            return;
        }
        p1.i.delete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        Context context;
        String c2;
        String str2;
        ProgressDialog progressDialog = v;
        if (progressDialog != null && progressDialog.isShowing()) {
            v.dismiss();
        }
        if (this.l) {
            if (!this.m || this.t.a("msg.downloadFail", false)) {
                return;
            }
            String c3 = j1.a(this.d).c("msg.downloadFail");
            if (c3 == null) {
                c3 = this.d.getString(R.string.medianotfound_err_msg);
            }
            String c4 = j1.a(this.d).c("ttl.Alert");
            if (c4 == null) {
                c4 = this.d.getString(R.string.dialog_title);
            }
            x1.a(this.d, c4, c3, false, true);
            return;
        }
        if (this.n) {
            context = this.d;
            c2 = j1.a(context).c("msg.titleInf");
            str2 = "media saved in " + this.p;
        } else {
            String str3 = this.f;
            if (str3 != null) {
                if (str3.startsWith("audio/")) {
                    c();
                    return;
                }
                try {
                    x1.v = true;
                    x1.x = true;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setDataAndType(FileProvider.a(this.d, this.d.getString(R.string.authority), p1.i), this.o);
                        intent.setFlags(1);
                    } else {
                        intent.setDataAndType(Uri.fromFile(p1.i), this.o);
                    }
                    ((Activity) this.d).startActivityForResult(intent, 1505);
                    return;
                } catch (Exception unused) {
                    File file = p1.i;
                    if (file != null && file.exists()) {
                        p1.i.delete();
                    }
                    Toast.makeText(this.d, "No Application is to perform this operation.", 0).show();
                    return;
                }
            }
            context = this.d;
            c2 = j1.a(context).c("ttl.Alert");
            str2 = "Unable to open.Media format is undefined";
        }
        x1.a(context, c2, str2, false, true);
    }

    void b() {
        this.c = null;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.c = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.c.setDataSource(p1.i.toString());
        this.c.prepare();
        this.c.start();
        this.c.setOnCompletionListener(new b());
    }

    public void c() {
        TextView textView;
        String c2;
        this.a = new AlertDialog.Builder(this.d);
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.media, (ViewGroup) null);
        this.a.setView(inflate);
        AlertDialog create = this.a.create();
        this.b = create;
        create.setCancelable(true);
        this.b.setCanceledOnTouchOutside(false);
        this.b.setOnCancelListener(new c());
        this.b.show();
        try {
            b();
            TextView textView2 = (TextView) inflate.findViewById(R.id.media_title);
            this.i = textView2;
            textView2.setSingleLine(true);
            this.i.setEllipsize(TextUtils.TruncateAt.END);
            this.j = (TextView) inflate.findViewById(R.id.media_duration_start);
            TextView textView3 = (TextView) inflate.findViewById(R.id.media_duration_end);
            this.k = textView3;
            textView3.setText(a(this.c.getDuration(), true));
            SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.SeekBar01);
            this.g = seekBar;
            seekBar.setMax(this.c.getDuration());
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.ButtonPlayStop);
            this.h = imageButton;
            imageButton.setId(1);
            this.h.setBackgroundColor(0);
            if (this.c.isPlaying()) {
                this.j.setText(a(this.c.getCurrentPosition(), true));
                this.h.setImageResource(R.drawable.ht_app_pause_icon);
                this.h.setId(2);
                if (this.e != null) {
                    textView = this.i;
                    c2 = this.e;
                } else {
                    textView = this.i;
                    c2 = j1.a(this.d).c("msg.audio");
                }
                textView.setText(c2);
                d();
            }
            this.g.setOnSeekBarChangeListener(new d());
            this.h.setOnClickListener(new e());
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            a();
            Toast.makeText(this.d, "Sorry the player does not support this audio file", 1).show();
        }
        ((TelephonyManager) this.d.getSystemService("phone")).listen(new f(), 32);
    }

    public void d() {
        MediaPlayer mediaPlayer = this.c;
        if (mediaPlayer != null && !this.r) {
            this.g.setProgress(mediaPlayer.getCurrentPosition());
            this.j.setText(a(this.c.getCurrentPosition(), true));
            if (this.c.isPlaying()) {
                this.h.setImageResource(R.drawable.ht_app_pause_icon);
                this.h.setId(2);
                this.s.postDelayed(new g(), 500L);
                return;
            }
        }
        this.h.setImageResource(R.drawable.ht_app_play_icon);
        this.h.setId(1);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        v = new ProgressDialog(this.d);
        if (zi.n) {
            v.setMessage("Loading...");
            v.setProgressStyle(0);
        } else {
            v.setMessage("downloading...");
            v.setProgressStyle(1);
        }
        v.setCancelable(true);
        v.setCanceledOnTouchOutside(false);
        v.show();
        v.setOnDismissListener(new a());
    }
}
