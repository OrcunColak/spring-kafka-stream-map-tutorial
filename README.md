# Read Me

The original idea is from  
https://medium.com/@idea.luminate/embarking-on-the-kafka-streams-adventure-from-setup-to-action-b200306e8973

Open terminal to kafka docker image

Create topic

```
$ /bin/kafka-topics --create --topic quickstart-events --bootstrap-server localhost:9092
```

Send messages to topic

```
$ /bin/kafka-console-producer --topic quickstart-events --bootstrap-server localhost:9092
```