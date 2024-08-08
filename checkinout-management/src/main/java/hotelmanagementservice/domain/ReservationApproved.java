package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReservationApproved extends AbstractEvent {

    private String reservationId;
    private String customerId;
    private Date startDate;
    private Date endDate;
    private String status;
}
