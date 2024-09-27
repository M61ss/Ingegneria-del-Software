# 04 - Requirements engineering <!-- omit from toc -->

- [Introduzione](#introduzione)
- [Requirement engineering](#requirement-engineering)
  - [Requirements elicitation](#requirements-elicitation)
  - [Eliciting high-level requirements](#eliciting-high-level-requirements)
  - [Eliciting detailed requirements](#eliciting-detailed-requirements)
  - [Le sei dimensioni di requisiti](#le-sei-dimensioni-di-requisiti)
- [Clustering](#clustering)
- [Viewpoint-oriented requirements definition (VORD)](#viewpoint-oriented-requirements-definition-vord)
- [Prioritizzazione dei requisiti](#prioritizzazione-dei-requisiti)
- [Requirements traceability](#requirements-traceability)

> [**Return to full index**](00%20-%20Index.md)

## Introduzione

I requisiti sono definizioni guida che descrivono le necessità e i desideri dell'utente. Essi devono essere chiaramente e comletamente comprensibili dagli sviluppatori.

Una delle maggiori cause del fallimento dei progetti sta nell'incompletezza dei requisiti.

## Requirement engineering

Le seguenti attività sono parte del requirements engineering:

- Elicitation.
- Documentation and definition.
- Specification.
- Prototyping.
- Analysis.
- Review and validation.
- Agreement and acceptance.

Bisogna poi pianificare l'ordine di esecuzione di queste attività.

#### Requirements engineering processing <!-- omit from toc -->

![requirements_processing](resources\requirements_processing.png)

#### Requirements engineering activities <!-- omit from toc -->

![requirements_activities](/resources/requirements_activities.png)

Il piano deve essere rivisto e accordato tra tutte le parti coinvolte. Bisogna interagire con gli utenti e calendarizzare con flessibilità. Un buon analista dei requisiti ha delle buone capacità di comunicazione e conoscenze tecniche specifiche.

Una volta che la preparazione dei requisiti è terminata, inizia la fase di sviluppo di questi ultimi.

Ogni richiesta futura di modifica necessita di essere gestita tramite il processo di controllo di cambiamento per preventire il fenomeno detto "project scope-creeping problem".

Conseguenze negative della raccolta inefficiente dei requisiti:
- Non ci sono requisiti documentati su cui basarsi per testare.
- Non ci sono requisiti concordati per controllare lo scope-creep.
- Non ci sono requisiti documentati su cui basarsi per educare l'utente o coloro che forniranno supporto.
- Diventa difficile gestire la calendarizzazione del progetto e, conseguentemente, i costi senza una documentazione chiara dei requisiti.

### Requirements elicitation 

Per diventare analisti dei requisiti è necessario acquisire esperienza sullo sviluppo del software e conoscenza del dominio del business. 
\
Le abilità comunicative e la conoscenza dell'industria sono importanti nell'elicitazione dei requisiti dell'utente. Di conseguenza è necessario che l'analista dei requisiti abbia buone capacità di ascolto e interpretazione.

Ci sono due livelli di elictiazione dei requisiti:
- High level: capire la logica e le ragioni del business per il software.
- Low level: elicitare e raccogliere i dettagli che l'utente necessita e desidera.

L'elicitazione può avvenire in tre modi:
- Verbale.
- Scritta, dunque forma preformattata.
- Online.

> [!IMPORTANT] Versioni di preview
>
> Il cliente va coinvolto sempre nel processo di sviluppo del software, fornendogli delle versioni di preview di quest'ultimo affiché possa stabilire se soddisfa i requisiti o se sono necessarie delle modifiche.

### Eliciting high-level requirements

L'analista dei requisiti deve 

### Eliciting detailed requirements

Devono venire raccolti i requisiti di alto livello, quindi bisogna assumere analisti dei requisiti esperti dal punto di vista tecnico. Spesso gli utenti vengono coinvolti in una discussione riguardo a come risolvere un problema specifico.

Se il sistema esiste già, gli utenti possono basare la loro discussione sui requisiti su di esso. Di conseguenza, in questo caso sia utenti che analisti dei requisiti conversano riguardo questioni tecniche. Questo è definito livello di dettaglio. Le discussioni su questo genere di problemi è facile che perdano il controllo.

### Le sei dimensioni di requisiti

![six_dimensions](resources\six_dimensions.png)

Queste categorie certe volte potrebbero sovrapporsi.

## Clustering

Il clustering dei requisiti potrebbe seguire tutte le sei dimensioni mostrate nell'immagine precedente. Tuttavia, ciò non è unico il modo per effettuare il clustering: infatti, esistono altri standard che definiscono le categorie in cui raggruppare i requisiti da raccogliere, come ad esempio il modello FURBS+.

_Esempio_:

![clustering](resources\clustering.png)

## Viewpoint-oriented requirements definition (VORD)

L'ordine dei requisiti deve tenere conto del punto di vista. Infatti, chi programma ha una visione del software di coloro che lo utilizzeranno che, eventualmente, è a sua volta un'idea diversa da quella che aveva in mente chi ha commissionato lo sviluppo del sistema.

Per le ragioni appena elencate è importante che gli ingegneri del software facciano capire al cliente se ha bisogno di altri requisiti che, per esempio, potrebbero non essere di interesse di chi ha commissionato il software, tuttavia sarebbero necessari per chi lo utilizzerà.

## Prioritizzazione dei requisiti

Per gestire efficientemente il grado di importanza di un requisito bisogna agire in maniera analitica perché mettere d'accordo tutte le persone coinvolte nello sviluppo per sistemi di grande portata solo discutendone diventa davvero complicato.

Il metodo matematico si chiama Analitica Hierarchy Process (AHP). Esso assegna un valore di "intesità" basato sul confronto di ogni requisito con ognuno di tutti gli altri a coppie. Infine, si dispongono i requisiti in ordine decrescente.

![normalization](/resources/normalization.png)

Si costruisce una tabella e la si normalizza per colonne, ottenendo:

![prioritization](resources\prioritization.png)

I valori di intensità potrebbero, per esempio, essere definiti tramite delle votazioni.

## Requirements traceability


