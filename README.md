#Wicket Kickoff

**Minikurs i Wicket**


## Agenda

+ Om Wicket
+ Hello World
+ Komponenter
+ Testing
+ Sengelektyre

-------------------------------------------------

## Om Wicket

+ __Komponentbasert Web-rammeverk.__ Dynamisk innhold i markupen har en tilhørende Java-klasse, alt fra enkeltstående tekst
  ([`Label`](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/basic/Label.html))
  til ulike paneler
  ([`Panel`](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/panel/Panel.html))
  på en side
  ([`WebPage`](http://wicket.apache.org/apidocs/1.4/org/apache/wicket/markup/html/WebPage.html))

+ __Skiller presentasjon og logikk.__ Sider designes i ren HTML. Innhold bindes til markup
  v.h.a. et attributt, definert i et eget XML-namespace.
  
+ __Stateful.__ State håndteres transparent (som det så fint heter) v.h.a. standard
  serialisering. Komponenter og deres innhold må implementere `Serializable`.
  


## Hello World

## Sengelektyre

1. Wicket javadocs: http://wicket.apache.org/apidocs/1.4/
