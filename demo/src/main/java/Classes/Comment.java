package Classes;

public class Comment {
    private String text;
    private String id;
    private String parentCommentId;
    private String userId;
    private String roomId;
    
    public Comment(String text, String id, String parentCommentId, String userId, String roomId) {
        this.text = text;
        this.id = id;
        this.parentCommentId = parentCommentId;
        this.userId = userId;
        this.roomId = roomId;
    }
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getParentCommentId() {
        return parentCommentId;
    }
    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

}
