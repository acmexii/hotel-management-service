package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ProcessCheckInOutCommand {

    private String checkInOutId;
    private String reservationId;
    private String roomId;
}
