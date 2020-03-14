package pages;

import support.DriverQA;

public class ProcessosAlterar {

    private DriverQA driver;

    public ProcessosAlterar(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void alterarCampo(String campo, String valorCont) {
        driver.sendKeys(valorCont, campo);}
    public void alterarUrgencia(String valor) {
        driver.selectByText(valor, "processo_urgente");
    }
}
