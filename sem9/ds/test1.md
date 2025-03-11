# A era dos Dados e a Ciência de Dados

## Ciência de Dados

Campo interdisciplinar que combina técnicas e conhecimento como estatística, matemática, ciência da computação e domínio específico para extrair conhecimento a partir de dados.

O objetivo principal é **compreender** os dados, **identificar padrões**, **fazer previsões** e auxiliar na tomada de decisões.

#### Surgimento da Ciência de Dados

Condições Sociotécnicas:

- Lei de Moore: Aumento computacional / Redução de custos;
- Digitalização da sociedade: Dilúvio de dados;
- Aprimoramento das técnicas de análise;

| Período | Crescimento | Áreas | Coleta e Análise | Impactos Sociais |
|-|-|-|-|-|
|1980|Lento e Constante|Industrial, Científica, Internet|PCs, Internet|Popularização da Informática, Telefone celular|
|2000|Acelerado|E-commerce, mídias sociais, nuvem, mobile|Internet, smartphones|Expansão da Internet e mídias sociais|
|2020|Exponencial|IA, IoT, RA e RV|IoT, Big Data, ML|Transformação digital, oportunidades e desafios, dependência digital|

### Digitalização → Datificação

- Digitalização: Transformação de informações analógicas para digitais;
- Datificação: Coleta extensiva de informações sobre comportamentos, analisados para gerar inferências e previsões.

##### "Os dados são o novo pretóleo"

Empresas usam dados para otimizar operações, entender comportamentos de usuários e criar vantagens competitivas, enquanto a pesquisa científica os emprega para modelar fenômenos sociais, estudar padrões e desenvolver novas metodologias analíticas.

##### "Os fatos importam"

A alfabetização em dados é essencial para navegar onde a informação é abundante mas nem sempre confiável.

Em um cenário onde decisões políticas, econômicas e sociais são justificadas por dados, a capacidade de interpretar estatísticas, identificar vieses e compreender limitações metodológicas se torna fundamental para uma cidadania crítica.

## Tipologia dos dados

- Específico (baixo nível); Ex: Tipos de variáveis em linguagens de programação.
- Tipos de dados em estatística/pesquisa científica;
- Geral (alto nível). Ex: Tipos de dados para as organizações.

#### Tipos de dados em Pandas

Expande os tipos dos dados da Python, otimizando o armazenamento e processamento de dados tabulares, tendo integração com a biblioteca do NumPy.

- int64: inteiros de 64 bits (long int);
- float64;
- Int64: tipo que aceita valores NaN;
- bool;
- boolean: suporta NaN;
- object: tipo genérico para strings;
- string: otimizado;
- datetime64[ns]: precisão de nanosegundos;
- timedelta64[ns]: diferença entre datas;
- category: tipo categórico, enumerador

### Tipos em estatística

#### Quantitativos

| Discretos | Contínuos |
|-|-|
|Valores inteiros não negativos|Decimais e/ou negativos|

#### Quanlitativos

| Nominais / Categóricos | Ordinais |
|-|-|
|Sem ordem|Ordem sem escala fixa de diferença entre valores|

#### Transformação de Dados

- Contínuo → Categórico: Renda familiar → Classe social;
- Categórico → Contínuo: (Expectativa de vida + Rendimento per capita) → IDH;

> Obs: Não é possível retornar

### Dimensionalidade

Dimensões são o número de variáveis (**features** / colunas) do conjunto de dados.

Baixa dimensionalidade é mais fácil de interpretar e manipular, alta exige técnica de seleção e redução para evitar problemas estatísticos.

#### Baixa Dimensionalidade

Poucas variáveis (<= 3), de fácil visualização, exigindo menor processamento com algoritmos.

Menos suscetível a overfitting.

#### Alta Dimensionalidade

Muitas variáveis (>= 10), dificultando a interpretação.

"Curse of Dimensionality": a densidade de dados se espalha, dificultando a análise.

Modelos de ML podem sofrer overfitting.

### Número de casos X Dimensões

A proporção de casos e dimensões é crucial para determinar a viabilidade da análise e a metodologia de modelagem.

|Dimensionalidade / Casos|Vantagens|Desafios|Soluções|
|-|-|-|-|
|BD/PC|Fácil treinar e entender|Falta de dados para generalização|Modelos simples, métodos bayesianos|
|BD/MC|Rápidos e interpretáveis|Podem não capturar toda a informação|Feature Engineering, modelo mais sofisticado|
|AD/PC|Pode capturar muitos detalhes|Overfitting, modelar padrões reais|PCA, Transfer Learning|
|AD/MC|Modelos complexos podem aprender bem|Custo computacional|Computação distribuída|

#### Tipo de dados

Aproximadamente 20% dos dados são estruturados e 80% são desestruturados (Big Data).

##### Estruturados

Organizados em formato fixo. Armazenados em tabelas, fáceis de consultar e relacionáveis entre si. Ex: Banco de dados relacionais, planilhas.

Formatos: CSV, SQL.

##### Semi-Estruturados

Organizados mas sem estrutura fixa. Uso de tags e marcadores, podendo conter hierarquia. Ex: JSON, XML, NoSQL.

Formatos: JSON, HTML, XML, YAML, NoSQL.

##### Não-Estruturados

Sem formato predefinido. Difícil de indexar, necessitando de processamento (PLN, visão computacional), de alto volume. Ex: Textos, imagens, vídeos, áudios.

Formatos: txt, MP4, JPG, WAV, PDF.

Uma das principais tarefas da **Ciência de Dados** é transformar não estruturados em estruturados, facilitando a analise, processamento e usados em modelos de ML.

Armazenamento e consulta são mais eficientes quando os dados seguem um formato padronizado.

### Rotulados X Não Rotulados

Essencial para definir o tipo de aprendizado de máquina aplicável.

- Rotulados: Possuem **features** associadas a um rótulo, podendo servir num modelo supervisionado;
- Não Rotulados: Não possuem rótulos associados. O objetivo é encontrar padrões sem informações prévias sobre classes ou valores de saída;

### Abertos x Proprietários

Acesso, uso e direitos legais. Impactando pesquisas, inovações tecnológicas e desenvolvimento de soluções em Ciência de Dados.

#### Open Data

Dados públicos e acessíveis sem restrições significativas.

- Acesso gratuito ou de baixo custo;
- Transparência e incentivo à pesquisa;
- Dados estruturados;
- Licenciamento livre;

Ex: Governamentais, Bases científicas, APIs públicas.

- Desafios:
  - Qualidade e confiabilidade;
  - Sem garantia de atualização;
  - Limitação na granularidade.

Pode ser usado para análise de políticas, estudos acadêmicos, jornalismo de dados.

#### Proprietary Data

Restritos e controlados por organizações, protegidos por propriedade intelectual, privacidade ou contratos comerciais.

- Acesso limitado;
- Proteção legal;'
- Qualidade e integridade;
- Maior valor comercial;

Ex: Banco de dados de empresas, redes sociais, sensores e IoT.

- Desafios:
  - Dificulta pesquisa independente
  - Custo elevado;
  - Questões éticas.

Usado para Personalização de recomendação, precificação dinâmica, análise de mercado.

### Ferramentas

Escolha de ferramentas dependem de facilidade de uso, necessidade de customização, profundidade técnica e escalabilidade do projeto.

Soluções baseadas em interfaces gráficas como *KNIME*, *Orange*, *RapidMiner* e *WEKA* permitem análise sem codificação avançada.

Porém as linguagens **R** e **Python** oferecem maior flexibilidade e poder computacional. R é vinculado a **análise estatística** e **visualização de dados**. Já Python é versatil e industrialmmente aplicável, para **ML**, **deep learning** e **Ciência de Dados**.

### Bases de dados

- Kaggle
- Portal de Dados Abertos
- Gapminder Foundation
- Our World in Data
