if not exist build mkdir build
if not exist build\java mkdir build\java
if not exist build\cpp mkdir build\cpp

protoc --java_out=./build/java api.proto

python -m nanopb.generator.nanopb_generator -D ./build/cpp api.proto
