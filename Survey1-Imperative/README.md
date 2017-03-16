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