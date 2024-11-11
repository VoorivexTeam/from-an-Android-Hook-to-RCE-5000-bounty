package com.comviva.webaxn.ui;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;

/* loaded from: classes.dex */
public class m {
    public static String c;
    public static byte[] d;
    private static final String[] e = {"data1", "display_name", "contact_id", "photo_id"};
    private String a;
    private Context b;

    public m(Context context) {
        this.b = context;
        c = null;
        d = null;
    }

    public void a(String str) {
        String stripSeparators = PhoneNumberUtils.stripSeparators(str);
        Cursor query = this.b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, e, "PHONE_NUMBERS_EQUAL(data1,?) AND mimetype='vnd.android.cursor.item/phone_v2' AND raw_contact_id IN (SELECT raw_contact_id  FROM phone_lookup WHERE normalized_number GLOB('+*'))".replace("+", PhoneNumberUtils.toCallerIDMinMatch(stripSeparators)), new String[]{stripSeparators}, null);
        if (query == null) {
            String str2 = "getContactInfoForPhoneNumber(" + stripSeparators + ") returned NULL cursor! contact uri used " + ContactsContract.Data.CONTENT_URI;
            return;
        }
        try {
            if (query.moveToFirst()) {
                query.getString(0);
                c = query.getString(1);
                this.a = query.getString(3);
                Cursor query2 = this.b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data15"}, "_id=?", new String[]{this.a}, null);
                if (query2.moveToFirst()) {
                    d = query2.getBlob(query2.getColumnIndex("data15"));
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
