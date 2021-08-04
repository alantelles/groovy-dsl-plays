# Groovy DSL plays

## SDL - Shapes declarative language

Neste repositório a ideia é propor uma linguagem declarativa para especificar formas geométricas e operações sobre elas.

O package `specs` contém as transformações e classes.

**shape_processor.groovy** é quem entende um "arquivo .shape" executa o mesmo de acordo com as descrições na classe.

Na pasta **shapes** estão alguns exemplos de formas.

## Uso:

`groovy shape_processor.groovy [caminho/da/forma.shape]`