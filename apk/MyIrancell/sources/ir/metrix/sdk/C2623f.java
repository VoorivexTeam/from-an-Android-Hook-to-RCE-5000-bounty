package ir.metrix.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.google.gson.annotations.SerializedName;

/* renamed from: ir.metrix.sdk.f */
/* loaded from: classes.dex */
class C2623f {

    /* renamed from: a */
    @SerializedName("connectionType")
    private String f10716a;

    /* renamed from: b */
    @SerializedName("wifiRouterBSSId")
    private String f10717b;

    /* renamed from: c */
    @SerializedName("networkType")
    private String f10718c;

    /* renamed from: d */
    @SerializedName("networkGeneration")
    private String f10719d;

    /* renamed from: e */
    @SerializedName("dataAvailability")
    private Boolean f10720e;

    /* renamed from: f */
    @SerializedName("gmsCid")
    private Integer f10721f;

    /* renamed from: g */
    @SerializedName("gmsLac")
    private Integer f10722g;

    /* renamed from: h */
    @SerializedName("mcc")
    private Integer f10723h;

    /* renamed from: i */
    @SerializedName("mnc")
    private Integer f10724i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(1:81)(2:10|(15:(2:13|(2:15|(1:17)(1:76))(1:78))(1:79)|18|19|20|21|22|23|24|25|28|31|32|(1:40)|42|(2:44|45)(2:47|48))(1:80))|20|21|22|23|24|25|28|31|32|(4:34|36|38|40)|42|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(5:2|3|4|5|6)|(1:81)(2:10|(15:(2:13|(2:15|(1:17)(1:76))(1:78))(1:79)|18|19|20|21|22|23|24|25|28|31|32|(1:40)|42|(2:44|45)(2:47|48))(1:80))|77|18|19|20|21|22|23|24|25|28|31|32|(4:34|36|38|40)|42|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:1|2|3|4|5|6|(1:81)(2:10|(15:(2:13|(2:15|(1:17)(1:76))(1:78))(1:79)|18|19|20|21|22|23|24|25|28|31|32|(1:40)|42|(2:44|45)(2:47|48))(1:80))|77|18|19|20|21|22|23|24|25|28|31|32|(4:34|36|38|40)|42|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        r8.f10723h = null;
        r8.f10724i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e2, code lost:
    
        r8.f10718c = null;
        r8.f10719d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0085, code lost:
    
        r8.f10717b = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:21:0x0087, B:42:0x0120, B:44:0x0126, B:47:0x013b, B:49:0x011c, B:71:0x00e2, B:23:0x008f, B:27:0x009b, B:28:0x00a6, B:30:0x00df, B:51:0x00ac, B:70:0x00a4, B:32:0x00e6, B:34:0x00ec, B:36:0x00f2, B:38:0x00f8, B:40:0x00fe), top: B:20:0x0087, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:21:0x0087, B:42:0x0120, B:44:0x0126, B:47:0x013b, B:49:0x011c, B:71:0x00e2, B:23:0x008f, B:27:0x009b, B:28:0x00a6, B:30:0x00df, B:51:0x00ac, B:70:0x00a4, B:32:0x00e6, B:34:0x00ec, B:36:0x00f2, B:38:0x00f8, B:40:0x00fe), top: B:20:0x0087, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a4 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x00e2, blocks: (B:23:0x008f, B:27:0x009b, B:28:0x00a6, B:30:0x00df, B:51:0x00ac, B:70:0x00a4), top: B:22:0x008f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2623f(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.C2623f.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private GsmCellLocation m12568a(Context context, TelephonyManager telephonyManager) {
        try {
            if (!C2611ac.m12534b(context) && !C2611ac.m12535c(context)) {
                return null;
            }
            return (GsmCellLocation) telephonyManager.getCellLocation();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    void m12569a(String str) {
        this.f10717b = C2617ai.m12554c(str);
    }
}
