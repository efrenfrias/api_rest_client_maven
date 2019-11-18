package com.accenture.api.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.api.config.ConfigUtility;
import com.accenture.api.reponse.ShareCountResponse;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class ApiClientServ {
	
	@Autowired
	private ConfigUtility configUtility;
	
	OkHttpClient client = new OkHttpClient();
	ObjectMapper mapper = new ObjectMapper();
	
	public void consumeApiFacebook(String[] args) {
		try {
			String result = getDataFromApiFacebook();
			ShareCountResponse shareCountBean = getShareCountBeanFromString(result);
			writeFile("shareCount.json", shareCountBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public String getDataFromApiFacebook() throws IOException {
		String result = null;	
		  HttpUrl url = new HttpUrl.Builder()
			.scheme(configUtility.getProperty("client.api.schema").trim())
			.host(configUtility.getProperty("client.api.host").trim())
			.addPathSegment(configUtility.getProperty("client.api.path.segment").trim())
			.addQueryParameter("id", configUtility.getProperty("client.id").trim())
			.addQueryParameter("fields", configUtility.getProperty("client.fields").trim())
			.addQueryParameter("access_token", configUtility.getProperty("client.access_token").trim())
			.build();		  
		  Request request = new Request.Builder()
				  .url(url)
				  .build();
		  
		  Response response = client.newCall(request).execute();
		  result = response.body().string();
		  
		return result;
	}

	public ShareCountResponse getShareCountBeanFromString(String json) throws JsonMappingException, JsonProcessingException {
		ShareCountResponse shareCountBean = null;
		shareCountBean = mapper.readValue(json, ShareCountResponse.class);
		return shareCountBean;
	}
	
	public void writeFile(String fileName, Object objetToWrite) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter write = mapper.writer(new DefaultPrettyPrinter());
		write.writeValue(new File(fileName), objetToWrite);
	}
	
	

}
