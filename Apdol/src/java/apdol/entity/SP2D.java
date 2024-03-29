/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apdol.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Accio
 */
@Entity
public class SP2D implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalSP2D;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalTolakSP2D;
    private String nomorTolakSP2D;
    private String keteranganTolakSP2D;
    @ManyToOne
    private BankPos bankpos;
    private String nomorSP2D;
    @OneToOne
    private SPM spm;
    private String statusSp2d;

    public BankPos getBankpos() {
        return bankpos;
    }

    public void setBankpos(BankPos bankpos) {
        this.bankpos = bankpos;
    }

    public String getKeteranganTolakSP2D() {
        return keteranganTolakSP2D;
    }

    public void setKeteranganTolakSP2D(String keteranganTolakSP2D) {
        this.keteranganTolakSP2D = keteranganTolakSP2D;
    }

    public String getNomorTolakSP2D() {
        return nomorTolakSP2D;
    }

    public void setNomorTolakSP2D(String nomorTolakSP2D) {
        this.nomorTolakSP2D = nomorTolakSP2D;
    }

    public SPM getSpm() {
        return spm;
    }

    public void setSpm(SPM spm) {
        this.spm = spm;
    }

    public Date getTanggalTolakSP2D() {
        return tanggalTolakSP2D;
    }

    public void setTanggalTolakSP2D(Date tanggalTolakSP2D) {
        this.tanggalTolakSP2D = tanggalTolakSP2D;
    }

    public String getNomorSP2D() {
        return nomorSP2D;
    }

    public void setNomorSP2D(String nomorSP2D) {
        this.nomorSP2D = nomorSP2D;
    }

    public Date getTanggalSP2D() {
        return tanggalSP2D;
    }

    public void setTanggalSP2D(Date tanggalSP2D) {
        this.tanggalSP2D = tanggalSP2D;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusSp2d() {
        return statusSp2d;
    }

    public void setStatusSp2d(String statusSp2d) {
        this.statusSp2d = statusSp2d;
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
        if (!(object instanceof SP2D)) {
            return false;
        }
        SP2D other = (SP2D) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "apdol.entity.SP2D[ id=" + id + " ]";
    }
    
}
