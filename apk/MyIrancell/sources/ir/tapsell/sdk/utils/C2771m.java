package ir.tapsell.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import p000.i50;

/* renamed from: ir.tapsell.sdk.utils.m */
/* loaded from: classes.dex */
public class C2771m {

    /* renamed from: a */
    private static int f11281a;

    /* renamed from: b */
    private static int f11282b;

    /* renamed from: a */
    public static String m13176a(String str) {
        if (!str.contains("id=")) {
            return str;
        }
        return "https://cafebazaar.ir/app/" + str.substring(str.indexOf("id=") + 3) + "/";
    }

    /* renamed from: a */
    private static void m13177a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m13178a(Context context, String str) {
        try {
            m13177a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            i50.m12368a("Can't start cta uri.");
            try {
                m13177a(context, new Intent("android.intent.action.VIEW", Uri.parse(m13176a(str))));
            } catch (Exception unused2) {
                i50.m12368a("No browser found!");
            }
        }
    }

    /* renamed from: a */
    public static boolean m13179a(View view, Context context) {
        int[] iArr = {-1, -1};
        view.getLocationOnScreen(iArr);
        if (iArr[0] + view.getWidth() < 0 || iArr[1] + view.getHeight() < 0) {
            return false;
        }
        if (f11281a == 0 || f11282b == 0) {
            if (context == null || context.getSystemService("window") == null) {
                return false;
            }
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f11281a = point.x;
                f11282b = point.y;
            } catch (Exception e) {
                i50.m12368a(e.getMessage());
            }
        }
        return iArr[0] <= f11281a && iArr[1] <= f11282b;
    }
}
