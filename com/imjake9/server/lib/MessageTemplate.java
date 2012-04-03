package com.imjake9.server.lib;

import com.imjake9.server.lib.Messaging.MessageLevel;

public interface MessageTemplate {
    
    String getMessage();
    MessageLevel getLevel();
    
}
