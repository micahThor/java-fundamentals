# LAB 03 - LINTER
--
## Application Function
In Class *APP* I created a Javascript linter capable of returning an error message.  My method *javascriptLinter* takes in a file path and scans that file for missing semi-colons.  

My *hasError* method consumes one line of the input file at a time, and checks to see if that line is missing a semi-colon.  Conditions that will not cause a line without a semi-colon to fail include:
  - If the line is empty
  - If the line ends with a ";"
  - If the line ends with a "{"
  - If the line ends with a "}"
  - If the line contains "if"
  - If the line contains "else"
  - If the line starts with "//"
