package defpackage;

/* loaded from: classes.dex */
public final class ty extends py {
    @Override // defpackage.py
    public cy a(fw fwVar) {
        String str;
        String str2;
        String b = py.b(fwVar);
        if (!b.startsWith("smtp:") && !b.startsWith("SMTP:")) {
            return null;
        }
        String substring = b.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str = substring2.substring(0, indexOf2);
                str2 = substring3;
            } else {
                str2 = null;
                str = substring2;
            }
        } else {
            str = null;
            str2 = null;
        }
        return new cy(new String[]{substring}, null, null, str, str2);
    }
}
