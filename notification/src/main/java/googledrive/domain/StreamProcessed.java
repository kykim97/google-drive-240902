package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoUrl;
    private String uploader;
    private Date processDt;
}
