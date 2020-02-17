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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Aprovacao {
  
  public enum AprovadoEnum {
     APROVADO,  PENDENTE,  EM ANÁLISE,  INDEFINIDO,  CRIADO,  ERRO, 
  };
  @SerializedName("aprovado")
  private AprovadoEnum aprovado = INDEFINIDO;

  /**
   * Estado de aprovação do perfil.
   **/
  @ApiModelProperty(value = "Estado de aprovação do perfil.")
  public AprovadoEnum getAprovado() {
    return aprovado;
  }
  public void setAprovado(AprovadoEnum aprovado) {
    this.aprovado = aprovado;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aprovacao aprovacao = (Aprovacao) o;
    return (this.aprovado == null ? aprovacao.aprovado == null : this.aprovado.equals(aprovacao.aprovado));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aprovado == null ? 0: this.aprovado.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aprovacao {\n");
    
    sb.append("  aprovado: ").append(aprovado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
