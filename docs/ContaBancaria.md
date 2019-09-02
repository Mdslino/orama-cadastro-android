

# ContaBancaria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**banco** | **String** | Banco da conta, string com o número do banco | 
**tipo** | [**TipoEnum**](#TipoEnum) | Tipo da conta bancária. O tipo deve ser conta corrente (CC) ou conta poupança (CP). | 
**agencia** | **String** | Agência da conta bancária | 
**conta** | **String** | Número da conta bancária sem o dígito verificador | 
**digito** | **String** | Digito verificador da conta bancária | 
**contaConjunta** | **Boolean** | Informação que define se é uma conta conjunta. Caso seja, deve ser definido como true. |  [optional]
**segundoParticipanteTitular** | **Boolean** | Informação se o segundo participante (co-titular) é o titular da conta, caso não seja, o primeiro participante quem esta preenchendo a conta é o titular. |  [optional]
**cpfCotitular** | **String** | CPF do co-titular caso seja conta conjunta. CPF deve ser válido. O CPF tem que ter os 11 dígitos com a máscara incluindo os pontos e hífen. |  [optional]


## Enum: TipoEnum

Name | Value
---- | -----




