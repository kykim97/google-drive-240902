package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String uploader;
    private String fileName;
    private String fileType;
    private Float fileSize;
    private Date uploadDt;
}
