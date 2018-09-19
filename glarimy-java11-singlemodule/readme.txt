1. Code the module
2. Build the module
javac --module-path mods -d mods/com.glarimy.bank src/com/glarimy/bank/*.java
javac --module-path mods -d mods/com.glarimy.bank src/com/glarimy/bank/api/*.java
javac --module-path mods -d mods/com.glarimy.bank src/com/glarimy/bank/data/*.java
javac --module-path mods -d mods/com.glarimy.bank src/com/glarimy/bank/service/*.java
javac --module-path mods -d mods/com.glarimy.bank src/com/glarimy/bank/client/*.java
3. Run the app
java --module-path mods -m com.glarimy.bank/com.glarimy.bank.client.BankConsole
4. Build the distribution
jlink --module-path <jdk11path>/jmods:./mods/ --add-modules com.glarimy.bank --output bankjre
5. List the modules
<bankjre-path>/java --list-modules
6. Run the app on custom jre
<bankjre-path>/java -m com.glarimy.bank/com.glarimy.bank.client.BankConsole