package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.o */
/* loaded from: classes.dex */
public class C2067o extends C2068p {
    public C2067o(List<C2056d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
    }
}
