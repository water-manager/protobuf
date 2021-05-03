if not exist build mkdir build
if not exist build\java mkdir build\java
if not exist build\cpp mkdir build\cpp

protoc --java_out=./build/java --nanopb_out=build/cpp api.proto

