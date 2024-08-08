package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "checkInOuts",
    path = "checkInOuts"
)
public interface CheckInOutRepository
    extends PagingAndSortingRepository<CheckInOut, String> {}
