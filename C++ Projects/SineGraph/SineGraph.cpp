//Matarr J.
//Spring EGR 126 // April 20,2022
//Graphing Sine (Rectangles)
using namespace std;
#include <iostream>
#include <istream>
#include <fstream>
#include <iomanip> //used for precision 
#include <cmath> //need cmath to do math library 
#include "mySVGlib.h"

//Protypes 
int randomColor(int min, int max);

//Declared Array
int rbg[3]; // will hold 3 random ints ranging from 0-255


int main() { //Starting Point of Int Main Method 

srand(time(NULL)); // psedeo random generator 


  
double widthSVGInput, heightSVGInput, rectangles; //it because you can't use an int only double 
double length, width, area, points, lengthh, summ, sum, x; 
  
cout << "Width of SVG? ";
cin >> widthSVGInput;
cout << "Height of SVG? ";
cin >> heightSVGInput; 

cout << "Number of rectangles? ";
cin >> rectangles; 
cout << "Rectangles :" << rectangles << endl; 


//double width1 = (M_PI)/rectangles;  //We took this out 
double width1 = widthSVGInput/rectangles;
width = 1/rectangles;
cout << width << endl;
length = sin(x); //height 
int rect = rectangles; // rect is just a int for rectangles 

double rightPoints[rect];
  double num=1;
   
  
  cout << "\n\n\n\n\n\n";
  
  
  for(int i=0; i<rect; i++)
    {
      
      rightPoints[i] = width*(i);
         
      cout << "Here are right points: (1/retangles " << "* width)  width=" << width << "   " << i << "  " << rightPoints[i+1] << endl;
      
      

      
    }
  
  
  
  startSVG(widthSVGInput,heightSVGInput); //header for svg file

  rectangle(0,0, widthSVGInput, heightSVGInput, "white" );  // white background screeen 
  
  cout << endl; // spacing within console 
 
  double rightSinPoints[rect]; //second array for calculating sin values
   

  

  

double SVGWidth, SVGHeight; 
//SVGWidth = widthSVGInput*(1-width);
SVGWidth = widthSVGInput + width;

SVGHeight =  heightSVGInput * (1-rightSinPoints[0]); //you have to put a multiplication simple , the complier does not recognize () as multiplication 

cout << "Width: " << width << endl;
cout << "Width1: " << width1 << endl;


    cout << "\n\n\n\n\n\n";
  

  

  
int num2=0;
for(int i = 0; i< rectangles; i++)
  {
  SVGHeight = heightSVGInput * (sin((M_PI/rectangles) * num2)  ); //SVGHeight is declared 
  cout << "SVG Height: " << SVGHeight << endl;
  num2++; // for the y values 
    
    
  }

  double SVGHeight1[num2];

 double width3= 1 / rectangles; //  1/rec 

  cout << endl << endl; 

  cout << "\n\n\n\n\n\n"; 
  
 double num3=0; //chagned from zero to 1
for(int i = 0; i< rectangles; i++)
  {
    SVGHeight1[i] = heightSVGInput * (sin((M_PI/rectangles) * i)  ); //scaled svg height 
    cout << "SVG Sin Height : " << SVGHeight1[i] << endl;
    
  }

  cout << "\n\n\n\n\n\n";
  
cout << "Num 3 Values: " << num3 << endl;
cout << "Num 2 Values: " << num2 << endl; 

   cout << "\n\n\n\n\n\n";
  
  double HeightInputMinusSVGSineHeightPoints[num2];
 
  
  for(int i = 0; i< rectangles; i++)
{
 HeightInputMinusSVGSineHeightPoints[i] = heightSVGInput - SVGHeight1[i]; 



} // end of for loop for Adjusted Points


  cout << endl << endl; // for console 
  
//Notes   width3 = 1/rectangles  -> is the perentage of the school 
  double enlargedSvgWidth = width3 * widthSVGInput; // enlargedSvgWidth   

  cout << "\n\n\n\n\n\n";
  
  double widthEndpoints[rect];

  for(int i=0; i<rectangles; i++)
    {
      widthEndpoints[i] = i * enlargedSvgWidth; //x values for rect
    }
  
  double SVGheightMinusSinValues[rect];
  for(int i = 0; i< rectangles; i++)
    {
        
      SVGheightMinusSinValues[i] = heightSVGInput - HeightInputMinusSVGSineHeightPoints[i];
      cout << "SVGheightMinusSinValues -> "  << SVGheightMinusSinValues[i] << endl; 
    } //second to last for loop 


  cout << "\n\n\n\n\n\n";  // spacing in the console 

for(int i=0; i<3; i++) 
{
  rbg[i] = rand()%256; //  int values 0-255
} 
  
for(int i=0; i<rectangles; i++)   //  for loop for translating triangles 
{

rbg[0] = rand()%256;
rbg[1] = rand()%256;
rbg[2] = rand()%256;
rectangle2( enlargedSvgWidth * (i)  , HeightInputMinusSVGSineHeightPoints[i], enlargedSvgWidth , SVGheightMinusSinValues[i], rbg[0], rbg[1], rbg[2] );


  
} 
 

  
  

  
  

  
  
  
  endSVG(); // ending syntax for svg file
  
  
  }


