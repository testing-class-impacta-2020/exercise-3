package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.Acesso;
import pages.PaginaErro;
import pages.PaginaSucesso;
import support.BaseSteps;

public class LoginPortuguesSteps extends BaseSteps {

    private Acesso acesso = new Acesso(driver);
    private PaginaSucesso paginaSucesso = new PaginaSucesso(driver);
    private PaginaErro paginaErro = new PaginaErro(driver);

    @Dado("^que o paciente está na página de login$")
    public void queOPacienteEstaNaPaginaDeLogin() {
        acesso.abrirPagina();
    }

    @E("^o paciente preenche no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oPacientePreencheNoCampoOValor(String nomeCampo, String valorCampo) throws Throwable {
        acesso.preencherCampo(nomeCampo, valorCampo);
    }

    @Quando("^o paciente clicar no botão login$")
    public void oPacienteClicarNoBotaoLogin() {
        acesso.clicarBotaoLogin();
    }

    @Então("^paciente deveria ver a mensagem de \"([^\"]*)\"$")
    public void pacienteDeveriaVerAMensagemDe(String mensagem) throws Throwable {
        Assert.assertEquals(mensagem, paginaSucesso.buscarMensagem());
    }

    @Então("^paciente deveria ver a mensagem invalida igual a \"([^\"]*)\"$")
    public void pacienteDeveriaVerAMensagemInvalidaIgualA(String mensagem) throws Throwable {
        Assert.assertEquals(mensagem, paginaErro.buscarMensagem());
    }
}
