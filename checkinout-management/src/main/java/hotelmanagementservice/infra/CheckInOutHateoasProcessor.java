package hotelmanagementservice.infra;

import hotelmanagementservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CheckInOutHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CheckInOut>> {

    @Override
    public EntityModel<CheckInOut> process(EntityModel<CheckInOut> model) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
