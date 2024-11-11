package ir.metrix.sdk;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class GsonHelper {

    /* renamed from: a */
    private static final Object f10670a = new Object();

    /* renamed from: b */
    private static Gson f10671b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ByteArrayToBase64TypeAdapter implements JsonDeserializer<byte[]>, JsonSerializer<byte[]> {
        private ByteArrayToBase64TypeAdapter() {
        }

        @Override // com.google.gson.JsonSerializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(byte[] bArr, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Base64.encodeToString(bArr, 2));
        }

        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return Base64.decode(jsonElement.getAsString(), 2);
        }
    }

    /* renamed from: a */
    public static Gson m12497a() {
        if (f10671b == null) {
            synchronized (f10670a) {
                if (f10671b == null) {
                    f10671b = new GsonBuilder().registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter()).create();
                }
            }
        }
        return f10671b;
    }
}
