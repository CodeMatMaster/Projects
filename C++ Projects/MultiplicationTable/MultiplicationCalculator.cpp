//Matarr J. March 3, 2021
//EGR 126 Section 5
//Multiplication Calculator 

//You should have one loop inside the other where one loop is keeping up with the row value and the other loop is keeping up with the column value.

/* Saved Code
 if(r==10) //use == to compare
      {
        //cout << setw(3) << c*r << " |";
        cout << " " << c*r  << "|"<< setw(3);
      }     
      else
      {
        cout << setw(3) << c*r << " |";
      }



  */
using namespace std;
#include <iostream>
#include <iomanip>
int main() {
  cout << "\tMatarr J's Multiplication Table" << endl;
  cout << "\t-----------------------------" << endl;


 // cout << "*  |  0|  1|  2|  3|  4|  5|  6|  7|  8|  9|  10|" << endl;
  cout << "*" << setw(5) << "|0|" << setw(5) << "|1|" << setw(5) << "|2|" << setw(5) << "|3|" << setw(4) << "|4|" << setw(5) << "|5|" << setw(5) << "|6|" << setw(5) << "|7|" << setw(5) << "|8|" << setw(5) << "|9|" << setw(6) << "|10|" << setw(5) << endl;
  cout << "------------------------------------------------------------" << endl;

  int change= 0;
  for (int r =0; r<11; r++ ) 
  {
    cout << r << ":" ;
    for(int c =0; c<11; c++)
      {
        //cout << setw(3) << c*r << " |";
      if(r==10) //use == to compare
      {
        
        cout << " " << c*r  << "|"<< setw(2);
        
      }     
      else
      {
        cout << setw(3) << c*r << " |";
        
      }
      
    }//end of for-loop
      
    cout <<  "\n------------------------------------------------------------"; 
    cout << endl; //this will start a new line
     
   
  } 
  
}