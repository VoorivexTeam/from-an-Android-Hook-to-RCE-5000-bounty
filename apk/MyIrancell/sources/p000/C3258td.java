package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import p000.InterfaceC3031od;

/* renamed from: td */
/* loaded from: classes.dex */
public class C3258td<Data> implements InterfaceC3031od<Integer, Data> {

    /* renamed from: a */
    private final InterfaceC3031od<Uri, Data> f13303a;

    /* renamed from: b */
    private final Resources f13304b;

    /* renamed from: td$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3081pd<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f13305a;

        public a(Resources resources) {
            this.f13305a = resources;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Integer, AssetFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C3258td(this.f13305a, c3206sd.m15400a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: td$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3081pd<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f13306a;

        public b(Resources resources) {
            this.f13306a = resources;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Integer, ParcelFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C3258td(this.f13306a, c3206sd.m15400a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: td$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC3081pd<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f13307a;

        public c(Resources resources) {
            this.f13307a = resources;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Integer, InputStream> mo139a(C3206sd c3206sd) {
            return new C3258td(this.f13307a, c3206sd.m15400a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: td$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC3081pd<Integer, Uri> {

        /* renamed from: a */
        private final Resources f13308a;

        public d(Resources resources) {
            this.f13308a = resources;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Integer, Uri> mo139a(C3206sd c3206sd) {
            return new C3258td(this.f13308a, C3394wd.m16208a());
        }
    }

    public C3258td(Resources resources, InterfaceC3031od<Uri, Data> interfaceC3031od) {
        this.f13304b = resources;
        this.f13303a = interfaceC3031od;
    }

    /* renamed from: b */
    private Uri m15631b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f13304b.getResourcePackageName(num.intValue()) + '/' + this.f13304b.getResourceTypeName(num.intValue()) + '/' + this.f13304b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String str = "Received invalid resource id: " + num;
            return null;
        }
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(Integer num, int i, int i2, C0575i c0575i) {
        Uri m15631b = m15631b(num);
        if (m15631b == null) {
            return null;
        }
        return this.f13303a.mo137a(m15631b, i, i2, c0575i);
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Integer num) {
        return true;
    }
}
