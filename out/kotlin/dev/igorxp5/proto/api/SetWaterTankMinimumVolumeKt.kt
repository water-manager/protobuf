//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun setWaterTankMinimumVolume(block: dev.igorxp5.proto.api.SetWaterTankMinimumVolumeKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.SetWaterTankMinimumVolume =
  dev.igorxp5.proto.api.SetWaterTankMinimumVolumeKt.Dsl._create(dev.igorxp5.proto.api.SetWaterTankMinimumVolume.newBuilder()).apply { block() }._build()
public object SetWaterTankMinimumVolumeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.SetWaterTankMinimumVolume.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.SetWaterTankMinimumVolume.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.SetWaterTankMinimumVolume = _builder.build()

    /**
     * <code>string waterTankName = 1;</code>
     */
    public var waterTankName: kotlin.String
      @JvmName("getWaterTankName")
      get() = _builder.getWaterTankName()
      @JvmName("setWaterTankName")
      set(value) {
        _builder.setWaterTankName(value)
      }
    /**
     * <code>string waterTankName = 1;</code>
     */
    public fun clearWaterTankName() {
      _builder.clearWaterTankName()
    }

    /**
     * <code>float value = 2;</code>
     */
    public var value: kotlin.Float
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>float value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.SetWaterTankMinimumVolume.copy(block: dev.igorxp5.proto.api.SetWaterTankMinimumVolumeKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.SetWaterTankMinimumVolume =
  dev.igorxp5.proto.api.SetWaterTankMinimumVolumeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
