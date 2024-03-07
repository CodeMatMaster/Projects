/*  Form Letter to File Demo

    Matarr J.
   
    This example demonstrates how C++ can 
    write text to a file.
*/

// All of the libraries we need to do this example
#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main()
{
    // Open a file to write our letter to
    ofstream letterFile("Letter.txt"); //ofstram is output file
    if (! letterFile.is_open()) //if can't be created, the program will end right here.  is_open is a function 
    {
        cout << "Could not open letterFile.txt." << endl;
        return 0;  // exits the program
    }

    // only get here if the file is open

    string first, last, address;

    cout << "Please enter the first name: ";
    cin >> first;

    cout << "Please enter the last name: ";
    cin >> last;

    cout << "Please enter the address: ";   // actually you would need more data,
                                            // like city, state, zip
    cin.ignore();
    getline(cin,address,'\n');

    // Print input back to screen for proofing
    cout << "Letter is going to: " << endl << endl;
    cout << first << " " << last << endl;
    cout << address << endl;

    // Print the letter to the file

    letterFile << first << " " << last << endl;
    letterFile << address << endl;
    letterFile << ".... more address lines would go here...." << endl << endl;
    letterFile << "Dear " << first << " " << last << "," << endl;
    letterFile << "We would like to invite you to our Techy Talk at Ten this Friday. " << endl;
    letterFile << "Since this is Cybersecurity Awareness Month, all of our TTT's are " << endl;
    letterFile << "related to ways to help keep you safe online.  This weeks's talk " << endl;
    letterFile << "is titled 'Social Engeineering Attacks: Phishing.' Phishing attacks " << endl;
    letterFile << "account for more than 80 percent of reported security incidents. " << endl;
    letterFile << "Learn how to handle attacks from bad actors this Friday, at 10:10 " << endl;
    letterFile << "in Lab 243." << endl << endl;
    letterFile << "Stay Safe!!!" << endl;

    // Close (and save) the file. 
    letterFile.close(); //when you are finish you can close the file
  

}
