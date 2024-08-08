package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationApproved extends AbstractEvent {

    private String reservationId;
    private String customerId;
    private Date startDate;
    private Date endDate;
    private String status;

    public ReservationApproved(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationApproved() {
        super();
    }
}
//>>> DDD / Domain Event
