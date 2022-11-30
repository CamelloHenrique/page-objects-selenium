package Features;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CalculadoraDeJurosCompostos;
import resources.SeleniumUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCalculadoraDeJurosCompostos {
    private WebDriver driver = null;
    private CalculadoraDeJurosCompostos pageCalculadoraDeJurosCompostos = null;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        pageCalculadoraDeJurosCompostos = new CalculadoraDeJurosCompostos(driver);
    }

    @After
    public void tearDown() {
//        driver.quit();
    }

    @Given("Eu abri o site {string}")
    public void eu_abri_o_site(String site) {
        driver.get(site);

    }

    @When("Eu inserir o valor inicial de {string}")
    public void eu_inserir_o_valor_inicial_de(String valorInicial) {
        pageCalculadoraDeJurosCompostos.inserirValorIncial(valorInicial);
    }

    @When("O valor mensal de {string}")
    public void o_valor_mensal_de(String valorMensal) {
        pageCalculadoraDeJurosCompostos.inserirValorMensal(valorMensal);
    }

    @When("A taxa de juros de {string}")
    public void a_taxa_de_juros_de(String taxaJuros) {
        pageCalculadoraDeJurosCompostos.inserirTaxaJuros(taxaJuros);
    }

    @When("O periodo de {string} anos")
    public void o_periodo_de_anos(String periodo) {
        pageCalculadoraDeJurosCompostos.inserirPeriodo(periodo);
    }

    @When("Clicar no botão calcular")
    public void clicar_no_botão_calcular() {
        pageCalculadoraDeJurosCompostos.clicarBotaoCalcular();
    }

    @Then("O valor total final deve ser {string}")
    public void o_valor_total_final_deve_ser(String totalFinal){
        String actual = pageCalculadoraDeJurosCompostos.getTotalFinal();
        assertThat(actual).isEqualTo(totalFinal);
    }

    @Then("O valor total investido deve ser de {string}")
    public void o_valor_total_investido_deve_ser_de(String totalInvestido){
        String actual = pageCalculadoraDeJurosCompostos.getTotalInvestido();
        assertThat(actual).isEqualTo(totalInvestido);
    }

    @Then("O total em juros deve ser de {string}")
    public void o_total_em_juros_deve_ser_de(String totalJuros){
        String actual = pageCalculadoraDeJurosCompostos.getTotalJuros();
        assertThat(actual).isEqualTo(totalJuros);
    }
}
