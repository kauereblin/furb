# Protocolos de Transporte TCP

O protocolo de controle de transmissão (TCP) deve necessariamente adotar o método não assistido, no qual a camada de rede não fornece nenhum suporte explícito à camada de transporte com a finalidade de controle de congestionamento.

PORQUE

A camada de rede Internet Protocol (IP) não fornece realimentação de informações aos sistemas finais quanto ao congestionamento da rede.

> As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira

 O protocolo de controle de transmissão, ou TCP

> Possui controle de congestionamento, evitando assim a ocorrência de tráfego excessivo na rede.

I. Quando um programador desenvolve uma aplicação ou serviço de rede, é necessário utilizar um socket para unir o endereço IP da interface de rede com uma porta específica.

II. O socket possibilita ao sistema operacional identificar qual porta a aplicação está respondendo, permitindo que o fluxo de dados seja entregue corretamente.

> As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.

# Protocolo de Transporte UDP

No desenvolvimento e na programação

> orientado a conexão

I. O UDP é mais eficiente que o TCP quando o tempo de envio de pacotes é fundamental.

III. O TCP é mais eficiente que o UDP quando a confiabilidade de entrega de dados é fundamental.

>I e III, apenas.

I. Para lidar com possíveis atrasos de pacotes em trânsito na Internet, o protocolo RTP fornece um mecanismo para garantir a entrega de dados a tempo no destino.

II. Os roteadores conseguem distinguir e tratar datagramas IP que carregam pacotes RTP e assim estabelecer um esquema de QoS (Quality of Services, ou Qualidade de Serviços).

> As asserções I e II são proposições falsas.

# Segurança de Camada de Transporte

Os protocolos TLS (Transport Layer Security) e SSL (Secure Sockets Layer)
> entre a camada de aplicação e a camada de transporte

# Serviço de Diretório

Uma empresa tem a sua sede em Natal e filiais em Brasília e Florianópolis.
> configurar servidores Domain Name System (DNS) para atender ao requisito E

# Transferência de Arquivos

II. Trata-se de um protocolo inseguro, pois não oferece criptografia, sendo recomendado a utilização de um protocolo mais seguro, como SFTP (Secure File Transfer Protocol).

III. A operação do FTP baseia-se no estabelecimento de duas conexões entre o cIiente e o servidor, em que a primeira é a conexão de controle, usada para transferência de comandos, e a outra uma conexão de transferência de dados.

> II e III.

# Correio Eletrônico

> o Internet Control Message Protocol (ICMP) possibilita que mensagens de erro e de controle sejam trocadas entre máquinas. As mensagens ICMP são transferidas como dados em datagramas do IP

> o Transmission Control Protocol (TCP) provê um serviço **orientado a conexão**. Os dados são transferidos por meio de uma conexão em unidades conhecidas como segmentos. O TCP espera que a recepção dos segmentos transmitidos seja confirmada pelo destino e retransmite segmentos cuja recepção não seja confirmada

# Gerenciamento de Redes

I. Na gerência de segurança são abordados aspectos relacionados ao acesso à rede e ao uso incorreto por parte de seus usuários.

II. A gerência de desempenho aborda a responsabilidade pela medição e disponibilização das informações sobre aspectos de desempenho dos serviços de rede. Esses dados são utilizados para a análise de tendências e para garantir que a rede opere em conformidade com a qualidade de serviço acordado com os usuários.

V. O objetivo da gerência de falhas é registrar, detectar e reagir às condições de falha da rede.

>I, II e V.

I. A MIB (Management Information Base) padrão (mib-II) contém informações que permitem à aplicação gerente recuperar a tabela de rotas de um dispositivo IP, possibilitando a descoberta de erros de roteamento.

III. Qualquer dispositivo gerenciado via SNMP pode fornecer dados sobre erros e tráfego de suas interfaces, permitindo o acompanhamento de problemas e o monitoramento de desempenho das mesmas.

> I e III.

I. O SNMP atua na camada 7 do modelo OSI.

III. O SNMPv2 fornece gerenciamento de rede centralizado e distribuído incluindo aprimoramentos na sua estrutura e gerenciamento.

IV. O SNMPv3 foi criado para solucionar as questões de segurança das versões anteriores, fornecendo acesso seguro às informações de gerenciamento por meio de autenticação e criptografia de pacotes.

> I, III e IV.

III. Permite o monitoramento de elementos de rede, como roteadores e switches, podendo ser utilizado para servidores e estações de trabalho, desde que se tenha o suporte ao SNMP instalado.

IV. Gerencia elementos em qualquer rede IP alcançável, e permite o encaminhamento de pacotes de uma rede para outra.

> III e IV.

# World Wide Web

Um navegador Web executa em um hospedeiro A

> ARP, DNS/UDP/IP, TCP/IP e HTTP/TCP/IP

Os protocolos da camada de aplicação que utilizam

> II. O protocolo FTP utiliza, por padrão, para conexão do cliente ao servidor, a porta 21/TCP. Após o estabelecimento de conexões FTP, além da porta 21/TCP, utilizada para o controle da conexão, as portas TCP utilizadas para a troca de dados entre cliente e servidor podem variar de acordo com o modo configurado no servidor (ativo ou passivo).

Um protocolo define o formato e a ordem das mensagens trocadas

> HTTP, SSL/TLS e TCP.

# Redes Multimídia

Com a convergência das redes

> UDP, por meio de um serviço sem estabelecimento de conexão, pois as possíveis retransmissões a que um fluxo de dados orientado à conexão está submetido, sempre que há problemas na transmissão, podem causar atrasos incompatíveis com um serviço multimídia