Reference:
https://kafka.apache.org/documentation/#quickstart

# Start the ZooKeeper service
# Note: Soon, ZooKeeper will no longer be required by Apache Kafka.
# ZooKeeper listens to 2181 by default
./bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
# Kafka listens to 9092 by default
./bin/kafka-server-start.sh config/server.properties

# Create topic 
./bin/kafka-topics.sh --create --topic kafka-topic --bootstrap-server localhost:9092
./bin/kafka-topics.sh --create --topic user-topic --bootstrap-server localhost:9092

# Describe topic 
$ bin/kafka-topics.sh --describe --topic kafka-topic --bootstrap-server localhost:9092

# List all topics 
./bin/kafka-topics.sh --list --zookeeper localhost:2181

# Write events to topic
./bin/kafka-console-producer.sh --topic kafka-topic --bootstrap-server localhost:9092
# Via browser 
# Topic: kafka-topic
http://localhost:8081/kafka/publish/helloKafka
 or
# Topic: user-topic
http://localhost:8081/user/publish/helloKafka


# Read events 
./bin/kafka-console-consumer.sh --topic kafka-topic --from-beginning --bootstrap-server localhost:9092


------------------------------------------------------------------------------------------------------------------------


./bin/kafka-topics.sh --create --topic kafka_topic --bootstrap-server localhost:9092

./bin/kafka-topics.sh --describe --topic kafka_topic --bootstrap-server localhost:9092

./bin/kafka-console-producer.sh --topic kafka_topic --bootstrap-server localhost:9092

./bin/kafka-console-consumer.sh --topic kafka_topic --from-beginning --bootstrap-server localhost:9092

bcz of git bash
log4j:ERROR Could not read configuration file from URL  config/tools-log4j.properties

http://localhost:8081/kafka/publish/helloKafka 

------------------------------------------------------------------------------------------------------------------------

class org.jana.kafka2.model.User cannot be cast to class java.lang.String (org.jana.kafka2.model.User is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')