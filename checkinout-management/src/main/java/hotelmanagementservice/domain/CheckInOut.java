package hotelmanagementservice.domain;

import hotelmanagementservice.CheckinoutManagementApplication;
import hotelmanagementservice.domain.CheckInOutRequested;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CheckInOut_table")
@Data
//<<< DDD / Aggregate Root
public class CheckInOut {

    @Id
    private String checkInOutId;

    private String reservationId;

    private String roomId;

    private String status;

    @Embedded
    private statusType statusType;

    @PostPersist
    public void onPostPersist() {
        CheckInOutRequested checkInOutRequested = new CheckInOutRequested(this);
        checkInOutRequested.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CheckInOutRepository repository() {
        CheckInOutRepository checkInOutRepository = CheckinoutManagementApplication.applicationContext.getBean(
            CheckInOutRepository.class
        );
        return checkInOutRepository;
    }

    //<<< Clean Arch / Port Method
    public void manageCheckInOut(
        ManageCheckInOutCommand manageCheckInOutCommand
    ) {
        //implement business logic here:

        CheckInOutManaged checkInOutManaged = new CheckInOutManaged(this);
        checkInOutManaged.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void processCheckInOut(
        ProcessCheckInOutCommand processCheckInOutCommand
    ) {
        //implement business logic here:

        CheckInOutProcessed checkInOutProcessed = new CheckInOutProcessed(this);
        checkInOutProcessed.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
