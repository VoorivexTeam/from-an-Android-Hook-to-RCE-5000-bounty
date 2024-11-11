package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class TapsellNativeVideoAdConfig implements NoProguard {
    private boolean autoStartVideo = true;
    private boolean fullscreenBtnEnabled = true;
    private boolean muteVideoBtnEnabled = true;
    private boolean muteVideo = false;

    public boolean isAutoStartVideo() {
        return this.autoStartVideo;
    }

    public boolean isFullscreenBtnEnabled() {
        return this.fullscreenBtnEnabled;
    }

    public boolean isMuteVideo() {
        return this.muteVideo;
    }

    public boolean isMuteVideoBtnEnabled() {
        return this.muteVideoBtnEnabled;
    }

    public void setAutoStartVideo(boolean z) {
        this.autoStartVideo = z;
    }

    public void setFullscreenBtnEnabled(boolean z) {
        this.fullscreenBtnEnabled = z;
    }

    public void setMuteVideo(boolean z) {
        this.muteVideo = z;
    }

    public void setMuteVideoBtnEnabled(boolean z) {
        this.muteVideoBtnEnabled = z;
    }
}
