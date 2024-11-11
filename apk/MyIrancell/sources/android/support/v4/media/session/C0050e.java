package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
class C0050e {

    /* renamed from: android.support.v4.media.session.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo294a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo295a(CharSequence charSequence);

        /* renamed from: a */
        void mo296a(Object obj);

        /* renamed from: a */
        void mo297a(String str, Bundle bundle);

        /* renamed from: a */
        void mo298a(List<?> list);

        /* renamed from: b */
        void mo299b(Object obj);

        /* renamed from: c */
        void mo300c();

        /* renamed from: c */
        void mo301c(Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.e$b */
    /* loaded from: classes.dex */
    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f195a;

        public b(T t) {
            this.f195a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f195a.mo294a(playbackInfo.getPlaybackType(), c.m305b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m268a(bundle);
            this.f195a.mo301c(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f195a.mo296a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f195a.mo299b(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f195a.mo298a(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f195a.mo295a(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f195a.mo300c();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m268a(bundle);
            this.f195a.mo297a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        private static int m303a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m304a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m305b(Object obj) {
            return m303a(m304a(obj));
        }
    }

    /* renamed from: a */
    public static Object m302a(a aVar) {
        return new b(aVar);
    }
}
