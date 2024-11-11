package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;

/* loaded from: classes.dex */
public class td<Data> implements od<Integer, Data> {
    private final od<Uri, Data> a;
    private final Resources b;

    /* loaded from: classes.dex */
    public static final class a implements pd<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.pd
        public od<Integer, AssetFileDescriptor> a(sd sdVar) {
            return new td(this.a, sdVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements pd<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.pd
        public od<Integer, ParcelFileDescriptor> a(sd sdVar) {
            return new td(this.a, sdVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements pd<Integer, InputStream> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.pd
        public od<Integer, InputStream> a(sd sdVar) {
            return new td(this.a, sdVar.a(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements pd<Integer, Uri> {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.pd
        public od<Integer, Uri> a(sd sdVar) {
            return new td(this.a, wd.a());
        }
    }

    public td(Resources resources, od<Uri, Data> odVar) {
        this.b = resources;
        this.a = odVar;
    }

    private Uri b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String str = "Received invalid resource id: " + num;
            return null;
        }
    }

    @Override // defpackage.od
    public od.a<Data> a(Integer num, int i, int i2, i iVar) {
        Uri b2 = b(num);
        if (b2 == null) {
            return null;
        }
        return this.a.a(b2, i, i2, iVar);
    }

    @Override // defpackage.od
    public boolean a(Integer num) {
        return true;
    }
}
