# ProjetoFX2 — Zoológico

Simulador de zoológico com interface gráfica em **JavaFX**, desenvolvido durante o curso **Programação Oracle - Java Foundations**, certificado pelo SENAI-SP — dando sequência ao que foi construído no [ProjetoFX01](https://github.com/LucasPereirax/ProjetoFX01).

O projeto foi pensado pra praticar **herança e polimorfismo** de forma bem concreta: existe uma classe base `Animal`, e cada animal específico (`Cachorro`, `Gato`, `Macaco`, `Vaca`) estende essa classe e tem seu próprio comportamento — inclusive **emitindo seu próprio som** ao ser selecionado na interface.

## Como funciona

A tela principal (`main-view.fxml`) dá acesso à tela do zoológico (`zoologico-view.fxml`), onde o usuário pode selecionar um animal. Cada classe de animal (`Cachorro`, `Gato`, `Macaco`, `Vaca`) herda de `Animal` e sobrescreve o comportamento de emitir som, reproduzindo o arquivo de áudio correspondente (`cachorro.mp3`, `gato.mp3`, `macaco.mp3`, `vaca.mp3`).

## Conceitos praticados

- Herança e polimorfismo (classe base `Animal` + subclasses)
- Criação de telas e componentes gráficos com JavaFX
- Reprodução de áudio integrada à interface
- Organização em camadas: `controller/` e `model/`

## Tecnologias

- Java
- JavaFX
- CSS (estilização das telas)
- Maven

## Estrutura do código

```
ProjetoFX2/
├── src/main/
│   ├── java/com/senai/
│   │   ├── controller/
│   │   │   ├── MainController.java
│   │   │   └── ZoologicoController.java
│   │   ├── model/
│   │   │   ├── Animal.java          # classe base
│   │   │   ├── Cachorro.java
│   │   │   ├── Gato.java
│   │   │   ├── Macaco.java
│   │   │   └── Vaca.java
│   │   └── MainApp.java
│   └── resources/com/senai/
│       ├── sons/                     # cachorro.mp3, gato.mp3, macaco.mp3, vaca.mp3
│       ├── styles/zoologico.css
│       ├── main-view.fxml
│       └── zoologico-view.fxml
└── pom.xml
```

## Rodando o projeto localmente

```bash
git clone https://github.com/LucasPereirax/ProjetoFX2.git
cd ProjetoFX2
mvn compile exec:java
```
