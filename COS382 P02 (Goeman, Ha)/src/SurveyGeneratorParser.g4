grammar SurveyGeneratorParser;

s   : ('!' title '\n') page+ ;
title : TEXT;
page : ('~' TEXT ('\n')?) question+;
qtype : multi | single | textentry | number | date | upload | scale ;
question : '?' TEXT ('\n')+ qtype ('\n')*;
subquestion : '\t?' TEXT ('\n\t')+ qtype ('\n')+;
multi : 'multi' ('%')? '[' TEXT ']\n' ('>' TEXT '\n' (subquestion)+ )?; // optional dependency
single : 'single' ('%')? '[' TEXT ']\n' ('>' TEXT '\n' (subquestion)+ )?; // optional dependency
textentry : 'textentry[' INTEGER ']\n'; // e.g. essay questions
number : 'number[' (INTEGER'|'INTEGER)? ']\n'; // optional min/max value
date : 'date[]\n'; // date method needs to be implemented when translating
upload : 'upload['( INTEGER | TEXT | INTEGER'|'TEXT )? ']\n'; // integer: file size, text: file type -> also needs to be implemented when translating
scale : 'scale[' TEXT '|' TEXT ']\n'; // text tokens example : least satisfied / highly satisfied

TEXT    : '"' [ 0-9a-zA-Z!@#$%^&*():;'"_]+ '"';
INTEGER : ('-')?[1-9](NUMBER)* | '0';

NUMBER   : [0-9] ;
WS      : [ ] -> skip ;
