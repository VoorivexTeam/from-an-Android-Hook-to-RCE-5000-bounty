package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public interface u70 {

    /* renamed from: a */
    public static final u70 f13435a = new C3293a();

    /* renamed from: u70$a */
    /* loaded from: classes.dex */
    class C3293a implements u70 {
        C3293a() {
        }

        @Override // p000.u70
        /* renamed from: a */
        public List<InetAddress> mo15751a(String str) {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    /* renamed from: a */
    List<InetAddress> mo15751a(String str);
}
