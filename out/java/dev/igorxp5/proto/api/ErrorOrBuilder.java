// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.Error.Exception type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.Error.Exception type = 2;</code>
   * @return The type.
   */
  dev.igorxp5.proto.api.Error.Exception getType();

  /**
   * <code>string arg = 3;</code>
   * @return The arg.
   */
  java.lang.String getArg();
  /**
   * <code>string arg = 3;</code>
   * @return The bytes for arg.
   */
  com.google.protobuf.ByteString
      getArgBytes();
}
