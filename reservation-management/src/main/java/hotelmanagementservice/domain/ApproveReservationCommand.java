package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ApproveReservationCommand {

    private String reservationId;
}
