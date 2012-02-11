/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.soahitcounter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author vkesola
 */
public class SimpleSOAHitCounter {
      private String getResponseBody(String url) {
        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        try {
            HttpResponse response = httpclient.execute(httpget);
            return readInputStream(response.getEntity().getContent());
        } catch (IOException ex) {
            Logger.getLogger(SimpleSOAHitCounter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private String readInputStream(InputStream is) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(is);
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine()).append("\n");
        }

        return sb.toString();
    }

}
