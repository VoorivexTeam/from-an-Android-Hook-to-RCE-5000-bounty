package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import java.io.File;
import java.io.FileNotFoundException;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: ld */
/* loaded from: classes.dex */
public final class C2893ld implements InterfaceC3031od<Uri, File> {

    /* renamed from: a */
    private final Context f11867a;

    /* renamed from: ld$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3081pd<Uri, File> {

        /* renamed from: a */
        private final Context f11868a;

        public a(Context context) {
            this.f11868a = context;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, File> mo139a(C3206sd c3206sd) {
            return new C2893ld(this.f11868a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ld$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC2853ka<File> {

        /* renamed from: d */
        private static final String[] f11869d = {"_data"};

        /* renamed from: b */
        private final Context f11870b;

        /* renamed from: c */
        private final Uri f11871c;

        b(Context context, Uri uri) {
            this.f11870b = context;
            this.f11871c = uri;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<File> mo3663a() {
            return File.class;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super File> aVar) {
            Cursor query = this.f11870b.getContentResolver().query(this.f11871c, f11869d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.mo3639a((InterfaceC2853ka.a<? super File>) new File(r0));
                return;
            }
            aVar.mo3638a((Exception) new FileNotFoundException("Failed to find file path for: " + this.f11871c));
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: c */
        public EnumC0567a mo3666c() {
            return EnumC0567a.LOCAL;
        }

        @Override // p000.InterfaceC2853ka
        public void cancel() {
        }
    }

    public C2893ld(Context context) {
        this.f11867a = context;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<File> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(uri), new b(this.f11867a, uri));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return C3391wa.m16193b(uri);
    }
}
