# Bolonha e Milano

Projeto escolar de um jogo de estratégia econômica medieval,
desenvolvido em Java na disciplina SPOTDES.

## Etapa atual

Etapa 2 — Classes Jogador e Cidade.

## Funcionalidades implementadas

- Menu principal com quatro opções:
  - 1: Novo jogo.
  - 2: Ver status da cidade.
  - 3: Sobre o jogo.
  - 0: Sair.
- Tratamento de opções inválidas.
- Criação de jogador com nome e título inicial "Cavaleiro".
- Criação de cidade com nome, governante e ano inicial 1400.
- Exibição do status inicial ao criar um jogo.
- Consulta ao status da cidade pelo menu.
- Aviso ao consultar o status sem iniciar um jogo.
- Diagrama de classes cumulativo na pasta uml/.
- Diagrama de casos de uso na pasta casos-de-uso/.

O método avancarAno() está implementado, mas ainda não é
utilizado pelo menu.

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