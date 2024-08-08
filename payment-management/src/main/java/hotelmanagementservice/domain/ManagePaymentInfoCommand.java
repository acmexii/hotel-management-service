package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ManagePaymentInfoCommand {

    private String paymentId;
    private String reservationId;
    private String customerId;
}
