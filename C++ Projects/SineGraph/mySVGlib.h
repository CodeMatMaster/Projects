//Libray for SVG

//using namespace std;



ofstream svgFile("graphingSine.svg");

void startSVG(int w, int h)
{
  svgFile << "<svg version=\"1.1\" " <<  "width=" << "\"" << w << "\"" << " " << "height=" << "\"" << h << "\"" << endl;

  svgFile << "xmlns=\"http://" << "www.w3.org/2000/svg\"> " << endl;
}

void endSVG()
{
  svgFile << "</svg>" ;  //end svg file
}


void rectangle (double x, double y, double w, double h, string color)
{
  svgFile << "<rect x=" << "\""<< x << "\"" << " " << "y=" << "\"" << y <<"\"" << " " << "width=" << "\"" << w << "\"" << " " << "height=" << "\"" << h << "\"" << " " << "fill=" << "\"" << color << "\"" << " " << "/" << ">" << endl; //This will send the svg syntax to the stream svg file. 
}


void rectangle2 (double x, double y, double w, double h, int num, int num2, int num3)
{
  svgFile << "<rect x=" << "\""<< x << "\"" << " " << "y=" << "\"" << y <<"\"" << " " << "width=" << "\"" << w << "\"" << " " << "height=" << "\"" << h << "\"" << " " << "style=" << "\""  << "fill:rgb(" << num << "," << num2 << "," << num3 << ");" << "\"" << " " << "/" << ">" << endl; //This will send the svg syntax to the stream svg file. 
}


//style="fill:rgb(0,0,255);"





