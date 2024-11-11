package com.google.android.gms.location;

import java.util.Comparator;

/* loaded from: classes.dex */
final class x implements Comparator<DetectedActivity> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        int compareTo = Integer.valueOf(detectedActivity4.j()).compareTo(Integer.valueOf(detectedActivity3.j()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity3.k()).compareTo(Integer.valueOf(detectedActivity4.k())) : compareTo;
    }
}
