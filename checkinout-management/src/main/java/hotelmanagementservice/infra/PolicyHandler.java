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
    CheckInOutRepository checkInOutRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RoomRegistered'"
    )
    public void wheneverRoomRegistered_RoomStatusCheckPolicy(
        @Payload RoomRegistered roomRegistered
    ) {
        RoomRegistered event = roomRegistered;
        System.out.println(
            "\n\n##### listener RoomStatusCheckPolicy : " +
            roomRegistered +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationApproved'"
    )
    public void wheneverReservationApproved_CheckInOutRequestPolicy(
        @Payload ReservationApproved reservationApproved
    ) {
        ReservationApproved event = reservationApproved;
        System.out.println(
            "\n\n##### listener CheckInOutRequestPolicy : " +
            reservationApproved +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
