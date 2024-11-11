package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.x */
/* loaded from: classes.dex */
final class C1629x implements Comparator<DetectedActivity> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        int compareTo = Integer.valueOf(detectedActivity4.m8943j()).compareTo(Integer.valueOf(detectedActivity3.m8943j()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity3.m8944k()).compareTo(Integer.valueOf(detectedActivity4.m8944k())) : compareTo;
    }
}
