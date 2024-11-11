package p000;

import android.hardware.Camera;

/* renamed from: vw */
/* loaded from: classes.dex */
public final class C3374vw {
    /* renamed from: a */
    public static C3321uw m16058a(int i) {
        int i2;
        Camera.CameraInfo cameraInfo;
        Camera open;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return null;
        }
        boolean z = i >= 0;
        if (!z) {
            i2 = 0;
            while (true) {
                if (i2 >= numberOfCameras) {
                    cameraInfo = null;
                    break;
                }
                cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (EnumC3277tw.values()[cameraInfo.facing] == EnumC3277tw.BACK) {
                    break;
                }
                i2++;
            }
        } else {
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo2);
            cameraInfo = cameraInfo2;
            i2 = i;
        }
        if (i2 < numberOfCameras) {
            String str = "Opening camera #" + i2;
            open = Camera.open(i2);
        } else if (z) {
            String str2 = "Requested camera does not exist: " + i;
            open = null;
        } else {
            String str3 = "No camera facing " + EnumC3277tw.BACK + "; returning camera #0";
            open = Camera.open(0);
            cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
        }
        if (open == null) {
            return null;
        }
        return new C3321uw(i2, open, EnumC3277tw.values()[cameraInfo.facing], cameraInfo.orientation);
    }
}
