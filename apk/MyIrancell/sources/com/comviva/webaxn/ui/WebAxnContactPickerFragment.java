package com.comviva.webaxn.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AlphabetIndexer;
import android.widget.CheckBox;
import android.widget.SearchView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import android.widget.Toast;
import com.comviva.webaxn.utils.s1;
import com.mtni.myirancell.R;
import defpackage.g3;
import defpackage.r3;
import defpackage.u3;
import defpackage.v3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class WebAxnContactPickerFragment extends androidx.fragment.app.m implements AdapterView.OnItemClickListener, r3.a<Cursor> {
    private c k0;
    private String l0;
    private e m0;
    private boolean n0;
    private MenuItem r0;
    private boolean o0 = false;
    private int p0 = 1;
    private int q0 = 0;
    private LinkedHashMap<Integer, String> s0 = new LinkedHashMap<>();
    private boolean t0 = false;

    /* loaded from: classes.dex */
    class a implements SearchView.OnQueryTextListener {
        a() {
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (WebAxnContactPickerFragment.this.l0 == null && str == null) {
                return true;
            }
            if (WebAxnContactPickerFragment.this.l0 != null && WebAxnContactPickerFragment.this.l0.equals(str)) {
                return true;
            }
            WebAxnContactPickerFragment.this.l0 = str;
            WebAxnContactPickerFragment.this.n0 = true;
            WebAxnContactPickerFragment.this.q().b(1, null, WebAxnContactPickerFragment.this);
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements MenuItem.OnActionExpandListener {
        b() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            if (!TextUtils.isEmpty(WebAxnContactPickerFragment.this.l0)) {
                WebAxnContactPickerFragment.this.h0();
            }
            WebAxnContactPickerFragment.this.l0 = null;
            WebAxnContactPickerFragment.this.q().b(1, null, WebAxnContactPickerFragment.this);
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends g3 implements SectionIndexer {
        private LayoutInflater k;
        private AlphabetIndexer l;
        private TextAppearanceSpan m;
        private int n;

        /* loaded from: classes.dex */
        private class a implements View.OnClickListener {
            CheckBox b;
            int c;

            public a(CheckBox checkBox, int i) {
                this.b = checkBox;
                this.c = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cursor a = c.this.a();
                a.moveToPosition(this.c);
                int i = a.getInt(0);
                if (this.b.isChecked()) {
                    this.b.setChecked(false);
                    WebAxnContactPickerFragment.this.s0.remove(Integer.valueOf(i));
                    if (c.this.n > 0) {
                        c.c(c.this);
                    } else {
                        c.this.n = 0;
                    }
                } else if (c.this.n < WebAxnContactPickerFragment.this.q0) {
                    this.b.setChecked(true);
                    c.b(c.this);
                    WebAxnContactPickerFragment.this.s0.put(Integer.valueOf(i), c.this.a(a.getString(a.getColumnIndex("_id"))));
                } else {
                    Toast.makeText(((g3) c.this).e, "You have picked maximum allowed contacts", 0).show();
                }
                if (WebAxnContactPickerFragment.this.s0.size() == WebAxnContactPickerFragment.this.p0) {
                    WebAxnContactPickerFragment.this.r0.setEnabled(true);
                    WebAxnContactPickerFragment.this.t0 = false;
                } else if (WebAxnContactPickerFragment.this.s0.size() >= WebAxnContactPickerFragment.this.p0) {
                    return;
                } else {
                    WebAxnContactPickerFragment.this.t0 = true;
                }
                WebAxnContactPickerFragment.this.e().invalidateOptionsMenu();
            }
        }

        /* loaded from: classes.dex */
        private class b {
            TextView a;
            TextView b;
            CheckBox c;

            private b(c cVar) {
            }

            /* synthetic */ b(c cVar, a aVar) {
                this(cVar);
            }
        }

        public c(Context context) {
            super(context, (Cursor) null, 0);
            this.n = 0;
            this.k = LayoutInflater.from(context);
            this.l = new AlphabetIndexer(null, 4, context.getString(R.string.alphabet));
            this.m = new TextAppearanceSpan(WebAxnContactPickerFragment.this.e(), R.style.searchTextHiglight);
        }

        static /* synthetic */ int b(c cVar) {
            int i = cVar.n;
            cVar.n = i + 1;
            return i;
        }

        private int b(String str) {
            if (TextUtils.isEmpty(WebAxnContactPickerFragment.this.l0)) {
                return -1;
            }
            return str.toLowerCase(Locale.getDefault()).indexOf(WebAxnContactPickerFragment.this.l0.toLowerCase(Locale.getDefault()));
        }

        static /* synthetic */ int c(c cVar) {
            int i = cVar.n;
            cVar.n = i - 1;
            return i;
        }

        public String a(String str) {
            Cursor query = WebAxnContactPickerFragment.this.e().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data2", "data1", "display_name"}, "contact_id = ? AND mimetype = ?", new String[]{str, "vnd.android.cursor.item/phone_v2"}, null);
            if (query == null || query.getCount() <= 0 || !query.moveToFirst()) {
                return null;
            }
            query.getString(query.getColumnIndex("display_name"));
            String string = query.getString(query.getColumnIndex("data1"));
            query.close();
            return string;
        }

        @Override // defpackage.g3
        public void a(View view, Context context, Cursor cursor) {
            b bVar = (b) view.getTag();
            view.setOnClickListener(new a(bVar.c, cursor.getPosition()));
            cursor.getString(3);
            String string = cursor.getString(2);
            int b2 = b(string);
            if (b2 == -1) {
                bVar.a.setText(string);
                if (!TextUtils.isEmpty(WebAxnContactPickerFragment.this.l0)) {
                    bVar.b.setVisibility(0);
                    ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
                }
            } else {
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(this.m, b2, WebAxnContactPickerFragment.this.l0.length() + b2, 0);
                bVar.a.setText(spannableString);
            }
            bVar.b.setVisibility(8);
            ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
        }

        @Override // defpackage.g3
        public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
            View inflate = this.k.inflate(R.layout.contact_list_item, viewGroup, false);
            b bVar = new b(this, null);
            bVar.a = (TextView) inflate.findViewById(android.R.id.text1);
            bVar.b = (TextView) inflate.findViewById(android.R.id.text2);
            bVar.c = (CheckBox) inflate.findViewById(R.id.checkitem);
            inflate.setTag(bVar);
            return inflate;
        }

        @Override // defpackage.g3
        public Cursor c(Cursor cursor) {
            this.l.setCursor(cursor);
            return super.c(cursor);
        }

        @Override // defpackage.g3, android.widget.Adapter
        public int getCount() {
            if (a() == null) {
                return 0;
            }
            return super.getCount();
        }

        @Override // android.widget.SectionIndexer
        public int getPositionForSection(int i) {
            if (a() == null) {
                return 0;
            }
            return this.l.getPositionForSection(i);
        }

        @Override // android.widget.SectionIndexer
        public int getSectionForPosition(int i) {
            if (a() == null) {
                return 0;
            }
            return this.l.getSectionForPosition(i);
        }

        @Override // android.widget.SectionIndexer
        public Object[] getSections() {
            return this.l.getSections();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        public static final Uri a = ContactsContract.Contacts.CONTENT_URI;
        public static final Uri b = ContactsContract.Contacts.CONTENT_FILTER_URI;

        @SuppressLint({"InlinedApi"})
        public static final String c;

        @SuppressLint({"InlinedApi"})
        public static final String d;

        @SuppressLint({"InlinedApi"})
        public static final String[] e;

        static {
            StringBuilder sb = new StringBuilder();
            s1.c();
            sb.append("display_name");
            sb.append("<>'' AND ");
            sb.append("in_visible_group");
            sb.append("=1");
            c = sb.toString();
            d = s1.c() ? "sort_key" : "display_name";
            String[] strArr = new String[5];
            strArr[0] = "_id";
            strArr[1] = "lookup";
            s1.c();
            strArr[2] = "display_name";
            strArr[3] = s1.c() ? "photo_thumb_uri" : "_id";
            strArr[4] = d;
            e = strArr;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(Uri uri);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        this.m0.b();
        f0().clearChoices();
    }

    @Override // androidx.fragment.app.Fragment
    public void M() {
        this.s0.clear();
        this.s0 = null;
        super.M();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.contact_list_fragment, viewGroup, false);
    }

    @Override // r3.a
    public v3<Cursor> a(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        String str = this.l0;
        return new u3(e(), str == null ? d.a : Uri.withAppendedPath(d.b, Uri.encode(str)), d.e, d.c, null, d.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void a(Activity activity) {
        super.a(activity);
        try {
            this.m0 = (e) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OnContactsInteractionListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @TargetApi(14)
    public void a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.contact_list_menu, menu);
        MenuItem findItem = menu.findItem(R.id.menu_search);
        if (this.t0) {
            MenuItem findItem2 = menu.findItem(R.id.menu_done);
            this.r0 = findItem2;
            findItem2.setEnabled(false);
        }
        if (this.o0) {
            findItem.setVisible(false);
        }
        if (s1.c()) {
            SearchManager searchManager = (SearchManager) e().getSystemService("search");
            SearchView searchView = (SearchView) findItem.getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(e().getComponentName()));
            searchView.setOnQueryTextListener(new a());
            if (s1.e()) {
                findItem.setOnActionExpandListener(new b());
            }
            String str = this.l0;
            if (str != null) {
                if (s1.e()) {
                    findItem.expandActionView();
                }
                searchView.setQuery(str, false);
            }
        }
    }

    @Override // r3.a
    public void a(v3<Cursor> v3Var) {
        if (v3Var.h() == 1) {
            this.k0.c((Cursor) null);
        }
    }

    @Override // r3.a
    public void a(v3<Cursor> v3Var, Cursor cursor) {
        if (v3Var.h() == 1) {
            this.k0.c(cursor);
        }
    }

    public void b(int i, int i2) {
        this.q0 = i2;
        this.p0 = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void b(Bundle bundle) {
        super.b(bundle);
        a(this.k0);
        f0().setOnItemClickListener(this);
        f0().setChoiceMode(2);
        q().a(1, null, this);
    }

    public void b(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            this.l0 = str;
            z = true;
        }
        this.o0 = z;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean b(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_done) {
            g0();
        } else if (itemId == R.id.menu_search && !s1.c()) {
            e().onSearchRequested();
        }
        return super.b(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        f(true);
        this.t0 = true;
        this.k0 = new c(e());
        if (bundle != null) {
            this.l0 = bundle.getString("query");
            bundle.getInt("com.example.android.contactslist.ui.SELECTED_ITEM", 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        if (TextUtils.isEmpty(this.l0)) {
            return;
        }
        bundle.putString("query", this.l0);
        bundle.putInt("com.example.android.contactslist.ui.SELECTED_ITEM", f0().getCheckedItemPosition());
    }

    public void g0() {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = this.s0.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(this.s0.get(it.next()));
            i++;
            if (i != this.s0.size()) {
                sb.append(";");
            }
        }
        Intent intent = new Intent();
        intent.putExtra("picker", sb.toString());
        e().setResult(-1, intent);
        e().finish();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Cursor a2 = this.k0.a();
        a2.moveToPosition(i);
        this.m0.a(ContactsContract.Contacts.getLookupUri(a2.getLong(0), a2.getString(1)));
    }
}
