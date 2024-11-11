package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class ow {
    private final Context a;
    private int b;
    private int c;
    private Point d;
    private Point e;
    private Point f;
    private Point g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ow(Context context) {
        this.a = context;
    }

    private void a(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        a(parameters, rw.readPref(sharedPreferences) == rw.ON, z);
    }

    private void a(Camera.Parameters parameters, boolean z, boolean z2) {
        pw.b(parameters, z);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        if (z2 || defaultSharedPreferences.getBoolean("preferences_disable_exposure", true)) {
            return;
        }
        pw.a(parameters, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Point a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        a(parameters, z, false);
        camera.setParameters(parameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(uw uwVar) {
        int i;
        Point point;
        Camera.Parameters parameters = uwVar.a().getParameters();
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            i = 0;
        } else if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = 180;
        } else if (rotation == 3) {
            i = 270;
        } else {
            if (rotation % 90 != 0) {
                throw new IllegalArgumentException("Bad rotation: " + rotation);
            }
            i = (rotation + 360) % 360;
        }
        String str = "Display at: " + i;
        int c = uwVar.c();
        String str2 = "Camera at: " + c;
        if (uwVar.b() == tw.FRONT) {
            c = (360 - c) % 360;
            String str3 = "Front camera overriden to: " + c;
        }
        this.c = ((c + 360) - i) % 360;
        String str4 = "Final display orientation: " + this.c;
        this.b = uwVar.b() == tw.FRONT ? (360 - this.c) % 360 : this.c;
        String str5 = "Clockwise rotation from display to camera: " + this.b;
        Point point2 = new Point();
        defaultDisplay.getSize(point2);
        this.d = point2;
        String str6 = "Screen resolution in current orientation: " + this.d;
        this.e = pw.a(parameters, this.d);
        String str7 = "Camera resolution: " + this.e;
        this.f = pw.a(parameters, this.d);
        String str8 = "Best available preview size: " + this.f;
        Point point3 = this.d;
        boolean z = point3.x < point3.y;
        Point point4 = this.f;
        if (z == (point4.x < point4.y)) {
            point = this.f;
        } else {
            Point point5 = this.f;
            point = new Point(point5.y, point5.x);
        }
        this.g = point;
        String str9 = "Preview size on screen: " + this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(uw uwVar, boolean z) {
        Camera a = uwVar.a();
        Camera.Parameters parameters = a.getParameters();
        if (parameters == null) {
            return;
        }
        String str = "Initial camera parameters: " + parameters.flatten();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        a(parameters, defaultSharedPreferences, z);
        pw.a(parameters, defaultSharedPreferences.getBoolean("preferences_auto_focus", true), defaultSharedPreferences.getBoolean("preferences_disable_continuous_focus", true), z);
        if (!z) {
            if (defaultSharedPreferences.getBoolean("preferences_invert_scan", false)) {
                pw.c(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_barcode_scene_mode", true)) {
                pw.a(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_metering", true)) {
                pw.e(parameters);
                pw.b(parameters);
                pw.d(parameters);
            }
        }
        Point point = this.f;
        parameters.setPreviewSize(point.x, point.y);
        a.setParameters(parameters);
        a.setDisplayOrientation(this.c);
        Camera.Size previewSize = a.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.f;
            if (point2.x == previewSize.width && point2.y == previewSize.height) {
                return;
            }
            String str2 = "Camera said it supported preview size " + this.f.x + 'x' + this.f.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height;
            Point point3 = this.f;
            point3.x = previewSize.width;
            point3.y = previewSize.height;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Camera camera) {
        String flashMode;
        if (camera == null || camera.getParameters() == null || (flashMode = camera.getParameters().getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Point b() {
        return this.d;
    }
}
