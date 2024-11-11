package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/* loaded from: classes.dex */
final class lb0<T> implements ta0<j80, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb0(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // defpackage.ta0
    public T a(j80 j80Var) {
        JsonReader newJsonReader = this.a.newJsonReader(j80Var.a());
        try {
            T read2 = this.b.read2(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            j80Var.close();
        }
    }
}
