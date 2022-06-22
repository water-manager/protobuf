if not exist out mkdir out
if not exist out\java mkdir out\java
if not exist out\cpp mkdir out\cpp
if not exist out\python mkdir out\python
if not exist out\kotlin mkdir out\kotlin

protoc --java_out=./out/java --nanopb_out=out/cpp api.proto --python_out=out/python --kotlin_out=out/kotlin
