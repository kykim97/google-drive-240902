package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoUrl;
    private String uploader;
    private Date processDt;
}
