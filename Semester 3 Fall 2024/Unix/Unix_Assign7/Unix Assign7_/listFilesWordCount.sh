#!/bin/bash

echo " Please enter the 3 files you would like to check "
	read filename1
	read filename2
	read filename3

echo " Echo please enter the word you would like to count in each line of the files. "
read word

lines1=`grep -c $word $filename1`
lines2=`grep -c $word $filename2`
lines3=`grep -c $word $filename3`

echo $lines1 $lines2 $lines3

Total=$(expr $lines1 + $lines2)
Total=$(expr $Total + $lines3)
Avg=$(( $Total / 3 ))

echo " Input: $filename1 $filename2 $filename3 "
echo " Word to search: $word "

echo " Total matching lines: $Total "
echo " Average matching lines per file: $Avg "
