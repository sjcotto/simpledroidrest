package com.github.sjcotto.simpledroidrest.test;

import junit.framework.TestCase;

import org.json.JSONObject;
import org.junit.Test;

import com.github.sjcotto.simpledroidrest.HTTPMethod;
import com.github.sjcotto.simpledroidrest.DroidRequest;
import com.github.sjcotto.simpledroidrest.DroidResponse;

import android.widget.Toast;

public class RequestTest extends TestCase {

	@Test
	public void testGET() throws Exception {

		DroidRequest request = new DroidRequest() {
			{
				this.url = "http://demo-guruyu.aws.af.cm/api/hawaii/inbox/admin";
				this.method = HTTPMethod.GET;
			}

			@Override
			public void onSuccess(String jsonObject) {
				assertNotNull(jsonObject);
			}

			@Override
			public void onFailure(DroidResponse res) {
				assertEquals(false, true);
			}
		};
		request.make();

		Thread.sleep(5 * 1000);
	}
	
	/*
	@Test
	public void testPost() throws Exception {

		final JSONObject json = new JSONObject();
		json.put("name", "kona");

		DroidRequest request = new DroidRequest() {
			{
				this.url = "http://app.konacloud.io/api/taio/hello/r_api";
				this.method = HTTPMethod.POST;
				this.data = json.toString();
				this.accessToken = "5b7fb5bd-addc-4d72-8fb3-3e2b90fcbf69";
			}

			@Override
			public void onSuccess(String jsonObject) {
				assertNotNull(jsonObject);
			}

			@Override
			public void onFailure(DroidResponse res) {
				assertEquals(false, true);

			}
		};
		request.make();

		Thread.sleep(5 * 1000);
	}

	@Test
	public void testPut() throws Exception {

		final JSONObject json = new JSONObject();
		json.put("name", "kona");

		DroidRequest request = new DroidRequest() {
			{
				this.url = "http://app.konacloud.io/api/taio/hello/r_api";
				this.method = HTTPMethod.PUT;
				this.data = json.toString();
				this.accessToken = "5b7fb5bd-addc-4d72-8fb3-3e2b90fcbf69";
			}

			@Override
			public void onSuccess(String jsonObject) {
				assertNotNull(jsonObject);
			}

			@Override
			public void onFailure(DroidResponse res) {
				assertEquals(false, true);

			}
		};
		request.make();

		Thread.sleep(5 * 1000);

	}

	@Test
	public void testDelete() throws Exception {

		DroidRequest request = new DroidRequest() {
			{
				this.url = "http://app.konacloud.io/api/taio/hello/r_api";
				this.method = HTTPMethod.DELETE;
				this.accessToken = "5b7fb5bd-addc-4d72-8fb3-3e2b90fcbf69";
			}

			@Override
			public void onSuccess(String jsonObject) {
				assertNotNull(jsonObject);
			}

			@Override
			public void onFailure(DroidResponse res) {
				assertEquals(false, true);

			}
		};
		request.make();

		Thread.sleep(5 * 1000);
	}
	
	*/
}
