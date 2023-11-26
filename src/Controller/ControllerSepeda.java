package Controller;

import Model.ModelSepeda;
import View.ViewSepeda;

public class ControllerSepeda {
    ModelSepeda modelSepeda;
    ViewSepeda viewSepeda;

    public ControllerSepeda(ModelSepeda modelSepeda, ViewSepeda viewSepeda) {
        this.modelSepeda = modelSepeda;
        this.viewSepeda = viewSepeda;
    }

    public void viewAllSepeda(){
        viewSepeda.cetakAllSepeda(modelSepeda.viewSepeda());
    }

    public void insertSepeda(){
        viewSepeda.insertSepeda(modelSepeda);
    }

    public void viewSepeda(){
        viewSepeda.cetakSepeda(modelSepeda);
    }

    public void updateStoSepeda(){
        viewSepeda.updateStokSepeda(modelSepeda);
    }

}
