package com.notificationmessage.server.responsedto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.notificationmessage.server.entity.TransactionData;

public class MessageResponseDto implements Serializable {
	
	private Long responseCode;
	private String responseMessage;

	public Long getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Long responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
