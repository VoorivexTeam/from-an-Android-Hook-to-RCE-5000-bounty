package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class u30 implements Serializable {

    @SerializedName("paymentMode")
    @Expose
    private List<Object> b;

    public String toString() {
        return "PaymentModeTypeList{paymentMode=" + this.b + '}';
    }
}
