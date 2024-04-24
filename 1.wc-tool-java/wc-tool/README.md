##This challenge corresponds to the first part of the Coding Challenges series by John Crickett https://codingchallenges.fyi/challenges/challenge-wc.

**Description**
The WC tool is written in cc_wc.java file.
The tool is used to count the number of words, lines, bytes and characters in a file.

**Usage**
You can use windows cmd to run the tool as follows:

```cmd
coding-challenges\wc-tool_java\wc-tool\src> java .\cc_wc.java [option] filename

The following options are supported:

-w: prints the number of words in the file
-l: prints the number of lines in the file
-c: prints the number of bytes in the file
-m: prints the number of characters in the file

If no option provided, the system will return byte, word and line count by default.
If no file is provided as input, the system will consider default file "test.txt" present in 'wc-tool_java' folder.
