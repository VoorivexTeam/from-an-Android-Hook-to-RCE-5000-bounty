package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {
    final Object a;
    a b;
    android.support.v4.media.session.a c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends Handler {
    }

    /* loaded from: classes.dex */
    private static class b implements e.a {
        private final WeakReference<c> a;

        b(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        public void a(int i, int i2, int i3, int i4, int i5) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(new d(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(charSequence);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(Object obj) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                if (cVar.c == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.a(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(List<?> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(MediaSessionCompat.QueueItem.a(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(Object obj) {
            c cVar = this.a.get();
            if (cVar == null || cVar.c != null) {
                return;
            }
            cVar.a(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.e.a
        public void c() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class BinderC0004c extends a.AbstractBinderC0002a {
        private final WeakReference<c> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC0004c(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(3, mediaMetadataCompat, null);
            }
        }

        public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e, parcelableVolumeInfo.f) : null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(2, playbackStateCompat, null);
            }
        }

        public void a(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(1, str, bundle);
            }
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void b(int i) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(9, Integer.valueOf(i), null);
            }
        }

        public void c() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(8, null, null);
            }
        }

        public void c(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void c(boolean z) {
        }

        @Override // android.support.v4.media.session.a
        public void d(int i) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void e() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void e(boolean z) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(11, Boolean.valueOf(z), null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = e.a(new b(this));
        } else {
            this.c = new BinderC0004c(this);
        }
    }

    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, Object obj, Bundle bundle) {
        a aVar = this.b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public void a(Bundle bundle) {
    }

    public void a(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void a(PlaybackStateCompat playbackStateCompat) {
    }

    public void a(d dVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void a(String str, Bundle bundle) {
    }

    public void a(List<MediaSessionCompat.QueueItem> list) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a(8, null, null);
    }
}
