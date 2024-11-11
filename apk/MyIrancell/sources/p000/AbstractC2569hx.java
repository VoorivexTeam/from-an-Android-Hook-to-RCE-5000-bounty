package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import com.google.zxing.client.android.C2255d;
import com.google.zxing.client.android.C2264m;
import com.google.zxing.client.android.R$string;
import com.google.zxing.client.android.book.SearchBookContentsActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: hx */
/* loaded from: classes.dex */
public abstract class AbstractC2569hx {

    /* renamed from: e */
    private static final String[] f10516e = {"home", "work", "mobile"};

    /* renamed from: f */
    private static final String[] f10517f = {"home", "work", "mobile", "fax", "pager", "main"};

    /* renamed from: g */
    private static final String[] f10518g = {"home", "work"};

    /* renamed from: h */
    private static final int[] f10519h = {1, 2, 4};

    /* renamed from: i */
    private static final int[] f10520i = {1, 3, 2, 4, 6, 12};

    /* renamed from: j */
    private static final int[] f10521j = {1, 2};

    /* renamed from: a */
    private final AbstractC2914ly f10522a;

    /* renamed from: b */
    private final Activity f10523b;

    /* renamed from: c */
    private final C2488fw f10524c;

    /* renamed from: d */
    private final String f10525d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2569hx(Activity activity, AbstractC2914ly abstractC2914ly) {
        this(activity, abstractC2914ly, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2569hx(Activity activity, AbstractC2914ly abstractC2914ly, C2488fw c2488fw) {
        this.f10522a = abstractC2914ly;
        this.f10523b = activity;
        this.f10524c = c2488fw;
        this.f10525d = m12252j();
    }

    /* renamed from: a */
    private static int m12250a(String str, String[] strArr, int[] iArr) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str.startsWith(str2) || str.startsWith(str2.toUpperCase(Locale.ENGLISH))) {
                return iArr[i];
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static void m12251a(Intent intent, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        intent.putExtra(str, str2);
    }

    /* renamed from: j */
    private String m12252j() {
        String string = PreferenceManager.getDefaultSharedPreferences(this.f10523b).getString("preferences_custom_product_search", null);
        if (string == null || !string.trim().isEmpty()) {
            return string;
        }
        return null;
    }

    /* renamed from: m */
    private static int m12253m(String str) {
        return m12250a(str, f10518g, f10521j);
    }

    /* renamed from: n */
    private static int m12254n(String str) {
        return m12250a(str, f10516e, f10519h);
    }

    /* renamed from: o */
    private static int m12255o(String str) {
        return m12250a(str, f10517f, f10520i);
    }

    /* renamed from: a */
    public abstract int mo3197a(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12256a(double d, double d2) {
        m12257a(new Intent("android.intent.action.VIEW", Uri.parse("https://maps.google." + C2264m.m10902c(this.f10523b) + "/maps?f=d&daddr=" + d + ',' + d2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12257a(Intent intent) {
        try {
            m12266b(intent);
        } catch (ActivityNotFoundException unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10523b);
            builder.setTitle(R$string.app_name);
            builder.setMessage(R$string.msg_intent_failed);
            builder.setPositiveButton(R$string.button_ok, (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12258a(String str) {
        m12257a(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12259a(String str, String str2) {
        m12268b("smsto:" + str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12260a(String str, String str2, String str3) {
        m12269b("mmsto:" + str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12261a(String[] strArr, String[] strArr2) {
        m12262a(null, null, null, null, null, strArr, strArr2, null, null, null, null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12262a(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String str4, String str5, String str6, String str7, String[] strArr7, String str8, String[] strArr8) {
        int m12253m;
        int m12254n;
        int m12255o;
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/contact");
        m12251a(intent, "name", strArr != null ? strArr[0] : null);
        m12251a(intent, "phonetic_name", str);
        int min = Math.min(strArr3 != null ? strArr3.length : 0, C2255d.f9116a.length);
        for (int i = 0; i < min; i++) {
            m12251a(intent, C2255d.f9116a[i], strArr3[i]);
            if (strArr4 != null && i < strArr4.length && (m12255o = m12255o(strArr4[i])) >= 0) {
                intent.putExtra(C2255d.f9117b[i], m12255o);
            }
        }
        int min2 = Math.min(strArr5 != null ? strArr5.length : 0, C2255d.f9118c.length);
        for (int i2 = 0; i2 < min2; i2++) {
            m12251a(intent, C2255d.f9118c[i2], strArr5[i2]);
            if (strArr6 != null && i2 < strArr6.length && (m12254n = m12254n(strArr6[i2])) >= 0) {
                intent.putExtra(C2255d.f9119d[i2], m12254n);
            }
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (strArr7 != null) {
            int length = strArr7.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str9 = strArr7[i3];
                if (str9 != null && !str9.isEmpty()) {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("mimetype", "vnd.android.cursor.item/website");
                    contentValues.put("data1", str9);
                    arrayList.add(contentValues);
                    break;
                }
                i3++;
            }
        }
        if (str8 != null) {
            ContentValues contentValues2 = new ContentValues(3);
            contentValues2.put("mimetype", "vnd.android.cursor.item/contact_event");
            contentValues2.put("data2", (Integer) 3);
            contentValues2.put("data1", str8);
            arrayList.add(contentValues2);
        }
        if (strArr2 != null) {
            int length2 = strArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                String str10 = strArr2[i4];
                if (str10 != null && !str10.isEmpty()) {
                    ContentValues contentValues3 = new ContentValues(3);
                    contentValues3.put("mimetype", "vnd.android.cursor.item/nickname");
                    contentValues3.put("data2", (Integer) 1);
                    contentValues3.put("data1", str10);
                    arrayList.add(contentValues3);
                    break;
                }
                i4++;
            }
        }
        if (!arrayList.isEmpty()) {
            intent.putParcelableArrayListExtra("data", arrayList);
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append('\n');
            sb.append(str2);
        }
        if (strArr8 != null) {
            sb.append('\n');
            sb.append(strArr8[0]);
            sb.append(',');
            sb.append(strArr8[1]);
        }
        if (sb.length() > 0) {
            m12251a(intent, "notes", sb.substring(1));
        }
        m12251a(intent, "im_handle", str3);
        m12251a(intent, "postal", str4);
        if (str5 != null && (m12253m = m12253m(str5)) >= 0) {
            intent.putExtra("postal_type", m12253m);
        }
        m12251a(intent, "company", str6);
        m12251a(intent, "job_title", str7);
        m12257a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m12263a(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
        if (strArr != null && strArr.length != 0) {
            intent.putExtra("android.intent.extra.EMAIL", strArr);
        }
        if (strArr2 != null && strArr2.length != 0) {
            intent.putExtra("android.intent.extra.CC", strArr2);
        }
        if (strArr3 != null && strArr3.length != 0) {
            intent.putExtra("android.intent.extra.BCC", strArr3);
        }
        m12251a(intent, "android.intent.extra.SUBJECT", str);
        m12251a(intent, "android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        m12257a(intent);
    }

    /* renamed from: a */
    public boolean mo12264a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Activity m12265b() {
        return this.f10523b;
    }

    /* renamed from: b */
    public abstract void mo3198b(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m12266b(Intent intent) {
        if (intent != null) {
            intent.addFlags(524288);
            String str = "Launching intent: " + intent + " with extras: " + intent.getExtras();
            this.f10523b.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m12267b(String str) {
        m12257a(new Intent("android.intent.action.DIAL", Uri.parse(str)));
    }

    /* renamed from: b */
    final void m12268b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        m12251a(intent, "sms_body", str2);
        intent.putExtra("compose_mode", true);
        m12257a(intent);
    }

    /* renamed from: b */
    final void m12269b(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        if (str2 == null || str2.isEmpty()) {
            str2 = this.f10523b.getString(R$string.msg_default_mms_subject);
        }
        m12251a(intent, "subject", str2);
        m12251a(intent, "sms_body", str3);
        intent.putExtra("compose_mode", true);
        m12257a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m12270b(String[] strArr, String[] strArr2) {
        m12262a(null, null, null, strArr, strArr2, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: c */
    public abstract int mo3199c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final String m12271c(String str) {
        if (this.f10525d == null) {
            return str;
        }
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String str2 = this.f10525d;
        C2488fw c2488fw = this.f10524c;
        if (c2488fw != null) {
            str2 = str2.replaceFirst("%f(?![0-9a-f])", c2488fw.m11835a().toString());
            if (str2.contains("%t")) {
                str2 = str2.replace("%t", AbstractC3102py.m14853c(this.f10524c).m13944b().toString());
            }
        }
        return str2.replace("%s", str);
    }

    /* renamed from: d */
    public Integer mo12272d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m12273d(String str) {
        m12257a(new Intent("android.intent.action.VIEW", Uri.parse("https://books.google." + C2264m.m10898a(this.f10523b) + "/books?vid=isbn" + str)));
    }

    /* renamed from: e */
    public CharSequence mo3200e() {
        return this.f10522a.mo3459a().replace("\r", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m12274e(String str) {
        m12257a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: f */
    public abstract int mo3201f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m12275f(String str) {
        m12257a(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google." + C2264m.m10903d(this.f10523b) + "/m/products?q=" + str + "&source=zxing")));
    }

    /* renamed from: g */
    public final AbstractC2914ly m12276g() {
        return this.f10522a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m12277g(String str) {
        StringBuilder sb;
        int i;
        Intent intent;
        try {
            if (!str.startsWith("HTTP://")) {
                if (str.startsWith("HTTPS://")) {
                    sb = new StringBuilder();
                    sb.append("https");
                    i = 5;
                }
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                m12257a(intent);
                return;
            }
            sb = new StringBuilder();
            sb.append("http");
            i = 4;
            m12257a(intent);
            return;
        } catch (ActivityNotFoundException unused) {
            String str2 = "Nothing available to handle " + intent;
            return;
        }
        sb.append(str.substring(i));
        str = sb.toString();
        intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    /* renamed from: h */
    public final EnumC2960my m12278h() {
        return this.f10522a.m13944b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m12279h(String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SEARCH_BOOK_CONTENTS");
        intent.setClassName(this.f10523b, SearchBookContentsActivity.class.getName());
        m12251a(intent, "ISBN", str);
        m12257a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m12280i(String str) {
        m12257a(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(str))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean m12281i() {
        return this.f10525d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m12282j(String str) {
        m12263a(null, null, null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m12283k(String str) {
        m12268b("smsto:", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m12284l(String str) {
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", str);
        m12257a(intent);
    }
}
