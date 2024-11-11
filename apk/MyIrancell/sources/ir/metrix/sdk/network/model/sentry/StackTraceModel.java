package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class StackTraceModel {

    @SerializedName("frames")
    public List<FrameModel> frames;
}
