package ir.tapsell.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import defpackage.i50;

/* loaded from: classes.dex */
public class m {
    private static int a;
    private static int b;

    public static String a(String str) {
        if (!str.contains("id=")) {
            return str;
        }
        return "https://cafebazaar.ir/app/" + str.substring(str.indexOf("id=") + 3) + "/";
    }

    private static void a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void a(Context context, String str) {
        try {
            a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            i50.a("Can't start cta uri.");
            try {
                a(context, new Intent("android.intent.action.VIEW", Uri.parse(a(str))));
            } catch (Exception unused2) {
                i50.a("No browser found!");
            }
        }
    }

    public static boolean a(View view, Context context) {
        int[] iArr = {-1, -1};
        view.getLocationOnScreen(iArr);
        if (iArr[0] + view.getWidth() < 0 || iArr[1] + view.getHeight() < 0) {
            return false;
        }
        if (a == 0 || b == 0) {
            if (context == null || context.getSystemService("window") == null) {
                return false;
            }
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                a = point.x;
                b = point.y;
            } catch (Exception e) {
                i50.a(e.getMessage());
            }
        }
        return iArr[0] <= a && iArr[1] <= b;
    }
}
