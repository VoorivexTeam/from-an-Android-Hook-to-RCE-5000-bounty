package defpackage;

/* loaded from: classes.dex */
public interface fv {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    a a(String str);
}
