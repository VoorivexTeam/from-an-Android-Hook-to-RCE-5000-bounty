package ir.tapsell.sdk.models.internalModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ClientDoneAndDoingRecordCache implements Serializable {

    @SerializedName("timeInMillis")
    private long recordTimeInMillis;

    @SerializedName("state")
    private int state;

    public long getRecordTimeInMillis() {
        return this.recordTimeInMillis;
    }

    public int getState() {
        return this.state;
    }

    public void setRecordTimeInMillis(long j) {
        this.recordTimeInMillis = j;
    }

    public void setState(int i) {
        this.state = i;
    }
}
