package co.com.sibm.api.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author usuario
 */
@Entity
@Table(name = "client", catalog = "corocito")
public class Client {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Column(name="id")
    private Integer id;

    @Column(name="idnumber")
    private String idnumber;

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastname;

    @Column(name="noapto")
    private String noapto;

    @Column(name="cellphone")
    private String cellphone;

    @Column(name="status")
    private String status;

    @Column(name="idgroup")
    private Integer idgroup;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNoapto() {
        return noapto;
    }

    public void setNoapto(String noapto) {
        this.noapto = noapto;
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

    public Integer getIdgroup() {
        return idgroup;
    }

    public void setIdgroup(Integer idgroup) {
        this.idgroup = idgroup;
    }
}
