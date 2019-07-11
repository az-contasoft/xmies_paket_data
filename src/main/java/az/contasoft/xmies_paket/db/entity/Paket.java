package az.contasoft.xmies_paket.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Paket  implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idPaket;
    private String paketAdi;
    private String paketKodu;
    private BigDecimal paketQiymeti;
    private long idPersonal;
    private int isDelete;


    public Paket(long idPaket, String paketAdi, String paketKodu, BigDecimal paketQiymeti, long idPersonal, int isDelete) {
        this.idPaket = idPaket;
        this.paketAdi = paketAdi;
        this.paketKodu = paketKodu;
        this.paketQiymeti = paketQiymeti;
        this.idPersonal = idPersonal;
        this.isDelete = isDelete;
    }

    public Paket() {
    }

    @Override
    public String toString() {
        return "Paket{" +
                "idPaket=" + idPaket +
                ", paketAdi='" + paketAdi + '\'' +
                ", paketKodu='" + paketKodu + '\'' +
                ", paketQiymeti=" + paketQiymeti +
                ", idPersonal=" + idPersonal +
                ", isDelete=" + isDelete +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getIdPaket() {
        return idPaket;
    }

    public void setIdPaket(long idPaket) {
        this.idPaket = idPaket;
    }

    public String getPaketAdi() {
        return paketAdi;
    }

    public void setPaketAdi(String paketAdi) {
        this.paketAdi = paketAdi;
    }

    public String getPaketKodu() {
        return paketKodu;
    }

    public void setPaketKodu(String paketKodu) {
        this.paketKodu = paketKodu;
    }

    public BigDecimal getPaketQiymeti() {
        return paketQiymeti;
    }

    public void setPaketQiymeti(BigDecimal paketQiymeti) {
        this.paketQiymeti = paketQiymeti;
    }

    public long getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(long idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
