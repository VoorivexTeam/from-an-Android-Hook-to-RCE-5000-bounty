package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.ta0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class jb0 extends ta0.a {
    private final Gson a;

    private jb0(Gson gson) {
        this.a = gson;
    }

    public static jb0 a() {
        return a(new Gson());
    }

    public static jb0 a(Gson gson) {
        if (gson != null) {
            return new jb0(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // ta0.a
    public ta0<j80, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        return new lb0(this.a, this.a.getAdapter(TypeToken.get(type)));
    }

    @Override // ta0.a
    public ta0<?, h80> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
        return new kb0(this.a, this.a.getAdapter(TypeToken.get(type)));
    }
}
