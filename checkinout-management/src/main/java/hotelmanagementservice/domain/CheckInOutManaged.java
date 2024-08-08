package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CheckInOutManaged extends AbstractEvent {

    private String checkInOutId;
    private String reservationId;
    private String roomId;
    private String status;

    public CheckInOutManaged(CheckInOut aggregate) {
        super(aggregate);
    }

    public CheckInOutManaged() {
        super();
    }
}
//>>> DDD / Domain Event
