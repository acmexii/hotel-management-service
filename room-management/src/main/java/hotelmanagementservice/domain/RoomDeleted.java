package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RoomDeleted extends AbstractEvent {

    private String roomId;
    private String roomNumber;
    private String status;

    public RoomDeleted(Room aggregate) {
        super(aggregate);
    }

    public RoomDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
