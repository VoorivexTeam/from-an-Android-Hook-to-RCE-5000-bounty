package com.neevar.neevarpaymentsdk;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/* renamed from: com.neevar.neevarpaymentsdk.t */
/* loaded from: classes.dex */
class AsyncTaskC2312t extends AsyncTask<String, Void, String> {

    /* renamed from: a */
    AbstractRunnableC2301i<String> f9305a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String str = "";
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://pas.shaparak.ir/api/ServerTime").openConnection();
            httpURLConnection.setReadTimeout(25000);
            httpURLConnection.setConnectTimeout(25000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str = str + readLine;
                }
            }
        } catch (UnsupportedEncodingException | MalformedURLException | ProtocolException | IOException | Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public void m11020a(AbstractRunnableC2301i<String> abstractRunnableC2301i) {
        this.f9305a = abstractRunnableC2301i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        AbstractRunnableC2301i<String> abstractRunnableC2301i = this.f9305a;
        if (abstractRunnableC2301i != null) {
            abstractRunnableC2301i.f9273b = str;
            abstractRunnableC2301i.run();
        }
    }
}
