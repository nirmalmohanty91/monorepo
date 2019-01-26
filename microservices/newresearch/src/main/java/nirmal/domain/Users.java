package nirmal.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
//@AllArgsConstructor
/**
 * public Users(String name, String teamName, Long salary) {
 this.name = name;
 this.teamName = teamName;
 this.salary = salary;
 }
 */
//@RequiredArgsConstructor
/**
 *  public Users() {
 }
 */
@NoArgsConstructor
public class Users implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String teamName;
    private Long salary;

}
