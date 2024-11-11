package p000;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p000.ta0;

/* loaded from: classes.dex */
public final class jb0 extends ta0.AbstractC3255a {

    /* renamed from: a */
    private final Gson f11502a;

    private jb0(Gson gson) {
        this.f11502a = gson;
    }

    /* renamed from: a */
    public static jb0 m13439a() {
        return m13440a(new Gson());
    }

    /* renamed from: a */
    public static jb0 m13440a(Gson gson) {
        if (gson != null) {
            return new jb0(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p000.ta0.AbstractC3255a
    /* renamed from: a */
    public ta0<j80, ?> mo132a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        return new lb0(this.f11502a, this.f11502a.getAdapter(TypeToken.get(type)));
    }

    @Override // p000.ta0.AbstractC3255a
    /* renamed from: a */
    public ta0<?, h80> mo13441a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
        return new kb0(this.f11502a, this.f11502a.getAdapter(TypeToken.get(type)));
    }
}
