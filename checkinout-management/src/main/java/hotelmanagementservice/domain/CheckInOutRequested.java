package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CheckInOutRequested extends AbstractEvent {

    private String checkInOutId;
    private String reservationId;
    private String roomId;
    private String status;

    public CheckInOutRequested(CheckInOut aggregate) {
        super(aggregate);
    }

    public CheckInOutRequested() {
        super();
    }
}
//>>> DDD / Domain Event
