

# DadosPatrimonial

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**faixaAplicacoes** | [**FaixaAplicacoesEnum**](#FaixaAplicacoesEnum) | Código do valor total em aplicações financeiras considerando outras instituições. Cada número representa um intervalo de valor em reais (R$). Por exemplo, &#39;0&#39;: &#39;Nenhum&#39;, &#39;1&#39;: &#39;Até R$50.000,00&#39;, &#39;2&#39;: &#39;De R$50.000,01 à R$100.000,00&#39;, &#39;3&#39;: &#39;De R$100.000,01 à R$200.000,00&#39;, &#39;4&#39;: &#39;De R$200.000,01 à R$300.000,00&#39;, &#39;5&#39;: &#39;De R$300.000,01 à R$1.000.000,00&#39;, &#39;6&#39;: &#39;Acima de R$1.000.000,00&#39; |  [optional]
**valorAplicacoes** | [**BigDecimal**](BigDecimal.md) | Valor total em R$ em aplicações financeiras, considerando outras instituições. Este campo só deve ser preenchido caso &#39;faixaAplicacoes&#39; seja acima de R$ 1.000.000,00 |  [optional]
**faixaRendimentos** | [**FaixaRendimentosEnum**](#FaixaRendimentosEnum) | Código do valor que representa a renta bruta mensal. Cada número representa um intervalo de valor em reais (R$). Por exemplo, &#39;0&#39;: &#39;Nenhum&#39;, &#39;1&#39;: &#39;Até R$5.000,00&#39;, &#39;2&#39;: &#39;De R$5.000,01 à R$10.000,00&#39;, &#39;3&#39;: &#39;De R$10.000,01 à R$20.000,00&#39;, &#39;4&#39;: &#39;De R$20.000,01 à R$30.000,00&#39;, &#39;5&#39;: &#39;De R$30.000,01 à R$100.000,00&#39;, &#39;6&#39;: &#39;Acima de R$100.000,00&#39; |  [optional]
**valorOutrosBens** | [**BigDecimal**](BigDecimal.md) | Valor total em R$ incluindo móveis, imóveis e outros bens do usuário |  [optional]


## Enum: FaixaAplicacoesEnum

Name | Value
---- | -----


## Enum: FaixaRendimentosEnum

Name | Value
---- | -----




