package p000;

import java.io.Serializable;

/* loaded from: classes.dex */
public class b70 extends a70<c70> implements Serializable {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.a70
    public int getZoneType() {
        int intValue = ((c70) getCreative()).getCtaType().intValue();
        int i = 1;
        if (intValue != 1) {
            i = 2;
            if (intValue != 2) {
                i = 3;
                if (intValue != 3) {
                    return -1;
                }
            }
        }
        return i;
    }
}
