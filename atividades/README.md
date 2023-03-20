

Foram reunidos nesse projeto um compilado de exercícios simples para aplicação dos padrões que conhecemos nos treinamentos
dos dias 20, 21 e 30 de março/2023. <br/>

Os mesmos foram separados em dois packages:
- atividades_a_fazer (onde estarão os códigos com problemas para você resolver! hehe)
- atividades_resolvidas (onde estarão os códigos com os problemas resolvidos, para serem conferidos depois)

Cada exercício, possui nesse README, uma explicação escrita e o link para um vídeo de apoio no Youtube.
<br/>
Ao final, também estarão linkadas recomendações de materiais de estudo sobre Design Patterns!
<br/>
Em caso de dúvidas ou curiosidades, estamos sempre disponíveis nos teams: <br/>
**yasmin.souza@dbserver.com.br** <br/>
**maria_loliveira@sicredi.com.br**
<br/>

Bons estudoss! **: )** 


<h1>INSTRUÇÕES:</h1>


<h2> Exercício do padrão SINGLETON:</h2>
Nesse exercício, simulamos um banco de dados que realiza operações em uma tabela Usuário. <br/>
Nele, é possível reparar ao rodar o método Main, que sempre que realizamos uma chamada para nosso banco de dados fake, é criada uma nova instância de conexão. Isso faz com que rapidamente o banco atinja seu limite de conexões.


Atualmente, utilizando o Spring, não precisamos mais nos preocupar em lidar com esse problema
em contextos de banco de dados, pois o framework realiza a implementação do Singleton, limitando a quantidade de instâncias de conexão por baixo dos panos. <br/>
A ideia, então, é lidarmos com essa questão sozinhos, "na mão"!
<br/>
<br/>
Limite a quantidade de instâncias da classe Conexão.

**LINK DE APOIO**: https://www.youtube.com/watch?v=koL2LK-MjB4&ab_channel=MatheusCastiglioni

<h2> Exercício do padrão STRATEGY:</h2>
O padrão deverá ser aplicado no exemplo do código Main, com propósito de diminuir complexidade de IF's, implementando as interfaces e classes necessárias.
<br/>

**LINK DE APOIO**: https://www.youtube.com/watch?v=TfAAGUrUBIQ&t=1386s&ab_channel=RinaldoDev

<h2> Exercício do padrão BUILDER:</h2>
Suponha que você esteja criando uma aplicação de e-commerce que vende produtos eletrônicos. Você precisa criar uma classe para representar um produto eletrônico com os seguintes atributos:
<br/>
<br/>
Nome do produto
<br/>
Marca
<br/>
Preço
<br/>
Quantidade disponível
<br/>
Descrição
<br/>
<br/>
Usando o padrão Builder, implemente a classe ElectronicProduct e uma classe ElectronicProductBuilder para construir objetos do tipo ElectronicProduct. O ElectronicProductBuilder deve ter métodos para definir cada um dos atributos do ElectronicProduct.
<br/>Em seguida, crie um objeto ElectronicProduct usando o ElectronicProductBuilder e imprima as informações do produto na tela.
<br/>

<h2> Exercício do padrão FACTORY:</h2>

Suponha que você esteja criando uma aplicação de processamento de arquivos, onde você precisa ler arquivos de diferentes formatos (CSV, XML, JSON) e realizar operações com os dados contidos nesses arquivos. Cada tipo de arquivo requer um processamento diferente.

Usando o padrão Factory Method, crie uma classe FileReaderFactory que tem um método createReader que retorna um objeto de uma das classes filhas de FileReader, dependendo do formato de arquivo solicitado. As classes filhas são CsvReader, XmlReader e JsonReader.

Em seguida, crie uma classe FileProcessor que usa a FileReaderFactory para ler arquivos e realizar operações com os dados contidos nesses arquivos. A classe FileProcessor deve ter um método processFile que recebe o nome do arquivo e o tipo de arquivo (CSV, XML ou JSON) como parâmetros e realiza as operações necessárias com base no formato do arquivo.

Por fim, crie um método principal que cria uma instância de FileProcessor e processa alguns arquivos, imprimindo as informações contidas nos arquivos na tela.
<br/>

<h2> Exercício do padrão ADAPTER:</h2>

Suponha que você esteja trabalhando em uma aplicação que precisa exibir uma lista de itens em uma interface gráfica de usuário. No entanto, os dados estão armazenados em diferentes fontes, incluindo um banco de dados relacional e um sistema de arquivos.

Usando o padrão Adapter, crie uma classe ItemAdapter que transforma os dados de diferentes fontes em um formato comum, de modo que possam ser exibidos na interface gráfica de usuário. A classe ItemAdapter deve ter um método getItems que retorna uma lista de objetos Item.

Em seguida, crie uma interface gráfica de usuário que exibe os dados da lista de itens usando a classe ItemAdapter.

Por fim, crie um método principal que cria uma instância de ItemAdapter e exibe a lista de itens na interface gráfica de usuário.
