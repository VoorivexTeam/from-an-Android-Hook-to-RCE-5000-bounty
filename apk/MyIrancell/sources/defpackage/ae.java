package defpackage;

import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ae implements od<Uri, InputStream> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final od<hd, InputStream> a;

    /* loaded from: classes.dex */
    public static class a implements pd<Uri, InputStream> {
        @Override // defpackage.pd
        public od<Uri, InputStream> a(sd sdVar) {
            return new ae(sdVar.a(hd.class, InputStream.class));
        }
    }

    public ae(od<hd, InputStream> odVar) {
        this.a = odVar;
    }

    @Override // defpackage.od
    public od.a<InputStream> a(Uri uri, int i, int i2, i iVar) {
        return this.a.a(new hd(uri.toString()), i, i2, iVar);
    }

    @Override // defpackage.od
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
