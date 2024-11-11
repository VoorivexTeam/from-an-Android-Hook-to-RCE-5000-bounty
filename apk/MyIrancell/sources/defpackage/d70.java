package defpackage;

import ir.tapsell.sdk.models.responseModels.subModels.NativeBannerCreativeModel;
import java.io.Serializable;

/* loaded from: classes.dex */
public class d70 extends a70<NativeBannerCreativeModel> implements Serializable {
    /* JADX WARN: Multi-variable type inference failed */
    public boolean a() {
        return (getCreative() == 0 || ((NativeBannerCreativeModel) getCreative()).getRate() == null) ? false : true;
    }

    @Override // defpackage.a70
    public int getZoneType() {
        return 6;
    }
}
