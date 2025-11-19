package id27336.q5;

import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate, updatedDate;
    
    public Entity(int id, Date createdDate, Date updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        this.id = id; this.createdDate = createdDate; this.updatedDate = updatedDate;
    }
    
    public int getId() { return id; }
}