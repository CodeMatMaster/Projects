// Matarr J.
// EGR 126
// Spring 2022
// Playing with Baby Names from https://www.kaggle.com/kaggle/us-baby-names
// Demonstrating reading from a comma separated file
 
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
 
int main() {
 cout << "Playing with BabyNames from Kaggle.com" << endl << endl;
 ifstream namefile ("NationalNames.csv");
 if (!namefile.is_open())
 {
   cout << "could not open file" <<endl;
   exit (0);
 }
 cout << "NationalNames.csv is open." << endl <<endl;
 
 // We will read in each field from the CSV as a string
 string id, name, year, gender, count;
 
 // The CSV file has a header row labeling the data.
 // Let's remove it.
 string wholeRow;
 getline(namefile,wholeRow,'\n');
 
 // Let's loop through the whole file
 //     the code below takes a while to run
 //     you'll find 1,825,433 rows of data
 //     let's only print out some interesting rows.
 //     (i.e. put an if statement in front of the cout)
 
 int max = 0;
 int min =99999999;
 int yr = 2020;
 int yr2 = 1880;
int yr3 = 0;
 int sum = 0;
  int num = 0;
//int i;
////for (i=0;i<10;i++)

  string gender1, name1;
cout << "Please enter a name for search: ";
  cin >> name1; 
  cin.ignore();
     
  //cin.ignore();
  
    gender1 = "X"; // -> Random string value to start while loop 
  while(gender1 != "M" && gender1 != "F")
  {
    cout << "Please enter the gender for this search (M or F): ";
    
    cin >> gender1;
    //cin.ignore();
  } //end of while loop

      yr = 1811; //invalid year for while loop to activate
     
   while(1880 > yr3 || 2014 < yr3 ){ //1880 > yr || 2014 < yr
    cout << "Please enter your desired search year (1880-2014): ";

     cin >> yr3;
     } 

  
 while (!namefile.eof())
   {
   getline(namefile,id,',');
   getline(namefile,name,',');
   getline(namefile,year,',');
   getline(namefile,gender,',');
   getline(namefile,count,'\n');
    
 
   int cnt = stoi(count);  /// convert a string into an integer
  int year2 =stoi(year);

     
   if (name == name1  && gender == gender1)
   {
      sum += cnt;
      cout << id << ". " << name << " " << year << " " << gender << " " << count << endl;
      if (cnt > max)
      {
         max = cnt;
         yr = stoi(year);
      }
   } //end of first if statement
 
     if (name == name1 && gender == gender1)
   {
     // sum += cnt;
      cout << id << ". " << name << " " << year << " " << gender << " " << count << endl;
      if (cnt < min)
      {
         min = cnt;
         yr2 = stoi(year);
      }
   } // end of second if statement to calulate min
     
      if (name == name1 && gender == gender1 && yr3 == year2)
   {
      num = cnt;
      yr3 = stoi(year);
     
     cout << id << ". " << name << " " << yr3 << " " << gender << " " << count << endl;
      
     
     
     }

  

  
  
  
  }
  cout << "There were " << num << " " << name1 <<  "(" << gender1 << ")" << " babies born in the year " << yr3 << endl;

  cout << name1 <<  "(" << gender1 << ")" << " " << "in " << yr << " with " << max << " babies born." << endl ; //max year

  cout << name1 <<  "(" << gender1 << ")" << " " << "in " << yr2 << " with " << min << " babies born." << endl ; 

  cout << "This Baby Name database shows that " << sum << " " << name1 <<  "(" << gender1 << ")" << " " << "babies were born in the US between 1800 and 2014.";
  
  

  
}