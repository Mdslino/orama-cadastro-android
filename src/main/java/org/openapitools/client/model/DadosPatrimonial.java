/**
 * Criação de Contas
 * API de Criação de Contas.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: cadastro_api@orama.com.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Informação sobre o Patrimônio do usuário
 **/
@ApiModel(description = "Informação sobre o Patrimônio do usuário")
public class DadosPatrimonial {
  
  public enum FaixaAplicacoesEnum {
     0,  1,  2,  3,  4,  5,  6, 
  };
  @SerializedName("faixaAplicacoes")
  private FaixaAplicacoesEnum faixaAplicacoes = null;
  @SerializedName("valorAplicacoes")
  private BigDecimal valorAplicacoes = null;
  public enum FaixaRendimentosEnum {
     0,  1,  2,  3,  4,  5,  6, 
  };
  @SerializedName("faixaRendimentos")
  private FaixaRendimentosEnum faixaRendimentos = null;
  @SerializedName("valorOutrosBens")
  private BigDecimal valorOutrosBens = null;

  /**
   * Código do valor total em aplicações financeiras considerando outras instituições. Cada número representa um intervalo de valor em reais (R$). Por exemplo, '0': 'Nenhum', '1': 'Até R$50.000,00', '2': 'De R$50.000,01 à R$100.000,00', '3': 'De R$100.000,01 à R$200.000,00', '4': 'De R$200.000,01 à R$300.000,00', '5': 'De R$300.000,01 à R$1.000.000,00', '6': 'Acima de R$1.000.000,00'
   **/
  @ApiModelProperty(required = true, value = "Código do valor total em aplicações financeiras considerando outras instituições. Cada número representa um intervalo de valor em reais (R$). Por exemplo, '0': 'Nenhum', '1': 'Até R$50.000,00', '2': 'De R$50.000,01 à R$100.000,00', '3': 'De R$100.000,01 à R$200.000,00', '4': 'De R$200.000,01 à R$300.000,00', '5': 'De R$300.000,01 à R$1.000.000,00', '6': 'Acima de R$1.000.000,00'")
  public FaixaAplicacoesEnum getFaixaAplicacoes() {
    return faixaAplicacoes;
  }
  public void setFaixaAplicacoes(FaixaAplicacoesEnum faixaAplicacoes) {
    this.faixaAplicacoes = faixaAplicacoes;
  }

  /**
   * Valor total em R$ em aplicações financeiras, considerando outras instituições. Este campo só deve ser preenchido caso 'faixaAplicacoes' seja acima de R$ 1.000.000,00
   * minimum: 1000000
   * maximum: 999999999999.99
   **/
  @ApiModelProperty(value = "Valor total em R$ em aplicações financeiras, considerando outras instituições. Este campo só deve ser preenchido caso 'faixaAplicacoes' seja acima de R$ 1.000.000,00")
  public BigDecimal getValorAplicacoes() {
    return valorAplicacoes;
  }
  public void setValorAplicacoes(BigDecimal valorAplicacoes) {
    this.valorAplicacoes = valorAplicacoes;
  }

  /**
   * Código do valor que representa a renta bruta mensal. Cada número representa um intervalo de valor em reais (R$). Por exemplo, '0': 'Nenhum', '1': 'Até R$5.000,00', '2': 'De R$5.000,01 à R$10.000,00', '3': 'De R$10.000,01 à R$20.000,00', '4': 'De R$20.000,01 à R$30.000,00', '5': 'De R$30.000,01 à R$100.000,00', '6': 'Acima de R$100.000,00'
   **/
  @ApiModelProperty(required = true, value = "Código do valor que representa a renta bruta mensal. Cada número representa um intervalo de valor em reais (R$). Por exemplo, '0': 'Nenhum', '1': 'Até R$5.000,00', '2': 'De R$5.000,01 à R$10.000,00', '3': 'De R$10.000,01 à R$20.000,00', '4': 'De R$20.000,01 à R$30.000,00', '5': 'De R$30.000,01 à R$100.000,00', '6': 'Acima de R$100.000,00'")
  public FaixaRendimentosEnum getFaixaRendimentos() {
    return faixaRendimentos;
  }
  public void setFaixaRendimentos(FaixaRendimentosEnum faixaRendimentos) {
    this.faixaRendimentos = faixaRendimentos;
  }

  /**
   * Valor total em R$ incluindo móveis, imóveis e outros bens do usuário  - Obrigatório caso 'faixaAplicacoes' e 'faixaRendimentos' seja '0 - Nenhum'
   * minimum: 1000.0
   * maximum: 999999999999.99
   **/
  @ApiModelProperty(value = "Valor total em R$ incluindo móveis, imóveis e outros bens do usuário  - Obrigatório caso 'faixaAplicacoes' e 'faixaRendimentos' seja '0 - Nenhum'")
  public BigDecimal getValorOutrosBens() {
    return valorOutrosBens;
  }
  public void setValorOutrosBens(BigDecimal valorOutrosBens) {
    this.valorOutrosBens = valorOutrosBens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosPatrimonial dadosPatrimonial = (DadosPatrimonial) o;
    return (this.faixaAplicacoes == null ? dadosPatrimonial.faixaAplicacoes == null : this.faixaAplicacoes.equals(dadosPatrimonial.faixaAplicacoes)) &&
        (this.valorAplicacoes == null ? dadosPatrimonial.valorAplicacoes == null : this.valorAplicacoes.equals(dadosPatrimonial.valorAplicacoes)) &&
        (this.faixaRendimentos == null ? dadosPatrimonial.faixaRendimentos == null : this.faixaRendimentos.equals(dadosPatrimonial.faixaRendimentos)) &&
        (this.valorOutrosBens == null ? dadosPatrimonial.valorOutrosBens == null : this.valorOutrosBens.equals(dadosPatrimonial.valorOutrosBens));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.faixaAplicacoes == null ? 0: this.faixaAplicacoes.hashCode());
    result = 31 * result + (this.valorAplicacoes == null ? 0: this.valorAplicacoes.hashCode());
    result = 31 * result + (this.faixaRendimentos == null ? 0: this.faixaRendimentos.hashCode());
    result = 31 * result + (this.valorOutrosBens == null ? 0: this.valorOutrosBens.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPatrimonial {\n");
    
    sb.append("  faixaAplicacoes: ").append(faixaAplicacoes).append("\n");
    sb.append("  valorAplicacoes: ").append(valorAplicacoes).append("\n");
    sb.append("  faixaRendimentos: ").append(faixaRendimentos).append("\n");
    sb.append("  valorOutrosBens: ").append(valorOutrosBens).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
