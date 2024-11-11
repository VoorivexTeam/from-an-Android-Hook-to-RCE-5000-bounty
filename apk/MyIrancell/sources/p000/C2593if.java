package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;
import java.util.List;

/* renamed from: if */
/* loaded from: classes.dex */
public class C2593if implements InterfaceC0576j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f10625a;

    public C2593if(Context context) {
        this.f10625a = context.getApplicationContext();
    }

    /* renamed from: a */
    private int m12450a(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: a */
    private int m12451a(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: a */
    private Context m12452a(Uri uri, String str) {
        if (str.equals(this.f10625a.getPackageName())) {
            return this.f10625a;
        }
        try {
            return this.f10625a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f10625a.getPackageName())) {
                return this.f10625a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: b */
    private int m12453b(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m12450a(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m12451a(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3353vb<Drawable> mo3381a(Uri uri, int i, int i2, C0575i c0575i) {
        Context m12452a = m12452a(uri, uri.getAuthority());
        return C2551hf.m12215a(C2471ff.m11763a(this.f10625a, m12452a, m12453b(m12452a, uri)));
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(Uri uri, C0575i c0575i) {
        return uri.getScheme().equals("android.resource");
    }
}
