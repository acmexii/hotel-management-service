package hotelmanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeleteRoomCommand {

    private String roomId;
}
