//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

@kotlin.jvm.JvmSynthetic
public inline fun save(block: dev.igorxp5.proto.api.SaveKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.Save =
  dev.igorxp5.proto.api.SaveKt.Dsl._create(dev.igorxp5.proto.api.Save.newBuilder()).apply { block() }._build()
public object SaveKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.igorxp5.proto.api.Save.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.igorxp5.proto.api.Save.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.igorxp5.proto.api.Save = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.igorxp5.proto.api.Save.copy(block: dev.igorxp5.proto.api.SaveKt.Dsl.() -> kotlin.Unit): dev.igorxp5.proto.api.Save =
  dev.igorxp5.proto.api.SaveKt.Dsl._create(this.toBuilder()).apply { block() }._build()