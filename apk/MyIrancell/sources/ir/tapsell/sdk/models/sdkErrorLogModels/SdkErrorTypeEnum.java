package ir.tapsell.sdk.models.sdkErrorLogModels;

/* loaded from: classes.dex */
public enum SdkErrorTypeEnum {
    TAPSELL_STANDARD("tapsell_standard"),
    TAPSELL_VIDEO("tapsell_video"),
    TAPSELL_BANNER("tapsell_banner"),
    TAPSELL_VAST("tapsell_vast"),
    TAPSELL_E_ERROR("tapsell_e_error");

    private final String name;

    SdkErrorTypeEnum(String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
