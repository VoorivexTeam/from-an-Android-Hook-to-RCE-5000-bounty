package ir.tapsell.sdk.models.responseModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import p000.a70;

/* loaded from: classes.dex */
public abstract class SuggestionListResponseModel<T extends a70> implements Serializable {

    @SerializedName("ctaDisabled")
    private Boolean ctaDisabled;

    @SerializedName("ctaDisabledMessage")
    private String ctaDisabledMessage;

    @SerializedName("selectDirectAdRandomly")
    private Boolean selectDirectAdRandomly;

    @SerializedName("serverSuggestedCacheType")
    private Integer serverSuggestedCacheType;

    @SerializedName("suggestions")
    private List<T> suggestions;

    @SerializedName("tapsellUserId")
    private UUID tapsellUserId;

    public Boolean getCtaDisabled() {
        return this.ctaDisabled;
    }

    public String getCtaDisabledMessage() {
        return this.ctaDisabledMessage;
    }

    public Boolean getSelectDirectAdRandomly() {
        return this.selectDirectAdRandomly;
    }

    public Integer getServerSuggestedCacheType() {
        return this.serverSuggestedCacheType;
    }

    public List<T> getSuggestions() {
        return this.suggestions;
    }

    public UUID getTapsellUserId() {
        return this.tapsellUserId;
    }

    public void setCtaDisabled(Boolean bool) {
        this.ctaDisabled = bool;
    }

    public void setCtaDisabledMessage(String str) {
        this.ctaDisabledMessage = str;
    }

    public void setSelectDirectAdRandomly(Boolean bool) {
        this.selectDirectAdRandomly = bool;
    }

    public void setServerSuggestedCacheType(Integer num) {
        this.serverSuggestedCacheType = num;
    }

    public void setSuggestions(List<T> list) {
        this.suggestions = list;
    }

    public void setTapsellUserId(UUID uuid) {
        this.tapsellUserId = uuid;
    }
}
