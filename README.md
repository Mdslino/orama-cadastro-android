# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.DevelopersApi;

public class DevelopersApiExample {

    public static void main(String[] args) {
        DevelopersApi apiInstance = new DevelopersApi();
        LoginSenhaObjeto loginSenhaObjeto = new LoginSenhaObjeto(); // LoginSenhaObjeto | Dados para criação do login
        try {
            LoginCriado result = apiInstance.accountIdentificacaoParceiroPost(loginSenhaObjeto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DevelopersApi#accountIdentificacaoParceiroPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cadastro.orama.com.br/api/contas/v2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DevelopersApi* | [**accountIdentificacaoParceiroPost**](docs/DevelopersApi.md#accountIdentificacaoParceiroPost) | **POST** /identificacao-parceiro/ | Cria um login para usuário.
*UsersApi* | [**accountAutenticacaoPost**](docs/UsersApi.md#accountAutenticacaoPost) | **POST** /autenticacao/ | Autentica um usuário que ainda não é cliente.
*UsersApi* | [**accountDocumentoConfirmacaoGet**](docs/UsersApi.md#accountDocumentoConfirmacaoGet) | **GET** /perfil/{cpf}/documento/confirmacao/ | Consulta o status de confirmação do documento que foi submetido
*UsersApi* | [**accountDocumentoPut**](docs/UsersApi.md#accountDocumentoPut) | **PUT** /perfil/{cpf}/documento/ | Anexa ou atualiza documento para conferencia de autenticidade do perfil.
*UsersApi* | [**accountIdentificacaoPost**](docs/UsersApi.md#accountIdentificacaoPost) | **POST** /identificacao/ | Cria um login para usuário.
*UsersApi* | [**accountPerfilAprovacaoGet**](docs/UsersApi.md#accountPerfilAprovacaoGet) | **GET** /perfil/{cpf}/aprovacao/ | Retorna o estado de aprovação de um perfil
*UsersApi* | [**accountPerfilAssinaturaEletronicaGet**](docs/UsersApi.md#accountPerfilAssinaturaEletronicaGet) | **GET** /perfil/{cpf}/assinatura-eletronica/ | Verifica se a assinatura eletronica já foi definida.
*UsersApi* | [**accountPerfilAssinaturaEletronicaPost**](docs/UsersApi.md#accountPerfilAssinaturaEletronicaPost) | **POST** /perfil/{cpf}/assinatura-eletronica/ | Realiza o cadastro da assinatura eletrônica do perfil.
*UsersApi* | [**accountPerfilCelularAutenticacaoConfirmacaoGet**](docs/UsersApi.md#accountPerfilCelularAutenticacaoConfirmacaoGet) | **GET** /perfil/{cpf}/celular/autenticacao/confirmacao/ | Estado atual de confirmação do celular
*UsersApi* | [**accountPerfilCelularAutenticacaoPost**](docs/UsersApi.md#accountPerfilCelularAutenticacaoPost) | **POST** /perfil/{cpf}/celular/autenticacao/ | Gera um código para iniciar o processo de validação do número do celular
*UsersApi* | [**accountPerfilCelularConfirmacaoPost**](docs/UsersApi.md#accountPerfilCelularConfirmacaoPost) | **POST** /perfil/{cpf}/celular/autenticacao/confirmacao/ | Confirma o numero de celular, concluindo a validação
*UsersApi* | [**accountPerfilEmailAutenticacaoConfirmacaoGet**](docs/UsersApi.md#accountPerfilEmailAutenticacaoConfirmacaoGet) | **GET** /perfil/{cpf}/email/autenticacao/confirmacao/ | Estado atual de confirmação do email
*UsersApi* | [**accountPerfilEmailAutenticacaoPost**](docs/UsersApi.md#accountPerfilEmailAutenticacaoPost) | **POST** /perfil/{cpf}/email/autenticacao/ | Gera um código para iniciar o processo de validação do email
*UsersApi* | [**accountPerfilEmailConfirmacaoPost**](docs/UsersApi.md#accountPerfilEmailConfirmacaoPost) | **POST** /perfil/{cpf}/email/autenticacao/confirmacao/ | Confirma o email, concluindo a validação
*UsersApi* | [**accountPerfilGet**](docs/UsersApi.md#accountPerfilGet) | **GET** /perfil/{cpf}/ | Retorna o perfil de um usuário que ainda não foi transformado em cliente.
*UsersApi* | [**accountPerfilPendenciaGet**](docs/UsersApi.md#accountPerfilPendenciaGet) | **GET** /perfil/{cpf}/pendencia/ | Retorna lista de pendências do perfil caso existam
*UsersApi* | [**accountPerfilPendenciaSolicitaranalisePost**](docs/UsersApi.md#accountPerfilPendenciaSolicitaranalisePost) | **POST** /perfil/{cpf}/pendencia/solicitar-analise/ | Solicita a análise das pendências. Este endpoint deve ser utilizado após o upload dos documentos relacionados as pendências.
*UsersApi* | [**accountPerfilPost**](docs/UsersApi.md#accountPerfilPost) | **POST** /perfil/{cpf}/ | Submete o perfil de usuário associado a um login para ser criado como cliente.
*UsersApi* | [**accountPerfilPut**](docs/UsersApi.md#accountPerfilPut) | **PUT** /perfil/{cpf}/ | Atualiza perfil para criação de conta.
*UsersApi* | [**accountPerfilSubmetidoGet**](docs/UsersApi.md#accountPerfilSubmetidoGet) | **GET** /perfil/{cpf}/submetido/ | Retorna o estado de submissão de um perfil
*UsersApi* | [**accountPerfilTermosConfirmacaoGet**](docs/UsersApi.md#accountPerfilTermosConfirmacaoGet) | **GET** /perfil/{cpf}/termos/confirmacao/ | Estado atual de confirmação do aceite de termos
*UsersApi* | [**accountPerfilTermosConfirmacaoPost**](docs/UsersApi.md#accountPerfilTermosConfirmacaoPost) | **POST** /perfil/{cpf}/termos/confirmacao/ | Confirma o aceite de termos
*UsersApi* | [**accountPerfilTermosGet**](docs/UsersApi.md#accountPerfilTermosGet) | **GET** /perfil/{cpf}/termos/ | Consulta os termos requeridos para o perfil


## Documentation for Models

 - [Aprovacao](docs/Aprovacao.md)
 - [AssinaturaEletronica](docs/AssinaturaEletronica.md)
 - [AutenticacaoCodigoObjeto](docs/AutenticacaoCodigoObjeto.md)
 - [AutenticacaoObjeto](docs/AutenticacaoObjeto.md)
 - [Confirmado](docs/Confirmado.md)
 - [ContaBancaria](docs/ContaBancaria.md)
 - [DadosPatrimonial](docs/DadosPatrimonial.md)
 - [DadosProfissionais](docs/DadosProfissionais.md)
 - [Documento](docs/Documento.md)
 - [DocumentoCorpo](docs/DocumentoCorpo.md)
 - [Endereco](docs/Endereco.md)
 - [Erro](docs/Erro.md)
 - [FrontEndStep](docs/FrontEndStep.md)
 - [ListaPerfilUsuario](docs/ListaPerfilUsuario.md)
 - [LoginCriado](docs/LoginCriado.md)
 - [LoginObjeto](docs/LoginObjeto.md)
 - [LoginSenhaObjeto](docs/LoginSenhaObjeto.md)
 - [Pendencia](docs/Pendencia.md)
 - [PerfilUsuario](docs/PerfilUsuario.md)
 - [Submetido](docs/Submetido.md)
 - [Termos](docs/Termos.md)
 - [UsuarioSenhaObjeto](docs/UsuarioSenhaObjeto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Api-Key

- **Type**: API key

- **API key parameter name**: X-Api-Key
- **Location**: HTTP header

### JWT

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

cadastro_api@orama.com.br

