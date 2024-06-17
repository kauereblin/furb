Normalmente usada para confidencialidade. Mas também usada para tratar integridade, autenticidade e não repúdio.


Não garante segurança do dados, tendo falhas.

#### Criptografica Clássica (1970) e Moderna

Necessário apenas caneta e papel.

Já a moderna é inviável sem computadores.

## Cifra de Substituição

Cada caractere do dado é mapeado num outro substituto.

Sem espaços, pontuação e acentos.

Frequentemente era escrito em blocos de comprimento fixo.

Amplamente usadas na 2a Guerra Mundial.

## Cifra de Transposição

Altera a disposição lógica dos caracteres.

- Geométrica: Rearranjam com uma figura geométrica (colunar ou linear)

- Grades / Grelhas: Escreve a mensagem em uma grade e lê em outra direção.

### Cifra de Transposição Colunar

O dado é escrito numa matriz, em linhas, e lido em colunas.

Tem parâmetros de quantidade de colunas a ser montado a matriz.

Espaços são preenchidos com caracteres X, _, " ".

### Cifra de Transposição Linear

Oposto da colunar na hora de inserir os dados na matriz por coluna, lido em linhas.

Com quantidade de linhas sendo parâmetro.

### Cifra de Cerca Ferroviária

Parâmetro de quantidade de trilhos.

Insere os dados do trilho superior ao inferior, ao chegar no inferior, sobe para o superior.

Lido do superior ao inferior.

H&nbsp;&nbsp;&nbsp;O&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L
&nbsp;E&nbsp;L&nbsp;W&nbsp;R&nbsp;D
&nbsp;&nbsp;&nbsp;L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O

HOLELWRDLO

Para decifrar, monta-se os trilhos com caracteres arbitrários e substitui pela cifra, lendo em colunas.

## Criptografia Simétrica

### Cifra de Vigenère (XVI)

Semelhante a cifra de cesar, porém contém uma chave que dita quantos caracteres serão deslocados.

Cada caractere da chave significa o deslocamento a partir da letra A.

#### Uso de chave:

Algoritmos sem chave estão sujeitos a ataques de força bruta.

Somente é preciso proteger a chave, somente compartilhada entre emissor e receptor.

- Uso simples: Usada para criptografar apenas uma mensagem. (E-mail)

- Uso múltiplo: Usada para criptografar várias mensagens. (Arquivos no HD)

##### Ataques
  - Tendo a chave correta;
  - Quebra do algoritmo:
    - Possui fraqueza, por estatística.
    - Ataque de força bruta.

#### Tamanho da Chave

Medido em bits, **cada bit adicional dobra o tempo para quebrar a chave**.

É altamente improvável que a tecnologia vá tão londe para usar uma chave tão grande.

O agente pode tentar reproduzir a função que gera um número aleatório.

#### Princípio de Kerckhoffs

Todos os algoritmos devem ser públicos; 
somente as chaves devem ser secretas.

# Criptoanálise

Ciência para violar sistemas de segurança criptográficos.

Tem importância para a segurança, pois permite identificar as fraquezas dos algoritmos.

A **quebra de um algoritmo** significa encontrar uma fraqueza que seja mais eficiente que usar força bruta.

#### Análise de Frequência

Cifras de substituição são quebrados facilmente pela taxa de uso de letras em textos de determinada linguagem.

Em cifras de transposição, a proporção de vogais e consoantes é a mesma.

Para Cerca Ferroviária precisa somente descobrir a quantidade de trilhos.

Para Cifra de Vigenère, a análise de frequência é ineficaz, podendo usar a existência de sequencia de letras que se repetem para descobrir a chave.

## Tipos de Cifragem

- Cifras de Fluxo
- Cifras de Bloco

#### Cifras de Fluxo

Convertem imediatamente um símbolo por outro. Feito byte a byte.

Mais rápido de cifrar

#### Cifras de Bloco

Dividido em tamanhos fixos, cifrando bloco por bloco. Tendo preenchimento nos blocos que o texto não tem o comprimento exato.

Para preencimento, o esquema mais conhecido é o **PKCS#5**. Preenchendo com bytes iguais ao tamanho faltante. **Aplicável somente para blocos de 8 bytes**

Gerado um bloco adicional caso não precise de preenchimento.

PKCS#7 pode ser usado para preencher blocos de 255 bytes

Mais lento para cifrar, tendo alta difusão, sujeito a propagação de erros (CBC).

#### Modos de Operação (sobre blocos)

- Livro de Códigos Eletrônicos (*ECB - Eletronic Code Book*):
  - Blocos cifrados independentes, caso o mesmo bloco apareça mais de uma vez, será encriptado da mesma forma.
- Cifra de Blocos de Código de Cifra (*CBC - Cipher Block Chaining*)
  - Usa a crifragem do bloco anterior para cifrar o próximo bloco.

Além, existem: Modo de Feedback Cifrado (CFB), Feedback de Saída (OFB), Propagando Encadeamento de Blocos Cifrados (PCBC).

# Características de um bom Algoritmo

- **Difusão**: pequenas alterações no texto simples causam grandes alterações no texto cifrado.

- **Confusão**: Relação entre o texto cifrado e a chave deve ser complexa.

### Algoritmos Simétricos

- **DES (Data Encryption Standard) 1970**: Cifragem de bloco com chave de 56 bits.

- **3DES / Triple DES**: Aplica o DES 3 vezes, com 3 chaves diferentes.

- **RC (Rivest Cipher)**
  - RC2: Blocos de 64 bits. Chave de tamanho variável de 8 a 1024 bits
  - RC4: Chave variável de 1 a 256 bits. Usado em WEP, WPA, SSL e TLS.
  - RC5: Blocos de 32, 64 ou 128 bits. Chave de 1 a 2040 bits.

- **Blowfish 1993**: Utiliza blocos de 64 bits. Chave variável de 32 a 448 bits. Possui uma vulnerabilidade.

- **AES (Advanced Encryption Standard) 2001**: Substitui o DES. Blocos de 128 bits. Chave de 128, 192 ou 256 bits.

- **Camellia 2000**: Chaves de 128, 192 ou 256 bits.

### Validação de integridade de dados

Aplicar resumo de mensagem (hash) sendo um valor numérico computado a partir de um bloco de dados.

Resumo de mensagem é um algoritmo que recebe qualquer comprimento de entrada e mesla a entrada para produzir um valor pseudo-aleatório na largura fixa.

Conhecido como: **Funções de Hash**, Message Digest, hash.

Comparado a funções checksum, porém várias mensagens levam ao mesmo resumo.

#### Propriedades

- Determinística: Mesmo dado, mesmo resumo.

- Eficiente: Rápido de calcular.

- Impossibilitam a geração de mensagem original a partir do hash.

- Difícil de encontrar duas mensagens diferentes com o mesmo hash.

#### Algoritmos de hash

- **MD5 (Message Digest Algorithm 5) 1991**: Hash de 128 bits. Impróprio.

- **SHA (Secure Hash Algorithm)**
  - SHA-1: Hash de 160 bits / 20 bytes
  - SHA-2: várias funções com resumos com valores de hash diferentes (224, 256, 384, 512).
  - SHA-3: Não deriva do SHA-2.

## Criptografia Assimétrica (1970)

Utiliza duas chaves matematicamente relacionadas, uma encripta (pública) outra decripta (privada).

Para quebrar, cálculos podem derivar a chave privada a partir da pública. O tempo de quebrar está relacionado ao tamanho da chave.

*Muito lentos*

Geralmente, para carga de dados maiores, encriptam com chave simétrica e a chave simétrica é encriptada com assimétrica.

##### RSA (Rivest, Shamir e Adleman)

Usa chaves de 1024 a 4096 bits.

É fácil de determinar o produto de dois números primos, mas difícil de determinar os números primos a partir do produto.

- Escolher dois primos;
- Calcular o produto;
- Calcular a função totiente;
- Definir o expoente (coprimo (MDC = 1) de n)
- Calcular d | (e * d) % tot(n) = 1

Como exemplo:
m: mensagem
c: mensagem cifrada
e: expoente chave pública
d: expoente chave privada
n: módulo

> Cifragem: c = m^e % n
> Decifragem: m = c^d % n

> e = 17 | d = 13 | n = 33

> c = 5^17 % 33 = 27
> d = 27^13 % 33 = 15

## Assinatura Digital

O destinatário, utiliza a chave pública do emissor para decifrar a mensagem. Caso o conteúdo é legível, é seguro afirmar que a mensagem foi enviada pelo emissor, com a chave privada.

Uso de chave privada para criptografar dados é conhecida como **Técnica de Assinatura Digital**.

Texto cifrado = assinatura digital

Não é cifrado o texto completo, mas sim um resumo de mensagem (hash), cifrando ele com a chave privada.

Garante quem é o emissor, não repúdio e integridade.

Cada mensagem tem sua própria assinatura digital.

Além do resumo, é adicionado um identificador do algoritmo de hash.

Bytes são usados para preencher o bloco com o tamanho da chave.

Dado cifrado = resumo + identificador + bytes de preenchimento

Além de *RSA* ser onipresente, existe o **DSA (Digital Signature Algorithm)** e **ECDSA (Elliptic Curve Digital Signature Algorithm)**.

### Certificado Digital

Associa um nome à uma chave pública, feito pela Autoridade Certificadora (AC).

Para um agente cifrar uma mensagem para outro, é necessário o certificado do destinatário. O remetente usa a chave pública da autoridade certificadora para validar o certificado do destinatário.

O formato mais aceito é o **X.509 versão 3**.

##### Formatos de Certificados Digitais

Para codificar um certificado em formato binário, usa o conjunto de regras **DER (Distinguished Encoding Rules)**.

- Formato PEM (Privacy Enhanced Mail): Arquivo .DER codificação em base64.

#### Autoridade Certificadora

- Pública: via Internet. Emitem certificados para pessoas e empresas.

- Privadas: Dentro de uma empresa, licenciando apenas usuários finais.

As ACs controlam os ciclos de vida dos certificados.

Depois de registrado o usuário:

- O usuário emite a chave pública para a AC por meio de uma solicitação de assinatura de certificado - CSR (Certificate Signing Request).

- Ou a Autoridade Certificadora gera um par de chaves para o usuário.

### Modelos de Confiança

Descrevem o relacionamento entre as ACs e os usuários finais.

- Hierarquia de certificados: para validar o certificado é usado a chave pública da AC. Uma Autoridade Raiz assina certificados da AC e está fora da hierarquia.

- Certificação Cruzada: Cada AC opera independentemente. Permite integração entre diferentes infraestruturas de ACs.

Atualmente a AC Raiz do Brazil é a **ICP Brasil**.

##### Keystore

Uma Keystore é um repositório de armazenamento de chaves privadas, certificados e/ou chaves simétricas.

## SSL (Secure Sockets Layer) 1994

Protocolo para criptografia e autenticação na Internet.

Passado da Netscape para IETF, tornando-se o **TLS (Transport Layer Security)**, distribuída em 1999.

#### Handshake

1 Cliente Hello - O cliente TLS envia uma mensagem "cliente hello" (Versão TLS suportada, Algoritmo de criptografia, número de sessão)

No navegador, a mensagem ocorre ao usar *HTTPS* para acessar o servidor.

2 Server Hello - Em resposta o servidor envia uma mensagem "server hello" (Algoritmo escolhido, Certificado, Pode solicitar certificado do cliente).

3 - Verificação de certificado - Valida a cadeia de certificados. O cliente avalia se pertence a quem afirma ser. Datas verificadas. Conferencia de revogação com CRL e ARL (listas de revogação de pessoas ou ACs).

Também pode ser usado o OCSP (Online Certificate Status Protocol). Onde o cliente solicita a AC o status do certificado.
Porém causa dependência da AC; Privacidade com a AC; Atraso na resposta.

### Senhas

Controlar autenticação de usuários por hash da senha.

Porém uma mesma senha produz o mesmo hash.

Para dificultar é usado salt (adicionar alguns caracteres para aleatorizar a senha).