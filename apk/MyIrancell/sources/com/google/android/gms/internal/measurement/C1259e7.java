package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e7 */
/* loaded from: classes.dex */
final class C1259e7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m7801a(AbstractC1300h3 abstractC1300h3) {
        String str;
        C1244d7 c1244d7 = new C1244d7(abstractC1300h3);
        StringBuilder sb = new StringBuilder(c1244d7.zza());
        for (int i = 0; i < c1244d7.zza(); i++) {
            int mo7768a = c1244d7.mo7768a(i);
            if (mo7768a == 34) {
                str = "\\\"";
            } else if (mo7768a == 39) {
                str = "\\'";
            } else if (mo7768a != 92) {
                switch (mo7768a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (mo7768a < 32 || mo7768a > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo7768a >>> 6) & 3) + 48));
                            sb.append((char) (((mo7768a >>> 3) & 7) + 48));
                            mo7768a = (mo7768a & 7) + 48;
                        }
                        sb.append((char) mo7768a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
