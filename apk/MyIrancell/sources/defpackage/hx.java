package defpackage;

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
import com.google.zxing.client.android.R$string;
import com.google.zxing.client.android.book.SearchBookContentsActivity;
import com.google.zxing.client.android.d;
import com.google.zxing.client.android.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class hx {
    private static final String[] e = {"home", "work", "mobile"};
    private static final String[] f = {"home", "work", "mobile", "fax", "pager", "main"};
    private static final String[] g = {"home", "work"};
    private static final int[] h = {1, 2, 4};
    private static final int[] i = {1, 3, 2, 4, 6, 12};
    private static final int[] j = {1, 2};
    private final ly a;
    private final Activity b;
    private final fw c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hx(Activity activity, ly lyVar) {
        this(activity, lyVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hx(Activity activity, ly lyVar, fw fwVar) {
        this.a = lyVar;
        this.b = activity;
        this.c = fwVar;
        this.d = j();
    }

    private static int a(String str, String[] strArr, int[] iArr) {
        if (str == null) {
            return -1;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if (str.startsWith(str2) || str.startsWith(str2.toUpperCase(Locale.ENGLISH))) {
                return iArr[i2];
            }
        }
        return -1;
    }

    private static void a(Intent intent, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        intent.putExtra(str, str2);
    }

    private String j() {
        String string = PreferenceManager.getDefaultSharedPreferences(this.b).getString("preferences_custom_product_search", null);
        if (string == null || !string.trim().isEmpty()) {
            return string;
        }
        return null;
    }

    private static int m(String str) {
        return a(str, g, j);
    }

    private static int n(String str) {
        return a(str, e, h);
    }

    private static int o(String str) {
        return a(str, f, i);
    }

    public abstract int a(int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(double d, double d2) {
        a(new Intent("android.intent.action.VIEW", Uri.parse("https://maps.google." + m.c(this.b) + "/maps?f=d&daddr=" + d + ',' + d2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Intent intent) {
        try {
            b(intent);
        } catch (ActivityNotFoundException unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
            builder.setTitle(R$string.app_name);
            builder.setMessage(R$string.msg_intent_failed);
            builder.setPositiveButton(R$string.button_ok, (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        a(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        b("smsto:" + str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, String str3) {
        b("mmsto:" + str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String[] strArr, String[] strArr2) {
        a(null, null, null, null, null, strArr, strArr2, null, null, null, null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String str4, String str5, String str6, String str7, String[] strArr7, String str8, String[] strArr8) {
        int m;
        int n;
        int o;
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/contact");
        a(intent, "name", strArr != null ? strArr[0] : null);
        a(intent, "phonetic_name", str);
        int min = Math.min(strArr3 != null ? strArr3.length : 0, d.a.length);
        for (int i2 = 0; i2 < min; i2++) {
            a(intent, d.a[i2], strArr3[i2]);
            if (strArr4 != null && i2 < strArr4.length && (o = o(strArr4[i2])) >= 0) {
                intent.putExtra(d.b[i2], o);
            }
        }
        int min2 = Math.min(strArr5 != null ? strArr5.length : 0, d.c.length);
        for (int i3 = 0; i3 < min2; i3++) {
            a(intent, d.c[i3], strArr5[i3]);
            if (strArr6 != null && i3 < strArr6.length && (n = n(strArr6[i3])) >= 0) {
                intent.putExtra(d.d[i3], n);
            }
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (strArr7 != null) {
            int length = strArr7.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                String str9 = strArr7[i4];
                if (str9 != null && !str9.isEmpty()) {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("mimetype", "vnd.android.cursor.item/website");
                    contentValues.put("data1", str9);
                    arrayList.add(contentValues);
                    break;
                }
                i4++;
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
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                String str10 = strArr2[i5];
                if (str10 != null && !str10.isEmpty()) {
                    ContentValues contentValues3 = new ContentValues(3);
                    contentValues3.put("mimetype", "vnd.android.cursor.item/nickname");
                    contentValues3.put("data2", (Integer) 1);
                    contentValues3.put("data1", str10);
                    arrayList.add(contentValues3);
                    break;
                }
                i5++;
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
            a(intent, "notes", sb.substring(1));
        }
        a(intent, "im_handle", str3);
        a(intent, "postal", str4);
        if (str5 != null && (m = m(str5)) >= 0) {
            intent.putExtra("postal_type", m);
        }
        a(intent, "company", str6);
        a(intent, "job_title", str7);
        a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
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
        a(intent, "android.intent.extra.SUBJECT", str);
        a(intent, "android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        a(intent);
    }

    public boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Activity b() {
        return this.b;
    }

    public abstract void b(int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Intent intent) {
        if (intent != null) {
            intent.addFlags(524288);
            String str = "Launching intent: " + intent + " with extras: " + intent.getExtras();
            this.b.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str) {
        a(new Intent("android.intent.action.DIAL", Uri.parse(str)));
    }

    final void b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        a(intent, "sms_body", str2);
        intent.putExtra("compose_mode", true);
        a(intent);
    }

    final void b(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        if (str2 == null || str2.isEmpty()) {
            str2 = this.b.getString(R$string.msg_default_mms_subject);
        }
        a(intent, "subject", str2);
        a(intent, "sms_body", str3);
        intent.putExtra("compose_mode", true);
        a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String[] strArr, String[] strArr2) {
        a(null, null, null, strArr, strArr2, null, null, null, null, null, null, null, null, null, null, null);
    }

    public abstract int c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c(String str) {
        if (this.d == null) {
            return str;
        }
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String str2 = this.d;
        fw fwVar = this.c;
        if (fwVar != null) {
            str2 = str2.replaceFirst("%f(?![0-9a-f])", fwVar.a().toString());
            if (str2.contains("%t")) {
                str2 = str2.replace("%t", py.c(this.c).b().toString());
            }
        }
        return str2.replace("%s", str);
    }

    public Integer d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        a(new Intent("android.intent.action.VIEW", Uri.parse("https://books.google." + m.a(this.b) + "/books?vid=isbn" + str)));
    }

    public CharSequence e() {
        return this.a.a().replace("\r", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str) {
        a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public abstract int f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str) {
        a(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google." + m.d(this.b) + "/m/products?q=" + str + "&source=zxing")));
    }

    public final ly g() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str) {
        StringBuilder sb;
        int i2;
        Intent intent;
        try {
            if (!str.startsWith("HTTP://")) {
                if (str.startsWith("HTTPS://")) {
                    sb = new StringBuilder();
                    sb.append("https");
                    i2 = 5;
                }
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                a(intent);
                return;
            }
            sb = new StringBuilder();
            sb.append("http");
            i2 = 4;
            a(intent);
            return;
        } catch (ActivityNotFoundException unused) {
            String str2 = "Nothing available to handle " + intent;
            return;
        }
        sb.append(str.substring(i2));
        str = sb.toString();
        intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public final my h() {
        return this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SEARCH_BOOK_CONTENTS");
        intent.setClassName(this.b, SearchBookContentsActivity.class.getName());
        a(intent, "ISBN", str);
        a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(String str) {
        a(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(str))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(String str) {
        a(null, null, null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(String str) {
        b("smsto:", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(String str) {
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", str);
        a(intent);
    }
}
