package p000;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class l60 {

    /* renamed from: d */
    private static final Pattern f11810d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    private static final Pattern f11811e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f11812a;

    /* renamed from: b */
    public final long f11813b;

    /* renamed from: c */
    public final boolean f11814c;

    public l60(String str) {
        t60.m15549a(str);
        long m13816a = m13816a(str);
        this.f11813b = Math.max(0L, m13816a);
        this.f11814c = m13816a >= 0;
        this.f11812a = m13818b(str);
    }

    /* renamed from: a */
    private long m13816a(String str) {
        Matcher matcher = f11810d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    /* renamed from: a */
    public static l60 m13817a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new l60(sb.toString());
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    /* renamed from: b */
    private String m13818b(String str) {
        Matcher matcher = f11811e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f11813b + ", partial=" + this.f11814c + ", uri='" + this.f11812a + "'}";
    }
}
