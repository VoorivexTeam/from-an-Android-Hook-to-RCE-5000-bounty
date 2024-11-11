package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C0575i;
import java.io.File;
import java.io.InputStream;
import p000.InterfaceC3031od;

/* renamed from: vd */
/* loaded from: classes.dex */
public class C3355vd<Data> implements InterfaceC3031od<String, Data> {

    /* renamed from: a */
    private final InterfaceC3031od<Uri, Data> f13679a;

    /* renamed from: vd$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3081pd<String, AssetFileDescriptor> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<String, AssetFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C3355vd(c3206sd.m15400a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: vd$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3081pd<String, ParcelFileDescriptor> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<String, ParcelFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C3355vd(c3206sd.m15400a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: vd$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC3081pd<String, InputStream> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<String, InputStream> mo139a(C3206sd c3206sd) {
            return new C3355vd(c3206sd.m15400a(Uri.class, InputStream.class));
        }
    }

    public C3355vd(InterfaceC3031od<Uri, Data> interfaceC3031od) {
        this.f13679a = interfaceC3031od;
    }

    /* renamed from: b */
    private static Uri m16010b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return m16011c(str);
    }

    /* renamed from: c */
    private static Uri m16011c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(String str, int i, int i2, C0575i c0575i) {
        Uri m16010b = m16010b(str);
        if (m16010b == null || !this.f13679a.mo138a(m16010b)) {
            return null;
        }
        return this.f13679a.mo137a(m16010b, i, i2, c0575i);
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(String str) {
        return true;
    }
}
