# 02 - Building a system <!-- omit from toc -->

- [Introduzione](#introduzione)
- [Divide and conquer](#divide-and-conquer)
- [Considerazioni tecnologiche](#considerazioni-tecnologiche)
- [Metodo e processo](#metodo-e-processo)
  - [Software integration](#software-integration)
- [Effort extimation e scheduling](#effort-extimation-e-scheduling)
- [Assegnamenti e comunicazione](#assegnamenti-e-comunicazione)
- [Coding](#coding)
- [Testing](#testing)
- [Integrazione e test delle funzionalità](#integrazione-e-test-delle-funzionalità)
- [Rilascio del software](#rilascio-del-software)
  - [Educazione dell'utente](#educazione-dellutente)
  - [Team di supporto](#team-di-supporto)
- [Supporto e manutenzione](#supporto-e-manutenzione)
- [Coordination efforts](#coordination-efforts)
  - [Processi e metodologie](#processi-e-metodologie)
  - [Prodotti](#prodotti)
  - [Persone](#persone)

> [**Return to full index**](00%20-%20Index.md)

## Introduzione

Lo sviluppo di un sistema sta diventando complesso:

- **Incremento** del numero di **componenti** e della **complessità**;
- **Problemi di larghezza**: maggiori funzioni, funzionalità all'interno di ogni area, interfacce verso altri sistemi esterni, utenti simultanei, tipi di dati e strutture dati differenti.
- **Problemi di profondità**: condivisione dei dati o dei controlli, relazioni (gerarchia, sequenzialità, loop, ricorsività, ecc....).

> [!IMPORTANT]
>
> Un piccolo aumento dei compiti di un software spesso implica un grande aumento delle dimensioni di quest'ultimo.
>
> _Esempio_:
>
> 3 task:
> \
> ![small](resources\small.png)
>
> 5 task:
> \
> ![big](resources\big.png)

## Divide and conquer

Risulta essere conveniente suddividere una situazione complessa in parti più semplici, utilizzando la tecnica chiamata "**modularizzazione**", detta anche "divide and conquer", che consiste nella suddivisione del software in moduli più piccoli che si specializzano nella risoluzione di uno degli aspetti che andranno a comporre il prodotto finale.
Idee chiave per effettuare una semplificazione:

- **Decomposizione**.
- **Modularizzazione**.
- **Separazione**.
- **Iterazioni incrementali**.

> [!NOTE]
>
> I problemi di design non riguardano ancora questa fase. Ci troviamo ancora a un livello più concettuale.

## Considerazioni tecnologiche

La scelta dello specifico linguaggio di programmazione può diventare un problema nello sviluppo di grandi e complesse applicazioni.
\
Molti sviluppatori sono implicati nello sviluppo. Essi hanno avuto esperienze differenti, quindi avranno abilità diverse nell'uso di un certo linguaggio di programmazione o strumento di sviluppo.

Un problema comune è dunque la scelta del linguaggio e dell'ambiente di sviluppo.

Vi sono inoltre da considerare alcuni aspetti tecnici, come ad esempio la scelta del tipo di database, network, middleware, version control, ecc. da utilizzare.

## Metodo e processo

È necessario avere un metodo rigoroso nello sviluppo per garantire longevità al progetto ed efficienza nello sviluppo anche nel caso si decida di **programmare da soli**:

- Comprendere il problema e stabilire i **requisiti**.
- Definire il **design** e **implementarlo**.
- **Testare** l'applicazione, preferibilmente facendola provare anche agli utenti finali.
- **Documentare** il proprio lavoro per avere spiegazioni chiare reperibili in qualsiasi momento.

Lavorare da soli implica che tutto è sotto controllo di una sola persona, dunque tutti i problemi di comunicazione sono chiaramente esclusi. Tuttavia questo metodo non è realizzabile nel caso in cui ci si occupi dello sviluppo di un software molto grande, dunque si deve ricorrere necessariamente allo **sviluppo in team** dividendo il lavoro in task seguendo il seguente schema:

- Stabilire un insieme di **task** e una **sequenza di esecuzione** di esse.
- Definire gli **input** e gli **output** di ognuna delle task.
- Stabilire le **condizioni iniziali** e il **prodotto finale** di ognuna delle task del software.
- Aderire alla sintassi scelta per la formulazione del design e ai metodi di svolgimento delle task.

_Esempio_:

![process_and_methodology](resources\process_and_methodology.png)

Ogni task appare come un elemento indipendente e ognuna di esse ha come scopo la realizzazione dell'output richiesto tramite il metodo scelto in fase di progettazione.

Se più persone sono coinvolte nel compimento di una task, allora bisogna anche definire come il processo di svolgimento di quest'ultima deve essere suddiviso.

È importante anche stabilire una sequenza di svolgimento delle task per capire quali di esse possono essere eseguite in concomitanza con altre, dunque eventualmente di quali condizioni iniziali alcune di essere necessitano per poter iniziare a lavorare. Ad esempio, nessuno può iniziare a programmare se prima non sono stati raccolti i requisiti necessari e definite le linee guida e le specifiche per sviluppare il software correttamente.

### Software integration

![sviluppo_incrementale](resources\sviluppo_incrementale.png)

L'approccio mostrato adotta i concetti di **sviluppo incrementale** e **integrazione continua**.

La software integration è il processo di unire unità testate individualmente in un intero sistema coordinato.

**Continuous integration/Continuous deployment** (CD/CI): si tratta dell'estensione del processo di sviluppo del software incrementale per includere il rilascio rapido di una funzionalità completa tramite:

- **Integrare continuativamente** funzionalità completate all'interno del prodotto.
- **Distribuire** queste funzionalità agli utenti finali.
- Permettere agli utenti di **impiegare rapidamente** queste funzionalità.

> [!WARNING]
>
> La figura non include le attività di supporto e risoluzione dei problemi da garantire all'acquirente.

> [!WARNING] Test-fix-integrate cycle
>
> The **test-fix-integrate cycle** seems simple, but there are a lot of related problems instead:
>
> ![testing](resources\testing.png)

## Effort extimation e scheduling

Per progetti software piccoli che coinvolgono fino a 3 persone la stima del tempo impiegato e l'assegnazione dei compiti sono relativamente semplici.

Per i grandi sistemi invece stabilire e capire i requisiti può essere davvero complesso, tant'è che in passato molti progetti sono falliti proprio per questa ragione. Generalmente la stima del carico di lavoro necessario è ottimistica, quindi ciò genera **aspettative irrealistiche per gli acquirenti**.
\
Per le ragioni appena esposte è bene che i requisiti e l'effort extimation vengano fatte da **senior developers** dato che per svolgere questo compito serve avere una buona **consapevolezza** di tutte le funzionalità richieste e della produttività di coloro che sono coinvolti nello sviluppo; nonostante ciò, la probabilità di comprendere bene tutti i requisiti e di conoscere la produttività di tutti gli individi, quindi di fare effort extimation corrette, è bassa.

## Assegnamenti e comunicazione

Assegnare i compiti alle singole persone che fanno parte dello sviluppo è complicato perché bisogna conoscere le abilità di ognuna di esse, quindi ci si deve porre a un livello di granularità più profondo.

La comunicazione è fondamentale ed essa aumenta di molto la complessità per ogni membro che si aggiunge allo sviluppo, come si può vedere nell'illustrazione che segue:

![communication](resources\communication.png)

Chiaramente, all'aumento dei percorsi di comunicazione, la possibilità d'errore aumenta di conseguenza; ciò è un problema molto serio nello sviluppo software.

## Coding

I design di alto livello hanno bisogno di essere raffinati e convertiti in codice eseguibile. Per ognuno dei componenti di cui è stato realizzato il design, l'unità funzionale ha bisogno di essere strtturata e convertita in codice. Per ognuna di queste unità il programmatore deve indirizzare e sviluppare il seguente materiale:

- Un preciso layout della GUI in un certo linguaggio.
- Una precisa logica funzionale di elaborazione in un certo linguaggio.
- Una precisa logica di accesso e salvataggio dei dati in un certo linguaggio.
- Una precisa logica di interfaccia in un certo linguaggio.

Se ci sono più di una unità di programmazione, allora vanno definiti alcuni standards:

- Naming conventions per ogni modulo.
- Naming conventions per i dati.
- Convenzioni per la documentazione.
- Documentazione di come gestire le condizioni di errore.

## Testing

I moduli sono testati per confermare che essi portino a termine i compiti desiderati. Per fare ciò basta seguire alcune regole:

- Raggruppare le condizioni necessarie per l'esecuzione del modulo e scegliere i dati di input.
- Eseguire il modulo e osservare il suo comportamento, assicurandosi che l'output sia quello desiderato.

Testare il software è causa di attività molto intensa. Si pensi alla difficoltà nella verifica del corretto funzionamento di sistemi molti grandi composti da centinaia di moduli.

## Integrazione e test delle funzionalità

I moduli completati e le unità testate devono essere raccolti dai singoli programmatori. Questa operazione è detta "integrazione". La raccolta dei moduli testati è necessaria per non confondere quelli già testati con quelli da testare.

I moduli raccolti vengono poi compilati e uniti per operare come unità funzionale. Quest'ultima potrebbe essere a sua volta parte di un componente più grande.

A sua volta ogni modulo integrato viene testato con test cases procurati da un gruppo meno o per nulla coinvolto nello sviluppo.

> [!TIP] Test tools
>
> Generalmente nei sistemi molto grandi i test sono automatizzati da degli strumenti sviluppati apposta per svolgere solo questo incarico. Di conseguenza è necessario avere sviluppatori con conoscenze di ciò che è necessario per programmare, di come si effettua un design e di come si raccolgono i requisiti.

## Rilascio del software

Dopo che le unità funzionali sono state testate e integrate nei componenti, quest'ultimi devono essere testati insieme a loro volta per assicurarsi che il sistema funzioni nel suo complesso.
\
Prima del rilascio di un sistema, tutti i suoi problemi più rilevanti devono essere stati sistemati.

È fondamentale che il sistema testato e funzionante venga protetto da eventuali modifiche future che rischiano di compromettere il suo funzionamento.

### Educazione dell'utente

È altrettanto importante educare l'utente all'uso del software appena rilasciato, dunque potrebbe essere necessario lo sviluppo di materiale di formazione. Quest'ultimo non è semplice da fornire perché l'utente non deve fraintendere l'utilizzo del sistema, perciò servono persone con abilità nella comunicazione e nella divulgazione efficiace e chiara delle informazioni.

### Team di supporto

Si deve fornire all'acquirente supporto per gli utenti nel caso essi abbiano bisogno di aiuto relativo ad alcuni detagli del software e per raccogliere segnalazioni relative a bug o problemi di funzionamento del sistema.
\
Il personale di supporto deve essere stato formato sul funzionamento del sistema, l'ambiente con cui l'utente si interfaccia e gli strumenti necessari per fornire aiuto a chi ne ha bisogno.

## Supporto e manutenzione

Per i grandi sistemi il supporto dopo il rilascio è un servizio complicato. Ecco elencati alcuni dei fattori decisionali:

- Numero stimato di utenti e acquirenti.
- Numero e tipo di problemi esistenti del software al momento del rilascio.
- Numero di problemi che saranno scoperti dagli utenti.
- Quantità di utenti educati all'uso del software.
- Qualità della formazione del team di supporto.
- Numero di personale di sviluppo assegnato al supporto del sistema.
- Numero stimato di futuri rilasci di aggiornamenti riguardanti risoluzione di problemi e aggiunta di funzionalità.

Sono richiesti almeno due gruppi di personale di supporto con abilità distinte:
- Un gruppo per gestire problemi semplici relativi all'uso del software; per svolgere questo compito servono persone con buone capacità comunicative e una buona conoscenza del sistema.
- Un gruppo che si occupi di sistemare i problemi specifici ed implementi futuri miglioramenti; in questo gruppo sono inclusi designer e programmatori.

> [!NOTE]
>
> La complessità del personale di supporto può diventare paragonabile a quella del team di sviluppo per i sistemi molto grandi e complessi.

## Coordination efforts

Nello sviluppo bisogna considerare lo sforzo organizzativo che deve essere impiegato, tenendo conto della "regola delle 3 P":
- **P**rocessi e metodologie da impiegare.
- **P**rodotti finale e intermedi.
- **P**ersone (sviluppatori, team di supporto e utenti).

### Processi e metodologie

Negli anni sono stati fatti miglioramenti alla qualità del software tramite delle misurazioni degli sforzi e effettuando delle previsioni applicate allo sviluppo del software. Inoltre, è stata aumentata la produttività dei programmatori supportando gli strumenti software per lo sviluppo, come ad esempio gli IDE.

### Prodotti

Spesso si pensa al prodotto come il solo codice eseguibile, ma spesso sono necessari i documenti dei requisiti, la documentazione relativa ai test eseguiti, manuali d'uso per l'utente, ecc..

Gli utenti potrebbero chiedere i documenti di design o il codice sorgente per future modifiche. Per questo motivo il software deve essere sviluppato e strutturato considerando che deve poter essere modificato e mantenuto in modo relativamente semplice.

Il software deve essre protetto dalla deriva e dall'erosione del design causati da troppe modifiche.

### Persone

Per un software ampio è necessario un team di persone eterogeneo.
\
L'elemento umano è un elemento cruciale nello sviluppo e nel supporto del software, perciò l'ingegneria del software deve necessariamente includere lo studio dei problemi relativi alla coordinazione delle attività delle persone e della capacità di gestione e di comunicazione.
