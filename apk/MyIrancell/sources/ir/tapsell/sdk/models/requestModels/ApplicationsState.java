package ir.tapsell.sdk.models.requestModels;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.AppInfo;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class ApplicationsState implements Serializable {
    public static final int E_TYPE_B = 1;
    public static final int E_TYPE_E = 2;
    public static final int SENDING_TYPE_DIFF = 2;
    public static final int SENDING_TYPE_FULL = 1;
    private transient List<AppInfo> curPackages;

    @SerializedName("eType")
    private int eType;

    @SerializedName("eal")
    private String encodedAppList;
    private transient boolean hasDifferences = false;

    @SerializedName("sendingType")
    private int sendingType;

    @SerializedName("userExtraInfo")
    private UserExtraInfo userExtraInfo;

    public boolean HasDifferences() {
        return this.hasDifferences;
    }

    public List<AppInfo> getCurPackages() {
        return this.curPackages;
    }

    public String getEncodedAppList() {
        return this.encodedAppList;
    }

    public int getSendingType() {
        return this.sendingType;
    }

    public UserExtraInfo getUserExtraInfo() {
        return this.userExtraInfo;
    }

    public int geteType() {
        return this.eType;
    }

    public boolean hasDifferences() {
        return this.hasDifferences;
    }

    public void setCurPackages(List<AppInfo> list) {
        this.curPackages = list;
    }

    public void setEncodedAppList(String str) {
        this.encodedAppList = str;
    }

    public void setHasDifferences(boolean z) {
        this.hasDifferences = z;
    }

    public void setSendingType(int i) {
        this.sendingType = i;
    }

    public void setUserExtraInfo(UserExtraInfo userExtraInfo) {
        this.userExtraInfo = userExtraInfo;
    }

    public void seteType(int i) {
        this.eType = i;
    }
}
