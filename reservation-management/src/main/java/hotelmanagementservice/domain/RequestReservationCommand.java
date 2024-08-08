package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RequestReservationCommand {

    private String customerId;
    private Date startDate;
    private Date endDate;
}
