//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun setWaterSourceActive(block: dev.igorxp5.proto.api.SetWaterSourceActiveKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.SetWaterSourceActive =
  dev.igorxp5.proto.api.SetWaterSourceActiveKt.Dsl._create(dev.igorxp5.proto.api.SetWaterSourceActive.newBuilder()).apply { block() }._build()
public object SetWaterSourceActiveKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.SetWaterSourceActive.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.SetWaterSourceActive.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.SetWaterSourceActive = _builder.build()

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
public inline fun dev.igorxp5.proto.api.SetWaterSourceActive.copy(block: dev.igorxp5.proto.api.SetWaterSourceActiveKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.SetWaterSourceActive =
  dev.igorxp5.proto.api.SetWaterSourceActiveKt.Dsl._create(this.toBuilder()).apply { block() }._build()
