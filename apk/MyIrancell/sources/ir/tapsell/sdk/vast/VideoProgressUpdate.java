package ir.tapsell.sdk.vast;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public final class VideoProgressUpdate implements NoProguard {
    public static final VideoProgressUpdate VIDEO_TIME_NOT_READY = new VideoProgressUpdate(-1, -1);
    private long currentTime;
    private long duration;

    public VideoProgressUpdate(long j, long j2) {
        this.currentTime = j;
        this.duration = j2;
    }

    public long getCurrentTime() {
        return this.currentTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public String toString() {
        long j = this.currentTime;
        long j2 = this.duration;
        StringBuilder sb = new StringBuilder(75);
        sb.append("VideoProgressUpdate [currentTime=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
