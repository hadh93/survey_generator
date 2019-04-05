grammar SurveyGenerator;

s   : ('!' title (NL)*) page+ ;
title : TEXT;
page : ('~' TEXT (NL)*) question+;
qtype : multi | single | textentry | number | date | upload | scale ;
question : '?' TEXT (NL)+ qtype (NL)*;
subquestion : '\t?' TEXT (NL '\t')+ qtype (NL)+;
multi : 'multi' ('%')? '[' TEXT (','TEXT)+ ']' NL ('>' TEXT NL (subquestion)+ )?; // optional dependency
single : 'single' ('%')? '[' TEXT (','TEXT)+ ']' NL ('>' TEXT NL (subquestion)+ )?; // optional dependency
textentry : 'textentry[' INTEGER ']' NL; // e.g. essay questions
number : 'number[' (INTEGER'|'INTEGER)? ']' NL; // optional min/max value
date : 'date[]' NL; // date method needs to be implemented when translating
upload : 'upload['( INTEGER | TEXT | INTEGER'|'TEXT )? ']' NL; // integer: file size, text: file type -> also needs to be implemented when translating
scale : 'scale[' TEXT '|' TEXT ']' NL; // text tokens example : highly dissatisfied / highly satisfied

NL : '\n' | '\r' ;
TEXT    : '"' [ 0-9a-zA-Z!@#$%^&*():;'"_]+ '"';
INTEGER : ('-')?[1-9](NUMBER)* | '0';

NUMBER   : [0-9] ;
WS      : [ ] -> skip ;
