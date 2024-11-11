package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import p000.C3142qw;
import p000.EnumC3181rw;

/* renamed from: com.google.zxing.client.android.a */
/* loaded from: classes.dex */
final class C2246a implements SensorEventListener {

    /* renamed from: a */
    private final Context f9077a;

    /* renamed from: b */
    private C3142qw f9078b;

    /* renamed from: c */
    private Sensor f9079c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2246a(Context context) {
        this.f9077a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10840a() {
        if (this.f9079c != null) {
            ((SensorManager) this.f9077a.getSystemService("sensor")).unregisterListener(this);
            this.f9078b = null;
            this.f9079c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10841a(C3142qw c3142qw) {
        this.f9078b = c3142qw;
        if (EnumC3181rw.readPref(PreferenceManager.getDefaultSharedPreferences(this.f9077a)) == EnumC3181rw.AUTO) {
            SensorManager sensorManager = (SensorManager) this.f9077a.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f9079c = defaultSensor;
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
        C3142qw c3142qw = this.f9078b;
        if (c3142qw != null) {
            if (f <= 45.0f) {
                c3142qw.m15142a(true);
            } else if (f >= 450.0f) {
                c3142qw.m15142a(false);
            }
        }
    }
}
