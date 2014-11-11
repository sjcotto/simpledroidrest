package com.github.sjcotto.simpledroidrest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;

public class HTTPUtil {

	public static void addRequestHedaers(Object httpElement,
			Map<String, String> headers) {

		if (httpElement instanceof HttpEntityEnclosingRequestBase) {
			HttpEntityEnclosingRequestBase http = (HttpEntityEnclosingRequestBase) httpElement;
			http.setHeader("Accept", "application/json");
			http.setHeader("Content-type", "application/json");

			if (headers != null) {
				for (String key : headers.keySet()) {
					String value = headers.get(key);
					http.setHeader(key, value);
				}
			}
		} else if (httpElement instanceof HttpGet){
			HttpGet http = (HttpGet) httpElement;
			if (headers != null) {
				for (String key : headers.keySet()) {
					String value = headers.get(key);
					http.setHeader(key, value);
				}
			}
		} else if (httpElement instanceof HttpDelete){
			HttpDelete http = (HttpDelete) httpElement;
			if (headers != null) {
				for (String key : headers.keySet()) {
					String value = headers.get(key);
					http.setHeader(key, value);
				}
			}
		}

	}

	public static String getStringFromHttpResponse(HttpResponse execute)
			throws IllegalStateException, IOException {

		InputStream content = execute.getEntity().getContent();

		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				content));
		String response = "";
		String s = "";
		while ((s = buffer.readLine()) != null) {
			response += s;
		}
		return response;

	}
}
