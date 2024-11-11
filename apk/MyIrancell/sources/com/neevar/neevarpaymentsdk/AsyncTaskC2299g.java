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
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.neevar.neevarpaymentsdk.g */
/* loaded from: classes.dex */
class AsyncTaskC2299g extends AsyncTask<String, Void, String> {

    /* renamed from: a */
    AbstractRunnableC2301i<String> f9272a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String str = "";
        try {
            URL url = new URL("https://pas.shaparak.ir/api/PaymentEnquery");
            String str2 = strArr[0];
            String str3 = strArr[1];
            String str4 = strArr[2];
            String str5 = strArr[3];
            String str6 = strArr[4];
            String str7 = strArr[5];
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(25000);
            httpURLConnection.setConnectTimeout(25000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Authorization", C2313u.m11022a().m11023a("sdk", str2, str3, str4));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SalePaymentActivity.PHONO_NO_PARAM, str2);
            jSONObject.put("SdkInfo", "A1CD3709-1AFB-41E9-A953-FC606362767E");
            jSONObject.put("Sign", "");
            jSONObject.put(SalePaymentActivity.TOKEN_PARAM, C2297e.m10997a(C2298f.m10999a(new SecretKeySpec(C2297e.m10998a(str4), "DESede"), (str5 + "," + str2 + "," + str6 + "," + str7).getBytes("UTF-8"))));
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(jSONObject.toString());
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
        } catch (UnsupportedEncodingException | MalformedURLException | ProtocolException | IOException | JSONException | Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public void m11002a(AbstractRunnableC2301i<String> abstractRunnableC2301i) {
        this.f9272a = abstractRunnableC2301i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        AbstractRunnableC2301i<String> abstractRunnableC2301i = this.f9272a;
        if (abstractRunnableC2301i != null) {
            abstractRunnableC2301i.f9273b = str;
            abstractRunnableC2301i.run();
        }
    }
}
