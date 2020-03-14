package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessosSteps extends BaseSteps {

    private Home home = new Home(driver);
    private MenuImpacta menu = new MenuImpacta(driver);
    private GridProcessos gridProcessos = new GridProcessos(driver);
    private ProcessosInclusao processosInclusao = new ProcessosInclusao(driver);
    private ProcessosMostrar processosMostrar = new ProcessosMostrar(driver);
    private ProcessosAlterar processosAlterar = new ProcessosAlterar(driver);
    private ProcessosDeletar processosDeletar = new ProcessosDeletar(driver);

    @Dado("^que o paciente está na página Agapito Software Testing$")
    public void queOPacienteEstaNaPaginaAgapitoSoftwareTesting() {
        home.abrirPagina();
    }

    @E("^o paciente clicar no menu \"([^\"]*)\"$")
    public void oPacienteClicarNoMenu(String vMenu) throws Throwable {
        menu.clicarMenu(vMenu);
    }

    @E("^o paciente clicar no botão novo processo$")
    public void oPacienteClicarNoBotaoNovoProcesso() {
        gridProcessos.clickNovoProcesso();
    }

    @E("^o paciente digitar no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oPacienteDigitarNoCampoOValor(String campo, String valor) throws Throwable {
        processosInclusao.preencherCampo(campo, valor);
    }

    @Quando("^o paciente clicar no botão \"(.*)\" na página de inclusão de processos$")
    public void oPacienteClicarNoBotaoSalvar(String botao) {
        processosInclusao.clicarSalvar(botao);
    }

    @Então("^o paciente deveria visualizar a mensagem \"([^\"]*)\"$")
    public void oPacienteDeveriaVisualizarAMensagem(String message) throws Throwable {
        Assert.assertEquals(message, processosMostrar.recuperarMensagemDeSucesso());

    }

    @E("^o paciente seleciona no campo urgencia o valor \"([^\"]*)\"$")
    public void oPacienteSelecionaNoCampoOValor(String valor) throws Throwable {
        processosInclusao.selecionarUrgencia(valor);
    }


    @E("^o paciente clica no campo arbitramento com o valor Sim$")
    public void oPacienteClicaNoCampoArbitramentoComOValorSim() {
        processosInclusao.clicarArbitramentoSim();
    }

    @Quando("^o paciente clicar em voltar$")
    public void oPacienteClicarEmVoltar() {
        processosMostrar.clicarVoltar();
    }

    @Então("^o paciente deveria ver o texto \"([^\"]*)\"$")
    public void oPacienteDeveriaVerOTexto(String message) throws Throwable {
        Assert.assertTrue(gridProcessos.existeTexto(message));
    }

    @Então("^no campo vara deve mostrar o conteúdo \"([^\"]*)\"$")
    public void noCampoVaraDeveMostrarOConteudo(String message) throws Throwable {
        Assert.assertEquals(message, processosMostrar.mostrarConteudoVara());
    }


    @E("^no campo numero processo deve mostrar o conteúdo \"([^\"]*)\"$")
    public void noCampoNumeroProcessoDeveMostrarOConteudo(String message) throws Throwable {
        Assert.assertEquals(message, processosMostrar.mostrarConteudoNProcesso());
    }

    @Então("^eu devo alterar o campo \"([^\"]*)\" para o valor \"([^\"]*)\"$")
    public void euDevoAlterarOCampoParaOValor(String campo, String valorCont) throws Throwable {
        processosAlterar.alterarCampo(campo, valorCont);

    }

    @E("^eu devo alterar o campo urgente para o valor \"([^\"]*)\"$")
    public void euDevoAlterarOCampoUrgenteParaOValor(String valor) throws Throwable {
        processosAlterar.alterarUrgencia(valor);
    }


     @Quando("^o paciente clicar no botão \"([^\"]*)\"$")
    public void oPacienteClicarNoBotao(String botao) throws Throwable {
        processosDeletar.clicarOk(botao);
    }


}


