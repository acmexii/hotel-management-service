package hotelmanagementservice.domain;

import hotelmanagementservice.RoomManagementApplication;
import hotelmanagementservice.domain.RoomDeleted;
import hotelmanagementservice.domain.RoomRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Room_table")
@Data
//<<< DDD / Aggregate Root
public class Room {

    @Id
    private String roomId;

    private String roomNumber;

    private String status;

    @Embedded
    private statusType statusType;

    @PostPersist
    public void onPostPersist() {
        RoomRegistered roomRegistered = new RoomRegistered(this);
        roomRegistered.publishAfterCommit();

        RoomDeleted roomDeleted = new RoomDeleted(this);
        roomDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RoomRepository repository() {
        RoomRepository roomRepository = RoomManagementApplication.applicationContext.getBean(
            RoomRepository.class
        );
        return roomRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateRoom(UpdateRoomCommand updateRoomCommand) {
        //implement business logic here:

        RoomUpdated roomUpdated = new RoomUpdated(this);
        roomUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
