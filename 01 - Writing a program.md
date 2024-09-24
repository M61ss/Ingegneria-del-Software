# 01 - Writing a program <!-- omit from toc -->

- [Introduzione](#introduzione)
- [Requirements](#requirements)
- [Design constraints](#design-constraints)
- [Testing](#testing)
- [Effort extimation](#effort-extimation)
  - [Subtask division](#subtask-division)
- [Implementation details](#implementation-details)
- [Riassunto](#riassunto)

> [**Return to full index**](00%20-%20Index.md)

## Introduzione

Prima di iniziare a scrivere un prorgamma è necessario organizzare il proprio lavoro secondo le seguenti linee guida:

- Determinare i requisiti (**requirements**): vincoli che definiscono e qualificano che cosa il programma deve fare.
- Stabilire i vincoli di design (**design constraints**): necessità che stabiliscono quali vincoli il software deve rispettare nell'implementazione.
- Testare (**testing**).
- Stimare il tempo (**effort extimation**) necessario per la produzione.
- determinare i dettagli implementativi (**implementation details**).

## Requirements

I requisiti possono essere di due tipologie:

- **Funzionali**: definiscono che cosa il software deve fare.

  _Esempi_:

  Alcuni esempi di requisiti funzionali possono essere: formato dell'input, sorting, casi particolari da gestire, limitazioni e condizioni di errore da gestire.

- **Non funzionali**: stabiliscono come il software deve soddisfare i requisiti
  funzionali.

  _Esempi_:

  Alcuni esempi di requisiti non funzionali possono essere: performance, tempo in cui il software deve produrre l' output, modificabilità del software, longevità del software.

> [!TIP]
>
> Chiaramente, è possibile che ci sia talvolta sovrapposizione tra queste che categorie o che i requisiti non funzionali spesso coincidano con alcuni vincoli di design.

A loro volta i requisiti di entrambe le tipologie si suddividono in:

- Necessari (**needed**).
- Negoziabili (**nice-to-have**).

> [!IMPORTANT] Importanza dei requisiti
>
> I requisiti sono importantissimi perché sono i più difficili da stabilire e, proprio per questo motivo, sono i più soggetti ad errare, quindi portano con sè la maggia parte dei problemi correlati alla produzione di software.

## Design constraints

Alcuni esempi di design constraints che coincidono con requisiti non funzionali sono: user interface, tipica e massima dimensione dell'input, piattaforme su cui il software verrà utilizzato, requisiti di tempistica.

Invece, esempi di puri design constraints sono: linguaggio di programmazione, framework, algoritmi, struttura del software.

## Testing

Il testing **deve essere effettuato mentre il programma viene sviluppato** e dopo che è stato completato sia tramite codice di test sia con l'utilizzo del programma come utenti.

Esistono due tipi di metodi di testing:

- **Black box**: non si conosce il codice del software, quindi l' unica cosa che si può verificare è che esso rispetti i requisiti utilizzandolo da utenti;
- **White box**: conoscendo il codice è possibile verificare anche che siano rispettati i design constraints.

È importante distinguere due operazioni di testing:

- **Verifica**: fase di testing in cui ci si assicuri che il software funzioni correttamente dal punto di vista tecnico;
- **Validazione**: fase in cui si verifica che il software rispetti i requisiti
  richiesti dal cliente.

## Effort extimation

È uno degli aspetti più importanti di un progetto software. È molto difficile, infatti nell'80% dei casi la stima fornita è errata.

Le tipiche domande che ci si pone sono:

1. Quanto tempo è necessario per implementare la soluzione software richiesta?
2. Quanto è il costo complessivo in termini di orari di lavoro del personale necessario per portare a termine il progetto?

### Subtask division

Conviene **suddividere il software in subtask elementari** così da stimare il tempo necessario per realizzare ognuna di questa, quindi sommando tali stime ottenerne una complessiva il più accurata possibile.
\
Successivamente, siccome il tempo stimato è di tipo continuo, è necessario calendarizzarlo così da poter comunicare al cliente il periodo stimato necessario per la realizzazione del software.

## Implementation details

Ci sono alcune convenzioni da stabilire per coordinarsi al meglio con il proprio team o chiunque altro manipolare il codice sorgente:

- **Naming/Programming conventions**: i nomi devono essere descrittivi e devono seguire le naming conventions del linguaggio di programmazione scelto. I nomi degli oggetti che hanno visibilità globale è meglio che siamo lunghi e descrittivi, mentre possono essere brevi quelli di riferimenti locali.
- **Test-before-use**.
- **Conoscere la libreria standard**: non riscrivere codice se esiste già una liberia ampiamente testata che ottiene lo stesso risultato senza incidere sulle performance richieste;
- **Ricontrollare sempre il codice**.

Un importantissimo design di base è quello di tenere sempre separate l'implementazione delle funzionalità da quella della GUI.

Quanto al testing in Java, la norma prevede di utilizzare **JUNIT** come libreria per il testing sfruttando la proprietà Java reflection.

## Riassunto

Rivediamo la procedura riassunta per punti:

1. Capire il problema: **requisiti**:

   - Funzionali;
   - Non funzionali.

2. Stabilire il **design**:

   - Organizzare le funzionalità secondo una certa sequenza con l'ausilio di diagrammi.
   - Concentrarsi su input e output.
   - Tenere conto dei vincoli.
   - Scegliere gli algoritmi.

3. **Implementazione**: trasformare il design in codice effettivo.
4. **Verifica e validazione**.
5. Stimare i **costi di tempo**, quindi economici.

![writing_a_program](resources\writing_a_program.png)
