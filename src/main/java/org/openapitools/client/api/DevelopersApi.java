/**
 * Criação de Contas
 * API de Criação de Contas.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: cadastro_api@orama.com.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.Erro;
import org.openapitools.client.model.LoginCriado;
import org.openapitools.client.model.LoginSenhaObjeto;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class DevelopersApi {
  String basePath = "https://cadastro.orama.com.br/api/contas/v1.0";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Cria um login para usuário.
  * Cria um novo login que será usado para acesso ao sistema.
   * @param loginSenhaObjeto Dados para criação do login
   * @return LoginCriado
  */
  public LoginCriado accountIdentificacaoParceiroPost (LoginSenhaObjeto loginSenhaObjeto) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = loginSenhaObjeto;
    // verify the required parameter 'loginSenhaObjeto' is set
    if (loginSenhaObjeto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginSenhaObjeto' when calling accountIdentificacaoParceiroPost",
        new ApiException(400, "Missing the required parameter 'loginSenhaObjeto' when calling accountIdentificacaoParceiroPost"));
    }

    // create path and map variables
    String path = "/identificacao-parceiro/";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Api-Key" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (LoginCriado) ApiInvoker.deserialize(localVarResponse, "", LoginCriado.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Cria um login para usuário.
   * Cria um novo login que será usado para acesso ao sistema.
   * @param loginSenhaObjeto Dados para criação do login
  */
  public void accountIdentificacaoParceiroPost (LoginSenhaObjeto loginSenhaObjeto, final Response.Listener<LoginCriado> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = loginSenhaObjeto;

    // verify the required parameter 'loginSenhaObjeto' is set
    if (loginSenhaObjeto == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginSenhaObjeto' when calling accountIdentificacaoParceiroPost",
        new ApiException(400, "Missing the required parameter 'loginSenhaObjeto' when calling accountIdentificacaoParceiroPost"));
    }

    // create path and map variables
    String path = "/identificacao-parceiro/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Api-Key" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((LoginCriado) ApiInvoker.deserialize(localVarResponse,  "", LoginCriado.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
