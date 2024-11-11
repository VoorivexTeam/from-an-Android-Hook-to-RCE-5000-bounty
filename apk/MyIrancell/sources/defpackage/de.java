package defpackage;

import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class de implements od<URL, InputStream> {
    private final od<hd, InputStream> a;

    /* loaded from: classes.dex */
    public static class a implements pd<URL, InputStream> {
        @Override // defpackage.pd
        public od<URL, InputStream> a(sd sdVar) {
            return new de(sdVar.a(hd.class, InputStream.class));
        }
    }

    public de(od<hd, InputStream> odVar) {
        this.a = odVar;
    }

    @Override // defpackage.od
    public od.a<InputStream> a(URL url, int i, int i2, i iVar) {
        return this.a.a(new hd(url), i, i2, iVar);
    }

    @Override // defpackage.od
    public boolean a(URL url) {
        return true;
    }
}
