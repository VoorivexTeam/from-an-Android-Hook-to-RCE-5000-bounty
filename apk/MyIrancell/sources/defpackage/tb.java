package defpackage;

import com.bumptech.glide.load.i;
import defpackage.ib;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class tb<Data, ResourceType, Transcode> {
    private final u1<List<Throwable>> a;
    private final List<? extends ib<Data, ResourceType, Transcode>> b;
    private final String c;

    public tb(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<ib<Data, ResourceType, Transcode>> list, u1<List<Throwable>> u1Var) {
        this.a = u1Var;
        ji.a(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private vb<Transcode> a(la<Data> laVar, i iVar, int i, int i2, ib.a<ResourceType> aVar, List<Throwable> list) {
        int size = this.b.size();
        vb<Transcode> vbVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vbVar = this.b.get(i3).a(laVar, i, i2, iVar, aVar);
            } catch (qb e) {
                list.add(e);
            }
            if (vbVar != null) {
                break;
            }
        }
        if (vbVar != null) {
            return vbVar;
        }
        throw new qb(this.c, new ArrayList(list));
    }

    public vb<Transcode> a(la<Data> laVar, i iVar, int i, int i2, ib.a<ResourceType> aVar) {
        List<Throwable> a = this.a.a();
        ji.a(a);
        List<Throwable> list = a;
        try {
            return a(laVar, iVar, i, i2, aVar, list);
        } finally {
            this.a.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
