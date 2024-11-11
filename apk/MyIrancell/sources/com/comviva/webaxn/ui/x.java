package com.comviva.webaxn.ui;

import android.media.AudioRecord;
import android.media.MediaRecorder;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class x {
    private static final int[] p = {8000, 11025, 22050, 44100};
    private boolean a;
    private AudioRecord b;
    private MediaRecorder c;
    private int d;
    private String e;
    private b f;
    private RandomAccessFile g;
    private short h;
    private int i;
    private short j;
    private int k;
    private int l;
    private byte[] m;
    private int n;
    private AudioRecord.OnRecordPositionUpdateListener o = new a();

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
            x.this.b.read(x.this.m, 0, x.this.m.length);
            try {
                x.this.g.write(x.this.m);
                x.this.n += x.this.m.length;
                if (x.this.j != 16) {
                    while (i < x.this.m.length) {
                        if (x.this.m[i] > x.this.d) {
                            x.this.d = x.this.m[i];
                        }
                        i++;
                    }
                    return;
                }
                while (i < x.this.m.length / 2) {
                    int i2 = i * 2;
                    short a = x.this.a(x.this.m[i2], x.this.m[i2 + 1]);
                    if (a > x.this.d) {
                        x.this.d = a;
                    }
                    i++;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        INITIALIZING,
        READY,
        RECORDING,
        ERROR,
        STOPPED
    }

    public x(String str, int i, int i2, int i3, int i4) {
        this.a = false;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = null;
        try {
            if (str.equalsIgnoreCase("wav")) {
                this.a = true;
                if (i4 == 2) {
                    this.j = (short) 16;
                } else {
                    this.j = (short) 8;
                }
                if (i3 == 2) {
                    this.h = (short) 1;
                } else {
                    this.h = (short) 2;
                }
                this.i = i2;
                int i5 = (i2 * 120) / 1000;
                this.l = i5;
                int i6 = (((i5 * 2) * this.j) * this.h) / 8;
                this.k = i6;
                if (i6 < AudioRecord.getMinBufferSize(i2, i3, i4)) {
                    int minBufferSize = AudioRecord.getMinBufferSize(i2, i3, i4);
                    this.k = minBufferSize;
                    this.l = minBufferSize / (((this.j * 2) * this.h) / 8);
                }
                AudioRecord audioRecord = new AudioRecord(i, i2, i3, i4, this.k);
                this.b = audioRecord;
                if (audioRecord.getState() != 1) {
                    throw new Exception("AudioRecord initialization failed");
                }
                this.b.setRecordPositionUpdateListener(this.o);
                this.b.setPositionNotificationPeriod(this.l);
            } else {
                if (str.equalsIgnoreCase("mp4")) {
                    MediaRecorder mediaRecorder = new MediaRecorder();
                    this.c = mediaRecorder;
                    mediaRecorder.setAudioSource(1);
                    this.c.setOutputFormat(2);
                } else if (str.equalsIgnoreCase("amr")) {
                    MediaRecorder mediaRecorder2 = new MediaRecorder();
                    this.c = mediaRecorder2;
                    mediaRecorder2.setAudioSource(1);
                    this.c.setOutputFormat(3);
                } else {
                    MediaRecorder mediaRecorder3 = new MediaRecorder();
                    this.c = mediaRecorder3;
                    mediaRecorder3.setAudioSource(1);
                    this.c.setOutputFormat(1);
                }
                this.c.setAudioEncoder(1);
            }
            this.d = 0;
            this.e = null;
            this.f = b.INITIALIZING;
        } catch (Exception unused) {
            this.f = b.ERROR;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public short a(byte b2, byte b3) {
        return (short) (b2 | (b3 << 8));
    }

    public static x b(String str) {
        x xVar;
        if (!str.equalsIgnoreCase("wav")) {
            if (!str.equalsIgnoreCase("mp4") && str.equalsIgnoreCase("amr")) {
                return new x(str, 1, p[0], 2, 2);
            }
            return new x(str, 1, p[0], 2, 2);
        }
        int i = 0;
        do {
            xVar = new x(str, 1, p[i], 2, 2);
            i++;
        } while ((xVar.a() != b.INITIALIZING) & (i < p.length));
        return xVar;
    }

    public b a() {
        return this.f;
    }

    public void a(String str) {
        try {
            if (this.f == b.INITIALIZING) {
                this.e = str;
                if (this.a) {
                    return;
                }
                this.c.setOutputFile(str);
            }
        } catch (Exception unused) {
            this.f = b.ERROR;
        }
    }

    public void b() {
        b bVar;
        try {
            if (this.f == b.INITIALIZING) {
                if (this.a) {
                    if ((this.b.getState() == 1) & (this.e != null)) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(this.e, "rw");
                        this.g = randomAccessFile;
                        randomAccessFile.setLength(0L);
                        this.g.writeBytes("RIFF");
                        this.g.writeInt(0);
                        this.g.writeBytes("WAVE");
                        this.g.writeBytes("fmt ");
                        this.g.writeInt(Integer.reverseBytes(16));
                        this.g.writeShort(Short.reverseBytes((short) 1));
                        this.g.writeShort(Short.reverseBytes(this.h));
                        this.g.writeInt(Integer.reverseBytes(this.i));
                        this.g.writeInt(Integer.reverseBytes(((this.i * this.j) * this.h) / 8));
                        this.g.writeShort(Short.reverseBytes((short) ((this.h * this.j) / 8)));
                        this.g.writeShort(Short.reverseBytes(this.j));
                        this.g.writeBytes("data");
                        this.g.writeInt(0);
                        this.m = new byte[((this.l * this.j) / 8) * this.h];
                    }
                } else {
                    this.c.prepare();
                }
                bVar = b.READY;
                this.f = bVar;
            }
            c();
            bVar = b.ERROR;
            this.f = bVar;
        } catch (Exception unused) {
            this.f = b.ERROR;
        }
    }

    public void c() {
        b bVar = this.f;
        if (bVar == b.RECORDING) {
            e();
        } else {
            if ((bVar == b.READY) & this.a) {
                try {
                    this.g.close();
                } catch (IOException unused) {
                }
                new File(this.e).delete();
            }
        }
        if (this.a) {
            AudioRecord audioRecord = this.b;
            if (audioRecord != null) {
                audioRecord.release();
                return;
            }
            return;
        }
        MediaRecorder mediaRecorder = this.c;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
    }

    public void d() {
        b bVar;
        if (this.f == b.READY) {
            if (this.a) {
                this.n = 0;
                this.b.startRecording();
                AudioRecord audioRecord = this.b;
                byte[] bArr = this.m;
                audioRecord.read(bArr, 0, bArr.length);
            } else {
                this.c.start();
            }
            bVar = b.RECORDING;
        } else {
            bVar = b.ERROR;
        }
        this.f = bVar;
    }

    public void e() {
        b bVar;
        if (this.f == b.RECORDING) {
            if (this.a) {
                this.b.stop();
                try {
                    this.g.seek(4L);
                    this.g.writeInt(Integer.reverseBytes(this.n + 36));
                    this.g.seek(40L);
                    this.g.writeInt(Integer.reverseBytes(this.n));
                    this.g.close();
                } catch (IOException unused) {
                    this.f = b.ERROR;
                }
            } else {
                this.c.stop();
            }
            bVar = b.STOPPED;
        } else {
            bVar = b.ERROR;
        }
        this.f = bVar;
    }
}
