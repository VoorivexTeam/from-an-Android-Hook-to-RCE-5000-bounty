package defpackage;

import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;

/* loaded from: classes.dex */
public class zd implements od<hd, InputStream> {
    public static final h<Integer> b = h.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final nd<hd, hd> a;

    /* loaded from: classes.dex */
    public static class a implements pd<hd, InputStream> {
        private final nd<hd, hd> a = new nd<>(500);

        @Override // defpackage.pd
        public od<hd, InputStream> a(sd sdVar) {
            return new zd(this.a);
        }
    }

    public zd(nd<hd, hd> ndVar) {
        this.a = ndVar;
    }

    @Override // defpackage.od
    public od.a<InputStream> a(hd hdVar, int i, int i2, i iVar) {
        nd<hd, hd> ndVar = this.a;
        if (ndVar != null) {
            hd a2 = ndVar.a(hdVar, 0, 0);
            if (a2 == null) {
                this.a.a(hdVar, 0, 0, hdVar);
            } else {
                hdVar = a2;
            }
        }
        return new od.a<>(hdVar, new qa(hdVar, ((Integer) iVar.a(b)).intValue()));
    }

    @Override // defpackage.od
    public boolean a(hd hdVar) {
        return true;
    }
}
