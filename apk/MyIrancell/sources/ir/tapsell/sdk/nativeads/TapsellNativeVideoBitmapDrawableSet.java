package ir.tapsell.sdk.nativeads;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import ir.tapsell.sdk.NoProguard;
import p000.i50;

/* loaded from: classes.dex */
public class TapsellNativeVideoBitmapDrawableSet implements NoProguard {
    private BitmapDrawable fullscreenBitmapDrawable;
    private BitmapDrawable playBitmapDrawable;
    private BitmapDrawable replayBitmapDrawable;
    private BitmapDrawable skipBitmapDrawable;
    private BitmapDrawable soundOffBitmapDrawable;
    private BitmapDrawable soundOnBitmapDrawable;

    public TapsellNativeVideoBitmapDrawableSet(Context context, TapsellNativeVideoIconSet tapsellNativeVideoIconSet) {
        if (tapsellNativeVideoIconSet == null) {
            return;
        }
        if (tapsellNativeVideoIconSet.getSoundOffIcon() != 0) {
            checkSmallIconIsOk(context, tapsellNativeVideoIconSet.getSoundOffIcon());
            this.soundOffBitmapDrawable = getBitmapOfResource(context, tapsellNativeVideoIconSet.getSoundOffIcon());
        }
        if (tapsellNativeVideoIconSet.getSoundOnIcon() != 0) {
            checkSmallIconIsOk(context, tapsellNativeVideoIconSet.getSoundOnIcon());
            this.soundOnBitmapDrawable = getBitmapOfResource(context, tapsellNativeVideoIconSet.getSoundOnIcon());
        }
        if (tapsellNativeVideoIconSet.getFullscreenIcon() != 0) {
            checkSmallIconIsOk(context, tapsellNativeVideoIconSet.getFullscreenIcon());
            this.fullscreenBitmapDrawable = getBitmapOfResource(context, tapsellNativeVideoIconSet.getFullscreenIcon());
        }
        if (tapsellNativeVideoIconSet.getSkipIcon() != 0) {
            checkSmallIconIsOk(context, tapsellNativeVideoIconSet.getSkipIcon());
            this.skipBitmapDrawable = getBitmapOfResource(context, tapsellNativeVideoIconSet.getSkipIcon());
        }
        if (tapsellNativeVideoIconSet.getPlayIcon() != 0) {
            checkLargeIconIsOk(context, tapsellNativeVideoIconSet.getPlayIcon());
            this.playBitmapDrawable = getBitmapOfResource(context, tapsellNativeVideoIconSet.getPlayIcon());
        }
        if (tapsellNativeVideoIconSet.getReplayIcon() != 0) {
            checkLargeIconIsOk(context, tapsellNativeVideoIconSet.getReplayIcon());
            this.replayBitmapDrawable = getBitmapOfResource(context, tapsellNativeVideoIconSet.getReplayIcon());
        }
    }

    private void checkLargeIconIsOk(Context context, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > 128 || i3 > 128) {
            throw new RuntimeException("Icon is too large.");
        }
    }

    private void checkSmallIconIsOk(Context context, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > 64 || i3 > 64) {
            throw new RuntimeException("Icon is too large.");
        }
    }

    private BitmapDrawable getBitmapOfResource(Context context, int i) {
        if (i == 0) {
            return null;
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeResource(context.getResources(), i));
        } catch (Exception e) {
            i50.m12368a(e.getMessage());
            return null;
        }
    }

    public BitmapDrawable getFullscreenBitmapDrawable() {
        return this.fullscreenBitmapDrawable;
    }

    public BitmapDrawable getPlayBitmapDrawable() {
        return this.playBitmapDrawable;
    }

    public BitmapDrawable getReplayBitmapDrawable() {
        return this.replayBitmapDrawable;
    }

    public BitmapDrawable getSkipBitmapDrawable() {
        return this.skipBitmapDrawable;
    }

    public BitmapDrawable getSoundOffBitmapDrawable() {
        return this.soundOffBitmapDrawable;
    }

    public BitmapDrawable getSoundOnBitmapDrawable() {
        return this.soundOnBitmapDrawable;
    }
}
