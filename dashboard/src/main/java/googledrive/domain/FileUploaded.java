package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String uploader;
    private String fileName;
    private String fileType;
    private Float fileSize;
    private Date uploadDt;
}
