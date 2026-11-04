# Bolonha e Milano

Projeto escolar de um jogo de estratégia econômica medieval,
desenvolvido em Java na disciplina SPOTDES.

## Etapa atual

Etapa 3 — Economia: florins, terras e grãos.

## Funcionalidades implementadas

- Criação de jogador e cidade.
- Título inicial do jogador: Cavaleiro.
- Ano inicial da cidade: 1400.
- Recursos iniciais:
  - 1000 florins.
  - 10000 hectares de terras.
  - 500 unidades de grãos.
- Consulta ao status da cidade.
- Mercado com compra e venda de grãos e terras.
- Validação de quantidades e de recursos disponíveis.
- Proteção contra saldos negativos e estouro dos recursos do tipo int.
- Submenu de mercado que permite realizar várias operações.
- Diagramas cumulativos de classes e casos de uso na pasta uml/.

## Preços adotados nesta implementação

O material exige preços fixos, mas não especifica seus valores.

- Grãos: 2 florins por unidade.
- Terras: 10 florins por hectare.

Os preços de compra e venda são iguais e ficam definidos nas
constantes PRECO_GRAO e PRECO_TERRA da classe Mercado.

## Organização

- src/bolonhaemilano/: código-fonte Java.
- uml/: diagramas de classes e casos de uso.
- bin/: arquivos compilados, ignorados pelo Git.

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