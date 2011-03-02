/*******************************************************************************
 * Copyright (c) 2006-2007 Koji Hisano <hisano@gmail.com> - UBION Inc. Developer
 * Copyright (c) 2006-2007 UBION Inc. <http://www.ubion.co.jp/>
 * 
 * Copyright (c) 2006-2007 Skype Technologies S.A. <http://www.skype.com/>
 * 
 * Skype4Java is licensed under either the Apache License, Version 2.0 or
 * the Eclipse Public License v1.0.
 * You may use it freely in commercial and non-commercial products.
 * You may obtain a copy of the licenses at
 *
 *   the Apache License - http://www.apache.org/licenses/LICENSE-2.0
 *   the Eclipse Public License - http://www.eclipse.org/legal/epl-v10.html
 *
 * If it is possible to cooperate with the publicity of Skype4Java, please add
 * links to the Skype4Java web site <https://developer.skype.com/wiki/Java_API> 
 * in your web site or documents.
 * 
 * Contributors: Koji Hisano - initial API and implementation
 ******************************************************************************/
package com.skype.sample;

import com.skype.Chat;
import com.skype.ChatMessage;
import com.skype.Skype;

public class SendChatMessage {
    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.out.println("Usage: java com.skype.sample.SendChatMessage 'skype_id' 'chat_message'");
//            return;
//        }
//        Skype.chat("echo123").send("wohoo");
        Chat[] allRecentChats = Skype.getAllRecentChats();
        
        for(Chat chat: allRecentChats) {
            ChatMessage[] allChatMessages = chat.getAllChatMessages();
            for(ChatMessage chatMessage: allChatMessages) {
                System.out.println(chatMessage.getId());
                System.out.println(chatMessage.getSenderId());
                System.out.println(chatMessage.getSenderDisplayName());
                System.out.println(chatMessage.getContent());
            }
        }
    }
}