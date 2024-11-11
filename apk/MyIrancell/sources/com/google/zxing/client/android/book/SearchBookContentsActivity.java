package com.google.zxing.client.android.book;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.zxing.client.android.C2261j;
import com.google.zxing.client.android.C2264m;
import com.google.zxing.client.android.R$id;
import com.google.zxing.client.android.R$layout;
import com.google.zxing.client.android.R$string;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SearchBookContentsActivity extends Activity {

    /* renamed from: j */
    private static final String f9085j = SearchBookContentsActivity.class.getSimpleName();

    /* renamed from: k */
    private static final Pattern f9086k = Pattern.compile("\\<.*?\\>");

    /* renamed from: l */
    private static final Pattern f9087l = Pattern.compile("&lt;");

    /* renamed from: m */
    private static final Pattern f9088m = Pattern.compile("&gt;");

    /* renamed from: n */
    private static final Pattern f9089n = Pattern.compile("&#39;");

    /* renamed from: o */
    private static final Pattern f9090o = Pattern.compile("&quot;");

    /* renamed from: b */
    private String f9091b;

    /* renamed from: c */
    private EditText f9092c;

    /* renamed from: d */
    private View f9093d;

    /* renamed from: e */
    private ListView f9094e;

    /* renamed from: f */
    private TextView f9095f;

    /* renamed from: g */
    private AsyncTask<String, ?, ?> f9096g;

    /* renamed from: h */
    private final View.OnClickListener f9097h = new ViewOnClickListenerC2248a();

    /* renamed from: i */
    private final View.OnKeyListener f9098i = new ViewOnKeyListenerC2249b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.client.android.book.SearchBookContentsActivity$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2248a implements View.OnClickListener {
        ViewOnClickListenerC2248a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchBookContentsActivity.this.m10857h();
        }
    }

    /* renamed from: com.google.zxing.client.android.book.SearchBookContentsActivity$b */
    /* loaded from: classes.dex */
    class ViewOnKeyListenerC2249b implements View.OnKeyListener {
        ViewOnKeyListenerC2249b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66 || keyEvent.getAction() != 0) {
                return false;
            }
            SearchBookContentsActivity.this.m10857h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.zxing.client.android.book.SearchBookContentsActivity$c */
    /* loaded from: classes.dex */
    public final class AsyncTaskC2250c extends AsyncTask<String, Object, JSONObject> {
        private AsyncTaskC2250c() {
        }

        /* synthetic */ AsyncTaskC2250c(SearchBookContentsActivity searchBookContentsActivity, ViewOnClickListenerC2248a viewOnClickListenerC2248a) {
            this();
        }

        /* renamed from: b */
        private void m10859b(JSONObject jSONObject) {
            try {
                int i = jSONObject.getInt("number_of_results");
                SearchBookContentsActivity.this.f9095f.setText(SearchBookContentsActivity.this.getString(R$string.msg_sbc_results) + " : " + i);
                if (i <= 0) {
                    if ("false".equals(jSONObject.optString("searchable"))) {
                        SearchBookContentsActivity.this.f9095f.setText(R$string.msg_sbc_book_not_searchable);
                    }
                    SearchBookContentsActivity.this.f9094e.setAdapter((ListAdapter) null);
                    return;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("search_results");
                C2253c.m10863a(SearchBookContentsActivity.this.f9092c.getText().toString());
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(m10860c(jSONArray.getJSONObject(i2)));
                }
                SearchBookContentsActivity.this.f9094e.setOnItemClickListener(new C2251a(SearchBookContentsActivity.this, arrayList));
                SearchBookContentsActivity.this.f9094e.setAdapter((ListAdapter) new C2252b(SearchBookContentsActivity.this, arrayList));
            } catch (JSONException unused) {
                String unused2 = SearchBookContentsActivity.f9085j;
                SearchBookContentsActivity.this.f9094e.setAdapter((ListAdapter) null);
                SearchBookContentsActivity.this.f9095f.setText(R$string.msg_sbc_failed);
            }
        }

        /* renamed from: c */
        private C2253c m10860c(JSONObject jSONObject) {
            String str;
            String str2;
            boolean z = false;
            try {
                String string = jSONObject.getString("page_id");
                String optString = jSONObject.optString("page_number");
                String optString2 = jSONObject.optString("snippet_text");
                if (optString == null || optString.isEmpty()) {
                    str = "";
                } else {
                    str = SearchBookContentsActivity.this.getString(R$string.msg_sbc_page) + ' ' + optString;
                }
                if (optString2 != null && !optString2.isEmpty()) {
                    z = true;
                }
                if (z) {
                    str2 = SearchBookContentsActivity.f9090o.matcher(SearchBookContentsActivity.f9089n.matcher(SearchBookContentsActivity.f9088m.matcher(SearchBookContentsActivity.f9087l.matcher(SearchBookContentsActivity.f9086k.matcher(optString2).replaceAll("")).replaceAll("<")).replaceAll(">")).replaceAll("'")).replaceAll("\"");
                } else {
                    str2 = '(' + SearchBookContentsActivity.this.getString(R$string.msg_sbc_snippet_unavailable) + ')';
                }
                return new C2253c(string, str, str2, z);
            } catch (JSONException unused) {
                String unused2 = SearchBookContentsActivity.f9085j;
                return new C2253c(SearchBookContentsActivity.this.getString(R$string.msg_sbc_no_page_returned), "", "", false);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(String... strArr) {
            StringBuilder sb;
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                if (C2264m.m10900a(str2)) {
                    String substring = str2.substring(str2.indexOf(61) + 1);
                    sb = new StringBuilder();
                    sb.append("http://www.google.com/books?id=");
                    sb.append(substring);
                    sb.append("&jscmd=SearchWithinVolume2&q=");
                } else {
                    sb = new StringBuilder();
                    sb.append("http://www.google.com/books?vid=isbn");
                    sb.append(str2);
                    sb.append("&jscmd=SearchWithinVolume2&q=");
                }
                sb.append(str);
                return new JSONObject(C2261j.m10882a(sb.toString(), C2261j.b.JSON).toString());
            } catch (IOException unused) {
                String unused2 = SearchBookContentsActivity.f9085j;
                return null;
            } catch (JSONException unused3) {
                String unused4 = SearchBookContentsActivity.f9085j;
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            if (jSONObject == null) {
                SearchBookContentsActivity.this.f9095f.setText(R$string.msg_sbc_failed);
            } else {
                m10859b(jSONObject);
            }
            SearchBookContentsActivity.this.f9092c.setEnabled(true);
            SearchBookContentsActivity.this.f9092c.selectAll();
            SearchBookContentsActivity.this.f9093d.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m10857h() {
        String obj = this.f9092c.getText().toString();
        if (obj == null || obj.isEmpty()) {
            return;
        }
        AsyncTask<String, ?, ?> asyncTask = this.f9096g;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        AsyncTaskC2250c asyncTaskC2250c = new AsyncTaskC2250c(this, null);
        this.f9096g = asyncTaskC2250c;
        asyncTaskC2250c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, obj, this.f9091b);
        this.f9095f.setText(R$string.msg_sbc_searching_book);
        this.f9094e.setAdapter((ListAdapter) null);
        this.f9092c.setEnabled(false);
        this.f9093d.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m10858a() {
        return this.f9091b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().removeExpiredCookie();
        Intent intent = getIntent();
        if (intent == null || !"com.google.zxing.client.android.SEARCH_BOOK_CONTENTS".equals(intent.getAction())) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("ISBN");
        this.f9091b = stringExtra;
        if (C2264m.m10900a(stringExtra)) {
            str = getString(R$string.sbc_name);
        } else {
            str = getString(R$string.sbc_name) + ": ISBN " + this.f9091b;
        }
        setTitle(str);
        setContentView(R$layout.search_book_contents);
        this.f9092c = (EditText) findViewById(R$id.query_text_view);
        String stringExtra2 = intent.getStringExtra("QUERY");
        if (stringExtra2 != null && !stringExtra2.isEmpty()) {
            this.f9092c.setText(stringExtra2);
        }
        this.f9092c.setOnKeyListener(this.f9098i);
        View findViewById = findViewById(R$id.query_button);
        this.f9093d = findViewById;
        findViewById.setOnClickListener(this.f9097h);
        this.f9094e = (ListView) findViewById(R$id.result_list_view);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R$layout.search_book_contents_header, (ViewGroup) this.f9094e, false);
        this.f9095f = textView;
        this.f9094e.addHeaderView(textView);
    }

    @Override // android.app.Activity
    protected void onPause() {
        AsyncTask<String, ?, ?> asyncTask = this.f9096g;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f9096g = null;
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f9092c.selectAll();
    }
}
