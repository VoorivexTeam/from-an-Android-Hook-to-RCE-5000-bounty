package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.zxing.client.android.R$string;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class bx extends hx {
    private static final int[] k = {R$string.button_add_calendar};

    public bx(Activity activity, ly lyVar) {
        super(activity, lyVar);
    }

    private static String a(boolean z, Date date) {
        if (date == null) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(date);
    }

    private void a(String str, Date date, boolean z, Date date2, String str2, String str3, String[] strArr) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        long time = date.getTime();
        intent.putExtra("beginTime", time);
        if (z) {
            intent.putExtra("allDay", true);
        }
        if (date2 != null) {
            time = date2.getTime();
        } else if (z) {
            time += 86400000;
        }
        intent.putExtra("endTime", time);
        intent.putExtra("title", str);
        intent.putExtra("eventLocation", str2);
        intent.putExtra("description", str3);
        if (strArr != null) {
            intent.putExtra("android.intent.extra.EMAIL", strArr);
        }
        try {
            b(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setAction("android.intent.action.EDIT");
            a(intent);
        }
    }

    @Override // defpackage.hx
    public int a(int i) {
        return k[i];
    }

    @Override // defpackage.hx
    public void b(int i) {
        String str;
        if (i == 0) {
            by byVar = (by) g();
            String d = byVar.d();
            String g = byVar.g();
            if (g != null) {
                if (d == null) {
                    str = g;
                    a(byVar.i(), byVar.h(), byVar.k(), byVar.e(), byVar.f(), str, byVar.c());
                } else {
                    d = d + '\n' + g;
                }
            }
            str = d;
            a(byVar.i(), byVar.h(), byVar.k(), byVar.e(), byVar.f(), str, byVar.c());
        }
    }

    @Override // defpackage.hx
    public int c() {
        return k.length;
    }

    @Override // defpackage.hx
    public CharSequence e() {
        by byVar = (by) g();
        StringBuilder sb = new StringBuilder(100);
        ly.a(byVar.i(), sb);
        Date h = byVar.h();
        ly.a(a(byVar.k(), h), sb);
        Date e = byVar.e();
        if (e != null) {
            if (byVar.j() && !h.equals(e)) {
                e = new Date(e.getTime() - 86400000);
            }
            ly.a(a(byVar.j(), e), sb);
        }
        ly.a(byVar.f(), sb);
        ly.a(byVar.g(), sb);
        ly.a(byVar.c(), sb);
        ly.a(byVar.d(), sb);
        return sb.toString();
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_calendar;
    }
}
