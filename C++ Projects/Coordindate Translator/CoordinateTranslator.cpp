/*
Mat J
EGR 126
2/14/2022
This is a program that will convert any cartesian points between 
-250 through 250 to its coresponding SVG coordinate (on a 500 by 500 plane).
*/
#include <iostream>
using namespace std; 

int main() {
  cout << "                     Mat J's' Coordinate Translator\n\n";
  int xCoord; //x-coordinate variable.
  int yCoord; //y-coordinate variable.
  cout << "Enter your Cartesian point x-value: "; //prompting the user for x-value.
  cin >> xCoord; //assigning the user input to the x-coordinate.
  cout << "\nEnter your Cartesian point y-value: "; //prompting the user for y-value.
  cin >> yCoord; //assigning the user input to the y-coordinate.
  cout << endl << endl;
  cout << "Cartesian Points: " << "(" << xCoord << "," << yCoord << ")\n\n"; //formating user input for cartesian point.
  xCoord=xCoord+250; //converting the cartesian x-coordinate to SVG x-coordinate.
  yCoord=250-yCoord; //converting the cartesian y-coordinate to SVG y-coordinate.
  cout << "SVG Points: " << "(" << xCoord << "," << yCoord << ")"; //formating the new SVG coordinates.
}