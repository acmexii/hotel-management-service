package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationRequested extends AbstractEvent {

    private String reservationId;
    private String customerId;
    private Date startDate;
    private Date endDate;
    private String status;

    public ReservationRequested(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationRequested() {
        super();
    }
}
//>>> DDD / Domain Event
