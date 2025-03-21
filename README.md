![image](https://github.com/user-attachments/assets/63788afd-63ca-4219-8c3b-cf767f901eed)# Java
## Criação e Impacto 
O Java é uma linguagem de programação orientada a objetos criada em 1991 por um grupo de engenheiros da Sun Microsystems, liderados por James Gosling, Mike Sheridan e Patrick Naughton.
Inicialmente, a linguagem foi desenvolvida para ser usada em uma ampla variedade de dispositivos eletrônicos, como TVs interativas e eletrodomésticos inteligentes.
Embora a linguagem tenha sido inicialmente projetada para dispositivos eletrônicos, foi na web que o Java realmente encontrou seu espaço. Em 1995, a Sun Microsystems lançou a primeira versão pública do Java, juntamente com o slogan "Write Once, Run Anywhere" (Escreva uma vez, rode em qualquer lugar). Esse conceito, baseado na máquina virtual Java (JVM), permitia que o mesmo código rodasse em diferentes plataformas, sem a necessidade de modificações. Essa portabilidade teve um impacto significativo na programação moderna, facilitando o desenvolvimento de aplicações multiplataforma e contribuindo para a popularização de dispositivos móveis e aplicações web interativas.
## A Evolução do Java
Desde seu lançamento, Java passou por diversas atualizações e melhorias, sempre acompanhando as necessidades do mercado e das novas tecnologias.
Com o tempo, sua aplicabilidade se expandiu para além da web, se tornando essencial no desenvolvimento de sistemas corporativos, aplicações móveis (com o Android), dispositivos IoT, e até inteligência artificial e machine learning. Hoje, o Java é mantido pela Oracle Corporation, que adquiriu a Sun Microsystems em 2010.
### Principais Versões
* JDK 1.0 (1996): Versão inicial que estabeleceu as bases da linguagem.
* J2SE 1.2 (1998): Marcou a transição para a "Plataforma Java 2", introduzindo o Swing para interfaces gráficas e o Collections Framework.
* Java SE 8 (2014): Considerada uma versão de suporte a longo prazo (LTS), trouxe expressões lambda, a API Stream e a nova API de data e hora.
* Java SE 15: Introduziu classes ocultas e interfaces seladas, que controlam quem pode herdar classes e interfaces.
* Java SE 22: Evoluiu a linguagem para que os alunos possam escrever seus primeiros programas sem a necessidade de compreender os recursos da linguagem.
* Java SE 23: Aprimorou a linguagem e o ambiente de desenvolvimento.

## IDEs para desenvolvimento em Java
1. **Eclipse**: Lançada em 2001, possuindo como autor a IBM, sobre a licença EPL (Eclipse Public Licence), o Eclipse é uma IDE para desenvolvimento em Java que também suporta diversas outras linguagens apenas com a instalação de plugins (C/C++, PHP, Python, Kotlin, entre outras). O download do Eclipse poderá ser realizado em seu próprio site.
![](https://gdm-catalog-fmapi-prod.imgix.net/ProductScreenshot/ac8d616b-3c00-4bbd-8f10-ef14b62728df.png?auto=format&q=50)
### Vantagens
* Gratuito e de código aberto
* Suporte a múltiplas linguagens além de Java
* Extensibilidade por meio de plugins
* Grande comunidade e vasta documentação
### Desvantagens
* Pode ser mais pesado em comparação com outras IDEs
* Interface menos moderna do que concorrentes como IntelliJ IDEA
* Algumas configurações avançadas podem ser complexas para iniciantes
2. **NetBeans**: O NetBeans é uma IDE gratuita e de código fonte aberto para desenvolvimento Java, porém extensível para diversas outras linguagens, como PHP, Python, JavaScript, etc.
Lançada em dezembro de 2000, o NetBeans é uma das principais IDEs para o desenvolvimento Java. Inicialmente desenvolvido como um software proprietário, em 2010, ao ser adquirido pela Oracle, o NetBeans se tornou parte do ecossistema Java, alavancando ainda mais sua utilização e popularidade. IDE oficial para o desenvolvimento Java, seja ela Desktop ou Web. Em seu site é possível baixar o NetBeans, além de visualizar suas características.
![](https://filecr.com/_next/image/?url=https%3A%2F%2Fmedia.imgcdn.org%2Frepo%2F2023%2F11%2Fapache-netbeans%2F65658e1c80519-apache-netbeans-screenshot2.webp&w=1920&q=75)
### Vantagens
* Gratuita e de código aberto, com suporte oficial da Oracle.
* Multiplataforma: Podemos utilizar o NetBeans nos principais sistemas operacionais do mercado (Windows, Linux e macOS)
* Possui ferramentas integradas para desenvolvimento web, desktop e móvel
* Melhor suporte ao Java: Por fazer parte do ecossistema do Java, é a IDE oficial e recomendada pela própria Oracle
* Criação de interfaces: Possui suporte para criação de interfaces para aplicações web, desktop e mobile.
### Desvantagens
* Pode não ser tão rápida quanto outras IDEs, especialmente em projetos maiores.
* A disponibilidade de plugins é menor em comparação com o Eclipse.
3. **Intellij**: O IntelliJ IDE é uma das principais IDEs do mercado. Criada pela Jetbrains, uma empresa especializada no desenvolvimento de IDEs, o IntelliJ teve um crescimento impressionante nos últimos anos. O download do IntelliJ pode ser feito em seu site oficial. O IntelliJ possui duas versões, a “Ultimate” que possui diversos recursos, como ferramentas de bancos de dados, suporte nativo ao Spring e detecção de duplicidades. Já sua versão “Community”, um pouco mais limitada, porém completa o bastante para os principais desenvolvedores do mercado.
![](https://www.jetbrains.com/idea/whatsnew/2023-2/img/GitLab_Integration.png)
### Vantagens
* Oferece uma interface moderna e intuitiva, facilitando a navegação e o uso
* Possui recursos avançados de refatoração e suporte a diversas linguagens além de Java
* Possui um ótimo assistente de código, autocompletando trechos de sentenças para facilitar a criação de aplicações
* Suporte nativo ao Kotlin: Podemos desenvolver aplicações utilizando o Kotlin, linguagem baseada no Java criada pela própria Jetbrains
### Desvantagens
* A versão completa (Ultimate) é paga
* Requer mais recursos de hardware em comparação com outras IDEs

### Escolha de IDE para estudo
A escolha da IDE ideal depende das necessidades específicas e das preferências pessoais de cada desenvolvedor. Para iniciantes, o NetBeans pode ser uma boa opção devido à sua interface amigável e suporte oficial da Oracle. A Jetbrains disponibiliza assinaturas gratuitas da versão Ultimate do Intellij para estudantes, portanto, também pode ser uma boa opção pela quantidade de recursos oferecidos e a interface mais moderna.

## Programação Orientada a Objetos (POO)
A programação orientada a objetos (POO) em Java é uma abordagem de programação que organiza o código em objetos.
### Conceitos
1. Classe: É uma estrutura que define atributos (propriedades) e métodos (comportamentos) de um objeto. A classe funciona como um molde para criar objetos.
2. Objeto: É uma instância de uma classe. Quando criamos um objeto, estamos criando um elemento baseado na estrutura definida pela classe.
```
class Carro {
    String cor;
    String modelo;

    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();  // Objeto criado
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Sedan";
        meuCarro.acelerar();
    }
}
```
3. Encapsulamento: É a proteção dos dados do objeto, restringindo o acesso direto e permitindo a manipulação controlada através de métodos acessores (getters e setters).
```
class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```
4. Herança: É o mecanismo pelo qual uma classe herda atributos e métodos de outra classe. Promove o reuso de código.
```
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```
5. Polimorfismo: É a capacidade de um objeto assumir várias formas. Pode ser implementado através da sobrescrita (override) de métodos ou da sobrecarga (overload).
```
class Forma {
    void desenhar() {
        System.out.println("Desenhando uma forma.");
    }
}

class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Forma();
        Forma forma2 = new Circulo();
        forma1.desenhar();  // Saída: Desenhando uma forma.
        forma2.desenhar();  // Saída: Desenhando um círculo.
    }
}
```
## Mercado de Trabalho para Desenvolvedores Java
### Áreas de Atuação
O Java é amplamente utilizado em diversas áreas da tecnologia da informação: :​

* Desenvolvimento Web: Criação de aplicações web dinâmicas e escaláveis.​
* Desenvolvimento Mobile: Desenvolvimento de aplicativos para dispositivos móveis, especialmente com Android.​
* Back-end: Implementação de lógica de negócios e gerenciamento de dados em servidores.​
* Sistemas Corporativos: Desenvolvimento de soluções empresariais, como sistemas de gestão e ERPs.​
* Aplicações Científicas: Desenvolvimento de softwares para pesquisa e simulações científicas.

### Principais Tecnologias e Framworks Exigidos
As empresas podem exigir tecnologias e frameworks como Spring Framework, Spring Boot, JPA, Maven, Gradle, Git, GitHub, Docker, Kubernetes, entre outros, para programadores Java.

### Salário Médio
O mercado de trabalho para desenvolvedores Java no Brasil oferece salários que variam conforme o nível de experiência e a região. Segundo o Glassdoor:
* A média salarial de um desenvolvedor Java júnior no Brasil é de R$ 2.000 a R$ 3.000 por mês
* A média salarial de um desenvolvedor Java Pleno no Brasil é de R$ 6.000 a R$ 9.000 por mês
* A média salarial de um desenvolvedor Java Senior no Brasil é de R$ 6.000 a R$ 10.000 por mês


