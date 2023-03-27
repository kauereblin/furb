# Web Aula 1

## Conceitos

A interconexão de um conjunto de computadores através de uma tecnologia de transmissão de dados chama-se `rede de computadores.`

A partir da `década de 90`, as redes de computadores começaram a oferecer serviços também para pessoas físicas: acesso a informações remotas, comunicação interpessoal, entretenimento interativo e comércio eletrônico.

---

## Hardware e Software

### Modelo cliente / servidor

Tipos de computadores:
- **Servidores**: Fornecedores de dados
- **Clientes**: Consumidores dos dados

### Modelo peer to peer (P2P)

Qualquer computador é um servidor e cliente

## Classificação

Dependendo da *escala* e do *endereçamento de transmissões*

### Por Endereçamento de Transmissão

- **Difusão** (broadcasting): Apenas um canal de comunicação, compartilhando através da utilização de um código especial no campo de endereço

- **Multidifusão** (multicastinh): Apenas um canal de comunicação, compartilhamento com diversos equipamentos, oferecendo o endereçamento de um pacote de dados atravéz da utilização de um código identificador no campo de endereço

- **Seletiva** (anycasting): Canal dedicado para dois dispositivos da rede, identificador pelo código do campo de endereço com menor métrica da lista de endereços

- **Ponto a Ponto** (unicasting): Canal dedicado para dois dispositivos da rede, com a utilização de um código identificador individual no campo de endereço.

### Por Escala

- **PAN** (Personal): Rede privada de dispositivos pessoais e periféricos

- **LAN** (Local): Rede local para salas, edifícios, blocos...

- **MAN** (Metropolitan): Interconexão das LANs administradas por terceiros de infra pública

- **WAN** (Wide): redes geograficamente distribuídas, com infraestrutura pública administrada por terceiros e com o objetivo de interconectar LANs em âmbito global (estados, países, continentes)

#### Sub-redes

As sub-redes são compostas por dois elementos distintos: as **linhas de transmissão** e os **elementos de comutação**.

> Comutação: interligação de dois ou mais pontos por meio de um sistema autônomo

- Linhas de Transmissão: Cobre, Fibre, Radio frequência
- Comutadores (Routers): conectam as linhas

Para reduzir a complexidade do projeto dos protocolos de comunicação, as redes são organizadas como uma pilha de camadas hierárquicas. O conjunto de camadas que especifica um protocolo de comunicação de dados chama-se **Modelo de Rede**.

Entidades de uma mesma camada são os pares, sua comunicação é feita sempre entre os pares através do protocolo que implementa a camada. Entre cada camada existe uma **interface**, que define as operaçoes e serviços entre as camadas.

**Protocolo** é um conjunto de regras que controla o formato e significado dos *quadros*, *pacotes* ou *mensagens* trocados pelos pares das **camadas**.

O conjunto de implementações das camadas (protocolos) são denominados de **Arquitetura de Rede**

> Modelo de Rede (Pilha de Camadas) -> Arquitetura de Rede (Pilha de Protocolos)

#### Serviços de uma camada

- Orientados à conexão: O emissor empurra bits e vão para o receptor na mesma ordem da emissão. Conexão estabelecida antes da trasmissão

- Serviços sem conexão: Cada mensagem carrega o endereço completo do destino e são independentes entre si, com incerteza da chegada ao destino

---

## Arquiteturas Hierárquicas

Cada camada do modelo deve executar uma ou mais das tarefas:

- Controle de erros: torna a comunicação confiável;

- Controle de fluxo: evita a sobrecarga de um nó mais lento limitando a taxa de transmissão a sua capacidade máxima;

- Segmentação: divide os dados em partes menores para transmissão e remonta-os no destino;

- Multiplexação: permite a várias camadas superiores compartilhar os serviços de uma mesma camada;

- Estabelecimento de conexão: permite criar e manter uma conexão

### Modelo de Referência OSI (Open Systems Interconnection)

Especificado pela ISO/IEC (International Organization for Standardization/International Electrotechnical Commission) em 1983 e revisto em 1995, que visou à padronização internacional dos protocolos empregados nas diversas camadas.

Pode ser representado por 7 camadas, sendo elas:

- Física: Meio físico da trasmissão (interface mecânica e elétricas)

- Enlace: Trasmissão bruta em uma linha de quadros livres de erros. Reconhece os limites dos quadros através da inclusão de bits no início e fim. Resolução de quadros perdidos, corrompidos, repetidos, e o controle do fluxo para receptores lentos. Em redes de difusão é responsável por controlar o acesso de um canal compartilhado

- Rede: Especifica o modo como os pacotes são roteados (determinado por uma métrica). Rotas podem ser **estáticas** ou **dinâmicas**. Garante interconexão de redes heterogêneas (!= endereçamento || != protocolos)

- Transporte: Segmentação da rede, segmentando e agrupando. Estabelece a conexão, o controle do fluxo e o congestionamento. **Camada fim a fim**, conexão de origem a destino

- Sessão: Permite usuários criarem sessões entre si. Define o transmissor e a sincronização do fluxo de dados.

- Apresentação: Sintaxe dos dados transmitidos. Ex: Conversões de dados de representações e criptografias

- Aplicação: Define sintaxe e semântica das mensagens trasmitidas, como transferência de arquivos, gerência de rede, pesquisa de diretório de nomes etc

A trasmissão acontece ao passar um cabeçalho específico nos dados e ao passar para cada camada servidora inferior. Acontecendo ao contrário no receptor.

**MODELO OSI NÃO É IMPLEMENTADO POR SER COMPLEXO**

### Arquitetura TCP/IP (Arq Internet)

Desenvolvida pela ARPANET - Departamento de Defesa dos EUA em 1974. Com objetivo de permitir a conexão de várias redes uniformemente mesmo que algumas máquinas intermediárias deixassem de operar.

1985 buscou fazer um mapeamento do modelo de referência OSI para a arq TCP/IP. TCP/IP não implementa as camadas *Apresentação* e *Sessão* e não referenciava as camadas *Física* e *Enlace*, apenas **host/rede**.

Modelo e Arq TCP/IP:

Aplicação  <---> Aplicação <br>
Transporte <---> Transporte <br>
Rede       <---> Inter-rede <br>
Enlace     <---> Host/rede <br>
Física     <-/

- Física: Meio físico da trasmissão (interface mecânica e elétricas)

- Enlace: Depende do meio físico. Garante quadros enviados pela camada de rede sem erros.

- Rede: Integra toda a arq internet. Objetivo de entregar todos os pacotes independente das tecnologias de transmissão. Define **formato de pacote** e **protocolo IP**. Responsável pelo roteamento e controle do congestionamento.

- Transporte: Cria um canal de comunicação entre os pares. Protocolos TCP (Transmission Control Protocol) orientado a conexão e UDP (User Datagram Protocol) serviço sem conexão e segurança.

- Aplicação: Protocolos SMTP (Simple Mail Transfer Protocol) e HTTP (Hypertext Transfer Protocol) 

---

## Tecnologia de Redes e Computadores

A **largura da banda** é a quantidade de dados que flui em um enlace de rede durante um período. Limitada pelos meios físicos. Existem a *analógica* e *digital*

- Analógica: faixa de frequência de um sistema, por Hertz
- Digital (**Taxa de Transmissão**): bits por segundo (bps). Mede a quantidade de informação binária que pode ser transferida em determinado período.

### Projeto de Rede

Usar linha de rede / privada, oferece serviço exclusivo em tempo integral. Conexão fornecida pelos enlaces seriais, onde o caminho é fixo e permanente para cada rede remota, que é alcançada pelos recursos da operadora.

Outra opção é a rede comutada, os recursos ficam reservados pelo tempo em que a conexão estiver ativa.

Rede telefônica é baseada em **comutação de circuito**, onde preestabelece a comunicação e mantem os recursos ativos durante todo o tempo que a conexão for mantida.

Rede de computadores trabalham com **comutação de pacotes**. Os pacotes são transmitidos por diversos enlaces de comunicação, sem ter reserva prévia. Há atraso em enlaces por conta do tráfego de pacotes.

Entre origem e destino, os pacotes atravessam os enlaces de comunicação e os comutadores de pacotes, denominados routers.

### Redes baseadas em Comutação de Pacotes

- **Rede de Datagramas**: Roteiam pacotes com um endereço de destino. Cada pacote contém o endereço de destino no cabeçalho, onde o comutador define qual enlace de saída melhor transmitir. Permite serviço orientado a conexão e sem.(LANs e Internet)

- **Circuitos Virtuais**: Roteiam pacotes de acordo com números de circuitos virtuais. São como caminhos, série de enlaces e comutadores, uma sequência de números de circuitos virtuais (VCI - Virtual Channel Identifier) para as interfaces de entrada e saída dos comutadores. Só oferece serviço orientado a conexão. (Linhas privadas virtuais na infra das orgs)

### Atrasos de Rede

- Processamento: Tempo necessário para o nó analisar o conteúdo do pacote verificando erros e definir o caminho de transmissão.

- Enfileiramento: Tempo de aguardo na fila de transmissão até ir para o enlace de saída.

- Transmissão: Tempo que leva para que todos os bits de um pacote seja transmitido para o enlace de comunicação. **tTrans = bits / (bits/s)**

- Propagação: Tempo que cada bit propaga pelo enlace, dependendo do meio físico. tProp = distância / velocidade do bit no enlace **TProp = d / v**.

t = tproc + tenf + ttrans + tprop

---
<br>

# Web Aula 2

## História da Internet

ARPA (Advanced Research Projects Agency) criada na guerra fria, em 1968, para desenvolver tecnologias de comunicação e informação. Em 1972, a ARPANET foi criada para conectar universidades e laboratórios de pesquisa. Em 1974, a ARPANET foi aberta para o público.
E em 1982 o **TCP/IP (Transmission Control Protocol / Internet Protocol)** e o **DNS (Domain Name System)** foram criados para organizar máquinas em domínios e mapear nomes de máquinas em endereços IP.

National Science Foundation criou a NSFNET, em 1986.

Internet foi criada em 1989, ligando a NFSNET com EBONE europeu. Um computador está conectado à internet quando executa a pilha de comandos de protocols TCP/IP, tem um endereço fixo de IP ou temporário e consegue se comunicar com qualquer outro computador.

Em 1989, o Ministério de Ciência e Tecnologia do Brasil criou a Rede Nacional de Pesquisa (**RNP**), que conecta universidades e institutos de pesquisa. Em 1995, a RNP foi conectada à Internet.

A **Internet2** foi criada em 1997 para desenvolver tecnologias e aplicações avançadas de redes para comunidade acadêmica e de pesquisa. O Brasil também criou a **RNP2** em 1999 e implantada com a internet2 em 2001.

A ISOC (Internet Society) criada em 1992 coordena a evolução da internet, com os principais organismos de normalização:

- **IETF (Internet Engineering Task Force)**: Parte técnica, padronização tecnológica e arquitetura.

- **IAB (Internet Architecture Board)**: Papel consultivo e controla a IETF.

- **IRTF (Internet Research Task Force)**: Pesquisa de longo prazo para a evolução da internet.

- **ICANN (Internet Corporation for Assigned Names and Numbers)**: Responsável pela gestão de nomes de domínios e alocação de endereços IP.

**Comitê Gestor da Internet** no Brasil (CGI) foi criado em 1995, como o ICANN porém nacional.

Em 2014 foi sancionado o **Marco Civil da Internet do Brasil**, regulamentando os direitos e deveres dos usuários brasileiros. Estabelece a **neutralidade da rede**, proibindo os pacotes pelo tipo de uso ou conteúdo. Também só permite os provedores a obter informações dos usuários por ordem judicial (*privacidade na rede*). Obrigando os provedores o cumprimento da legislação do país (*registros de acesso*).

Fornecer conexão não é responsável pela justiça do que o usuário faz na rede.

Fornecedores de serviços são a partir da notificação judicial.

**LGPD (Lei Geral de Proteção de Dados)** sancionada em 2018.

A **topologia** da internet - estrutura de interconexão - é hierárquica, que consiste nas estações conectados a um provedor local de acesso à internet (ISP - Internet Service Provider). O ISP conecta-se a um provedor regional, que por sua vez conecta-se a um provedor nacional, que por sua vez conecta-se a um provedor internacional.

---

## Redes de Acesso

Conectam sistema de usuário final com equipamento de comutação de uma rede de transmissão.

Primeira forma de acesso residencial foi por meio de **modems**, por meio do acesso discado da rede de telefonia fixa. O modem converte o sinal digital em analógico para ser transmitido pela linha telefônica. O ISP converte de volta para digital e é enviado à rede de computadores. O **Asymmetric Digital Subscriber Line (ADSL)** é a tecnologia de acesso via linha telefônica.

ADSL usa a técnica DMT (Discrete Multitone) para dividir a frequência de 1.1MHz em 265 canais de 4.3KHz, gerando 3 faixas:

- Canal 0 (0KHz a 4 KHz): Transmissão telefônica bidirecional.

- 1 a 5 não utilizados.

- Canais 6 a 31 (26KHz a 138KHz): Upload.

- Canais 32 a 255 (138KHz a 1.1MHz): Download.

A evolução do ADSL é o VDSL (Very-high-bit-rate Digital Subscriber Line), dividindo um espectro de 12MHz.

O **HFC (Hybrid Fiber Coaxial Cable)** é uma alternativa de acesso residencial sendo uma extensão da rede de TV a cabo, que se conecta a uma rede de computadores através do uso de modems especiais denominados cable modems.

A evolução do HFC é o **DOCSIS (Data Over Cable Service Interface Specification)**, divide o espectro de frequência em canais de 6 MHz.

#### **HFC/DOCSIS x ADSL**

ADSL usa um enlace ponto a ponto, enquanto o HFC/DOCSIS compartilha a banda com todas as residências que estiverem acessando a rede de computadores.

Para atender demandas futuras, será necessário implantar a transmissão por meio de fibra óptica, *FTTH (Fiber To The Home)*.

Outra forma de conexão é por meio de rede sem fio, através de outro padrão de MAN (Wireless MAN - WMAN), chamado de **WiMax (Worldwide Interoperability for Microwave Access)**, padrão **IEEE 802.16**.

O primeiro padrão importante para transmissão de dados da telefonia celular é da terceira geração - 3G, chamado de **UMTS (Universal Mobile Telecommunications System)** e usa a interface de rádio **HSPA (High Speed Packet Access)**.

A evolução do UMTS é o **LTE (Long Term Evolution)**, que é a quarta geração - 4G.

Atualmente já estamos no **5G NR (5G New Radio)**

---
<br>

# Web Aula 3

Problemas de segurança na internet:

- Sigilo: somente usuários autorizados podem ser capazes de acessar mensagens ou arquivos.

- Autenticação: garantir que o usuário é quem diz ser.

- Integridade e não repudiação: garantir que a mensagem não foi alterada durante o transporte.

- Disponibilidade e controle de acesso: garante que a comunicação possa ocorrer entre usuários legítimos.

A técnica de **varredura de endereços e portas** permite que o hacker descubra os endereços, SOs e serviços que os sistemas estão oferecendo, observando quais endereços respondem e contata os seus possíveis serviços para ver o que acontece como resposta.

**Sniffer de pacotes** é um programa que permite que um computador receba todos os pacotes que trafegam na rede.

A técnica de **spoofing** de endereço IP trata de criar pacotes com endereços IP arbitrários, fazendo parecer que o pacote tenha sido enviado por outro computador.

**DoS (Denial of Service)** é um ataque que visa saturar a rede de um computador, tornando-o indisponível para outros usuários. E o DDoS (Distributed Denial of Service) é composto por vários computadores atacando um único alvo.

---

## Sigilo

### Criptografia

O **texto claro** é transformado por uma função parametrizada por uma chave gerando o **texto cifrado**. Por fim o receptor usa outra chave para decifrar o texto cifrado.

Notação da criptografia: **C = E(K, P)**, onde **C** é o texto cifrado, **E** é a função de criptografia, **K** é a chave e **P** é o texto claro.

Notação de descriptografia: **P = D(K, C)**, onde **P** é o texto claro, **D** é a função de descriptografia, **K** é a chave e **C** é o texto cifrado.

O processo total é definido por: D(K2, (E (K1, P))) = P

A criptografia simétrica utiliza apenas uma chave, já a assimétrica usa duas.

### Algoritmos de Chaves Simétricas

O **DES (Data Encryption Standard)** criado no final dos anos 70, criptografa um bloco de 64 bits com uma chave de 56bits.
Evoluindo para o DES triplo logo no final dos anos 80.

Escalonando para os algoritmos **RC4** e **RC5** em 1994, usando chaves de tamanhos variáveis de 128 a 256 bits, eficiente e de alto volume.

Atualmente o algoritmo mais robusto é o **Rijndael**, passando a se chamar **AES (Advanced Encryption Standard)**, depois de ser aprovado pelo **NIST (National Institute of Standards and Technology)**. Criptografando blocos de 128 bits com chaves de 128, 192 ou 256 bits.

### Algoritmos de Chaves Assimétricas ou Públicas

O **RSA (Rivest, Shamir, Adleman)** é um algoritmo de criptografia assimétrica, criado em 1977, que usa chaves a partir de 1024 bits. É o algoritmo mais usado para criptografia de chaves simétricas. Passos de utilização:

- Escolher dois números primos extensos (10^150)

- Calcular n = p * q e z = (p - 1)(q - 1)

- Escolher um número menor que n e primo relativo a z (e)

- Calcular d de forma que (ed-1) mod z = 0

Para criptografar a mensagem P, calcula-se C = P^e mod n. Para descriptografar C, calcula-se  P = C^d mod n. A chave pública k1 consiste no par de números (e, n) e a chave privada k2 consiste no par de números (d, n).

Mas por ser muito lento, primeiro é entregue 

---

## Autenticação

Uma técnica através da qual um processo confirma que seu parceiro na comunicação é quem diz ser, através da troca de mensagens constituintes de um **protocolo de autenticação**. O Objetivo é que somente as duas partes conheçam a chave secreta.

Depois que a origem inicia o protocolo de autenticação, o destino retorna com uma informação que nunca fora utilizada. O processo de origem criptografa a informação com a chave K e envia para que o processo confira a descriptografia com a mesma chave K.

### Distribuição de Chaves e Certificação

A distribuição acontece por meio de um intermédio chamado de cartório virtual. Para distribuir chaves simétricas é usado o **KDC (Key Distribution Center)** - servidor que comparilha uma chave secreta com todos dispositivos. Processo segue:

- Usuário A pede ao KDC usando sua chave kA, uma chave k de comunicação entre AB.

- KDC retorna a chave k e uma mensagem, cifrada com a chave kB, que só o usuário B pode decifrar.

- O usuário A extrai a chave k e encaminha a mensagem cifrada com a chave kB para o usuário B, o qual extrai a chave k e confirma que está se comunicando com o usuário A;

- Finalizando a conexão entre AB com a chave k criada pelo KDC.

**CA (Certificate Authority)** disponibiliza a chave pública na forma de um **certificado digital** de todos os dispositivos da rede. Um certificado pode autenticar um CA, criando uma árvore hierárquica chamada de **PKI (Public Key Infrastructure)**. O caminho de certificação vai do CA de nível superior até o CA raiz. Processo segue:

- A pede a chave pública do B ao CA, usando a chave pública do CA.

- CA retorna a chave k1 pública do B.

- B descriptografa com sua chave privada k2.

---

## Integridade

A assinatura digital é uma técnica de criptografia que permite identificar quem criou o documento, garante a integridade do conteúdo, identifica de quem é e/ou comunica a concordância com relação ao conteúdo.

A integridade das assinatura necessita de um sistema que:

- O receptor possa verificar inequivocamente a identidade alegada

- O transmissor não possa posteriormente repudiar o conteúdo da mensagem

- O receptor não possa inventar uma mensagem que não foi enviada pelo transmissor

Usando o mesmo método de chaves privadas e públicas é possível satisfazer os problemas acima.

Porém, pela lentidão do algoritmo de chaves públicas, só é cifrada o **resumo da mensagem**, sendo os mais aleatórios possíveis e sem permitir reconstruir uma mensagem original a partir do resumo.

Os algoritmos mais usados são o **MD5 (Message Digest)** e o **SHA-1** e **SHA-2** (Security Hash Algorithm).
MD5 produz resumo de 128 bits, SHA-1 de 160 bits e SHA-2 de 256 ou 512 bits.

Verifica-se o resumo do texto claro com o resumo descriptografado com a chave pública de quem assinou o documento.

---
<br>

## Controle de Acesso

Firewalls são usados para barrar intrusos e controlar o acesso a recursos da rede. O firewall é combinação de hardware e software.

### Segmentos de Rede

- Rede Externa: Internet pela qual é possível acessar recursos públicos específicos de uma organização que são colocados no segmento DMZ

- DMZ (Delimitation Zone): É uma parte da rede privada da organização onde estão isolados recursos públicos que podem ser acessados de forma controlada, tanto desde a rede externa quanto desde a rede interna;

- Rede Interna: A LAN a ser protegida, podendo acessar qualquer dos demais segmentos da rede.

Para proteger a rede interna é necessário que todo tráfego de dados passe pelo Firewall.

Um exemplo de topologia é colocar os serviços de servidor de internet e encaminhamento de correio eletrônico na DMZ, e os demais serviços na rede interna, tendo como intermédio o Firewall.

Além disso pode ser usado um IDS (Intrusion Detection System) para monitorar o tráfego de dados e detectar possíveis ataques.





























