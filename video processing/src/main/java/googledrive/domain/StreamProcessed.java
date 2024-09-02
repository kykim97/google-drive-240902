package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoUrl;
    private String uploader;
    private Date processDt;

    public StreamProcessed(Video aggregate) {
        super(aggregate);
    }

    public StreamProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
