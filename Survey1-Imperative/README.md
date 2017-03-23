# Instructions for running this code

### Javascript

 1. Open Javascript.html in a browser
 2. Open that browser's Javascript console
 3. Output of code should be printed to the console

### Ada
 
 1. [Download Ada compiler](http://libre.adacore.com/download/)
    - Follow the instructions for your operating system
    - Make sure to add it to your PATH
 2. On command line, run `gcc -c AdaDemo.adb`
    - Yes, GCC can compile Ada. Who knew?
    - The -c flag is necessary because GCC cannot link Ada
 3. `gnatbind AdaDemo`
    - Be sure to leave off the `.adb` file extension
 4. `gnatlink AdaDemo`
    - Again, no file extension
 5. `./AdaDemo`
    - `AdaDemo` is now your executable.
    
### PHP

1. Open your terminal
2. cd/file_location
   - file_location is where your file is located
3. php PHP.php
   - PHP.php is the filename
   
### Python

1. Open terminal
2. cd/file_location
3. python Python.py
   - Python.py is the filename

### C++
 
 Using standard GNU g++
 1. On command line, run `gcc cplusplus.cpp`
     * This creates the executable `a.out`
 2. `./a.out`

 ### Ruby

 Most Mac or Linux computers will already have a ruby interpreter installed. Just run `ruby ruby.rb` on the command line.