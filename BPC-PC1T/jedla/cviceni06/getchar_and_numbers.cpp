// getchar_and_numbers.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include "solution.h"
#include <iostream>
#include <ctype.h>
#include<string.h>




int main()
{
	int a, b, c;
	char text[] = "Toto jsou 2 vzorove vety, ktere budou zpracovavany Vasemi funkcemi.Auto Hyundai ix35 ma pres 120 konskych sil.";
	char *str = text;
	a = alpha(str);
	b = numb(str);
	c = numb_of_word(str);
	printf("pocet pismen %d , pocet cisel %d a pocet slov %d", a , b , c);
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
