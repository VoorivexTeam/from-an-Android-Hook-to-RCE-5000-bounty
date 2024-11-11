package p000;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/* loaded from: classes.dex */
final class lb0<T> implements ta0<j80, T> {

    /* renamed from: a */
    private final Gson f11865a;

    /* renamed from: b */
    private final TypeAdapter<T> f11866b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb0(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f11865a = gson;
        this.f11866b = typeAdapter;
    }

    @Override // p000.ta0
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public T mo133a(j80 j80Var) {
        JsonReader newJsonReader = this.f11865a.newJsonReader(j80Var.m13427a());
        try {
            T read2 = this.f11866b.read2(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            j80Var.close();
        }
    }
}
