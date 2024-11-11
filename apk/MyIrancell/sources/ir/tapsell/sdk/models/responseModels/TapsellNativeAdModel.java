package ir.tapsell.sdk.models.responseModels;

import java.io.Serializable;
import p000.a70;

/* loaded from: classes.dex */
public abstract class TapsellNativeAdModel<T extends a70> implements Serializable {
    protected boolean isFilledStateReported = false;
    protected boolean isDoingStateReported = false;
    protected boolean isDoneStateReported = false;
    protected boolean isClickedReported = false;

    public abstract T getAdSuggestion();

    public boolean isClickedReported() {
        return this.isClickedReported;
    }

    public boolean isDoingStateReported() {
        return this.isDoingStateReported;
    }

    public boolean isDoneStateReported() {
        return this.isDoneStateReported;
    }

    public boolean isFilledStateReported() {
        return this.isFilledStateReported;
    }

    public void setClickedReported(boolean z) {
        this.isClickedReported = z;
    }

    public void setDoingStateReported(boolean z) {
        this.isDoingStateReported = z;
    }

    public void setDoneStateReported(boolean z) {
        this.isDoneStateReported = z;
    }

    public void setFilledStateReported(boolean z) {
        this.isFilledStateReported = z;
    }
}
