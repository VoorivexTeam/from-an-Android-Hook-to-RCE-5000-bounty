package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ActionModel implements Serializable {
    public static final int TYPE_WEB_VIEW = 1;

    @SerializedName("actionUrl")
    private String actionUrl;

    @SerializedName("type")
    private Integer type;

    public String getActionUrl() {
        return this.actionUrl;
    }

    public Integer getType() {
        return this.type;
    }

    public void setActionUrl(String str) {
        this.actionUrl = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }
}
