if not exist out mkdir out
if not exist out\java mkdir out\java
if not exist out\cpp mkdir out\cpp

protoc --java_out=./out/java api.proto

python -m nanopb.generator.nanopb_generator -D ./out/cpp api.proto
