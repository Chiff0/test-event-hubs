package org.acme.consumer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jboss.logging.Logger;
import org.acme.event.AccountEvent;
import org.acme.event.TransactionEvent;

@ApplicationScoped
public class EventConsumer
{
  private static final Logger logger = Logger.getLogger(EventConsumer.class);
  
  @Inject 
  ObjectMapper objectMapper
  
  @Incoming("account-events")
  {
    public void consumeAccountEvent(String json)
    {
      try 
      {
        logger.infof("Recieved account event: %s", json);

        AccountEvent event = objectMapper.readValue(json, AccountEvent.class);

        logger.infof("Parsed - recordID: %s, transactionId: %s", event.payload.recordId, event.payload.transactionId);

      } catch (Exception e) 
      {
        logger.error("Error parsing account event json", e)
      }

    }
  }
    public void consumeTransactionEvent(String json)
    {
      try 
      {
        logger.infof("Recieved transaction event: %s", json);

        AccountEvent event = objectMapper.readValue(json, TransactionEvent.class);

        logger.infof("Parsed - recordID: %s, cardNumber: %s", event.payload.recordId, event.payload.cardNumber);

      } catch (Exception e) 
      {
        logger.error("Error parsing transaction event json", e)
      }

    }
  }

}
