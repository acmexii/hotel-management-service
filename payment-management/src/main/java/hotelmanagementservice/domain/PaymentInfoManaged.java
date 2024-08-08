package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentInfoManaged extends AbstractEvent {

    private String paymentId;
    private String reservationId;
    private String customerId;
    private String status;

    public PaymentInfoManaged(Payment aggregate) {
        super(aggregate);
    }

    public PaymentInfoManaged() {
        super();
    }
}
//>>> DDD / Domain Event
