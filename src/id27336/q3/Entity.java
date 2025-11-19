package id27336.q3;

import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate, updatedDate;
    
    public Entity(int id, Date createdDate, Date updatedDate) throws TaxDataException {
        if (id <= 0) throw new TaxDataException("ID must be > 0");
        this.id = id; this.createdDate = createdDate; this.updatedDate = updatedDate;
    }
    
    public int getId() { return id; }
}