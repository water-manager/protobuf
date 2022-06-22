//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun createWaterSource(block: dev.igorxp5.proto.api.CreateWaterSourceKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.CreateWaterSource =
  dev.igorxp5.proto.api.CreateWaterSourceKt.Dsl._create(dev.igorxp5.proto.api.CreateWaterSource.newBuilder()).apply { block() }._build()
public object CreateWaterSourceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.CreateWaterSource.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.CreateWaterSource.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.CreateWaterSource = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>uint32 pin = 2;</code>
     */
    public var pin: kotlin.Int
      @JvmName("getPin")
      get() = _builder.getPin()
      @JvmName("setPin")
      set(value) {
        _builder.setPin(value)
      }
    /**
     * <code>uint32 pin = 2;</code>
     */
    public fun clearPin() {
      _builder.clearPin()
    }

    /**
     * <code>optional string waterTankName = 3;</code>
     */
    public var waterTankName: kotlin.String
      @JvmName("getWaterTankName")
      get() = _builder.getWaterTankName()
      @JvmName("setWaterTankName")
      set(value) {
        _builder.setWaterTankName(value)
      }
    /**
     * <code>optional string waterTankName = 3;</code>
     */
    public fun clearWaterTankName() {
      _builder.clearWaterTankName()
    }
    /**
     * <code>optional string waterTankName = 3;</code>
     * @return Whether the waterTankName field is set.
     */
    public fun hasWaterTankName(): kotlin.Boolean {
      return _builder.hasWaterTankName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.CreateWaterSource.copy(block: dev.igorxp5.proto.api.CreateWaterSourceKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.CreateWaterSource =
  dev.igorxp5.proto.api.CreateWaterSourceKt.Dsl._create(this.toBuilder()).apply { block() }._build()