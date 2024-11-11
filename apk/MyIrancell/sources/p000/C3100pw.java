package p000;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@TargetApi(15)
/* renamed from: pw */
/* loaded from: classes.dex */
public final class C3100pw {

    /* renamed from: pw$a */
    /* loaded from: classes.dex */
    static class a implements Comparator<Camera.Size> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    static {
        Pattern.compile(";");
    }

    /* renamed from: a */
    public static Point m14828a(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new a());
        if (Log.isLoggable("CameraConfiguration", 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            String str = "Supported preview sizes: " + ((Object) sb);
        }
        double d = point.x;
        double d2 = point.y;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Camera.Size size2 = (Camera.Size) arrayList.get(0);
                    Point point2 = new Point(size2.width, size2.height);
                    String str2 = "Using largest suitable preview size: " + point2;
                    return point2;
                }
                Camera.Size previewSize2 = parameters.getPreviewSize();
                if (previewSize2 == null) {
                    throw new IllegalStateException("Parameters contained no preview size!");
                }
                Point point3 = new Point(previewSize2.width, previewSize2.height);
                String str3 = "No suitable preview sizes, using default: " + point3;
                return point3;
            }
            Camera.Size size3 = (Camera.Size) it.next();
            int i = size3.width;
            int i2 = size3.height;
            if (i * i2 >= 153600) {
                boolean z = i < i2;
                int i3 = z ? i2 : i;
                int i4 = z ? i : i2;
                double d4 = i3;
                double d5 = i4;
                Double.isNaN(d4);
                Double.isNaN(d5);
                if (Math.abs((d4 / d5) - d3) <= 0.15d) {
                    if (i3 == point.x && i4 == point.y) {
                        Point point4 = new Point(i, i2);
                        String str4 = "Found preview size exactly matching screen size: " + point4;
                        return point4;
                    }
                }
            }
            it.remove();
        }
    }

    /* renamed from: a */
    private static String m14829a(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m14830a(String str, Collection<String> collection, String... strArr) {
        String str2 = "Requesting " + str + " value from among: " + Arrays.toString(strArr);
        String str3 = "Supported " + str + " values: " + collection;
        if (collection == null) {
            return null;
        }
        for (String str4 : strArr) {
            if (collection.contains(str4)) {
                String str5 = "Can set " + str + " to: " + str4;
                return str4;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static List<Camera.Area> m14831a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: a */
    public static void m14832a(Camera.Parameters parameters) {
        String m14830a;
        if ("barcode".equals(parameters.getSceneMode()) || (m14830a = m14830a("scene mode", parameters.getSupportedSceneModes(), "barcode")) == null) {
            return;
        }
        parameters.setSceneMode(m14830a);
    }

    /* renamed from: a */
    public static void m14833a(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            return;
        }
        if (exposureCompensationStep > 0.0f) {
            int round = Math.round((z ? 0.0f : 1.5f) / exposureCompensationStep);
            float f = exposureCompensationStep * round;
            int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
            if (parameters.getExposureCompensation() == max) {
                String str = "Exposure compensation already set to " + max + " / " + f;
                return;
            }
            String str2 = "Setting exposure compensation to " + max + " / " + f;
            parameters.setExposureCompensation(max);
        }
    }

    /* renamed from: a */
    public static void m14834a(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String m14830a = z ? (z3 || z2) ? m14830a("focus mode", supportedFocusModes, "auto") : m14830a("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : null;
        if (!z3 && m14830a == null) {
            m14830a = m14830a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (m14830a != null) {
            if (!m14830a.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(m14830a);
                return;
            }
            String str = "Focus mode already set to " + m14830a;
        }
    }

    /* renamed from: b */
    public static void m14835b(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            String str = "Old focus areas: " + m14829a(parameters.getFocusAreas());
            List<Camera.Area> m14831a = m14831a(400);
            String str2 = "Setting focus area to : " + m14829a(m14831a);
            parameters.setFocusAreas(m14831a);
        }
    }

    /* renamed from: b */
    public static void m14836b(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String m14830a = z ? m14830a("flash mode", supportedFlashModes, "torch", "on") : m14830a("flash mode", supportedFlashModes, "off");
        if (m14830a != null) {
            if (m14830a.equals(parameters.getFlashMode())) {
                String str = "Flash mode already set to " + m14830a;
                return;
            }
            String str2 = "Setting flash mode to " + m14830a;
            parameters.setFlashMode(m14830a);
        }
    }

    /* renamed from: c */
    public static void m14837c(Camera.Parameters parameters) {
        String m14830a;
        if ("negative".equals(parameters.getColorEffect()) || (m14830a = m14830a("color effect", parameters.getSupportedColorEffects(), "negative")) == null) {
            return;
        }
        parameters.setColorEffect(m14830a);
    }

    /* renamed from: d */
    public static void m14838d(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            String str = "Old metering areas: " + parameters.getMeteringAreas();
            List<Camera.Area> m14831a = m14831a(400);
            String str2 = "Setting metering area to : " + m14829a(m14831a);
            parameters.setMeteringAreas(m14831a);
        }
    }

    /* renamed from: e */
    public static void m14839e(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported() || parameters.getVideoStabilization()) {
            return;
        }
        parameters.setVideoStabilization(true);
    }
}
