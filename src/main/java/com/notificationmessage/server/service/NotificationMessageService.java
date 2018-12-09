package com.notificationmessage.server.service;

import org.springframework.stereotype.Component;

import com.notificationmessage.server.requestdto.MessageRequestDto;
import com.notificationmessage.server.responsedto.MessageResponseDto;


@Component
public interface NotificationMessageService {

	public MessageResponseDto sendEmail(MessageRequestDto messageRequestDto);

}
