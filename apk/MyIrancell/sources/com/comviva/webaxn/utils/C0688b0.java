package com.comviva.webaxn.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0655o1;
import com.mtni.myirancell.R;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.b0 */
/* loaded from: classes.dex */
public class C0688b0 {

    /* renamed from: i */
    private static C0688b0 f4648i;

    /* renamed from: a */
    private Context f4649a;

    /* renamed from: b */
    private HashMap<String, String> f4650b;

    /* renamed from: c */
    private C3400wj f4651c;

    /* renamed from: d */
    private C3489yj f4652d;

    /* renamed from: e */
    private C0696e f4653e;

    /* renamed from: f */
    private C2945mj f4654f;

    /* renamed from: g */
    private C2899lj f4655g;

    /* renamed from: h */
    private ProgressDialog f4656h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.b0$a */
    /* loaded from: classes.dex */
    public class a extends AsyncTask<int[], Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ GregorianCalendar f4657a;

        /* renamed from: b */
        final /* synthetic */ int f4658b;

        /* renamed from: c */
        final /* synthetic */ int f4659c;

        /* renamed from: d */
        final /* synthetic */ String f4660d;

        /* renamed from: e */
        final /* synthetic */ String f4661e;

        /* renamed from: f */
        final /* synthetic */ int f4662f;

        a(GregorianCalendar gregorianCalendar, int i, int i2, String str, String str2, int i3) {
            this.f4657a = gregorianCalendar;
            this.f4658b = i;
            this.f4659c = i2;
            this.f4660d = str;
            this.f4661e = str2;
            this.f4662f = i3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(int[]... iArr) {
            int i;
            int i2;
            int i3;
            int[] iArr2 = iArr[0];
            int i4 = iArr2[0];
            for (int i5 = 0; i5 < 12; i5++) {
                C0688b0 c0688b0 = C0688b0.this;
                GregorianCalendar gregorianCalendar = this.f4657a;
                if (i5 == 0) {
                    i = iArr2[1];
                    i2 = iArr2[2];
                    i3 = iArr2[1];
                } else {
                    i = iArr2[1] + 1;
                    i2 = iArr2[2];
                    i3 = iArr2[1] + 1;
                }
                iArr2 = c0688b0.m5357a(gregorianCalendar, i4, i, i2, c0688b0.m5356a(gregorianCalendar, i3));
                long m5348a = C0688b0.this.m5348a(iArr2[2], iArr2[1], iArr2[0], this.f4658b, this.f4659c);
                C0688b0 c0688b02 = C0688b0.this;
                c0688b02.m5355a((Activity) c0688b02.f4649a, this.f4660d, this.f4661e, m5348a, m5348a + 3600000, false, true, 1, 0, this.f4662f);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                C0688b0.this.m5360d();
                C0688b0.this.m5358b();
            }
        }
    }

    private C0688b0(Context context) {
        this.f4649a = context;
    }

    /* renamed from: a */
    public static C0688b0 m5346a(Context context) {
        if (f4648i == null) {
            f4648i = new C0688b0(context);
        }
        return f4648i;
    }

    /* renamed from: a */
    public int m5347a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public long m5348a(int i, int i2, int i3, int i4, int i5) {
        try {
            return new GregorianCalendar(i, i2, i3, i4, i5).getTimeInMillis();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: a */
    public String m5349a(String str, C0655o1 c0655o1) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("$")) {
            return C0755x1.m6132a(this.f4655g.m13901f(), str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length()), c0655o1, true);
        }
        return str;
    }

    /* renamed from: a */
    public void m5350a() {
        if (f4648i != null) {
            f4648i = null;
        }
        HashMap<String, String> hashMap = this.f4650b;
        if (hashMap != null) {
            hashMap.clear();
            this.f4650b = null;
        }
        this.f4651c = null;
        this.f4652d = null;
        this.f4653e = null;
        this.f4655g = null;
        this.f4654f = null;
    }

    /* renamed from: a */
    public void m5351a(C0655o1 c0655o1) {
        String str;
        C0755x1.f5254l = true;
        String m5349a = m5349a(this.f4650b.get("name"), c0655o1);
        String m5349a2 = m5349a(this.f4650b.get("desc"), c0655o1);
        String m5349a3 = m5349a(this.f4650b.get("day"), c0655o1);
        String m5349a4 = m5349a(this.f4650b.get("hour"), c0655o1);
        String m5349a5 = m5349a(this.f4650b.get("min"), c0655o1);
        String m5349a6 = m5349a(this.f4650b.get("month"), c0655o1);
        String m5349a7 = m5349a(this.f4650b.get("year"), c0655o1);
        String m5349a8 = m5349a(this.f4650b.get("format"), c0655o1);
        String m5349a9 = m5349a(this.f4650b.get("repeat"), c0655o1);
        if (C0755x1.f5254l) {
            int m5347a = !TextUtils.isEmpty(m5349a3) ? m5347a(m5349a3) : -1;
            int m5347a2 = !TextUtils.isEmpty(m5349a4) ? m5347a(m5349a4) : -1;
            int m5347a3 = !TextUtils.isEmpty(m5349a5) ? m5347a(m5349a5) : -1;
            int m5347a4 = !TextUtils.isEmpty(m5349a6) ? m5347a(m5349a6) : -1;
            int m5347a5 = !TextUtils.isEmpty(m5349a7) ? m5347a(m5349a7) : -1;
            if (!TextUtils.isEmpty(m5349a8) && m5349a8.equalsIgnoreCase("pm") && m5347a2 != -1 && (m5347a2 = m5347a2 + 12) == 24) {
                m5347a2 = 0;
            }
            int m5347a6 = !TextUtils.isEmpty(m5349a9) ? m5347a(m5349a9) : 0;
            GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
            int i = m5347a == -1 ? gregorianCalendar.get(5) : m5347a;
            int i2 = m5347a2 == -1 ? gregorianCalendar.get(11) : m5347a2;
            int i3 = m5347a3 == -1 ? gregorianCalendar.get(12) : m5347a3;
            if (m5347a4 == -1) {
                m5347a4 = gregorianCalendar.get(2);
            }
            if (m5347a5 == -1) {
                m5347a5 = gregorianCalendar.get(1);
            }
            if (m5347a6 != 0) {
                m5359c();
                m5354a(gregorianCalendar, i, m5347a4, m5347a5, i2, i3, m5349a, m5349a2, m5347a6);
                return;
            }
            int[] m5357a = m5357a(gregorianCalendar, i, m5347a4, m5347a5, m5356a(gregorianCalendar, m5347a4));
            long m5348a = m5348a(m5357a[2], m5357a[1], m5357a[0], i2, i3);
            boolean m5355a = m5355a((Activity) this.f4649a, m5349a, m5349a2, m5348a, m5348a + 3600000, false, true, 1, 0, m5347a6);
            if (m5355a) {
                str = "msg.CESuccess";
            } else {
                m5355a = !m5355a;
                str = "msg.CEFail";
            }
            m5353a(str, m5355a);
            m5358b();
        }
    }

    /* renamed from: a */
    public void m5352a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, C0655o1 c0655o1) {
        this.f4651c = c3400wj;
        this.f4652d = c3489yj;
        this.f4653e = c0696e;
        this.f4654f = c2945mj;
        this.f4655g = c2899lj;
        HashMap<String, String> hashMap = this.f4650b;
        if (hashMap != null && hashMap.size() > 0) {
            this.f4650b.clear();
        }
        this.f4650b = C0755x1.m6188f(str);
        m5351a(c0655o1);
    }

    /* renamed from: a */
    public void m5353a(String str, boolean z) {
        Context context;
        int i;
        String m5641c = C0713j1.m5563a(this.f4649a).m5641c(str);
        if (z) {
            if (TextUtils.isEmpty(m5641c)) {
                context = this.f4649a;
                i = R.string.calendar_event_success;
                m5641c = context.getString(i);
            }
        } else if (TextUtils.isEmpty(m5641c)) {
            context = this.f4649a;
            i = R.string.calendar_event_failure;
            m5641c = context.getString(i);
        }
        Toast.makeText(this.f4649a, m5641c, 0).show();
    }

    /* renamed from: a */
    public void m5354a(GregorianCalendar gregorianCalendar, int i, int i2, int i3, int i4, int i5, String str, String str2, int i6) {
        int[] iArr = {i, i2, i3};
        a aVar = new a(gregorianCalendar, i4, i5, str, str2, i6);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, iArr);
            } else {
                aVar.execute(iArr);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m5355a(Activity activity, String str, String str2, long j, long j2, boolean z, boolean z2, int i, int i2, int i3) {
        try {
            ContentResolver contentResolver = activity.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("dtstart", Long.valueOf(j));
            contentValues.put("dtend", Long.valueOf(j2));
            contentValues.put("title", str);
            contentValues.put("description", str2);
            contentValues.put("calendar_id", Integer.valueOf(i));
            if (z) {
                contentValues.put("allDay", (Boolean) true);
            }
            if (z2) {
                contentValues.put("hasAlarm", (Boolean) true);
            }
            contentValues.put("eventTimezone", TimeZone.getDefault().getID());
            long parseLong = Long.parseLong(contentResolver.insert(CalendarContract.Events.CONTENT_URI, contentValues).getLastPathSegment());
            if (!z2) {
                return true;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(parseLong));
            contentValues2.put("method", (Integer) 1);
            contentValues2.put("minutes", Integer.valueOf(i2));
            contentResolver.insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m5356a(GregorianCalendar gregorianCalendar, int i) {
        return i == gregorianCalendar.get(2);
    }

    /* renamed from: a */
    public int[] m5357a(GregorianCalendar gregorianCalendar, int i, int i2, int i3, boolean z) {
        int[] iArr = {i, i2, i3};
        if (z && i < gregorianCalendar.get(5)) {
            iArr[1] = i2 + 1;
            if (iArr[1] > 11) {
                iArr[2] = i3 + 1;
                iArr[1] = 0;
            }
        } else if (iArr[1] > 11) {
            iArr[2] = i3 + 1;
            iArr[1] = 0;
        }
        int i4 = iArr[1];
        if (i4 != 1) {
            if (i4 != 3) {
                if (i4 != 5) {
                    if (i4 != 8) {
                        if (i4 == 10 && i == 31) {
                            iArr[0] = 30;
                        }
                    } else if (i == 31) {
                        iArr[0] = 30;
                    }
                } else if (i == 31) {
                    iArr[0] = 30;
                }
            } else if (i == 31) {
                iArr[0] = 30;
            }
        } else if (i == 29 || i == 30 || i == 31) {
            if (gregorianCalendar.isLeapYear(iArr[2])) {
                iArr[0] = 29;
            } else {
                iArr[0] = 28;
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public void m5358b() {
        String str = this.f4650b.get("action");
        if (TextUtils.isEmpty(str) || this.f4651c.m16298a(str, false, this.f4652d, this.f4653e, this.f4654f, this.f4655g)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str, this.f4654f.m14145i());
        if (m6134a != null) {
            this.f4654f.m14121a(m6134a);
        }
        String str2 = null;
        C3489yj c3489yj = this.f4652d;
        if (c3489yj != null) {
            str2 = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4653e;
            if (c0696e != null) {
                str2 = c0696e.f4718j;
            }
        }
        if (this.f4651c.m16263a(str, false, false, this.f4654f, false, false, str2, this.f4655g) > 0) {
            this.f4651c.m16258E();
        }
    }

    /* renamed from: c */
    public void m5359c() {
        ProgressDialog progressDialog = this.f4656h;
        if (progressDialog == null || !progressDialog.isShowing()) {
            String m5639b0 = C0713j1.m5563a(this.f4649a).m5639b0();
            int m5631a0 = C0713j1.m5563a(this.f4649a).m5631a0();
            if (-1 >= m5631a0) {
                m5631a0 = 0;
            }
            String m5641c = C0713j1.m5563a(this.f4649a).m5641c("lbl.CalEvent");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = this.f4649a.getString(R.string.saving_calevent);
            }
            ProgressDialog show = ProgressDialog.show(this.f4649a, "", m5641c, true);
            this.f4656h = show;
            try {
                TextView textView = (TextView) show.findViewById(android.R.id.message);
                if (!TextUtils.isEmpty(m5639b0)) {
                    textView.setTypeface(C0747v.m6081a(m5639b0), AbstractC0652n1.m4702e(m5631a0));
                }
            } catch (Exception unused) {
            }
            this.f4656h.setCancelable(false);
            this.f4656h.setCanceledOnTouchOutside(false);
        }
    }

    /* renamed from: d */
    public void m5360d() {
        ProgressDialog progressDialog = this.f4656h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f4656h = null;
        }
    }
}
