1. Code the modules
2. Build the modules in the order:
javac --module-path mods -d mods/com.glarimy.bank.api src/com/glarimy/bank/api/*.java
javac --module-path mods -d mods/com.glarimy.bank.data src/com/glarimy/bank/data/*.java
javac --module-path mods -d mods/com.glarimy.bank.service src/com/glarimy/bank/service/*.java
javac --module-path mods -d mods/com.glarimy.bank.client src/com/glarimy/bank/client/*.java
3. Run the app
java --module-path mods -m com.glarimy.bank.client/com.glarimy.bank.client.BankConsole
4. Build the distribution
jlink --module-path <jdk11path>/jmods:./mods/ --add-modules com.glarimy.bank.client --output bankjre
5. List the modules
<bankjre-path>/java --list-modules
6. Run app on JRE
<bankjre-path>/java -m com.glarimy.bank.client/com.glarimy.bank.client.BankConsole