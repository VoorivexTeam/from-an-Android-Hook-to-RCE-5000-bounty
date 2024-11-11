package com.comviva.webaxn.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.Toast;

/* loaded from: classes.dex */
public class n1 implements SensorEventListener {
    public SensorManager a;
    public Context b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public float h;
    public float i;
    public float j;

    public void a() {
        if (this.c == null || this.d == null) {
            return;
        }
        if (this.e == null) {
            this.e = new float[9];
        }
        if (this.f == null) {
            this.f = new float[9];
        }
        if (SensorManager.getRotationMatrix(this.e, this.f, this.c, this.d)) {
            if (this.g == null) {
                this.g = new float[3];
            }
            float[] orientation = SensorManager.getOrientation(this.e, this.g);
            this.g = orientation;
            if (orientation != null) {
                this.h = orientation[0];
                this.i = orientation[1];
                this.j = orientation[2];
                if (r0.a(this.b).b() != null) {
                    r0.a(this.b).a(this.g);
                }
            }
        } else {
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
        }
        this.g = null;
        this.e = null;
        this.f = null;
    }

    public void a(Context context, int i) {
        this.b = context;
        if (this.a == null) {
            this.a = (SensorManager) context.getSystemService("sensor");
        }
        boolean z = true;
        Sensor defaultSensor = this.a.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.a.registerListener(this, defaultSensor, i);
        } else {
            z = false;
        }
        Sensor defaultSensor2 = this.a.getDefaultSensor(2);
        if (!z || defaultSensor2 == null) {
            Toast.makeText(this.b, "This device does not support Sensors to calculate azimuth,pitch and roll..", 0).show();
        } else {
            this.a.registerListener(this, defaultSensor2, i);
        }
    }

    public String b() {
        return String.valueOf(this.h);
    }

    public String c() {
        return String.valueOf(this.i);
    }

    public String d() {
        return String.valueOf(this.j);
    }

    public void e() {
        this.g = null;
        this.d = null;
        this.c = null;
        this.a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (this.c == null) {
                this.c = new float[3];
            }
            this.c = sensorEvent.values;
        } else if (type == 2) {
            if (this.d == null) {
                this.d = new float[3];
            }
            this.d = sensorEvent.values;
        }
        a();
    }
}
