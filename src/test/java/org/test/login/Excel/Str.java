package org.test.login.Excel;

public class Str {
	public static void main(String[] args) {
	String s = "I am Hariraj";
	String[] s1 = s.split(" ");
	String rev = "";
	String rev1 ="";
	for (int i = s1.length-1; i >=0 ; i--) {
		rev = rev + s1[i];
		}
	System.out.println(rev);
	for (int i = rev.length()-1; i >=0 ; i--) {
		char c = rev.charAt(i);
		rev1=rev1+c;
		}
	System.out.println(rev1);

}}
