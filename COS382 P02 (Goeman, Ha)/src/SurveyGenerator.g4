grammar SurveyGenerator;

s   : ('!' title (NL)*) page+ EOF;
title : TEXT;
page : ('~' pagetitle (NL)*) question+;
pagetitle : TEXT;
qtype : multi | single | textentry | number | date | upload | scale ;
question : '?' questiontitle (NL)+ qtype (NL)*;
questiontitle : TEXT;
subquestion : '\t?' questiontitle (NL '\t')+ qtype (NL)+;
multi : 'multi' ('%')? '[' multiplechoiceoption (','multiplechoiceoption)+ ']' NL ('>' nestedchoice NL (subquestion)+ )?; // optional dependency
multiplechoiceoption : TEXT;
nestedchoice : TEXT;
single : 'single' (randomizer)? '[' singlechoiceoption (','singlechoiceoption)+ ']' NL ('>' nestedchoice2 NL (subquestion)+ )?; // optional dependency
randomizer : RANDOMIZER;
singlechoiceoption : TEXT;
nestedchoice2 : TEXT;
textentry : 'textentry[' maxlength ']' NL; // e.g. essay questions
maxlength : INTEGER;
number : 'number[' (minimum'|'maximum)? ']' NL; // optional min/max value
minimum : INTEGER;
maximum : INTEGER;
date : 'date[]' NL; // date method needs to be implemented when translating
upload : 'upload['( INTEGER | TEXT | INTEGER'|'TEXT )? ']' NL; // integer: file size, text: file type -> also needs to be implemented when translating
scale : 'scale[' minlabel '|' maxlabel ']' NL; // text tokens example : highly dissatisfied / highly satisfied
minlabel : TEXT;
maxlabel : TEXT;

NL : ('\r')? '\n' ;
TEXT    : '"' [ 0-9a-zA-Z!@#$%^&*():;'_?]+ '"';
INTEGER : ('-')?[1-9](NUMBER)* | '0';
RANDOMIZER : '%';

NUMBER   : [0-9] ;
WS      : [ ] -> skip ;
