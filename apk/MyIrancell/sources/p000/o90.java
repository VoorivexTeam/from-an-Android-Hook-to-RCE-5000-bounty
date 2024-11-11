package p000;

/* loaded from: classes.dex */
public enum o90 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int httpCode;

    o90(int i) {
        this.httpCode = i;
    }

    public static o90 fromHttp2(int i) {
        for (o90 o90Var : values()) {
            if (o90Var.httpCode == i) {
                return o90Var;
            }
        }
        return null;
    }
}
