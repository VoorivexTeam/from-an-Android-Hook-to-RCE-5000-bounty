package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends Exception {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        super(str);
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -1743242157:
                    if (lowerCase.equals("service_not_available")) {
                        return;
                    } else {
                        return;
                    }
                case -1290953729:
                    if (lowerCase.equals("toomanymessages")) {
                        return;
                    } else {
                        return;
                    }
                case -920906446:
                    if (lowerCase.equals("invalid_parameters")) {
                        return;
                    } else {
                        return;
                    }
                case -617027085:
                    if (lowerCase.equals("messagetoobig")) {
                        return;
                    } else {
                        return;
                    }
                case -95047692:
                    if (lowerCase.equals("missing_to")) {
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
