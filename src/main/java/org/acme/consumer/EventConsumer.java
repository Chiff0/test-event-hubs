package org.acme.consumer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jboss.logging.Logger;
import org.acme.events.AccountEvent;
import org.acme.events.TransactionEvent;

@ApplicationScoped
public class EventConsumer {
    
    private static final Logger LOG = Logger.getLogger(EventConsumer.class);
    
    @Inject
    ObjectMapper objectMapper;
    
    @Incoming("account-events")
    public void consumeAccountEvent(String json) {
        try {
            LOG.infof("Received account event: %s", json);
            
            AccountEvent event = objectMapper.readValue(json, AccountEvent.class);
            
            LOG.infof("Parsed successfully - recordId: %s, cardNumber: %s", 
                      event.payload.recordId, 
                      event.payload.cardNumber);
            
        } catch (Exception e) {
            LOG.error("Error parsing account event", e);
        }
    }
    
    @Incoming("transaction-events")
    public void consumeTransactionEvent(String json) {
        try {
            LOG.infof("Received transaction event: %s", json);
            
            TransactionEvent event = objectMapper.readValue(json, TransactionEvent.class);
            
            LOG.infof("Parsed successfully - recordId: %s, transactionId: %s", 
                      event.payload.recordId, 
                      event.payload.transactionId);
            
        } catch (Exception e) {
            LOG.error("Error parsing transaction event", e);
        }
    }
}
