package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;

/* renamed from: com.comviva.webaxn.ui.m */
/* loaded from: classes.dex */
public class C0647m {

    /* renamed from: c */
    public static String f4007c;

    /* renamed from: d */
    public static byte[] f4008d;

    /* renamed from: e */
    private static final String[] f4009e = {"data1", "display_name", "contact_id", "photo_id"};

    /* renamed from: a */
    private String f4010a;

    /* renamed from: b */
    private Context f4011b;

    public C0647m(Context context) {
        this.f4011b = context;
        f4007c = null;
        f4008d = null;
    }

    /* renamed from: a */
    public void m4682a(String str) {
        String stripSeparators = PhoneNumberUtils.stripSeparators(str);
        Cursor query = this.f4011b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, f4009e, "PHONE_NUMBERS_EQUAL(data1,?) AND mimetype='vnd.android.cursor.item/phone_v2' AND raw_contact_id IN (SELECT raw_contact_id  FROM phone_lookup WHERE normalized_number GLOB('+*'))".replace("+", PhoneNumberUtils.toCallerIDMinMatch(stripSeparators)), new String[]{stripSeparators}, null);
        if (query == null) {
            String str2 = "getContactInfoForPhoneNumber(" + stripSeparators + ") returned NULL cursor! contact uri used " + ContactsContract.Data.CONTENT_URI;
            return;
        }
        try {
            if (query.moveToFirst()) {
                query.getString(0);
                f4007c = query.getString(1);
                this.f4010a = query.getString(3);
                Cursor query2 = this.f4011b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data15"}, "_id=?", new String[]{this.f4010a}, null);
                if (query2.moveToFirst()) {
                    f4008d = query2.getBlob(query2.getColumnIndex("data15"));
                    query2.close();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
    }
}
