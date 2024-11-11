package p000;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bk */
/* loaded from: classes.dex */
public class C0483bk {
    static {
        m3414a("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");
        m3414a("UPC_A", "UPC_E", "EAN_8", "EAN_13", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");
        Collections.singleton("QR_CODE");
        Collections.singleton("DATA_MATRIX");
        Collections.singleton("com.google.zxing.client.android");
        m3414a("com.google.zxing.client.android", "com.srowen.bs.android", "com.srowen.bs.android.simple");
    }

    /* renamed from: a */
    public static C0525ck m3413a(int i, int i2, Intent intent) {
        if (i != 49374) {
            return null;
        }
        if (i2 != -1) {
            return new C0525ck();
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
        return new C0525ck(stringExtra, stringExtra2, byteArrayExtra, intExtra != Integer.MIN_VALUE ? Integer.valueOf(intExtra) : null, intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"));
    }

    /* renamed from: a */
    private static Collection<String> m3414a(String... strArr) {
        return Collections.unmodifiableCollection(Arrays.asList(strArr));
    }
}
