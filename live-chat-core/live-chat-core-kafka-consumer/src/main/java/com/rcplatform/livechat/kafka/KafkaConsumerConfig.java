package com.rcplatform.livechat.kafka;


import com.rcplatform.livechat.kafka.constant.KafkaTopicConstant;
import com.rcplatform.livechat.kafka.serialization.FastJsonDeSerializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {


	@Value("${kafka.servers}")
	private String servers;


	@Bean
	public KafkaConsumer<String, Object> kafkaConsumer() {
		Properties props = new Properties();
		props.put("bootstrap.servers", servers);
		props.put("group.id", "test-group");
		props.put("enable.auto.commit", "false");
		props.put("auto.commit.interval.ms", "100");
		props.put("session.timeout.ms", "30000");
		props.put("max.poll.records", "50");
		props.put("key.deserializer", StringDeserializer.class.getName());
		props.put("value.deserializer", FastJsonDeSerializer.class.getName());
		KafkaConsumer<String, Object> consumer = new KafkaConsumer<>(props);
		consumer.subscribe(Arrays.asList(
				KafkaTopicConstant.USER_RECORD,
				KafkaTopicConstant.ADD_FRIEND_RECORD,
				KafkaTopicConstant.CONSUME_RECORD,
				KafkaTopicConstant.VIDEO_RECORD,
				KafkaTopicConstant.MATCH_STAT,
				KafkaTopicConstant.ADD_GOLD_RECORD,
				KafkaTopicConstant.VIDEO_SNAPSHOTS,
				KafkaTopicConstant.USER_SCORE_RECORD,
				KafkaTopicConstant.EROTICISM_MALE
//				KafkaTopicConstant.EROTICISM_CIRCLE_USER
		));
		return consumer;
	}

	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		factory.setConcurrency(3);
		factory.setBatchListener(true);
		//factory.getContainerProperties().setAckMode(AbstractMessageListenerContainer.AckMode.MANUAL);
		factory.getContainerProperties().setPollTimeout(3000);
		return factory;
	}

	public ConsumerFactory<String, String> consumerFactory() {
		return new DefaultKafkaConsumerFactory<>(consumerConfigs());
	}


	public Map<String, Object> consumerConfigs() {
		Map<String, Object> propsMap = new HashMap<>();
		propsMap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
		propsMap.put(ConsumerConfig.GROUP_ID_CONFIG, "test-group");
		propsMap.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
		propsMap.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 15000);
		propsMap.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
		propsMap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		propsMap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, FastJsonDeSerializer.class);
		//propsMap.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 25);
		// propsMap.put(ConsumerConfig.FETCH_MIN_BYTES_CONFIG,"10000");
		// propsMap.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG,"10000");
//      propsMap.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
		return propsMap;
	}


}