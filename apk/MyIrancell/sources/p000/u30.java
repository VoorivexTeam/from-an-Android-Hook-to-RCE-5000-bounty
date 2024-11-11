package p000;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class u30 implements Serializable {

    /* renamed from: b */
    @SerializedName("paymentMode")
    @Expose
    private List<Object> f13398b;

    public String toString() {
        return "PaymentModeTypeList{paymentMode=" + this.f13398b + '}';
    }
}
