package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: ua */
/* loaded from: classes.dex */
public class C3298ua extends AbstractC3201sa<InputStream> {

    /* renamed from: e */
    private static final UriMatcher f13454e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13454e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f13454e.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f13454e.addURI("com.android.contacts", "contacts/#/photo", 2);
        f13454e.addURI("com.android.contacts", "contacts/#", 3);
        f13454e.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f13454e.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C3298ua(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    private InputStream m15783a(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: b */
    private InputStream m15784b(Uri uri, ContentResolver contentResolver) {
        int match = f13454e.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m15783a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m15783a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC3201sa
    /* renamed from: a */
    public InputStream mo12154a(Uri uri, ContentResolver contentResolver) {
        InputStream m15784b = m15784b(uri, contentResolver);
        if (m15784b != null) {
            return m15784b;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public Class<InputStream> mo3663a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC3201sa
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo12155a(InputStream inputStream) {
        inputStream.close();
    }
}
