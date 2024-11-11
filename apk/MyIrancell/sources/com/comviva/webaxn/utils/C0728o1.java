package com.comviva.webaxn.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.Toast;

/* renamed from: com.comviva.webaxn.utils.o1 */
/* loaded from: classes.dex */
public class C0728o1 implements SensorEventListener {

    /* renamed from: b */
    private SensorManager f5058b;

    /* renamed from: c */
    private Sensor f5059c;

    /* renamed from: d */
    private a f5060d;

    /* renamed from: e */
    private Context f5061e;

    /* renamed from: g */
    private long f5063g;

    /* renamed from: a */
    private boolean f5057a = false;

    /* renamed from: f */
    private int f5062f = 0;

    /* renamed from: com.comviva.webaxn.utils.o1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo4833a(int i);
    }

    public C0728o1(Context context) {
        this.f5061e = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f5058b = sensorManager;
        this.f5059c = sensorManager.getDefaultSensor(1);
        m5937c();
    }

    /* renamed from: a */
    public void m5934a() {
        m5936b();
        this.f5058b = null;
        this.f5059c = null;
        this.f5060d = null;
    }

    /* renamed from: a */
    public void m5935a(a aVar) {
        this.f5060d = aVar;
    }

    /* renamed from: b */
    public void m5936b() {
        SensorManager sensorManager = this.f5058b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    /* renamed from: c */
    public void m5937c() {
        if (this.f5058b == null && this.f5057a) {
            Toast.makeText(this.f5061e, "Sensors not supported", 0).show();
        }
        if (this.f5058b.registerListener(this, this.f5059c, 3)) {
            return;
        }
        this.f5058b.unregisterListener(this);
        if (this.f5057a) {
            Toast.makeText(this.f5061e, "Accelerometer not supported", 0).show();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f5060d != null) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) > 2.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f5063g;
                if (500 + j > currentTimeMillis) {
                    return;
                }
                if (j + 3000 < currentTimeMillis) {
                    this.f5062f = 0;
                }
                this.f5063g = currentTimeMillis;
                int i = this.f5062f + 1;
                this.f5062f = i;
                this.f5060d.mo4833a(i);
            }
        }
    }
}
