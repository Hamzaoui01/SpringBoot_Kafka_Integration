package hamzaoui.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hamzaoui.com.configuration.KafkaConstatnts;
import hamzaoui.com.dao.Messages;

@RestController
@RequestMapping("message")
@EnableKafka
public class Producer {
	
	@Autowired	
	private KafkaTemplate<String,String> kafkaTemplate;
	private Messages messagesDao=new Messages();
	
	@GetMapping("/publish/{message}")
	public List<String> post(@PathVariable("message") final String message) {	
		  	messagesDao.addMessages("Me: "+message);
	        kafkaTemplate.send(KafkaConstatnts.PRODUCING_TOPIC_NAME,message);	        	      
	        return messagesDao.getMessages();
	}
}



