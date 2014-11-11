package com.github.sjcotto.simpledroidrest;

public class SinDroidRequest extends DroidRequest {
	
	public SinDroidRequest(String url, HTTPMethod method, String data) {
		this.url = url;
		this.method = method;
		this.data = data;
	}
	@Override
	public void onSuccess(String jsonObject) {
		//
	}

	@Override
	public void onFailure(DroidResponse res) {
		// TODO Auto-generated method stub

	}
	

}
