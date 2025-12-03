package id27336.q3;

import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate, updatedDate;
    
    public Entity(int id, Date createdDate, Date updatedDate) {
        if (id > 0) {
            this.id = id; this.createdDate = createdDate; this.updatedDate = updatedDate;
        } else {
            System.out.println("ERROR: ID must be > 0");
        }
    }
    
    public int getId() { return id; }
}