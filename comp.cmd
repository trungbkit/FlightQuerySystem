if not exist out md out
cd src/Grammar
javac -d ../../out -cp ../../lib/antlr-4.7-complete.jar ./utils/*.java ./parser/*.java ./astgen/*.java
cd ..
javac -d ../out -cp ../lib/antlr-4.7-complete.jar;../out ./Controller/*.java ./Model/*.java Main.java
cd ..