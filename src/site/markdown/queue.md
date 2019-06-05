##Queue
> ![Queue Grundgedanke dargestellt durch Menschenschlange](./images/queue2.jpg)

#### Grundgedanke
> Eine Warteschlange ist eine dynamische Datenstruktur. Die auf dem FIFO-Prinzip basiert.
> Wenn auf Basis eines Arrays implementiert muss dies so geschehen das die Größe angepasst werden kann. Besonders effizient ist das mit dem Quarter-Half Algorithmus.
> Jedoch können die gespeicherten Elemente nur in der gleichen Reihenfolge wieder entnommen werden wie sie gespeichert wurden.
> Queue ist das Gegenstück zum Stack.
> Kann auch als Priority Queue implementiert werden sodass sich die Reihenfolge nach der Priorität richtet. Entweder HIFO (highest first out) oder LOFO (lowest first out).

#### Elementare Methoden
> ![Queue](./images/queue1.jpg)
>
> _**put**_
> Zum Hinzufügen von Elementen an das Ende Der Warteschlage.
>
> _**pop**_ 
> Zum Entfernen des Elementes das am Anfang der Warteschlange gespeichert ist.
>
> _**get**_ 
> Diese Methode gibt das Element am Anfang zurück ohne es zu entfernen. Sehr hilfreich für Abfragen


#### Vorteile
> Da stets nur das erste Element entfernt werden kann. Werden keine Ressourcen für das Suchen des jeweiligen Elements verbraucht.
>
> => Sehr effizient.
    
#### Nachteile
>   Kein Random Access

#### Anwendungen
> Überall wo das FIFO-Prinzip benötigt wird
>
> _**Beispiele:**_
> - Requesting Queuing bei Servern
> - Spotify Playlist
> - Job Scheduling

#### Links
> [Queue Dokumentation](http://www.it-academy.cc/article/1026/Grundlegende+Datenstrukturen:+Stacks,+Queues+&+Lists.html)

<skin>
<groupId>org.apache.maven.skins</groupId>
<artifactId>maven-fluido-skin</artifactId>
<version>1.5</version>
</skin>