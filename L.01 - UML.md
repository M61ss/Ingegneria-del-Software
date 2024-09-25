# L.01 - UML <!-- omit from toc -->

- [Introduzione](#introduzione)
- [Abstractions](#abstractions)
- [Models](#models)
  - [Qualità dei modelli](#qualità-dei-modelli)
- [UML](#uml)
  - [Utilizzi dell'UML](#utilizzi-delluml)
  - [Legal UML](#legal-uml)
  - [Il significato dell'UML](#il-significato-delluml)

> [**Return to full index**](00%20-%20Index.md)

## Introduzione

Un sistema è un insieme integrato formato da componenti che sono correlati l'uno all'altro e si influenzano a vicenda in modo da essere percepiti come una singola unità basata su task o scopo.

## Abstractions

I sistemi software sono basasti sul concetto di astrazione che rappresenta la possibilità di rendere eventi reali elaborabili da una macchina, che si suppone essere un calcolatore.

Astrazione significa "generalizzazione", lasciando da parte funzionalità specifiche.

## Models

I modelli sono astrazioni che ci consentono di descrivere i sistemi efficientemente ed elegantemente. Essi sono indipendenti dallo specifico periodo in cui devono realizzarsi o da uno scopo preciso.
\
Essi hanno tre caratteristiche fondamentali:

- Mapping: un modello è sempre un'immagine ddi qualcosa, una rappresentazione di fatti naturali o artificiali che possono essere a loro volta modelli essi stessi.
- Reduction: un modello non raggruppa tutti gli attributi della sua concretizzazione; riunisce solo quegli aspetti che paiono essere rilevanti al modellatore o per chi farà uso del modello.
- Pragmatismo: è necessario orientare lo sviluppo del modello verso l'utilità. Un modello viene creato per qualcosa di reale basandosi sulla seguenti domande: Per chi? Perché? Per cosa?

### Qualità dei modelli

Possiamo definire alcune metriche per stabilire la qualità di un modello:

- **Abstraction**: un modello è una rappresentazione ridotta del sistema che raffigura.
- **Understandability**: è importante presentare elementi il più intuitivamente possibili, per esempio tramite una notazione grafica. L'espressività di un modello è la capacità di esporre contenuti complessi con il minor numero possibile di concetti. Un modello è buono tanto più riduce lo sforzo mentale necessario per comprenderlo.
- **Accuracy**: un modello deve risaltare le proprietà rilevanti del sistema reale, riflettendo la realtà il più fedelmente possibile.
- **Predictiveness**: un modello deve predire delle proprietà non ovvie; ciò può essere fatto tramite simulazioni o analisi delle proprietà formali.
- **Cost-effecctiveness**: nel lungo termine deve essere più economico rispetto alla fase di modellazione del sistema.

## UML

L'**Unified Modeling Language** (UML) è una raccolta di notazioni grafiche utilizzate come supporto per la descrizione e il design di sistemi software. Questo linguaggio è stato realizzato usando lo stile object-oriented.

L'UML è uno standard relativamente aperto, controllato da Object Management Group (OMG), organizzazione formata per creare gli standard che supportano l'interoperabilità.

### Utilizzi dell'UML

Esistono tre modi in cui le persone utilizzano l'UML:
- Sketch: in questo caso il linguaggio viene impiegato solo come supporto per la comunicazione di alcuni aspetti del sistema, perciò il modello non cosistutisce una specifica completa. Può essere utilizzato sia per il forward che per il reverse engineering.

#### Esempio di diagramma UML <!-- omit from toc -->

![uml_sample](resources\uml_sample.png)

### Legal UML

### Il significato dell'UML
