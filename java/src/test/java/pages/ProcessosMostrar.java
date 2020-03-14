package pages;

import support.DriverQA;

public class ProcessosMostrar {

    private final DriverQA driver;

    public ProcessosMostrar(DriverQA driverQA) {
        driver = driverQA;
    }

    public String recuperarMensagemDeSucesso() {
        return driver.getText("notice");
    }

    public void clicarVoltar() {
        driver.click(".ls-btn-primary-danger","css");
    }

    public String mostrarConteudoVara() {
        return driver.getText("//div[contains(@class, 'container-fluid')]/p[1]","xpath");
    }

    public String mostrarConteudoNProcesso() {
        return driver.getText("//div[contains(@class, 'container-fluid')]/p[2]","xpath");
    }
}
