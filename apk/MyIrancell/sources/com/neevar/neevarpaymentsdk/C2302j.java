package com.neevar.neevarpaymentsdk;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.neevar.neevarpaymentsdk.j */
/* loaded from: classes.dex */
class C2302j {
    /* renamed from: a */
    public static String m11007a(long j) {
        return NumberFormat.getNumberInstance(Locale.US).format(j);
    }

    /* renamed from: a */
    public static void m11008a(Context context, String str, Typeface typeface) {
        Toast makeText = Toast.makeText(context, str, 0);
        TextView textView = (TextView) ((LinearLayout) makeText.getView()).getChildAt(0);
        textView.setGravity(17);
        textView.setTypeface(typeface);
        makeText.show();
    }

    /* renamed from: a */
    public static boolean m11009a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
