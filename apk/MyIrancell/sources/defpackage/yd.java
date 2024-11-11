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
public class yd<Data> implements od<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final od<hd, Data> a;

    /* loaded from: classes.dex */
    public static class a implements pd<Uri, InputStream> {
        @Override // defpackage.pd
        public od<Uri, InputStream> a(sd sdVar) {
            return new yd(sdVar.a(hd.class, InputStream.class));
        }
    }

    public yd(od<hd, Data> odVar) {
        this.a = odVar;
    }

    @Override // defpackage.od
    public od.a<Data> a(Uri uri, int i, int i2, i iVar) {
        return this.a.a(new hd(uri.toString()), i, i2, iVar);
    }

    @Override // defpackage.od
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
