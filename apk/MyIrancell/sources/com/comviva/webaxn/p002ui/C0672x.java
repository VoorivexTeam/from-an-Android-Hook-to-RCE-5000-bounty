package com.comviva.webaxn.p002ui;

import android.media.AudioRecord;
import android.media.MediaRecorder;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.comviva.webaxn.ui.x */
/* loaded from: classes.dex */
public class C0672x {

    /* renamed from: p */
    private static final int[] f4477p = {8000, 11025, 22050, 44100};

    /* renamed from: a */
    private boolean f4478a;

    /* renamed from: b */
    private AudioRecord f4479b;

    /* renamed from: c */
    private MediaRecorder f4480c;

    /* renamed from: d */
    private int f4481d;

    /* renamed from: e */
    private String f4482e;

    /* renamed from: f */
    private b f4483f;

    /* renamed from: g */
    private RandomAccessFile f4484g;

    /* renamed from: h */
    private short f4485h;

    /* renamed from: i */
    private int f4486i;

    /* renamed from: j */
    private short f4487j;

    /* renamed from: k */
    private int f4488k;

    /* renamed from: l */
    private int f4489l;

    /* renamed from: m */
    private byte[] f4490m;

    /* renamed from: n */
    private int f4491n;

    /* renamed from: o */
    private AudioRecord.OnRecordPositionUpdateListener f4492o = new a();

    /* renamed from: com.comviva.webaxn.ui.x$a */
    /* loaded from: classes.dex */
    class a implements AudioRecord.OnRecordPositionUpdateListener {
        a() {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onMarkerReached(AudioRecord audioRecord) {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onPeriodicNotification(AudioRecord audioRecord) {
            int i = 0;
            C0672x.this.f4479b.read(C0672x.this.f4490m, 0, C0672x.this.f4490m.length);
            try {
                C0672x.this.f4484g.write(C0672x.this.f4490m);
                C0672x.this.f4491n += C0672x.this.f4490m.length;
                if (C0672x.this.f4487j != 16) {
                    while (i < C0672x.this.f4490m.length) {
                        if (C0672x.this.f4490m[i] > C0672x.this.f4481d) {
                            C0672x.this.f4481d = C0672x.this.f4490m[i];
                        }
                        i++;
                    }
                    return;
                }
                while (i < C0672x.this.f4490m.length / 2) {
                    int i2 = i * 2;
                    short m5118a = C0672x.this.m5118a(C0672x.this.f4490m[i2], C0672x.this.f4490m[i2 + 1]);
                    if (m5118a > C0672x.this.f4481d) {
                        C0672x.this.f4481d = m5118a;
                    }
                    i++;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.x$b */
    /* loaded from: classes.dex */
    public enum b {
        INITIALIZING,
        READY,
        RECORDING,
        ERROR,
        STOPPED
    }

    public C0672x(String str, int i, int i2, int i3, int i4) {
        this.f4478a = false;
        this.f4479b = null;
        this.f4480c = null;
        this.f4481d = 0;
        this.f4482e = null;
        try {
            if (str.equalsIgnoreCase("wav")) {
                this.f4478a = true;
                if (i4 == 2) {
                    this.f4487j = (short) 16;
                } else {
                    this.f4487j = (short) 8;
                }
                if (i3 == 2) {
                    this.f4485h = (short) 1;
                } else {
                    this.f4485h = (short) 2;
                }
                this.f4486i = i2;
                int i5 = (i2 * 120) / 1000;
                this.f4489l = i5;
                int i6 = (((i5 * 2) * this.f4487j) * this.f4485h) / 8;
                this.f4488k = i6;
                if (i6 < AudioRecord.getMinBufferSize(i2, i3, i4)) {
                    int minBufferSize = AudioRecord.getMinBufferSize(i2, i3, i4);
                    this.f4488k = minBufferSize;
                    this.f4489l = minBufferSize / (((this.f4487j * 2) * this.f4485h) / 8);
                }
                AudioRecord audioRecord = new AudioRecord(i, i2, i3, i4, this.f4488k);
                this.f4479b = audioRecord;
                if (audioRecord.getState() != 1) {
                    throw new Exception("AudioRecord initialization failed");
                }
                this.f4479b.setRecordPositionUpdateListener(this.f4492o);
                this.f4479b.setPositionNotificationPeriod(this.f4489l);
            } else {
                if (str.equalsIgnoreCase("mp4")) {
                    MediaRecorder mediaRecorder = new MediaRecorder();
                    this.f4480c = mediaRecorder;
                    mediaRecorder.setAudioSource(1);
                    this.f4480c.setOutputFormat(2);
                } else if (str.equalsIgnoreCase("amr")) {
                    MediaRecorder mediaRecorder2 = new MediaRecorder();
                    this.f4480c = mediaRecorder2;
                    mediaRecorder2.setAudioSource(1);
                    this.f4480c.setOutputFormat(3);
                } else {
                    MediaRecorder mediaRecorder3 = new MediaRecorder();
                    this.f4480c = mediaRecorder3;
                    mediaRecorder3.setAudioSource(1);
                    this.f4480c.setOutputFormat(1);
                }
                this.f4480c.setAudioEncoder(1);
            }
            this.f4481d = 0;
            this.f4482e = null;
            this.f4483f = b.INITIALIZING;
        } catch (Exception unused) {
            this.f4483f = b.ERROR;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public short m5118a(byte b2, byte b3) {
        return (short) (b2 | (b3 << 8));
    }

    /* renamed from: b */
    public static C0672x m5123b(String str) {
        C0672x c0672x;
        if (!str.equalsIgnoreCase("wav")) {
            if (!str.equalsIgnoreCase("mp4") && str.equalsIgnoreCase("amr")) {
                return new C0672x(str, 1, f4477p[0], 2, 2);
            }
            return new C0672x(str, 1, f4477p[0], 2, 2);
        }
        int i = 0;
        do {
            c0672x = new C0672x(str, 1, f4477p[i], 2, 2);
            i++;
        } while ((c0672x.m5128a() != b.INITIALIZING) & (i < f4477p.length));
        return c0672x;
    }

    /* renamed from: a */
    public b m5128a() {
        return this.f4483f;
    }

    /* renamed from: a */
    public void m5129a(String str) {
        try {
            if (this.f4483f == b.INITIALIZING) {
                this.f4482e = str;
                if (this.f4478a) {
                    return;
                }
                this.f4480c.setOutputFile(str);
            }
        } catch (Exception unused) {
            this.f4483f = b.ERROR;
        }
    }

    /* renamed from: b */
    public void m5130b() {
        b bVar;
        try {
            if (this.f4483f == b.INITIALIZING) {
                if (this.f4478a) {
                    if ((this.f4479b.getState() == 1) & (this.f4482e != null)) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f4482e, "rw");
                        this.f4484g = randomAccessFile;
                        randomAccessFile.setLength(0L);
                        this.f4484g.writeBytes("RIFF");
                        this.f4484g.writeInt(0);
                        this.f4484g.writeBytes("WAVE");
                        this.f4484g.writeBytes("fmt ");
                        this.f4484g.writeInt(Integer.reverseBytes(16));
                        this.f4484g.writeShort(Short.reverseBytes((short) 1));
                        this.f4484g.writeShort(Short.reverseBytes(this.f4485h));
                        this.f4484g.writeInt(Integer.reverseBytes(this.f4486i));
                        this.f4484g.writeInt(Integer.reverseBytes(((this.f4486i * this.f4487j) * this.f4485h) / 8));
                        this.f4484g.writeShort(Short.reverseBytes((short) ((this.f4485h * this.f4487j) / 8)));
                        this.f4484g.writeShort(Short.reverseBytes(this.f4487j));
                        this.f4484g.writeBytes("data");
                        this.f4484g.writeInt(0);
                        this.f4490m = new byte[((this.f4489l * this.f4487j) / 8) * this.f4485h];
                    }
                } else {
                    this.f4480c.prepare();
                }
                bVar = b.READY;
                this.f4483f = bVar;
            }
            m5131c();
            bVar = b.ERROR;
            this.f4483f = bVar;
        } catch (Exception unused) {
            this.f4483f = b.ERROR;
        }
    }

    /* renamed from: c */
    public void m5131c() {
        b bVar = this.f4483f;
        if (bVar == b.RECORDING) {
            m5133e();
        } else {
            if ((bVar == b.READY) & this.f4478a) {
                try {
                    this.f4484g.close();
                } catch (IOException unused) {
                }
                new File(this.f4482e).delete();
            }
        }
        if (this.f4478a) {
            AudioRecord audioRecord = this.f4479b;
            if (audioRecord != null) {
                audioRecord.release();
                return;
            }
            return;
        }
        MediaRecorder mediaRecorder = this.f4480c;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
    }

    /* renamed from: d */
    public void m5132d() {
        b bVar;
        if (this.f4483f == b.READY) {
            if (this.f4478a) {
                this.f4491n = 0;
                this.f4479b.startRecording();
                AudioRecord audioRecord = this.f4479b;
                byte[] bArr = this.f4490m;
                audioRecord.read(bArr, 0, bArr.length);
            } else {
                this.f4480c.start();
            }
            bVar = b.RECORDING;
        } else {
            bVar = b.ERROR;
        }
        this.f4483f = bVar;
    }

    /* renamed from: e */
    public void m5133e() {
        b bVar;
        if (this.f4483f == b.RECORDING) {
            if (this.f4478a) {
                this.f4479b.stop();
                try {
                    this.f4484g.seek(4L);
                    this.f4484g.writeInt(Integer.reverseBytes(this.f4491n + 36));
                    this.f4484g.seek(40L);
                    this.f4484g.writeInt(Integer.reverseBytes(this.f4491n));
                    this.f4484g.close();
                } catch (IOException unused) {
                    this.f4483f = b.ERROR;
                }
            } else {
                this.f4480c.stop();
            }
            bVar = b.STOPPED;
        } else {
            bVar = b.ERROR;
        }
        this.f4483f = bVar;
    }
}
