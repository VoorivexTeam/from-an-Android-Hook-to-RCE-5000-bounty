package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: iy */
/* loaded from: classes.dex */
public final class C2792iy extends AbstractC3102py {

    /* renamed from: e */
    private static final Pattern f11371e = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C2570hy mo3202a(C2488fw c2488fw) {
        Matcher matcher = f11371e.matcher(AbstractC3102py.m14848b(c2488fw));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d && parseDouble >= -90.0d) {
                double parseDouble2 = Double.parseDouble(matcher.group(2));
                if (parseDouble2 <= 180.0d && parseDouble2 >= -180.0d) {
                    double d = 0.0d;
                    if (matcher.group(3) != null) {
                        double parseDouble3 = Double.parseDouble(matcher.group(3));
                        if (parseDouble3 < 0.0d) {
                            return null;
                        }
                        d = parseDouble3;
                    }
                    return new C2570hy(parseDouble, parseDouble2, d, group);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
