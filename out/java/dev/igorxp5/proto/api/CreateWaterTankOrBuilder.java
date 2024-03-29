// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

public interface CreateWaterTankOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateWaterTank)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>uint32 pressureSensorPin = 2;</code>
   * @return The pressureSensorPin.
   */
  int getPressureSensorPin();

  /**
   * <code>float volumeFactor = 3;</code>
   * @return The volumeFactor.
   */
  float getVolumeFactor();

  /**
   * <code>float pressureFactor = 4;</code>
   * @return The pressureFactor.
   */
  float getPressureFactor();

  /**
   * <code>float minimumVolume = 5;</code>
   * @return The minimumVolume.
   */
  float getMinimumVolume();

  /**
   * <code>float maxVolume = 6;</code>
   * @return The maxVolume.
   */
  float getMaxVolume();

  /**
   * <code>float zeroVolumePressure = 7;</code>
   * @return The zeroVolumePressure.
   */
  float getZeroVolumePressure();

  /**
   * <code>float pressureChangingValue = 8;</code>
   * @return The pressureChangingValue.
   */
  float getPressureChangingValue();

  /**
   * <code>optional string waterSourceName = 9;</code>
   * @return Whether the waterSourceName field is set.
   */
  boolean hasWaterSourceName();
  /**
   * <code>optional string waterSourceName = 9;</code>
   * @return The waterSourceName.
   */
  java.lang.String getWaterSourceName();
  /**
   * <code>optional string waterSourceName = 9;</code>
   * @return The bytes for waterSourceName.
   */
  com.google.protobuf.ByteString
      getWaterSourceNameBytes();
}
