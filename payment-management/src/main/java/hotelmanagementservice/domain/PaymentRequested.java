package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentRequested extends AbstractEvent {

    private String paymentId;
    private String reservationId;
    private String customerId;
    private String status;

    public PaymentRequested(Payment aggregate) {
        super(aggregate);
    }

    public PaymentRequested() {
        super();
    }
}
//>>> DDD / Domain Event
