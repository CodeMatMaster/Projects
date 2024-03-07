// Matarr J.
// EGR 126 Section 5 Spring 2022
//Grade Cal

#include <iostream>
using namespace std;

/* 
  Things I learned:
  When you have a space between Characters for variables, it will not pick up the code
  */

//Cin ignore will skip the enter key left in the buffer
int main() {
cout << "Matarr's Grade Calculator" << endl;

string name;
cout << "\n\n\n\nPlease Enter Name: " ;
//cin.ignore();                         //the default ignore will disregard one character
getline(cin, name); //the getline check cin for characters 
cout << name << endl << endl; 

//Prompt User for 5 HW Grades

double grade1, grade2, grade3, grade4, grade5; 

cout << "Enter 5 Homework Grades: " << endl;
cin >> grade1 >> grade2 >> grade3 >> grade4 >> grade5;

cout << "\nEntered Homework Grades: " << grade1 << "," << grade2 << "," << grade3 << "," << grade4 << "," << grade5 << endl << endl;

cout << "Enter 4 test grades: \n";
double test1, test2, test3, test4 ; //declared test variables

cin >> test1 >> test2 >> test3 >> test4;

cout << "\nEntered Test Grades: " << test1 << "," << test2 << "," << test3  << "," << test4;

double finalTest;
cout << "\n\nEnter a Final Grade: ";
cin >> finalTest;

cout << "Final Test Entered: " << finalTest;
  
double homeworkAverage = (grade1+grade2+grade3+grade4+grade5);
double lowtest;

  if(test1 < test2)
  {
      lowtest = test1;
  }
  if(test2 < test1)
  {
    lowtest = test2;
  }
  if(lowtest > test3)
  {
    lowtest=test3;
  }
  if(lowtest > test4)
  {
    lowtest = test4;
  }  
  cout << "\n\nLowest Test Grade: " << lowtest ;
  
  double testAverage = test1 +test2+ test3+test4;
  double dropGrade;

  cout << "\n\nSum of Tests: "  << testAverage;
  
  if(test1 == lowtest )
  {
    dropGrade = lowtest;
  }  
  else if (test2 == lowtest )
  {
     dropGrade = lowtest;
  }
  else if (test3 == lowtest )
  {
     dropGrade = lowtest;
  }
  else if (test4 == lowtest )
  {
     dropGrade = lowtest;
  }

    testAverage -= dropGrade; //drop lowest test grade

    cout << "\n\n\nNew Test sum : " << testAverage;
    cout << "\n\n\nTest Average: " << testAverage/3 ; //done 
    cout <<"\n\n\n Total Hw Sum:  " << homeworkAverage; ///
    cout <<"\n\n\n Hw Average:  " << homeworkAverage/5; // done

testAverage =testAverage/3 ;
homeworkAverage= homeworkAverage/5;
  double FinalGrade = (testAverage*.3) + (homeworkAverage*.50) + (finalTest*0.2);

  cout << "\n\nFinal Grade is: " << FinalGrade << endl;


  //(A: 90-100, B: 80-89.999, C: 70-79.999, D: 60-69.999, F below 60)

  if(FinalGrade >= 90)
  {
    cout << "Letter Grade: A";
  }
  else if(FinalGrade >= 80 && FinalGrade <=89.999 )
  {
    cout << "Letter Grade: B";
  }
  else if(FinalGrade >= 70 && FinalGrade <=79.999 )
  {
    cout << "Letter Grade: C";
  }
  else if(FinalGrade >= 60 && FinalGrade <=69.999 )
  {
    cout << "Letter Grade: D";
  }
  else if(FinalGrade < 60)
  {
    cout << "Letter Grade: F";
  }
  

  
  

  
 


}