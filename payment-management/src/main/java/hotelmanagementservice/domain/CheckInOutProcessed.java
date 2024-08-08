package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CheckInOutProcessed extends AbstractEvent {

    private String checkInOutId;
    private String reservationId;
    private String roomId;
    private String status;
}
