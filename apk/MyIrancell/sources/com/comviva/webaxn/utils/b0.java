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
import com.mtni.myirancell.R;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class b0 {
    private static b0 i;
    private Context a;
    private HashMap<String, String> b;
    private wj c;
    private yj d;
    private e e;
    private mj f;
    private lj g;
    private ProgressDialog h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AsyncTask<int[], Void, Boolean> {
        final /* synthetic */ GregorianCalendar a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ int f;

        a(GregorianCalendar gregorianCalendar, int i, int i2, String str, String str2, int i3) {
            this.a = gregorianCalendar;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = str2;
            this.f = i3;
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
                b0 b0Var = b0.this;
                GregorianCalendar gregorianCalendar = this.a;
                if (i5 == 0) {
                    i = iArr2[1];
                    i2 = iArr2[2];
                    i3 = iArr2[1];
                } else {
                    i = iArr2[1] + 1;
                    i2 = iArr2[2];
                    i3 = iArr2[1] + 1;
                }
                iArr2 = b0Var.a(gregorianCalendar, i4, i, i2, b0Var.a(gregorianCalendar, i3));
                long a = b0.this.a(iArr2[2], iArr2[1], iArr2[0], this.b, this.c);
                b0 b0Var2 = b0.this;
                b0Var2.a((Activity) b0Var2.a, this.d, this.e, a, a + 3600000, false, true, 1, 0, this.f);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                b0.this.d();
                b0.this.b();
            }
        }
    }

    private b0(Context context) {
        this.a = context;
    }

    public static b0 a(Context context) {
        if (i == null) {
            i = new b0(context);
        }
        return i;
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public long a(int i2, int i3, int i4, int i5, int i6) {
        try {
            return new GregorianCalendar(i2, i3, i4, i5, i6).getTimeInMillis();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public String a(String str, com.comviva.webaxn.ui.o1 o1Var) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("$")) {
            return x1.a(this.g.f(), str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length()), o1Var, true);
        }
        return str;
    }

    public void a() {
        if (i != null) {
            i = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.f = null;
    }

    public void a(com.comviva.webaxn.ui.o1 o1Var) {
        String str;
        x1.l = true;
        String a2 = a(this.b.get("name"), o1Var);
        String a3 = a(this.b.get("desc"), o1Var);
        String a4 = a(this.b.get("day"), o1Var);
        String a5 = a(this.b.get("hour"), o1Var);
        String a6 = a(this.b.get("min"), o1Var);
        String a7 = a(this.b.get("month"), o1Var);
        String a8 = a(this.b.get("year"), o1Var);
        String a9 = a(this.b.get("format"), o1Var);
        String a10 = a(this.b.get("repeat"), o1Var);
        if (x1.l) {
            int a11 = !TextUtils.isEmpty(a4) ? a(a4) : -1;
            int a12 = !TextUtils.isEmpty(a5) ? a(a5) : -1;
            int a13 = !TextUtils.isEmpty(a6) ? a(a6) : -1;
            int a14 = !TextUtils.isEmpty(a7) ? a(a7) : -1;
            int a15 = !TextUtils.isEmpty(a8) ? a(a8) : -1;
            if (!TextUtils.isEmpty(a9) && a9.equalsIgnoreCase("pm") && a12 != -1 && (a12 = a12 + 12) == 24) {
                a12 = 0;
            }
            int a16 = !TextUtils.isEmpty(a10) ? a(a10) : 0;
            GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
            int i2 = a11 == -1 ? gregorianCalendar.get(5) : a11;
            int i3 = a12 == -1 ? gregorianCalendar.get(11) : a12;
            int i4 = a13 == -1 ? gregorianCalendar.get(12) : a13;
            if (a14 == -1) {
                a14 = gregorianCalendar.get(2);
            }
            if (a15 == -1) {
                a15 = gregorianCalendar.get(1);
            }
            if (a16 != 0) {
                c();
                a(gregorianCalendar, i2, a14, a15, i3, i4, a2, a3, a16);
                return;
            }
            int[] a17 = a(gregorianCalendar, i2, a14, a15, a(gregorianCalendar, a14));
            long a18 = a(a17[2], a17[1], a17[0], i3, i4);
            boolean a19 = a((Activity) this.a, a2, a3, a18, a18 + 3600000, false, true, 1, 0, a16);
            if (a19) {
                str = "msg.CESuccess";
            } else {
                a19 = !a19;
                str = "msg.CEFail";
            }
            a(str, a19);
            b();
        }
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, com.comviva.webaxn.ui.o1 o1Var) {
        this.c = wjVar;
        this.d = yjVar;
        this.e = eVar;
        this.f = mjVar;
        this.g = ljVar;
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null && hashMap.size() > 0) {
            this.b.clear();
        }
        this.b = x1.f(str);
        a(o1Var);
    }

    public void a(String str, boolean z) {
        Context context;
        int i2;
        String c = j1.a(this.a).c(str);
        if (z) {
            if (TextUtils.isEmpty(c)) {
                context = this.a;
                i2 = R.string.calendar_event_success;
                c = context.getString(i2);
            }
        } else if (TextUtils.isEmpty(c)) {
            context = this.a;
            i2 = R.string.calendar_event_failure;
            c = context.getString(i2);
        }
        Toast.makeText(this.a, c, 0).show();
    }

    public void a(GregorianCalendar gregorianCalendar, int i2, int i3, int i4, int i5, int i6, String str, String str2, int i7) {
        int[] iArr = {i2, i3, i4};
        a aVar = new a(gregorianCalendar, i5, i6, str, str2, i7);
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

    public boolean a(Activity activity, String str, String str2, long j, long j2, boolean z, boolean z2, int i2, int i3, int i4) {
        try {
            ContentResolver contentResolver = activity.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("dtstart", Long.valueOf(j));
            contentValues.put("dtend", Long.valueOf(j2));
            contentValues.put("title", str);
            contentValues.put("description", str2);
            contentValues.put("calendar_id", Integer.valueOf(i2));
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
            contentValues2.put("minutes", Integer.valueOf(i3));
            contentResolver.insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean a(GregorianCalendar gregorianCalendar, int i2) {
        return i2 == gregorianCalendar.get(2);
    }

    public int[] a(GregorianCalendar gregorianCalendar, int i2, int i3, int i4, boolean z) {
        int[] iArr = {i2, i3, i4};
        if (z && i2 < gregorianCalendar.get(5)) {
            iArr[1] = i3 + 1;
            if (iArr[1] > 11) {
                iArr[2] = i4 + 1;
                iArr[1] = 0;
            }
        } else if (iArr[1] > 11) {
            iArr[2] = i4 + 1;
            iArr[1] = 0;
        }
        int i5 = iArr[1];
        if (i5 != 1) {
            if (i5 != 3) {
                if (i5 != 5) {
                    if (i5 != 8) {
                        if (i5 == 10 && i2 == 31) {
                            iArr[0] = 30;
                        }
                    } else if (i2 == 31) {
                        iArr[0] = 30;
                    }
                } else if (i2 == 31) {
                    iArr[0] = 30;
                }
            } else if (i2 == 31) {
                iArr[0] = 30;
            }
        } else if (i2 == 29 || i2 == 30 || i2 == 31) {
            if (gregorianCalendar.isLeapYear(iArr[2])) {
                iArr[0] = 29;
            } else {
                iArr[0] = 28;
            }
        }
        return iArr;
    }

    public void b() {
        String str = this.b.get("action");
        if (TextUtils.isEmpty(str) || this.c.a(str, false, this.d, this.e, this.f, this.g)) {
            return;
        }
        xj a2 = x1.a(str, this.f.i());
        if (a2 != null) {
            this.f.a(a2);
        }
        String str2 = null;
        yj yjVar = this.d;
        if (yjVar != null) {
            str2 = yjVar.j;
        } else {
            e eVar = this.e;
            if (eVar != null) {
                str2 = eVar.j;
            }
        }
        if (this.c.a(str, false, false, this.f, false, false, str2, this.g) > 0) {
            this.c.E();
        }
    }

    public void c() {
        ProgressDialog progressDialog = this.h;
        if (progressDialog == null || !progressDialog.isShowing()) {
            String b0 = j1.a(this.a).b0();
            int a0 = j1.a(this.a).a0();
            if (-1 >= a0) {
                a0 = 0;
            }
            String c = j1.a(this.a).c("lbl.CalEvent");
            if (TextUtils.isEmpty(c)) {
                c = this.a.getString(R.string.saving_calevent);
            }
            ProgressDialog show = ProgressDialog.show(this.a, "", c, true);
            this.h = show;
            try {
                TextView textView = (TextView) show.findViewById(android.R.id.message);
                if (!TextUtils.isEmpty(b0)) {
                    textView.setTypeface(v.a(b0), com.comviva.webaxn.ui.n1.e(a0));
                }
            } catch (Exception unused) {
            }
            this.h.setCancelable(false);
            this.h.setCanceledOnTouchOutside(false);
        }
    }

    public void d() {
        ProgressDialog progressDialog = this.h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.h = null;
        }
    }
}
