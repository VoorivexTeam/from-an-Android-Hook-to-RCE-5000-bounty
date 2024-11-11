package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import defpackage.qw;
import defpackage.rw;

/* loaded from: classes.dex */
final class a implements SensorEventListener {
    private final Context a;
    private qw b;
    private Sensor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.c != null) {
            ((SensorManager) this.a.getSystemService("sensor")).unregisterListener(this);
            this.b = null;
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(qw qwVar) {
        this.b = qwVar;
        if (rw.readPref(PreferenceManager.getDefaultSharedPreferences(this.a)) == rw.AUTO) {
            SensorManager sensorManager = (SensorManager) this.a.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        qw qwVar = this.b;
        if (qwVar != null) {
            if (f <= 45.0f) {
                qwVar.a(true);
            } else if (f >= 450.0f) {
                qwVar.a(false);
            }
        }
    }
}
