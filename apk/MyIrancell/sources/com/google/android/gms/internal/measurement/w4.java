package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class w4 extends IOException {
    public w4(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w4 a() {
        return new w4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w4 b() {
        return new w4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w4 c() {
        return new w4("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z4 d() {
        return new z4("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w4 e() {
        return new w4("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w4 f() {
        return new w4("Protocol message had invalid UTF-8.");
    }
}
