/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apdol.entity;

import apdol.model.DaftarUser;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.OneToOne;


/**
 *
 * @author Accio
 */
@Entity
        @Table(name = "user")
        @XmlRootElement
        @NamedQueries({
            @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
            @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
            @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
            @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
            @NamedQuery(name = "User.findByNama", query = "SELECT u FROM User u WHERE u.nama = :nama"),
            @NamedQuery(name = "User.findByJabatan", query = "SELECT u FROM User u WHERE u.jabatan = :jabatan"),
            @NamedQuery(name = "User.findByRoleuser", query = "SELECT u FROM User u WHERE u.roleuser = :roleuser")})

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "nama")
    private String nama;
    @Column(name = "jabatan")
    private String jabatan;
    @Column(name = "roleuser")
    private String roleuser;
    @OneToOne
    private SatuanKerja satker;

    public SatuanKerja getSatker() {
        return satker;
    }

    public void setSatker(SatuanKerja satker) {
        this.satker = satker;
    }
    

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getRoleuser() {
        return roleuser;
    }

    public void setRoleuser(String roleuser) {
        this.roleuser = roleuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "apdol.entity.User[ id=" + id + " ]";
    }

    public boolean valUsername() {
        DaftarUser daftarUser = new DaftarUser();
        List<User> listUser = daftarUser.getUser();
        Iterator<User> iterator = listUser.iterator();
        User tes = new User();

        while (iterator.hasNext()) {
            tes = iterator.next();
            if (tes.username.equalsIgnoreCase(this.username)) {
                return true;
            }
        }
        return false;
    }

    /*
    public boolean valKodeSatker() {
        DaftarUser daftarUser = new DaftarUser();
        List<User> listUser = daftarUser.getUser();
        Iterator<User> iterator = listUser.iterator();
        User tes = new User();

        while (iterator.hasNext()) {
            tes = iterator.next();
            if (tes.satker.equalsIgnoreCase(this.satker)) {
                return true;
            }
        }
        return false;
    }*/


    public boolean isUsernameNoChange(String username) {
        if (username.equalsIgnoreCase(this.username)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPasswordNoChange(String password) {
       if (password.equalsIgnoreCase(this.password)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isNamaNoChange(String nama) {
       if (nama.equalsIgnoreCase(this.nama)) {
            return true;
        } else {
            return false;
        }
    }
    /*public boolean isKodeSatkerNoChange(String kodesatker) {
       if (kodesatker.equalsIgnoreCase(this.kodesatker)) {
            return true;
        } else {
            return false;
        }
    }*/
    public boolean isJabatanNoChange(String jabatan) {
       if (jabatan.equalsIgnoreCase(this.jabatan)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isRoleUserNoChange(String roleuser) {
       if (roleuser.equalsIgnoreCase(this.roleuser)) {
            return true;
        } else {
            return false;
        }
    }

 }

