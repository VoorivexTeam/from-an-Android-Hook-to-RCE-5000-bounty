package com.google.zxing.client.android.book;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.google.zxing.client.android.C2264m;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.zxing.client.android.book.a */
/* loaded from: classes.dex */
public final class C2251a implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    private final SearchBookContentsActivity f9104b;

    /* renamed from: c */
    private final List<C2253c> f9105c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2251a(SearchBookContentsActivity searchBookContentsActivity, List<C2253c> list) {
        this.f9104b = searchBookContentsActivity;
        this.f9105c = list;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        if (i >= 1 && (i2 = i - 1) < this.f9105c.size()) {
            String m10865a = this.f9105c.get(i2).m10865a();
            String m10864e = C2253c.m10864e();
            if (!C2264m.m10900a(this.f9104b.m10858a()) || m10865a.isEmpty()) {
                return;
            }
            String m10858a = this.f9104b.m10858a();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://books.google." + C2264m.m10898a(this.f9104b) + "/books?id=" + m10858a.substring(m10858a.indexOf(61) + 1) + "&pg=" + m10865a + "&vq=" + m10864e));
            intent.addFlags(524288);
            this.f9104b.startActivity(intent);
        }
    }
}
