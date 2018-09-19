1. Create project folder
mkdir glarimy-java11-0
2. Move to the project folder
cd glarimy-java11-0
3. Create src folder
mkdir src
4. Create bin folder
mkdir bin
5. Create module package stucture under src
cd src
mkdir -p com/glarimy/hello
6. Create file module-info.java under src/com/glarimy/hello
cd com/glarimy/hello
touch module-info.java
////// CONTENT //////
module com.glarimy.hello { }
/////////////////////

7. Create file HelloWorld.java under src/com/glarimy/hello
////// CONTENT /////
package com.glarimy.hello;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Java 11");

	}

}
//////////////////////
8. Go back to the project folder
9. Compile the module
javac -d bin/com.glarimy.hello src/com/glarimy/hello/HelloWorld.java src/com/glarimy/hello/module-info.java 
10.Run the module
java --module-path bin -m com.glarimy.hello/com.glarimy.hello.HelloWorld 
11.Build JRE
jlink --module-path /<java11-path>/jmods:./bin/ --add-modules com.glarimy.hello --output hellojre
12. Verify the JRE
cd hellojre/bin
./java --list-modules
/////// should print java.base and com.glarimy.hello
13. Run app on JRE
./java -m com.glarimy.hello/com.glarimy.hello.HelloWorld