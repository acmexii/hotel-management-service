package hotelmanagementservice.domain;

import hotelmanagementservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "rooms", path = "rooms")
public interface RoomRepository
    extends PagingAndSortingRepository<Room, String> {}
