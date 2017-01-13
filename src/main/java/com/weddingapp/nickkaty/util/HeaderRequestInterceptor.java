/**
 * 
 */
package com.weddingapp.nickkaty.util;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;

/**
 * 
 * 
 * @since 12 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public class HeaderRequestInterceptor implements ClientHttpRequestInterceptor {
	
	private final String headerName;
	private final String headerValue;

	/**
	 * @param headerKey
	 * @param headerValue
	 */
	public HeaderRequestInterceptor(String headerName, String headerValue) {
		this.headerName = headerName;
		this.headerValue = headerValue;
	}



	/* (non-Javadoc)
	 * @see org.springframework.http.client.ClientHttpRequestInterceptor#intercept(org.springframework.http.HttpRequest, byte[], org.springframework.http.client.ClientHttpRequestExecution)
	 */
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		
		HttpRequest wrapper = new HttpRequestWrapper(request);
		wrapper.getHeaders().set(headerName, headerValue);
		
		return execution.execute(wrapper, body);
	}

}
