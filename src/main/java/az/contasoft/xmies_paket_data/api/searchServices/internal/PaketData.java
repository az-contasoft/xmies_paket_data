package az.contasoft.xmies_paket_data.api.searchServices.internal;

import az.contasoft.xmies_paket.db.entity.Paket;
import az.contasoft.xmies_personal.db.entities.Personal;

import java.io.Serializable;

public class PaketData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Paket paket;
    private Personal personal;

    public PaketData() {
    }

    public PaketData( Paket paket,Personal personal) {
        this.paket = paket;
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "PaketData{" +
                "paket=" + paket +
                ", personal=" + personal +
                '}';
    }

    public Paket getPaket() {
        return paket;
    }

    public void setPaket(Paket paket) {
        this.paket = paket;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

}
