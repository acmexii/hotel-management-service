package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationRejected extends AbstractEvent {

    private String reservationId;
    private String customerId;
    private Date startDate;
    private Date endDate;
    private String status;

    public ReservationRejected(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationRejected() {
        super();
    }
}
//>>> DDD / Domain Event
