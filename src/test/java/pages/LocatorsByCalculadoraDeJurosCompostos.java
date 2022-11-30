package pages;

import org.openqa.selenium.By;

public enum LocatorsByCalculadoraDeJurosCompostos {
    VALOR_INICIAL(By.id("input-jc-valor-inicial")),
    VALOR_MENSAL(By.id("input-jc-valor-mensal")),
    TAXA_JUROS(By.id("input-jc-taxa-juros")),
    PERIODO(By.id("input-jc-periodo")),
    BOTAO_CALCULAR(By.cssSelector("#wpcf7-f32919-p32917-o1 > form > div.px-3.py-4.rounded.border.bg-light.form-wrapper.layout-default > div.mt-3.d-flex.align-items-center.justify-content-between > div > input")),
    TOTAL_FINAL(By.cssSelector("#calculation-result > div > div.row > div:nth-child(1) > div > div")),
    TOTAL_INVESTIDO(By.cssSelector("#calculation-result > div > div.row > div:nth-child(2) > div > div")),
    TOTAL_JUROS(By.cssSelector("#calculation-result > div > div.row > div:nth-child(3) > div > div"));
    private By by;
    LocatorsByCalculadoraDeJurosCompostos(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
