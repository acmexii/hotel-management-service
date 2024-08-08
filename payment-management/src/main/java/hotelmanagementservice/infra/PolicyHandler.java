package hotelmanagementservice.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hotelmanagementservice.config.kafka.KafkaProcessor;
import hotelmanagementservice.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PaymentRepository paymentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CheckInOutProcessed'"
    )
    public void wheneverCheckInOutProcessed_PaymentRequestPolicy(
        @Payload CheckInOutProcessed checkInOutProcessed
    ) {
        CheckInOutProcessed event = checkInOutProcessed;
        System.out.println(
            "\n\n##### listener PaymentRequestPolicy : " +
            checkInOutProcessed +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
