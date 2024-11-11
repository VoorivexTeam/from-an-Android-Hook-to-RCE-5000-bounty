package p000;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okio.Buffer;

/* loaded from: classes.dex */
final class kb0<T> implements ta0<T, h80> {

    /* renamed from: c */
    private static final b80 f11703c = b80.m3340a("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f11704d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Gson f11705a;

    /* renamed from: b */
    private final TypeAdapter<T> f11706b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kb0(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f11705a = gson;
        this.f11706b = typeAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.ta0
    /* renamed from: a */
    public h80 mo133a(T t) {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.f11705a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f11704d));
        this.f11706b.write(newJsonWriter, t);
        newJsonWriter.close();
        return h80.m12146a(f11703c, buffer.readByteString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ta0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ h80 mo133a(Object obj) {
        return mo133a((kb0<T>) obj);
    }
}
