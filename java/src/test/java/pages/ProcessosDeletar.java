package pages;

import support.DriverQA;

public class ProcessosDeletar {

    private DriverQA driver;

    public ProcessosDeletar(DriverQA stepDriver){
        driver = stepDriver;
    }
    public void clicarOk(String botao) {
        driver.ChooseOkOnNextConfirmation();
            }

    public void clicarDeletar(String deletar) {
        driver.click("btn-delete_493");
    }
}
