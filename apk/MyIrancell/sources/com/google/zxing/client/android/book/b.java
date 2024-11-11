package com.google.zxing.client.android.book;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.zxing.client.android.R$layout;
import java.util.List;

/* loaded from: classes.dex */
final class b extends ArrayAdapter<c> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, List<c> list) {
        super(context, R$layout.search_book_contents_list_item, 0, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r5 != false) goto L4;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L14
            android.content.Context r4 = r2.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.zxing.client.android.R$layout.search_book_contents_list_item
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        L11:
            com.google.zxing.client.android.book.SearchBookContentsListItem r4 = (com.google.zxing.client.android.book.SearchBookContentsListItem) r4
            goto L19
        L14:
            boolean r5 = r4 instanceof com.google.zxing.client.android.book.SearchBookContentsListItem
            if (r5 == 0) goto L22
            goto L11
        L19:
            java.lang.Object r3 = r2.getItem(r3)
            com.google.zxing.client.android.book.c r3 = (com.google.zxing.client.android.book.c) r3
            r4.set(r3)
        L22:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.android.book.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
