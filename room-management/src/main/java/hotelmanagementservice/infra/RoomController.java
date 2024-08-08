package hotelmanagementservice.infra;

import hotelmanagementservice.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/rooms")
@Transactional
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @RequestMapping(
        value = "/rooms/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Room updateRoom(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateRoomCommand updateRoomCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /room/updateRoom  called #####");
        Optional<Room> optionalRoom = roomRepository.findById(id);

        optionalRoom.orElseThrow(() -> new Exception("No Entity Found"));
        Room room = optionalRoom.get();
        room.updateRoom(updateRoomCommand);

        roomRepository.save(room);
        return room;
    }
}
//>>> Clean Arch / Inbound Adaptor
