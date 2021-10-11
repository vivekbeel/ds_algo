<!DOCTYPE test [
  <!ENTITY nbsp "&#160;">
  <!ENTITY ndash  "&#x2013;">
  <!ENTITY mdash  "&#x2014;" >
  <!ENTITY rsquo  "&#x2015;" >

]>

<html>
<head>
<title>Page Title</title>
</head>
<body>
      <#list headers as header>
      <b>${header.label}</b><br></br> <test> ${header.answer}</test><br></br><br></br>
    </#list>
</body>
</html>
