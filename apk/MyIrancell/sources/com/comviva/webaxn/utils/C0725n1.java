package com.comviva.webaxn.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.Toast;

/* renamed from: com.comviva.webaxn.utils.n1 */
/* loaded from: classes.dex */
public class C0725n1 implements SensorEventListener {

    /* renamed from: a */
    public SensorManager f5030a;

    /* renamed from: b */
    public Context f5031b;

    /* renamed from: c */
    public float[] f5032c;

    /* renamed from: d */
    public float[] f5033d;

    /* renamed from: e */
    public float[] f5034e;

    /* renamed from: f */
    public float[] f5035f;

    /* renamed from: g */
    public float[] f5036g;

    /* renamed from: h */
    public float f5037h;

    /* renamed from: i */
    public float f5038i;

    /* renamed from: j */
    public float f5039j;

    /* renamed from: a */
    public void m5916a() {
        if (this.f5032c == null || this.f5033d == null) {
            return;
        }
        if (this.f5034e == null) {
            this.f5034e = new float[9];
        }
        if (this.f5035f == null) {
            this.f5035f = new float[9];
        }
        if (SensorManager.getRotationMatrix(this.f5034e, this.f5035f, this.f5032c, this.f5033d)) {
            if (this.f5036g == null) {
                this.f5036g = new float[3];
            }
            float[] orientation = SensorManager.getOrientation(this.f5034e, this.f5036g);
            this.f5036g = orientation;
            if (orientation != null) {
                this.f5037h = orientation[0];
                this.f5038i = orientation[1];
                this.f5039j = orientation[2];
                if (C0736r0.m6004a(this.f5031b).m6009b() != null) {
                    C0736r0.m6004a(this.f5031b).m6008a(this.f5036g);
                }
            }
        } else {
            this.f5037h = 0.0f;
            this.f5038i = 0.0f;
            this.f5039j = 0.0f;
        }
        this.f5036g = null;
        this.f5034e = null;
        this.f5035f = null;
    }

    /* renamed from: a */
    public void m5917a(Context context, int i) {
        this.f5031b = context;
        if (this.f5030a == null) {
            this.f5030a = (SensorManager) context.getSystemService("sensor");
        }
        boolean z = true;
        Sensor defaultSensor = this.f5030a.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.f5030a.registerListener(this, defaultSensor, i);
        } else {
            z = false;
        }
        Sensor defaultSensor2 = this.f5030a.getDefaultSensor(2);
        if (!z || defaultSensor2 == null) {
            Toast.makeText(this.f5031b, "This device does not support Sensors to calculate azimuth,pitch and roll..", 0).show();
        } else {
            this.f5030a.registerListener(this, defaultSensor2, i);
        }
    }

    /* renamed from: b */
    public String m5918b() {
        return String.valueOf(this.f5037h);
    }

    /* renamed from: c */
    public String m5919c() {
        return String.valueOf(this.f5038i);
    }

    /* renamed from: d */
    public String m5920d() {
        return String.valueOf(this.f5039j);
    }

    /* renamed from: e */
    public void m5921e() {
        this.f5036g = null;
        this.f5033d = null;
        this.f5032c = null;
        this.f5030a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (this.f5032c == null) {
                this.f5032c = new float[3];
            }
            this.f5032c = sensorEvent.values;
        } else if (type == 2) {
            if (this.f5033d == null) {
                this.f5033d = new float[3];
            }
            this.f5033d = sensorEvent.values;
        }
        m5916a();
    }
}
