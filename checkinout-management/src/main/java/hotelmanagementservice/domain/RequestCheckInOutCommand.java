package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RequestCheckInOutCommand {

    private String reservationId;
    private String roomId;
}
