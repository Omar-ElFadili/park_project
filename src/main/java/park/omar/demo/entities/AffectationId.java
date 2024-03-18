package park.omar.demo.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AffectationId implements Serializable {
    private String  conducteurId;
    private String vehiculeId;

    public AffectationId(String conducteurId, String vehiculeId) {
        this.conducteurId=conducteurId;
        this.vehiculeId=vehiculeId;
    }
}