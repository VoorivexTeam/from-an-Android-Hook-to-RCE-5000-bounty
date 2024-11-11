package ir.tapsell.sdk.utils;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ir.tapsell.sdk.NoProguard;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class GsonHelper implements NoProguard {
    private static Gson customGson;
    private static final Object customGsonCreationKey = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ByteArrayToBase64TypeAdapter implements JsonDeserializer<byte[]>, JsonSerializer<byte[]>, NoProguard {
        private ByteArrayToBase64TypeAdapter() {
        }

        @Override // com.google.gson.JsonDeserializer
        public byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return Base64.decode(jsonElement.getAsString(), 2);
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(byte[] bArr, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Base64.encodeToString(bArr, 2));
        }
    }

    public static Gson getCustomGson() {
        if (customGson == null) {
            synchronized (customGsonCreationKey) {
                if (customGson == null) {
                    customGson = new GsonBuilder().registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter()).create();
                }
            }
        }
        return customGson;
    }
}
