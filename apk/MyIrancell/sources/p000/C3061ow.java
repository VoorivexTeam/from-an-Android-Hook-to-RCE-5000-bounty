package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: ow */
/* loaded from: classes.dex */
final class C3061ow {

    /* renamed from: a */
    private final Context f12530a;

    /* renamed from: b */
    private int f12531b;

    /* renamed from: c */
    private int f12532c;

    /* renamed from: d */
    private Point f12533d;

    /* renamed from: e */
    private Point f12534e;

    /* renamed from: f */
    private Point f12535f;

    /* renamed from: g */
    private Point f12536g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3061ow(Context context) {
        this.f12530a = context;
    }

    /* renamed from: a */
    private void m14659a(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        m14660a(parameters, EnumC3181rw.readPref(sharedPreferences) == EnumC3181rw.ON, z);
    }

    /* renamed from: a */
    private void m14660a(Camera.Parameters parameters, boolean z, boolean z2) {
        C3100pw.m14836b(parameters, z);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f12530a);
        if (z2 || defaultSharedPreferences.getBoolean("preferences_disable_exposure", true)) {
            return;
        }
        C3100pw.m14833a(parameters, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Point m14661a() {
        return this.f12534e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14662a(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        m14660a(parameters, z, false);
        camera.setParameters(parameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14663a(C3321uw c3321uw) {
        int i;
        Point point;
        Camera.Parameters parameters = c3321uw.m15860a().getParameters();
        Display defaultDisplay = ((WindowManager) this.f12530a.getSystemService("window")).getDefaultDisplay();
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
        int m15862c = c3321uw.m15862c();
        String str2 = "Camera at: " + m15862c;
        if (c3321uw.m15861b() == EnumC3277tw.FRONT) {
            m15862c = (360 - m15862c) % 360;
            String str3 = "Front camera overriden to: " + m15862c;
        }
        this.f12532c = ((m15862c + 360) - i) % 360;
        String str4 = "Final display orientation: " + this.f12532c;
        this.f12531b = c3321uw.m15861b() == EnumC3277tw.FRONT ? (360 - this.f12532c) % 360 : this.f12532c;
        String str5 = "Clockwise rotation from display to camera: " + this.f12531b;
        Point point2 = new Point();
        defaultDisplay.getSize(point2);
        this.f12533d = point2;
        String str6 = "Screen resolution in current orientation: " + this.f12533d;
        this.f12534e = C3100pw.m14828a(parameters, this.f12533d);
        String str7 = "Camera resolution: " + this.f12534e;
        this.f12535f = C3100pw.m14828a(parameters, this.f12533d);
        String str8 = "Best available preview size: " + this.f12535f;
        Point point3 = this.f12533d;
        boolean z = point3.x < point3.y;
        Point point4 = this.f12535f;
        if (z == (point4.x < point4.y)) {
            point = this.f12535f;
        } else {
            Point point5 = this.f12535f;
            point = new Point(point5.y, point5.x);
        }
        this.f12536g = point;
        String str9 = "Preview size on screen: " + this.f12536g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14664a(C3321uw c3321uw, boolean z) {
        Camera m15860a = c3321uw.m15860a();
        Camera.Parameters parameters = m15860a.getParameters();
        if (parameters == null) {
            return;
        }
        String str = "Initial camera parameters: " + parameters.flatten();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f12530a);
        m14659a(parameters, defaultSharedPreferences, z);
        C3100pw.m14834a(parameters, defaultSharedPreferences.getBoolean("preferences_auto_focus", true), defaultSharedPreferences.getBoolean("preferences_disable_continuous_focus", true), z);
        if (!z) {
            if (defaultSharedPreferences.getBoolean("preferences_invert_scan", false)) {
                C3100pw.m14837c(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_barcode_scene_mode", true)) {
                C3100pw.m14832a(parameters);
            }
            if (!defaultSharedPreferences.getBoolean("preferences_disable_metering", true)) {
                C3100pw.m14839e(parameters);
                C3100pw.m14835b(parameters);
                C3100pw.m14838d(parameters);
            }
        }
        Point point = this.f12535f;
        parameters.setPreviewSize(point.x, point.y);
        m15860a.setParameters(parameters);
        m15860a.setDisplayOrientation(this.f12532c);
        Camera.Size previewSize = m15860a.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.f12535f;
            if (point2.x == previewSize.width && point2.y == previewSize.height) {
                return;
            }
            String str2 = "Camera said it supported preview size " + this.f12535f.x + 'x' + this.f12535f.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height;
            Point point3 = this.f12535f;
            point3.x = previewSize.width;
            point3.y = previewSize.height;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m14665a(Camera camera) {
        String flashMode;
        if (camera == null || camera.getParameters() == null || (flashMode = camera.getParameters().getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Point m14666b() {
        return this.f12533d;
    }
}
