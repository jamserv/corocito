package co.com.sibm.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author usuario
 */
@Entity
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String id_number;
    private String last_name;
    private String no_apto;
    private String cellphone;
    private String status;
    private String group;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNo_apto() {
        return no_apto;
    }

    public void setNo_apto(String no_apto) {
        this.no_apto = no_apto;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}
