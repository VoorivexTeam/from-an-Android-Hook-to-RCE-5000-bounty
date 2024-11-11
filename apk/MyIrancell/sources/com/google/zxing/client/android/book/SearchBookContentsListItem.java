package com.google.zxing.client.android.book;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.zxing.client.android.R$id;
import java.util.Locale;

/* loaded from: classes.dex */
public final class SearchBookContentsListItem extends LinearLayout {

    /* renamed from: b */
    private TextView f9102b;

    /* renamed from: c */
    private TextView f9103c;

    SearchBookContentsListItem(Context context) {
        super(context);
    }

    public SearchBookContentsListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f9102b = (TextView) findViewById(R$id.page_number_view);
        this.f9103c = (TextView) findViewById(R$id.snippet_view);
    }

    public void set(C2253c c2253c) {
        TextView textView;
        this.f9102b.setText(c2253c.m10866b());
        String m10867c = c2253c.m10867c();
        if (m10867c.isEmpty()) {
            textView = this.f9103c;
            m10867c = "";
        } else if (c2253c.m10868d()) {
            String lowerCase = C2253c.m10864e().toLowerCase(Locale.getDefault());
            String lowerCase2 = m10867c.toLowerCase(Locale.getDefault());
            SpannableString spannableString = new SpannableString(m10867c);
            StyleSpan styleSpan = new StyleSpan(1);
            int length = lowerCase.length();
            int i = 0;
            while (true) {
                int indexOf = lowerCase2.indexOf(lowerCase, i);
                if (indexOf < 0) {
                    this.f9103c.setText(spannableString);
                    return;
                } else {
                    int i2 = indexOf + length;
                    spannableString.setSpan(styleSpan, indexOf, i2, 0);
                    i = i2;
                }
            }
        } else {
            textView = this.f9103c;
        }
        textView.setText(m10867c);
    }
}
