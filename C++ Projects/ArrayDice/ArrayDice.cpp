// Matarr J
// Rolling N sided Dice and
// Counting what we See
// USING ARRAYS
// EGR 126 Spring 2022

//difference betweeen Indicies and line 
#include <iostream>
#include <time.h>
#include <algorithm>
//#include <bits/stdc++.h>

using namespace std;

int rollDie(int sides);


int main() {
  std::cout << "Hello World!, playing with Dice \n";
  srand(time(NULL));
  for (int i=0; i<100; i++)
    cout << rollDie(10) << endl;

  //Get the number of sides on the die
  cout << "How many sides? ";
  int sides; 
  cin >> sides; 
  
  // Make an array to hold the counts of values een on a roll
  int counts[sides + 1]; // making an array that makes ten slots
  // +1 because of the the zero based indexing. 



  //initialize each slot of the array to zero

  for (int i=0; i<=sides; i++)
    counts[i] =0;


  //get how many time to roll
  cout << "How many rolls? ";
  int rolls;
  cin >> rolls;

  //roll that die!
  for(int i=0; i<rolls; i++)
    {
      int theRoll;
      theRoll = rollDie(sides); //rollDie(sides) will pass back a die that rolls 1-10.
      counts[theRoll]++;
      //sort(counts + 1, counts + sides + 1); 

    }


 ///   sort(counts, counts + sides + 1, greater<int>());


    //Print out the counts
    for(int i=1; i<=sides; i++ )
      {
        cout << i << ": " << counts[i] << endl; //using the i variable'
        //sort(counts + 1, counts + sides + 1, greater<int>());
       // sort(counts[i]); 
       // sort(counts + 1, counts + sides + 1); 
      }

//sort(counts + 1, counts + sides + 1); 

   // sort(counts, counts , greater<int>());


} //end of Main



int rollDie(int sides)
{

  return (rand()%sides+1);
}