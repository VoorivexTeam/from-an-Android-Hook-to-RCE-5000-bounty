package defpackage;

import android.util.Log;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ib<DataType, ResourceType, Transcode> {
    private final Class<DataType> a;
    private final List<? extends j<DataType, ResourceType>> b;
    private final ag<ResourceType, Transcode> c;
    private final u1<List<Throwable>> d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        vb<ResourceType> a(vb<ResourceType> vbVar);
    }

    public ib(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends j<DataType, ResourceType>> list, ag<ResourceType, Transcode> agVar, u1<List<Throwable>> u1Var) {
        this.a = cls;
        this.b = list;
        this.c = agVar;
        this.d = u1Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private vb<ResourceType> a(la<DataType> laVar, int i, int i2, i iVar) {
        List<Throwable> a2 = this.d.a();
        ji.a(a2);
        List<Throwable> list = a2;
        try {
            return a(laVar, i, i2, iVar, list);
        } finally {
            this.d.a(list);
        }
    }

    private vb<ResourceType> a(la<DataType> laVar, int i, int i2, i iVar, List<Throwable> list) {
        int size = this.b.size();
        vb<ResourceType> vbVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            j<DataType, ResourceType> jVar = this.b.get(i3);
            try {
                if (jVar.a(laVar.a(), iVar)) {
                    vbVar = jVar.a(laVar.a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String str = "Failed to decode data for " + jVar;
                }
                list.add(e);
            }
            if (vbVar != null) {
                break;
            }
        }
        if (vbVar != null) {
            return vbVar;
        }
        throw new qb(this.e, new ArrayList(list));
    }

    public vb<Transcode> a(la<DataType> laVar, int i, int i2, i iVar, a<ResourceType> aVar) {
        return this.c.a(aVar.a(a(laVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
