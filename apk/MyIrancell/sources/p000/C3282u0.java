package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p000.C2796j1;

/* renamed from: u0 */
/* loaded from: classes.dex */
class C3282u0 extends C3458y0 {
    /* renamed from: a */
    private File m15699a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // p000.C3458y0
    /* renamed from: a */
    public Typeface mo15700a(Context context, CancellationSignal cancellationSignal, C2796j1.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        C2796j1.f m16533a = m16533a(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m16533a.m13309c(), "r", cancellationSignal);
            try {
                File m15699a = m15699a(openFileDescriptor);
                if (m15699a != null && m15699a.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m15699a);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface m16532a = super.m16532a(context, fileInputStream);
                    fileInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return m16532a;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
