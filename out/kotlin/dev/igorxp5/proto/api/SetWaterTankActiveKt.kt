//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun setWaterTankActive(block: dev.igorxp5.proto.api.SetWaterTankActiveKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.SetWaterTankActive =
  dev.igorxp5.proto.api.SetWaterTankActiveKt.Dsl._create(dev.igorxp5.proto.api.SetWaterTankActive.newBuilder()).apply { block() }._build()
public object SetWaterTankActiveKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.SetWaterTankActive.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.SetWaterTankActive.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.SetWaterTankActive = _builder.build()

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
     * <code>bool active = 2;</code>
     */
    public var active: kotlin.Boolean
      @JvmName("getActive")
      get() = _builder.getActive()
      @JvmName("setActive")
      set(value) {
        _builder.setActive(value)
      }
    /**
     * <code>bool active = 2;</code>
     */
    public fun clearActive() {
      _builder.clearActive()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.SetWaterTankActive.copy(block: dev.igorxp5.proto.api.SetWaterTankActiveKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.SetWaterTankActive =
  dev.igorxp5.proto.api.SetWaterTankActiveKt.Dsl._create(this.toBuilder()).apply { block() }._build()
