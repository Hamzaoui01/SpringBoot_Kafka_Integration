package hamzaoui.com.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import hamzaoui.com.configuration.KafkaConstatnts;
import hamzaoui.com.dao.Messages;

@Service
public class ConsummerService {
	private Messages messagesDao=new Messages();

    @KafkaListener(topics = KafkaConstatnts.COSUMING_TOPIC_NAME,
    		groupId = KafkaConstatnts.GROUPE_ID)
    public void consume(String message) {
    	messagesDao.addMessages("Strager: "+message);       
    }
}
