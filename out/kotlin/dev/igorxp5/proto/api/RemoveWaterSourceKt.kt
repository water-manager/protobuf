//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun removeWaterSource(block: dev.igorxp5.proto.api.RemoveWaterSourceKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.RemoveWaterSource =
  dev.igorxp5.proto.api.RemoveWaterSourceKt.Dsl._create(dev.igorxp5.proto.api.RemoveWaterSource.newBuilder()).apply { block() }._build()
public object RemoveWaterSourceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.RemoveWaterSource.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.RemoveWaterSource.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.RemoveWaterSource = _builder.build()

    /**
     * <code>string waterSourceName = 1;</code>
     */
    public var waterSourceName: kotlin.String
      @JvmName("getWaterSourceName")
      get() = _builder.getWaterSourceName()
      @JvmName("setWaterSourceName")
      set(value) {
        _builder.setWaterSourceName(value)
      }
    /**
     * <code>string waterSourceName = 1;</code>
     */
    public fun clearWaterSourceName() {
      _builder.clearWaterSourceName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.RemoveWaterSource.copy(block: dev.igorxp5.proto.api.RemoveWaterSourceKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.RemoveWaterSource =
  dev.igorxp5.proto.api.RemoveWaterSourceKt.Dsl._create(this.toBuilder()).apply { block() }._build()
