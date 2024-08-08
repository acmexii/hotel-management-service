package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateRoomCommand {

    private String roomId;
    private String roomNumber;
}
