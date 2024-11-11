package defpackage;

import android.util.Log;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class pf implements k<of> {
    @Override // com.bumptech.glide.load.k
    public c a(i iVar) {
        return c.SOURCE;
    }

    @Override // com.bumptech.glide.load.d
    public boolean a(vb<of> vbVar, File file, i iVar) {
        try {
            ai.a(vbVar.get().b(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
