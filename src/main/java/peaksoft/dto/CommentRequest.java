package peaksoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentRequest {
    private String comment;

    public CommentRequest(String comment) {
        this.comment = comment;
    }
}
