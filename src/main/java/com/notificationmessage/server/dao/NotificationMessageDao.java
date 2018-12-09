package com.notificationmessage.server.dao;

import org.springframework.stereotype.Component;

import com.notificationmessage.server.entity.NotificationMessage;
import com.notificationmessage.server.entity.TransactionData;
import com.notificationmessage.server.requestdto.MessageRequestDto;

@Component
public interface NotificationMessageDao {

	public NotificationMessage getNotificationMessage(MessageRequestDto dto, Long transactionId);
	
	public TransactionData getTransactionData(String transactionType);
	
}
