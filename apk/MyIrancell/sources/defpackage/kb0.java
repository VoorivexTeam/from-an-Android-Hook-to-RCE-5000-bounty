package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okio.Buffer;

/* loaded from: classes.dex */
final class kb0<T> implements ta0<T, h80> {
    private static final b80 c = b80.a("application/json; charset=UTF-8");
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson a;
    private final TypeAdapter<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kb0(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ta0
    public h80 a(T t) {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), d));
        this.b.write(newJsonWriter, t);
        newJsonWriter.close();
        return h80.a(c, buffer.readByteString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ta0
    public /* bridge */ /* synthetic */ h80 a(Object obj) {
        return a((kb0<T>) obj);
    }
}
