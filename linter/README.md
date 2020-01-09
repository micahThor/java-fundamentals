# LAB 03 - LINTER

## Application Function
In Class *APP* I created a Javascript linter capable of returning an error message.  My method *javascriptLinter* takes in a file path and scans that file for missing semi-colons.  

My *hasError* method consumes one line of the input file at a time, and checks to see if that line is missing a semi-colon.  Conditions that will **not** cause a line without a semi-colon to fail include:
  - If the line is **empty**
  - If the line ends with a **";"**
  - If the line ends with a **"{"**
  - If the line ends with a **"}"**
  - If the line contains **"if"**
  - If the line contains **"else"**
  - If the line starts with **"//"**
  
If the input file contains errors, the *javascriptLinter* method will return a String with every line that is missing a semicolon.  Example of this output will appear in the console window as such:
```
Line 3: Missing semicolon.
Line 5: Missing semicolon.
Line 11: Missing semicolon.
Line 13: Missing semicolon.
Line 15: Missing semicolon.
Line 26: Missing semicolon.
Line 28: Missing semicolon.
Line 32: Missing semicolon.
...
...
...
```
