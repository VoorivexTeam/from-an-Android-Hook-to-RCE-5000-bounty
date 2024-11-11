package com.comviva.webaxn.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.Toast;

/* loaded from: classes.dex */
public class o1 implements SensorEventListener {
    private SensorManager b;
    private Sensor c;
    private a d;
    private Context e;
    private long g;
    private boolean a = false;
    private int f = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public o1(Context context) {
        this.e = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        this.c = sensorManager.getDefaultSensor(1);
        c();
    }

    public void a() {
        b();
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void b() {
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public void c() {
        if (this.b == null && this.a) {
            Toast.makeText(this.e, "Sensors not supported", 0).show();
        }
        if (this.b.registerListener(this, this.c, 3)) {
            return;
        }
        this.b.unregisterListener(this);
        if (this.a) {
            Toast.makeText(this.e, "Accelerometer not supported", 0).show();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.d != null) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) > 2.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.g;
                if (500 + j > currentTimeMillis) {
                    return;
                }
                if (j + 3000 < currentTimeMillis) {
                    this.f = 0;
                }
                this.g = currentTimeMillis;
                int i = this.f + 1;
                this.f = i;
                this.d.a(i);
            }
        }
    }
}
