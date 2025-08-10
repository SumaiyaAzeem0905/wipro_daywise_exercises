package com.wipro.basic;

public class EnumEx17 {
public static void main(String[] args) {
	enum Month {
		Jan,
		Feb,
		Mar,
		Apr,
		May,
		Jun,
		Jul,
		Aug,
		Sep,
		Oct,
		Nov,
		Dec
};

Month month=Month.Feb;
if(month==Month.Feb)
{
System.out.println("February");
}

for(Month d:Month.values())
{
System.out.println(d);
}
}
}
