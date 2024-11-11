package defpackage;

import ir.tapsell.sdk.models.responseModels.subModels.DirectCreativeModel;
import java.io.Serializable;

/* loaded from: classes.dex */
public class c70 extends DirectCreativeModel implements Serializable {
    @Override // ir.tapsell.sdk.models.responseModels.subModels.BaseCreativeModel
    public boolean isSupported() {
        if (getCtaType() == null) {
            return false;
        }
        return (getCtaType().intValue() == 3 || getCtaType().intValue() == 1) ? (getAction() == null || getCtaUrl() == null || getAction().getType() == null || getAction().getType().intValue() != 1 || getAction().getActionUrl() == null) ? false : true : getCtaType().intValue() == 2 && getCtaUrl() != null;
    }
}
