package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public class vd<Data> implements od<String, Data> {
    private final od<Uri, Data> a;

    /* loaded from: classes.dex */
    public static final class a implements pd<String, AssetFileDescriptor> {
        @Override // defpackage.pd
        public od<String, AssetFileDescriptor> a(sd sdVar) {
            return new vd(sdVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements pd<String, ParcelFileDescriptor> {
        @Override // defpackage.pd
        public od<String, ParcelFileDescriptor> a(sd sdVar) {
            return new vd(sdVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements pd<String, InputStream> {
        @Override // defpackage.pd
        public od<String, InputStream> a(sd sdVar) {
            return new vd(sdVar.a(Uri.class, InputStream.class));
        }
    }

    public vd(od<Uri, Data> odVar) {
        this.a = odVar;
    }

    private static Uri b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return c(str);
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.od
    public od.a<Data> a(String str, int i, int i2, i iVar) {
        Uri b2 = b(str);
        if (b2 == null || !this.a.a(b2)) {
            return null;
        }
        return this.a.a(b2, i, i2, iVar);
    }

    @Override // defpackage.od
    public boolean a(String str) {
        return true;
    }
}
