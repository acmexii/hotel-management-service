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
// @RequestMapping(value="/checkInOuts")
@Transactional
public class CheckInOutController {

    @Autowired
    CheckInOutRepository checkInOutRepository;

    @RequestMapping(
        value = "/checkInOuts/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CheckInOut manageCheckInOut(
        @PathVariable(value = "id") String id,
        @RequestBody ManageCheckInOutCommand manageCheckInOutCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /checkInOut/manageCheckInOut  called #####");
        Optional<CheckInOut> optionalCheckInOut = checkInOutRepository.findById(
            id
        );

        optionalCheckInOut.orElseThrow(() -> new Exception("No Entity Found"));
        CheckInOut checkInOut = optionalCheckInOut.get();
        checkInOut.manageCheckInOut(manageCheckInOutCommand);

        checkInOutRepository.save(checkInOut);
        return checkInOut;
    }

    @RequestMapping(
        value = "/checkInOuts/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CheckInOut processCheckInOut(
        @PathVariable(value = "id") String id,
        @RequestBody ProcessCheckInOutCommand processCheckInOutCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /checkInOut/processCheckInOut  called #####");
        Optional<CheckInOut> optionalCheckInOut = checkInOutRepository.findById(
            id
        );

        optionalCheckInOut.orElseThrow(() -> new Exception("No Entity Found"));
        CheckInOut checkInOut = optionalCheckInOut.get();
        checkInOut.processCheckInOut(processCheckInOutCommand);

        checkInOutRepository.save(checkInOut);
        return checkInOut;
    }
}
//>>> Clean Arch / Inbound Adaptor
