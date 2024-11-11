package ir.tapsell.sdk.models.requestModels.userExtraInfo;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AppInfo implements Serializable {
    public static final int STATUS_INSTALLED = 1;
    public static final int STATUS_NOT_FOUND = -1;
    public static final int STATUS_REMOVED = 2;
    public static final int STATUS_VERSION_CHANGED = 3;

    @SerializedName("fit")
    private long firstInstalledTime;

    @SerializedName("lut")
    private long lastUpdateTime;

    @SerializedName("pName")
    private String packageName;

    @SerializedName("pVersion")
    private int packageVersion;

    @SerializedName("status")
    private int status;

    public AppInfo(String str, int i, int i2, long j, long j2) {
        this.packageName = str;
        this.packageVersion = i;
        this.status = i2;
        this.firstInstalledTime = j;
        this.lastUpdateTime = j2;
    }

    public long getFirstInstalledTime() {
        return this.firstInstalledTime;
    }

    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPackageVersion() {
        return this.packageVersion;
    }

    public int getStatus() {
        return this.status;
    }

    public void setFirstInstalledTime(long j) {
        this.firstInstalledTime = j;
    }

    public void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPackageVersion(int i) {
        this.packageVersion = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
