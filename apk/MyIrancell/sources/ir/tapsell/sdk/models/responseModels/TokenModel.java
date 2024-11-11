package ir.tapsell.sdk.models.responseModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class TokenModel implements Serializable {

    @SerializedName("token")
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
