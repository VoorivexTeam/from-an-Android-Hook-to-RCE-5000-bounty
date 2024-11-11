package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.zxing.client.android.R$string;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: bx */
/* loaded from: classes.dex */
public final class C0496bx extends AbstractC2569hx {

    /* renamed from: k */
    private static final int[] f2828k = {R$string.button_add_calendar};

    public C0496bx(Activity activity, AbstractC2914ly abstractC2914ly) {
        super(activity, abstractC2914ly);
    }

    /* renamed from: a */
    private static String m3452a(boolean z, Date date) {
        if (date == null) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(date);
    }

    /* renamed from: a */
    private void m3453a(String str, Date date, boolean z, Date date2, String str2, String str3, String[] strArr) {
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
            m12266b(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setAction("android.intent.action.EDIT");
            m12257a(intent);
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return f2828k[i];
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        String str;
        if (i == 0) {
            C0497by c0497by = (C0497by) m12276g();
            String m3461d = c0497by.m3461d();
            String m3464g = c0497by.m3464g();
            if (m3464g != null) {
                if (m3461d == null) {
                    str = m3464g;
                    m3453a(c0497by.m3466i(), c0497by.m3465h(), c0497by.m3468k(), c0497by.m3462e(), c0497by.m3463f(), str, c0497by.m3460c());
                } else {
                    m3461d = m3461d + '\n' + m3464g;
                }
            }
            str = m3461d;
            m3453a(c0497by.m3466i(), c0497by.m3465h(), c0497by.m3468k(), c0497by.m3462e(), c0497by.m3463f(), str, c0497by.m3460c());
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return f2828k.length;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: e */
    public CharSequence mo3200e() {
        C0497by c0497by = (C0497by) m12276g();
        StringBuilder sb = new StringBuilder(100);
        AbstractC2914ly.m13942a(c0497by.m3466i(), sb);
        Date m3465h = c0497by.m3465h();
        AbstractC2914ly.m13942a(m3452a(c0497by.m3468k(), m3465h), sb);
        Date m3462e = c0497by.m3462e();
        if (m3462e != null) {
            if (c0497by.m3467j() && !m3465h.equals(m3462e)) {
                m3462e = new Date(m3462e.getTime() - 86400000);
            }
            AbstractC2914ly.m13942a(m3452a(c0497by.m3467j(), m3462e), sb);
        }
        AbstractC2914ly.m13942a(c0497by.m3463f(), sb);
        AbstractC2914ly.m13942a(c0497by.m3464g(), sb);
        AbstractC2914ly.m13943a(c0497by.m3460c(), sb);
        AbstractC2914ly.m13942a(c0497by.m3461d(), sb);
        return sb.toString();
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_calendar;
    }
}
