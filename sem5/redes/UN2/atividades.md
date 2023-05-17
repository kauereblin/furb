# Par trançado

II. em função da ausência ou presença de blindagem metálica, os cabos de par trançado classificam-se em UTP e STP respectivamente
III. o conector utilizado chama-se RJ-45
V. comparado à fibra óptica, o par trançado tem menor banda passante e menor imunidade à interferência eletromagnética, contudo, seu custo é mais baixo

> II, III e V

# Fibra

II. suportam dois modos para a propagação da luz ao longo dos canais ópticos: multimodo e monomodo
III. conectores que podem ser utilizados são SC e ST
V. comparada aos pares trançados, a fibra óptica tem maior banda passante e imunidade à interferência eletromagnética, contudo, seu custo é mais elevado

> II, III e V

# Padrões IEEE 802

> na contenção com detecção de colisão


1 - Computadores em redes IEEE 802.11 podem-se comunicar por dois modos básicos: usando uma infraestrutura coordenada por pontos de acesso à rede (Access Points — AP), ou no modo ad hoc, em que cada computador troca informações diretamente com os demais
2 - Para poder transmitir por meio de um ponto de acesso, uma interface de rede deve realizar um procedimento de associação, que inclui o conhecimento de um campo identificador (Service Set Identifier — SSI)
4 - Um mecanismo de requisição para transmissão (request to send — RTS) e de liberação para transmissão (Clear To Send — CTS) pode ser usado para evitar colisões
> 1, 2, 4

> associar-se a um SSID qualquer, desde que não haja outra estação sem fio transmitindo simultaneamente no canal 3

A utilização do protocolo CSMA/CD não é necessária em comutadores Ethernet transmitindo em modo full-duplex.
PORQUE
Os comutadores, operando em modo full-duplex, mantêm canais de comunicação distintos para envio (TX) e recebimento (RX) de dados, além de não encaminhar mais do que um quadro por vez para a mesma interface (porta).

> As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira

I. O padrão IEEE 802.3 permite detecção de colisão.
II. O método de acesso para o padrão 802.3 é o CSMA/CD, enquanto o padrão 802.11 faz uso de CSMA/CA.
IV. O quadro 802.11, assim como o quadro 802.3, inclui uma verificação de redundância cíclica (CRC).

> I, II e IV.

II. Os usuários devem solicitar autenticação através de um portal web (HTTPS) e posteriormente o seu acesso será limitado à navegação web, correio eletrônico e acesso aos sistemas da empresa.

IV. Para aumentar a segurança da informação trafegada deve-se optar pela utilização do WPA2, pois este usa o algoritmo AES.

> II e IV

> O método de acesso para o padrão 802.3 é o CSMA/CD, ao passo que, para o padrão 802.11, o método de acesso é o CSMA/CA

# Ligação Inter-Redes

> **FALSA** O mecanismo de controle de acesso ao meio utilizado é distribuído e, nas redes com hubs, cada interface de rede deve determinar quando é possível realizar uma transmissão

# Protocolos de Rede

> Técnica de tunelamento

III. O campo "próximo cabeçalho" identifica o protocolo ao qual os dados presentes no datagrama serão entregues, por exemplo, TCP ou UDP.
IV. No IPv6, o campo "classe de tráfego", de 8 bits, é semelhante ao campo "tipo de serviço" do IPv4, ambos utilizados para diferenciar os tipos de pacotes IP.
V. O valor do campo "limite de saltos" é diminuído em um para cada roteador que repassa o pacote; caso a contagem do limite de salto chegue a zero, o pacote será descartado.
> III, IV e V.

# Endereços de Rede

> se for necessário dividir a rede em oito sub-redes, então a máscara de rede será 255.255.255.224

> As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira

> IP do router global válido: 138.76.28.4 e 138.76.28.4

III. As sub-redes propostas para as Nuvens 1 e 4 atendem às demandas de equipamentos destas localidades.
IV. O plano de endereçamento proposto de acordo com a tabela não é suficiente para o atendimento da quantidade de equipamentos propostos no projeto.
V. No site principal existe um erro de alocação das faixas, que pode ser corrigido utilizando uma faixa única 10.1.0.0/23.
> III, IV e V.

# Roteamento

> Diretamente para 192.0.2.50 e encaminhando para 192.0.2.1, respectivamente

# Algoritmos de Roteamento

I. Um roteamento entre o SA 1 e o SA 2 utiliza dois algoritmos diferentes: RIP nos roteadores internos do SA e BGP entre os SAs.
III. O OSPF implementado no SA 2 utiliza o endereço de destino do cabeçalho IP para tomada de decisão e escolha da melhor rota.
>I e III.

> Border Gateway Protocol (BGP)


III. Um pacote IPv4 pode ser fragmentado por qualquer dispositivo na rede, se o tamanho máximo de MTU da rede onde os pacotes vão transitar for menor que o tamanho do pacote a ser transmitido.
IV. Ao enviar um pacote IPv4, a máscara de sub-rede é utilizada pelo computador ou roteador para identificar se o computador de destino pertence a esta mesma sub-rede.
> III e IV.

> Alterar a máscara de sub-rede da estação PROFESSORES01 para 255.255.0.0.