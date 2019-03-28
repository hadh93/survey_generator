grammar SurveyGeneratorParser;

s   : ('!' title '\n') page+ ; // FIXME: Would newline work?
title : TEXT;
page : ('~' TEXT ('\n')?) question+;
qtype : multi; //| single | upload | scale | text_entry | number | date ;
question : '?' TEXT '\n' qtype;
multi : ('multi' ('%')? '[' TEXT ']\n' ('>' TEXT '\n' ('\t' question)+ )? );

TEXT    : '"' [ 0-9a-zA-Z!@#$%^&*():;'"_]+ '"';
INTEGER : ('-')?[1-9](NUMBER)* | '0';

NUMBER   : [0-9] ;
WS      : [ \r] -> skip ;
