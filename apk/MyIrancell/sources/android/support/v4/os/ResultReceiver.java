package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.InterfaceC0057a;

/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0054a();

    /* renamed from: b */
    final Handler f196b = null;

    /* renamed from: c */
    InterfaceC0057a f197c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    static class C0054a implements Parcelable.Creator<ResultReceiver> {
        C0054a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    class BinderC0055b extends InterfaceC0057a.a {
        BinderC0055b() {
        }

        @Override // android.support.v4.os.InterfaceC0057a
        /* renamed from: b */
        public void mo322b(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f196b;
            if (handler != null) {
                handler.post(new RunnableC0056c(i, bundle));
            } else {
                resultReceiver.mo220a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    class RunnableC0056c implements Runnable {

        /* renamed from: b */
        final int f199b;

        /* renamed from: c */
        final Bundle f200c;

        RunnableC0056c(int i, Bundle bundle) {
            this.f199b = i;
            this.f200c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo220a(this.f199b, this.f200c);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f197c = InterfaceC0057a.a.m323a(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo220a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f197c == null) {
                this.f197c = new BinderC0055b();
            }
            parcel.writeStrongBinder(this.f197c.asBinder());
        }
    }
}
