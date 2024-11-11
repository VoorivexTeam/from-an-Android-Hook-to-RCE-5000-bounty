package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.models.responseModels.subModels.BaseCreativeModel;
import java.io.Serializable;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class BaseAdSuggestionModel<T extends BaseCreativeModel> implements Serializable {

    @SerializedName("callToActionId")
    private UUID callToActionId;

    @SerializedName("creative")
    private T creative;

    @SerializedName("description")
    private String description;

    @SerializedName("expirationTimeInMillis")
    private Long expirationTimeInMillis;

    @SerializedName("iconUrl")
    private String iconUrl;

    @SerializedName("suggestionId")
    private UUID suggestionId;

    @SerializedName("suggestionValidationRule")
    private SuggestionValidationRuleModel suggestionValidationRule;

    @SerializedName("title")
    private String title;

    @SerializedName("tracker")
    private TrackerModel tracker;

    @SerializedName("filledIsReported")
    private boolean filledIsReported = false;

    @SerializedName("doingIsReported")
    private boolean doingIsReported = false;

    @SerializedName("doneIsReported")
    private boolean doneIsReported = false;

    @SerializedName("clickIsReported")
    private boolean clickIsReported = false;

    public UUID getCallToActionId() {
        return this.callToActionId;
    }

    public T getCreative() {
        return this.creative;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getExpirationTimeInMillis() {
        return this.expirationTimeInMillis;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public UUID getSuggestionId() {
        return this.suggestionId;
    }

    public SuggestionValidationRuleModel getSuggestionValidationRule() {
        return this.suggestionValidationRule;
    }

    public String getTitle() {
        return this.title;
    }

    public TrackerModel getTracker() {
        return this.tracker;
    }

    public boolean isClickReported() {
        return this.clickIsReported;
    }

    public boolean isDoingReported() {
        return this.doingIsReported;
    }

    public boolean isDoneReported() {
        return this.doneIsReported;
    }

    public boolean isFilledReported() {
        return this.filledIsReported;
    }

    public void setCallToActionId(UUID uuid) {
        this.callToActionId = uuid;
    }

    public void setClickIsReported(boolean z) {
        this.clickIsReported = z;
    }

    public void setCreative(T t) {
        this.creative = t;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDoingIsReported(boolean z) {
        this.doingIsReported = z;
    }

    public void setDoneIsReported(boolean z) {
        this.doneIsReported = z;
    }

    public void setExpirationTimeInMillis(Long l) {
        this.expirationTimeInMillis = l;
    }

    public void setFilledIsReported(boolean z) {
        this.filledIsReported = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setSuggestionId(UUID uuid) {
        this.suggestionId = uuid;
    }

    public void setSuggestionValidationRule(SuggestionValidationRuleModel suggestionValidationRuleModel) {
        this.suggestionValidationRule = suggestionValidationRuleModel;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTracker(TrackerModel trackerModel) {
        this.tracker = trackerModel;
    }
}
