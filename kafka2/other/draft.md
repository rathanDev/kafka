
./bin/kafka-topics.sh --create --topic kafka_topic --bootstrap-server localhost:9092

./bin/kafka-topics.sh --describe --topic kafka_topic --bootstrap-server localhost:9092

./bin/kafka-console-producer.sh --topic kafka_topic --bootstrap-server localhost:9092

./bin/kafka-console-consumer.sh --topic kafka_topic --from-beginning --bootstrap-server localhost:9092

bcz of git bash
log4j:ERROR Could not read configuration file from URL  config/tools-log4j.properties