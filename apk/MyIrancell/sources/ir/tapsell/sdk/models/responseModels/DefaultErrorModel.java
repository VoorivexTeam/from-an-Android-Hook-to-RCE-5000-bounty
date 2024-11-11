package ir.tapsell.sdk.models.responseModels;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class DefaultErrorModel implements NoProguard {
    String error;
    String message;
    String path;
    int status;
    double timestamp;

    public String getMessage() {
        return this.message;
    }
}
