package ir.tapsell.sdk;

import android.content.Context;

/* loaded from: classes.dex */
public class TapsellConfiguration implements NoProguard {

    @Deprecated
    public static final int PERMISSION_HANDLER_AUTO = 1;

    @Deprecated
    public static final int PERMISSION_HANDLER_AUTO_INSIST = 2;

    @Deprecated
    public static final int PERMISSION_HANDLER_DISABLED = 0;
    private boolean isDebugMode;
    private int maxAllowedBandwidthUsage = 0;
    private int maxAllowedBandwidthUsagePercentage = 0;
    private int permissionHandlerMode;

    public TapsellConfiguration(Context context) {
        this.isDebugMode = false;
        this.permissionHandlerMode = 0;
        this.isDebugMode = false;
        this.permissionHandlerMode = 0;
    }

    @Deprecated
    public String getAppUserId() {
        return "";
    }

    public boolean getDebugMode() {
        return this.isDebugMode;
    }

    public int getMaxAllowedBandwidthUsage() {
        return this.maxAllowedBandwidthUsage;
    }

    public int getMaxAllowedBandwidthUsagePercentage() {
        return this.maxAllowedBandwidthUsagePercentage;
    }

    @Deprecated
    public int getPermissionHandlerMode() {
        return this.permissionHandlerMode;
    }

    @Deprecated
    public void setAppUserId(String str) {
    }

    @Deprecated
    public void setAutoHandlePermissions(boolean z) {
        setPermissionHandlerMode(0);
    }

    public void setDebugMode(boolean z) {
        this.isDebugMode = z;
    }

    public void setMaxAllowedBandwidthUsage(int i) {
        this.maxAllowedBandwidthUsage = i;
    }

    public void setMaxAllowedBandwidthUsagePercentage(int i) {
        this.maxAllowedBandwidthUsagePercentage = i;
    }

    @Deprecated
    public void setPermissionHandlerMode(int i) {
        this.permissionHandlerMode = i;
    }
}
