## String Manipulations: Maximum Number from the string

You are given an alphanumeric string S; extract the maximum numeric value from
that string.

<ins>**Note:**</ins>

- An alphanumeric string is a string containing alphabets as well as numbers.
- Alphabets will only be in lowercase.
- Print 0 if the string does not contain any number.
- The Extraction of a Number has to be from the adjacent numbers only. No
two alphabet-separated numbers can be combined to form a bigger number.

<ins>**Constraints**</ins>
2 <= |S| <= 20

<ins>**Input Format**</ins>
The first and only line consists of a String S.

<ins>**Sample Input**</ins>

100klh564abc365bg -- denotes S

<ins>**Sample Output**</ins>: 564

<ins>**Explanation**</ins>

Numbers extracted are: 100, 564, 365

The maximum number found in the string is "564". Hence, the answer is 564.
