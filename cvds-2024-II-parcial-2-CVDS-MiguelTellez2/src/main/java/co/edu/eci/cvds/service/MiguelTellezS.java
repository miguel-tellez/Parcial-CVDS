package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.MiguelTellezM;
import co.edu.eci.cvds.repository.MiguelTellezR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiguelTellezS {
    private final MiguelTellezR migueltellezR;

    @Autowired
    public MiguelTellezS(MiguelTellezR migueltellezR) {
        this.migueltellezR = migueltellezR;
    }

    public MiguelTellezM addMiguelTellezm(MiguelTellezM MiguelTellezM) {
        return migueltellezR.save(MiguelTellezM);
    }

    public MiguelTellezM getMiguelTellezm(String numero) {
        return migueltellezR.findByNumero(numero).get(1);
    }

    public List<MiguelTellezM> getAllMiguelTellezm() {
        return migueltellezR.findAll();
    }

    public MiguelTellezM updateMiguelTellezM(MiguelTellezM miguelTellezm) {
        if (migueltellezR.findByNumero(miguelTellezm.getNumero()).size() == 0) {
            return migueltellezR.save(miguelTellezm);
        }

        return null;
    }

    public void deleteMiguelTellezM(String Numero) {
        migueltellezR.deleteById(Numero);
    }

}