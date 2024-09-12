package com.colak.springtutorial.readstream;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ReadMessagesFromStream {
    private static final Serde<String> STRING_SERDE = Serdes.String();

    @Autowired
    public void readFromStream(StreamsBuilder streamsBuilder) {
        KStream<String, String> stream = streamsBuilder.stream("quickstart-events", Consumed.with(STRING_SERDE, STRING_SERDE));
        stream.mapValues((s, s2) -> {
            log.info(s2);
            return s;
        });
    }
}
