package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0048c;
import android.support.v4.media.session.InterfaceC0047b;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.C0225c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f155a;

    /* renamed from: b */
    private final List<AbstractC0048c> f156b;

    /* renamed from: c */
    private HashMap<AbstractC0048c, BinderC0039a> f157c;

    /* renamed from: d */
    final MediaSessionCompat.Token f158d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: b */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f159b;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f159b.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f155a) {
                mediaControllerCompat$MediaControllerImplApi21.f158d.m273a(InterfaceC0047b.a.m284a(C0225c.m1369a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f158d.m272a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m261a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC0039a extends AbstractC0048c.c {
        BinderC0039a(AbstractC0048c abstractC0048c) {
            super(abstractC0048c);
        }

        @Override // android.support.v4.media.session.AbstractC0048c.c, android.support.v4.media.session.InterfaceC0046a
        /* renamed from: a */
        public void mo262a(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0048c.c, android.support.v4.media.session.InterfaceC0046a
        /* renamed from: a */
        public void mo263a(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0048c.c, android.support.v4.media.session.InterfaceC0046a
        /* renamed from: a */
        public void mo264a(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0048c.c, android.support.v4.media.session.InterfaceC0046a
        /* renamed from: a */
        public void mo265a(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0048c.c, android.support.v4.media.session.InterfaceC0046a
        /* renamed from: c */
        public void mo266c() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0048c.c, android.support.v4.media.session.InterfaceC0046a
        /* renamed from: c */
        public void mo267c(Bundle bundle) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m261a() {
        if (this.f158d.m271a() == null) {
            return;
        }
        for (AbstractC0048c abstractC0048c : this.f156b) {
            BinderC0039a binderC0039a = new BinderC0039a(abstractC0048c);
            this.f157c.put(abstractC0048c, binderC0039a);
            abstractC0048c.f192c = binderC0039a;
            try {
                this.f158d.m271a().mo283a(binderC0039a);
                abstractC0048c.m286a(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        this.f156b.clear();
    }
}
