//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun removeWaterTank(block: dev.igorxp5.proto.api.RemoveWaterTankKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.RemoveWaterTank =
  dev.igorxp5.proto.api.RemoveWaterTankKt.Dsl._create(dev.igorxp5.proto.api.RemoveWaterTank.newBuilder()).apply { block() }._build()
public object RemoveWaterTankKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.RemoveWaterTank.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.RemoveWaterTank.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.RemoveWaterTank = _builder.build()

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
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.RemoveWaterTank.copy(block: dev.igorxp5.proto.api.RemoveWaterTankKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.RemoveWaterTank =
  dev.igorxp5.proto.api.RemoveWaterTankKt.Dsl._create(this.toBuilder()).apply { block() }._build()