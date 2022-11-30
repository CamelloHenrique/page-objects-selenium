Feature: CalculadoraDeJurosCompostos

  Scenario: calcular juros compostos

    Given Eu abri o site "https://investidorsardinha.r7.com/calculadoras/calculadora-de-juros-compostos/"
    When Eu inserir o valor inicial de "2000,00"
    And O valor mensal de "200,00"
    And A taxa de juros de "10"
    And O periodo de "20" anos
    And Clicar no botão calcular
    Then O valor total final deve ser "R$ 157.106,85"
    And O valor total investido deve ser de "R$ 50.000,00"
    And O total em juros deve ser de "R$ 107.106,85"
