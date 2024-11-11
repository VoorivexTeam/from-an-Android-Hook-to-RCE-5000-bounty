package defpackage;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public class bk {
    static {
        a("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");
        a("UPC_A", "UPC_E", "EAN_8", "EAN_13", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");
        Collections.singleton("QR_CODE");
        Collections.singleton("DATA_MATRIX");
        Collections.singleton("com.google.zxing.client.android");
        a("com.google.zxing.client.android", "com.srowen.bs.android", "com.srowen.bs.android.simple");
    }

    public static ck a(int i, int i2, Intent intent) {
        if (i != 49374) {
            return null;
        }
        if (i2 != -1) {
            return new ck();
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
        return new ck(stringExtra, stringExtra2, byteArrayExtra, intExtra != Integer.MIN_VALUE ? Integer.valueOf(intExtra) : null, intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"));
    }

    private static Collection<String> a(String... strArr) {
        return Collections.unmodifiableCollection(Arrays.asList(strArr));
    }
}
