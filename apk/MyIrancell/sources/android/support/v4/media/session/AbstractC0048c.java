package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0050e;
import android.support.v4.media.session.InterfaceC0046a;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0048c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f190a;

    /* renamed from: b */
    a f191b;

    /* renamed from: c */
    InterfaceC0046a f192c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    private static class b implements C0050e.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0048c> f193a;

        b(AbstractC0048c abstractC0048c) {
            this.f193a = new WeakReference<>(abstractC0048c);
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: a */
        public void mo294a(int i, int i2, int i3, int i4, int i5) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m290a(new C0049d(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: a */
        public void mo295a(CharSequence charSequence) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m291a(charSequence);
            }
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: a */
        public void mo296a(Object obj) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m288a(MediaMetadataCompat.m232a(obj));
            }
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: a */
        public void mo297a(String str, Bundle bundle) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                if (abstractC0048c.f192c == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0048c.m292a(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: a */
        public void mo298a(List<?> list) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m293a(MediaSessionCompat.QueueItem.m270a(list));
            }
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: b */
        public void mo299b(Object obj) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c == null || abstractC0048c.f192c != null) {
                return;
            }
            abstractC0048c.m289a(PlaybackStateCompat.m274a(obj));
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: c */
        public void mo300c() {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m285a();
            }
        }

        @Override // android.support.v4.media.session.C0050e.a
        /* renamed from: c */
        public void mo301c(Bundle bundle) {
            AbstractC0048c abstractC0048c = this.f193a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m287a(bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c */
    /* loaded from: classes.dex */
    public static class c extends InterfaceC0046a.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0048c> f194a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(AbstractC0048c abstractC0048c) {
            this.f194a = new WeakReference<>(abstractC0048c);
        }

        /* renamed from: a */
        public void mo262a(MediaMetadataCompat mediaMetadataCompat) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(3, mediaMetadataCompat, null);
            }
        }

        /* renamed from: a */
        public void mo263a(ParcelableVolumeInfo parcelableVolumeInfo) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(4, parcelableVolumeInfo != null ? new C0049d(parcelableVolumeInfo.f167b, parcelableVolumeInfo.f168c, parcelableVolumeInfo.f169d, parcelableVolumeInfo.f170e, parcelableVolumeInfo.f171f) : null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: a */
        public void mo276a(PlaybackStateCompat playbackStateCompat) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(2, playbackStateCompat, null);
            }
        }

        /* renamed from: a */
        public void mo264a(CharSequence charSequence) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: a */
        public void mo277a(String str, Bundle bundle) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(1, str, bundle);
            }
        }

        /* renamed from: a */
        public void mo265a(List<MediaSessionCompat.QueueItem> list) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: b */
        public void mo278b(int i) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(9, Integer.valueOf(i), null);
            }
        }

        /* renamed from: c */
        public void mo266c() {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(8, null, null);
            }
        }

        /* renamed from: c */
        public void mo267c(Bundle bundle) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: c */
        public void mo279c(boolean z) {
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: d */
        public void mo280d(int i) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: e */
        public void mo281e() {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0046a
        /* renamed from: e */
        public void mo282e(boolean z) {
            AbstractC0048c abstractC0048c = this.f194a.get();
            if (abstractC0048c != null) {
                abstractC0048c.m286a(11, Boolean.valueOf(z), null);
            }
        }
    }

    public AbstractC0048c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f190a = C0050e.m302a(new b(this));
        } else {
            this.f192c = new c(this);
        }
    }

    /* renamed from: a */
    public void m285a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m286a(int i, Object obj, Bundle bundle) {
        a aVar = this.f191b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: a */
    public void m287a(Bundle bundle) {
    }

    /* renamed from: a */
    public void m288a(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: a */
    public void m289a(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: a */
    public void m290a(C0049d c0049d) {
    }

    /* renamed from: a */
    public void m291a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void m292a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void m293a(List<MediaSessionCompat.QueueItem> list) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m286a(8, null, null);
    }
}
