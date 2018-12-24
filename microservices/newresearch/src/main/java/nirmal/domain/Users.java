package nirmal.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String teamName;
    private Long salary;
    public Users(String name, String teamName, Long salary) {
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }
    public Users() {

    }
    
    
}
