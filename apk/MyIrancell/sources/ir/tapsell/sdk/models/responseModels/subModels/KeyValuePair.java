package ir.tapsell.sdk.models.responseModels.subModels;

import java.io.Serializable;

/* loaded from: classes.dex */
public class KeyValuePair<K, V> implements Serializable {
    private K first;
    private V second;

    public KeyValuePair() {
    }

    public KeyValuePair(K k, V v) {
        setFirst(k);
        setSecond(v);
    }

    public K getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    public void setFirst(K k) {
        this.first = k;
    }

    public void setSecond(V v) {
        this.second = v;
    }
}
