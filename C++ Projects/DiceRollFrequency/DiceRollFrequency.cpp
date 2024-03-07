#include <iostream>
#include <time.h>
#include <algorithm>
#include <vector>

using namespace std;

int rollDie(int sides);

int main() {
    cout << "Hello World!, playing with Dice \n";
    srand(time(NULL));

    // Get the number of sides on the die
    cout << "How many sides? ";
    int sides;
    cin >> sides;

    // Make an array to hold the counts of values seen on a roll
    int counts[sides + 1]; // making an array that makes ten slots
    // +1 because of the zero-based indexing.

    // Initialize each slot of the array to zero
    for (int i = 0; i <= sides; i++)
        counts[i] = 0;

    // Get how many times to roll
    cout << "How many rolls? ";
    int rolls;
    cin >> rolls;

    // Roll that die!
    for (int i = 0; i < rolls; i++) {
        int theRoll;
        theRoll = rollDie(sides); // rollDie(sides) will pass back a die that rolls 1-10.
        counts[theRoll]++;
    }

    // Create a vector of pairs to store original indices and counts
   vector<pair<int, int> > countsWithIndices;


    // Populate the vector
    for (int i = 1; i <= sides; i++) {
countsWithIndices.push_back(make_pair(counts[i], i));
    }

    // Sort the vector based on counts in descending order
    sort(countsWithIndices.rbegin(), countsWithIndices.rend());

    // Print the sorted counts array
    cout << "\nSorted Counts:\n";
    for (const auto& pair : countsWithIndices) {
        cout << pair.second << ": " << pair.first << endl;
    }

    return 0;
}

int rollDie(int sides) {
    return (rand() % sides + 1);
}