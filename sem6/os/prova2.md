# Processos

Programa em execução

Processo altera o seu estado a medida da execução

Responsável pelas informações da execução do programa (registradores e memória)

Cada **usuário** executa um processo

### Modelo

O SO usa o **PCB (Process Controll Block)** - descritor de processo - para materializar o processo

O PCB armazena todas as informações do processo.

Processo é dividido em 3 elementos básicos:
- Contexto de Hardware;
- Contexto de Software;
- Espaço de Endereçamento;

#### Hardware

Conteúdo dos registradores. Fundamental para a troca de processos (**context switching**)

#### Software

Características do processo que vão influenciar na execução (n máx de arquivos, tamanho do buffer);

Algumas características mudam em runtime, outras são const

- **Identificação**: **PID (Process Identification)**, n único que identifica o processo no sistema
- **Quotas**: Determina o limite de cada recurso do sistema
- **Privilégios**: Define o que o processo pode fazer

#### Espaço de Endereçamento

Área de memória reservada para o programa, protegida dos demais processos

### Estados do Processo

- **Running**: Usando a CPU;
- **Ready**: Pronto para rodar, CPU ocupada
- **Wait**: Depende de um evento externo do processo (IO ou agendamento)

Espera pode ser dividido:
- Espera: Aguarda pela conclusão de uma operação;
- Bloqueado: Espera autorização para usar um recurso

Processos em espera ou prontos podem estar na *memória secundária*

Processos ficam em uma lista encadeada para controle

##### Mudança de estado

- Voluntária: operações I/O
- Involuntária: SO para programa em looping

|Mudança|Nome|Motivo|
|-|-|-|
Pronto -> Execução | Dispatch | Novamente
Execução -> Espera | | S/ condição
Execução -> Pronto | TimeRunOut | Tempo
Espera -> Pronto | WakeUp | Externo

#### Subprocessos

Permite a divisão de atividade para trabalhar concorrente

Cada subprocesso tem seu contexto de hardware, software e endereçamento

### Threads

Compartilham o processador da mesma forma que o processo

Tem seu contexto. Mas compartilham o endereçamento, onde uma pode alterar dados de outro thread. Trabalhando de forma cooperativa.

## Tipos de Processos

- CPU-bound
- I/O-bound

#### CPU-bound

Passa a maior parte em execução
Poucas operações I/O
Muitos cálculos necessários

#### I/O-bound

Maior parte em tempo de espera
Grande número de I/O
Aplicações comerciais e processos interativos

##### Operações sobre Processos
Criar um processo;
Destruir um processo;
Suspender um processo;
Retornar (reativar) um processo;
Alterar a prioridade de um processo;
Bloquear um processo;
Desbloquear um processo (wakeup);
Despachar um processo (dispatch).

#### Comunicação entre Processos

Troca de informações através de um buffer, há uma sincronização

**Problemas de compartilhamento de recursos**:
Acesso simultâneo de arquivos, Alteração de variáveis na memórias

**Soluções**:
Exclusão Mútua: impede acessar um mesmo recurso usado, usando critical section para alteração das variáveis e fazer o sincronismo no final.

Problemas:
- Processos não podem bloquear outro se estiver fora da CS dele;
- Nenhum processo pode esperar para entrar na sua CS (starvation)
- Evitar que mais de um processo execute sua CS
- Sincronização condicional: Aguarda o buffer de sincronismo

