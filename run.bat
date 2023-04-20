@echo off

rem Compile Java code
javac *.java

rem Normal case
echo Testing normal case...
java main normal.arxml

rem Not valid Autosar file case
echo Testing not valid Autosar file case...
java main notvalid.html

rem Empty file case
echo Testing empty file case...
java main empty.arxml

pause
