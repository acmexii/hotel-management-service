package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import hotelmanagementservice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RoomRegistered extends AbstractEvent {

    private String roomId;
    private String roomNumber;
    private String status;
}
