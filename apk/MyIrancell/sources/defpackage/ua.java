package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ua extends sa<InputStream> {
    private static final UriMatcher e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        e.addURI("com.android.contacts", "contacts/lookup/*", 1);
        e.addURI("com.android.contacts", "contacts/#/photo", 2);
        e.addURI("com.android.contacts", "contacts/#", 3);
        e.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        e.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public ua(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream a(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    private InputStream b(Uri uri, ContentResolver contentResolver) {
        int match = e.match(uri);
        if (match != 1) {
            if (match == 3) {
                return a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.sa
    public InputStream a(Uri uri, ContentResolver contentResolver) {
        InputStream b = b(uri, contentResolver);
        if (b != null) {
            return b;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    @Override // defpackage.ka
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sa
    public void a(InputStream inputStream) {
        inputStream.close();
    }
}
