build:
	mkdir -p bin
	java  -cp lib/antlr-3.1.1.jar: org.antlr.Tool src/ro/pub/cpl/coolir/CoolIr.g
	javac -cp lib/antlr-3.1.1.jar: -d bin/ src/ro/pub/cpl/*/*.java

.PHONY: clean
clean:
	rm -rf bin/
