package Entity.onetoone;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pass_id;
    private Date date;

    @OneToOne(mappedBy = "passport")
    private Client client;

    public int getPass_id() {
        return pass_id;
    }

    public void setPass_id(int pass_id) {
        this.pass_id = pass_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
