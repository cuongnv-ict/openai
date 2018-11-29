package mongodb.ai.dto;

import java.io.Serializable;

public class Stories implements Serializable {
    private int contentId;

    private String title;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
