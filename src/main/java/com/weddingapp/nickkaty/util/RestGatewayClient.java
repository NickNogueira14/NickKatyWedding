/**
 * 
 */
package com.weddingapp.nickkaty.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * 
 * @since 12 de jan de 2017
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
public final class RestGatewayClient {
	
	private final List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
	
	public void addHeader(String key, String value) {
		interceptors.add(new HeaderRequestInterceptor(key, value));
	}
	
	public static RestTemplate getOAuthTemplate() {
		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
		interceptors.add(new HeaderRequestInterceptor(Constants.SPOTIFY_HEADER_AUTH_KEY, new String(DatatypeConverter.parseBase64Binary(Constants.SPOTIFY_HEADER_AUTH_VALUE))));
		interceptors.add(new HeaderRequestInterceptor("Content-Type", "application/x-www-form-urlencoded"));
		
		RestTemplate template = new RestTemplate();
		template.setInterceptors(interceptors);
		
		return template;
	}

}
