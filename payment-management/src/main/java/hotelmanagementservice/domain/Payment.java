package hotelmanagementservice.domain;

import hotelmanagementservice.PaymentManagementApplication;
import hotelmanagementservice.domain.PaymentRequested;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Payment_table")
@Data
//<<< DDD / Aggregate Root
public class Payment {

    @Id
    private String paymentId;

    private String reservationId;

    private String customerId;

    private String status;

    @Embedded
    private statusType statusType;

    @PostPersist
    public void onPostPersist() {
        PaymentRequested paymentRequested = new PaymentRequested(this);
        paymentRequested.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentManagementApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }

    //<<< Clean Arch / Port Method
    public void managePaymentInfo(
        ManagePaymentInfoCommand managePaymentInfoCommand
    ) {
        //implement business logic here:

        PaymentInfoManaged paymentInfoManaged = new PaymentInfoManaged(this);
        paymentInfoManaged.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
