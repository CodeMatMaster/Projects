//Matarr J.
// EGR 126 Spring 2022  
//Play with While Loops

//What is a C string ?

 
#include <cmath>
#include <string>
#include <iostream>
using namespace std;
int main() {
  std::cout << "Hello World!\n";
 /// Prorpt the user to respond yes or no
  string answer;
  cout << "Question...... yes or no" ;
  cin >> answer;
 //C string -> Array of Characters
  while(answer!="yes" && answer!="no") //boolean expression 
  {
    cout << "yes or no?  ";
    cin >> answer;
  }
  
  
  
  
  int count =1000;
  while(count > 0)
    {
      cout << count << endl;
      count--; //C++ shortcut for count = count -1  decomerates it
    } //End of While Loop
}