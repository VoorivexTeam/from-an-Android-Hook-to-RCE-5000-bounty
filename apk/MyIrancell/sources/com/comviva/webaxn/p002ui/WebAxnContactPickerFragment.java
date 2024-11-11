package com.comviva.webaxn.p002ui;

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
import androidx.fragment.app.C0289m;
import com.comviva.webaxn.utils.C0740s1;
import com.mtni.myirancell.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import p000.AbstractC2496g3;
import p000.AbstractC3150r3;
import p000.C3285u3;
import p000.C3329v3;

/* loaded from: classes.dex */
public class WebAxnContactPickerFragment extends C0289m implements AdapterView.OnItemClickListener, AbstractC3150r3.a<Cursor> {

    /* renamed from: k0 */
    private C0603c f3439k0;

    /* renamed from: l0 */
    private String f3440l0;

    /* renamed from: m0 */
    private InterfaceC0605e f3441m0;

    /* renamed from: n0 */
    private boolean f3442n0;

    /* renamed from: r0 */
    private MenuItem f3446r0;

    /* renamed from: o0 */
    private boolean f3443o0 = false;

    /* renamed from: p0 */
    private int f3444p0 = 1;

    /* renamed from: q0 */
    private int f3445q0 = 0;

    /* renamed from: s0 */
    private LinkedHashMap<Integer, String> f3447s0 = new LinkedHashMap<>();

    /* renamed from: t0 */
    private boolean f3448t0 = false;

    /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$a */
    /* loaded from: classes.dex */
    class C0601a implements SearchView.OnQueryTextListener {
        C0601a() {
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (WebAxnContactPickerFragment.this.f3440l0 == null && str == null) {
                return true;
            }
            if (WebAxnContactPickerFragment.this.f3440l0 != null && WebAxnContactPickerFragment.this.f3440l0.equals(str)) {
                return true;
            }
            WebAxnContactPickerFragment.this.f3440l0 = str;
            WebAxnContactPickerFragment.this.f3442n0 = true;
            WebAxnContactPickerFragment.this.m1715q().mo15188b(1, null, WebAxnContactPickerFragment.this);
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$b */
    /* loaded from: classes.dex */
    class MenuItemOnActionExpandListenerC0602b implements MenuItem.OnActionExpandListener {
        MenuItemOnActionExpandListenerC0602b() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            if (!TextUtils.isEmpty(WebAxnContactPickerFragment.this.f3440l0)) {
                WebAxnContactPickerFragment.this.m4095h0();
            }
            WebAxnContactPickerFragment.this.f3440l0 = null;
            WebAxnContactPickerFragment.this.m1715q().mo15188b(1, null, WebAxnContactPickerFragment.this);
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$c */
    /* loaded from: classes.dex */
    public class C0603c extends AbstractC2496g3 implements SectionIndexer {

        /* renamed from: k */
        private LayoutInflater f3451k;

        /* renamed from: l */
        private AlphabetIndexer f3452l;

        /* renamed from: m */
        private TextAppearanceSpan f3453m;

        /* renamed from: n */
        private int f3454n;

        /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$c$a */
        /* loaded from: classes.dex */
        private class a implements View.OnClickListener {

            /* renamed from: b */
            CheckBox f3456b;

            /* renamed from: c */
            int f3457c;

            public a(CheckBox checkBox, int i) {
                this.f3456b = checkBox;
                this.f3457c = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cursor mo11876a = C0603c.this.mo11876a();
                mo11876a.moveToPosition(this.f3457c);
                int i = mo11876a.getInt(0);
                if (this.f3456b.isChecked()) {
                    this.f3456b.setChecked(false);
                    WebAxnContactPickerFragment.this.f3447s0.remove(Integer.valueOf(i));
                    if (C0603c.this.f3454n > 0) {
                        C0603c.m4106c(C0603c.this);
                    } else {
                        C0603c.this.f3454n = 0;
                    }
                } else if (C0603c.this.f3454n < WebAxnContactPickerFragment.this.f3445q0) {
                    this.f3456b.setChecked(true);
                    C0603c.m4104b(C0603c.this);
                    WebAxnContactPickerFragment.this.f3447s0.put(Integer.valueOf(i), C0603c.this.m4108a(mo11876a.getString(mo11876a.getColumnIndex("_id"))));
                } else {
                    Toast.makeText(((AbstractC2496g3) C0603c.this).f10192e, "You have picked maximum allowed contacts", 0).show();
                }
                if (WebAxnContactPickerFragment.this.f3447s0.size() == WebAxnContactPickerFragment.this.f3444p0) {
                    WebAxnContactPickerFragment.this.f3446r0.setEnabled(true);
                    WebAxnContactPickerFragment.this.f3448t0 = false;
                } else if (WebAxnContactPickerFragment.this.f3447s0.size() >= WebAxnContactPickerFragment.this.f3444p0) {
                    return;
                } else {
                    WebAxnContactPickerFragment.this.f3448t0 = true;
                }
                WebAxnContactPickerFragment.this.m1690e().invalidateOptionsMenu();
            }
        }

        /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$c$b */
        /* loaded from: classes.dex */
        private class b {

            /* renamed from: a */
            TextView f3459a;

            /* renamed from: b */
            TextView f3460b;

            /* renamed from: c */
            CheckBox f3461c;

            private b(C0603c c0603c) {
            }

            /* synthetic */ b(C0603c c0603c, C0601a c0601a) {
                this(c0603c);
            }
        }

        public C0603c(Context context) {
            super(context, (Cursor) null, 0);
            this.f3454n = 0;
            this.f3451k = LayoutInflater.from(context);
            this.f3452l = new AlphabetIndexer(null, 4, context.getString(R.string.alphabet));
            this.f3453m = new TextAppearanceSpan(WebAxnContactPickerFragment.this.m1690e(), R.style.searchTextHiglight);
        }

        /* renamed from: b */
        static /* synthetic */ int m4104b(C0603c c0603c) {
            int i = c0603c.f3454n;
            c0603c.f3454n = i + 1;
            return i;
        }

        /* renamed from: b */
        private int m4105b(String str) {
            if (TextUtils.isEmpty(WebAxnContactPickerFragment.this.f3440l0)) {
                return -1;
            }
            return str.toLowerCase(Locale.getDefault()).indexOf(WebAxnContactPickerFragment.this.f3440l0.toLowerCase(Locale.getDefault()));
        }

        /* renamed from: c */
        static /* synthetic */ int m4106c(C0603c c0603c) {
            int i = c0603c.f3454n;
            c0603c.f3454n = i - 1;
            return i;
        }

        /* renamed from: a */
        public String m4108a(String str) {
            Cursor query = WebAxnContactPickerFragment.this.m1690e().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data2", "data1", "display_name"}, "contact_id = ? AND mimetype = ?", new String[]{str, "vnd.android.cursor.item/phone_v2"}, null);
            if (query == null || query.getCount() <= 0 || !query.moveToFirst()) {
                return null;
            }
            query.getString(query.getColumnIndex("display_name"));
            String string = query.getString(query.getColumnIndex("data1"));
            query.close();
            return string;
        }

        @Override // p000.AbstractC2496g3
        /* renamed from: a */
        public void mo1099a(View view, Context context, Cursor cursor) {
            b bVar = (b) view.getTag();
            view.setOnClickListener(new a(bVar.f3461c, cursor.getPosition()));
            cursor.getString(3);
            String string = cursor.getString(2);
            int m4105b = m4105b(string);
            if (m4105b == -1) {
                bVar.f3459a.setText(string);
                if (!TextUtils.isEmpty(WebAxnContactPickerFragment.this.f3440l0)) {
                    bVar.f3460b.setVisibility(0);
                    ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
                }
            } else {
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(this.f3453m, m4105b, WebAxnContactPickerFragment.this.f3440l0.length() + m4105b, 0);
                bVar.f3459a.setText(spannableString);
            }
            bVar.f3460b.setVisibility(8);
            ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
        }

        @Override // p000.AbstractC2496g3
        /* renamed from: b */
        public View mo1100b(Context context, Cursor cursor, ViewGroup viewGroup) {
            View inflate = this.f3451k.inflate(R.layout.contact_list_item, viewGroup, false);
            b bVar = new b(this, null);
            bVar.f3459a = (TextView) inflate.findViewById(android.R.id.text1);
            bVar.f3460b = (TextView) inflate.findViewById(android.R.id.text2);
            bVar.f3461c = (CheckBox) inflate.findViewById(R.id.checkitem);
            inflate.setTag(bVar);
            return inflate;
        }

        @Override // p000.AbstractC2496g3
        /* renamed from: c */
        public Cursor mo4109c(Cursor cursor) {
            this.f3452l.setCursor(cursor);
            return super.mo4109c(cursor);
        }

        @Override // p000.AbstractC2496g3, android.widget.Adapter
        public int getCount() {
            if (mo11876a() == null) {
                return 0;
            }
            return super.getCount();
        }

        @Override // android.widget.SectionIndexer
        public int getPositionForSection(int i) {
            if (mo11876a() == null) {
                return 0;
            }
            return this.f3452l.getPositionForSection(i);
        }

        @Override // android.widget.SectionIndexer
        public int getSectionForPosition(int i) {
            if (mo11876a() == null) {
                return 0;
            }
            return this.f3452l.getSectionForPosition(i);
        }

        @Override // android.widget.SectionIndexer
        public Object[] getSections() {
            return this.f3452l.getSections();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0604d {

        /* renamed from: a */
        public static final Uri f3462a = ContactsContract.Contacts.CONTENT_URI;

        /* renamed from: b */
        public static final Uri f3463b = ContactsContract.Contacts.CONTENT_FILTER_URI;

        /* renamed from: c */
        @SuppressLint({"InlinedApi"})
        public static final String f3464c;

        /* renamed from: d */
        @SuppressLint({"InlinedApi"})
        public static final String f3465d;

        /* renamed from: e */
        @SuppressLint({"InlinedApi"})
        public static final String[] f3466e;

        static {
            StringBuilder sb = new StringBuilder();
            C0740s1.m6029c();
            sb.append("display_name");
            sb.append("<>'' AND ");
            sb.append("in_visible_group");
            sb.append("=1");
            f3464c = sb.toString();
            f3465d = C0740s1.m6029c() ? "sort_key" : "display_name";
            String[] strArr = new String[5];
            strArr[0] = "_id";
            strArr[1] = "lookup";
            C0740s1.m6029c();
            strArr[2] = "display_name";
            strArr[3] = C0740s1.m6029c() ? "photo_thumb_uri" : "_id";
            strArr[4] = f3465d;
            f3466e = strArr;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebAxnContactPickerFragment$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0605e {
        /* renamed from: a */
        void mo4084a(Uri uri);

        /* renamed from: b */
        void mo4085b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m4095h0() {
        this.f3441m0.mo4085b();
        m2001f0().clearChoices();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M */
    public void mo1629M() {
        this.f3447s0.clear();
        this.f3447s0 = null;
        super.mo1629M();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public View mo1644a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.contact_list_fragment, viewGroup, false);
    }

    @Override // p000.AbstractC3150r3.a
    /* renamed from: a */
    public C3329v3<Cursor> mo4096a(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        String str = this.f3440l0;
        return new C3285u3(m1690e(), str == null ? InterfaceC0604d.f3462a : Uri.withAppendedPath(InterfaceC0604d.f3463b, Uri.encode(str)), InterfaceC0604d.f3466e, InterfaceC0604d.f3464c, null, InterfaceC0604d.f3465d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public void mo1653a(Activity activity) {
        super.mo1653a(activity);
        try {
            this.f3441m0 = (InterfaceC0605e) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OnContactsInteractionListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @TargetApi(14)
    /* renamed from: a */
    public void mo1660a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.contact_list_menu, menu);
        MenuItem findItem = menu.findItem(R.id.menu_search);
        if (this.f3448t0) {
            MenuItem findItem2 = menu.findItem(R.id.menu_done);
            this.f3446r0 = findItem2;
            findItem2.setEnabled(false);
        }
        if (this.f3443o0) {
            findItem.setVisible(false);
        }
        if (C0740s1.m6029c()) {
            SearchManager searchManager = (SearchManager) m1690e().getSystemService("search");
            SearchView searchView = (SearchView) findItem.getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(m1690e().getComponentName()));
            searchView.setOnQueryTextListener(new C0601a());
            if (C0740s1.m6031e()) {
                findItem.setOnActionExpandListener(new MenuItemOnActionExpandListenerC0602b());
            }
            String str = this.f3440l0;
            if (str != null) {
                if (C0740s1.m6031e()) {
                    findItem.expandActionView();
                }
                searchView.setQuery(str, false);
            }
        }
    }

    @Override // p000.AbstractC3150r3.a
    /* renamed from: a */
    public void mo4097a(C3329v3<Cursor> c3329v3) {
        if (c3329v3.m15908h() == 1) {
            this.f3439k0.mo4109c((Cursor) null);
        }
    }

    @Override // p000.AbstractC3150r3.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4098a(C3329v3<Cursor> c3329v3, Cursor cursor) {
        if (c3329v3.m15908h() == 1) {
            this.f3439k0.mo4109c(cursor);
        }
    }

    /* renamed from: b */
    public void m4099b(int i, int i2) {
        this.f3445q0 = i2;
        this.f3444p0 = i;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b */
    public void mo1671b(Bundle bundle) {
        super.mo1671b(bundle);
        m1999a(this.f3439k0);
        m2001f0().setOnItemClickListener(this);
        m2001f0().setChoiceMode(2);
        m1715q().mo15185a(1, null, this);
    }

    /* renamed from: b */
    public void m4100b(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            this.f3440l0 = str;
            z = true;
        }
        this.f3443o0 = z;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b */
    public boolean mo1676b(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_done) {
            m4101g0();
        } else if (itemId == R.id.menu_search && !C0740s1.m6029c()) {
            m1690e().onSearchRequested();
        }
        return super.mo1676b(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c */
    public void mo1679c(Bundle bundle) {
        super.mo1679c(bundle);
        m1695f(true);
        this.f3448t0 = true;
        this.f3439k0 = new C0603c(m1690e());
        if (bundle != null) {
            this.f3440l0 = bundle.getString("query");
            bundle.getInt("com.example.android.contactslist.ui.SELECTED_ITEM", 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e */
    public void mo1691e(Bundle bundle) {
        super.mo1691e(bundle);
        if (TextUtils.isEmpty(this.f3440l0)) {
            return;
        }
        bundle.putString("query", this.f3440l0);
        bundle.putInt("com.example.android.contactslist.ui.SELECTED_ITEM", m2001f0().getCheckedItemPosition());
    }

    /* renamed from: g0 */
    public void m4101g0() {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = this.f3447s0.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(this.f3447s0.get(it.next()));
            i++;
            if (i != this.f3447s0.size()) {
                sb.append(";");
            }
        }
        Intent intent = new Intent();
        intent.putExtra("picker", sb.toString());
        m1690e().setResult(-1, intent);
        m1690e().finish();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Cursor mo11876a = this.f3439k0.mo11876a();
        mo11876a.moveToPosition(i);
        this.f3441m0.mo4084a(ContactsContract.Contacts.getLookupUri(mo11876a.getLong(0), mo11876a.getString(1)));
    }
}
