package defpackage;

import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import defpackage.oc;
import java.io.File;

/* loaded from: classes.dex */
class eb<DataType> implements oc.b {
    private final d<DataType> a;
    private final DataType b;
    private final i c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eb(d<DataType> dVar, DataType datatype, i iVar) {
        this.a = dVar;
        this.b = datatype;
        this.c = iVar;
    }

    @Override // oc.b
    public boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
