/*

formatters formatting string format is
========================================
%[arg_index$][flags][width][.Precision]conversion char type
//herw we are specfying how args can be formatted internally 
//content in [] square brackets is optional
//here % and conversion char type is mandatory



flags
-----
  -		left alignment
  +		explicit +ve sign to the +ve numbers
  0		padding with 0 for all left un occupied places
		
  (		to enclose -ve number in the brackets
  ,		to grouping digits in a number



conversion char types
----------------------

byte, short, int, long ===> d
float, double ====> f
boolean		  ====> b
char		  ====> c
String		  ====> s