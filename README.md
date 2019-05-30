# LAB REPORT 19-Abgabe04-Schuele
***
<table>
    <tr>
        <td>Name: </td>
        <td>Denis Schüle </td>
    </tr>
    <tr>
        <td>Abgabe: </td>
        <td>4</td>
    </tr>
    <tr>
        <td>URL: </td>
        <td>https://github.com/FaberDS/19-Abgabe04-Schuele</td>
    </tr>
</table>

***
## Vorgehen
#### 1.  To-Do-List übertragen mit MD vertieft
#### 2.  Bug Suche
   Bug-Suche begann mit dem sichten der StringQueue.java. Durch die augenfälligkeit der Bugs benötigte ich keine Klasse um die StringQueue.java zu testen.
   
> ##### 2.1 Construcor typing error & senseless variable
>   Ohne Konstruktor ohne Parameter wäre die private maxSize Variable sinnbefreit.
>   Der angepasste Code ermöglicht es eien maxSize zu übergeben. Wird jedoch kein Parameter übergeben wird die maxSize dieser Queue auf 5 gesetzt.
>
>**Problem**:
>
>![error_01 Konstruktor](./media/error_01.png "Constructor error")
>
> **Lösung**:
>
>`public StringQueue(){ this.maxSize = maxSize; }`
>
>`public StringQueue(int maxSize){ this.maxSize = maxSize;}`

> ##### 2.2 Equals 0
> Wenn die size() 0 retourniert soll ein Element gelöscht werden. Diese if Abfrage führt zu einer _IndexOutOfBoundsException_. 
>
>**Problem**:
>
>![error_01 Konstruktor](./media/error_02.png "Equals 0")
>
> **Lösung**:
> `public String poll() {
>		String element = peek();
>		if(elements.size() > 0){
>			elements.remove(0);
>		}
>		return element;
>	}`

> ##### 2.3 Assign to empty string
> Wenn dem element "" zugewiesen wird. Ist der return-Wert der Methode immer ""
>
>**Problem**:
>
>![error_01 Konstruktor](./media/error_03.png "empty string assignment")
>
> **Lösung**:
> `//element = "";`

#### 3. Java-Doc Kommentare
    Kommentieren der Klasse, des Interfaces und deren Methoden. 
    
>**Genutzt Assignments**:
>| Assignment    |   Bedeutung |
>| ---           |:---      |
>| @author       |   Autor     |
>| @since       |   Entstehungsdatum     |
>| @version       |   aktuelle Versionsnummer >    |
>| @see       |   Hinweise was auch beachtet >werden soll     |
>| @param       |   Um den Parameter an die >Methode zu spezifizieren     |
>| @return       |    Um den Rückgabewert der >Methode zu spezifiezieren     |
>| @exception      |   Wenn die Methode eine >Exception wirft     |
>| {@link "classname[#method name]"}       |   >Um einen Link zur Klasse/ Methode(optional) >zu setzen     |
>| @throws       |   Der Test wirft diese Exception     |

> **3.1 Eigene Tags**
>Um eigene Tags für die Java-Docs zu verwenden habe ich folgende Konfiguration innerhalb des Maven-Javadoc Plugins hinzugefügt:
>```xml
><configuration>
>    <tags>
>      <tag>
>           <!--@result is replaced true "Test assertion:"-->
>           <name>result</name>
>           <placement>a</placement>
>           <head>Test assertion:</head>
>        </tag>
>    </tags>
></configuration>
>```

> **3.2 Java-Doc Screenshot**
>![Java-Docs](./media/java_doc_productive_code.png)

#### 4. JUnit Test
Schreiben der Tests für die StringQueue Klasse.
>Um JUnit-Tests schreiben zu können muss im pom.xml folgende Dependency eingefügt >werden:
>```xml
><groupId>junit</groupId>
><artifactId>junit</artifactId>
><version>4.12</version>
><scope>test</scope>
>```
>Gesamt wurden 25 Tests auf die 5 Methoden der StringQueue Klasse angewendet. Dabei wurden die kritschen Punkte: leere Queue, Exceptions, volle Queue. Detailierter überprüft. Es wurde ein 100% line coverage erreicht, dies muss nicht zwingend immer erreicht werden.

> **4.1 Verwendete Methoden**
>   ```java
>       assert();
>       assertTrue();
>       assertFalse();
>       assertNull();
>       assertNotNull();
>       assertEquals();
>       assertNotSame();
>```
>   Um zu überprüffen ob die Methoden `remove()` und `element()`wie in den Testfällen gewünscht eine Exception werfen, wurde folgende Annotation verwendet:
>```java
>@Test (expected = Exception-Name.class)
>```

>**4.2 Surefire Report Screenshot**
>![Java-Docs](./media/surefire_report.png)

####5. Log4j2
Der Log4j2 ermöglicht das loggen während eine Java Application läuft.
Der Logger kann mittels .xml oder .properties File konfiguriert werden ich verwende letzteres.
>   **5.1 Vorraussetzungen**
>   Im main Ordner wird der resource Ordner mit dem Log4j2.properties File benötigt. 
>   _Erforderliche für pom.xml Dependencies:_
>```xml
><dependency>
>   <groupId>org.apache.logging.log4j</groupId>
>   <artifactId>log4j-api</artifactId>
>   <version>2.11.1</version>
></dependency> 
><dependency>
>   <groupId>org.apache.logging.log4j</groupId>
>   <artifactId>log4j-core</artifactId>
>   <version>2.11.1</version>
></dependency>
>```

>   **5.2 How to**
>   Sobald die Voraussetzungen erfüllt sind mittels
> ```java
>    private static final Logger LOGGER = LogManager.getLogger(Classname.class);
>```
>   Logger in der gewünschten Klasse instanzirenen und dabei den Klassennamen übergeben.
>   Der Log2f4 stellte einige Methoden zur Verfügung:
>   ```java
>       info()
>       error()
>       debug()
>       warn()
>       fatal()
>       trace()   
>```


>   **5.3 Logger Resultat**
> ![Consol Screenshot from the logged methods](media/log4j2_console.png)

***
## Links/ Literatur
### Plugins
- Markdown All in One 2.3.1 (für VS Code)
### Links
- [github Flavored](https://github.github.com/gfm/)
- [junit Artikel](http://www.tutego.de/blog/javainsel/2010/04/junit-4-tutorial-java-tests-mit-junit/)
- [maven tags](https://maven.apache.org/plugins/maven-javadoc-plugin/examples/tag-configuration.html)
- [tutorials-point Java-doc](https://www.tutorialspoint.com/java/java_documentation.htm)
- [How to write doc comments](https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html)
- [Syntax highlighting Markdown](https://support.codebasehq.com/articles/tips-tricks/syntax-highlighting-in-markdown)
- [Konfigurations Management Repository](https://github.com/michaelulm/software-configuration-management)
- [Log2f4 Tutorial](https://www.youtube.com/watch?v=YGG-_irDc5k)
### Documents

***
## To-Do-List:
 - [x] Übertragen Angabe Tasklist in Markdown Readme
 - [x] Einspielen Queue Vorlage aus Repository https://github.com/michaelulm/software-
configuration-management/tree/master/test-automation/Queue
 - [ ] Taskergebnisse Schritt für Schritt auf Git stellen
   - [ ] Führung Taskliste
   - [x] Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B. Testfälle geschrieben so wird auch in der Taskliste diese Aufgabe als erledigt markiert und Testfälle inkl. geänderter Taskliste ins Repository übertragen.
- [x] Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
    - [x] Es befinden sich gesamt 3 Fehler im Source Code
    - [x] Bei Bedarf Optimieren Sie das Queue Beispiel.
    - [x] Ergänzen Sie das Beispiel nach eigenen Ermessen um es testen zu können.

- [x] Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
    - [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
- [x] Erstellung JUnit Tests (vollständig testen, mehere Varianten)
    - [x] Sie werden die "selben" Testfälle mehrfach erstellen müssen um "mehrere Variationen" für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
    - [x] JavaDoc Kommentare erstellen.
    - [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
- [x] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren können.
    - [x] EntwicklerInnen Informationen hinzufügen.
    - [x] Integration Logging Bibliothek log4j mittels Maven Dependencies.
- [ ] Log4j(Version 2) integrieren und in jeder Methode ins Log schreiben
    - [x] Siehe aktualisiertes Stack Beispiel
    - [x] Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
    - [ ] Konfigurieren Sie Logger über ein properties File.
    - [ ] Geben Sie eine Info Lognachricht bei Aufruf einer jeden Methode aus.
    - [ ] Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
    Ergebnisse (Konsolenausgabe) als Bild in Dokumentation einfließen lassen.
- [ ] Maven Site Dokumentation erstellen
    - [ ] Inklusive Javadoc Code und Javadoc Test Klassen
    - [ ] Inklusive Menü mit Verweis auf manuell erstelle Seite
        - [ ] Seite erläutert Funktionsweise Queue
    - [ ] Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
        - [ ] Der Inhalt der manuell erstellten Seite sollte ersichtlich sein
- [ ] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
    - [x] Übertragung Information auf Labreport Template
    - [ ] Alle Schritte dieser Übung nachvollziehbar erläutern.
    - [ ] Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Python und 3 Zeilen Java Source Code korrekt darstellt.
    - [ ] Korrekturlesen Dokumentation
    - [ ] PDF erstellen (zB. Dillinger)