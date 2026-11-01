# Bolonha e Milano

Projeto escolar de um jogo de estratégia econômica medieval,
desenvolvido em Java na disciplina SPOTDES.

## Etapa atual

Etapa 1 — Estrutura inicial, Main e menu.

## Funcionalidades implementadas

- Menu principal com três opções:
  - 1: Novo jogo.
  - 2: Sobre o jogo.
  - 0: Sair.
- Tratamento de entradas inválidas.
- Repetição do menu até a escolha da opção 0.
- Separação de responsabilidades entre Main e Menu.

A opção Novo jogo exibe uma mensagem provisória.
A criação do jogo será implementada na Etapa 2.

## Requisitos

- JDK 17.
- Terminal aberto na pasta raiz do projeto.

## Como compilar

```bash
javac -encoding UTF-8 -d bin src/bolonhaemilano/*.java
```

## Como executar

```bash
java -cp bin bolonhaemilano.Main
```

## Organização

- src/bolonhaemilano/: código-fonte Java.
- casos-de-uso/: diagramas de casos de uso.
- uml/: diagramas de classes.
- bin/: arquivos compilados, ignorados pelo Git.