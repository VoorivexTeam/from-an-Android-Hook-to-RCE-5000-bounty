package ir.tapsell.sdk.vast;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public interface VideoAdPlayer extends NoProguard {

    /* loaded from: classes.dex */
    public interface VideoAdPlayerCallback extends NoProguard {
        void onEnded();

        void onError();

        void onLoaded();

        void onPause();

        void onPlay();

        void onResume();

        void onVolumeChanged(int i);
    }

    void addCallback(VideoAdPlayerCallback videoAdPlayerCallback);

    VideoProgressUpdate getAdProgress();

    void loadAd(String str);

    void pauseAd();

    void playAd();

    void removeCallback(VideoAdPlayerCallback videoAdPlayerCallback);

    void resumeAd();

    void stopAd();
}
