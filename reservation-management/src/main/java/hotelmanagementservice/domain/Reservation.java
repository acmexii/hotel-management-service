package hotelmanagementservice.domain;

import hotelmanagementservice.ReservationManagementApplication;
import hotelmanagementservice.domain.ReservationRequested;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Reservation_table")
@Data
//<<< DDD / Aggregate Root
public class Reservation {

    @Id
    private String reservationId;

    private String customerId;

    private String roomId;

    private Date startDate;

    private Date endDate;

    private String status;

    @Embedded
    private statusType statusType;

    @PostPersist
    public void onPostPersist() {
        ReservationRequested reservationRequested = new ReservationRequested(
            this
        );
        reservationRequested.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReservationManagementApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }

    //<<< Clean Arch / Port Method
    public void approveReservation(
        ApproveReservationCommand approveReservationCommand
    ) {
        //implement business logic here:

        ReservationApproved reservationApproved = new ReservationApproved(this);
        reservationApproved.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void rejectReservation(
        RejectReservationCommand rejectReservationCommand
    ) {
        //implement business logic here:

        ReservationRejected reservationRejected = new ReservationRejected(this);
        reservationRejected.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
