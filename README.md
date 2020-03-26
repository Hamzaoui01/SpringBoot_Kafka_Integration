# Requirement to run
- You should have apache kafka installed in your environment or install it [here](https://kafka.apache.org/quickstart) 
# Install dependencies
```
mvn intall
```
# How to run 
## Run Zookeeper  
```
Zookeeper-server-start.bat  path_To_Zookeeper_Config/zookeeper.properties
```

## Run Kafka server  
```
kafka-server-start.bat  path_To_kafka_Config/server.properties```

```

## Creating TOPICS :
We will use two topics in this example, i've named them "kafka_exemple" and "kafka_exemple2":
```
Kafka-topics.bat --create --zookeeper localhost :2181 --replication-factor 1 --partitions 1 --topic kafka_Example
```
## Run Two instances:
1. We should run two instance in diffrent port: you can change the serer port in the application.properties file befor runing the applicatin instance.

2. For the first instance make the first topic "kafka_exemple" for producing, and the second for consuming, and inverse them in the second instance, **you can do this in the kafkaConstant class**
