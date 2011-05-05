# Wicket Kickoff





# Om Wicket

+ __Komponentbasert Web-rammeverk.__ Dynamisk innhold i markupen har en tilhørende Java-klasse, alt fra enkeltstående tekst
  ([`Label`](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/basic/Label.html))
  til ulike paneler
  ([`Panel`](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/panel/Panel.html))
  på en side
  ([`WebPage`](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/WebPage.html))

+ __Skiller presentasjon og logikk.__ Sider designes i ren HTML. Innhold bindes til markup
  v.h.a. et attributt, definert i et eget XML-namespace.
  
+ __Stateful.__ Tilstand håndteres transparent (som det så fint heter) v.h.a. standard
  serialisering. Komponenter og deres innhold må implementere `Serializable`.

  


# Hello World

[github.com/runeflobakk/wicket-kickoff/tree/helloworld](https://github.com/runeflobakk/wicket-kickoff/tree/helloworld)
Minimalt prosjekt som inneholder:

- Wicket webapp med 1 side med 1 tekstkomponent
- web.xml konfigurasjon
- Embedded Jetty for testing av applikasjon


# Livssyklus

[github.com/runeflobakk/wicket-kickoff/tree/livssyklus](https://github.com/runeflobakk/wicket-kickoff/tree/livssyklus)

Wicket oppretter ny instans av en WebPage når man går til en URL i en browser.
Denne instansen er kun for gjeldende sesjon. Komponenter og innhold legges til i
siden i konstruktøren.

Problem: Man går til samme instans av en side på et senere tidspunkt, men data har
endret seg siden den ble instansiert. Eks visning av brukerprofil

Løsning: Wicket bruker
[modeller](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/model/IModel.html)
for å "referere" til objekter som er grunnlaget for data til komponenter.


# Komponenter

[github.com/runeflobakk/wicket-kickoff/tree/komponenter](https://github.com/runeflobakk/wicket-kickoff/tree/komponenter)

- [Label](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/basic/Label.html)
- [RepeatingView](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/repeater/RepeatingView.html), [ListView](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/list/ListView.html)
- [TabbedPanel](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/extensions/markup/html/tabs/TabbedPanel.html)


# Testing

[github.com/runeflobakk/wicket-kickoff/tree/testing](https://github.com/runeflobakk/wicket-kickoff/tree/testing)

Testing av Wicket-sider og enkeltkomponenter kan gjøres med
[WicketTester](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/util/tester/WicketTester.html).
Dette kan ses på som "lette" webtester. Man får testet bl.a.

- binding mellom kode og markup
- sideinnhold
- navigering, klikking (inkl. AJAX-oppførsel)



# Sengelektyre

1. Wicket javadocs: [wicket.apache.org/apidocs/1.4/](http://wicket.apache.org/apidocs/1.4/)
2. web.xml configuration: [www.zwiep.net/apache-wicket-web-xml.html](http://www.zwiep.net/apache-wicket-web-xml.html)
3. Wicket's XHTML tags: [cwiki.apache.org/WICKET/wickets-xhtml-tags.html](https://cwiki.apache.org/WICKET/wickets-xhtml-tags.html)
4. Examples: [cwiki.apache.org/WICKET/how-to-do-things-in-wicket.html](https://cwiki.apache.org/WICKET/how-to-do-things-in-wicket.html)
