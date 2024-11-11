package com.google.zxing.client.android.book;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.google.zxing.client.android.m;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    private final SearchBookContentsActivity b;
    private final List<c> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SearchBookContentsActivity searchBookContentsActivity, List<c> list) {
        this.b = searchBookContentsActivity;
        this.c = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        if (i >= 1 && (i2 = i - 1) < this.c.size()) {
            String a = this.c.get(i2).a();
            String e = c.e();
            if (!m.a(this.b.a()) || a.isEmpty()) {
                return;
            }
            String a2 = this.b.a();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://books.google." + m.a(this.b) + "/books?id=" + a2.substring(a2.indexOf(61) + 1) + "&pg=" + a + "&vq=" + e));
            intent.addFlags(524288);
            this.b.startActivity(intent);
        }
    }
}
