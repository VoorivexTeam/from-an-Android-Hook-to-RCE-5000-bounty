package p000;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class b80 {

    /* renamed from: d */
    private static final Pattern f2744d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f2745e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f2746a;

    /* renamed from: b */
    private final String f2747b;

    /* renamed from: c */
    @Nullable
    private final String f2748c;

    private b80(String str, String str2, String str3, @Nullable String str4) {
        this.f2746a = str;
        this.f2747b = str2;
        this.f2748c = str4;
    }

    /* renamed from: a */
    public static b80 m3340a(String str) {
        Matcher matcher = f2744d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        String str2 = null;
        Matcher matcher2 = f2745e.matcher(str);
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 == null) {
                    group2 = matcher2.group(3);
                } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                    group2 = group2.substring(1, group2.length() - 1);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                }
                str2 = group2;
            }
        }
        return new b80(str, lowerCase, lowerCase2, str2);
    }

    @Nullable
    /* renamed from: b */
    public static b80 m3341b(String str) {
        try {
            return m3340a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public Charset m3342a() {
        return m3343a((Charset) null);
    }

    @Nullable
    /* renamed from: a */
    public Charset m3343a(@Nullable Charset charset) {
        try {
            return this.f2748c != null ? Charset.forName(this.f2748c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: b */
    public String m3344b() {
        return this.f2747b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof b80) && ((b80) obj).f2746a.equals(this.f2746a);
    }

    public int hashCode() {
        return this.f2746a.hashCode();
    }

    public String toString() {
        return this.f2746a;
    }
}
