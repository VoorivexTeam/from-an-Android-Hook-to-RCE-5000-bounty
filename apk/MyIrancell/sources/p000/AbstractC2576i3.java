package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: i3 */
/* loaded from: classes.dex */
public abstract class AbstractC2576i3 extends AbstractC2496g3 {

    /* renamed from: k */
    private int f10560k;

    /* renamed from: l */
    private int f10561l;

    /* renamed from: m */
    private LayoutInflater f10562m;

    @Deprecated
    public AbstractC2576i3(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f10561l = i;
        this.f10560k = i;
        this.f10562m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000.AbstractC2496g3
    /* renamed from: a */
    public View mo11877a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10562m.inflate(this.f10561l, viewGroup, false);
    }

    @Override // p000.AbstractC2496g3
    /* renamed from: b */
    public View mo1100b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10562m.inflate(this.f10560k, viewGroup, false);
    }
}
