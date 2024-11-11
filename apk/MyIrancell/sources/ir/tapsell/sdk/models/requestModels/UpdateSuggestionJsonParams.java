package ir.tapsell.sdk.models.requestModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.UUID;

/* loaded from: classes.dex */
public class UpdateSuggestionJsonParams implements Serializable {
    public static final int ZONE_INTERSTITIAL_BANNER = 2;
    public static final int ZONE_INTERSTITIAL_VIDEO = 3;
    public static final int ZONE_NATIVE_BANNER = 6;
    public static final int ZONE_NATIVE_VIDEO = 5;
    public static final int ZONE_REWARDED_VIDEO = 1;
    public static final int ZONE_STANDARD_BANNER = 7;

    @SerializedName("newState")
    private int newState;
    private transient UUID suggestionId;

    @SerializedName("zoneType")
    private int zoneType;

    public UpdateSuggestionJsonParams(UUID uuid, int i, int i2) {
        this.suggestionId = uuid;
        this.newState = i;
        this.zoneType = i2;
    }

    public int getNewState() {
        return this.newState;
    }

    public UUID getSuggestionId() {
        return this.suggestionId;
    }

    public int getZoneType() {
        return this.zoneType;
    }
}
