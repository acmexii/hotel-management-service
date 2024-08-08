package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ManageCheckInOutCommand {

    private String checkInOutId;
    private String reservationId;
    private String roomId;
}
