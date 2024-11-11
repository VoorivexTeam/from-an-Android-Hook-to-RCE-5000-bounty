package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class TapsellNativeVideoIconSet implements NoProguard {
    private int fullscreenIcon;
    private int playIcon;
    private int replayIcon;
    private int skipIcon;
    private int soundOffIcon;
    private int soundOnIcon;

    /* loaded from: classes.dex */
    public static class Builder implements NoProguard {
        private int fullscreenIcon;
        private int playIcon;
        private int replayIcon;
        private int skipIcon;
        private int soundOffIcon;
        private int soundOnIcon;

        public TapsellNativeVideoIconSet create() {
            return new TapsellNativeVideoIconSet(this.soundOffIcon, this.soundOnIcon, this.playIcon, this.replayIcon, this.fullscreenIcon, this.skipIcon);
        }

        public Builder setFullscreenIcon(int i) {
            this.fullscreenIcon = i;
            return this;
        }

        public Builder setPlayIcon(int i) {
            this.playIcon = i;
            return this;
        }

        public Builder setReplayIcon(int i) {
            this.replayIcon = i;
            return this;
        }

        public Builder setSkipIcon(int i) {
            this.skipIcon = i;
            return this;
        }

        public Builder setSoundOffIcon(int i) {
            this.soundOffIcon = i;
            return this;
        }

        public Builder setSoundOnIcon(int i) {
            this.soundOnIcon = i;
            return this;
        }
    }

    private TapsellNativeVideoIconSet(int i, int i2, int i3, int i4, int i5, int i6) {
        this.soundOffIcon = i;
        this.soundOnIcon = i2;
        this.playIcon = i3;
        this.replayIcon = i4;
        this.fullscreenIcon = i5;
        this.skipIcon = i6;
    }

    public int getFullscreenIcon() {
        return this.fullscreenIcon;
    }

    public int getPlayIcon() {
        return this.playIcon;
    }

    public int getReplayIcon() {
        return this.replayIcon;
    }

    public int getSkipIcon() {
        return this.skipIcon;
    }

    public int getSoundOffIcon() {
        return this.soundOffIcon;
    }

    public int getSoundOnIcon() {
        return this.soundOnIcon;
    }
}
