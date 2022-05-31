// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.PrimitiveValue value = 1;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.PrimitiveValue value = 1;</code>
   * @return The value.
   */
  dev.igorxp5.proto.api.PrimitiveValue getValue();
  /**
   * <code>.PrimitiveValue value = 1;</code>
   */
  dev.igorxp5.proto.api.PrimitiveValueOrBuilder getValueOrBuilder();

  /**
   * <code>repeated .PrimitiveValue listValue = 2;</code>
   */
  java.util.List<dev.igorxp5.proto.api.PrimitiveValue> 
      getListValueList();
  /**
   * <code>repeated .PrimitiveValue listValue = 2;</code>
   */
  dev.igorxp5.proto.api.PrimitiveValue getListValue(int index);
  /**
   * <code>repeated .PrimitiveValue listValue = 2;</code>
   */
  int getListValueCount();
  /**
   * <code>repeated .PrimitiveValue listValue = 2;</code>
   */
  java.util.List<? extends dev.igorxp5.proto.api.PrimitiveValueOrBuilder> 
      getListValueOrBuilderList();
  /**
   * <code>repeated .PrimitiveValue listValue = 2;</code>
   */
  dev.igorxp5.proto.api.PrimitiveValueOrBuilder getListValueOrBuilder(
      int index);

  /**
   * <code>.WaterSourceState waterSource = 3;</code>
   * @return Whether the waterSource field is set.
   */
  boolean hasWaterSource();
  /**
   * <code>.WaterSourceState waterSource = 3;</code>
   * @return The waterSource.
   */
  dev.igorxp5.proto.api.WaterSourceState getWaterSource();
  /**
   * <code>.WaterSourceState waterSource = 3;</code>
   */
  dev.igorxp5.proto.api.WaterSourceStateOrBuilder getWaterSourceOrBuilder();

  /**
   * <code>.WaterTankState waterTank = 4;</code>
   * @return Whether the waterTank field is set.
   */
  boolean hasWaterTank();
  /**
   * <code>.WaterTankState waterTank = 4;</code>
   * @return The waterTank.
   */
  dev.igorxp5.proto.api.WaterTankState getWaterTank();
  /**
   * <code>.WaterTankState waterTank = 4;</code>
   */
  dev.igorxp5.proto.api.WaterTankStateOrBuilder getWaterTankOrBuilder();
}
