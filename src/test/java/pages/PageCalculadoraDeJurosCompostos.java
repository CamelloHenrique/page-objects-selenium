package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.SeleniumUtils;

public class PageCalculadoraDeJurosCompostos {
    private WebDriver driver;
    private LocatorsByCalculadoraDeJurosCompostos locatorsBy;

    private By valorInicial = locatorsBy.VALOR_INICIAL.getBy();
    private By valorMensal = locatorsBy.VALOR_MENSAL.getBy();
    private By taxaJuros = locatorsBy.TAXA_JUROS.getBy();
    private By periodo = locatorsBy.PERIODO.getBy();
    private By botaoCalcular = locatorsBy.BOTAO_CALCULAR.getBy();
    private By totalFinal = locatorsBy.TOTAL_FINAL.getBy();
    private By totalInvestido = locatorsBy.TOTAL_INVESTIDO.getBy();
    private By totalJuros = locatorsBy.TOTAL_JUROS.getBy();
    public PageCalculadoraDeJurosCompostos(WebDriver driver) {
        this.driver = driver;
        System.out.println(">>>>>>>>>>>>>>>>>>"+driver.getTitle());
    }

    public void inserirValorIncial(String valorInicialEsperado){
        driver.findElement(valorInicial).sendKeys(valorInicialEsperado);
    }

    public void inserirValorMensal(String valorMensalEsperado){
        driver.findElement(valorMensal).sendKeys(valorMensalEsperado);
    }

    public void inserirTaxaJuros(String taxaJurosEsperada){
        SeleniumUtils.limparCampo(driver.findElement(taxaJuros));
        driver.findElement(taxaJuros).sendKeys(taxaJurosEsperada);
    }

    public void inserirPeriodo(String periodoEsperado){
        SeleniumUtils.limparCampo(driver.findElement(periodo));
        driver.findElement(periodo).sendKeys(periodoEsperado);
    }

    public void clicarBotaoCalcular(){
        driver.findElement(botaoCalcular).click();
    }

    public String getTotalFinal(){
        SeleniumUtils.esperarAteCampoVisivel(driver,totalInvestido);
        return driver.findElement(totalFinal).getAttribute("title");
    }
    public String getTotalInvestido(){
        return driver.findElement(totalInvestido).getAttribute("title");
    }
    public String getTotalJuros(){
        return driver.findElement(totalJuros).getAttribute("title");
    }
}
