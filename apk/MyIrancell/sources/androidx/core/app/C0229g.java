package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0228f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.g */
/* loaded from: classes.dex */
public class C0229g implements InterfaceC0227e {

    /* renamed from: a */
    private final Notification.Builder f1436a;

    /* renamed from: b */
    private final C0228f.d f1437b;

    /* renamed from: c */
    private RemoteViews f1438c;

    /* renamed from: d */
    private RemoteViews f1439d;

    /* renamed from: e */
    private final List<Bundle> f1440e = new ArrayList();

    /* renamed from: f */
    private final Bundle f1441f = new Bundle();

    /* renamed from: g */
    private int f1442g;

    /* renamed from: h */
    private RemoteViews f1443h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0229g(C0228f.d dVar) {
        ArrayList<String> arrayList;
        Bundle bundle;
        String str;
        this.f1437b = dVar;
        this.f1436a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(dVar.f1406a, dVar.f1399I) : new Notification.Builder(dVar.f1406a);
        Notification notification = dVar.f1404N;
        this.f1436a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1413h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1409d).setContentText(dVar.f1410e).setContentInfo(dVar.f1415j).setContentIntent(dVar.f1411f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1412g, (notification.flags & 128) != 0).setLargeIcon(dVar.f1414i).setNumber(dVar.f1416k).setProgress(dVar.f1423r, dVar.f1424s, dVar.f1425t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1436a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1436a.setSubText(dVar.f1421p).setUsesChronometer(dVar.f1419n).setPriority(dVar.f1417l);
            Iterator<C0228f.a> it = dVar.f1407b.iterator();
            while (it.hasNext()) {
                m1426a(it.next());
            }
            Bundle bundle2 = dVar.f1392B;
            if (bundle2 != null) {
                this.f1441f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f1429x) {
                    this.f1441f.putBoolean("android.support.localOnly", true);
                }
                String str2 = dVar.f1426u;
                if (str2 != null) {
                    this.f1441f.putString("android.support.groupKey", str2);
                    if (dVar.f1427v) {
                        bundle = this.f1441f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1441f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = dVar.f1428w;
                if (str3 != null) {
                    this.f1441f.putString("android.support.sortKey", str3);
                }
            }
            this.f1438c = dVar.f1396F;
            this.f1439d = dVar.f1397G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1436a.setShowWhen(dVar.f1418m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = dVar.f1405O) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f1441f;
                ArrayList<String> arrayList2 = dVar.f1405O;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1436a.setLocalOnly(dVar.f1429x).setGroup(dVar.f1426u).setGroupSummary(dVar.f1427v).setSortKey(dVar.f1428w);
            this.f1442g = dVar.f1403M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1436a.setCategory(dVar.f1391A).setColor(dVar.f1393C).setVisibility(dVar.f1394D).setPublicVersion(dVar.f1395E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.f1405O.iterator();
            while (it2.hasNext()) {
                this.f1436a.addPerson(it2.next());
            }
            this.f1443h = dVar.f1398H;
            if (dVar.f1408c.size() > 0) {
                Bundle bundle4 = dVar.m1409b().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < dVar.f1408c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), C0230h.m1431a(dVar.f1408c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.m1409b().putBundle("android.car.EXTENSIONS", bundle4);
                this.f1441f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1436a.setExtras(dVar.f1392B).setRemoteInputHistory(dVar.f1422q);
            RemoteViews remoteViews = dVar.f1396F;
            if (remoteViews != null) {
                this.f1436a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f1397G;
            if (remoteViews2 != null) {
                this.f1436a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f1398H;
            if (remoteViews3 != null) {
                this.f1436a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1436a.setBadgeIconType(dVar.f1400J).setShortcutId(dVar.f1401K).setTimeoutAfter(dVar.f1402L).setGroupAlertBehavior(dVar.f1403M);
            if (dVar.f1431z) {
                this.f1436a.setColorized(dVar.f1430y);
            }
            if (TextUtils.isEmpty(dVar.f1399I)) {
                return;
            }
            this.f1436a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    /* renamed from: a */
    private void m1425a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    /* renamed from: a */
    private void m1426a(C0228f.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.f1440e.add(C0230h.m1429a(this.f1436a, aVar));
                return;
            }
            return;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(aVar.m1383e(), aVar.m1387i(), aVar.m1379a());
        if (aVar.m1384f() != null) {
            for (RemoteInput remoteInput : C0231i.m1436a(aVar.m1384f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.m1382d() != null ? new Bundle(aVar.m1382d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m1380b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(aVar.m1380b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m1385g());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(aVar.m1385g());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m1386h());
        builder.addExtras(bundle);
        this.f1436a.addAction(builder.build());
    }

    @Override // androidx.core.app.InterfaceC0227e
    /* renamed from: a */
    public Notification.Builder mo1377a() {
        return this.f1436a;
    }

    /* renamed from: b */
    public Notification m1427b() {
        Bundle m1378a;
        RemoteViews m1424d;
        RemoteViews m1422b;
        C0228f.e eVar = this.f1437b.f1420o;
        if (eVar != null) {
            eVar.mo1389a(this);
        }
        RemoteViews m1423c = eVar != null ? eVar.m1423c(this) : null;
        Notification m1428c = m1428c();
        if (m1423c != null || (m1423c = this.f1437b.f1396F) != null) {
            m1428c.contentView = m1423c;
        }
        if (Build.VERSION.SDK_INT >= 16 && eVar != null && (m1422b = eVar.m1422b(this)) != null) {
            m1428c.bigContentView = m1422b;
        }
        if (Build.VERSION.SDK_INT >= 21 && eVar != null && (m1424d = this.f1437b.f1420o.m1424d(this)) != null) {
            m1428c.headsUpContentView = m1424d;
        }
        if (Build.VERSION.SDK_INT >= 16 && eVar != null && (m1378a = C0228f.m1378a(m1428c)) != null) {
            eVar.m1420a(m1378a);
        }
        return m1428c;
    }

    /* renamed from: c */
    protected Notification m1428c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1436a.build();
        }
        if (i >= 24) {
            Notification build = this.f1436a.build();
            if (this.f1442g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f1442g == 2) {
                    m1425a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1442g == 1) {
                    m1425a(build);
                }
            }
            return build;
        }
        if (i >= 21) {
            this.f1436a.setExtras(this.f1441f);
            Notification build2 = this.f1436a.build();
            RemoteViews remoteViews = this.f1438c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1439d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1443h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1442g != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f1442g == 2) {
                    m1425a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1442g == 1) {
                    m1425a(build2);
                }
            }
            return build2;
        }
        if (i >= 20) {
            this.f1436a.setExtras(this.f1441f);
            Notification build3 = this.f1436a.build();
            RemoteViews remoteViews4 = this.f1438c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1439d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1442g != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f1442g == 2) {
                    m1425a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1442g == 1) {
                    m1425a(build3);
                }
            }
            return build3;
        }
        if (i >= 19) {
            SparseArray<Bundle> m1433a = C0230h.m1433a(this.f1440e);
            if (m1433a != null) {
                this.f1441f.putSparseParcelableArray("android.support.actionExtras", m1433a);
            }
            this.f1436a.setExtras(this.f1441f);
            Notification build4 = this.f1436a.build();
            RemoteViews remoteViews6 = this.f1438c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1439d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        }
        if (i < 16) {
            return this.f1436a.getNotification();
        }
        Notification build5 = this.f1436a.build();
        Bundle m1378a = C0228f.m1378a(build5);
        Bundle bundle = new Bundle(this.f1441f);
        for (String str : this.f1441f.keySet()) {
            if (m1378a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        m1378a.putAll(bundle);
        SparseArray<Bundle> m1433a2 = C0230h.m1433a(this.f1440e);
        if (m1433a2 != null) {
            C0228f.m1378a(build5).putSparseParcelableArray("android.support.actionExtras", m1433a2);
        }
        RemoteViews remoteViews8 = this.f1438c;
        if (remoteViews8 != null) {
            build5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f1439d;
        if (remoteViews9 != null) {
            build5.bigContentView = remoteViews9;
        }
        return build5;
    }
}
