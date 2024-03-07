#include <iostream>
#include <cmath>
#include <string>

//New terms -> Protype 
//A line to tell the program 
using namespace std;

//Function recieves an int and returns twice that number 

int doubler(int input);
double halfer(double input);
void printHeader();
string makeCoords(double x, double y);
//{
//  int value;
//  value = 2*value;
//  return (value);
//}

double halfer(double input); //protype for a function we need to define


int main() {
  std::cout << "Playing with Functions\n";

  cout << "Enter a double number ";

  double number;
  cin >> number; 

  cout <<"Aah, great number: " << number << endl;

  cout <<"The square root of your number is " << sqrt(number) << endl;

  
  ////Test out our doubler function 

  cout << "Enter an integer that you want to multiply by two ";
  int myInt;
  cin >> myInt;

  //int doubledMyInt = doubler(myInt);

  cout << "Input number : " << myInt << " doubled is " << doubler(myInt);

  

  
  
}

int doubler(int input) //do not place a semi colon  
{
 input = 2*input;
return (input);
}

