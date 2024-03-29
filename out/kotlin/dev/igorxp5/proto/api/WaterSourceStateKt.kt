//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun waterSourceState(block: dev.igorxp5.proto.api.WaterSourceStateKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.WaterSourceState =
  dev.igorxp5.proto.api.WaterSourceStateKt.Dsl._create(dev.igorxp5.proto.api.WaterSourceState.newBuilder()).apply { block() }._build()
public object WaterSourceStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.WaterSourceState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.WaterSourceState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.WaterSourceState = _builder.build()

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
     * <code>bool active = 3;</code>
     */
    public var active: kotlin.Boolean
      @JvmName("getActive")
      get() = _builder.getActive()
      @JvmName("setActive")
      set(value) {
        _builder.setActive(value)
      }
    /**
     * <code>bool active = 3;</code>
     */
    public fun clearActive() {
      _builder.clearActive()
    }

    /**
     * <code>bool turnedOn = 4;</code>
     */
    public var turnedOn: kotlin.Boolean
      @JvmName("getTurnedOn")
      get() = _builder.getTurnedOn()
      @JvmName("setTurnedOn")
      set(value) {
        _builder.setTurnedOn(value)
      }
    /**
     * <code>bool turnedOn = 4;</code>
     */
    public fun clearTurnedOn() {
      _builder.clearTurnedOn()
    }

    /**
     * <code>optional string sourceWaterTank = 5;</code>
     */
    public var sourceWaterTank: kotlin.String
      @JvmName("getSourceWaterTank")
      get() = _builder.getSourceWaterTank()
      @JvmName("setSourceWaterTank")
      set(value) {
        _builder.setSourceWaterTank(value)
      }
    /**
     * <code>optional string sourceWaterTank = 5;</code>
     */
    public fun clearSourceWaterTank() {
      _builder.clearSourceWaterTank()
    }
    /**
     * <code>optional string sourceWaterTank = 5;</code>
     * @return Whether the sourceWaterTank field is set.
     */
    public fun hasSourceWaterTank(): kotlin.Boolean {
      return _builder.hasSourceWaterTank()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.WaterSourceState.copy(block: dev.igorxp5.proto.api.WaterSourceStateKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.WaterSourceState =
  dev.igorxp5.proto.api.WaterSourceStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()
