package defpackage;

import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import java.io.Serializable;

/* loaded from: classes.dex */
public class e70 extends a70<NativeVideoCreativeModel> implements Serializable {
    /* JADX WARN: Multi-variable type inference failed */
    public boolean a() {
        return (getCreative() == 0 || ((NativeVideoCreativeModel) getCreative()).getRate() == null) ? false : true;
    }

    @Override // defpackage.a70
    public int getZoneType() {
        return 5;
    }
}
