package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class i3 extends g3 {
    private int k;
    private int l;
    private LayoutInflater m;

    @Deprecated
    public i3(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.l = i;
        this.k = i;
        this.m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.g3
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.m.inflate(this.l, viewGroup, false);
    }

    @Override // defpackage.g3
    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.m.inflate(this.k, viewGroup, false);
    }
}
