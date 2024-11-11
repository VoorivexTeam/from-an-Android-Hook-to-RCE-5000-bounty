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

/* loaded from: classes.dex */
class g extends AsyncTask<String, Void, String> {
    i<String> a;

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
            httpURLConnection.setRequestProperty("Authorization", u.a().a("sdk", str2, str3, str4));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SalePaymentActivity.PHONO_NO_PARAM, str2);
            jSONObject.put("SdkInfo", "A1CD3709-1AFB-41E9-A953-FC606362767E");
            jSONObject.put("Sign", "");
            jSONObject.put(SalePaymentActivity.TOKEN_PARAM, e.a(f.a(new SecretKeySpec(e.a(str4), "DESede"), (str5 + "," + str2 + "," + str6 + "," + str7).getBytes("UTF-8"))));
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

    public void a(i<String> iVar) {
        this.a = iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        i<String> iVar = this.a;
        if (iVar != null) {
            iVar.b = str;
            iVar.run();
        }
    }
}
