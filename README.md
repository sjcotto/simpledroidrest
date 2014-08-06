Simple Droid Rest Client
===============


# Usage

## Get Method

```
DroidRequest request = new DroidRequest() {
			{
				this.url = "http://...";
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
```

## Post Method

```
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
	}
```

## Put Method

```
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

	}
```

## Delete Method

```
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
	}
```
