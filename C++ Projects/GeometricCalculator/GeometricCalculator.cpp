//Matarr J.
//EGR 126 Section 5 Spring 2022
//Geometric Calculator

/* Personal Side Notes 
double has twice as many bits as a float 
enginerring calcuation want to use double 
Permeter is the distance all the way around
area is l*h
*/

/* Unused Code 
double yy = pow((bY-aY), 2);
double xx = pow((bX-aX), 2);
double finalcal = sqrt(xx+yy);
*/

#include <iostream>
#include <cmath>


int main() {
  using namespace std;

  
  cout << "Matar's Geometric Calculator " << endl;
  cout <<"*******************************" << endl;

  
  //Coordinate Values should be stored in double variables.   
  double aX;
  double aY;
  double bX;
  double bY;
  double distance; // need formula for distance formula

  
  
  double formula;

  formula = sqrt(pow((bY-aY),2) + pow((bX-aX),2 )) ;
  
  distance = (bX-aX) + (bY-aY); //assigned the variable "distance" 
 
  
  
  std::cout << "\n\n\nPlease enter the x coordinate for Point A: " ;
  cin >> aX; 
 // cout << aX << endl;

  cout << "\n\n\nPlease enter the y coordinate for Point A: " ;
  cin >> aY;
  //cout << aY << endl;

  cout << "\n\n\nPlease enter the x coordinate for Point B: " ;
  cin >> bX;

  cout << "\n\n\nPlease enter the y coordinate for Point B: ";
  cin>>bY;
 // cout << bY << endl;
  
 formula = sqrt(pow((bY-aY),2) + pow((bX-aX),2 )) ; //where you place you the distance formula (or any formula for that matter) does matter in the code

  cout << "\nThe distance between (" << aX  << "," << aY << ") and (" <<bX <<"," << bY << ")" << " is " << formula << endl;

//Rectangle Code
  cout << "The rectangle with coordinates: " << endl;

  double yDifference = bY-aY; 
  
  cout << "(" << aX << "," << aY << ") \t";
  cout << "(" << aX << "," << aY+ yDifference << ") \t";
  cout << "(" << bX << "," << bY << ") \t";
  cout << "(" << bX << "," << bY- yDifference << ") \t" << endl;

//second coordinates minus first coordinates entered from keyboard
double length;
length = (bX-aX); 
  
double width;
width = (bY-aY);

double perimeter;
perimeter = (abs(length)+ abs(width) +abs(length) + abs(width)); //i cannot multply an int by a double 

double area = (abs(length)*abs(width)); //use abs to find the magitude of the area
  
  cout << "has a width of: " << abs(width) << endl;
    cout << "has a height of: " << abs(length) << endl; //length is the horizontal measurement in a plane
 cout<< "has a perimeter of: " << perimeter << endl;
  cout<< "has an Area of: " << area << endl << endl;

cout << "The Circle with points A and B at ends a diameter: " << endl;

  double xDifference;
  xDifference = (bX-aX);


  double center;
  double xCenter = (abs(xDifference)/2) ; //delclare your identifier

  double yCenter =(abs(yDifference)/2); 

 double  radius = sqrt(pow((xCenter),2) + pow((yCenter),2 )) ; //do not need to do abs here the radical is being raised to a power of 2.

  double diameter = radius*2;
  double circleCircumference = M_PI * radius * 2;
  double circleArea = M_PI * radius * radius;
  cout << "has its center at: ("  <<  xCenter << "," << yCenter << ")" << endl;
  
cout << "has a radius of: " << radius << endl;
cout << "has a diameter of: " << diameter << endl;
cout << "has a circumference of: " << circleCircumference << endl;;
cout <<"has an area of: " << circleArea <<endl;
  
   
}