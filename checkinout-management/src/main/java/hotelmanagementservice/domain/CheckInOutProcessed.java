package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CheckInOutProcessed extends AbstractEvent {

    private String checkInOutId;
    private String reservationId;
    private String roomId;
    private String status;

    public CheckInOutProcessed(CheckInOut aggregate) {
        super(aggregate);
    }

    public CheckInOutProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
